package Ejercicio04;

public class Ejercicio04 {
    public static void main(String[] args) {
        
        try {
            int resultado = 10 / 0;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Ocurrio un error porque intentaste dividir entre cero. ");
        }
    }
}
