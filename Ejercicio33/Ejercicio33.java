package Ejercicio33;

public class Ejercicio33 {

    public static void main(String[] args) {

        Cuenta cuenta = new Cuenta();

        cuenta.depositar(500);
        cuenta.retirar(200);

        System.out.println("Retiro realizado.");

    }

}

class Cuenta {

    private double saldo;

    public void depositar(double cantidad) {

        saldo += cantidad;

    }

    public void retirar(double cantidad) {

        if (cantidad > saldo) {

            System.out.println("Error: Saldo insuficiente.");
            return;

        }

        saldo -= cantidad;

    }

}
