package DB;
import Clases.Producto;
import Clases.Usuario;
import java.util.ArrayList;

public class DB_SIMULATOR {
    
    private static DB_SIMULATOR instance;
    private ArrayList<Producto> productos;
    private Usuario usuario = new Usuario("Pablo", false);
    
    private DB_SIMULATOR() {
        System.out.println("setting up");
        productos = CSV_import.cargarProductos();
    }   
    public static DB_SIMULATOR getInstance(){
        if (instance == null) {
            instance = new DB_SIMULATOR();
        }
        return instance;
    }
    
    public void printAllProducts(){
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
    public ArrayList<Producto> getAllProducts(){
        return productos;
    }
    
    public Producto getProductById(String id){
        for (Producto producto : productos) {
            if(producto.getIdproducto().equalsIgnoreCase(id)){
                return producto;
            }
        }
        return null;
    }
    
    public ArrayList<Producto> getProductsByName(String name){
        ArrayList<Producto> productsFound = new ArrayList<>();
        for (Producto producto : productos) {
            if(producto.getNombre().toLowerCase().contains(name.toLowerCase())){
                productsFound.add(producto);
            }
        }
        return productsFound;
    }
    
    public ArrayList<Producto> getProductsByCategory(String name){
        if(name.equalsIgnoreCase("Todo")){
            return productos;
        }
        ArrayList<Producto> productsFound = new ArrayList<>();
        for (Producto producto : productos) {
            if(producto.getCategoria().toLowerCase().contains(name.toLowerCase())){
                productsFound.add(producto);
            }
        }
        return productsFound;
    }

    public Usuario getUsuario() {
        return usuario;
    }
    
    
}
