package Ejercicio6;
//Crea una clase Libro que modele la información que se mantiene en una
// biblioteca sobre cada libro: título, autor (usa la clase Persona),
// ISBN, páginas, edición, editorial, lugar (ciudad y país) y fecha de edición
// (usa la clase Fecha). La clase debe proporcionar los siguientes servicios:
// getters y setters, método para leer la información y método para mostrar la
// información. Este último método mostrará la información del libro con el siguiente
// formato:
public class Libro {
    private String titulo;
    private Persona autor;
    private String ISBN;
    private int paginas;
    private int edicion;
    private String Editorial;
    private String ciudad;
    private String pais;


    @Override
    public String toString() {

    }
}
