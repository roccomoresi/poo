package org.example.products;

public class Contrarelojista extends Ciclista{
    private int velocidadMaxima;


    @Override
    public String imprimirTipo(){
        return "Es un Contrarelojista";
    }




    protected int getVelocidadMaxima(){
        return velocidadMaxima;
    }

    protected void setVelocidadMaxima(int velocidadMaxima){
        this.velocidadMaxima = velocidadMaxima;
    }
}
