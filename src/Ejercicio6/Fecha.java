package Ejercicio6;

public class Fecha {
    private int day;
    private int month;
    private int year;
    private String diasemana;

    @Override
    public String toString() {
        return String 



    }

    private String pasarMesADia(){
        return switch (this.month) {
            case 1 -> "enero";
            case 2 -> "febrero";
            case 3 -> "marzo";
            case 4 -> "abril";
            case 5 -> "mayo";
            case 6 -> "junio";
            case 7 -> "julio";
            case 8 -> "agosto";
            case 9 -> "septiembre";
            case 10 -> "octubre";
            case 11 -> "noviembre";
            case 12 -> "diciembre";
            default -> "[Error]";
        };


    }
}
