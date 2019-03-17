package beans.service;

import beans.domain.Representantes;
import java.util.List;
import javax.ejb.Remote;

@Remote
public interface RepresentantesServiceRemote
{
    
    public List<Representantes> listarRepresentantes();
    
    public Representantes buscarRepresentantePorId(Representantes representante);
    
    public Representantes buscarRepresentantePorCorreo(Representantes representante);
    
    public void agregarRepresentante(Representantes representante);
    
    public void modificarRepresentante(Representantes representante);
    
    public void eliminarRepresentante(Representantes representante);    
}
