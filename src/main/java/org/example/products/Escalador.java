package org.example.products;

public class Escalador extends Ciclista{
    private float aceleracionPromedioSubida;
    private float gradoRampaSoportada;


    Ciclista ciclista = new Ciclista() {
    };


    protected String imprimirTipo(){
        return ciclista.getNombreCiclista() + " id: " + ciclista.getIdentificador()
                + " tiempo acumulado " + ciclista.getTiempoAcumulado()
                + " Aceleracion promedio en subida " + aceleracionPromedioSubida
                + " grado de rampa soportada " + gradoRampaSoportada
                + " es Escalador.";

    };

    protected float getAceleracionPromedioSubida(){
        return aceleracionPromedioSubida;
    };

    protected float setaceleracionPromedioSubida(float aceleracionPromedioSubida){
        this.aceleracionPromedioSubida = aceleracionPromedioSubida;
        return aceleracionPromedioSubida;
    }

    protected float getGradoRampaSoportada(){
        return gradoRampaSoportada;
    }

    protected float setGradoPromedioSoportada(float gradoRampaSoportada){
        this.aceleracionPromedioSubida = gradoRampaSoportada;
        return gradoRampaSoportada;
    }

}
