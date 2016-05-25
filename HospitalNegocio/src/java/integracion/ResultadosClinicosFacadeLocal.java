/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integracion;

import Entidades.ResultadosClinicos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DT8
 */
@Local
public interface ResultadosClinicosFacadeLocal {

    void create(ResultadosClinicos resultadosClinicos);

    void edit(ResultadosClinicos resultadosClinicos);

    void remove(ResultadosClinicos resultadosClinicos);

    ResultadosClinicos find(Object id);

    List<ResultadosClinicos> findAll();

    List<ResultadosClinicos> findRange(int[] range);

    int count();
    
}
