package org.example.products;
import java.util.Scanner;

public class Execution {
    public static void main(String[] args) {



        Ciclista velocista = new Velocista() {

        };
        Ciclista escalador = new Escalador() {

        };
        Ciclista contrarelojista = new Contrarelojista() {

        };

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el nombre del atleta: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingresa set Identificador: ");
        int setId = scanner.nextInt();
        System.out.println("Ingresa tiempo acumulado: ");
        int tiempoAcumulado = scanner.nextInt();
        ciclista.setNombreCiclista(nombre);
        ciclista.setIdentificador(setId);
        ciclista.setTiempoAcumulado(tiempoAcumulado);

        System.out.println("Id del ciclista: " + ciclista.getIdentificador());
        System.out.println("Nombre del ciclista: " + ciclista.getNombreCiclista());
        System.out.println("Tiempo acumulado del ciclista: " + ciclista.getTiempoAcumulado());
        System.out.println("Es un " + ciclista.imprimirTipo());

    }
}
