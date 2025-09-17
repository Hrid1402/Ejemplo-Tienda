package Clases;

public class Producto {
    private String nombre;
    private String imagen;
    private String marca;
    private String precio;
    private String stock;
    private String idproducto;
    private String modelo;
    private String categoria;
    private String dimensiones;
    private String especificaciones;
    private String peso;

    public Producto(String categoria, String dimensiones, String especificaciones, String idproducto, String imagen, String marca, String modelo, String nombre, String peso, String precio, String stock) {
        this.categoria = categoria;
        this.dimensiones = dimensiones;
        this.especificaciones = especificaciones;
        this.idproducto = idproducto;
        this.imagen = imagen;
        this.marca = marca;
        this.modelo = modelo;
        this.nombre = nombre;
        this.peso = peso;
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

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(String idproducto) {
        this.idproducto = idproducto;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public String getEspecificaciones() {
        return especificaciones;
    }

    public void setEspecificaciones(String especificaciones) {
        this.especificaciones = especificaciones;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Producto [nombre=" + nombre + ", imagen=" + imagen + ", marca=" + marca + ", precio=" + precio
                + ", stock=" + stock + ", idproducto=" + idproducto + ", modelo=" + modelo + ", categoria=" + categoria
                + ", dimensiones=" + dimensiones + ", especificaciones=" + especificaciones + ", peso=" + peso + "]";
    }


    
}
