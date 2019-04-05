package beans.eis;

import beans.domain.Alumnos;
import java.util.List;

public interface AlumnosDao
{
    public List<Alumnos> findAllAlumnos();
    
    public Alumnos findAlumnosById(Alumnos alumnos);
    
    public Alumnos findAlumnosByDni(Alumnos alumnos);
    
    public Alumnos findAlumnosByCorreo(Alumnos alumnos);
    
    public void insertAlumnos(Alumnos alumnos);
    
    public void updateAlumnos(Alumnos alumnos);
    
    public void deleteAlumnos(Alumnos alumnos);
}
