package Ejercicio13;

public class Ejercicio13 {
    public static void main(String[] args) {
        try {
            throw new IllegalArgumentException("Excepción lanzada manualmente. ");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
