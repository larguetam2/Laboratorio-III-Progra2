package Ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número: ");
            String texto = scanner.nextLine();

            int numero = Integer.parseInt(texto);

            System.out.println("Número convertido: " + numero);

        } catch (NumberFormatException e) {

            System.out.println("Error: El texto ingresado no es un número válido.");

        }

        scanner.close();
    }
}
    

