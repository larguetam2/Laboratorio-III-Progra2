package Ejercicio09;

import java.util.Scanner;

public class Ejercicio09 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Ingrese su edad: ");
            int edad = scanner.nextInt();

            if (edad < 0) {
                throw new IllegalArgumentException("La edad no puede ser negativa.");
            }

            System.out.println("Edad válida: " + edad);

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());

        } finally{
            scanner.close();
        }

        

    }

}
