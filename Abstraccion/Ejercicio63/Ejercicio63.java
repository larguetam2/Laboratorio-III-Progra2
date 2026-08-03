package Abstraccion.Ejercicio63;

public class Ejercicio63 {

    public static void main(String[] args) {

        Cuadrado cuadrado = new Cuadrado(5);

        System.out.println("Cuadrado creado correctamente.");

    }

}

abstract class Figura {

    public abstract double area();

}

class Cuadrado extends Figura {

    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return 0;
    }

}
