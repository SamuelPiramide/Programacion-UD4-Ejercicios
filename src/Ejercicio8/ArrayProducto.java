package Ejercicio8;

import java.util.ArrayList;

public class ArrayProducto {
    private ArrayList<Producto> lista = new ArrayList<>();

    public void agregar(Producto producto) {
        lista.add(producto);
    }

    public void eliminar(Producto producto) {
        lista.remove(producto);
    }

    public Producto obtener(int posicionproducto) {
        return lista.get(posicionproducto);
    }

    public Producto buscar(int codigoproducto) throws Exception {
        for (Producto producto : lista) {
            int codigo = producto.getCodigo();
            if (codigo == codigoproducto)
                return producto;
        }

        throw new Exception("No se ha encontrado el producto con el código " + codigoproducto);
    }

    public int tamano (){
        return lista.size();
    }

    public void imprimirLista(){
        for(Producto producto: lista){
            System.out.println(producto);
        }
    }

    public void cambiarPrecio(int codigoproducto, int nuevoprecio) {
        for (Producto producto : lista) {
            int codigo = producto.getCodigo();
            if (codigo == codigoproducto) {
                producto.setPrecio(nuevoprecio);
            }
        }
    }
}
