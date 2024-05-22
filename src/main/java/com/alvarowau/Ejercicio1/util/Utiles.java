package com.alvarowau.Ejercicio1.util;

import java.util.Scanner;

import com.alvarowau.Ejercicio1.modelos.Producto;
import com.alvarowau.Ejercicio1.modelos.ProductoAlimenticio;

/**
 * La clase Utiles proporciona métodos utilitarios para mostrar menús
 * y crear nuevos productos. Contiene métodos estáticos que pueden ser
 * utilizados sin crear una instancia de la clase.
 */
public class Utiles {

    private static Scanner entrada = new Scanner(System.in);

    /**
     * Muestra el menú principal con opciones para gestionar productos.
     */
    public static void menuPrincipal() {
        System.out.println("Menú Principal:");
        System.out.println("1. Agregar nuevo producto");
        System.out.println("2. Eliminar producto");
        System.out.println("3. Mostrar lista de productos");
        System.out.println("4. Actualizar stock de producto");
        System.out.println("5. Salir del programa");
    }

    /**
     * 
     * Muestra el menú para agregar un nuevo producto.
     */
    public static void menuNuevoProducto() {
        System.out.println("Menú Nuevo Producto:");
        System.out.println("1. Agregar Producto");
        System.out.println("2. Agregar Producto Alimenticio");
        System.out.println("3. Volver atrás");
    }

    /**
     * Crea un nuevo producto solicitando los detalles al usuario.
     * 
     * @return el nuevo producto creado
     */
    public static Producto crearProducto() {
        System.out.println("Ingrese los detalles del producto:");

        System.out.print("ID: ");
        int id = entrada.nextInt();
        entrada.nextLine(); 

        System.out.print("Nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Precio: ");
        double precio = entrada.nextDouble();

        System.out.print("Stock: ");
        int stock = entrada.nextInt();
        entrada.nextLine(); // Consume the newline character
        terminarClase();
        return new Producto(id, nombre, precio, stock);
    }

    public static ProductoAlimenticio crearProductoAlimentario() {
        Producto p = crearProducto();
        System.out.print("Fecha Caducidad: ");
        String fecha = entrada.nextLine();
        terminarClase();
        return new ProductoAlimenticio(
                p.getId(), p.getNombre(), p.getPrecio(),
                p.getStock(), fecha);
    }

    private static void terminarClase(){
        entrada.close();
    }
}
