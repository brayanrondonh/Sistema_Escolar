package beans.web;

import beans.domain.Notas;
import beans.service.NotasServiceLocal;
import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/notas")
public class NotasServlet extends HttpServlet
{
    @Inject
    NotasServiceLocal nsl;
    
    public void controlAccess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String accion = request.getParameter("accion");
        
        if(accion != null && accion.equals("agregar"))
        {
            this.agregarNotas(request, response);
        }
        else if(accion != null && accion.equals("consultar"))
        {
            this.consultarNotas(request, response);
        }
        else if(accion != null && accion.equals("actualizar"))
        {
            this.actualizarNotas(request, response);
        }
        else
        {
            this.listarNotas(request, response);
        }
    }
    
    public void listarNotas(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        List<Notas> notas = this.nsl.listarNotas();
        System.out.println(notas);
        request.setAttribute("notas", notas);
        request.getRequestDispatcher("/WEB-INF/listarNotas.jsp").forward(request, response);
    }
    
    public void agregarNotas(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        System.out.println("Ingreso en agregar");
        String nota = request.getParameter("nota");
        System.out.println(nota);
        double notas = Double.parseDouble(nota);
        Notas n = new Notas(notas);
        try
        {
            this.nsl.agregarNotas(n);
        }
        catch(Exception e)
        {
            System.out.println("Error al agregar notas");
            e.printStackTrace();
        }
        this.listarNotas(request, response);
    }
    
    public void consultarNotas(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        System.out.println("ingreso en consultar notas");
        String idString = request.getParameter("id");
        int id = Integer.parseInt(idString);
        Notas nota = new Notas(id);
        nota = this.nsl.encontrarNotasPorId(nota);
        request.setAttribute("nota", nota);
        request.getRequestDispatcher("/consultarNotas.jsp").forward(request, response);
    }
    
    public void actualizarNotas(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        System.out.println("Ingreso en actualizar");
        String idString = request.getParameter("id");
        String eliminar = request.getParameter("eliminar");
        String modificar = request.getParameter("modificar");
        int id = Integer.parseInt(idString);
        
        if(eliminar != null && eliminar.equals("Eliminar"))
        {
            Notas notas = new Notas(id);
            notas = this.nsl.encontrarNotasPorId(notas);
            this.nsl.eliminarNotas(notas);
        }
        if(modificar != null && modificar.equals("Modificar"))
        {
            Notas notas = new Notas(id);
            String notaString = request.getParameter("nota");
            double nota = Double.parseDouble(notaString);
            try
            {
                notas = this.nsl.encontrarNotasPorId(notas);
                notas.setNota(nota);
                this.nsl.modificarNotas(notas);
            }
            catch(Exception e)
            {
                System.out.println("Error al actualizar nota");
                e.printStackTrace();
            }
        }
        this.listarNotas(request, response);
    }
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        this.controlAccess(request, response);
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        this.controlAccess(request, response);
    }
}
