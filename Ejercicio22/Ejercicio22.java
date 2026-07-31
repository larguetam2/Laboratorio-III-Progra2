package Ejercicio22;

import java.util.Scanner;

public class Ejercicio22 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Ingrese un texto: ");
            String texto = scanner.nextLine();

            if (texto.length() < 5) {
                throw new IllegalArgumentException(
                        "El texto debe tener al menos 5 caracteres.");
            }

            System.out.println("Texto válido.");

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());

        } finally {

            scanner.close();

        }

    }

}
