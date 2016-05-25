/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integracion;

import Entidades.MedidasPeso;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DT8
 */
@Local
public interface MedidasPesoFacadeLocal {

    void create(MedidasPeso medidasPeso);

    void edit(MedidasPeso medidasPeso);

    void remove(MedidasPeso medidasPeso);

    MedidasPeso find(Object id);

    List<MedidasPeso> findAll();

    List<MedidasPeso> findRange(int[] range);

    int count();
    
}
