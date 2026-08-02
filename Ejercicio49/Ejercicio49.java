package Ejercicio49;

public class Ejercicio49 {

    public static void main(String[] args) {

        Empleado empleado = new Empleado("Ronaldo", 3500);

        empleado.mostrarDatos();

    }

}

class Empleado {

    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public void mostrarDatos() {

        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);

    }

}
