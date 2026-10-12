
package Productos;

public class ProductoPanaderia {

    int id = 0;
    String nombre = "";
    String tipo = "";
    double precio = 0;
    int cantidad = 0;

    @Override
    public String toString() {
        return "ProductoPanaderia [ID=" + id + ", Nombre=" + nombre + ", Tipo=" + tipo + ", Precio=" + precio
                + ", Cantidad="
                + cantidad + "]";
    }

    public ProductoPanaderia() {

    }

    public ProductoPanaderia(int id, String nombre, String tipo, double precio, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public ProductoPanaderia(String tipo) {
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}