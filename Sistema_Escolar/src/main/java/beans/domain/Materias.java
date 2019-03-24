package beans.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@Entity
@Table(name = "materias")
@NamedQueries({
    @NamedQuery(name = "Materias.findAllMaterias", query = "select m from Materias m"),
    @NamedQuery(name = "Materias.findByIdMateria",query = "select m from Materias m where m.id_materia = :id_materia"),
    @NamedQuery(name = "Materias.findByMateria", query = "select m from Materias m where m.materia = :materia")
})
@XmlAccessorType(XmlAccessType.FIELD)
public class Materias implements Serializable
{
    private static final Long SerialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_materia")
    private Integer id_materia;
    
    @NotNull
    @Basic(optional = false)
    @Size(min = 1, max = 45)
    @Column(name = "materia")
    private String materia;
    
    public Materias(){}
    
    public Materias(int id_materia)
    {
        this.id_materia = id_materia;
    }
    
    public Materias(String materia)
    {
        this.materia = materia;
    }
    
    public Materias(int id_materia, String materia)
    {
        this.id_materia = id_materia;
        this.materia = materia;
    }
    
    public int getId_materia()
    {
        return id_materia;
    }
    
    public void setId_materia(int id_materia)
    {
        this.id_materia = id_materia;
    }
    
    public String getMateria()
    {
        return materia;
    }
    
    public void setMateria(String materia)
    {
        this.materia = materia;
    }
    
    @Override
    public String toString()
    {
        return "Materias = {id_materia: "+id_materia+", Materia: "+materia+"}";
    }
}
