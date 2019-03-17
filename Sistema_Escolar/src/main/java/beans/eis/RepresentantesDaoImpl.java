package beans.eis;

import beans.domain.Representantes;
import java.util.List;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.*;

@Stateless
public class RepresentantesDaoImpl implements RepresentantesDao
{
    @PersistenceContext(unitName = "Sistema_Escolar")
    EntityManager em;
    
    @Override
    public List<Representantes> findAllRepresentantes()
    {
        return em.createNamedQuery("Representantes.findAll").getResultList();
    }
    
    @Override
    public Representantes findRepresentanteById(Representantes representante)
    {
        return em.find(Representantes.class, representante.getId_representante());
    }
    
    @Override
    public Representantes findRepresentanteByEmail(Representantes representante)
    {
        return em.find(Representantes.class, representante.getCorreo());
    }
    
    @Override
    public void insertRepresentante(Representantes representante)
    {
        em.persist(representante);
    }
    
    @Override
    public void updateRepresentante(Representantes representante)
    {
        em.merge(representante);
    }
    
    @Override
    public void deleteRepresentante(Representantes representante)
    {
        em.remove(em.merge(representante));
    }
}
