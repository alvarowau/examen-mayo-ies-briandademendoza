package com.alvarowau.Ejercicio1.sesiones;

import java.util.ArrayList;

import com.alvarowau.Ejercicio1.modelos.Producto;
import com.alvarowau.Ejercicio1.modelos.ProductoAlimenticio;

/**
 * La clase GenerarElementosPrueba proporciona un método estático para generar una lista de productos con detalles diferentes.
 */
public class GenerarElementosPrueba {

    /**
     * Genera una lista de productos con detalles diferentes, incluyendo productos regulares y productos alimenticios.
     * 
     * @return una lista de productos
     */
    public static ArrayList<Producto> generar() {
        ArrayList<Producto> listaProductos = new ArrayList<>();

        // Agregar productos con detalles diferentes
        listaProductos.add(new Producto(1, "Camisa de algodón", 29.99, 50));
        listaProductos.add(new Producto(2, "Pantalones vaqueros", 39.99, 30));
        listaProductos.add(new Producto(3, "Zapatos de cuero", 79.99, 20));
        listaProductos.add(new Producto(4, "Sombrero de paja", 15.50, 15));
        listaProductos.add(new Producto(5, "Bufanda de lana", 12.75, 40));
        listaProductos.add(new Producto(6, "Guantes térmicos", 9.99, 35));
        listaProductos.add(new Producto(7, "Calcetines deportivos", 6.99, 60));
        listaProductos.add(new Producto(8, "Chaqueta impermeable", 59.99, 10));
        listaProductos.add(new ProductoAlimenticio(13, "Manzanas", 3.99, 25, "2024-05-30"));
        listaProductos.add(new ProductoAlimenticio(14, "Pescado", 7.99, 15, "2024-06-10"));
        listaProductos.add(new ProductoAlimenticio(15, "Pollo", 5.99, 10, "2024-06-05"));
        listaProductos.add(new ProductoAlimenticio(16, "Queso", 4.49, 20, "2024-05-25"));
        listaProductos.add(new ProductoAlimenticio(17, "Arroz", 2.99, 40, "2024-07-15"));
        listaProductos.add(new ProductoAlimenticio(18, "Fresas", 4.79, 30, "2024-06-20"));
        listaProductos.add(new ProductoAlimenticio(19, "Carne de res", 9.99, 20, "2024-06-30"));
        listaProductos.add(new ProductoAlimenticio(20, "Lechuga", 1.49, 50, "2024-06-25"));
        listaProductos.add(new ProductoAlimenticio(21, "Yogur griego", 1.29, 35, "2024-07-05"));
        
        return listaProductos;
    }

}
