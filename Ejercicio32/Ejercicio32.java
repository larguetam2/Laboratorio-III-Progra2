package Ejercicio32;

public class Ejercicio32 {

    public static void main(String[] args) {

        Cuenta cuenta = new Cuenta();

        cuenta.depositar(500);

        System.out.println("Depósito realizado.");

    }

}

class Cuenta {

    private double saldo;

    public void depositar(double cantidad) {

        saldo += cantidad;

    }

}
