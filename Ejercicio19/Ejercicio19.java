package Ejercicio19;

import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Ingrese un número mayor a 100: ");
            int numero = scanner.nextInt();

            if (numero <= 100) {
                throw new IllegalArgumentException("El número debe ser mayor a 100.");
            }

            System.out.println("Número válido: " + numero);

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());

        } finally {

            scanner.close();

        }

    }

}
