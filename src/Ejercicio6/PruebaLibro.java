package Ejercicio6;

import Ejercicio9.Libro;
import Ejercicio9.Persona;

public class PruebaLibro {
    public static void main(String[] args) {

        Persona autor1 = new Persona("Miguel", "de Cervantes");

        Libro libro1 = new Libro("Don Quijote", autor1, "0-13-031997-X", 784, 2, "Barco de Vapor", "Huesca", "España", 2, 3,1990);

        System.out.println(libro1);


        System.out.println();
    }
}
