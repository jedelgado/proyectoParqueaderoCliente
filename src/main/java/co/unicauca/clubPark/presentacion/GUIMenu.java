package co.unicauca.clubPark.presentacion;

import static co.unicauca.clubPark.presentacion.GUILogin.atrDirParqueadero;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author javier
 */
public class GUIMenu extends javax.swing.JFrame {

    /**
     * Creates new form GUIPaginaPrincipal
     */
    public GUIMenu() {
        initComponents();
        GUILogin iniciar = new GUILogin();
        lbNomPar.setText(iniciar.atrNomParqueadero);
        lbDirPar.setText(iniciar.atrDirParqueadero);
        lbTelPar.setText(iniciar.atrTelParqueadero);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegVehiParque = new javax.swing.JButton();
        btnRegParqueadero = new javax.swing.JButton();
        MenuPrincipal = new javax.swing.JDesktopPane();
        btnCerrarSesion = new javax.swing.JButton();
        lbTelPar = new javax.swing.JLabel();
        lbAd = new javax.swing.JLabel();
        lbNomPar = new javax.swing.JLabel();
        lbDirPar = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnRegVehiculo = new javax.swing.JMenuItem();
        jMnuItemParqueadero = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        btnRegVehiParque.setText("Registrar Vehiculo en el parqueadero");

        btnRegParqueadero.setText("Registar Parqueadero");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Parqueaderos Popayán");
        setBackground(new java.awt.Color(255, 255, 255));

        MenuPrincipal.setBackground(new java.awt.Color(153, 255, 153));

        btnCerrarSesion.setBackground(new java.awt.Color(0, 0, 0));
        btnCerrarSesion.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(153, 153, 255));
        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        lbTelPar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N

        lbAd.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        lbAd.setText("Administrando el parqueadero: ");

        lbNomPar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N

        lbDirPar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N

        MenuPrincipal.setLayer(btnCerrarSesion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        MenuPrincipal.setLayer(lbTelPar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        MenuPrincipal.setLayer(lbAd, javax.swing.JLayeredPane.DEFAULT_LAYER);
        MenuPrincipal.setLayer(lbNomPar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        MenuPrincipal.setLayer(lbDirPar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout MenuPrincipalLayout = new javax.swing.GroupLayout(MenuPrincipal);
        MenuPrincipal.setLayout(MenuPrincipalLayout);
        MenuPrincipalLayout.setHorizontalGroup(
            MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(MenuPrincipalLayout.createSequentialGroup()
                .addContainerGap(168, Short.MAX_VALUE)
                .addGroup(MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuPrincipalLayout.createSequentialGroup()
                        .addComponent(lbAd)
                        .addGap(120, 120, 120)
                        .addGroup(MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbDirPar, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbNomPar, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbTelPar, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuPrincipalLayout.createSequentialGroup()
                        .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))))
        );
        MenuPrincipalLayout.setVerticalGroup(
            MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuPrincipalLayout.createSequentialGroup()
                .addGroup(MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuPrincipalLayout.createSequentialGroup()
                        .addGap(0, 11, Short.MAX_VALUE)
                        .addComponent(lbNomPar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbDirPar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(MenuPrincipalLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(lbAd, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(lbTelPar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        jMenu1.setText("Opciones");

        btnRegVehiculo.setText("Gestionar Vehiculo");
        btnRegVehiculo.setActionCommand("Gestión Vehiculos");
        btnRegVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegVehiculoActionPerformed(evt);
            }
        });
        jMenu1.add(btnRegVehiculo);

        jMnuItemParqueadero.setText("Agregar parqueadero");
        jMnuItemParqueadero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuItemParqueaderoActionPerformed(evt);
            }
        });
        jMenu1.add(jMnuItemParqueadero);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayudas");

        jMenuItem1.setText("Acerca de");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MenuPrincipal)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MenuPrincipal)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegVehiculoActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                GUIBuscarVehiculo vistaBuscar = new GUIBuscarVehiculo();
                vistaBuscar.setVisible(true);
                vistaBuscar.setLocationRelativeTo(null);
            }
        });
    }//GEN-LAST:event_btnRegVehiculoActionPerformed
//Metodo para cerra sesion
    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                GUILogin ini = new GUILogin();
                ini.setVisible(true);
                ini.setLocationRelativeTo(null);
                dispose();
            }
        });
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

     public static void mensajeExito(String mns, String titulo) {
        JOptionPane.showMessageDialog(null, mns, titulo, JOptionPane.DEFAULT_OPTION, new ImageIcon("./src/recursos/exitoso.png"));
    }
    
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        // TODO add your handling code here:
         String str = "Parqueaderos en Popayán Demo \n"
                + "Version 1.0 - Junio 25 de 2020 \n"
                + "Universidad del Cauca";
        mensajeExito(str, "Acerca De");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMnuItemParqueaderoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuItemParqueaderoActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                GUIRegParqueadero reg = new GUIRegParqueadero();
                reg.setVisible(true);
                reg.setLocationRelativeTo(null);
            }
        });
    }//GEN-LAST:event_jMnuItemParqueaderoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane MenuPrincipal;
    private javax.swing.JButton btnCerrarSesion;
    public javax.swing.JButton btnRegParqueadero;
    public javax.swing.JButton btnRegVehiParque;
    private javax.swing.JMenuItem btnRegVehiculo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMnuItemParqueadero;
    private javax.swing.JLabel lbAd;
    private javax.swing.JLabel lbDirPar;
    private javax.swing.JLabel lbNomPar;
    private javax.swing.JLabel lbTelPar;
    // End of variables declaration//GEN-END:variables
}
