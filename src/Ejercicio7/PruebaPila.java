package Ejercicio7;

public class PruebaPila {
    public static void main(String[] args) {

        PilaPalabras pila = new PilaPalabras();

        String palabra1 = "Paco";
        String palabra2 = "Roberto";
        String palabra3 = "Oliver";



        if(pila.pilaPlabrasVacia()) System.out.println("Esta vacia.");
        else System.out.println("No está vacía.");

        pila.apilarPalabra(palabra1);
        pila.apilarPalabra(palabra2);
        pila.apilarPalabra(palabra3);

        if(pila.pilaPlabrasVacia()) System.out.println("Esta vacia.");
        else System.out.println("No está vacía.");

        System.out.println(pila.desapilarPalabra());

        if(pila.pilaPlabrasVacia()) System.out.println("Esta vacia.");
        else System.out.println("No está vacía.");

        System.out.println(pila.obtenerPalabraCima());
        }

    }

