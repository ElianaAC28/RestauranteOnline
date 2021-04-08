/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.restauranteonline.presentacion;

import co.unicauca.restauranteonline.client.access.Factory;
import co.unicauca.restauranteonline.client.access.IAlmuerzoAccess;
import co.unicauca.restauranteonline.client.access.IComponentesAccess;
import co.unicauca.restauranteonline.client.domain.services.AlmuerzoService;
import co.unicauca.restauranteonline.client.domain.services.ComponenteService;
import co.unicauca.restauranteonline.commons.domain.Almuerzo;
import co.unicauca.restauranteonline.commons.domain.Componente;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SoftwareTeam
 * 
 */
public class GUIListaComponentes extends javax.swing.JFrame {

    /**
     * Creates new form GUIListaComponentes
     */
    public GUIListaComponentes() throws Exception {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Lista de componentes");
        int restId = 01;
        llenarComboBoxAlm(restId);
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
        lblListar = new javax.swing.JLabel();
        lblRest1 = new javax.swing.JLabel();
        jComboBoxAlm = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListaComp = new javax.swing.JTable();
        btnAtras = new javax.swing.JButton();
        btnListar1 = new javax.swing.JButton();
        lblRest2 = new javax.swing.JLabel();
        jComboBoxComp = new javax.swing.JComboBox<>();

        lblListar.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        lblListar.setText("Lista de Componentes");

        lblRest1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblRest1.setText("Id Almuerzo Ejecutivo");

        jComboBoxAlm.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jComboBoxAlm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "001", "002", "003", "004", "005", " " }));

        tblListaComp.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tblListaComp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblListaComp);

        btnAtras.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnListar1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnListar1.setText("Mostrar Componentes");
        btnListar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListar1ActionPerformed(evt);
            }
        });

        lblRest2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblRest2.setText("Numero de componentes:");

        jComboBoxComp.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jComboBoxComp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "10", "20" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(lblListar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblRest1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxAlm, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblRest2)
                                    .addGap(97, 97, 97)
                                    .addComponent(jComboBoxComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(534, Short.MAX_VALUE)
                    .addComponent(btnListar1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(91, 91, 91)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lblListar)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxAlm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRest1))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRest2)
                    .addComponent(jComboBoxComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(109, 109, 109)
                    .addComponent(btnListar1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(319, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        GUIAdmin admin= new GUIAdmin();
        admin.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnListar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListar1ActionPerformed
        // TODO add your handling code here:
        try {
            llenarTabla();
        } catch (Exception ex) {
            Logger.getLogger(GUIListaComponentes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnListar1ActionPerformed

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
            java.util.logging.Logger.getLogger(GUIListaComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIListaComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIListaComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIListaComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new GUIListaComponentes().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(GUIListaComponentes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnListar1;
    private javax.swing.JComboBox<String> jComboBoxAlm;
    private javax.swing.JComboBox<String> jComboBoxComp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblListar;
    private javax.swing.JLabel lblRest1;
    private javax.swing.JLabel lblRest2;
    private javax.swing.JTable tblListaComp;
    // End of variables declaration//GEN-END:variables

    private void llenarTabla() throws Exception {
        IComponentesAccess service= Factory.getInstance().getComponenteService();
        ComponenteService componenteService= new ComponenteService(service);

        //Componente objComponente = new Componente();
        List<Componente> objListComponentes = new ArrayList<Componente>();

        objListComponentes = componenteService.listComponentesAlmuerzo(jComboBoxAlm.getSelectedItem().toString());

        String matriz[][] = new String[objListComponentes.size()][3];

        for (int i = 0; i < objListComponentes.size(); i++) {
            matriz[i][0] = objListComponentes.get(i).getIdComponente()+"";
            matriz[i][1] = objListComponentes.get(i).getNombreComponente();
            matriz[i][2] = objListComponentes.get(i).getTipoComponente();
        }

        tblListaComp.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                     "ID","Nombre", "Tipo"
                }
        ));
    }

    private void llenarComboBoxAlm(int restId) throws Exception {
        IAlmuerzoAccess service = Factory.getInstance().getAlmuerzoService();
        AlmuerzoService almuerzoService = new AlmuerzoService(service);
        
        jComboBoxAlm.removeAllItems();
        List<Almuerzo> objListAlmuerzos = new ArrayList<Almuerzo>();
        objListAlmuerzos= almuerzoService.listAlmuerzos();
        Integer num = 0;
        
        for(Almuerzo almuerzo:objListAlmuerzos){
            if(restId == Integer.parseInt(almuerzo.getRestId()))
                num++;
        }
        
        for (int i = 1; i <= num; i++)
            jComboBoxAlm.addItem(""+i);
    }
}
