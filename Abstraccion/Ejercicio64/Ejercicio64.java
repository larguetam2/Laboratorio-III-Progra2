package Abstraccion.Ejercicio64;

public class Ejercicio64 {

    public static void main(String[] args) {

        Cuadrado cuadrado = new Cuadrado(5);

        System.out.println("Área del cuadrado: " + cuadrado.area());

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

        return lado * lado;

    }

}
