/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integracion;

import Entidades.Consultas;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DT8
 */
@Local
public interface ConsultasFacadeLocal {

    void create(Consultas consultas);

    void edit(Consultas consultas);

    void remove(Consultas consultas);

    Consultas find(Object id);

    List<Consultas> findAll();

    List<Consultas> findRange(int[] range);

    int count();
    
}
