package Ejercicio9;

import java.util.ArrayList;

public class ArrayListLibros {

    ArrayList<Libro> lista = new ArrayList<>();


    public void insertarLibro(Libro libro){
        boolean check = this.lista.add(libro);

        if (check) System.out.println("Elemento añadido.");
        else System.out.println("Error al añadir el elemento.");
    }

    public int numLibros(){
        return lista.size();
    }

    public Libro eliminarLibro(int posicion){
        return lista.remove(posicion);
    }

    public Libro obtenerLibro(int posicion){
        return lista.get(posicion);
    }

    public int buscarLibro(String buscada){
        int posicion=0;
        for(Libro libro:lista){
            if (libro.getTitulo().equalsIgnoreCase(buscada)){
                return posicion;
            }else{
                posicion++;
            }
        }
        return -1;
    }

    public void ordenarPorTitulo(){
        TituloComparator comparator = new TituloComparator();
        lista.sort(comparator);
    }

    public void ordenarPorPaginas(){
        PaginasComparator comparator = new PaginasComparator();
        lista.sort(comparator);
    }


    //Metodo para que solamente saque título y páginas para comprobar.
    public void mostrarListaTituloPaginas () {
        for (Libro libro: lista){
            System.out.println(libro.getTitulo() + " / " + libro.getPaginas() + " paginas");
        }
    }
}
