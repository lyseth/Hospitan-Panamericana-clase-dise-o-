package DatosAdicionales;

import Entidades.DatosAdicionales;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import negocio.DatosAdicionalesBeanLocal;

@ManagedBean
public class datos {

    @EJB
    private DatosAdicionalesBeanLocal insertoAdicional;

    private String GuardaAdicional;
    DatosAdicionales adicionales = new DatosAdicionales();

    public DatosAdicionales getAdicionales() {
        return adicionales;
    }

    public void setAdicionales(DatosAdicionales adicionales) {
        this.adicionales = adicionales;
    }

    public String creacionAdicional() {
        GuardaAdicional = insertoAdicional.CrearAdicional(adicionales);
        return null;
    }

}
