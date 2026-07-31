package Ejercicio10;


import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Ingrese una contraseña: ");
            String contraseña = scanner.nextLine();

            if (contraseña.length() < 8) {
                throw new IllegalArgumentException("La contraseña debe tener al menos 8 caracteres.");
            }

            System.out.println("Contraseña válida.");
            } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());

        } finally {
            scanner.close();
        }

        
    }
}
