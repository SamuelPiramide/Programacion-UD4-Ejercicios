package Ejercicio10;

import java.util.Comparator;

public class TituloComparator implements Comparator<Libro> {

    @Override
    public int compare(Libro libro1, Libro libro2) {
        return libro1.getTitulo().compareToIgnoreCase(libro2.getTitulo());
    }
}
