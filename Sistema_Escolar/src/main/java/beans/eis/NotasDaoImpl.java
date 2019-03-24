package beans.eis;

import beans.domain.Notas;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
}
