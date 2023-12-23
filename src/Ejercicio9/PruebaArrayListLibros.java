package Ejercicio9;

public class PruebaArrayListLibros {
    public static void main(String[] args) {

        ArrayListLibros lista = new ArrayListLibros();



        Persona autor1 = new Persona("Miguel", "de Cervantes");
        Libro libro1 = new Libro("Don Quijote", autor1, "0-13-031997-X", 784, 2, "Barco de Vapor", "Huesca", "España", 2, 3,1990);
        Persona autor2 = new Persona("JotaKa", "Rowling");
        Libro libro2 = new Libro("Harry Potter", autor2, "0-97-765445-Y", 333, 1, "Chanquete", "Zaragoza", "España", 9, 5,2000);
        Persona autor3 = new Persona("Fernando", "Alonso");
        Libro libro3 = new Libro("La 33 esta cerca", autor3, "0-56-3333333-Z", 500, 3, "Aston Martin", "Zaragoza", "Brackley", 3, 3,2033);

        System.out.println("-----------------------------------------------");
        System.out.println("Prueba de añadir y mostrar cantidad de libros");
        System.out.println("-----------------------------------------------");
        System.out.println("El número de libros actual es: " + lista.numLibros());
        lista.insertarLibro(libro1);
        lista.insertarLibro(libro2);
        lista.insertarLibro(libro3);
        System.out.println("El número de libros actual es: " + lista.numLibros());


        System.out.println();
        System.out.println("-----------------------------------------------");
        System.out.println("Prueba de obtener, eliminar y buscar libros");
        System.out.println("-----------------------------------------------");
        System.out.println("El titulo del libro en la posicion 1 es " + lista.obtenerLibro(1).getTitulo());
        lista.eliminarLibro(1);
        System.out.println("El número de libros tras eliminar es: " + lista.numLibros());
        System.out.println("Tras eliminar, el titulo del libro en la posicion 1 es " + lista.obtenerLibro(1).getTitulo());
        System.out.println();
        lista.insertarLibro(libro2);
        System.out.println();
        System.out.println("El libro con el titulo <Don Quijote> está en la posición " + lista.buscarLibro("Don Quijote"));


        System.out.println();
        System.out.println("-----------------------------------------------");
        System.out.println("Prueba de ordenar");
        System.out.println("-----------------------------------------------");

        lista.mostrarListaTituloPaginas();
        System.out.println();
        System.out.println("Ordenada por Paginas");
        lista.ordenarPorPaginas();
        lista.mostrarListaTituloPaginas();
        System.out.println();
        System.out.println("Ordenada por Titulo");
        lista.ordenarPorTitulo();
        lista.mostrarListaTituloPaginas();









    }
}
