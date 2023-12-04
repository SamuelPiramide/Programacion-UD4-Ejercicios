package Ejercicio2;

//Crea la clase Pizza con los atributos y métodos necesarios.
// Sobre cada pizza se necesita sabel el tamaño.
// Sobre cada pizza se necesita saber el tamaño (mediana o familiar),
// el tipo (margarita, cuatro quesos o marinera) y su estado (pedida o servida).
// La clase debe almacenar información sobre el número total de pizzas que se
// han pedido y que se han servido. Siempre que se crea una pizza nueva, su estado
// es "pedida". Crea una clase de prueba que haga que responda como en el ejemplo
// de salida.
public class Ejercicio2 {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza ("Mediana", "Margarita");
        Pizza pizza2 = new Pizza ("Familiar", "Pepperonni");
        pizza2.servir();
        Pizza pizza3 = new Pizza ("Mediana", "Jamón y Queso");

        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);

        pizza2.servir();

        System.out.println("Pedidas: " + Pizza.getTotalPedidas());
        System.out.println("Servidas: " + Pizza. getTotalServidas());
    }

}
