/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integracion;

import Entidades.MedidasColes;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DT8
 */
@Local
public interface MedidasColesFacadeLocal {

    void create(MedidasColes medidasColes);

    void edit(MedidasColes medidasColes);

    void remove(MedidasColes medidasColes);

    MedidasColes find(Object id);

    List<MedidasColes> findAll();

    List<MedidasColes> findRange(int[] range);

    int count();
    
}
