package com.alvarowau.Ejercicio1.modelos;

import java.util.ArrayList;

import com.alvarowau.Ejercicio1.sesiones.GenerarElementosPrueba;
import com.alvarowau.Ejercicio1.sesiones.RecuperarSesion;

/**
 * La clase Inventario representa una colección de productos y proporciona
 * métodos para agregar, buscar, eliminar, mostrar y actualizar el stock de los productos.
 */
public class Inventario {

    /**
     * Lista de productos en el inventario.
     */
    private ArrayList<Producto> lista;

    /**
     * Crea una nueva instancia de Inventario, recuperando la lista de productos desde una sesión anterior
     * o generando una lista de elementos de prueba si la sesión está vacía.
     */
    public Inventario() {
        this.lista = RecuperarSesion.recuperarLista();
        if (lista.isEmpty()) {
            this.lista = GenerarElementosPrueba.generar();
        }
    }

    /**
     * Agrega un producto al inventario si su identificador no existe ya en la lista.
     * 
     * @param p el producto a agregar
     */
    public void addProducto(Producto p) {
        if (!existeID(p)) {
            lista.add(p);
            System.out.println("El producto se añadió");
        } else {
            System.out.println("El id del producto ya existe");
        }
    }

    /**
     * Verifica si un producto con el mismo identificador ya existe en la lista.
     * 
     * @param p el producto a verificar
     * @return true si el producto ya existe, false en caso contrario
     */
    private boolean existeID(Producto p) {
        for (Producto producto : lista) {
            if (producto.getId() == p.getId()) {
                return true;
            }
        }
        return false;
    }

    /**
     * Busca un producto en el inventario por su identificador.
     * 
     * @param id el identificador del producto a buscar
     * @return el producto encontrado o null si no se encuentra
     */
    public Producto buscarProductoNombre(int id) {
        for (Producto producto : lista) {
            if (producto.getId() == id) {
                return producto;
            }
        }
        System.out.println("No se encontró el producto");
        return null;
    }

    /**
     * Elimina un producto del inventario si existe.
     * 
     * @param p el producto a eliminar
     */
    public void eliminarProducto(Producto p) {
        if (existeID(p)) {
            lista.remove(p);
            System.out.println("Producto eliminado: " + p.getNombre());
        } else {
            System.out.println("No se puede eliminar, el producto no existe");
        }
    }

    /**
     * Muestra todos los productos en el inventario.
     */
    public void mostrarProductos() {
        for (Producto producto : lista) {
            System.out.println(producto + "\n");
        }
    }

    /**
     * Actualiza el stock de un producto en el inventario.
     * 
     * @param p el producto con el nuevo stock
     */
    public void actualizarStock(Producto p) {
        for (Producto producto : lista) {
            if (producto.getId() == p.getId()) {
                producto.setStock(p.getStock());
                break;
            }
        }
    }

    /**
     * Obtiene la lista de productos en el inventario.
     * 
     * @return la lista de productos
     */
    public ArrayList<Producto> getLista() {
        return lista;
    }

    /**
     * Establece la lista de productos en el inventario.
     * 
     * @param lista la nueva lista de productos
     */
    public void setLista(ArrayList<Producto> lista) {
        this.lista = lista;
    }   
}
