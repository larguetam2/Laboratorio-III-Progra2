package Ejercicio60;

public class Ejercicio60 {

    public static void main(String[] args) {

        Animal animal1 = new Perro();
        Animal animal2 = new Gato();

        animal1.sonido();
        animal2.sonido();

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
