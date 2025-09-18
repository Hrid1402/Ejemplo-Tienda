package Paginas;

import Clases.Producto;
import Componentes.TarjetaCarrito;
import Componentes.TarjetaProducto;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.FlowPane;

import java.net.MalformedURLException;
import java.util.ArrayList;

public class PaginaDeProductos extends ScrollPane {

    private FlowPane catalogo;


    public PaginaDeProductos(ArrayList<Producto> productos) throws MalformedURLException {
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


}
