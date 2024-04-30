
package com.mpalma.evaluacion2marcopalma.DTO;

public abstract class VehiculoDTO {
    
    private String Patente;
    private int DiasArriendo;
    private String TipoVehiculo;
    private double ValorArriendo;

    public VehiculoDTO(String Patente, int DiasArriendo, String TipoVehiculo, double ValorArriendo) {
        this.Patente = Patente;
        this.DiasArriendo = DiasArriendo;
        this.TipoVehiculo = TipoVehiculo;
        this.ValorArriendo = ValorArriendo;
    }
    
    public VehiculoDTO() {
        this.Patente = "";
        this.DiasArriendo = 0;
        this.TipoVehiculo = "";
        this.ValorArriendo = 0.0;
    }
    

    public String getPatente() {
        return Patente;
    }

    public void setPatente(String Patente) {
        this.Patente = Patente;
    }

    public int getDiasArriendo() {
        return DiasArriendo;
    }

    public void setDiasArriendo(int DiasArriendo) {
        this.DiasArriendo = DiasArriendo;
    }

    public String getTipoVehiculo() {
        return TipoVehiculo;
    }

    public void setTipoVehiculo(String TipoVehiculo) {
        this.TipoVehiculo = TipoVehiculo;
    }

    public double getValorArriendo() {
        return ValorArriendo;
    }

    public void setValorArriendo(double ValorArriendo) {
        this.ValorArriendo = ValorArriendo;
    }

    @Override
    public String toString() {
        return "Patente: " + this.Patente
                + " Tipo Vehiculo: " +this.TipoVehiculo 
                + " Valor Arriendo: " + this.ValorArriendo
                + " Cantidad de dias de Arriendo: " + this.DiasArriendo;
    }
    
    public abstract void Imprimir();{
           /* System.out.println(this.toString()); */
    }
    
}
