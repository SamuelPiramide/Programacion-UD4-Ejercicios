package Ejercicio10;


public class Libro implements Comparable<Libro>{
    private String titulo;
    private String autor;
    private int paginas;

    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        String salida = "Titulo: " + this.titulo;
        salida += "\nAutor: " + this.autor;
        salida += "\nPáginas: " + this.paginas;
        return salida;
    }


    @Override
    public int compareTo(Libro libro) {
        int comparatitulo = this.titulo.compareToIgnoreCase(libro.getTitulo());
        if (comparatitulo!=0) {
            return comparatitulo;
        }else {
            return this.autor.compareToIgnoreCase(libro.getAutor());
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

}
