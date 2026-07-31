package Ejercicio35;

public class Ejercicio35 {

    public static void main(String[] args) {

        Cuenta cuenta = new Cuenta();

        cuenta.depositar(1000);

        cuenta.mostrarSaldo();

    }

}

class Cuenta {

    private double saldo;

    public void depositar(double cantidad) {

        saldo += cantidad;

    }

    public void mostrarSaldo() {

        System.out.println("Saldo actual: " + saldo);

    }

}
