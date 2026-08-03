package Herencia.Ejercicio54;

public class Ejercicio54 {

    public static void main(String[] args) {

        Perro perro = new Perro();

        perro.sonido();

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
