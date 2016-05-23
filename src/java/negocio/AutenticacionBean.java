/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import Entidades.UsuarioVO;
import javax.ejb.Stateless;

/**
 *
 * @author DT8
 */
@Stateless
public class AutenticacionBean implements AutenticacionBeanLocal {

    public boolean autenticar(UsuarioVO usuario) {

        if (usuario.getNick().equals("admin") && usuario.getContraseña().equals("admin")) {
       return true;            
//return "inicio";//inicio después de loguearse
        } else {
            return false;
            //return "index";
        }
    }

    @Override
    public String obtenerNombreUsuario() {
        return "inicio";
    }

    @Override
    public boolean autenticar(String usuario, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
    
