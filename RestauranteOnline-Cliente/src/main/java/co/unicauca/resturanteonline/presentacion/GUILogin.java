/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.resturanteonline.presentacion;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import jdk.internal.agent.Agent;

/**
 *
 * @author dania
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
        lblImg = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblContra = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnIniciarSesion = new javax.swing.JButton();
        lbnIniciarSesion1 = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        btnContinuar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblImg.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblImg.setText("[Inser imagen]");

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
                        .addGap(250, 250, 250)
                        .addComponent(lblImg))
                    .addGroup(jpnLoginLayout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(btnIniciarSesion)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnLoginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(jpnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnLoginLayout.createSequentialGroup()
                    .addContainerGap(261, Short.MAX_VALUE)
                    .addComponent(lbnIniciarSesion1)
                    .addGap(246, 246, 246)))
        );
        jpnLoginLayout.setVerticalGroup(
            jpnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblImg)
                .addGap(128, 128, 128)
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
            .addGroup(jpnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpnLoginLayout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(lbnIniciarSesion1)
                    .addContainerGap(482, Short.MAX_VALUE)))
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
                .addContainerGap(743, Short.MAX_VALUE))
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
        String Usuario = "admin";
        String Contraseña = "admin";

        String Pass = new String(Password.getPassword());

        //PROBLEMA, NO AUTENTICA LA CONTRASEÑA
        // if(txtUsuario.getText().equals(Usuario) && Password.equals(Contraseña)){ LINEA ERROR
        if (txtUsuario.getText().equals(Usuario)) {
            //accede

            GUIAdmin admin = new GUIAdmin();
            admin.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectas");
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
    private javax.swing.JLabel lblImg;
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
