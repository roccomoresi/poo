package org.example.products;

public class Execution {
    public static void main(String[] args) {

        Ciclista ciclista = new Ciclista() {


            public String imprimirTipo(){
                return "Ciclista";
            };
        };

        Ciclista velocista = new Velocista() {

        };
        Ciclista escalador = new Escalador() {

        };
        Ciclista contrarelojista = new Contrarelojista() {

        };




        System.out.println(velocista.imprimirTipo());


    }
}
