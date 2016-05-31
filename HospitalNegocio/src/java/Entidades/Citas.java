/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author DT8
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Citas.findAll", query = "SELECT c FROM Citas c"),
    @NamedQuery(name = "Citas.findByNumRadicado", query = "SELECT c FROM Citas c WHERE c.numRadicado = :numRadicado"),
    @NamedQuery(name = "Citas.findByFecha", query = "SELECT c FROM Citas c WHERE c.fecha = :fecha"),
    @NamedQuery(name = "Citas.findByHorario", query = "SELECT c FROM Citas c WHERE c.horario = :horario"),
    @NamedQuery(name = "Citas.findByTipoCita", query = "SELECT c FROM Citas c WHERE c.tipoCita = :tipoCita"),
    @NamedQuery(name = "Citas.findByEspecialistasCodRegMedico", query = "SELECT c FROM Citas c WHERE c.especialistasCodRegMedico = :especialistasCodRegMedico")})
public class Citas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "NUM_RADICADO")
    private String numRadicado;
    @Basic(optional = false)
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "citasNumRadicado")
    private List<Consultas> consultasList;
    @JoinColumn(name = "USUARIO_ID_USUARIO", referencedColumnName = "ID_USUARIO")
    @ManyToOne(optional = false)
    private Usuario usuarioIdUsuario;

    public Citas() {
    }

    public Citas(String numRadicado) {
        this.numRadicado = numRadicado;
    }

    public Citas(String numRadicado, Date fecha, String horario, String tipoCita, BigInteger especialistasCodRegMedico) {
        this.numRadicado = numRadicado;
        this.fecha = fecha;
        this.horario = horario;
        this.tipoCita = tipoCita;
        this.especialistasCodRegMedico = especialistasCodRegMedico;
    }

    public String getNumRadicado() {
        return numRadicado;
    }

    public void setNumRadicado(String numRadicado) {
        this.numRadicado = numRadicado;
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

    public List<Consultas> getConsultasList() {
        return consultasList;
    }

    public void setConsultasList(List<Consultas> consultasList) {
        this.consultasList = consultasList;
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
        hash += (numRadicado != null ? numRadicado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Citas)) {
            return false;
        }
        Citas other = (Citas) object;
        if ((this.numRadicado == null && other.numRadicado != null) || (this.numRadicado != null && !this.numRadicado.equals(other.numRadicado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Citas[ numRadicado=" + numRadicado + " ]";
    }
    
}
