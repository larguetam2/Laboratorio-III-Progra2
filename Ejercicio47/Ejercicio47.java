package Ejercicio47;

public class Ejercicio47 {

    public static void main(String[] args) {

        Empleado empleado = new Empleado();

        empleado.setSalario(3500);

        System.out.println("Salario: " + empleado.getSalario());

    }

}

class Empleado {

    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
