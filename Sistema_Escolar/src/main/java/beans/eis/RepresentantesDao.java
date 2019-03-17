package beans.eis;

import beans.domain.Representantes;
import java.util.List;
import javax.ejb.Local;

@Local
public interface RepresentantesDao
{
    public List<Representantes> findAllRepresentantes();
    
    public Representantes findRepresentanteById(Representantes representante);
    
    public Representantes findRepresentanteByEmail(Representantes representante);
    
    public void insertRepresentante(Representantes representante);
    
    public void updateRepresentante(Representantes representante);
    
    public void deleteRepresentante(Representantes representante);
}
