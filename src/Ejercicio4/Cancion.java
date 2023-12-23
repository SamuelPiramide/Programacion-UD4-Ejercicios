package Ejercicio4;
//Desarrolla una clase Cancion con los siguientes atributos:
//        titulo: una variable String que guarda el título de la canción.
//        autor: una variable String que guarda el autor de la canción.
//        y los siguientes métodos:
//          Cancion (String, String): constructor que recibe como parámetros el título y el autor de la canción (por este orden).
//        Cancion (): constructor predeterminado que inicializa el título y el autor a cadenas vacías.
//        dameTitulo(): devuelve el título de la canción.
//        dameAutor(): devuelve el autor de la canción.
//        ponTitulo(String): establece el título de la canción.
//        ponAutor(String): establece el autor de la canción.
public class Cancion {
    private String titulo;
    private String autor;

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public Cancion() {
        this.titulo = "";
        this.autor = "";
    }


    public String dameTitulo() {
        return this.titulo;
    }

    public String dameAutor() {
        return this.autor;
    }

    public void ponTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void ponAutor(String autor) {
        this.autor = autor;
    }
    
}
