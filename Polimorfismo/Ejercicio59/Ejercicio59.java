package Polimorfismo.Ejercicio59;

import java.util.ArrayList;

public class Ejercicio59 {

    public static void main(String[] args) {

        ArrayList<Animal> animales = new ArrayList<>();

        animales.add(new Perro());
        animales.add(new Gato());

        for (Animal animal : animales) {

            animal.sonido();

        }

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
