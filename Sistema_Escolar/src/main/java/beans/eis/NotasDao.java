package beans.eis;

import beans.domain.Alumnos;
import beans.domain.Notas;
import java.util.List;

public interface NotasDao
{
    public List<Notas> findAllNotas();
    
    public Notas findNotasById(Notas notas);
    
    public void insertNotas(Notas notas);
    
    public void updateNotas(Notas notas);
    
    public void deleteNotas(Notas notas);
    
    public List<Notas> findNotasByDni(Alumnos alumnos);
}
