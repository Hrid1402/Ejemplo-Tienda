
package Clases;
import java.util.ArrayList;
import java.lang.Comparable;


public class Usuario {
    String nombre;
    boolean admin;
    ArrayList<Producto> listaCompra = new ArrayList<>();

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

    public ArrayList<Producto> getListaCompra() {
        return listaCompra;
    }
    
    public void printListaDeCompra(){
        for (Producto producto : listaCompra) {
            System.out.println(producto);
        }
    }

    public void addListaCompra(Producto listaCompra) {
        this.listaCompra.add(listaCompra);
    }
    
    public boolean productoEnCarrito(Producto producto){
        for (Producto p : listaCompra) {
            if(p.equals(producto)){
                    return true;
            }
        }
        return false;
    }
    
    public void removerProductoCarrito(Producto producto){
        for (Producto p : listaCompra) {
            if(p.equals(producto)){
                    listaCompra.remove(p);
            }
        }
    }
}
