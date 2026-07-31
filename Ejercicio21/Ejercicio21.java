package Ejercicio21;

import java.util.Scanner;

public class Ejercicio21 {

    public static boolean validarEmail(String email) {

        if (email.contains("@") && email.contains(".")) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un email: ");
        String email = scanner.nextLine();

        try {

            if (!validarEmail(email)) {
                throw new IllegalArgumentException("El email no es válido.");
            }

            System.out.println("Email válido.");

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());

        } finally {

            scanner.close();

        }

    }

}
