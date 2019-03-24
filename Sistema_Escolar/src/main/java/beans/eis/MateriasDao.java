package beans.eis;

import beans.domain.Materias;
import java.util.List;

public interface MateriasDao
{
    public List<Materias> findAllMaterias();
    
    public Materias findMateriasById(Materias materias);
    
    public void insertMaterias(Materias materias);
    
    public void updateMaterias(Materias materias);
    
    public void deleteMaterias(Materias materias);
}
