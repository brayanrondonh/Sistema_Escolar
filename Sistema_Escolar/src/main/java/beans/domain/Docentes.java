package beans.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@Entity
@Table(name = "docentes")
@NamedQueries({
    @NamedQuery(name = "Docentes.findAll", query = "select d from Docentes d"),
    @NamedQuery(name = "Docentes.findByIdDocente", query = "select d from Docentes d where d.id_docente = :id_docente"),
    @NamedQuery(name = "Docentes.findByNombre", query = "select d from Docentes d where d.nombre = :nombre")
})
@XmlAccessorType(XmlAccessType.FIELD)
public class Docentes implements Serializable
{
    private static final long SerialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_docente")
    private Integer id_docente;
    
    @NotNull
    //@Basic(optional = false)
    @Size(min = 1, max = 45)
    @Column(name = "nombre")
    private String nombre;
    
    @NotNull
    //@Basic(optional = false)
    @Size(min = 1, max = 45)
    @Column(name = "apellido")
    private String apellido;
    
    @NotNull
    //@Basic(optional = false)
    @Size(min = 1, max = 45)
    @Column(name = "dni")
    private String dni;
    
    @NotNull
    //@Basic(optional = false)
    @Size(min = 1, max = 45)
    @Column(name = "correo")
    private String correo;
    
    @NotNull
    //@Basic(optional = false)
    @Size(min = 1, max = 45)
    @Column(name = "telefono")
    private String telefono;
    
    public Docentes(){}
    
    public Docentes(int id_docente)
    {
        this.id_docente = id_docente;
    }

    public Docentes(String nombre, String apellido, String dni, String correo, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.correo = correo;
        this.telefono = telefono;
    }

    public Docentes(Integer id_docente, String nombre, String apellido, String dni, String correo, String telefono) {
        this.id_docente = id_docente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.correo = correo;
        this.telefono = telefono;
    }

    public Integer getId_docente() {
        return id_docente;
    }

    public void setId_docente(Integer id_docente) {
        this.id_docente = id_docente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    @Override
    public String toString()
    {
        return "Docentes = {id:docente: "+id_docente+", Nombre: "+nombre+", Apellido: "+apellido+", DNI: "+dni+", Correo: "+correo+", Telefono: "+telefono+"}";
    }
}
