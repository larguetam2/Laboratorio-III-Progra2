package Polimorfismo.Ejercicio58;

import java.util.ArrayList;

public class Ejercicio58 {

    public static void main(String[] args) {

        ArrayList<Animal> animales = new ArrayList<>();

        animales.add(new Perro());
        animales.add(new Gato());

        System.out.println("Lista de animales creada.");

    }

}

class Animal {

    public void sonido() {

        System.out.println("El animal hace un sonido.");

    }

}

class Perro extends Animal {

    @Override
    public void sonido() {

        System.out.println("El perro ladra.");

    }

}

class Gato extends Animal {

    @Override
    public void sonido() {

        System.out.println("El gato maúlla.");

    }

}
