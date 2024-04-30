/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mpalma.evaluacion2marcopalma.ServicesImpl;


import com.mpalma.evaluacion2marcopalma.DTO.VehiculoDTO;
import com.mpalma.evaluacion2marcopalma.Services.IVehiculoService;
import java.util.ArrayList;
import java.util.List;


public class IVehiculoServiceImpl implements IVehiculoService {
    
    List<VehiculoDTO> BaseDatoVehiculos;
    
    public IVehiculoServiceImpl(){
        BaseDatoVehiculos = new ArrayList<>();
    }
    public void IngresarVehiculo(VehiculoDTO obj){
        boolean patente = false;
        
        
        for (VehiculoDTO objeto : BaseDatoVehiculos) {
        if (objeto.getPatente().equals(obj.getPatente())) {
            patente = true;
            break;
        }
    }
    if (!patente) {
        BaseDatoVehiculos.add(obj);
        System.out.println("El vehículo se registrado correctamente.");
    } else {
        System.out.println("La patente ya existe");
    } 
    }
    
    public List<VehiculoDTO> mostraListadoVehiculosIngresados() {
       
        int i = 1;
        for (VehiculoDTO vehiculo : BaseDatoVehiculos) {
            System.out.println(i + ": "+ vehiculo);
            i++;
        }
        
       return BaseDatoVehiculos;
    }
    public void listaVehiculosMayoresSieteDias(){
        int aut = 0;
        for(VehiculoDTO objeto : BaseDatoVehiculos){
            if(objeto.getDiasArriendo()>= 7){
                aut ++;
            }
        }
        System.out.println("Existen " + aut + " que contienen un arriendo mayor o iguales a 7 días");
    }
   
    @Override
    public void ImprimirBoleta() {
        for (VehiculoDTO objeto : BaseDatoVehiculos){
            double valor =0;
            double descuento = 0 ;
            double coniva = 0;
            double total = 0;
                if("Carga".equals(objeto.getTipoVehiculo()) ){
                    valor = objeto.getDiasArriendo() * objeto.getValorArriendo();
                    descuento = valor * DCarga  ;
                    coniva = (valor - descuento) * iva;
                    total = valor - descuento + coniva;
                    System.out.println(" --------- Detalle de Boleta --------- ");
                    System.out.println("Patente Vehiculo: " + objeto.getPatente());
                    System.out.println("Tipo de Vehiculo " + objeto.getTipoVehiculo());
                    System.out.println("Dias de arriendo: " + objeto.getDiasArriendo());
                    System.out.println("Valor Arriendo: "+ " $ " +objeto.getValorArriendo());
                    System.out.println("SubTotal: " + valor);
                    System.out.println("Valor Descuento 3%: " + descuento);
                    System.out.println("Valor IVA: " + coniva);
                    System.out.println("Total: " + total);
                    }
                else if ("Pasajero".equals(objeto.getTipoVehiculo()) ){
                    valor = objeto.getDiasArriendo() * objeto.getValorArriendo();
                    descuento = valor * DPasajero  ;
                    coniva = (valor - descuento) * iva;
                    total = valor - descuento + coniva;
                    System.out.println(" --------- Detalle de Boleta --------- ");
                    System.out.println("Patente Vehiculo: " + objeto.getPatente());
                    System.out.println("Tipo de Vehiculo " + objeto.getTipoVehiculo());
                    System.out.println("Dias de arriendo: " + objeto.getDiasArriendo());
                    System.out.println("Valor Arriendo: "+ " $ " +objeto.getValorArriendo());
                    System.out.println("SubTotal: " + valor);
                    System.out.println("Valor Descuento 7%: " + descuento);
                    System.out.println("Valor IVA: " + coniva);
                    System.out.println("Total: " + total); 
                }
        }
    }
    
}
