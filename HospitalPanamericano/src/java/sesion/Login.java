package sesion;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.event.ActionEvent;
import negocio.AutenticacionBeanLocal;
import org.primefaces.context.RequestContext;

/**
 *
 * @author DT8
 */

@ManagedBean
public class Login {

    private String usuario;
    private String password;
    @EJB
    private AutenticacionBeanLocal autenticacionBean;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String login(ActionEvent event) { //cambiar a String y borrar elemento

        RequestContext context = RequestContext.getCurrentInstance();
        FacesMessage message = null;

        if (autenticacionBean.autenticar(usuario,password)){
        
             message = new FacesMessage(FacesMessage.SEVERITY_INFO, "¡Bienvienido!", usuario);
            return "indexIniciopag"; //pagina inicio
        } else {

            message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Error", "No son validos los datos");
            return "index";
        }

        //FacesContext.getCurrentInstance().addMessage(null, message);
        //context.addCallbackParam("loggedIn", loggedIn);
    }
}
