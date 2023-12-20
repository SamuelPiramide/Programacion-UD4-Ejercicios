package Ejercicio8;

public class PruebaProductos {
    public static void main(String[] args) {

        Producto producto1 = new Producto(1, "Desatranques Pro Max", "Desatascador", 33, 333);
        Producto producto2 = new Producto(2, "Pizza Casa Tarradellas", "Pizza", 4.3, 90);
        Producto producto3 = new Producto(3, "Coche de Fernando Alonso", "Aston Martin", 9999999, 1);

        ArrayProducto productos = new ArrayProducto();

        productos.agregar(producto1);
        productos.agregar(producto2);
        productos.agregar(producto3);

        System.out.println("------------------------------------------------");
        productos.imprimirLista();
        System.out.println("------------------------------------------------");

        productos.eliminar(producto1);
        //Ya no está el producto 1
        System.out.println("------------------------------------------------");
        productos.imprimirLista();
        System.out.println("------------------------------------------------");
        //En la primera posicion ahora está la pizza
        System.out.println(productos.obtener(0));


        //Busca el producto con el codigo 1 (No está por lo que muestra el mensaje de error)
        try{
            System.out.println(productos.buscar(1));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("El tamaño de la lista en este momento es de " + productos.tamano() + " elementos.");


        productos.cambiarPrecio(2,666);

        try{
            System.out.println(productos.buscar(2));
            System.out.println("Precio cambiado para el producto con el codigo 2");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
