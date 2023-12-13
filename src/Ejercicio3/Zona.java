package Ejercicio3;

//Queremos gestionar la venta de entradas (no numeradas) de Expocoches Huesca que tiene 3 zonas:
//        La zona de compra-venta con 200 entradas disponibles
//        La zona vip con 25 entradas disponibles
//        Hay que controlar que hay entradas disponibles antes de venderlas.
public class Zona {
    private int entradasPorVender;

    public Zona(int numeroEntradas) {
        this.entradasPorVender = numeroEntradas;
    }

    public int getEntradasPorVender() {
        return this.entradasPorVender;
    }

    //Vende un número de entradas.
    //Comprueba si quedan entradas libres antes de realizar la venta.

    public void vender(int n) {
        if (this.entradasPorVender == 0) {
            System.out.println("Lo siento, las entradas para esta zona están agotadas.");
        } else if (this.entradasPorVender < n) {
            System.out.println("Solo quedan " + this.entradasPorVender + " entradas para esa zona.");
        } else {
            entradasPorVender -= n;
            System.out.println("Aquí tiene sus " + n + " entradas, gracias.");
        }
    }
}
