package Integracion.Ejercicio66;

import java.util.ArrayList;

public class Ejercicio66 {

    public static void main(String[] args) {

        ArrayList<Figura> figuras = new ArrayList<>();

        figuras.add(new Cuadrado(5));
        figuras.add(new Circulo(3));

        System.out.println("Figuras agregadas correctamente.");

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
