package beans.web;

import beans.domain.Alumnos;
import beans.service.AlumnoServiceLocal;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/control")
public class Control extends HttpServlet
{
    @Inject
    AlumnoServiceLocal alumnosServiceLocal;
    
    
    protected void control(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String accion = request.getParameter("accion");
        
        if(accion != null && accion.equals("agregar"))
        {
            this.agregarAlumno(request, response);
        }
        else
        {
            this.listarAlumnos(request, response);
        }
    }
    
    private void listarAlumnos(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        try
        {
            List<Alumnos> alumnos = alumnosServiceLocal.listarAlumnos();
            request.setAttribute("alumnos", alumnos);
            request.getRequestDispatcher("/WEB-INF/listadoAlumnos.jsp").forward(request, response);
        }
        catch(Exception e)
        {
            System.out.println("Exploto la lista de alumnos");
            e.printStackTrace();
        }        
    }
    
    private void agregarAlumno(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String nombre1 = request.getParameter("primer_nombre");
        String nombre2 = request.getParameter("segundo_nombre");
        String apellido1 = request.getParameter("primer_apellido");
        String apellido2 = request.getParameter("segundo_apellido");
        String dni = request.getParameter("dni");
        String fecha_nacimiento = request.getParameter("fecha_nacimiento");
        String correo = request.getParameter("correo");
        String telefono = request.getParameter("telefono");
        int edad = 0;
        
        try
        {
            LocalDate fechaN = LocalDate.parse(fecha_nacimiento);
            LocalDate fechaA = LocalDate.now();
            Period periodo = Period.between(fechaN, fechaA);
            edad = periodo.getYears();
        }
        catch(Exception e)
        {
            System.out.println("Exploto el calculo de la edad");
            e.printStackTrace();
        }
        
        Alumnos alumnos = new Alumnos();
        alumnos.setPrimer_nombre(nombre1);
        alumnos.setSegundo_nombre(nombre2);
        alumnos.setPrimer_apellido(apellido1);
        alumnos.setSegundo_apellido(apellido2);
        alumnos.setDni(dni);
        alumnos.setFecha_nacimiento(fecha_nacimiento);
        alumnos.setEdad(edad);
        alumnos.setCorreo(correo);
        alumnos.setTelefono(telefono);
        
        try
        {
            this.alumnosServiceLocal.registrarAlumno(alumnos);
            System.out.println("Se registro el alumno");
            this.listarAlumnos(request, response);
        }
        catch(Exception e)
        {
            System.out.println("Exploto el insert");
            e.printStackTrace();
        }        
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        this.control(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        this.control(request, response);
    }
}
