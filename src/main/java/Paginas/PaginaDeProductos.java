package Paginas;

import Clases.Producto;
import Componentes.TarjetaProducto;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.FlowPane;

import java.net.MalformedURLException;
import java.util.ArrayList;

public class PaginaDeProductos extends ScrollPane {

    static FlowPane catalogo;
    ArrayList<Producto> productos;


    public PaginaDeProductos(ArrayList<Producto> prod) throws MalformedURLException {
        productos = prod;
        catalogo = new FlowPane();
        catalogo.getStyleClass().add("catalogo");

        getStyleClass().add("scroll-pane");
        setFitToWidth(true);


        for (Producto p : productos) {
            TarjetaProducto tarjeta = new TarjetaProducto(p.getImagen(), p.getNombre(), p.getPrecio());
            catalogo.getChildren().add(tarjeta);
        }
        setContent(catalogo);
    }
    
    public void toSearch(String product_name){
        System.out.println("Searching:" + product_name);
        catalogo.getChildren().clear();
        for (Producto p : productos) {
            if(p.getNombre().toLowerCase().contains(product_name.toLowerCase())){
                TarjetaProducto tarjeta = new TarjetaProducto(p.getImagen(), p.getNombre(), p.getPrecio());
                catalogo.getChildren().add(tarjeta);
            }
            
        }
    }
}
