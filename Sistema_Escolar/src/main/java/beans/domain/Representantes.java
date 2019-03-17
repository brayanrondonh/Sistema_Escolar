package beans.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@Entity
@Table(name = "representantes")
@NamedQueries({
    @NamedQuery(name = "Representantes.findAll", query = "select r from Representantes r"),
    @NamedQuery(name = "Representantes.byFindNombre", query = "select r from Representantes r where r.nombre = :nombre"),
    @NamedQuery(name = "Representantes.byFindApellido", query = "select r from Representantes r where r.apellido = :apellido"),
    @NamedQuery(name = "Representantes.byFindDni", query = "select r from Representantes r where r.dni = :dni"),
    @NamedQuery(name = "Representantes.byFindParentesco", query = "select r from Representantes r where r.parentesco = :parentesco"),
    @NamedQuery(name = "Represnetantes.byFindCorreo", query = "select r from Representantes r where r.correo = :correo"),
    @NamedQuery(name = "Representantes.byFindTelefono", query = "select r from Representantes r where r.telefono = :telefono")
})
@XmlAccessorType(XmlAccessType.FIELD)
public class Representantes implements Serializable
{
    private static final long SerialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_representante")
    private Integer id_representante;
    
    @NotNull
    @Basic(optional = false)
    @Size(min = 1, max = 45)
    @Column(name = "nombre")
    private String nombre;
    
    @NotNull
    @Basic(optional = false)
    @Size(min = 1, max = 45)
    @Column(name = "apellido")
    private String apellido;
    
    @NotNull
    @Basic(optional = false)
    @Size(min = 1, max = 10)
    @Column(name = "dni")
    private String dni;
    
    @NotNull
    @Basic(optional = false)
    @Size(min = 1, max = 45)
    @Column(name = "parentesco")
    private String parentesco;
    
    @NotNull
    @Basic(optional = false)
    @Size(min = 1, max = 45)
    @Column(name = "correo")
    private String correo;
    
    @NotNull
    @Basic(optional = false)
    @Size(min = 1, max = 45)
    @Column(name = "telefono")
    private String telefono;
    
    public Representantes() {}
    
    public Representantes(int id_representante)
    {
        this.id_representante = id_representante;
    }

    public Representantes(String nombre, String apellido, String dni, String parentesco, String correo, String telefono)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.parentesco = parentesco;
        this.correo = correo;
        this.telefono = telefono;
    }

    public Representantes(Integer id_representante, String nombre, String apellido, String dni, String parentesco, String correo, String telefono)
    {
        this.id_representante = id_representante;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.parentesco = parentesco;
        this.correo = correo;
        this.telefono = telefono;
    }

    public Integer getId_representante()
    {
        return id_representante;
    }

    public void setId_representante(Integer id_representante)
    {
        this.id_representante = id_representante;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getApellido()
    {
        return apellido;
    }

    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }

    public String getDni()
    {
        return dni;
    }

    public void setDni(String dni)
    {
        this.dni = dni;
    }

    public String getParentesco()
    {
        return parentesco;
    }

    public void setParentesco(String parentesco)
    {
        this.parentesco = parentesco;
    }

    public String getCorreo()
    {
        return correo;
    }

    public void setCorreo(String correo)
    {
        this.correo = correo;
    }

    public String getTelefono()
    {
        return telefono;
    }

    public void setTelefono(String telefono)
    {
        this.telefono = telefono;
    }
    
    @Override
    public String toString()
    {
        return "Representantes = {id_representante: "+id_representante+", Nombre: "+nombre+", Apellido: "+apellido+", DNI: "+dni+", Parentesco: "+parentesco+", Correo: "+correo+", Telefono: "+telefono+"}";
    }
}
