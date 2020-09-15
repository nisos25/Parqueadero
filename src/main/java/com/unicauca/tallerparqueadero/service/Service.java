package com.unicauca.tallerparqueadero.service;
import com.unicauca.tallerparqueadero.domain.access.IIngresoRepository;
import com.unicauca.tallerparqueadero.domain.Ingreso;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Libardo, Julio
 */
public class Service {

    // Ahora hay una dependencia de una abstracción, no es algo concreto,
    // no sabe cómo está implementado.
    private IIngresoRepository repository;

    /**
     * Inyección de dependencias en el constructor. Ya no conviene que el mismo
     * servicio cree un repositorio concreto
     *
     * @param repository una clase hija de IIngresoRepository
     */
    public Service(IIngresoRepository repository) {
        this.repository = repository;
    }

    public boolean saveIngreso(Ingreso newIngreso) {

        //Validate product
        if (newIngreso == null || newIngreso.getIngresoId() < 0 
                    || newIngreso.getTipo().toString().isBlank() || newIngreso.getTiempo()<=0 ) {
                return false;
            }

        repository.save(newIngreso);
        return true;

    }

    public List<Ingreso> listIngresos() {
        List<Ingreso> Ingresos = new ArrayList<>();
        Ingresos = repository.list();;

        return Ingresos;
    }

}
