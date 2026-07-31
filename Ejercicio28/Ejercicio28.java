package Ejercicio28;

import java.util.Scanner;

public class Ejercicio28 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Persona persona = new Persona();

        System.out.print("Ingrese el nombre: ");
        persona.setNombre(scanner.nextLine());

        System.out.print("Ingrese la edad: ");
        persona.setEdad(scanner.nextInt());

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());

        scanner.close();
    }

}

class Persona {

    private String nombre;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {

        if (edad < 0) {
            System.out.println("Error: La edad no puede ser negativa.");
            return;
        }

        this.edad = edad;
    }

}