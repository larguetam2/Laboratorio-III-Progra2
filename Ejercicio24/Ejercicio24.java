package Ejercicio24;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio24 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero = 0;
        boolean valido = false;

        while (!valido) {

            try {

                System.out.print("Ingrese un número entero: ");
                numero = scanner.nextInt();

                valido = true;

            } catch (InputMismatchException e) {

                System.out.println("Error: Debe ingresar un número.");
                scanner.nextLine();

            }

        }

        System.out.println("Número válido: " + numero);

        scanner.close();

    }

}
