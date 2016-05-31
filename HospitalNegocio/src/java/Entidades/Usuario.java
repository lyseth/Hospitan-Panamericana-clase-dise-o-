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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

/**
 *
 * @author DT8
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findByIdUsuario", query = "SELECT u FROM Usuario u WHERE u.idUsuario = :idUsuario")})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_USUARIO")
    private BigDecimal idUsuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioIdUsuario")
    private List<Citas> citasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioIdUsuario")
    private List<MedidasColes> medidasColesList;
    @OneToMany(mappedBy = "usuarioIdUsuario")
    private List<MedidasPeso> medidasPesoList;
    @JoinColumn(name = "REGISTRO_ID", referencedColumnName = "CEDULA")
    @ManyToOne(optional = false)
    private Registro registroId;

    public Usuario() {
    }

    public Usuario(BigDecimal idUsuario) {
        this.idUsuario = idUsuario;
    }

    public BigDecimal getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(BigDecimal idUsuario) {
        this.idUsuario = idUsuario;
    }

    public List<Citas> getCitasList() {
        return citasList;
    }

    public void setCitasList(List<Citas> citasList) {
        this.citasList = citasList;
    }

    public List<MedidasColes> getMedidasColesList() {
        return medidasColesList;
    }

    public void setMedidasColesList(List<MedidasColes> medidasColesList) {
        this.medidasColesList = medidasColesList;
    }

    public List<MedidasPeso> getMedidasPesoList() {
        return medidasPesoList;
    }

    public void setMedidasPesoList(List<MedidasPeso> medidasPesoList) {
        this.medidasPesoList = medidasPesoList;
    }

    public Registro getRegistroId() {
        return registroId;
    }

    public void setRegistroId(Registro registroId) {
        this.registroId = registroId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Usuario[ idUsuario=" + idUsuario + " ]";
    }
    
}
