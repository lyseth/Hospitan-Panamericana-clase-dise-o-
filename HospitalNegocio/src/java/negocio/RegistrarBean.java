/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import Entidades.RegistroVO;
import javax.ejb.Stateless;

/**
 *
 * @author DT8
 */
@Stateless
public class RegistrarBean implements RegistrarBeanLocal{

    public boolean registrar(RegistroVO nombre) {

    
return true;
}

    @Override
    public String obtenerRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean registrar(String nombre, String apelido, int eda, int cedula, int telefono, String direccion, String ciudad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
