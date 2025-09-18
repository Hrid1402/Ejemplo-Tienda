package Componentes;

import java.util.function.Consumer;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class BarraDeBusqueda extends HBox {

    public TextField busqueda;
    private Button botonBusqueda;

    public BarraDeBusqueda(Consumer<String> onButtonClicked) {
        setSpacing(5);
        setPadding(new Insets(5));
        getStyleClass().add("barra-busqueda");

        busqueda = new TextField();
        busqueda.setPromptText("Buscar componentes, dispositivos...");
        busqueda.getStyleClass().add("textfield");

        botonBusqueda = new Button("🔍");
        botonBusqueda.setOnAction(e -> onButtonClicked.accept(busqueda.getText()));
        botonBusqueda.getStyleClass().add("boton-busqueda");
        
        

        getChildren().addAll(busqueda, botonBusqueda);
    }
}
