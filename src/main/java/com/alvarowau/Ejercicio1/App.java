package com.alvarowau.Ejercicio1;

import com.alvarowau.Ejercicio1.modelos.Almacen;
import com.alvarowau.Ejercicio1.modelos.Inventario;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Almacen almacen = new Almacen(inventario);
        almacen.start();
    }

}
