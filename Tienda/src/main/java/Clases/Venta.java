
package Clases;

import java.util.ArrayList;


public class Venta {
    ArrayList<ItemLista> lista_productos;
    double total;
    int cantidad;

    public Venta(ArrayList<ItemLista> lista, double total, int cantidad) {
        this.lista_productos = lista;
        this.total = total;
        this.cantidad = cantidad;
    }

    public ArrayList<ItemLista> getLista_productos() {
        return lista_productos;
    }

    public void setLista_productos(ArrayList<ItemLista> lista_productos) {
        this.lista_productos = lista_productos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== Venta ===\n");

        if (lista_productos == null || lista_productos.isEmpty()) {
            sb.append("No hay productos en la venta.\n");
        } else {
            sb.append("Productos:\n");
            for (ItemLista item : lista_productos) {
                sb.append(" - ").append(item.toString()).append("\n");
            }
        }

        sb.append("Cantidad total de productos: ").append(cantidad).append("\n");
        sb.append("Total a pagar: S/ ").append(String.format("%.2f", total)).append("\n");

        return sb.toString();
    }
    
}
