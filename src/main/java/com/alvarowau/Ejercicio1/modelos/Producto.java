package com.alvarowau.Ejercicio1.modelos;

/**
 * La clase Producto representa un producto con un identificador, nombre, precio y cantidad en stock.
 * Proporciona métodos para acceder y modificar estos atributos, así como métodos 
 * para calcular el hashcode, verificar la igualdad y obtener una representación en cadena del producto.
 * 
 */
public class Producto {

    /**
     * Identificador único del producto.
     */
    private int id;
    
    /**
     * Nombre del producto.
     */
    private String nombre;
    
    /**
     * Precio del producto.
     */
    private double precio;
    
    /**
     * Cantidad de productos en stock.
     */
    private int stock;

    /**
     * Crea una nueva instancia de Producto con los detalles especificados.
     * 
     * @param id el identificador único del producto
     * @param nombre el nombre del producto
     * @param precio el precio del producto
     * @param stock la cantidad de productos en stock
     */
    public Producto(int id, String nombre, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    /**
     * Obtiene el identificador del producto.
     * 
     * @return el identificador del producto
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador del producto.
     * 
     * @param id el nuevo identificador del producto
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del producto.
     * 
     * @return el nombre del producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del producto.
     * 
     * @param nombre el nuevo nombre del producto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el precio del producto.
     * 
     * @return el precio del producto
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del producto.
     * 
     * @param precio el nuevo precio del producto
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Obtiene la cantidad de productos en stock.
     * 
     * @return la cantidad de productos en stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * Establece la cantidad de productos en stock.
     * 
     * @param stock la nueva cantidad de productos en stock
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * Calcula el código hash para este producto.
     * 
     * @return el código hash calculado
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        long temp;
        temp = Double.doubleToLongBits(precio);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + stock;
        return result;
    }

    /**
     * Compara este producto con otro objeto para verificar la igualdad.
     * 
     * @param obj el objeto a comparar
     * @return true si los objetos son iguales, false en caso contrario
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Producto other = (Producto) obj;
        if (id != other.id)
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (Double.doubleToLongBits(precio) != Double.doubleToLongBits(other.precio))
            return false;
        if (stock != other.stock)
            return false;
        return true;
    }

    /**
     * Devuelve una representación en cadena de este producto.
     * 
     * @return una cadena que contiene los detalles del producto
     */
    @Override
    public String toString() {
        return "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + "]";
    }
}
