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
@Table(name = "MEDIDAS_COLES")
@NamedQueries({
    @NamedQuery(name = "MedidasColes.findAll", query = "SELECT m FROM MedidasColes m"),
    @NamedQuery(name = "MedidasColes.findByIdMedida", query = "SELECT m FROM MedidasColes m WHERE m.idMedida = :idMedida"),
    @NamedQuery(name = "MedidasColes.findByVariableColes", query = "SELECT m FROM MedidasColes m WHERE m.variableColes = :variableColes"),
    @NamedQuery(name = "MedidasColes.findByRecomenMedica", query = "SELECT m FROM MedidasColes m WHERE m.recomenMedica = :recomenMedica")})
public class MedidasColes implements Serializable {

    @OneToMany(mappedBy = "medidasColesIdMedida")
    private List<HistorialesMedicos> historialesMedicosList;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_MEDIDA")
    private Long idMedida;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VARIABLE_COLES")
    private short variableColes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "RECOMEN_MEDICA")
    private short recomenMedica;
    @JoinColumn(name = "USUARIO_ID_USUARIO", referencedColumnName = "ID_USUARIO")
    @ManyToOne(optional = false)
    private Usuario usuarioIdUsuario;

    public MedidasColes() {
    }

    public MedidasColes(Long idMedida) {
        this.idMedida = idMedida;
    }

    public MedidasColes(Long idMedida, short variableColes, short recomenMedica) {
        this.idMedida = idMedida;
        this.variableColes = variableColes;
        this.recomenMedica = recomenMedica;
    }

    public Long getIdMedida() {
        return idMedida;
    }

    public void setIdMedida(Long idMedida) {
        this.idMedida = idMedida;
    }

    public short getVariableColes() {
        return variableColes;
    }

    public void setVariableColes(short variableColes) {
        this.variableColes = variableColes;
    }

    public short getRecomenMedica() {
        return recomenMedica;
    }

    public void setRecomenMedica(short recomenMedica) {
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
        hash += (idMedida != null ? idMedida.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MedidasColes)) {
            return false;
        }
        MedidasColes other = (MedidasColes) object;
        if ((this.idMedida == null && other.idMedida != null) || (this.idMedida != null && !this.idMedida.equals(other.idMedida))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.MedidasColes[ idMedida=" + idMedida + " ]";
    }

    public List<HistorialesMedicos> getHistorialesMedicosList() {
        return historialesMedicosList;
    }

    public void setHistorialesMedicosList(List<HistorialesMedicos> historialesMedicosList) {
        this.historialesMedicosList = historialesMedicosList;
    }
    
}
