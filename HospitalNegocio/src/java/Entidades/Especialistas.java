/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DT8
 */
@Entity
@Table(name = "ESPECIALISTAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Especialistas.findAll", query = "SELECT e FROM Especialistas e"),
    @NamedQuery(name = "Especialistas.findByCodRegMedico", query = "SELECT e FROM Especialistas e WHERE e.codRegMedico = :codRegMedico"),
    @NamedQuery(name = "Especialistas.findByIdMedico", query = "SELECT e FROM Especialistas e WHERE e.idMedico = :idMedico"),
    @NamedQuery(name = "Especialistas.findByNombres", query = "SELECT e FROM Especialistas e WHERE e.nombres = :nombres"),
    @NamedQuery(name = "Especialistas.findByApeliidos", query = "SELECT e FROM Especialistas e WHERE e.apeliidos = :apeliidos")})
public class Especialistas implements Serializable {

    @OneToMany(mappedBy = "especialistasCodRegMedico")
    private List<HistorialesMedicos> historialesMedicosList;

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "COD_REG_MEDICO")
    private BigDecimal codRegMedico;
    @Column(name = "ID_MEDICO")
    private BigInteger idMedico;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "NOMBRES")
    private String nombres;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "APELIIDOS")
    private String apeliidos;
    @JoinColumn(name = "ESPECIALIZACIONES_ID_ESPECI", referencedColumnName = "ID_ESPECI")
    @ManyToOne(optional = false)
    private Especializaciones especializacionesIdEspeci;

    public Especialistas() {
    }

    public Especialistas(BigDecimal codRegMedico) {
        this.codRegMedico = codRegMedico;
    }

    public Especialistas(BigDecimal codRegMedico, String nombres, String apeliidos) {
        this.codRegMedico = codRegMedico;
        this.nombres = nombres;
        this.apeliidos = apeliidos;
    }

    public BigDecimal getCodRegMedico() {
        return codRegMedico;
    }

    public void setCodRegMedico(BigDecimal codRegMedico) {
        this.codRegMedico = codRegMedico;
    }

    public BigInteger getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(BigInteger idMedico) {
        this.idMedico = idMedico;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApeliidos() {
        return apeliidos;
    }

    public void setApeliidos(String apeliidos) {
        this.apeliidos = apeliidos;
    }

    public Especializaciones getEspecializacionesIdEspeci() {
        return especializacionesIdEspeci;
    }

    public void setEspecializacionesIdEspeci(Especializaciones especializacionesIdEspeci) {
        this.especializacionesIdEspeci = especializacionesIdEspeci;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codRegMedico != null ? codRegMedico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Especialistas)) {
            return false;
        }
        Especialistas other = (Especialistas) object;
        if ((this.codRegMedico == null && other.codRegMedico != null) || (this.codRegMedico != null && !this.codRegMedico.equals(other.codRegMedico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Especialistas[ codRegMedico=" + codRegMedico + " ]";
    }

    public List<HistorialesMedicos> getHistorialesMedicosList() {
        return historialesMedicosList;
    }

    public void setHistorialesMedicosList(List<HistorialesMedicos> historialesMedicosList) {
        this.historialesMedicosList = historialesMedicosList;
    }
    
}
