package Ejercicio6;
public class Fecha {
    private int day;
    private int month;
    private int year;
    private String diasemana;

    public Fecha(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return String.format(this.day + " de " + pasarMesADia() + " de " + this.year);
    }

    private String pasarMesADia() {
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
