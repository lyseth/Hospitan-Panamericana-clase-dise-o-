/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author DT8
 */
@Entity
@Table(name = "MEDIDAS_PESO")
@NamedQueries({
    @NamedQuery(name = "MedidasPeso.findAll", query = "SELECT m FROM MedidasPeso m"),
    @NamedQuery(name = "MedidasPeso.findByIdMed", query = "SELECT m FROM MedidasPeso m WHERE m.idMed = :idMed"),
    @NamedQuery(name = "MedidasPeso.findByVariablePeso", query = "SELECT m FROM MedidasPeso m WHERE m.variablePeso = :variablePeso"),
    @NamedQuery(name = "MedidasPeso.findByRecomenMedica", query = "SELECT m FROM MedidasPeso m WHERE m.recomenMedica = :recomenMedica")})
public class MedidasPeso implements Serializable {

    @OneToMany(mappedBy = "medidasPesoIdMed")
    private List<HistorialesMedicos> historialesMedicosList;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_MED")
    private Short idMed;
    @Column(name = "VARIABLE_PESO")
    private Short variablePeso;
    @Column(name = "RECOMEN_MEDICA")
    private Short recomenMedica;
    @JoinColumn(name = "USUARIO_ID_USUARIO", referencedColumnName = "ID_USUARIO")
    @ManyToOne
    private Usuario usuarioIdUsuario;

    public MedidasPeso() {
    }

    public MedidasPeso(Short idMed) {
        this.idMed = idMed;
    }

    public Short getIdMed() {
        return idMed;
    }

    public void setIdMed(Short idMed) {
        this.idMed = idMed;
    }

    public Short getVariablePeso() {
        return variablePeso;
    }

    public void setVariablePeso(Short variablePeso) {
        this.variablePeso = variablePeso;
    }

    public Short getRecomenMedica() {
        return recomenMedica;
    }

    public void setRecomenMedica(Short recomenMedica) {
        this.recomenMedica = recomenMedica;
    }

    public Usuario getUsuarioIdUsuario() {
        return usuarioIdUsuario;
    }

    public void setUsuarioIdUsuario(Usuario usuarioIdUsuario) {
        this.usuarioIdUsuario = usuarioIdUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMed != null ? idMed.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MedidasPeso)) {
            return false;
        }
        MedidasPeso other = (MedidasPeso) object;
        if ((this.idMed == null && other.idMed != null) || (this.idMed != null && !this.idMed.equals(other.idMed))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.MedidasPeso[ idMed=" + idMed + " ]";
    }

    public List<HistorialesMedicos> getHistorialesMedicosList() {
        return historialesMedicosList;
    }

    public void setHistorialesMedicosList(List<HistorialesMedicos> historialesMedicosList) {
        this.historialesMedicosList = historialesMedicosList;
    }
    
}
