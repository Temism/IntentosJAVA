/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mpalma.evaluacion2marcopalma.DTO;

/**
 *
 * @author Marco
 */
public class VehiculoPasajeroDTO extends VehiculoDTO {

    private int CapacidadPasajeros;

    public VehiculoPasajeroDTO(int CapacidadPasajeros) {
        super();
        this.CapacidadPasajeros = CapacidadPasajeros;
    }
    public VehiculoPasajeroDTO() {
        super();
        this.CapacidadPasajeros = 0;
    }
    public VehiculoPasajeroDTO(int CapacidadPasajeros, String Patente, int DiasArriendo, String TipoVehiculo, double ValorArriendo) {
        super(Patente, DiasArriendo, TipoVehiculo, ValorArriendo);
        this.CapacidadPasajeros = CapacidadPasajeros;
    }

    public int getCapacidadPasajeros() {
        return CapacidadPasajeros;
    }

    public void setCapacidadPasajeros(int CapacidadPasajeros) {
        this.CapacidadPasajeros = CapacidadPasajeros;
    }
    
    
    
    @Override
    public void Imprimir() {
        System.out.println("---------Vehiculo de Pasajeros---------- ");
        System.out.println(super.toString());
        System.out.println("Capacidad: "+this.CapacidadPasajeros + "Pasajeros");
    }
    
}
