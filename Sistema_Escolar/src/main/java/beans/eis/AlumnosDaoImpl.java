package beans.eis;

import beans.domain.Alumnos;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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
    public Alumnos findAlumnosByDni(Alumnos alumnos)
    {
        System.out.println("Este es el valor con el cual buscaremos el dni: "+alumnos.getDni());
        //Query q = em.createQuery("select a from Alumnos a where a.dni = " + alumnos.getDni());
        Query q = em.createNamedQuery("Alumnos.findByDni");
        q.setParameter("dni", alumnos.getDni());
        return (Alumnos)q.getSingleResult();
    }
    
    @Override
    public Alumnos findAlumnosByCorreo(Alumnos alumnos)
    {
        System.out.println("Este es el valor con el cual buscaremos el correo: "+alumnos.getCorreo());
        Query q = em.createNamedQuery("Alumnos.findByCorreo");
        q.setParameter("correo", alumnos.getCorreo());
        return (Alumnos)q.getSingleResult();
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
