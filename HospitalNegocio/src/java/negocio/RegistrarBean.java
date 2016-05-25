/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import Entidades.Registro;
import Entidades.RegistroVO;
import integracion.RegistroFacadeLocal;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.hibernate.validator.constraints.Email;

/**
 *
 * @author DT8
 */
@Stateless
public class RegistrarBean implements RegistrarBeanLocal{

    @EJB
    private RegistroFacadeLocal fachadaRegistro;
    
    public boolean registrar(Registro registro) {
        
        //VALIDACIONES Y LOGICA
        if(!registro.getEmail().endsWith(".com")){ 
        
            fachadaRegistro.create(registro);
        }
        
        return true;
        
    }

    @Override
    public String obtenerRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean registrar(String nombre, String apelido, int edad, int cedula, int telefono, String direccion, String ciudad, String email) {
    return true;
    }

   
}