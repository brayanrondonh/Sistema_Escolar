package beans.service;

import beans.domain.Alumnos;
import beans.eis.AlumnosDao;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class AlumnosServiceImpl implements AlumnoServiceLocal
{
    @Inject
    private AlumnosDao alumnoDao;
    
    @Override
    public List<Alumnos> listarAlumnos()
    {
        return alumnoDao.findAllAlumnos();
    }
    
    @Override
    public Alumnos encontrarAlumnosPorId(Alumnos alumnos)
    {
        return alumnoDao.findAlumnosById(alumnos);
    }
    
    @Override
    public Alumnos encontrarAlumnosPorCorreo(Alumnos alumnos)
    {
        return alumnoDao.findAlumnosByCorreo(alumnos);
    }
    
    @Override
    public void registrarAlumno(Alumnos alumnos)
    {
        alumnoDao.insertAlumnos(alumnos);
    }
    
    @Override
    public void modificarAlumno(Alumnos alumnos)
    {
        alumnoDao.updateAlumnos(alumnos);
    }
    
    @Override
    public void eliminarAlumno(Alumnos alumnos)
    {
        alumnoDao.deleteAlumnos(alumnos);
    }
}
