
import Entidades.Registro;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import negocio.RegistrarBeanLocal;

@ManagedBean(name = "selectorViewRegistro")

public class SelectorViewRegistro {

    @EJB
    private RegistrarBeanLocal insertoRegistro;

    private String GuardaRegistro;
    Registro registro = new Registro();

    public Registro getRegistro() {
        return registro;
    }

    public void setRegistro(Registro registro) {
        this.registro = registro;
    }

    public String creacionRegistro() {
        GuardaRegistro = insertoRegistro.CrearRegistro(registro);
        return null;
    }

}
