package beans.eis;

import beans.domain.Materias;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class MateriasDaoImpl implements MateriasDao
{
    @PersistenceContext(unitName = "Sistema_Escolar")
    EntityManager em;
    
    @Override
    public List<Materias> findAllMaterias()
    {
        return em.createNamedQuery("Materias.findAllMaterias").getResultList();
    }
    
    @Override
    public Materias findMateriasById(Materias materias)
    {
        return em.find(Materias.class, materias.getId_materia());
    }
    
    @Override
    public void insertMaterias(Materias materias)
    {
        em.persist(materias);
    }
    
    @Override
    public void updateMaterias(Materias materias)
    {
        em.merge(materias);
    }
    
    @Override
    public void deleteMaterias(Materias materias)
    {
        em.remove(em.merge(materias));
    }
}
