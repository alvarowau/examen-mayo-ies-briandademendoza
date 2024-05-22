package com.alvarowau.modelos;

/**
 * La clase ProductoAlimenticio extiende la clase Producto para incluir un campo adicional
 * relacionado con la fecha de caducidad o la cantidad.
 * Proporciona métodos para acceder y modificar este atributo adicional, así como
 * métodos sobreescritos para calcular el hashcode, verificar la igualdad y obtener
 * una representación en cadena del producto alimenticio.
 * 
 */
public class ProductoAlimenticio extends Producto {

    /**
     * Fecha de caducidad o cantidad del producto alimenticio.
     */
    private String fechaCantidad;

    /**
     * Crea una nueva instancia de ProductoAlimenticio con los detalles especificados.
     * 
     * @param id el identificador único del producto
     * @param nombre el nombre del producto
     * @param precio el precio del producto
     * @param stock la cantidad de productos en stock
     * @param fechaCantidad la fecha de caducidad o cantidad del producto
     */
    public ProductoAlimenticio(int id, String nombre, double precio, int stock, String fechaCantidad) {
        super(id, nombre, precio, stock);
        this.fechaCantidad = fechaCantidad;
    }

    /**
     * Obtiene la fecha de caducidad o cantidad del producto alimenticio.
     * 
     * @return la fecha de caducidad o cantidad del producto
     */
    public String getFechaCantidad() {
        return fechaCantidad;
    }

    /**
     * Establece la fecha de caducidad o cantidad del producto alimenticio.
     * 
     * @param fechaCantidad la nueva fecha de caducidad o cantidad del producto
     */
    public void setFechaCantidad(String fechaCantidad) {
        this.fechaCantidad = fechaCantidad;
    }

    /**
     * Calcula el código hash para este producto alimenticio.
     * 
     * @return el código hash calculado
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((fechaCantidad == null) ? 0 : fechaCantidad.hashCode());
        return result;
    }

    /**
     * Compara este producto alimenticio con otro objeto para verificar la igualdad.
     * 
     * @param obj el objeto a comparar
     * @return true si los objetos son iguales, false en caso contrario
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        ProductoAlimenticio other = (ProductoAlimenticio) obj;
        if (fechaCantidad == null) {
            if (other.fechaCantidad != null)
                return false;
        } else if (!fechaCantidad.equals(other.fechaCantidad))
            return false;
        return true;
    }

    /**
     * Devuelve una representación en cadena de este producto alimenticio.
     * 
     * @return una cadena que contiene los detalles del producto alimenticio
     */
    @Override
    public String toString() {
        return super.toString() + " ProductoAlimenticio [fechaCantidad=" + fechaCantidad + "]";
    }
}
