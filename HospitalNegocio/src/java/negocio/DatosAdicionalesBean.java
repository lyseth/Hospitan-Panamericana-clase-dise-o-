/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import Entidades.DatosAdicionales;
import Entidades.Registro;
import integracion.DatosAdicionalesFacadeLocal;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author DT8
 */
@Stateless
public class DatosAdicionalesBean implements DatosAdicionalesBeanLocal {

    @EJB
    public DatosAdicionalesFacadeLocal creandoAdicional;

    @Override
    public String CrearAdicional(DatosAdicionales ad) {
        DatosAdicionales registroAdicional;
        registroAdicional = creandoAdicional.find(ad.getNumRegistro());
        if (registroAdicional == null) {
            creandoAdicional.create(ad);
        } else {
            System.out.println("error");
        }
        return null;
    }
}
