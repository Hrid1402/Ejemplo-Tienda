package CSV;

import java.io.*;
import java.util.ArrayList;
import Clases.Producto;

public class CSV_import {

    public static ArrayList<Producto> cargarProductos() {
        ArrayList<Producto> productos = new ArrayList<>();

        String ruta = "src/main/java/CSV/productos.csv";
        System.out.println("Importando contenido del CSV: " + ruta);
        System.out.println("Working dir: " + System.getProperty("user.dir"));

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea = br.readLine();
            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split(",");
                if (campos.length == 5) {
                    String nombre = campos[0].trim();
                    String imagen = campos[1].trim();
                    String marca  = campos[2].trim();
                    double precio = Double.parseDouble(campos[3].trim());
                    int stock     = Integer.parseInt(campos[4].trim());
                    productos.add(new Producto(nombre, imagen, marca, precio, stock));
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading CSV via src path: " + e.getMessage());
            e.printStackTrace();
        }

        return productos;
    }
}
