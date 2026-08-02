package Ejercicio40;

import java.util.ArrayList;

public class Ejercicio40 {

    public static void main(String[] args) {

        ArrayList<Producto> productos = new ArrayList<>();

        productos.add(new Producto("Perfume", 250));
        productos.add(new Producto("Camisa", 150));
        productos.add(new Producto("Zapatos", 300));

        for (Producto producto : productos) {
            producto.mostrarProducto();
        }

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
        System.out.println();

    }

}
