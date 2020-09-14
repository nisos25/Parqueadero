/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.tallerparqueadero.domain.access;

import com.unicauca.tallerparqueadero.domain.AutoEnum;
import com.unicauca.tallerparqueadero.domain.CalcularTarifa;
import com.unicauca.tallerparqueadero.domain.TarifaCamion;
import com.unicauca.tallerparqueadero.domain.TarifaCarro;
import com.unicauca.tallerparqueadero.domain.TarifaMoto;
import java.util.EnumMap;
import java.util.Map;

/**
 * Fábrica que utiliza el patrón de diseño Singleton
 *
 * @author Libardo, Julio
 */
public class Factory {

    private Map<AutoEnum, CalcularTarifa> deliveryDictionary;

    // Singleton
    private static Factory instance;

    private Factory() {
        deliveryDictionary = new EnumMap<>(AutoEnum.class);
        deliveryDictionary.put(AutoEnum.CAMION, new TarifaCamion());
        deliveryDictionary.put(AutoEnum.CARRO, new TarifaCarro());
         deliveryDictionary.put(AutoEnum.MOTO, new TarifaMoto());
        // Si se requie otro vehículo, se abre un registro en este diccionario
        // No se viola el principio porque este este modulo no está pensado
        // para que sea estable.
    }

    /**
     * Devuelve la instancia de la clase
     *
     * @return instancia unica de la la fábrica
     */

    public static Factory getInstance() {
        if (instance == null) {
            instance = new Factory();
        }
        return instance;
    }

    /**
     * Para un pais determina la clase que se encarga de calcular el costo del
     * envío.
     *
     * @param vehiculo
     * @return
     */
    public CalcularTarifa getVehiculo(AutoEnum vehiculo) {

        CalcularTarifa result = null;

        if (deliveryDictionary.containsKey(vehiculo)) {
            result = deliveryDictionary.get(vehiculo);
        }

        return result;

    }
     public IIngresoRepository getRepository(String type) {

        IIngresoRepository result = null;

        switch (type) {
            case "default":
                result = new IngresoRepository();
                break;
        }

        return result;

    }
}