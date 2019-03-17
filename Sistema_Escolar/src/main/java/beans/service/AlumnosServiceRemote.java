package beans.service;

import beans.domain.Alumnos;
import java.util.List;
import javax.ejb.Remote;

@Remote
public interface AlumnosServiceRemote
{
    public List<Alumnos> listarAlumnos();
    
    public Alumnos encontrarAlumnosPorId(Alumnos alumnos);
    
    public Alumnos encontrarAlumnosPorCorreo(Alumnos alumnos);
    
    public void registrarAlumno(Alumnos alumnos);
    
    public void modificarAlumno(Alumnos alumnos);
    
    public void eliminarAlumno(Alumnos alumnos);
}
