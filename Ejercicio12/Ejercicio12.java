package Ejercicio12;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Ingrese un número: ");
            int numero = scanner.nextInt();

            int resultado = 10 / numero;

            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error: Nose puede dividir entre cero. ");
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error debe ingresar un número entero. ");
        } finally {
            scanner.close();
        }

    }
}
