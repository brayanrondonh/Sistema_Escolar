package beans.service;

import beans.domain.Alumnos;
import beans.domain.Notas;
import java.util.List;
import javax.ejb.Remote;

@Remote
public interface NotasServiceRemote
{
    public List<Notas> listarNotas();
    
    public Notas encontrarNotasPorId(Notas notas);
    
    public void agregarNotas(Notas notas);
    
    public void modificarNotas(Notas notas);
    
    public void eliminarNotas(Notas notas);
    
    public List<Notas> encontrarNotasPorDni(Alumnos alumnos);
}
