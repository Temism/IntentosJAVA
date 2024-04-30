package com.mpalma.evaluacion2marcopalma;

import com.mpalma.evaluacion2marcopalma.DTO.VehiculoCargaDTO;
import com.mpalma.evaluacion2marcopalma.DTO.VehiculoDTO;
import com.mpalma.evaluacion2marcopalma.DTO.VehiculoPasajeroDTO;
import com.mpalma.evaluacion2marcopalma.ServicesImpl.IVehiculoServiceImpl;

/*
 * @author Marco
 */
public class Evaluacion2MarcoPalma {

    public static void main(String[] args) {
        
        
        IVehiculoServiceImpl aux = new IVehiculoServiceImpl();
        
        VehiculoCargaDTO v1 = new VehiculoCargaDTO();
        
        v1.setTipoVehiculo("Carga");
        v1.setPatente("v1");
        v1.setDiasArriendo(7);
        v1.setValorArriendo(15000);
        v1.setCapacidadCarga(150);
        aux.IngresarVehiculo(v1);
         
         
        VehiculoPasajeroDTO v2 = new VehiculoPasajeroDTO();
        v2.setCapacidadPasajeros(15);
        v2.setDiasArriendo(4);
        v2.setValorArriendo(12000);
        v2.setPatente("v2");
        v2.setTipoVehiculo("Pasajero");
        aux.IngresarVehiculo(v2);
        
        
        VehiculoCargaDTO v3 = new VehiculoCargaDTO();
        v3.setTipoVehiculo("Carga");
        v3.setPatente("v3");
        v3.setDiasArriendo(10);
        v3.setValorArriendo(15000);
        v3.setCapacidadCarga(1500);
        aux.IngresarVehiculo(v3);
       
        aux.mostraListadoVehiculosIngresados();
        aux.ImprimirBoleta();
        
        System.out.println("________________________________________");
        aux.listaVehiculosMayoresSieteDias();
    }
}
