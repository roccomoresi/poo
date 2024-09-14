package org.example.products;

public abstract class Ciclista {
    private int identificador;
    private String nombreCiclista;
    private int tiempoAcumulado;


    public abstract String imprimirTipo();


   //Set y get de id
   protected int getIdentificador() {
        return identificador;
    };

    protected void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    //set y get nombre
    protected String getNombreCiclista() {
        return nombreCiclista;
    }

    protected void setNombreCiclista(String nombreCiclista) {
        this.nombreCiclista = nombreCiclista;
    }
    //set y get tiempo

    protected int getTiempoAcumulado() {
        return tiempoAcumulado;
    }
    protected void setTiempoAcumulado(int tiempoAcumulado) {
        this.tiempoAcumulado = tiempoAcumulado;
    }


}


