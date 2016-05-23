/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DT8
 */
@Entity
@Table(name = "CITAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Citas.findAll", query = "SELECT c FROM Citas c"),
    @NamedQuery(name = "Citas.findByIdCita", query = "SELECT c FROM Citas c WHERE c.idCita = :idCita"),
    @NamedQuery(name = "Citas.findByFecha", query = "SELECT c FROM Citas c WHERE c.fecha = :fecha"),
    @NamedQuery(name = "Citas.findByHorario", query = "SELECT c FROM Citas c WHERE c.horario = :horario"),
    @NamedQuery(name = "Citas.findByTipoCita", query = "SELECT c FROM Citas c WHERE c.tipoCita = :tipoCita"),
    @NamedQuery(name = "Citas.findByEspecialistasCodRegMedico", query = "SELECT c FROM Citas c WHERE c.especialistasCodRegMedico = :especialistasCodRegMedico")})
public class Citas implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_CITA")
    private BigDecimal idCita;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "HORARIO")
    private String horario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "TIPO_CITA")
    private String tipoCita;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ESPECIALISTAS_COD_REG_MEDICO")
    private BigInteger especialistasCodRegMedico;
    @JoinColumn(name = "USUARIO_ID_USUARIO", referencedColumnName = "ID_USUARIO")
    @ManyToOne(optional = false)
    private Usuario usuarioIdUsuario;

    public Citas() {
    }

    public Citas(BigDecimal idCita) {
        this.idCita = idCita;
    }

    public Citas(BigDecimal idCita, Date fecha, String horario, String tipoCita, BigInteger especialistasCodRegMedico) {
        this.idCita = idCita;
        this.fecha = fecha;
        this.horario = horario;
        this.tipoCita = tipoCita;
        this.especialistasCodRegMedico = especialistasCodRegMedico;
    }

    public BigDecimal getIdCita() {
        return idCita;
    }

    public void setIdCita(BigDecimal idCita) {
        this.idCita = idCita;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getTipoCita() {
        return tipoCita;
    }

    public void setTipoCita(String tipoCita) {
        this.tipoCita = tipoCita;
    }

    public BigInteger getEspecialistasCodRegMedico() {
        return especialistasCodRegMedico;
    }

    public void setEspecialistasCodRegMedico(BigInteger especialistasCodRegMedico) {
        this.especialistasCodRegMedico = especialistasCodRegMedico;
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
        hash += (idCita != null ? idCita.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Citas)) {
            return false;
        }
        Citas other = (Citas) object;
        if ((this.idCita == null && other.idCita != null) || (this.idCita != null && !this.idCita.equals(other.idCita))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Citas[ idCita=" + idCita + " ]";
    }
    
}
