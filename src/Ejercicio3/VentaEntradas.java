package Ejercicio3;
//Queremos gestionar la venta de entradas (no numeradas) de Expocoches Huesca que tiene 3 zonas:
//        La zona de compra-venta con 200 entradas disponibles
//        La zona vip con 25 entradas disponibles
//        Hay que controlar que hay entradas disponibles antes de venderlas.

import java.util.Scanner;

public class VentaEntradas {
    public static void main(String[] args) {
        Zona principal = new Zona(1000);
        Zona compraventa = new Zona(200);
        Zona vip = new Zona(25);

        int menu;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1 - Mostrar número de entradas libres");
            System.out.println("2 - Vender entradas");
            System.out.println("3 - Salir");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Entradas por vender:");
                    System.out.println("Zona principal: " + principal.getEntradasPorVender());
                    System.out.println("Zona compra-venta: " + compraventa.getEntradasPorVender());
                    System.out.println("Zona vip: " + vip.getEntradasPorVender());
                    break;

                case 2:
                    
                    System.out.println("¿Cuantas entradas quiere comprar?");
            }
        } while (menu != 3);


    }

}
