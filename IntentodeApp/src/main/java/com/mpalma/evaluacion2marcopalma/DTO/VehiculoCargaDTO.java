/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mpalma.evaluacion2marcopalma.DTO;

/**
 *
 * @author Marco
 */
public class VehiculoCargaDTO extends VehiculoDTO {

    private double CapacidadCarga;

    public VehiculoCargaDTO(int CapacidadCarga) {
        super();
        this.CapacidadCarga = CapacidadCarga;
    }
    public VehiculoCargaDTO() {
        super();
        this.CapacidadCarga = 0;
    }
    public VehiculoCargaDTO(double CapacidadCarga, String Patente, int DiasArriendo, String TipoVehiculo, double ValorArriendo) {
        super(Patente, DiasArriendo, TipoVehiculo, ValorArriendo);
        this.CapacidadCarga = CapacidadCarga;
    }

    public double getCapacidadCarga() {
        return CapacidadCarga;
    }

    public void setCapacidadCarga(double CapacidadCarga) {
        this.CapacidadCarga = CapacidadCarga;
    }
    
    
    
    
    @Override
    public void Imprimir() {
        System.out.println("---------Vehiculo de Carga---------- ");
        System.out.println(super.toString());
        System.out.println("Capacidad: "+this.CapacidadCarga + "KG");
                
    }
    
}
