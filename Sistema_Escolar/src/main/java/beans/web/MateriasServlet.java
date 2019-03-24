package beans.web;

import beans.domain.Materias;
import beans.service.MateriasServiceLocal;
import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/materias")
public class MateriasServlet extends HttpServlet
{
    @Inject
    MateriasServiceLocal msl;
    
    public void controlAccess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String accion = request.getParameter("accion");
        if(accion != null && accion.equals("agregar"))
        {
            this.agregarMaterias(request, response);
        }
        else if(accion != null && accion.equals("consultar"))
        {
            this.consultarMaterias(request, response);
        }
        else if(accion != null && accion.equals("actualizar"))
        {
            this.actualizarMaterias(request, response);
        }
        else
        {
            this.listarMaterias(request, response);
        }
    }
    
    public void listarMaterias(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        List<Materias> materias = this.msl.listarMaterias();
        System.out.println(materias);
        request.setAttribute("materias", materias);
        request.getRequestDispatcher("/WEB-INF/listarMaterias.jsp").forward(request, response);
    }
    
    public void agregarMaterias(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        System.out.println("ingrso a meterias");
        String materia = request.getParameter("materia");
        System.out.println(materia);
        Materias materias = new Materias(materia);
        try
        {
            this.msl.agregarMaterias(materias);
        }
        catch(Exception e)
        {
            System.out.println("Error al agregar materia");
        }
        this.listarMaterias(request, response);
    }
    
    public void consultarMaterias(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        System.out.println("ingreso en consultar");
        String idString = request.getParameter("id");
        int id = Integer.parseInt(idString);
        Materias materia = new Materias(id);
        try
        {
            materia = this.msl.encontrarMateriasPorId(materia);
        }
        catch(Exception e)
        {
            System.out.println("Error al consultar materias");
            e.printStackTrace();
        }
        request.setAttribute("materia", materia);
        request.getRequestDispatcher("/consultarMaterias.jsp").forward(request, response);
    }
    
    public void actualizarMaterias(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String eliminar = request.getParameter("eliminar");
        String modificar = request.getParameter("modificar");
        String idString = request.getParameter("id");
        int id = Integer.parseInt(idString);
        
        if(modificar != null && modificar.equals("Modificar"))
        {
            String materia = request.getParameter("materia");
            Materias materias = new Materias(id);
            materias = this.msl.encontrarMateriasPorId(materias);
            materias.setMateria(materia);
            try
            {
                this.msl.modificarMaterias(materias);
            }
            catch(Exception e)
            {
                System.out.println("Error al actualizar la materia");
                e.printStackTrace();
            }
        }
        else if(eliminar != null && eliminar.equals("Eliminar"))
        {
            Materias materia = new Materias(id);
            materia = this.msl.encontrarMateriasPorId(materia);
            try
            {
                this.msl.eliminarMaterias(materia);
            }
            catch(Exception e)
            {
                System.out.println("Error al eliminar materia");
                e.printStackTrace();
            }
        }
        this.listarMaterias(request, response);
    }
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        this.controlAccess(request,response);
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        this.controlAccess(request,response);
    }
}
