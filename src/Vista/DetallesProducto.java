
package Vista;

import Clases.Producto;
import javax.swing.JFrame;



import java.awt.Image;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder; 
import java.awt.Insets; 


public class DetallesProducto extends javax.swing.JFrame {

    
    private javax.swing.JFrame GestionProductos;
    private Producto selected_producto;
    
    
    public DetallesProducto(JFrame padre, Producto producto) {
        initComponents();
        this.GestionProductos = padre;
        this.selected_producto = producto;
        setUpInformation();
    }

    private void setUpInformation(){
        System.out.println("Loaded!!!");
        System.out.println(selected_producto);
        product_name.setText(selected_producto.getNombre());
        product_price.setText("PEN: " + selected_producto.getPrecio());
        product_marca.setText("Marca: " + selected_producto.getMarca());
        product_size.setText("Dimensiones: " + selected_producto.getDimensiones());
        product_especificaciones.setText(selected_producto.getEspecificaciones());
        
        //renderImage:
        try {
            
            int margin = 15;

            ImageRenderer.setBorder(new EmptyBorder(margin, margin, margin, margin));

            ImageRenderer.setHorizontalAlignment(SwingConstants.CENTER);
            ImageRenderer.setVerticalAlignment(SwingConstants.CENTER);

            URL url = new URL(selected_producto.getImagen());


            BufferedImage originalImage = ImageIO.read(url);


            int containerWidth = ImageRenderer.getWidth();
            int containerHeight = ImageRenderer.getHeight();

            Insets insets = ImageRenderer.getInsets();
            int availableWidth = containerWidth - insets.left - insets.right;
            int availableHeight = containerHeight - insets.top - insets.bottom;

            int originalWidth = originalImage.getWidth();
            int originalHeight = originalImage.getHeight();


            int newWidth = originalWidth;
            int newHeight = originalHeight;

            if ((double) originalWidth / originalHeight > (double) availableWidth / availableHeight) {
                newWidth = availableWidth;
                newHeight = (newWidth * originalHeight) / originalWidth;
            } else {
                newHeight = availableHeight;
                newWidth = (newHeight * originalWidth) / originalHeight;
            }


            Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

            ImageRenderer.setIcon(new ImageIcon(scaledImage));

        } catch (Exception e) {
            e.printStackTrace();
            ImageRenderer.setText("Error al cargar imagen");
        }
    }
   
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        product_price = new javax.swing.JLabel();
        product_name = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        product_size = new javax.swing.JLabel();
        product_marca = new javax.swing.JLabel();
        product_especificaciones = new javax.swing.JLabel();
        returnButton = new javax.swing.JButton();
        ImageRenderer = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        product_price.setText("PEN:");

        product_name.setText("Name");

        addButton.setText("Agregar");

        product_size.setText("Dimensiones:");

        product_marca.setText("Marca:");

        product_especificaciones.setText("Especificaciones (content)");

        returnButton.setText("Volver");
        returnButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnButtonMouseClicked(evt);
            }
        });
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        ImageRenderer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setText("Especificaciones:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(returnButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(ImageRenderer, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addButton)
                    .addComponent(product_name)
                    .addComponent(product_price)
                    .addComponent(product_marca)
                    .addComponent(product_size)
                    .addComponent(product_especificaciones)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImageRenderer, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(product_name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(product_size)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(product_price)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(product_marca)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(product_especificaciones)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(addButton)
                .addGap(107, 107, 107))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        GestionProductos.setVisible(true);
        this.dispose();     
    }//GEN-LAST:event_returnButtonActionPerformed

    private void returnButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_returnButtonMouseClicked

   
        
        
    public static void main(String args[]) {
        
        
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new DetallesProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImageRenderer;
    private javax.swing.JButton addButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel product_especificaciones;
    private javax.swing.JLabel product_marca;
    private javax.swing.JLabel product_name;
    private javax.swing.JLabel product_price;
    private javax.swing.JLabel product_size;
    private javax.swing.JButton returnButton;
    // End of variables declaration//GEN-END:variables
}
