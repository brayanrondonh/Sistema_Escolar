package beans.service;

import beans.domain.Materias;
import beans.eis.MateriasDao;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class MateriasServiceImpl implements MateriasServiceLocal, MateriasServiceRemote
{
    @Inject
    MateriasDao materiasDao;
    
    @Override
    public List<Materias> listarMaterias()
    {
        return materiasDao.findAllMaterias();
    }
    
    @Override
    public Materias encontrarMateriasPorId(Materias materias)
    {
        return materiasDao.findMateriasById(materias);
    }
    
    @Override
    public void agregarMaterias(Materias materias)
    {
        materiasDao.insertMaterias(materias);
    }
    
    @Override
    public void modificarMaterias(Materias materias)
    {
        materiasDao.updateMaterias(materias);
    }
    
    @Override
    public void eliminarMaterias(Materias materias)
    {
        materiasDao.deleteMaterias(materias);
    }
}
