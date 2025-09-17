
package Clases;

public class Producto {
    private String nombre;
    private String imagen;
    private String marca;
    private String precio;
    private int stock;

    public Producto(String nombre, String imagen, String marca, String precio, int stock) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.marca = marca;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPrecio() {
        return precio;
    }
//
//    public void setPrecio(double precio) {
//        this.precio = precio;
//    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", imagen=" + imagen + ", marca=" + marca + ", precio=" + precio + ", stock=" + stock + '}';
    }
    
}
