package Ejercicio8;

import java.lang.reflect.Constructor;

//Escribe una clase Producto con atributos
// - codigo(int),
// - nombre(String),
// - tipo(String),
// - precio(double),
// - stock(int).
// Implementa la clase ArrayProducto, con un atributo de nombre lista y tipo ArrayList y con los métodos
// - agregar,
// - eliminar,
// - obtener (el producto a partir de su posición),
// - buscar(y recuperar el producto por su código),
// - tamaño, imprimirLista,
// - cambiarPrecio (del producto mediante su código y el nuevo precio).
// Escribe después un programa para probar la clase anterior.
public class Producto {

    private int codigo;
    private String nombre;
    private String tipo;
    private double precio;
    private int stock;

    public Producto(int codigo, String nombre, String tipo, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        String salida;
        salida = "\nCodigo = " + codigo + "\n";
        salida += "Nombre = " + nombre + "\n";
        salida += "Tipo = " + tipo + "\n";
        salida += "Precio = " + precio + "€\n";
        salida += "Stock = " + stock + "\n";
        return salida;
    }
}
