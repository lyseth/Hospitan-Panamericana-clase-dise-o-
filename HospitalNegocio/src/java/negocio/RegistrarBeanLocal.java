/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;
import Entidades.RegistroVO;
import javax.ejb.Local;

/**
 *
 * @author DT8
 */

 @Local
public interface RegistrarBeanLocal {
    public boolean registrar(RegistroVO nombre);
    public String obtenerRegistro();

    public boolean registrar(String nombre,String apelido,int eda,int cedula,int telefono,String direccion,String ciudad);
}   

