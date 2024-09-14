package org.example.products;

public class Velocista extends Ciclista{
    private double velocidadPromedio;
    private double potenciaPromedio;

    @Override
    public String imprimirTipo() {
        return "Es velocista";
    }


    protected double getVelocista(){

        return velocidadPromedio;
    }

    protected double setvelocidadPromedio(Double velocidadPromedio)
    {
        return this.velocidadPromedio = velocidadPromedio;
    }


    public double getPotenciaPromedio() {
        return potenciaPromedio;
    }

    protected double setPotenciaPromedio(double potenciaPromedio){
        this.potenciaPromedio = potenciaPromedio;
        return potenciaPromedio;
    }




}
