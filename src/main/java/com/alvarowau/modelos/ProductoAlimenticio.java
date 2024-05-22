package com.alvarowau.modelos;

/**
 * La clase ProductoAlimenticio extiende la clase Producto para incluir un campo adicional
 * relacionado con la fecha de caducidad.
 * Proporciona métodos para acceder y modificar este atributo adicional, así como
 * métodos sobreescritos para calcular el hashcode, verificar la igualdad y obtener
 * una representación en cadena del producto alimenticio.
 * 
 */
public class ProductoAlimenticio extends Producto {

    /**
     * Fecha de caducidad del producto alimenticio.
     */
    private String fechaCaducidad;

    /**
     * Crea una nueva instancia de ProductoAlimenticio con los detalles especificados.
     * 
     * @param id el identificador único del producto
     * @param nombre el nombre del producto
     * @param precio el precio del producto
     * @param stock la cantidad de productos en stock
     * @param fechaCaducidad la fecha de caducidad del producto
     */
    public ProductoAlimenticio(int id, String nombre, double precio, int stock, String fechaCaducidad) {
        super(id, nombre, precio, stock);
        this.fechaCaducidad = fechaCaducidad;
    }

    /**
     * Obtiene la fecha de caducidad del producto alimenticio.
     * 
     * @return la fecha de caducidad del producto
     */
    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    /**
     * Establece la fecha de caducidad del producto alimenticio.
     * 
     * @param fechaCaducidad la nueva fecha de caducidad del producto
     */
    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
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
        result = prime * result + ((fechaCaducidad == null) ? 0 : fechaCaducidad.hashCode());
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
        if (fechaCaducidad == null) {
            if (other.fechaCaducidad != null)
                return false;
        } else if (!fechaCaducidad.equals(other.fechaCaducidad))
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
        return super.toString() + " ProductoAlimenticio [fechaCaducidad=" + fechaCaducidad + "]";
    }
}
