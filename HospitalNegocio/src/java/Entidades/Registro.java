/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author DT8
 */
@Entity
@Table(name = "REGISTRO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Registro.findAll", query = "SELECT r FROM Registro r"),
    @NamedQuery(name = "Registro.findById", query = "SELECT r FROM Registro r WHERE r.id = :id"),
    @NamedQuery(name = "Registro.findByNombres", query = "SELECT r FROM Registro r WHERE r.nombres = :nombres"),
    @NamedQuery(name = "Registro.findByApellidos", query = "SELECT r FROM Registro r WHERE r.apellidos = :apellidos"),
    @NamedQuery(name = "Registro.findByEdad", query = "SELECT r FROM Registro r WHERE r.edad = :edad"),
    @NamedQuery(name = "Registro.findByCedula", query = "SELECT r FROM Registro r WHERE r.cedula = :cedula"),
    @NamedQuery(name = "Registro.findByTelefono", query = "SELECT r FROM Registro r WHERE r.telefono = :telefono"),
    @NamedQuery(name = "Registro.findByDireccion", query = "SELECT r FROM Registro r WHERE r.direccion = :direccion"),
    @NamedQuery(name = "Registro.findByCiudad", query = "SELECT r FROM Registro r WHERE r.ciudad = :ciudad"),
    @NamedQuery(name = "Registro.findByEmail", query = "SELECT r FROM Registro r WHERE r.email = :email"),
    @NamedQuery(name = "Registro.findByUsuario", query = "SELECT r FROM Registro r WHERE r.usuario = :usuario"),
    @NamedQuery(name = "Registro.findByPassword", query = "SELECT r FROM Registro r WHERE r.password = :password")})
public class Registro implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "NOMBRES")
    private String nombres;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "APELLIDOS")
    private String apellidos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EDAD")
    private short edad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CEDULA")
    private long cedula;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TELEFONO")
    private long telefono;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "DIRECCION")
    private String direccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "CIUDAD")
    private String ciudad;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "EMAIL")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "USUARIO")
    private String usuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "PASSWORD")
    private String password;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "registroId")
    private List<Usuario> usuarioList;

    public Registro() {
    }

    public Registro(BigDecimal id) {
        this.id = id;
    }

    public Registro(BigDecimal id, String nombres, String apellidos, short edad, long cedula, long telefono, String direccion, String ciudad, String email, String usuario, String password) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.cedula = cedula;
        this.telefono = telefono;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.email = email;
        this.usuario = usuario;
        this.password = password;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public short getEdad() {
        return edad;
    }

    public void setEdad(short edad) {
        this.edad = edad;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @XmlTransient
    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Registro)) {
            return false;
        }
        Registro other = (Registro) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Registro[ id=" + id + " ]";
    }
    
}
