package frames_swing;

import DB.DB_SIMULATOR;
import Vista.GestionProductos;


public class MainJavaClass {

    public static void main(String[] args) {
        DB_SIMULATOR db = new DB_SIMULATOR();
        //db.printAllProducts();
        
        GestionProductos productWindow = new GestionProductos(db);
        productWindow.setVisible(true);
    }
    
}
