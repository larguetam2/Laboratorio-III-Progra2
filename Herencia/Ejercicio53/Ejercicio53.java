package Herencia.Ejercicio53;

public class Ejercicio53 {

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

}
