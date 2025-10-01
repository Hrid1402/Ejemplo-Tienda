package VistaVendedor;

import Clases.ItemLista;
import Clases.Producto;
import Clases.Usuario;
import Clases.Venta;
import DB.DB_SIMULATOR;
import VistaAdministrador.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NICOLAS
 */
public class ListaProductos extends javax.swing.JPanel {
    private DB_SIMULATOR database;
    private Usuario usuario;
    double precioTotal;

    public ListaProductos() {
        initComponents();
        this.database = DB_SIMULATOR.getInstance();
        this.usuario = database.getUsuario();
        updateTableData(usuario.getListaCompra()); 
        int cantidadProductos = usuario.getCantidadTotalProductos();
        label_cantidad.setText("Cantidad productos: " + cantidadProductos);
        total_label.setText("Precio total: S/" + usuario.getSubtotalLista());
        if(cantidadProductos<1){
            btn_continuar_compra.setEnabled(false);
        }
    }
    


    private void updateTableData(java.util.List<ItemLista> productos) {
        DefaultTableModel model = (DefaultTableModel) ProductsTable.getModel();
        model.setRowCount(0);
        for (ItemLista item : productos) {
            model.addRow(new Object[]{item.getIdproducto(), item.getNombre(), item.getMarca(), item.getCantidadAgregada(), item.getPrecioIndividual(), item.getPrecioTotal()});
        }
    }
    
    
    private void confirmarVenta() {
        double subtotal = usuario.getSubtotalLista();

        
        for (ItemLista item : usuario.getListaCompra()) {
            for (Producto prod : database.getAllProducts()) {
                if (prod.getIdproducto().equalsIgnoreCase(item.getIdproducto())) {
                    int nuevoStock = prod.getStock() - item.getCantidadAgregada();
                    if (nuevoStock < 0) {
                        System.out.println("Stock insuficiente para " + prod.getNombre());
                        return;
                    }
                    prod.setStock(nuevoStock);
                }
            }
        }

        Venta venta = new Venta(new ArrayList<>(usuario.getListaCompra()), subtotal, usuario.getCantidadTotalProductos());
        usuario.addVentasRealizadas(venta);
        usuario.limpiarListaCompra();
        System.out.println("Venta confirmada:");
        System.out.println(venta);
        
        updateTableData(usuario.getListaCompra());
        label_cantidad.setText("Cantidad productos: 0");
        total_label.setText("Precio total: S/ 0.00");
        btn_continuar_compra.setEnabled(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ProductsTable = new javax.swing.JTable();
        btn_quitar_producto = new javax.swing.JButton();
        btn_continuar_compra = new javax.swing.JButton();
        total_label = new javax.swing.JLabel();
        label_cantidad = new javax.swing.JLabel();

        jLabel1.setText("Label Carrito de Compras");

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Lista de productos a comprar:");

        ProductsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Marca", "Cantidad", "Precio unitario", "Total parcial"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(ProductsTable);
        if (ProductsTable.getColumnModel().getColumnCount() > 0) {
            ProductsTable.getColumnModel().getColumn(0).setResizable(false);
            ProductsTable.getColumnModel().getColumn(0).setPreferredWidth(20);
        }

        btn_quitar_producto.setText("Quitar producto");
        btn_quitar_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_quitar_productoActionPerformed(evt);
            }
        });

        btn_continuar_compra.setText("Continuar Compra");
        btn_continuar_compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_continuar_compraActionPerformed(evt);
            }
        });

        total_label.setText("Subtotal: S/");

        label_cantidad.setText("Cantidad productos:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(total_label, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(label_cantidad)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_quitar_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_continuar_compra, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(34, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(label_cantidad))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btn_quitar_producto)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(total_label)
                .addGap(14, 14, 14)
                .addComponent(btn_continuar_compra, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_continuar_compraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_continuar_compraActionPerformed
        
        confirmarVenta();
    }//GEN-LAST:event_btn_continuar_compraActionPerformed

    private void btn_quitar_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_quitar_productoActionPerformed
        int selectedRow = ProductsTable.getSelectedRow();
        if (selectedRow != -1) {
            String idProducto = ProductsTable.getValueAt(selectedRow, 0).toString();

            ItemLista item = usuario.getItemById(idProducto);
            if (item != null) {
                usuario.removerProductoListaConId(item.getIdproducto());
                updateTableData(usuario.getListaCompra());
                int cantidadProductos = usuario.getCantidadTotalProductos();
                label_cantidad.setText("Cantidad productos: " + cantidadProductos);
                total_label.setText("Precio total: S/" + usuario.getSubtotalLista());
                if(cantidadProductos<1){
                    btn_continuar_compra.setEnabled(false);
                }
            }
        }
    }//GEN-LAST:event_btn_quitar_productoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ProductsTable;
    private javax.swing.JButton btn_continuar_compra;
    private javax.swing.JButton btn_quitar_producto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label_cantidad;
    private javax.swing.JLabel total_label;
    // End of variables declaration//GEN-END:variables
}
