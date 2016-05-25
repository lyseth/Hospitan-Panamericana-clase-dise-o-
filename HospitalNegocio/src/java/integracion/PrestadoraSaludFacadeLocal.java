/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integracion;

import Entidades.PrestadoraSalud;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DT8
 */
@Local
public interface PrestadoraSaludFacadeLocal {

    void create(PrestadoraSalud prestadoraSalud);

    void edit(PrestadoraSalud prestadoraSalud);

    void remove(PrestadoraSalud prestadoraSalud);

    PrestadoraSalud find(Object id);

    List<PrestadoraSalud> findAll();

    List<PrestadoraSalud> findRange(int[] range);

    int count();
    
}
