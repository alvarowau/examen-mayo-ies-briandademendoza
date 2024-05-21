package com.alvarowau.modelos;

public class ProductoAlimenticio extends Producto{

    private String fechaCantidad;

    public ProductoAlimenticio(int id, String nombre, double precio, int stock, String fechaCantidad) {
        super(id, nombre, precio, stock);
        this.fechaCantidad = fechaCantidad;
    }

    public String getFechaCantidad() {
        return fechaCantidad;
    }

    public void setFechaCantidad(String fechaCantidad) {
        this.fechaCantidad = fechaCantidad;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((fechaCantidad == null) ? 0 : fechaCantidad.hashCode());
        return result;
    }

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

    @Override
    public String toString() {
        return super.toString() + "ProductoAlimenticio [fechaCantidad=" + fechaCantidad + "]";
    }

    
    

    

}
