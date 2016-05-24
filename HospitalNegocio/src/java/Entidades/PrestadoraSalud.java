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

/**
 *
 * @author DT8
 */
@Entity
@Table(name = "PRESTADORA_SALUD")
@NamedQueries({
    @NamedQuery(name = "PrestadoraSalud.findAll", query = "SELECT p FROM PrestadoraSalud p"),
    @NamedQuery(name = "PrestadoraSalud.findByIdPrestadora", query = "SELECT p FROM PrestadoraSalud p WHERE p.idPrestadora = :idPrestadora"),
    @NamedQuery(name = "PrestadoraSalud.findByTipoPrestadora", query = "SELECT p FROM PrestadoraSalud p WHERE p.tipoPrestadora = :tipoPrestadora"),
    @NamedQuery(name = "PrestadoraSalud.findByNombrePrestadora", query = "SELECT p FROM PrestadoraSalud p WHERE p.nombrePrestadora = :nombrePrestadora")})
public class PrestadoraSalud implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PRESTADORA")
    private Long idPrestadora;
    @Size(max = 10)
    @Column(name = "TIPO_PRESTADORA")
    private String tipoPrestadora;
    @Size(max = 15)
    @Column(name = "NOMBRE_PRESTADORA")
    private String nombrePrestadora;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "prestadoraSaludIdPrestadora")
    private List<DatosAdicionales> datosAdicionalesList;

    public PrestadoraSalud() {
    }

    public PrestadoraSalud(Long idPrestadora) {
        this.idPrestadora = idPrestadora;
    }

    public Long getIdPrestadora() {
        return idPrestadora;
    }

    public void setIdPrestadora(Long idPrestadora) {
        this.idPrestadora = idPrestadora;
    }

    public String getTipoPrestadora() {
        return tipoPrestadora;
    }

    public void setTipoPrestadora(String tipoPrestadora) {
        this.tipoPrestadora = tipoPrestadora;
    }

    public String getNombrePrestadora() {
        return nombrePrestadora;
    }

    public void setNombrePrestadora(String nombrePrestadora) {
        this.nombrePrestadora = nombrePrestadora;
    }

    public List<DatosAdicionales> getDatosAdicionalesList() {
        return datosAdicionalesList;
    }

    public void setDatosAdicionalesList(List<DatosAdicionales> datosAdicionalesList) {
        this.datosAdicionalesList = datosAdicionalesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPrestadora != null ? idPrestadora.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrestadoraSalud)) {
            return false;
        }
        PrestadoraSalud other = (PrestadoraSalud) object;
        if ((this.idPrestadora == null && other.idPrestadora != null) || (this.idPrestadora != null && !this.idPrestadora.equals(other.idPrestadora))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.PrestadoraSalud[ idPrestadora=" + idPrestadora + " ]";
    }
    
}
