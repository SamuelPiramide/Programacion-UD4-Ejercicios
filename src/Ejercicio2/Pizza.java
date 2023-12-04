package Ejercicio2;

public class Pizza {
    private String size;
    private String tipo;
    private boolean servida;
    private static int totalPedidas = 0;
    private static int totalServidas = 0;

    public Pizza(String size, String tipo){
        this.size = size;
        this.tipo = tipo;
        this.servida = false;
        totalPedidas++;
    }

    @Override
    public String toString(){
        String pizza;

        pizza= String.format("Pizza %s %s, ",size,tipo);
        if (servida){
            pizza += "servida";
        } else{
            pizza += "pedida";
        }

        return pizza;
    }

    public void servir(){
        if(this.servida) {
            System.out.println("Esta pizza ya está servida.");
        }else{
            this.servida = true;
            totalServidas++;
        }
    }

    public static int getTotalPedidas(){
        return totalPedidas;
    }

    public static int getTotalServidas(){
        return totalServidas;
    }




}
