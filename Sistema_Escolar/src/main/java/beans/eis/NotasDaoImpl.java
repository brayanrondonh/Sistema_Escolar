package beans.eis;

import beans.domain.Alumnos;
import beans.domain.Notas;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class NotasDaoImpl implements NotasDao
{
    @PersistenceContext(unitName = "Sistema_Escolar")
    EntityManager em;
    
    @Override
    public List<Notas> findAllNotas()
    {
        return em.createNamedQuery("Notas.findAll").getResultList();
    }
    
    @Override
    public Notas findNotasById(Notas notas)
    {
        return em.find(Notas.class, notas.getId_nota());
    }
    
    @Override
    public void insertNotas(Notas notas)
    {
        em.persist(notas);
    }
    
    @Override
    public void updateNotas(Notas notas)
    {
        em.merge(notas);
    }
    
    @Override
    public void deleteNotas(Notas notas)
    {
        em.remove(em.merge(notas));
    }
    
    public List<Notas> findNotasByDni(Alumnos alumnos)
    {
        System.out.println("Este es el valor con el cual vamos a buscar las notas: "+alumnos.getId_alumno());
        Query q = em.createQuery("select n from Notas n where n.alumnos.id_alumno = "+alumnos.getId_alumno());
        return q.getResultList();
    }
}
