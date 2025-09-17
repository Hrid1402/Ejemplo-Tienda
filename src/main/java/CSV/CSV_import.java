package CSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
                
                if (campos.length == 11) {
                    String categoria       = campos[0].trim();
                    String dimensiones     = campos[1].trim();
                    String especificaciones= campos[2].trim();
                    String idproducto      = campos[3].trim();
                    String imagen          = campos[4].trim();
                    String marca           = campos[5].trim();
                    String modelo          = campos[6].trim();
                    String nombre          = campos[7].trim();
                    double peso            = Double.parseDouble(campos[8].trim());
                    double precio          = Double.parseDouble(campos[9].trim());
                    int stock              = Integer.parseInt(campos[10].trim());

                    productos.add(new Producto(
                        categoria, dimensiones, especificaciones, idproducto,
                        imagen, marca, modelo, nombre, peso, precio, stock
                    ));
                }
            }
        } catch (IOException e) {
            System.err.println("Error leyendo el CSV: " + e.getMessage());
            e.printStackTrace();
        }

        return productos;
    }
}
