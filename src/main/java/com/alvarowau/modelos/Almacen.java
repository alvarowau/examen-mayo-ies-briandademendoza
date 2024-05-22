package com.alvarowau.modelos;

import java.util.Scanner;

/**
 * La clase Almacen representa un almacén que gestiona un inventario de productos.
 * Proporciona métodos para agregar, eliminar, mostrar y actualizar productos en el inventario,
 * así como métodos para cerrar la aplicación y gestionar la sesión.
 */
public class Almacen {

    /**
     * Escáner para la entrada de datos del usuario.
     */
    private Scanner entrada = new Scanner(System.in);

    /**
     * Inventario de productos del almacén.
     */
    private Inventario inventario;

    /**
     * Crea una nueva instancia de Almacen con un inventario especificado.
     * 
     * @param inventario el inventario de productos del almacén
     */
    public Almacen(Inventario inventario) {
        this.inventario = inventario;
    }

    /**
     * Agrega un producto al inventario.
     * 
     * @param p el producto a agregar
     */
    public void addProducto(Producto p) {
        inventario.addProducto(p);
    }

    /**
     * Elimina un producto del inventario.
     * 
     * @param p el producto a eliminar
     */
    public void deleteProducto(Producto p) {
        inventario.eliminarProducto(p);
    }

    /**
     * Muestra todos los productos en el inventario.
     */
    public void mostrarInventario() {
        inventario.mostrarProductos();
    }

    /**
     * Actualiza el stock de un producto en el inventario.
     * 
     * @param p el producto con el nuevo stock
     */
    public void ActualizarProducto(Producto p) {
        inventario.actualizarStock(p);
    }

    /**
     * Cierra la aplicación, guarda la sesión actual y cierra la entrada de datos.
     */
    public void cerrarAplicaccion() {
        entrada.close();
        guardarSesion();
        System.exit(0);
    }

    /**
     * Guarda la sesión actual del almacén.
     */
    public void guardarSesion() {
        // Implementar la lógica para guardar la sesión
    }

    /**
     * Recupera la lista de productos guardada en una sesión anterior.
     */
    public void recuperarLista() {
        // Implementar la lógica para recuperar la lista de productos
    }
}
