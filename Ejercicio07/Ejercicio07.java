package Ejercicio07;

public class Ejercicio07 {

    public static void validarNumero(int numero) throws Exception {

        if (numero < 0) {
            throw new Exception("Número negativo no permitido.");
        }

        System.out.println("Número válido.");
    }

    public static void main(String[] args) {

        try {

            validarNumero(-8);

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }

}
