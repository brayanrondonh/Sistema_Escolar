package beans.service;

import beans.domain.Notas;
import beans.eis.NotasDao;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class NotasServiceImpl implements NotasServiceLocal, NotasServiceRemote
{
    @Inject
    NotasDao notasDao;
    
    @Override
    public List<Notas> listarNotas()
    {
        return notasDao.findAllNotas();
    }
    
    @Override
    public Notas encontrarNotasPorId(Notas notas)
    {
        return notasDao.findNotasById(notas);
    }
    
    @Override
    public void agregarNotas(Notas notas)
    {
        notasDao.insertNotas(notas);
    }
    
    @Override
    public void modificarNotas(Notas notas)
    {
        notasDao.updateNotas(notas);
    }
    
    @Override
    public void eliminarNotas(Notas notas)
    {
        notasDao.deleteNotas(notas);
    }
}
