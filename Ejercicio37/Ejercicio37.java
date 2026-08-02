package Ejercicio37;

public class Ejercicio37 {

    public static void main(String[] args) {

        Producto producto = new Producto();

        producto.setPrecio(100);

        System.out.println("Precio: " + producto.getPrecio());

    }

}

class Producto {

    private double precio;

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}