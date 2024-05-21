package com.alvarowau.modelos;

import java.util.ArrayList;

public class Inventario {

    ArrayList <Producto> lista;

    public Inventario(ArrayList<Producto> lista){
        this.lista = lista;
    }

    public void addProducto(Producto p){
        for (Producto producto : lista) {
            if(producto.equals(p)){
                if(producto.getId() == p.getId()){
                    lista.add(p);
                }else{
                    System.out.println("El id ya existe en la lista");
                }
            }else{
                System.out.println("El producto ya existe");
            }
        }
    }

    public Producto buscarProductoNombre(int id){
        Producto productoEnviar= null;
        for (Producto producto : lista) {
            if(producto.getId() == id){
                productoEnviar = producto;
                break;
            }
        }

        if(productoEnviar != null){
            return productoEnviar;
        }else{
            System.out.println("No se encontro el producto");
            return null;
        }
    }

    public void eliminarProducto(Producto p){
        Producto productoEliminar = null;
        for (Producto producto : lista) {
            if(producto.getId() == p.getId()){
                productoEliminar = p;
                break;
            }
        }
        if(productoEliminar != null){
            lista.remove(productoEliminar);
        }else{
            System.out.println("No existe el producto");
        }
    }

}
