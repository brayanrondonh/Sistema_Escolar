package beans.web;

import beans.domain.Representantes;
import beans.service.RepresentantesServiceLocal;
import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/representantes")
public class RepresentantesServlet extends HttpServlet
{
    @Inject
    RepresentantesServiceLocal rsl;
    
    private void accion(HttpServletRequest request, HttpServletResponse reponse) throws ServletException, IOException
    {
        String accion = request.getParameter("accion");
        System.out.println(accion);
        
        if(accion != null && accion.equals("agregar"))
        {
            this.agregarRepresentantes(request, reponse);
        }
        else if(accion != null && accion.equals("consultar"))
        {
            this.consultarRepresentantes(request, reponse);
        }
        else if(accion != null && accion.equals("actualizar"))
        {
            this.actualizarRepresentante(request, reponse);
        }
        else
        {
            this.listarRepresentantes(request, reponse);
        }
    }
    
    private void listarRepresentantes(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        System.out.println("Ingreso en listar");
        List<Representantes> representantes = rsl.listarRepresentantes();
        System.out.println(representantes);
        request.setAttribute("representantes", representantes);        
        request.getRequestDispatcher("/WEB-INF/listadoRepresentantes.jsp").forward(request, response);
    }
    
    private void agregarRepresentantes(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        System.out.println("Ingreso en agregar");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String dni = request.getParameter("dni");
        String parentesco = request.getParameter("parentesco");
        String correo = request.getParameter("correo");
        String telefono = request.getParameter("telefono");
        
        Representantes representante = new Representantes();
        representante.setNombre(nombre);
        representante.setApellido(apellido);
        representante.setDni(dni);
        representante.setParentesco(parentesco);
        representante.setCorreo(correo);
        representante.setTelefono(telefono);
        
        try
        {
            rsl.agregarRepresentante(representante);
        }
        catch(Exception e)
        {
            System.out.println("Exploto el agregar representantes");
            e.printStackTrace();
        }
        this.listarRepresentantes(request, response);
    }
    
    public void consultarRepresentantes(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String idRepresentanteString = request.getParameter("idRepresentante");
        if(idRepresentanteString != null)
        {
            int idRepresentante = Integer.parseInt(idRepresentanteString);
            try
            {
                Representantes representante = new Representantes(idRepresentante);
                representante = this.rsl.buscarRepresentantePorId(representante);
                System.out.println(representante);
                request.setAttribute("representante", representante);
                request.getRequestDispatcher("/consultarRepresentante.jsp").forward(request, response);
            }
            catch(Exception e)
            {
                System.out.println("Exploto el consultar");
                e.printStackTrace();
            }
        }        
    }
    
    public void actualizarRepresentante(HttpServletRequest request, HttpServletResponse responnse) throws ServletException, IOException
    {
        String idRepresentanteString = request.getParameter("idRepresentante");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String dni = request.getParameter("dni");
        String parentesco = request.getParameter("parentesco");
        String correo = request.getParameter("correo");
        String telefono = request.getParameter("telefono");
        String modificar = request.getParameter("modificar");
        String eliminar = request.getParameter("eliminar");
        int idRepresentante;
        
        if(idRepresentanteString != null)
        {
            idRepresentante = Integer.parseInt(idRepresentanteString);
            
            if(modificar != null && modificar.equals("Modificar"))
            {
                Representantes representante = new Representantes(idRepresentante);
                representante = this.rsl.buscarRepresentantePorId(representante);
                representante.setNombre(nombre);
                representante.setApellido(apellido);
                representante.setDni(dni);
                representante.setParentesco(parentesco);
                representante.setCorreo(correo);
                representante.setTelefono(telefono);
                
                try
                {
                    this.rsl.modificarRepresentante(representante);
                }
                catch(Exception e)
                {
                    System.out.println("Exploto el modificar representante");
                    e.printStackTrace();
                }
            }
            else if (eliminar != null && eliminar.equals("Eliminar"))
            {
                Representantes representante = new Representantes(idRepresentante);
                try
                {
                    this.rsl.eliminarRepresentante(representante);
                }
                catch(Exception e)
                {
                    System.out.println("Exploto el eliminar Representante");
                    e.printStackTrace();
                }
            }
        }
        this.listarRepresentantes(request, responnse);
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        this.accion(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        this.accion(request, response);
    }
}
