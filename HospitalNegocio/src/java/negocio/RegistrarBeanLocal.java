/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import Entidades.Registro;
import javax.ejb.Local;

/**
 *
 * @author DT8
 */
@Local
public interface RegistrarBeanLocal {

    public String CrearRegistro(Registro r);
}
