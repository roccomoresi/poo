package org.example.products;

public class Contrarelojista extends Ciclista{
    private int velocidadMaxima;

    Ciclista ciclista = new Ciclista() {
    };


    protected String imprimirTipo(){
        return ciclista.getNombreCiclista() + " id: " + ciclista.getIdentificador() + " tiempo acumulado " + ciclista.getTiempoAcumulado() + " velocidad maxima: "
                + velocidadMaxima;
    };


    protected int getVelocidadMaxima(){
        return velocidadMaxima;
    }

    protected void setVelocidadMaxima(int velocidadMaxima){
        this.velocidadMaxima = velocidadMaxima;
    }
}
