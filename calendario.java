/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citas;

import java.util.Date;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author DT8
 */
@ManagedBean
public class calendario {

    private Date calendar;
    private Date calendar2;

    public Date Calendario() {
        return calendar;
    }

    public void Calendario(Date calendar) {
        this.calendar = calendar;
    }

    public Date getCalendar2() {
        return calendar2;
    }

    public void setCalendar2(Date calendar2) {
        this.calendar2 = calendar2;
    }

}
