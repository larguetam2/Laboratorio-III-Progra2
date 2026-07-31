package Ejercicio18;

public class Ejercicio18 {

    public static int dividir(int a, int b) {

        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir entre cero.");
        }

        return a / b;
    }

    public static void main(String[] args) {

        try {

            int resultado = dividir(10, 0);

            System.out.println(resultado);

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());

        }

    }

}
