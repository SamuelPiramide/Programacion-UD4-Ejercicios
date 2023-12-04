package Ejercicio3;
//Queremos gestionar la venta de entradas (no numeradas) de ExpoCoches Huesca que tiene 3 zonas:
//        La zona de compra-venta con 200 entradas disponibles
//        La zona vip con 25 entradas disponibles
//        Hay que controlar que hay entradas disponibles antes de venderlas.

import java.util.Scanner;

public class VentaEntradas {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Zona principal = new Zona(1000);
        Zona compraventa = new Zona(200);
        Zona vip = new Zona(25);

        int menu;

        do {
            System.out.println("\n");
            System.out.println("1 - Mostrar número de entradas libres");
            System.out.println("2 - Vender entradas");
            System.out.println("3 - Salir");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    entradasPorVender(principal, compraventa, vip);
                    break;

                case 2:
                    compraEntradas(principal, compraventa, vip);
                    break;

                case 3:
                    System.out.println("Hasta la vista.");
            }
        } while (menu != 3);


    }

    public static void entradasPorVender (Zona principal, Zona compraventa, Zona vip){
        System.out.println("\n");
        System.out.println("Entradas por vender:");
        System.out.println("Zona principal: " + principal.getEntradasPorVender());
        System.out.println("Zona compra-venta: " + compraventa.getEntradasPorVender());
        System.out.println("Zona vip: " + vip.getEntradasPorVender());
    }

    public static void compraEntradas (Zona principal, Zona compraventa, Zona vip){
        int numEntradas;
        int menu;

        System.out.println("¿Cuantas entradas quiere comprar?");
        numEntradas = sc.nextInt();

        System.out.println("¿En qué zona quiere comprar las entradas?");
        System.out.println("1 - Zona principal");
        System.out.println("2 - Zona compraventa");
        System.out.println("3 - Zona vip");
        menu = sc.nextInt();
        switch (menu){

            case 1:
                principal.vender(numEntradas);
                break;

            case 2:
                compraventa.vender(numEntradas);
                break;

            case 3:
                vip.vender(numEntradas);
                break;

            default:
                System.out.println("Esa no es una opción válida.");

        }
    }

}
