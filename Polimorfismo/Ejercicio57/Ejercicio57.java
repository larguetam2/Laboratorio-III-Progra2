package Polimorfismo.Ejercicio57;

public class Ejercicio57 {

    public static void main(String[] args) {

        Gato gato = new Gato();

        gato.sonido();

    }

}

class Animal {

    public void sonido() {

        System.out.println("El animal hace un sonido.");

    }

}

class Gato extends Animal {

    @Override
    public void sonido() {

        System.out.println("El gato maúlla.");

    }

}
