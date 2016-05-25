/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integracion;

import Entidades.DatosAdicionales;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author DT8
 */
@Stateless
public class DatosAdicionalesFacade extends AbstractFacade<DatosAdicionales> implements DatosAdicionalesFacadeLocal {

    @PersistenceContext(unitName = "HospitalNegocioPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DatosAdicionalesFacade() {
        super(DatosAdicionales.class);
    }
    
}
