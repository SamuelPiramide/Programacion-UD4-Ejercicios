package Ejercicio2;

public class Pizza {
    private String size;
    private String tipo;
    private boolean servida;
    private static int totalpedidas = 0;
    private static int totalservidas = 0;

    public Pizza(String size, String tipo){
        this.size = size;
        this.tipo = tipo;
        this.servida = false;
        totalpedidas++;
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
            totalservidas++;
        }
    }

    public static int getTotalPedidas(){
        return totalpedidas;
    }

    public static int getTotalServidas(){
        return totalservidas;
    }




}
