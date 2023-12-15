package Ejercicio7;

import java.util.ArrayList;
//Escribe una clase de nombre PilaPalabras, para gestionar una estructura de pila que permita apilar
// y desapilar objetos de la clase String. La clase implementará el método apilarPalabra para poner
// una palabra en la cima de la pila, el método desapilarPalabra para quitar el elemento de la cima
// de la pila devolviéndolo y el método obtenerPalabraCima para obtener la palabra situada en la cima
// de la pila sin quitarla de ella. También implementará el método pilaPlabrasVacia para determinar
// si la pila está o no vacía. Los métodos deben implementarse utilizando la clase ArrayList.
//Escribe un programa que utilizando la clase PilaPalabras, introduzca varias cadenas de caracteres
// en la pila y las desapile mostrándolas por pantalla.
public class PilaPalabras {
    private ArrayList <String> palabras = new ArrayList<>();


    public void apilarPalabra(String palabra){
            this.palabras.add(palabra);
    }

    public String desapilarPalabra(){
        return this.palabras.remove(palabras.size()-1);
    }

    public String obtenerPalabraCima(){
        return this.palabras.get(palabras.size()-1);
    }

    public boolean pilaPlabrasVacia(){
        return this.palabras.isEmpty();
    }

}
