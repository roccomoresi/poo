package org.example.products;

public class Velocista extends Ciclista{
    String tipo = "velocista";
    private double velocidadPromedio;
    private double potenciaPromedio;


    @Override
    public String imprimirTipo(){
        return "Velocista";
    };

    protected double getVelocista(){
        return velocidadPromedio;
    }

    protected double setvelocidadPromedio(Double velocidadPromedio){
        return velocidadPromedio;
    }


    public double getPotenciaPromedio() {
        return potenciaPromedio;
    }

    protected double setPotenciaPromedio(double potenciaPromedio){
        this.potenciaPromedio = potenciaPromedio;
        return potenciaPromedio;
    }




}
