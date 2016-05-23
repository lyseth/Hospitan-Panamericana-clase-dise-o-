/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import Entidades.UsuarioVO;
import javax.ejb.Local;

/**
 *
 * @author DT8
 */
@Local
public interface AutenticacionBeanLocal {
    public boolean autenticar(UsuarioVO usuario);
    public String obtenerNombreUsuario();

    public boolean autenticar(String usuario, String password);
}
