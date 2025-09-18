package Componentes;

import java.util.function.Consumer;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public class CabeceraSinLogIn extends HBox {

    private ImageView logo;
    private Button nombreTienda;

    private HBox categorias;
    private Button categoria1;
    private Button categoria2;
    private Button categoria3;

    private BarraDeBusqueda busqueda;

    private HBox usuario;
    private Button iniciarSesion;
    private Button registrate;

    public CabeceraSinLogIn(Consumer<String> onButtonClicked) {
        // Logo
        logo = new ImageView(new Image("file:src/main/resources/img/logo.png")); // usa tu imagen real
        logo.setFitWidth(120);
        logo.setPreserveRatio(true);
        logo.getStyleClass().add("logo");

        nombreTienda = new Button("MiTienda");
        nombreTienda.getStyleClass().add("nombre-tienda");

        // Categorías
        categorias = new HBox(20);
        categorias.getStyleClass().add("categorias");
        
        String[] nombres_categorias = {"Laptops", "Smartphones", "Tablets", "Monitores", "Mouses", "Teclados", "Auriculares"};

        for (String nombre : nombres_categorias) {
            Button categoria = new Button(nombre);
            categoria.getStyleClass().add("categoria");
            categorias.getChildren().add(categoria);
        }

        // Barra de búsqueda
        busqueda = new BarraDeBusqueda(onButtonClicked);
        busqueda.getStyleClass().add("barra-busqueda");

        // Usuario
        usuario = new HBox(10);
        usuario.getStyleClass().add("usuario");
        iniciarSesion = new Button("Inicia sesión");
        registrate = new Button("¡Regístrate!");

        iniciarSesion.getStyleClass().add("iniciar-sesion");
        registrate.getStyleClass().add("registrate");

        usuario.getChildren().addAll(iniciarSesion, registrate);


        getStyleClass().add("cabecera");


        getChildren().addAll(logo, nombreTienda, categorias, busqueda, usuario);
    }
}
