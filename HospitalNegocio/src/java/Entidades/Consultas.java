/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
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
    @NamedQuery(name = "Consultas.findAll", query = "SELECT c FROM Consultas c"),
    @NamedQuery(name = "Consultas.findByIdConsulata", query = "SELECT c FROM Consultas c WHERE c.idConsulata = :idConsulata")})
public class Consultas implements Serializable {

    @OneToMany(mappedBy = "consultasIdConsulata")
    private Collection<ResultadosClinicos> resultadosClinicosCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_CONSULATA")
    private Long idConsulata;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "RECOMENDACION_ESP")
    private String recomendacionEsp;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "OBSERVACION_ESP")
    private String observacionEsp;
    @JoinColumn(name = "CITAS_NUM_RADICADO", referencedColumnName = "NUM_RADICADO")
    @ManyToOne(optional = false)
    private Citas citasNumRadicado;

    public Consultas() {
    }

    public Consultas(Long idConsulata) {
        this.idConsulata = idConsulata;
    }

    public Consultas(Long idConsulata, String recomendacionEsp, String observacionEsp) {
        this.idConsulata = idConsulata;
        this.recomendacionEsp = recomendacionEsp;
        this.observacionEsp = observacionEsp;
    }

    public Long getIdConsulata() {
        return idConsulata;
    }

    public void setIdConsulata(Long idConsulata) {
        this.idConsulata = idConsulata;
    }

    public String getRecomendacionEsp() {
        return recomendacionEsp;
    }

    public void setRecomendacionEsp(String recomendacionEsp) {
        this.recomendacionEsp = recomendacionEsp;
    }

    public String getObservacionEsp() {
        return observacionEsp;
    }

    public void setObservacionEsp(String observacionEsp) {
        this.observacionEsp = observacionEsp;
    }

    public Citas getCitasNumRadicado() {
        return citasNumRadicado;
    }

    public void setCitasNumRadicado(Citas citasNumRadicado) {
        this.citasNumRadicado = citasNumRadicado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idConsulata != null ? idConsulata.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Consultas)) {
            return false;
        }
        Consultas other = (Consultas) object;
        if ((this.idConsulata == null && other.idConsulata != null) || (this.idConsulata != null && !this.idConsulata.equals(other.idConsulata))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Consultas[ idConsulata=" + idConsulata + " ]";
    }

    public Collection<ResultadosClinicos> getResultadosClinicosCollection() {
        return resultadosClinicosCollection;
    }

    public void setResultadosClinicosCollection(Collection<ResultadosClinicos> resultadosClinicosCollection) {
        this.resultadosClinicosCollection = resultadosClinicosCollection;
    }
    
}
