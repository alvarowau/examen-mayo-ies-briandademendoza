package com.alvarowau.Ejercicio1.modelos;

import java.util.Scanner;

import com.alvarowau.Ejercicio1.sesiones.GuardarSesion;
import com.alvarowau.Ejercicio1.util.Utiles;

/**
 * La clase Almacen representa un almacén que gestiona un inventario de
 * productos.
 * Proporciona métodos para agregar, eliminar, mostrar y actualizar productos en
 * el inventario,
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
    public void deleteProducto() {
        inventario.eliminarProducto(buscaProducto());
    }

    /**
     * Busca un producto en el inventario por su identificador.
     * 
     * @return el producto encontrado o null si no se encuentra
     */
    private Producto buscaProducto() {
        mostrarInventario();
        System.out.print("Digite el ID del producto: ");
        return inventario.buscarProductoNombre(entrada.nextInt());
    }

    /**
     * Muestra todos los productos en el inventario.
     */
    public void mostrarInventario() {
        inventario.mostrarProductos();
    }

    /**
     * Actualiza el stock de un producto en el inventario.
     */
    public void ActualizarProducto() {
        inventario.actualizarStock(buscaProducto());
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
     * Guarda la sesión actual del almacén en un archivo de texto en el escritorio.
     */
    public void guardarSesion() {
        GuardarSesion.guardarSesion(inventario.getLista());
    }

    /**
     * Presenta el menú principal y obtiene la selección del usuario.
     * 
     * @return la selección del usuario
     */
    private int selecMenuPrincipal() {
        Utiles.menuPrincipal();
        int numero = 0;
        do {
            System.out.print("Digite su selección: ");
            numero = entrada.nextInt();
        } while (numero < 0);
        return numero;
    }

    /**
     * Inicia la aplicación.
     */
    public void start() {
        int seleccion = selecMenuPrincipal();
        switch (seleccion) {
            case 1:
                selectProducto();
                break;
            case 2:
                deleteProducto();
                break;
            case 3:
                mostrarInventario();
                break;
            case 4:
                ActualizarProducto();
                break;
            case 5:
                cerrarAplicaccion();
                break;
            default:
                start();
                break;
        }
        start();
    }

    /**
     * Presenta el menú de creación de productos y obtiene la selección del usuario.
     * 
     * @return la selección del usuario
     */
    private int menuCreacionProductos() {
        int select = 0;
        do {
            System.out.println("Digite su selección");
            Utiles.menuNuevoProducto();
            select = entrada.nextInt();
        } while (select < 0);
        return select;
    }

    /**
     * Obtiene la selección del usuario en el menú de creación de productos y llama al método correspondiente.
     */
    private void selectProducto() {
        int seleccion = menuCreacionProductos();
        switch (seleccion) {
            case 1:
                crearProducto();
                break;
            case 2:
                crearProductoAlimentario();
                break;
            default:
                System.out.println("Volviendo atrás...");
                start();
                break;
        }
    }

    /**
     * Crea un producto no alimentario y lo agrega al inventario.
     */
    private void crearProducto() {
        addProducto(Utiles.crearProducto());
    }

    /**
     * Crea un producto alimentario y lo agrega al inventario.
     */
    private void crearProductoAlimentario() {
        addProducto(Utiles.crearProductoAlimentario());
    }

}
