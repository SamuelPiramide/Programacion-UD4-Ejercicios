package Ejercicio10;


import java.util.ArrayList;

public class ListaLibros {

    ArrayList<Libro> lista = new ArrayList<>();

    public boolean addLibro (Libro libro){
        for (Libro li:lista){
            if(li.compareTo(libro) == 0){
                return false;
            }
        }
        ordenarLista();
        return lista.add(libro);
    }

    public Libro eliminarLibro (int posicion){
        return lista.remove(posicion);
    }

    public Libro obtenerLibro (int posicion){
        return lista.get(posicion);
    }

    public void insertarLibro(Libro libro, int posicion){
        lista.add(posicion, libro);
        ordenarLista();
    }

    public int buscaLibro (String busqueda){
        int i = 0;
        for (Libro li:lista){
            if(li.getTitulo().toLowerCase().contains(busqueda.toLowerCase())){
                return i;
            }
            i++;
        }
        return -1;
    }

    public void ordenarLista(){
        TituloComparator comparador = new TituloComparator();
        lista.sort(comparador);
    }

    public void imprimeLista(){
        for(Libro li:lista){
            System.out.println("---------------------");
            System.out.println(li);
        }
    }



}
