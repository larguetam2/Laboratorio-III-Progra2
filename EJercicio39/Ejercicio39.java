package EJercicio39;

public class Ejercicio39 {

    public static void main(String[] args) {

        Producto producto = new Producto("Perfume", 250);

        producto.mostrarProducto();

    }

}

class Producto {

    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarProducto() {

        System.out.println("Producto: " + nombre);
        System.out.println("Precio: " + precio);

    }

}
