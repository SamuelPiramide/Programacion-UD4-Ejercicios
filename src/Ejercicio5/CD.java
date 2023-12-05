package Ejercicio5;

import Ejercicio4.Cancion;

//Desarrola una clase CD con los siguientes atributos:
//canciones: un array de objetos de la clase Cancion
//contador: la siguiente posición libre del array canciones.
//y los siguientes métodos:
//CD(): constructor predeterminado (creará el array canciones).
//numeroCanciones(): devuleve el valor del contador de canciones.
//dameCancion(int): devuelve la Cancion que se encuentra en la posición indicada.
//grabaCancion(int, Cancion): cambia la Cancion de la posición indicada por la nueva Cancion proporcionada.
//agregaCancion(Cancion): agrega al final del array la Cancion proporcionada.
//elimina(int): elimina la canción que se encuentra en la posición indicada.
public class CD {

    private Cancion[] Canciones;
    private int contadorcanciones;

    public CD() {
        this.Canciones = new Cancion[20];
        this.contadorcanciones = 0;
        System.out.println("El CD ha sido creado.");
    }

    public int numeroCanciones() {
        return contadorcanciones;
    }

    public Cancion dameCancion(int numerocancion) {
        return Canciones[numerocancion];
    }

    public void grabaCancion(int numerocancion, Cancion cancion) {
        if (Canciones[numerocancion]==null) {
            System.out.println("No hay ninguna canción que sustituir en esta posición.");
        }else{
            this.Canciones[numerocancion] = cancion;
        }
    }


    public void agregaCancion(Cancion cancion){
        this.Canciones[contadorcanciones] = cancion;
        System.out.println("La canción ha sido agregada en la posición " + contadorcanciones);
    }

    public void elimina(int posicion){
        if (Canciones[posicion]== null){
            System.out.println("No hay ninguna canción en esta posición");
        }else{
            this.Canciones[posicion]=null;
            this.contadorcanciones--;

            for (int i = posicion; i < Canciones.length; i++) {
                if (Canciones[i+1]!= null){
                    Canciones[i]=Canciones[i+1];
                }else{
                    Canciones[i+1]=null;
                    break;
                }
            }

            System.out.println("La canción ha sido eliminada.");
        }
    }






}
