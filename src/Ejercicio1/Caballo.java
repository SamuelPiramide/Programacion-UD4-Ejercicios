package Ejercicio1;


//Implementa la clase Caballo (piensa antes los posibles atributos y métodos).
// Pruébala a través de otra clase, creando instancias y aplicándole algunos métodos.
public class Caballo {

    private String nombre;
    private  int edad;
    private  String genero;
    private String relincho;

    public Caballo (String nombre, int edad, String genero, String relincho) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.relincho = relincho;
    }


    public void relinchar(){
        System.out.println(this.relincho);
    }

}
