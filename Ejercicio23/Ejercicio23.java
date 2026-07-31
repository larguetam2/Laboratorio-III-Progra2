package Ejercicio23;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio23 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Ingrese su edad: ");
            int edad = scanner.nextInt();

            System.out.println("Edad ingresada: " + edad);

        } catch (InputMismatchException e) {

            System.out.println("Error: Debe ingresar un número.");

        } finally {

            scanner.close();

        }

    }

}
