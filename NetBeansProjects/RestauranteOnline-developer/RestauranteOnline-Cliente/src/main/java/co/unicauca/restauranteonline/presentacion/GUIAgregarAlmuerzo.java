package co.unicauca.restauranteonline.presentacion;

import co.unicauca.restauranteonline.client.access.Factory;
import co.unicauca.restauranteonline.client.access.IAlmuerzoAccess;
import co.unicauca.restauranteonline.client.domain.services.ComponenteService;
import static co.unicauca.restauranteonline.client.infra.Messages.successMessage;
import co.unicauca.restauranteonline.commons.domain.Componente;
import java.sql.PreparedStatement;
import co.unicauca.restauranteonline.client.access.IComponentesAccess;
import co.unicauca.restauranteonline.client.domain.services.AlmuerzoService;
import co.unicauca.restauranteonline.commons.domain.Almuerzo;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SoftwareTeam
 *
 */
public class GUIAgregarAlmuerzo extends javax.swing.JFrame {

    /**
     * Creates new form GUAGREGARCOMPONENTE1
     */
    List<Componente> objListComponentes = new ArrayList<Componente>();

    public GUIAgregarAlmuerzo() {
        initComponents();
        setLocationRelativeTo(null); //centrar la ventana
        setTitle("Agregar componente");

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
        lblAgregarCom = new javax.swing.JLabel();
        txtCosto = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();
        lblNombreCom = new javax.swing.JLabel();
        cbxEntrada = new javax.swing.JComboBox<>();
        lblTipoCom = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        btnAgregar1 = new javax.swing.JButton();
        lblTipoCom1 = new javax.swing.JLabel();
        lblTipoCom2 = new javax.swing.JLabel();
        txtIdAlm = new javax.swing.JTextField();
        lblId1 = new javax.swing.JLabel();
        btnAgregar2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        lblTipoCom3 = new javax.swing.JLabel();
        cbxProteina = new javax.swing.JComboBox<>();
        cbxBebida = new javax.swing.JComboBox<>();
        cbxPrincipio = new javax.swing.JComboBox<>();
        btnCargarAlm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblAgregarCom.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lblAgregarCom.setText("AGREGAR ALMUERZO");

        txtCosto.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtCosto.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lblId.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblId.setText("Id Almuerzo");

        lblNombreCom.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblNombreCom.setText("Entrada");

        cbxEntrada.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        cbxEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEntradaActionPerformed(evt);
            }
        });

        lblTipoCom.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblTipoCom.setText("Principio");

        btnAtras.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnAgregar1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnAgregar1.setText("Agregar");
        btnAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar1ActionPerformed(evt);
            }
        });

        lblTipoCom1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblTipoCom1.setText("Proteina");

        lblTipoCom2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblTipoCom2.setText("Bebida");

        txtIdAlm.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtIdAlm.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lblId1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblId1.setText("Costo");

        btnAgregar2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnAgregar2.setText("Seleccionar imagen");
        btnAgregar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar2ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        lblTipoCom3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblTipoCom3.setText("Descripción");

        cbxProteina.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        cbxProteina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxProteinaActionPerformed(evt);
            }
        });

        cbxBebida.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        cbxBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxBebidaActionPerformed(evt);
            }
        });

        cbxPrincipio.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        cbxPrincipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxPrincipioActionPerformed(evt);
            }
        });

        btnCargarAlm.setText("Cargas componentes");
        btnCargarAlm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarAlmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(lblAgregarCom))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblId)
                            .addComponent(lblNombreCom)
                            .addComponent(lblTipoCom)
                            .addComponent(lblTipoCom1)
                            .addComponent(lblTipoCom2)
                            .addComponent(lblId1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCosto)
                            .addComponent(cbxProteina, 0, 213, Short.MAX_VALUE)
                            .addComponent(cbxBebida, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxPrincipio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxEntrada, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtIdAlm))
                        .addGap(90, 90, 90)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregar2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTipoCom3)
                            .addComponent(btnCargarAlm))))
                .addGap(70, 70, 70))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(493, Short.MAX_VALUE)
                    .addComponent(btnAgregar1)
                    .addGap(34, 34, 34)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(lblAgregarCom)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnAgregar2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdAlm, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblId))
                        .addGap(10, 10, 10)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombreCom))
                        .addGap(16, 16, 16))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTipoCom3)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbxPrincipio, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTipoCom)
                                .addGap(29, 29, 29)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxProteina, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTipoCom1)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipoCom2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCargarAlm))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblId1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(btnAtras)
                .addGap(47, 47, 47))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(461, Short.MAX_VALUE)
                    .addComponent(btnAgregar1)
                    .addGap(42, 42, 42)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        GUIAdmin admin = new GUIAdmin();
        admin.setVisible(true);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar1ActionPerformed

        IAlmuerzoAccess service = Factory.getInstance().getAlmuerzoService();

        AlmuerzoService almService = new AlmuerzoService(service);

        Almuerzo objAlm = new Almuerzo();

        //  IComponentesAccess service= Factory.getInstance().getComponenteService();
//        ComponenteService componenteService= new ComponenteService(service);
        Componente componente = new Componente();

        objAlm.setIdAlmuerzo(txtIdAlm.getText());

        objAlm.setEntradaAlm(cbxEntrada.getSelectedItem().toString());
        objAlm.setPrincipioAlm(cbxPrincipio.getSelectedItem().toString());
        objAlm.setProteinaAlm(cbxProteina.getSelectedItem().toString());
        objAlm.setBebidaAlm(cbxBebida.getSelectedItem().toString());
        componente.setIdRestaurante(1);

        objAlm.setCostoAlm(Integer.parseInt(txtCosto.getText()));
        try {
            String response = almService.createAlmuerzo(objAlm);
            successMessage("Almuerzo " + response + " agregado con exito.", "Atención");
            clearCotronls();

        } catch (Exception ex) {
            System.out.println(ex);
            successMessage(ex.getMessage() + "Error", "Atención");
        }


    }//GEN-LAST:event_btnAgregar1ActionPerformed

    private void btnAgregar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregar2ActionPerformed

    private void btnCargarAlmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarAlmActionPerformed
        try {
            // TODO add your handling code here:
            mostrar();
        } catch (Exception ex) {
            Logger.getLogger(GUIAgregarAlmuerzo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCargarAlmActionPerformed

    private void cbxPrincipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxPrincipioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxPrincipioActionPerformed

    private void cbxBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxBebidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxBebidaActionPerformed

    private void cbxProteinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxProteinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxProteinaActionPerformed

    private void cbxEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxEntradaActionPerformed
    private void clearCotronls() {
        txtCosto.setText("");
        txtIdAlm.setText("");
    }

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
            java.util.logging.Logger.getLogger(GUIAgregarAlmuerzo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIAgregarAlmuerzo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIAgregarAlmuerzo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIAgregarAlmuerzo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new GUIAgregarAlmuerzo().setVisible(true);
            }
        });
    }

    public int buscarIdCom(String parItem) {

        for (int i = 0; i < objListComponentes.size(); i++) {
            if (parItem == objListComponentes.get(i).getNombreComponente()) {
                return objListComponentes.get(i).getIdComponente();
            }
        }
        return 0;

    }

    public void mostrar() throws Exception {
        IComponentesAccess service = Factory.getInstance().getComponenteService();
        ComponenteService componenteService = new ComponenteService(service);

        Componente objComponente = new Componente();

        objListComponentes = componenteService.listComponentes();
        /* String sql = "SELECT COMPNOMBRE, COMPTIPO, RESTID\n"
                + "FROM COMPONENTE\n"
                + "WHERE RESTID ="+txtIdRes+";";*/
        cbxEntrada.addItem(" ");
        cbxPrincipio.addItem(" ");
        cbxProteina.addItem(" ");
        cbxBebida.addItem(" ");
        for (int i = 0; i < objListComponentes.size(); i++) {
            
            if ("Entrada".equals(objListComponentes.get(i).getTipoComponente())) {
                String componenteMenu = objListComponentes.get(i).getNombreComponente();
                cbxEntrada.addItem(componenteMenu);

            }
            if ("Principio".equals(objListComponentes.get(i).getTipoComponente())) {
                String componenteMenu = objListComponentes.get(i).getNombreComponente();
                cbxPrincipio.addItem(componenteMenu);
            }
            if ("Proteina".equals(objListComponentes.get(i).getTipoComponente()) || "Proteína".equals(objListComponentes.get(i).getTipoComponente())) {
                String componenteMenu = objListComponentes.get(i).getNombreComponente();
                cbxProteina.addItem(componenteMenu);
            }
            if ("Bebida".equals(objListComponentes.get(i).getTipoComponente())) {
                String componenteMenu = objListComponentes.get(i).getNombreComponente();
                cbxBebida.addItem(componenteMenu);
            }

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar1;
    private javax.swing.JButton btnAgregar2;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCargarAlm;
    private javax.swing.JComboBox<String> cbxBebida;
    private javax.swing.JComboBox<String> cbxEntrada;
    private javax.swing.JComboBox<String> cbxPrincipio;
    private javax.swing.JComboBox<String> cbxProteina;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblAgregarCom;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblId1;
    private javax.swing.JLabel lblNombreCom;
    private javax.swing.JLabel lblTipoCom;
    private javax.swing.JLabel lblTipoCom1;
    private javax.swing.JLabel lblTipoCom2;
    private javax.swing.JLabel lblTipoCom3;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtIdAlm;
    // End of variables declaration//GEN-END:variables
}
