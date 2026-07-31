package Ejercicio30;

public class Ejercicio30 {

    public static void main(String[] args) {

        Persona persona = new Persona("Pablo", 18);

        persona.mostrarDatos();

    }

}

class Persona {

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDatos() {

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);

    }

}
