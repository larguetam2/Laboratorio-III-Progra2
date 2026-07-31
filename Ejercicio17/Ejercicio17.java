package Ejercicio17;

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Ingrese un texto: ");
            String texto = scanner.nextLine();

            System.out.println("Primer carácter: " + texto.charAt(0));

        } catch (StringIndexOutOfBoundsException e) {

            System.out.println("Error: El texto está vacío.");

        } finally {

            scanner.close();

        }

    }

}
