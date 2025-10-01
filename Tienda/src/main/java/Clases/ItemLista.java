
package Clases;


public class ItemLista {
    private String idproducto;
    private String nombre;
    private String marca;
    private double precioIndividual;
    private double precioTotal;
    private int stock;
    private int cantidadAgregada;

    public ItemLista(String idproducto, String nombre, String marca, double precioIndividual, double precioTotal, int stock, int cantidadAgregada) {
        this.idproducto = idproducto;
        this.nombre = nombre;
        this.marca = marca;
        this.precioIndividual = precioIndividual;
        this.precioTotal = precioTotal;
        this.stock = stock;
        this.cantidadAgregada = cantidadAgregada;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecioIndividual() {
        return precioIndividual;
    }

    public void setPrecioIndividual(double precioIndividual) {
        this.precioIndividual = precioIndividual;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getCantidadAgregada() {
        return cantidadAgregada;
    }

    public void setCantidadAgregada(int cantidadAgregada) {
        this.cantidadAgregada = cantidadAgregada;
    }

    @Override
    public String toString() {
        return "ItemLista{" + "idproducto=" + idproducto + ", nombre=" + nombre + ", marca=" + marca + ", precioIndividual=" + precioIndividual + ", precioTotal=" + precioTotal + ", stock=" + stock + ", cantidadAgregada=" + cantidadAgregada + '}';
    }
    
}
