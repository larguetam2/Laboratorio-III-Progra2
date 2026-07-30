package Ejercicio05;

public class Ejercicio05 {
    public static void main(String[] args) {
        try {
            //int resultado = 10/0;
            System.out.println(10/0);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir entre cero. ");
        } finally {
            System.out.println("Fin del programa ");
        }
    }
}
