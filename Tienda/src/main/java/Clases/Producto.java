package Clases;

public class Producto {
    private String idproducto;
    private String nombre;
    private String imagen;
    private String marca;
    private double precio;
    private int stock;
    private String modelo;
    private String categoria;
    private String dimensiones;
    private String especificaciones;
    private double peso;

    public Producto(String idproducto, String nombre, String imagen, String marca, double precio, int stock, String modelo, String categoria, String dimensiones, String especificaciones, double peso) {
        this.idproducto = idproducto;
        this.nombre = nombre;
        this.imagen = imagen;
        this.marca = marca;
        this.precio = precio;
        this.stock = stock;
        this.modelo = modelo;
        this.categoria = categoria;
        this.dimensiones = dimensiones;
        this.especificaciones = especificaciones;
        this.peso = peso;
    }

    public String getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(String idproducto) {
        this.idproducto = idproducto;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }


    @Override
    public String toString() {
    return "Producto {" +
           "idproducto='" + idproducto + '\'' +
           ", nombre='" + nombre + '\'' +
           ", categoria='" + categoria + '\'' +
           ", marca='" + marca + '\'' +
           ", precio='" + precio + '\'' +
           ", especificaciones='" + especificaciones + '\'' +
           ", dimensiones='" + dimensiones + '\'' +
           ", modelo='" + modelo + '\'' +
           ", peso='" + peso + '\'' +
           ", stock='" + stock + '\'' +
           ", imagen=[URL presente]" +
           '}';
    }
}
