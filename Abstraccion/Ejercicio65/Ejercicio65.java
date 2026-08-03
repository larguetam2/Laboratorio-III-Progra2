package Abstraccion.Ejercicio65;

public class Ejercicio65 {

    public static void main(String[] args) {

        Circulo circulo = new Circulo(5);

        System.out.println("Círculo creado correctamente.");

    }

}

abstract class Figura {

    public abstract double area();

}

class Circulo extends Figura {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {

        return Math.PI * radio * radio;

    }

}
