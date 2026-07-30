package Ejercicio02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        

        try {
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();

            System.out.println("El número ingresado es: " + numero);

        } catch (InputMismatchException e) {

            System.out.println("Error: Debe ingresar un número entero.");

        }

        scanner.close();
    }
    }

