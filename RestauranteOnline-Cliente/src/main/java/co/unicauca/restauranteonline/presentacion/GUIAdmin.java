/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.restauranteonline.presentacion;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SoftwareTeam
 * 
 */
public class GUIAdmin extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public GUIAdmin() {
        
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Administrador");
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
        jLabel3 = new javax.swing.JLabel();
        pnlRestDispon = new javax.swing.JPanel();
        pnlCiuRes = new javax.swing.JPanel();
        lblRestDisponibles = new javax.swing.JLabel();
        btnAgregarComp = new javax.swing.JButton();
        btnListarComp = new javax.swing.JButton();
        btnActualizarAlm = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlCiuRes.setPreferredSize(new java.awt.Dimension(600, 530));

        lblRestDisponibles.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        lblRestDisponibles.setText("Modo: Administrador");

        btnAgregarComp.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnAgregarComp.setText("Agregar componentes");
        btnAgregarComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCompActionPerformed(evt);
            }
        });

        btnListarComp.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnListarComp.setText("Listar Componentes");
        btnListarComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarCompActionPerformed(evt);
            }
        });

        btnActualizarAlm.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnActualizarAlm.setText("Actualizar Almuerzo");
        btnActualizarAlm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarAlmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCiuResLayout = new javax.swing.GroupLayout(pnlCiuRes);
        pnlCiuRes.setLayout(pnlCiuResLayout);
        pnlCiuResLayout.setHorizontalGroup(
            pnlCiuResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCiuResLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(pnlCiuResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(pnlCiuResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnAgregarComp, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                        .addComponent(btnListarComp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnActualizarAlm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCiuResLayout.createSequentialGroup()
                .addContainerGap(190, Short.MAX_VALUE)
                .addComponent(lblRestDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        pnlCiuResLayout.setVerticalGroup(
            pnlCiuResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCiuResLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(lblRestDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addComponent(btnAgregarComp, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnListarComp, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnActualizarAlm, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlRestDisponLayout = new javax.swing.GroupLayout(pnlRestDispon);
        pnlRestDispon.setLayout(pnlRestDisponLayout);
        pnlRestDisponLayout.setHorizontalGroup(
            pnlRestDisponLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRestDisponLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlCiuRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlRestDisponLayout.setVerticalGroup(
            pnlRestDisponLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRestDisponLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(pnlCiuRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlRestDispon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlRestDispon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarAlmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarAlmActionPerformed
        // TODO add your handling code here:
         GUIActualizarAlmuerzo update = new GUIActualizarAlmuerzo();
         update.setVisible(true);
         this.dispose();
        
    }//GEN-LAST:event_btnActualizarAlmActionPerformed

    private void btnAgregarCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCompActionPerformed
        // TODO add your handling code here:
        
       GUIAgregarComponente add = new GUIAgregarComponente();
       add.setVisible(true);
       this.dispose();
       
    }//GEN-LAST:event_btnAgregarCompActionPerformed

    private void btnListarCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarCompActionPerformed
        // TODO add your handling code here:
        GUIListaComponentes lista = null;
        try {
            lista = new GUIListaComponentes();
        } catch (Exception ex) {
            Logger.getLogger(GUIAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        lista.setVisible(true);
        this.dispose();
         
    }//GEN-LAST:event_btnListarCompActionPerformed

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
            java.util.logging.Logger.getLogger(GUIAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarAlm;
    private javax.swing.JButton btnAgregarComp;
    private javax.swing.JButton btnListarComp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblRestDisponibles;
    private javax.swing.JPanel pnlCiuRes;
    private javax.swing.JPanel pnlRestDispon;
    // End of variables declaration//GEN-END:variables
}
