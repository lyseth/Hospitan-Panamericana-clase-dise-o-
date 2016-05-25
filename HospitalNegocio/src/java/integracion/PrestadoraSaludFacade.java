/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integracion;

import Entidades.PrestadoraSalud;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author DT8
 */
@Stateless
public class PrestadoraSaludFacade extends AbstractFacade<PrestadoraSalud> implements PrestadoraSaludFacadeLocal {

    @PersistenceContext(unitName = "HospitalNegocioPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PrestadoraSaludFacade() {
        super(PrestadoraSalud.class);
    }
    
}
