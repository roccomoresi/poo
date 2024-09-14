package org.example.products;

public class Execution {
    public static void main(String[] args) {

        Ciclista ciclista = new Ciclista() {


        };

        Velocista velocista = new Velocista() {

        };
        Escalador escalador = new Escalador() {

        };
        Contrarelojista contrarelojista = new Contrarelojista() {

        };


        ciclista.setNombreCiclista("FLAVIO MENDOZA");
        ciclista.setIdentificador(777);
        ciclista.setTiempoAcumulado(556);

        System.out.println(ciclista.getIdentificador());
        System.out.println("\n");
        System.out.println(ciclista.getNombreCiclista());
        System.out.println("\n");
        System.out.println(ciclista.getTiempoAcumulado());

    }
}
