package beans.service;

import beans.domain.Docentes;
import java.util.List;
import javax.ejb.Remote;

@Remote
public interface DocentesServiceRemote
{
    public List<Docentes> listarDocentes();
    
    public Docentes encontrarDocentesPorId(Docentes docentes);
    
    public Docentes encontrarDocentesPorCorreo(Docentes docentes);
    
    public void agregarDocentes(Docentes docentes);
    
    public void modificarDocentes(Docentes docentes);
    
    public void eliminarDocentes(Docentes docentes);    
}
