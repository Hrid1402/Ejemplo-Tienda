package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import CSV.CSV_import;
import Clases.Producto;



public class EjemploTienda {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
            
    public static void main(String[] args)throws IOException{

        ArrayList<Producto> productos = CSV_import.cargarProductos();
        menu(productos);
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
                case 1 -> {
                    separador();
                    listaSimple(productos);
                    continuar();
                }
                case 2 -> {
                    separador();
                    listaDetallado(productos);
                    continuar();
                }
                case 3 -> {
                    separador();
                    buscarProducto(productos);
                    continuar();
                }
                case 4 -> {
                    separador();
                    buscarProductoPrecio(productos);
                    continuar();
                }
                case 0 -> {
                    System.out.println("\n==============================");
                    System.out.println("   Gracias por usar el sistema");
                    System.out.println("        ¡Hasta pronto!");
                    System.out.println("==============================\n");
                }
                default -> System.out.println("Opción no válida");
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

    static void buscarProductoPrecio(ArrayList<Producto> productos) throws IOException{
        try {
            double preciomin = -1, preciomax = -1;
            while(preciomin < 0){
                System.out.print("Ingrese el precio minimo del producto a buscar: ");
                preciomin = Double.parseDouble(br.readLine());
                if(preciomin < 0)
                    System.out.println("Error: El precio mínimo no puede ser negativo.");
            }
            while(preciomax < 0){
                System.out.print("Ingrese el precio máximo del producto a buscar: ");
                preciomax = Double.parseDouble(br.readLine());
                if(preciomax < 0)
                    System.out.println("Error: El precio máximo no puede ser negativo.");
            }
            if (preciomin > preciomax) {
                System.out.println("Error: El precio mínimo no puede ser mayor que el máximo.");
                return;
            }
            
            int encontrado = 0;
            for (Producto p: productos) {
                if(p.getPrecio() <= preciomax && p.getPrecio() >= preciomin) {
                    System.out.println("Producto encontrado: "+p);
                    encontrado++;
                }
            }
            if(encontrado==0){
                System.out.println("No se encontró ningún producto con ese rango de precio.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: El precio debe ser un número.");
        }
    }
    
    static void separador(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
    
    static void continuar()throws IOException{
        System.out.println("\nPresiona 'Enter' para continuar");
        br.readLine();
        
    }
}
