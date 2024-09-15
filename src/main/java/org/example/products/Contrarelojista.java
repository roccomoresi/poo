package org.example.products;

public class Contrarelojista extends Ciclista{
    String tipo = "contrarelojista";
    private int velocidadMaxima;



    @Override
    public String imprimirTipo() {
        return "Contrarelojista";
    }


    protected int getVelocidadMaxima(){
        return velocidadMaxima;
    }

    protected void setVelocidadMaxima(int velocidadMaxima){
        this.velocidadMaxima = velocidadMaxima;
    }


}
