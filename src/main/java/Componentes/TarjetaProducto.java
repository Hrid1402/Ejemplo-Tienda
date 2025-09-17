package Componentes;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

import java.io.InputStream;
import java.net.URL;

public class TarjetaProducto extends VBox {

    private ImageView imagenProducto;
    private Label nombreProducto;
    private Label precioProducto;
    private Button botonAgregarCarrito;

    public TarjetaProducto(String urlImagen, String nombre, String precio) {
        getStyleClass().add("tarjeta-producto");
        getStyleClass().add("tarjeta");

        imagenProducto = new ImageView();
        imagenProducto.setFitWidth(180);
        imagenProducto.setFitHeight(180);
        imagenProducto.setPreserveRatio(true);

        try{
            Image img = new Image(urlImagen, true);
            imagenProducto.setImage(img);

        } catch (Exception e){
            Image img = new Image("file:src/main/resources/img/error.jpg", true);
            imagenProducto.setImage(img);
        }

        imagenProducto.getStyleClass().add("imagen-producto");

//        try (InputStream in = new URL(urlImagen).openStream()) {
//            System.out.println("Acceso OK: " + urlImagen);
//        } catch (Exception e) {
//            System.out.println("Error al acceder: " + e.getMessage());
//        }



        nombreProducto = new Label(nombre);
        nombreProducto.getStyleClass().add("nombre-producto");

        precioProducto = new Label("PEN: " + precio);
        precioProducto.getStyleClass().add("precio-producto");

        botonAgregarCarrito = new Button("Agregar al carrito");
        botonAgregarCarrito.getStyleClass().add("boton-añadir-carrito");


        getChildren().addAll(imagenProducto, nombreProducto, precioProducto, botonAgregarCarrito);
    }


}
