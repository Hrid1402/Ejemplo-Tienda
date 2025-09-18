package Componentes;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

import java.io.InputStream;
import java.net.URL;

public class TarjetaProducto extends VBox {

    private ImagenProducto producto;
    private Label nombreProducto;
    private Label precioProducto;
    private Button botonAgregarCarrito;

    public TarjetaProducto(String urlImagen, String nombre, String precio) {
        getStyleClass().add("tarjeta-producto");
        getStyleClass().add("tarjeta");



//        try (InputStream in = new URL(urlImagen).openStream()) {
//            System.out.println("Acceso OK: " + urlImagen);
//        } catch (Exception e) {
//            System.out.println("Error al acceder: " + e.getMessage());
//        }


        producto = new ImagenProducto(urlImagen);

        nombreProducto = new Label(nombre);
        nombreProducto.setWrapText(true);
        nombreProducto.getStyleClass().add("nombre-producto");

        precioProducto = new Label("PEN: " + precio);
        precioProducto.getStyleClass().add("precio-producto");


        botonAgregarCarrito = new Button("Agregar al carrito");
        botonAgregarCarrito.getStyleClass().add("boton-anadir-carrito");


        getChildren().addAll(producto, nombreProducto, precioProducto, botonAgregarCarrito);


    }


}
