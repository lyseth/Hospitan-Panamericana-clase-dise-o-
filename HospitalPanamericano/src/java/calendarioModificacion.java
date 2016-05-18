package citasModificada;

import java.util.Date;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author DT8
 */
@ManagedBean
public class calendarioModificacion{

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



