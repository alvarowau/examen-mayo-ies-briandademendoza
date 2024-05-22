package com.alvarowau.Ejercicio1.sesiones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.alvarowau.Ejercicio1.modelos.Producto;
import com.alvarowau.Ejercicio1.modelos.ProductoAlimenticio;

/**
 * La clase RecuperarSesion proporciona un método estático para recuperar la lista de productos desde un archivo de texto.
 */
public class RecuperarSesion {

    /**
     * Recupera la lista de productos guardada en una sesión anterior desde un archivo de texto en el escritorio del usuario.
     * 
     * @return la lista de productos recuperada
     */
    public static ArrayList<Producto> recuperarLista() {
        // Lista para almacenar los productos recuperados
        ArrayList<Producto> productos = new ArrayList<>();
        // Ruta del archivo en el escritorio del usuario
        String rutaArchivo = System.getProperty("user.home") + "/Desktop/sesion_almacen.txt";

        try (BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            // Leer cada línea del archivo
            while ((linea = lector.readLine()) != null) {
                // Dividir la línea en partes usando la coma como separador
                String[] partes = linea.split(",");
                // Verificar el número de campos para determinar el tipo de producto
                if (partes.length == 4) {
                    // Si hay cuatro campos, asumimos que se trata de un Producto
                    int id = Integer.parseInt(partes[0]);
                    String nombre = partes[1];
                    double precio = Double.parseDouble(partes[2]);
                    int stock = Integer.parseInt(partes[3]);
                    // Crear un nuevo Producto y agregarlo a la lista
                    productos.add(new Producto(id, nombre, precio, stock));
                } else if (partes.length == 5) {
                    // Si hay cinco campos, asumimos que se trata de un ProductoAlimenticio
                    int id = Integer.parseInt(partes[0]);
                    String nombre = partes[1];
                    double precio = Double.parseDouble(partes[2]);
                    int stock = Integer.parseInt(partes[3]);
                    String fechaCaducidad = partes[4];
                    // Crear un nuevo ProductoAlimenticio y agregarlo a la lista
                    productos.add(new ProductoAlimenticio(id, nombre, precio, stock, fechaCaducidad));
                }
            }
            System.out.println("Lista de productos recuperada con éxito desde: " + rutaArchivo);
        } catch (IOException e) {
            System.err.println("Error al recuperar la lista de productos: " + e.getMessage());
        }
        return productos;
    }
}
