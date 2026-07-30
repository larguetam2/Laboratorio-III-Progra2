package Ejercicio06;

import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Ingrese un número positivo: ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                throw new IllegalArgumentException("El número no puede ser negativo.");
            }

            System.out.println("Número válido: " + numero);

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());

        }
    scanner.close();
    
    }

}