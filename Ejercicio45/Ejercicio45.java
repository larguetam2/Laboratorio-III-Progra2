package Ejercicio45;

public class Ejercicio45 {

    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante();

        estudiante.setNota1(80);
        estudiante.setNota2(120);
        estudiante.setNota3(90);

        estudiante.mostrarResultado();

    }

}

class Estudiante {

    private double nota1;
    private double nota2;
    private double nota3;

    public void setNota1(double nota1) {

        if (nota1 < 0 || nota1 > 100) {
            System.out.println("Error: La nota debe estar entre 0 y 100.");
            return;
        }

        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {

        if (nota2 < 0 || nota2 > 100) {
            System.out.println("Error: La nota debe estar entre 0 y 100.");
            return;
        }

        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {

        if (nota3 < 0 || nota3 > 100) {
            System.out.println("Error: La nota debe estar entre 0 y 100.");
            return;
        }

        this.nota3 = nota3;
    }

    public double calcularPromedio() {

        return (nota1 + nota2 + nota3) / 3;

    }

    public void mostrarResultado() {

        System.out.println("Promedio: " + calcularPromedio());

    }

}
