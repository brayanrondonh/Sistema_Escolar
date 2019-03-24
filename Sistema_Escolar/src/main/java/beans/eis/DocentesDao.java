package beans.eis;

import beans.domain.Docentes;
import java.util.List;

public interface DocentesDao
{
    public List<Docentes> findAllDocentes();
    
    public Docentes findDocenteById(Docentes docentes);
    
    public Docentes findDocenteByCorreo(Docentes docentes);
    
    public void insertDocente(Docentes docentes);
    
    public void updateDocente(Docentes docentes);
    
    public void deleteDocente(Docentes docentes);
}
