package Ejercicio9;

import java.util.Comparator;

public class TituloComparator implements Comparator<Libro> {

    @Override
    public int compare(Libro libro1, Libro libro2) {
        String titulo1 = libro1.getTitulo();
        String titulo2 = libro2.getTitulo();
        return titulo1.compareToIgnoreCase(titulo2);
    }
}
