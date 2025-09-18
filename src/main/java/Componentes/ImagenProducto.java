package Componentes;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

public class ImagenProducto extends StackPane {

    private ImageView imagenProducto;

    public ImagenProducto(String urlImagen){

        getStyleClass().add("imagen-container");

        imagenProducto = new ImageView();
        imagenProducto.setFitWidth(180);
        imagenProducto.setFitHeight(180);
        imagenProducto.setPreserveRatio(true);
        imagenProducto.setSmooth(true);

        try{
            Image img = new Image(urlImagen, true);
            imagenProducto.setImage(img);

        } catch (Exception e){
            Image img = new Image("file:src/main/resources/img/error.jpg", true);
            imagenProducto.setImage(img);
        }

        imagenProducto.getStyleClass().add("imagen-producto");
        getChildren().add(imagenProducto);

    }
}
