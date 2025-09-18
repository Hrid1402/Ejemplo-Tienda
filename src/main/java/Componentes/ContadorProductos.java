package Componentes;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class ContadorProductos extends HBox {

    private Button menos;
    private TextField cantidad;
    private Button mas;

    public ContadorProductos() {


        getStyleClass().add("contenedor-cantidad-prouctos");

        menos = new Button("-");
        menos.getStyleClass().add("menos");

        cantidad = new TextField();
        cantidad.getStyleClass().add("cantidad");

        mas = new Button("+");
        mas.getStyleClass().add("mas");

        getChildren().addAll(menos, cantidad, mas);


    }
}
