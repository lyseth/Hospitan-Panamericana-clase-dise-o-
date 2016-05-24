/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author DT8
 */
@Entity
@Table(name = "HISTORIALES_MEDICOS")
@NamedQueries({
    @NamedQuery(name = "HistorialesMedicos.findAll", query = "SELECT h FROM HistorialesMedicos h"),
    @NamedQuery(name = "HistorialesMedicos.findByNumRegistro", query = "SELECT h FROM HistorialesMedicos h WHERE h.numRegistro = :numRegistro")})
public class HistorialesMedicos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUM_REGISTRO")
    private Long numRegistro;
    @Lob
    @Column(name = "INFORME_ESPECIFICO")
    private String informeEspecifico;
    @JoinColumn(name = "DATOS_ADICIONALES_NUM_REGISTRO", referencedColumnName = "NUM_REGISTRO")
    @ManyToOne
    private DatosAdicionales datosAdicionalesNumRegistro;
    @JoinColumn(name = "ESPECIALISTAS_COD_REG_MEDICO", referencedColumnName = "COD_REG_MEDICO")
    @ManyToOne
    private Especialistas especialistasCodRegMedico;
    @JoinColumn(name = "MEDIDAS_COLES_ID_MEDIDA", referencedColumnName = "ID_MEDIDA")
    @ManyToOne
    private MedidasColes medidasColesIdMedida;
    @JoinColumn(name = "MEDIDAS_PESO_ID_MED", referencedColumnName = "ID_MED")
    @ManyToOne
    private MedidasPeso medidasPesoIdMed;
    @JoinColumn(name = "RESULTADOS_CLINICOS_COD_RESULT", referencedColumnName = "COD_RESULTADO")
    @ManyToOne
    private ResultadosClinicos resultadosClinicosCodResult;

    public HistorialesMedicos() {
    }

    public HistorialesMedicos(Long numRegistro) {
        this.numRegistro = numRegistro;
    }

    public Long getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(Long numRegistro) {
        this.numRegistro = numRegistro;
    }

    public String getInformeEspecifico() {
        return informeEspecifico;
    }

    public void setInformeEspecifico(String informeEspecifico) {
        this.informeEspecifico = informeEspecifico;
    }

    public DatosAdicionales getDatosAdicionalesNumRegistro() {
        return datosAdicionalesNumRegistro;
    }

    public void setDatosAdicionalesNumRegistro(DatosAdicionales datosAdicionalesNumRegistro) {
        this.datosAdicionalesNumRegistro = datosAdicionalesNumRegistro;
    }

    public Especialistas getEspecialistasCodRegMedico() {
        return especialistasCodRegMedico;
    }

    public void setEspecialistasCodRegMedico(Especialistas especialistasCodRegMedico) {
        this.especialistasCodRegMedico = especialistasCodRegMedico;
    }

    public MedidasColes getMedidasColesIdMedida() {
        return medidasColesIdMedida;
    }

    public void setMedidasColesIdMedida(MedidasColes medidasColesIdMedida) {
        this.medidasColesIdMedida = medidasColesIdMedida;
    }

    public MedidasPeso getMedidasPesoIdMed() {
        return medidasPesoIdMed;
    }

    public void setMedidasPesoIdMed(MedidasPeso medidasPesoIdMed) {
        this.medidasPesoIdMed = medidasPesoIdMed;
    }

    public ResultadosClinicos getResultadosClinicosCodResult() {
        return resultadosClinicosCodResult;
    }

    public void setResultadosClinicosCodResult(ResultadosClinicos resultadosClinicosCodResult) {
        this.resultadosClinicosCodResult = resultadosClinicosCodResult;
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
        if (!(object instanceof HistorialesMedicos)) {
            return false;
        }
        HistorialesMedicos other = (HistorialesMedicos) object;
        if ((this.numRegistro == null && other.numRegistro != null) || (this.numRegistro != null && !this.numRegistro.equals(other.numRegistro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.HistorialesMedicos[ numRegistro=" + numRegistro + " ]";
    }
    
}
