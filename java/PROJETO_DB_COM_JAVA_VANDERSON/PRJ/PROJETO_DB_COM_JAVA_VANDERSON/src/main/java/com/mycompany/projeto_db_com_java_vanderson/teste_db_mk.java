/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projeto_db_com_java_vanderson;

/**
 *
 * @author v.silva
 */
public class teste_db_mk extends javax.swing.JFrame {

    /**
     * Creates new form teste_db_mk
     */
    public teste_db_mk() {
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
        jLabel_id = new javax.swing.JLabel();
        jTextField_id = new javax.swing.JTextField();
        jLabel_cpf = new javax.swing.JLabel();
        jTextField_cpf = new javax.swing.JTextField();
        jLabel_nome = new javax.swing.JLabel();
        jTextField_nome = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_id.setText("ID");
        jPanel1.add(jLabel_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));
        jPanel1.add(jTextField_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 90, -1));

        jLabel_cpf.setText("CPF");
        jPanel1.add(jLabel_cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));
        jPanel1.add(jTextField_cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 140, -1));

        jLabel_nome.setText("Nome:");
        jPanel1.add(jLabel_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));
        jPanel1.add(jTextField_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 180, -1));

        jButton1.setText("TESTE DB");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 260, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, -3, 410, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(teste_db_mk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(teste_db_mk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(teste_db_mk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(teste_db_mk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new teste_db_mk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel_cpf;
    private javax.swing.JLabel jLabel_id;
    private javax.swing.JLabel jLabel_nome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField_cpf;
    private javax.swing.JTextField jTextField_id;
    private javax.swing.JTextField jTextField_nome;
    // End of variables declaration//GEN-END:variables
}
