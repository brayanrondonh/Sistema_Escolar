package beans.service;

import beans.domain.Docentes;
import beans.eis.DocentesDao;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class DocentesServiceImpl implements DocentesServiceLocal, DocentesServiceRemote
{
    @Inject
    DocentesDao docenteDao;
    
    @Override
    public List<Docentes> listarDocentes()
    {
        return docenteDao.findAllDocentes();
    }
    
    @Override
    public Docentes encontrarDocentesPorId(Docentes docente)
    {
        return docenteDao.findDocenteById(docente);
    }
    
    @Override
    public Docentes encontrarDocentesPorCorreo(Docentes docentes)
    {
        return docenteDao.findDocenteByCorreo(docentes);
    }
    
    @Override
    public void agregarDocentes(Docentes docentes)
    {
        docenteDao.insertDocente(docentes);
    }
    
    @Override
    public void modificarDocentes(Docentes docentes)
    {
        docenteDao.updateDocente(docentes);
    }
    
    @Override
    public void eliminarDocentes(Docentes docente)
    {
        docenteDao.deleteDocente(docente);
    }
}
