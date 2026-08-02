package Ejercicio44;

public class Ejercicio44 {

    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante();

        estudiante.setNota1(80);
        estudiante.setNota2(90);
        estudiante.setNota3(70);

        estudiante.mostrarResultado();

    }

}

class Estudiante {

    private double nota1;
    private double nota2;
    private double nota3;

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double calcularPromedio() {

        return (nota1 + nota2 + nota3) / 3;

    }

    public void mostrarResultado() {

        System.out.println("Promedio: " + calcularPromedio());

    }

}
