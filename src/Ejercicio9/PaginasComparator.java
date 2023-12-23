package Ejercicio9;

import java.util.Comparator;

public class PaginasComparator implements Comparator<Libro>{

    @Override
    public int compare(Libro libro1, Libro libro2) {
        return libro1.getPaginas() - libro2.getPaginas();
    }
}
