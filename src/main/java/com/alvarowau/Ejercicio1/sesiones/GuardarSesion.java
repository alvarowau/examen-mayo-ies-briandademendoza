package com.alvarowau.Ejercicio1.sesiones;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.alvarowau.Ejercicio1.modelos.Producto;

/**
 * La clase GuardarSesion proporciona un método estático para guardar la sesión actual del almacén en un archivo de texto.
 */
public class GuardarSesion {

    /**
     * Guarda la sesión actual del almacén en un archivo de texto en el escritorio del usuario.
     * 
     * @param productos la lista de productos del almacén a guardar
     */
    public static void guardarSesion(ArrayList<Producto> productos) {
        // Ruta del archivo en el escritorio del usuario
        String rutaArchivo = System.getProperty("user.home") + "/Desktop/sesion_almacen.txt";

        try (PrintWriter escritor = new PrintWriter(new FileWriter(rutaArchivo))) {
            // Escribir cada producto en el archivo
            for (Producto producto : productos) {
                escritor.println(producto.getId() + "," + producto.getNombre() + "," + producto.getPrecio() + "," + producto.getStock());
            }
            System.out.println("Sesión guardada con éxito en: " + rutaArchivo);
        } catch (IOException e) {
            System.err.println("Error al guardar la sesión del almacén: " + e.getMessage());
        }
    }
}
