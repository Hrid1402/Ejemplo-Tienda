package Componentes;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class TarjetaCarrito extends HBox {

    private CheckBox casillaDeSeleccionado;
    private ImagenProducto imagenProducto;
    private VBox contenedorInformacion;
    private HBox contenedorAuxiliar;
    private Label nombre;
    private Label precio;
    private Label breveDescripcion;
    private HBox contenedorRegalo;
    private CheckBox regalo;
    private Label regaloLabel;
    private HBox opcionesCarrito;
    private ContadorProductos contadorProductos;
    private Button eliminar;
    private Button guardarParaMasTarde;
    private Button compararProductos;
    private Button compartir;

    public TarjetaCarrito(String urlImagen, String nombreProducto, String precioProducto, String BreveDescripcionProducto) {

        //casilla de selección de producto
        casillaDeSeleccionado = new CheckBox();
        casillaDeSeleccionado.getStyleClass().add("casilla-de-seleccionado");


        //llama a la funcion de creación de la imagen del producto
        imagenProducto = new ImagenProducto(urlImagen);

        //Se instancia el contenedor de informacion de los items del carrito
        contenedorInformacion = new VBox();
        contenedorInformacion.getStyleClass().add("contenedor-informacion");

        //Se instancia el HBox que contendrá el noombre y el precio
        contenedorAuxiliar = new HBox();
        contenedorAuxiliar.getStyleClass().add("contenedor-auxiliar");

        //Se instancia nombre y precio
        nombre = new Label(nombreProducto);
        nombre.getStyleClass().add("nombre");
        precio = new Label("PEN: "+precioProducto);
        precio.getStyleClass().add("precio");

        //Se añade los nodos de nombre y precio a contenedor auxiliar
        contenedorAuxiliar.getChildren().addAll(nombre, precio);

        //Se instnacia label que contendra una breve descripción del producto
        breveDescripcion = new Label(BreveDescripcionProducto);
        breveDescripcion.getStyleClass().add("breve-descripcion");

        //Se instancia contenedor que contendrá opción para hacer el producto un regalo
        contenedorRegalo = new HBox();

        //Check box que hace que sea un regalo
        regalo = new CheckBox();
        regalo.getStyleClass().add("regalo");
        regalo.getStyleClass().add("regalo-seleccionado");

        //Label para informar si lo quiero como regalo
        regaloLabel = new Label("Es un regalo");
        regaloLabel.getStyleClass().add("regalo-label");

        //Se añaden los nodos regalo y regaloLabel al contendor de la opcion regalo
        contenedorRegalo.getChildren().addAll(regalo, regaloLabel);

        //Contenedor que contiene la cinta de opciones
        opcionesCarrito = new HBox();

        //Llama al constructor del contador del carrito
        contadorProductos = new ContadorProductos();

        //se inicializa el boton de eliminar
        eliminar = new Button("Eliminar");
        eliminar.getStyleClass().add("opcion-carrito");

        //se inicializa el boton de Guardar para más tarde
        guardarParaMasTarde = new Button("Guardar para ver más tarde");
        guardarParaMasTarde.getStyleClass().add("opcion-carrito");


        //Se inicializa boton de comaprar con articulos
        compararProductos = new Button("Comparar con artículos similares");
        compararProductos.getStyleClass().add("opcion-carrito");

        //Se inicializa el boton de compartir
        compartir = new Button("Compartir");
        compartir.getStyleClass().add("opcion-carrito");

        //Se añade los nodos de la lista de opciones al nodo principal
        opcionesCarrito.getChildren().addAll(contadorProductos, eliminar, guardarParaMasTarde, compararProductos, compartir);


        //Se añade los nodos al contendor derecho
        contenedorInformacion.getChildren().addAll(contenedorAuxiliar, breveDescripcion, contenedorRegalo, opcionesCarrito);

        setHgrow(nombre, Priority.ALWAYS);
        precio.setMaxWidth(Double.MAX_VALUE);


        //Se añade los nodos al contenedor principal
        getChildren().addAll(casillaDeSeleccionado,imagenProducto, contenedorInformacion);


    }



















}
