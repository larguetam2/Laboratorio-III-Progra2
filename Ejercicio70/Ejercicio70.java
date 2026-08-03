package Ejercicio70;

public class Ejercicio70 {

    public static void main(String[] args) {

        Moto moto = new Moto();

        moto.conducir();

    }

}

interface Vehiculo {

    void conducir();

}

class Moto implements Vehiculo {

    @Override
    public void conducir() {

        System.out.println("La moto está conduciendo.");

    }

}
