package beans.eis;

import beans.domain.Alumnos;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class AlumnosDaoImpl implements AlumnosDao
{
    @PersistenceContext(unitName = "Sistema_Escolar")
    EntityManager em;
    
    @Override
    public List<Alumnos> findAllAlumnos()
    {
        return em.createNamedQuery("Alumnos.findAll").getResultList();
    }
    
    @Override
    public Alumnos findAlumnosById(Alumnos alumnos)
    {
        return em.find(Alumnos.class, alumnos.getId_alumno());
    }
    
    @Override
    public Alumnos findAlumnosByCorreo(Alumnos alumnos)
    {
        return em.find(Alumnos.class, alumnos.getCorreo());
    }
    
    @Override
    public void insertAlumnos(Alumnos alumnos)
    {
        em.persist(alumnos);
    }
    
    @Override
    public void updateAlumnos(Alumnos alumnos)
    {
        em.merge(alumnos);
    }
    
    @Override
    public void deleteAlumnos(Alumnos alumnos)
    {
        em.remove(em.merge(alumnos));
    }
}
