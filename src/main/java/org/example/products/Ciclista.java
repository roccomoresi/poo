package org.example.products;

public abstract class Ciclista {
    private int identificador = 100;
    private String nombreCiclista;
    private int tiempoAcumulado = 0;


    protected String tipoCiclista(){
        if(this.getClass() == Ve.class){
            String imprimirTipo(){return nombreCiclista + " id: " + identificador + " tiempo acumulado " + tiempoAcumulado;};
        }
    };


    String imprimirTipo(){return nombreCiclista + " id: " + identificador + " tiempo acumulado " + tiempoAcumulado;};

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


