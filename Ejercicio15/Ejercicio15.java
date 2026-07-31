package Ejercicio15;

public class Ejercicio15 {

    public static void main(String[] args) {

        try {

            throw new MiExcepcion("Esta es una excepción personalizada.");

        } catch (MiExcepcion e) {

            System.out.println(e.getMessage());

        }

    }

}
