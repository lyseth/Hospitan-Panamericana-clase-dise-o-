/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
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
@Table(name = "ESPECIALIZACIONES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Especializaciones.findAll", query = "SELECT e FROM Especializaciones e"),
    @NamedQuery(name = "Especializaciones.findByIdEspeci", query = "SELECT e FROM Especializaciones e WHERE e.idEspeci = :idEspeci"),
    @NamedQuery(name = "Especializaciones.findByTipoEspecializacion", query = "SELECT e FROM Especializaciones e WHERE e.tipoEspecializacion = :tipoEspecializacion")})
public class Especializaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "ID_ESPECI")
    private String idEspeci;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "TIPO_ESPECIALIZACION")
    private String tipoEspecializacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "especializacionesIdEspeci")
    private List<Especialistas> especialistasList;

    public Especializaciones() {
    }

    public Especializaciones(String idEspeci) {
        this.idEspeci = idEspeci;
    }

    public Especializaciones(String idEspeci, String tipoEspecializacion) {
        this.idEspeci = idEspeci;
        this.tipoEspecializacion = tipoEspecializacion;
    }

    public String getIdEspeci() {
        return idEspeci;
    }

    public void setIdEspeci(String idEspeci) {
        this.idEspeci = idEspeci;
    }

    public String getTipoEspecializacion() {
        return tipoEspecializacion;
    }

    public void setTipoEspecializacion(String tipoEspecializacion) {
        this.tipoEspecializacion = tipoEspecializacion;
    }

    @XmlTransient
    public List<Especialistas> getEspecialistasList() {
        return especialistasList;
    }

    public void setEspecialistasList(List<Especialistas> especialistasList) {
        this.especialistasList = especialistasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEspeci != null ? idEspeci.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Especializaciones)) {
            return false;
        }
        Especializaciones other = (Especializaciones) object;
        if ((this.idEspeci == null && other.idEspeci != null) || (this.idEspeci != null && !this.idEspeci.equals(other.idEspeci))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Especializaciones[ idEspeci=" + idEspeci + " ]";
    }
    
}
