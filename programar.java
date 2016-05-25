/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citas;

import javax.faces.bean.ManagedBean;
import javax.faces.event.ActionEvent;

/**
 *
 * @author DT8
 */
@ManagedBean
public class programar {
    private String programar;
    private String cancelar;
    private String reagendar;
    
    public String getProgramar(ActionEvent event) {
        return "cita_programada.xhtml";
    }

    public void setProgramar(String programar) {
        this.programar = programar;
    }

    public String getCancelar(ActionEvent event) {
        return "cita_cancelar.xhtml";
    }

    public void setCancelar(String cancelar) {
        this.cancelar = cancelar;
    }

    public String getReagendar(ActionEvent event) {
        return "cita_reagendar.xhtml";
    }

    public void setReagendar(String reagendar) {
        this.reagendar = reagendar;
  }
}
