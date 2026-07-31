package Ejercicio34;

public class Ejercicio34 {

    public static void main(String[] args) {

        Cuenta cuenta = new Cuenta();

        cuenta.depositar(500);
        cuenta.retirar(600);

        System.out.println("Saldo final: " + cuenta.getSaldo());

    }

}

class Cuenta {

    private double saldo;

    public void depositar(double cantidad) {

        saldo += cantidad;

    }

    public void retirar(double cantidad) {

        if (cantidad > saldo) {

            System.out.println("Error: No se puede dejar el saldo negativo.");
            return;

        }

        saldo -= cantidad;

    }

    public double getSaldo() {

        return saldo;

    }

}
