
package Clases;
import java.util.ArrayList;
import java.lang.Comparable;


public class Usuario {
    String nombre;
    boolean admin;
    ArrayList<ItemLista> listaCompra = new ArrayList<>();
    ArrayList<Venta> ventasRealizadas = new ArrayList<>();

    public Usuario(String nombre, boolean admin) {
        this.nombre = nombre;
        this.admin = admin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public ArrayList<ItemLista> getListaCompra() {
        return listaCompra;
    }
    
    public void printListaDeCompra(){
        for (ItemLista item : listaCompra) {
            System.out.println(item);
        }
    }

    public void addItemLista(Producto p, double precioTotal, int cantidad) {
        //String idproducto, String nombre, String marca, double precioIndividual, double precioTotal, int stock, int cantidadAgregada
        ItemLista newItem = new ItemLista(p.getIdproducto(), p.getNombre(), p.getMarca(), p.getPrecio(), precioTotal, p.getStock(), cantidad);
        this.listaCompra.add(newItem);
    }
    
    public ItemLista getItemById(String id){
        for (ItemLista p : listaCompra) {
            if(p.getIdproducto().equalsIgnoreCase(id)){
                return p;
            }
        }
        return null;
    }
    
    public boolean productoEnLista(Producto producto){
        for (ItemLista p : listaCompra) {
            if(p.getIdproducto().equalsIgnoreCase(producto.getIdproducto())){
                return true;
            }
        }
        return false;
    }
    
    public void removerProductoLista(Producto producto){
        for (ItemLista p : listaCompra) {
            if(p.getIdproducto().equalsIgnoreCase(producto.getIdproducto())){
                listaCompra.remove(p);
                return;
            }
        }
    }
    public void removerProductoListaConId(String id){
        for (ItemLista p : listaCompra) {
            if(p.getIdproducto().equalsIgnoreCase(id)){
                listaCompra.remove(p);
                return;
            }
        }
    }
    
    public int getCantidadTotalProductos() {
        int total = 0;
        for (ItemLista item : listaCompra) {
            total += item.getCantidadAgregada();
        }
        return total;
    }

    public double getSubtotalLista() {
        double subtotal = 0.0;
        for (ItemLista item : listaCompra) {
            subtotal += item.getPrecioTotal();
        }
        return subtotal;
    }
    
    public void addVentasRealizadas(Venta venta) {
        this.ventasRealizadas.add(venta);
    }
    
    public void limpiarListaCompra() {
        listaCompra.clear();
    }


}
