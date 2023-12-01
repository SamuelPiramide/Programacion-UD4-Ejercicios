package Ejercicio2;

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
