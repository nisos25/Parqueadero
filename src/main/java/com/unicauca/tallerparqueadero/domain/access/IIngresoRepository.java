
package com.unicauca.tallerparqueadero.domain.access;

import com.unicauca.tallerparqueadero.domain.Ingreso;
import java.util.List;

/**
 *
 * @author Libardo, Julio
 */
public interface IIngresoRepository {
    boolean save(Ingreso newProduct);

    List<Ingreso> list();
}
