package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import CSV.CSV_import;
import Clases.Producto;
import Componentes.CabeceraSinLogIn;
import Componentes.TarjetaProducto;
import Paginas.PaginaDeProductos;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class EjemploTienda extends Application {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
            
    public static void main(String[] args)throws IOException{

        //ArrayList<Producto> productos = CSV_import.cargarProductos();
//        menu(productos);
        launch(args);
    }
    static void menu(ArrayList<Producto> productos) throws IOException {
        int opcion;
        do {
            System.out.println("\n=== MENÚ ===");
            System.out.println("1. Lista simple de productos");
            System.out.println("2. Lista detallada de productos");
            System.out.println("3. Buscar producto por nombre");
            System.out.println("4. Buscar producto por precio");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            try {
                opcion = Integer.parseInt(br.readLine());
            } catch (NumberFormatException e) {
                opcion = -1;
            }

            switch (opcion) {
                case 1 :
                    separador();
                    listaSimple(productos);
                    continuar();
                    break;
                case 2:
                    separador();
                    listaDetallado(productos);
                    continuar();
                    break;
                case 3:
                    separador();
                    buscarProducto(productos);
                    continuar();
                    break;
                case 4:
                    separador();
//                    buscarProductoPrecio(productos);
                    continuar();
                    break;
                case 0:
                    System.out.println("\n==============================");
                    System.out.println("   Gracias por usar el sistema");
                    System.out.println("        ¡Hasta pronto!");
                    System.out.println("==============================\n");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opcion!=0);
        System.exit(0);
    }
    
    static void listaSimple(ArrayList<Producto> productos) {
        System.out.println("\n--- Lista simple ---");
        for (Producto p : productos) {
            System.out.println(p.getNombre());
        }
    }
    
    static void listaDetallado(ArrayList<Producto> productos) {
        System.out.println("\n--- Lista detallada ---");
        for (Producto p : productos) {
            System.out.println(p);
        }
    }
    
    static void buscarProducto(ArrayList<Producto> productos) throws IOException {
        System.out.print("Ingrese el nombre a buscar: ");
        String nombreBuscado = br.readLine().toLowerCase();

        boolean encontrado = false;
        for (Producto p : productos) {
            if (p.getNombre().toLowerCase().contains(nombreBuscado)) {
                System.out.println("Encontrado: " + p);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró ningún producto con ese nombre.");
        }
    }

//    static void buscarProductoPrecio(ArrayList<Producto> productos) throws IOException{
//        System.out.print("Ingrese el precio del producto a buscar: ");
//        double precioBuscado = Double.parseDouble(br.readLine());
//
//        boolean encontrado = false;
//        for (Producto p: productos) {
//            if(p.getPrecio()==precioBuscado) {
//                System.out.println("Producto encontrado: "+p);
//                encontrado = true;
//            }
//        }
//        if(!encontrado){
//            System.out.println("No se encontró ningún producto con ese precio.");
//        }
//    }
    
    static void separador(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
    
    static void continuar()throws IOException{
        System.out.println("\nPresiona 'Enter' para continuar");
        br.readLine();
        
    }   

    @Override
    public void start(Stage stage) throws Exception {

        
        PaginaDeProductos px = new PaginaDeProductos(CSV_import.cargarProductos());
        CabeceraSinLogIn xd = new CabeceraSinLogIn(product_name->{
            px.toSearch(product_name);
        });
        BorderPane root = new BorderPane();

        Scene scene = new Scene(root, 1400, 800);

        root.setTop(xd);
        root.setCenter(px);
        stage.setTitle("Ejemplo Tienda");
        scene.getStylesheets().add(getClass().getResource("/estilos/estilos.css").toExternalForm());

        stage.setScene(scene);
        stage.show();
    }
    
     public void search(){
        System.out.println("Searching...");
    }
}
