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
    private String editorial;
    private String ciudad;
    private String pais;
    private Fecha fecha;


    public Libro(String titulo, Persona autor, String ISBN, int paginas, int edicion, String editorial, String ciudad, String pais, int day, int month, int year) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.paginas = paginas;
        this.edicion = edicion;
        this.editorial = editorial;
        this.ciudad = ciudad;
        this.pais = pais;
        this.fecha = new Fecha(day, month, year);
    }


    @Override
    public String toString() {
        String salida = "Título: " + this.titulo + ".\n";
        salida += this.edicion + "ª edición.\n";
        salida += "Autor: " + this.autor + "\n";
        salida += "ISBN: " + ISBN + "\n";
        salida += this.editorial + ", " + this.ciudad + " (" + this.pais + "), " + this.fecha + "\n";
        salida += this.paginas + " páginas";

        return salida;

    }


    public String getTitulo() {
        return this.titulo;
    }

    public Persona getAutor() {
        return this.autor;
    }

    public String getISBN() {
        return this.ISBN;
    }

    public int getPaginas() {
        return this.paginas;
    }

    public int getEdicion() {
        return this.edicion;
    }

    public String getEditorial() {
        return this.editorial;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public String getPais() {
        return this.pais;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Fecha getFecha() {
        return this.fecha;
    }
}
