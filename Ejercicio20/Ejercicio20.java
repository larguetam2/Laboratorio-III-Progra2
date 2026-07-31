package Ejercicio20;

public class Ejercicio20 {

    public static void main(String[] args) {

        try {

            throw new Exception("Error controlado.");

        } catch (Exception e) {

            System.out.println("Se produjo un error: " + e.getMessage());

        }

    }

}