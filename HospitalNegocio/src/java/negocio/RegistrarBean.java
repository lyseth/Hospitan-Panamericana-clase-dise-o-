/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import Entidades.Registro;
import integracion.RegistroFacadeLocal;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author DT8
 */
@Stateless
public class RegistrarBean implements RegistrarBeanLocal {

    @EJB
    public RegistroFacadeLocal creandoRegistro;

    @Override
    public String CrearRegistro(Registro r) {
        Registro registroConsulta;

        registroConsulta = creandoRegistro.find(r.getCedula());
        if (registroConsulta == null) 
            creandoRegistro.create(r);
         else 
            System.out.println("ya existe el dato");
        
        return null;
    }
}

