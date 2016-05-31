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
public class AutenticacionBean implements AutenticacionBeanLocal {
@EJB
        public RegistroFacadeLocal buscar;
   
    /*EntityManager em;

    @Override
    public String existeUsuario(Registro aut) {
        Query query = em.createNamedQuery("Registro.findByUsuario&Password");
        query.setParameter("usuario", aut.getUsuario());
        query.setParameter("password", aut.getPassword());
        if (query.getSingleResult() != null);
        return "si";

    }*/

    @Override
    public String existeUsuario(Registro aut) {
         Registro registroConsulta;

        registroConsulta = buscar.find(aut.getUsuario());
        if (registroConsulta == null)
           System.out.println("error de inicio");
            return null;
        }
               
    }


 