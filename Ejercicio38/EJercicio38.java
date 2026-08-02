package Ejercicio38;

public class EJercicio38 {

    public static void main(String[] args) {

        Producto producto = new Producto();

        producto.setPrecio(-50);

        System.out.println("Precio: " + producto.getPrecio());

    }

}

class Producto {

    private double precio;

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {

        if (precio <= 0) {
            System.out.println("Error: El precio debe ser positivo.");
            return;
        }

        this.precio = precio;
    }

}
