package Ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Ingrese un texto: ");
            String texto = scanner.nextLine();

            if (texto.trim().isEmpty()) {
                throw new IllegalArgumentException("El texto no puede estar vacío.");
            }

            System.out.println("Texto válido: " + texto);

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());

        } finally {

            scanner.close();

        }

    }

}
