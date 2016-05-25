/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integracion;

import Entidades.HistorialesMedicos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DT8
 */
@Local
public interface HistorialesMedicosFacadeLocal {

    void create(HistorialesMedicos historialesMedicos);

    void edit(HistorialesMedicos historialesMedicos);

    void remove(HistorialesMedicos historialesMedicos);

    HistorialesMedicos find(Object id);

    List<HistorialesMedicos> findAll();

    List<HistorialesMedicos> findRange(int[] range);

    int count();
    
}
