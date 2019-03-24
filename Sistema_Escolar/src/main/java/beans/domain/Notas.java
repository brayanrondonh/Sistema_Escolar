package beans.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@Entity
@Table(name = "notas")
@NamedQueries({
    @NamedQuery(name = "Notas.findAll", query = "select n from Notas n"),
    @NamedQuery(name = "Notas.findByIdNotas", query = "select n from Notas n where n.id_nota = :id_nota"),
    @NamedQuery(name = "Notas.findByNotas", query = "select n from Notas n where n.nota = :nota")
})
@XmlAccessorType(XmlAccessType.FIELD)
public class Notas implements Serializable
{
    private static final long SerialversionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_nota")
    private Integer id_nota;
    
    @Basic(optional = false)
    @Column(name = "nota")
    private double nota;
    
    @JoinColumn(name = "id_materia", referencedColumnName = "id_materia")
    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.REFRESH})
    private Materias materias;
    
    @JoinColumn(name = "id_alumno", referencedColumnName = "id_alumno")
    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.REFRESH})
    private Alumnos alumnos;
    
    @JoinColumn(name = "id_docente", referencedColumnName = "id_docente")
    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.REFRESH})
    private Docentes docentes;
    
    public Notas() {}
    
    public Notas(int id_nota)
    {
        this.id_nota = id_nota;
    }
    
    public Notas(int id_nota, double nota)
    {
        this.id_nota = id_nota;
        this.nota = nota;
    }

    public Integer getId_nota() {
        return id_nota;
    }

    public void setId_nota(Integer id_nota) {
        this.id_nota = id_nota;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Materias getMaterias() {
        return materias;
    }

    public void setMaterias(Materias materias) {
        this.materias = materias;
    }

    public Alumnos getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumnos alumnos) {
        this.alumnos = alumnos;
    }

    public Docentes getDocentes() {
        return docentes;
    }

    public void setDocentes(Docentes docentes) {
        this.docentes = docentes;
    }
    
    @Override
    public String toString()
    {
        return "Notas = {id_notas: "+id_nota+", Nota: "+nota+"}";
    }
}
