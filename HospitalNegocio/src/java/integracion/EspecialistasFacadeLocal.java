/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integracion;

import Entidades.Especialistas;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DT8
 */
@Local
public interface EspecialistasFacadeLocal {

    void create(Especialistas especialistas);

    void edit(Especialistas especialistas);

    void remove(Especialistas especialistas);

    Especialistas find(Object id);

    List<Especialistas> findAll();

    List<Especialistas> findRange(int[] range);

    int count();
    
}
