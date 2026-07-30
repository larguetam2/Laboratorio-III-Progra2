package Ejercicio08;

public class Ejercicio08 {
    public static void validarNumero(int numero){

    try {

            if (numero < 0) {
                throw new IllegalArgumentException("Número negativo no permitido.");
            }

            System.out.println("Número válido.");

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());    
    }

}
public static void main(String[] args) {

        validarNumero(-10);

    }

}