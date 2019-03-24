package beans.service;

import beans.domain.Materias;
import java.util.List;
import javax.ejb.Local;


@Local
public interface MateriasServiceLocal
{
    public List<Materias> listarMaterias();
    
    public Materias encontrarMateriasPorId(Materias materias);
    
    public void agregarMaterias(Materias materias);
    
    public void modificarMaterias(Materias materias);
    
    public void eliminarMaterias(Materias materias);
}
