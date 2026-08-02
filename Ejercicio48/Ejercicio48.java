package Ejercicio48;

public class Ejercicio48 {

    public static void main(String[] args) {

        Empleado empleado = new Empleado();

        empleado.setSalario(-2000);

        System.out.println("Salario: " + empleado.getSalario());

    }

}

class Empleado {

    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {

        if (salario <= 0) {
            System.out.println("Error: El salario debe ser positivo.");
            return;
        }

        this.salario = salario;
    }

}
