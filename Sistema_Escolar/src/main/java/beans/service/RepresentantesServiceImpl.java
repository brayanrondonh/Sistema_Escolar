package beans.service;

import beans.domain.Representantes;
import beans.eis.RepresentantesDao;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class RepresentantesServiceImpl implements RepresentantesServiceLocal, RepresentantesServiceRemote
{
    @Inject
    private RepresentantesDao representanteDao;
    
    @Override
    public List<Representantes> listarRepresentantes()
    {
        return representanteDao.findAllRepresentantes();
    }
    
    @Override
    public Representantes buscarRepresentantePorId(Representantes representante)
    {
        return representanteDao.findRepresentanteById(representante);
    }
    
    @Override
    public Representantes buscarRepresentantePorCorreo(Representantes representante)
    {
        return representanteDao.findRepresentanteByEmail(representante);
    }
    
    @Override
    public void agregarRepresentante(Representantes representantes)
    {
        representanteDao.insertRepresentante(representantes);
    }
    
    @Override
    public void modificarRepresentante(Representantes representante)
    {
        representanteDao.updateRepresentante(representante);
    }
    
    @Override
    public void eliminarRepresentante(Representantes representante)
    {
        representanteDao.deleteRepresentante(representante);
    }
}
