/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.restauranteonline.presentacion;

import co.unicauca.restauranteonline.client.access.Factory;
import co.unicauca.restauranteonline.client.access.IUsuarioAccess;
import co.unicauca.restauranteonline.client.domain.services.UsuarioService;
import static co.unicauca.restauranteonline.client.infra.Messages.successMessage;
import static co.unicauca.restauranteonline.client.infra.Messages.warningMessage;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author SoftwareTeam
 * 
 */
public class GUILogin extends javax.swing.JFrame {

    /**
     * Creates new form GUIALogin
     */
    //  FondoPanel fondo = new FondoPanel();
    public GUILogin() {
        //lblImg = new JLabel(new ImageIcon("Logo_restaurante.png"));
        //pnlLogin.add(lblImg);
        //this.setContentPane(fondo);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpnLogin = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        lblContra = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnIniciarSesion = new javax.swing.JButton();
        lbnIniciarSesion1 = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        btnContinuar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblUsuario.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblUsuario.setText("Usuario: ");

        lblContra.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblContra.setText("Contraseña:");

        txtUsuario.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        btnIniciarSesion.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnIniciarSesion.setText("Iniciar Sesión");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });

        lbnIniciarSesion1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lbnIniciarSesion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo_restaurante .png"))); // NOI18N
        lbnIniciarSesion1.setText("Iniciar Sesión");

        btnContinuar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnContinuar.setText("Continuar como visitante");
        btnContinuar.setActionCommand("");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnLoginLayout = new javax.swing.GroupLayout(jpnLogin);
        jpnLogin.setLayout(jpnLoginLayout);
        jpnLoginLayout.setHorizontalGroup(
            jpnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnLoginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(jpnLoginLayout.createSequentialGroup()
                .addGroup(jpnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnLoginLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(jpnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsuario)
                            .addComponent(lblContra))
                        .addGroup(jpnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnLoginLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpnLoginLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jpnLoginLayout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(btnIniciarSesion))
                    .addGroup(jpnLoginLayout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(lbnIniciarSesion1)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jpnLoginLayout.setVerticalGroup(
            jpnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnLoginLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(lbnIniciarSesion1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addGroup(jpnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jpnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblContra)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(btnIniciarSesion)
                .addGap(18, 18, 18)
                .addComponent(btnContinuar)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(602, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
// TODO add your handling code here:
        //co.unicauca.restauranteonline.client.infra.Security.usuario = new User(txtUsuario.getText(), Password.getText(), "");
        IUsuarioAccess repo = Factory.getInstance().getUsuarioService();
        UsuarioService customerService = new UsuarioService(repo);
        //Aqui vendria el analizar si el usuario existe en el sistema
        try {
            if(txtUsuario.getText().isEmpty() || Password.getText().isEmpty()){
                warningMessage("CAMPOS VACIOS", "Atención");
            }
            boolean login = customerService.autenticarUsuario(txtUsuario.getText(), Password.getText());
            if (login) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        GUIAdmin ins = new GUIAdmin();
                        //ins.setExtendedState(MAXIMIZED_BOTH);
                        ins.setVisible(true);
                        
                        warningMessage("Autenticacion exitosa!","BIENVENIDO");
                    }
                });
                this.dispose();
            } 
//            else {
//                warningMessage("Contraseña incorrecta", "Atención");
//            }
        } catch (Exception ex) {
            System.out.println(ex);
            successMessage(ex.getMessage() + "", "");
        }

    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        // TODO add your handling code here:
        GUIRestaurantesDisponibles rest = new GUIRestaurantesDisponibles();
        rest.setVisible(true);
    }//GEN-LAST:event_btnContinuarActionPerformed

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
            java.util.logging.Logger.getLogger(GUILogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUILogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUILogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUILogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUILogin().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Password;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpnLogin;
    private javax.swing.JLabel lblContra;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lbnIniciarSesion1;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    /*  class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/imagenes/fondo.png")).getImage();
            
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    } intento de colocar una imagen de fondo*/
}
