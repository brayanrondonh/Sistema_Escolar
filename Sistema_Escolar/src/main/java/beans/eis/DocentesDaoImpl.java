package beans.eis;

import beans.domain.Docentes;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class DocentesDaoImpl implements DocentesDao
{
    @PersistenceContext(unitName = "Sistema_Escolar")
    EntityManager em;
    
    @Override
    public List<Docentes> findAllDocentes()
    {
        return em.createNamedQuery("Docentes.findAll").getResultList();
    }
    
    @Override
    public Docentes findDocenteById(Docentes docentes)
    {
        return em.find(Docentes.class, docentes.getId_docente());
    }
    
    @Override
    public Docentes findDocenteByCorreo(Docentes docentes)
    {
        return em.find(Docentes.class, docentes.getCorreo());
    }
    
    @Override
    public void insertDocente(Docentes docentes)
    {
        em.persist(docentes);
    }
    
    @Override
    public void updateDocente(Docentes docentes)
    {
        em.merge(docentes);
    }
    
    @Override
    public void deleteDocente(Docentes docente)
    {
        em.remove(em.merge(docente));
    }
}
