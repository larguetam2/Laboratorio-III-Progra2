package Integracion.Ejercicio69;

public class Ejercicio69 {

    public static void main(String[] args) {

        Carro carro = new Carro();

        carro.conducir();

    }

}

interface Vehiculo {

    void conducir();

}

class Carro implements Vehiculo {

    @Override
    public void conducir() {

        System.out.println("El carro está conduciendo.");

    }

}
