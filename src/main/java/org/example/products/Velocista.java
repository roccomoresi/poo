package org.example.products;

public class Velocista extends Ciclista{
    private double velocidadPromedio;
    private double potenciaPromedio;

    Ciclista ciclista = new Ciclista() {
    };


    protected String imprimirTipo(){
        return ciclista.getNombreCiclista() + " id: " + ciclista.getIdentificador() + " tiempo acumulado " + ciclista.getTiempoAcumulado() + velocidadPromedio
                + " su potencia promedio es " + potenciaPromedio + " es Velocista" ;
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
