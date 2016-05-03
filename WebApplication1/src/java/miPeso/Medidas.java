package miPeso;

import javax.faces.bean.ManagedBean;
import javax.faces.event.ActionEvent;

/**
 *
 * @author DT8
 */
@ManagedBean
public class Medidas {
    
    private String peso;
    private String nivelColesterol;

    public String getPeso() {
        return "peso.xhtml";
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getNivelColesterol() {
        return "nivelColesterol.xtml";
    }

    public void setNivelColesterol(String nivelColesterol) {
        this.nivelColesterol = nivelColesterol;
    }
    
    
    
    

}
