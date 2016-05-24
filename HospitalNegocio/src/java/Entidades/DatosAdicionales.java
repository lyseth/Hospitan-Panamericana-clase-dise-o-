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
import javax.validation.constraints.Size;

/**
 *
 * @author DT8
 */
@Entity
@Table(name = "DATOS_ADICIONALES")
@NamedQueries({
    @NamedQuery(name = "DatosAdicionales.findAll", query = "SELECT d FROM DatosAdicionales d"),
    @NamedQuery(name = "DatosAdicionales.findByNumRegistro", query = "SELECT d FROM DatosAdicionales d WHERE d.numRegistro = :numRegistro"),
    @NamedQuery(name = "DatosAdicionales.findByAnteceFamiliares", query = "SELECT d FROM DatosAdicionales d WHERE d.anteceFamiliares = :anteceFamiliares"),
    @NamedQuery(name = "DatosAdicionales.findByEnferDetectada", query = "SELECT d FROM DatosAdicionales d WHERE d.enferDetectada = :enferDetectada")})
public class DatosAdicionales implements Serializable {

    @OneToMany(mappedBy = "datosAdicionalesNumRegistro")
    private List<HistorialesMedicos> historialesMedicosList;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUM_REGISTRO")
    private Integer numRegistro;
    @Size(max = 20)
    @Column(name = "ANTECE_FAMILIARES")
    private String anteceFamiliares;
    @Size(max = 30)
    @Column(name = "ENFER_DETECTADA")
    private String enferDetectada;
    @JoinColumn(name = "PRESTADORA_SALUD_ID_PRESTADORA", referencedColumnName = "ID_PRESTADORA")
    @ManyToOne(optional = false)
    private PrestadoraSalud prestadoraSaludIdPrestadora;
    @JoinColumn(name = "REGISTRO_CEDULA", referencedColumnName = "CEDULA")
    @ManyToOne(optional = false)
    private Registro registroCedula;

    public DatosAdicionales() {
    }

    public DatosAdicionales(Integer numRegistro) {
        this.numRegistro = numRegistro;
    }

    public Integer getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(Integer numRegistro) {
        this.numRegistro = numRegistro;
    }

    public String getAnteceFamiliares() {
        return anteceFamiliares;
    }

    public void setAnteceFamiliares(String anteceFamiliares) {
        this.anteceFamiliares = anteceFamiliares;
    }

    public String getEnferDetectada() {
        return enferDetectada;
    }

    public void setEnferDetectada(String enferDetectada) {
        this.enferDetectada = enferDetectada;
    }

    public PrestadoraSalud getPrestadoraSaludIdPrestadora() {
        return prestadoraSaludIdPrestadora;
    }

    public void setPrestadoraSaludIdPrestadora(PrestadoraSalud prestadoraSaludIdPrestadora) {
        this.prestadoraSaludIdPrestadora = prestadoraSaludIdPrestadora;
    }

    public Registro getRegistroCedula() {
        return registroCedula;
    }

    public void setRegistroCedula(Registro registroCedula) {
        this.registroCedula = registroCedula;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numRegistro != null ? numRegistro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DatosAdicionales)) {
            return false;
        }
        DatosAdicionales other = (DatosAdicionales) object;
        if ((this.numRegistro == null && other.numRegistro != null) || (this.numRegistro != null && !this.numRegistro.equals(other.numRegistro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.DatosAdicionales[ numRegistro=" + numRegistro + " ]";
    }

    public List<HistorialesMedicos> getHistorialesMedicosList() {
        return historialesMedicosList;
    }

    public void setHistorialesMedicosList(List<HistorialesMedicos> historialesMedicosList) {
        this.historialesMedicosList = historialesMedicosList;
    }
    
}
