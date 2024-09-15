package org.example.products;

public class Escalador extends Ciclista{
    String tipo = "escalador";
    private float aceleracionPromedioSubida;
    private float gradoRampaSoportada;



    @Override
    public String imprimirTipo() {
        return "Escalador";
    }


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
    }}


