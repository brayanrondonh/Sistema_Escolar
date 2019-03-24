package beans.web;

import beans.domain.Docentes;
import beans.service.DocentesServiceLocal;
import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/docentes")
public class DocentesServlet extends HttpServlet
{
    @Inject
    DocentesServiceLocal dsl;
    
    private void controlAccess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String accion = request.getParameter("accion");
        if(accion != null && accion.equals("agregar"))
        {
            this.agregarDocentes(request, response);
        }
        else if(accion != null && accion.equals("consultar"))
        {
            this.consultarDocentes(request, response);
        }
        else if(accion != null && accion.equals("actualizar"))
        {
            this.actualizarDocentes(request, response);
        }
        else
        {
            this.listarDocentes(request, response);
        }
    }
    
    private void listarDocentes(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        System.out.println("listar docentes");
        try
        {
            List<Docentes> docentes = this.dsl.listarDocentes();
            System.out.println(docentes);
            request.setAttribute("docentes", docentes);
            request.getRequestDispatcher("/WEB-INF/listarDocentes.jsp").forward(request, response);
        }
        catch(Exception e)
        {
            System.out.println("Error al listar docentes");
            e.printStackTrace();
        }
    }
    
    private void agregarDocentes(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String dni = request.getParameter("dni");
        String correo = request.getParameter("correo");
        String telefono = request.getParameter("telefono");
        
        Docentes docente = new Docentes(nombre,apellido,dni,correo,telefono);        
        try
        {
            this.dsl.agregarDocentes(docente);
        }
        catch(Exception e)
        {
            System.out.println("Error al agregar docentes");
            e.printStackTrace();
        }
        this.listarDocentes(request, response);
    }
    
    private void consultarDocentes(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        System.out.println("Ingreso en colsultar docente");
        String idDocente = request.getParameter("id_docente");
        int id = 0;
        if(idDocente != null)
        {
            id = Integer.parseInt(idDocente);
            Docentes docentes = new Docentes(id);
            docentes = this.dsl.encontrarDocentesPorId(docentes);
            System.out.println(docentes);
            request.setAttribute("docentes", docentes);
            request.getRequestDispatcher("/consultarDocentes.jsp").forward(request, response);
        }
    }
    
    private void actualizarDocentes(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String eliminar = request.getParameter("eliminar");
        String modificar = request.getParameter("modificar");
        
        String idString = request.getParameter("id");
        System.out.println(idString);
        int id = Integer.parseInt(idString);
        
        if(modificar != null && modificar.equals("Modificar"))
        {
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            String dni = request.getParameter("dni");
            String correo = request.getParameter("correo");
            String telefono = request.getParameter("telefono");
            
            Docentes docentes = new Docentes(id);
            try
            {
                docentes = this.dsl.encontrarDocentesPorId(docentes);
            }
            catch(Exception e)
            {
                System.out.println("Error al encontrar docente en actualizar docentes - modificar");
                e.printStackTrace();
            }
            
            docentes.setNombre(nombre);
            docentes.setApellido(apellido);
            docentes.setDni(dni);
            docentes.setCorreo(correo);
            docentes.setTelefono(telefono);
            
            try
            {
                this.dsl.modificarDocentes(docentes);
            }
            catch(Exception e)
            {
                System.out.println("Error al modificar docente");
                e.printStackTrace();
            }
        }
        else if(eliminar != null && eliminar.equals("Eliminar"))
        {
            Docentes docente = new Docentes(id);
            try
            {
                docente = this.dsl.encontrarDocentesPorId(docente);
                this.dsl.eliminarDocentes(docente);
            }
            catch(Exception e)
            {
                System.out.println("Error al encontrar docente en actualizar docentes - eliminar");
                e.printStackTrace();
            }            
        }
        
        this.listarDocentes(request, response);
    }
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        this.controlAccess(request, response);
    }
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        this.controlAccess(request, response);
    }
}