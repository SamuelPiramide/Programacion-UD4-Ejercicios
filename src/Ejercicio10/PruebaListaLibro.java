package Ejercicio10;

public class PruebaListaLibro {
    public static void main(String[] args) {

        ListaLibros biblioteca = new ListaLibros();

        Libro libro1 = new Libro("Harry Potter", "JotaKa Rowling", 333 );
        Libro libro1igual = new Libro("harry potter", "jotaka Rowling", 333 );
        Libro libro2 = new Libro("El Gato con Botas", "Shrek", 890 );
        Libro libro4 = new Libro("La Biblia", "Vaya usted a saber", 9999);
        Libro libro3 = new Libro("Harry Porker", "Spider Cerdo", 1986);


        System.out.println("-------------------------------------------------------");
        System.out.println("Prueba añadir libros iguales y distintos");
        System.out.println("-------------------------------------------------------");
            biblioteca.addLibro(libro1);
            biblioteca.addLibro(libro2);
            biblioteca.addLibro(libro3);
            biblioteca.addLibro(libro4);
            System.out.println("Añadido libro igual = "+ biblioteca.addLibro(libro1igual));
            biblioteca.imprimeLista();


        System.out.println("\n");
        System.out.println("-------------------------------------------------------");
        System.out.println("Prueba obtener y eliminar libro por posición");
        System.out.println("-------------------------------------------------------");

            System.out.println("Libro en posicion 3 =\n" + biblioteca.obtenerLibro(3));
            biblioteca.eliminarLibro(3);
            System.out.println("\nLista despues de eliminar el libro:");
            biblioteca.imprimeLista();




        System.out.println("\n");
        System.out.println("-------------------------------------------------------");
        System.out.println("Prueba buscar libro");
        System.out.println("-------------------------------------------------------");

        System.out.println("El libro <El Ga> está en la posición " + biblioteca.buscaLibro("El Ga"));
    }
}
