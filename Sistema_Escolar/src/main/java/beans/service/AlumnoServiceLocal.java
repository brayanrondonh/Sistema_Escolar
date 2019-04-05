package beans.service;

import beans.domain.Alumnos;
import java.util.List;
import javax.ejb.Local;

@Local
public interface AlumnoServiceLocal
{
    public List<Alumnos> listarAlumnos();
    
    public Alumnos encontrarAlumnosPorId(Alumnos alumnos);
    
    public Alumnos encontrarAlumnosPorDni(Alumnos alumnos);
    
    public Alumnos encontrarAlumnosPorCorreo(Alumnos alumnos);
    
    public void registrarAlumno(Alumnos alumnos);
    
    public void modificarAlumno(Alumnos alumnos);
    
    public void eliminarAlumno(Alumnos alumnos);
}
