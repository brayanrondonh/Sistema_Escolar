package beans.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@Entity
@Table(name = "alumnos")
@NamedQueries({
    @NamedQuery(name = "Alumnos.findAll",query = "Select a from Alumnos a"),
    @NamedQuery(name = "Alumnos.findByIdAlumno",query = "select a from Alumnos a where a.id_alumno = :idAlumno"),
    @NamedQuery(name = "Alumnos.findByPrimerNombre",query = "select a from Alumnos a where a.primer_nombre = :primer_nombre"),
    @NamedQuery(name = "Alumnos.findBySegundoNombre",query = "select a from Alumnos a where a.segundo_nombre = :segundo_nombre"),
    @NamedQuery(name = "Alumnos.findByPrimerApellido",query = "select a from Alumnos a where a.primer_apellido = :primer_apellido"),
    @NamedQuery(name = "Alumnos.findBySegundoApellido",query = "select a from Alumnos a where a.segundo_apellido = :segundo_apellido"),
    @NamedQuery(name = "Alumnos.findByDni",query = "select a from Alumnos a where a.dni = :dni"),
    @NamedQuery(name = "Alumnos.findByFechaNacimiento", query = "select a from Alumnos a where a.fecha_nacimiento = :fecha_nacimiento"),
    @NamedQuery(name = "Alumnos.findByEdad", query = "select a from Alumnos a where a.edad = :edad"),
    @NamedQuery(name = "Alumnos.findByCorreo", query = "select a from Alumnos a where a.correo = :correo"),
    @NamedQuery(name = "Alumnos.findByTelefono", query = "select a from Alumnos a where a.telefono = :telefono")
})
@XmlAccessorType(XmlAccessType.FIELD)
public class Alumnos implements Serializable
{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_alumno")
    private Integer id_alumno;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1,max = 45)
    @Column(name = "primer_nombre")
    private String primer_nombre;
    
    @Size(min = 1, max = 45)
    private String segundo_nombre;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "primer_apellido")
    private String primer_apellido;
    
    @Size(min = 1,max = 45)
    @Column(name = "segundo_apellido")
    private String segundo_apellido;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "dni")
    private String dni;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_nacimiento")
    private String fecha_nacimiento;
    
    @Column(name = "edad")
    private int edad;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "correo")
    private String correo;
    
    @Size(min = 1,max = 45)
    private String telefono;
    
    @JoinColumn(name = "id_representante",referencedColumnName = "id_representante")
    @ManyToOne(cascade = CascadeType.ALL)
    private Representantes representantes;

    public Alumnos() {}
    
    public Alumnos(Integer id_alumno)
    {
        this.id_alumno = id_alumno;
    }
    
    public Alumnos(String dni)
    {
        this.dni = dni;
    }

    public Alumnos(Integer id_alumno, String primer_nombre, String primer_apellido, String dni, String fecha_nacimiento, String correo) {
        this.id_alumno = id_alumno;
        this.primer_nombre = primer_nombre;
        this.primer_apellido = primer_apellido;
        this.dni = dni;
        this.fecha_nacimiento = fecha_nacimiento;
        this.correo = correo;
    }

    public Alumnos(Integer id_alumno, String primer_nombre, String primer_apellido, String dni, String fecha_nacimiento, int edad, String correo) {
        this.id_alumno = id_alumno;
        this.primer_nombre = primer_nombre;
        this.primer_apellido = primer_apellido;
        this.dni = dni;
        this.fecha_nacimiento = fecha_nacimiento;
        this.edad = edad;
        this.correo = correo;
    }

    public Alumnos(String primer_nombre, String primer_apellido, String dni, String fecha_nacimiento, String correo) {
        this.primer_nombre = primer_nombre;
        this.primer_apellido = primer_apellido;
        this.dni = dni;
        this.fecha_nacimiento = fecha_nacimiento;
        this.correo = correo;
    }

    public Alumnos(String primer_nombre, String primer_apellido, String dni, String fecha_nacimiento, int edad, String correo) {
        this.primer_nombre = primer_nombre;
        this.primer_apellido = primer_apellido;
        this.dni = dni;
        this.fecha_nacimiento = fecha_nacimiento;
        this.edad = edad;
        this.correo = correo;
    }

    public Alumnos(String primer_nombre, String segundo_nombre, String primer_apellido, String segundo_apellido, String dni, String fecha_nacimiento, int edad, String correo, String telefono) {
        this.primer_nombre = primer_nombre;
        this.segundo_nombre = segundo_nombre;
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segundo_apellido;
        this.dni = dni;
        this.fecha_nacimiento = fecha_nacimiento;
        this.edad = edad;
        this.correo = correo;
        this.telefono = telefono;
    }

    public Alumnos(Integer id_alumno, String primer_nombre, String segundo_nombre, String primer_apellido, String segundo_apellido, String dni, String fecha_nacimiento, int edad, String correo, String telefono) {
        this.id_alumno = id_alumno;
        this.primer_nombre = primer_nombre;
        this.segundo_nombre = segundo_nombre;
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segundo_apellido;
        this.dni = dni;
        this.fecha_nacimiento = fecha_nacimiento;
        this.edad = edad;
        this.correo = correo;
        this.telefono = telefono;
    }

    public Integer getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(Integer id_alumno) {
        this.id_alumno = id_alumno;
    }

    public String getPrimer_nombre() {
        return primer_nombre;
    }

    public void setPrimer_nombre(String primer_nombre) {
        this.primer_nombre = primer_nombre;
    }

    public String getSegundo_nombre() {
        return segundo_nombre;
    }

    public void setSegundo_nombre(String segundo_nombre) {
        this.segundo_nombre = segundo_nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    public void setSegundo_apellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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

    public Representantes getRepresentantes()
    {
        return representantes;
    }

    public void setRepresentantes(Representantes representantes)
    {
        this.representantes = representantes;
    }
    
    @Override
    public String toString()
    {
        return "Alumnos [idAlumno: "+id_alumno+", Primer Nombre: "+primer_nombre+" Segundo Nomobre: "+segundo_nombre+", Primer Apellido: "+primer_apellido+", Segundo Apellido: "+segundo_apellido+", DNI: "+dni+", Fecha de Nacimiento: "+fecha_nacimiento+", Edad: "+edad+", Correo: "+correo+", Telefono: "+telefono+"]";
    }
}
