/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.unicauca.resturanteonline.presentacion;

/**
 *
 * @author Luis
 */
public class GUIActualizarAlmuerzo extends javax.swing.JFrame {

    /** Creates new form GUIActualizarAlmuerzo */
    public GUIActualizarAlmuerzo() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlActualizar = new javax.swing.JPanel();
        jLabelActualizarAlmuerzo = new javax.swing.JLabel();
        jLabelActEntrada = new javax.swing.JLabel();
        jLabelActProteina = new javax.swing.JLabel();
        jLabelActBebida = new javax.swing.JLabel();
        jLabelActPrincipio = new javax.swing.JLabel();
        cbEntrada = new javax.swing.JComboBox<>();
        cbPrincipio = new javax.swing.JComboBox<>();
        cbProteina = new javax.swing.JComboBox<>();
        cbBebida = new javax.swing.JComboBox<>();
        btnSelecImg = new javax.swing.JButton();
        lblDescripcion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaDesc = new javax.swing.JTextArea();
        btnActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlActualizar.setPreferredSize(new java.awt.Dimension(600, 600));

        jLabelActualizarAlmuerzo.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabelActualizarAlmuerzo.setText("ACTUALIZAR ALMUERZO");

        jLabelActEntrada.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelActEntrada.setText("Entrada:");

        jLabelActProteina.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelActProteina.setText("Proteina:");

        jLabelActBebida.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelActBebida.setText("Bebida:");

        jLabelActPrincipio.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelActPrincipio.setText("Principio:");

        cbEntrada.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbEntrada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sopa de Verduras", "Sopa de Carantanta" }));

        cbPrincipio.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbPrincipio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Frijoles ", "Lentejas" }));

        cbProteina.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbProteina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pollo Frito", "Pollo Sudado" }));
        cbProteina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProteinaActionPerformed(evt);
            }
        });

        cbBebida.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbBebida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Limonada", "Jugo de Tomate" }));
        cbBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBebidaActionPerformed(evt);
            }
        });

        btnSelecImg.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnSelecImg.setText("Seleccionar imagen");

        lblDescripcion.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblDescripcion.setText("Descripción:");

        textAreaDesc.setColumns(20);
        textAreaDesc.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        textAreaDesc.setRows(5);
        textAreaDesc.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(textAreaDesc);

        btnActualizar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnActualizar.setText("Actualizar");

        javax.swing.GroupLayout pnlActualizarLayout = new javax.swing.GroupLayout(pnlActualizar);
        pnlActualizar.setLayout(pnlActualizarLayout);
        pnlActualizarLayout.setHorizontalGroup(
            pnlActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlActualizarLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pnlActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelActBebida)
                    .addComponent(jLabelActProteina)
                    .addComponent(jLabelActEntrada)
                    .addComponent(jLabelActPrincipio))
                .addGap(27, 27, 27)
                .addGroup(pnlActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlActualizarLayout.createSequentialGroup()
                        .addGroup(pnlActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbProteina, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(pnlActualizarLayout.createSequentialGroup()
                        .addComponent(cbEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnSelecImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(pnlActualizarLayout.createSequentialGroup()
                        .addComponent(cbPrincipio, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDescripcion)
                        .addGap(219, 219, 219))))
            .addGroup(pnlActualizarLayout.createSequentialGroup()
                .addGroup(pnlActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlActualizarLayout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabelActualizarAlmuerzo))
                    .addGroup(pnlActualizarLayout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlActualizarLayout.setVerticalGroup(
            pnlActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlActualizarLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabelActualizarAlmuerzo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                .addGroup(pnlActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlActualizarLayout.createSequentialGroup()
                        .addGroup(pnlActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelActEntrada))
                        .addGap(6, 6, 6))
                    .addComponent(btnSelecImg))
                .addGap(12, 12, 12)
                .addGroup(pnlActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPrincipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelActPrincipio)
                    .addComponent(lblDescripcion))
                .addGap(16, 16, 16)
                .addGroup(pnlActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlActualizarLayout.createSequentialGroup()
                        .addGroup(pnlActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelActProteina)
                            .addComponent(cbProteina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelActBebida)
                            .addComponent(cbBebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbProteinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProteinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbProteinaActionPerformed

    private void cbBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBebidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbBebidaActionPerformed

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
            java.util.logging.Logger.getLogger(GUIActualizarAlmuerzo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIActualizarAlmuerzo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIActualizarAlmuerzo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIActualizarAlmuerzo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIActualizarAlmuerzo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnSelecImg;
    private javax.swing.JComboBox<String> cbBebida;
    private javax.swing.JComboBox<String> cbEntrada;
    private javax.swing.JComboBox<String> cbPrincipio;
    private javax.swing.JComboBox<String> cbProteina;
    private javax.swing.JLabel jLabelActBebida;
    private javax.swing.JLabel jLabelActEntrada;
    private javax.swing.JLabel jLabelActPrincipio;
    private javax.swing.JLabel jLabelActProteina;
    private javax.swing.JLabel jLabelActualizarAlmuerzo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JPanel pnlActualizar;
    private javax.swing.JTextArea textAreaDesc;
    // End of variables declaration//GEN-END:variables

}
