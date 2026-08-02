package Ejercicio42;

public class Ejercicio42 {

    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante();

        estudiante.setNota1(80);
        estudiante.setNota2(90);

        System.out.println("Notas registradas.");

    }

}

class Estudiante {

    private double nota1;
    private double nota2;

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

}