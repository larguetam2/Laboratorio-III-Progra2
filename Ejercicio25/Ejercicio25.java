package Ejercicio25;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio25 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcion = 0;

        try {

            System.out.println("----- MENÚ -----");
            System.out.println("1. Saludar");
            System.out.println("2. Mostrar mensaje");
            System.out.println("3. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("¡Hola ingeee!");
                    break;

                case 2:
                    System.out.println("Este es un mensaje.");
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    throw new IllegalArgumentException(
                            "Opción no válida.");

            }

        } catch (InputMismatchException e) {

            System.out.println("Error: Debe ingresar un número.");

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());

        } finally {

            scanner.close();

        }

    }

}
