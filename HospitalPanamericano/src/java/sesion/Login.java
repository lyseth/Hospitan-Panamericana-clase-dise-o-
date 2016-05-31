package sesion;

import Entidades.Registro;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import negocio.AutenticacionBeanLocal;


/**
 *
 * @author DT8
 */
@ManagedBean (name = "login")
public class Login {

    @EJB
     private AutenticacionBeanLocal sesion;
    
    
    private String validar; 
        Registro aut = new Registro();

    public Registro getAut() {
        return aut;
    }

    public void setAut(Registro aut) {
        this.aut = aut;
    }
public String valida(){
        
        validar = sesion.existeUsuario(aut);
            return "indexIniciopag";
    
        
 }
}
