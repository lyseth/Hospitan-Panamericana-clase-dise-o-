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
import javax.persistence.Lob;
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
@Table(name = "RESULTADOS_CLINICOS")
@NamedQueries({
    @NamedQuery(name = "ResultadosClinicos.findAll", query = "SELECT r FROM ResultadosClinicos r"),
    @NamedQuery(name = "ResultadosClinicos.findByCodResultado", query = "SELECT r FROM ResultadosClinicos r WHERE r.codResultado = :codResultado")})
public class ResultadosClinicos implements Serializable {

    @OneToMany(mappedBy = "resultadosClinicosCodResult")
    private List<HistorialesMedicos> historialesMedicosList;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "COD_RESULTADO")
    private Long codResultado;
    @Lob
    @Column(name = "RESULTADO_EXAMEN")
    private Serializable resultadoExamen;
    @JoinColumn(name = "CONSULTAS_ID_CONSULATA", referencedColumnName = "ID_CONSULATA")
    @ManyToOne
    private Consultas consultasIdConsulata;

    public ResultadosClinicos() {
    }

    public ResultadosClinicos(Long codResultado) {
        this.codResultado = codResultado;
    }

    public Long getCodResultado() {
        return codResultado;
    }

    public void setCodResultado(Long codResultado) {
        this.codResultado = codResultado;
    }

    public Serializable getResultadoExamen() {
        return resultadoExamen;
    }

    public void setResultadoExamen(Serializable resultadoExamen) {
        this.resultadoExamen = resultadoExamen;
    }

    public Consultas getConsultasIdConsulata() {
        return consultasIdConsulata;
    }

    public void setConsultasIdConsulata(Consultas consultasIdConsulata) {
        this.consultasIdConsulata = consultasIdConsulata;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codResultado != null ? codResultado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ResultadosClinicos)) {
            return false;
        }
        ResultadosClinicos other = (ResultadosClinicos) object;
        if ((this.codResultado == null && other.codResultado != null) || (this.codResultado != null && !this.codResultado.equals(other.codResultado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.ResultadosClinicos[ codResultado=" + codResultado + " ]";
    }

    public List<HistorialesMedicos> getHistorialesMedicosList() {
        return historialesMedicosList;
    }

    public void setHistorialesMedicosList(List<HistorialesMedicos> historialesMedicosList) {
        this.historialesMedicosList = historialesMedicosList;
    }
    
}
