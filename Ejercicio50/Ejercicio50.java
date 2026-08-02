package Ejercicio50;

public class Ejercicio50 {

    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Ferran", 3500);
        Empleado empleado2 = new Empleado("Cucurella", 4000);
        Empleado empleado3 = new Empleado("Luis de la fuente", 3000);

        empleado1.mostrarDatos();
        System.out.println();

        empleado2.mostrarDatos();
        System.out.println();

        empleado3.mostrarDatos();

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
