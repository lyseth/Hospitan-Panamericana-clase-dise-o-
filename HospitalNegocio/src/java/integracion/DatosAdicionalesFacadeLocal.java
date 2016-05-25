/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integracion;

import Entidades.DatosAdicionales;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DT8
 */
@Local
public interface DatosAdicionalesFacadeLocal {

    void create(DatosAdicionales datosAdicionales);

    void edit(DatosAdicionales datosAdicionales);

    void remove(DatosAdicionales datosAdicionales);

    DatosAdicionales find(Object id);

    List<DatosAdicionales> findAll();

    List<DatosAdicionales> findRange(int[] range);

    int count();
    
}
