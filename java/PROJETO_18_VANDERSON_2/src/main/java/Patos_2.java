
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author v.silva
 */
public class Patos_2 extends javax.swing.JFrame {

    /**
     * Creates new form Patos_2
     */
    public Patos_2() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(300);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(450);
        }

        jButton1.setText("Lista Patos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setText("ID");
        jTextField1.setEnabled(false);

        jTextField3.setText("DESCRIÇÃO DO PATO");

        jTextField2.setText("NOME DO PATO");

        jButton2.setText("atualiza");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("apaga");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("cria");
        jButton4.setActionCommand("");
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(74, 74, 74)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButton4))
                        .addGap(259, 259, 259))))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
//        PreparedStatement stm_lista_produtos_view = null;

        String url = "jdbc:mysql://localhost:3306/patos";
        String usuario = "root";
        String senha = "";
//        String sqlQuery = "SELECT * FROM patos "; 
        String sqlQuery = "SELECT * FROM patos ORDER BY pato_nome ASC"; 
       
       try (Connection banco = DriverManager.getConnection(url, usuario, senha))
        {
            PreparedStatement stm_jTable = banco.prepareStatement(sqlQuery); 
            ResultSet resultado_jTable = stm_jTable.executeQuery();
            DefaultTableModel model =(DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            while(resultado_jTable.next())
            {
                model.addRow(new Object[]
                    {
                        resultado_jTable.getString("pato_ID"),
                        resultado_jTable.getString("pato_nome"),
                        resultado_jTable.getString("pato_descricao"),
                    });
                }
            resultado_jTable.close();
            }
            catch (SQLException ex)
            {
                System.out.println("O erro foi  :  " +ex);
            }        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        // TODO add your handling code here:
        Connection conexao = null;
        PreparedStatement statement = null;
       
        String url = "jdbc:mysql://localhost:3306/db_escola";
        String usuario = "root";
        String senha = "";
        
       try {
            conexao = DriverManager.getConnection(url, usuario, senha);
           
            String sql = "INSERT INTO aluno (cpf, nome) VALUES (?, ?)";
           
            statement = conexao.prepareStatement(sql);
           //statement.setString(1, jTextPane1_ID.getText());
           
            
            //statement.setString(1, jTextPane1_CPF.getText()); // CPF
            //statement.setString(2, jTextPane1_NOME.getText()); // NOME
            //statement.setString(2, jTextPane1_NOME.getText()); // NOME
            if (jCheckBox1.isSelected()){
                statement.setString(1, "1548");//jTextPane1_CPF.getText()); // CPF
            }
            else{
                
                
            }
            statement.setString(2, (String) jComboBox1.getSelectedItem());
            //statement.execute();
           // statement.close();
           
            int linhasAfetadas = statement.executeUpdate();
           
            if (linhasAfetadas > 0) {
                
                label_yes.setVisible(true);
                label_no.setVisible(false);
                System.out.println("Dados inseridos com sucesso!");
                this.PopularJTable("SELECT * FROM aluno ORDER BY id DESC");
                 insert into patos ()   
                
            } else {
                System.out.println("Nenhum dado inserido.");
                label_yes.setVisible(false);
                label_no.setVisible(true);
            }
         } catch (SQLException e) {
            System.out.println("Erro ao inserir dados: " + e.getMessage());
            label_yes.setVisible(false);
                label_no.setVisible(true);
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (conexao != null) {
                    conexao.close();
                }
            } catch (SQLException e) {
                System.out.println("Erro ao fechar conexão: " + e.getMessage());
                label_yes.setVisible(false);
                label_no.setVisible(true);
            }}
       
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        jTextField1.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
        jTextField2.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
        jTextField3.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//      TODO add your handling code here:
        String url = "jdbc:mysql://localhost:3306/patos";
        String usuario = "root";
        String senha = "";
//        String sqlQuery = "SELECT * FROM patos "; 
        Connection conexao = null;
        PreparedStatement statement = null;

       try {
            conexao = DriverManager.getConnection(url, usuario, senha);
           
           String sql = "DELETE from patos where pato_ID = ?";
            statement = conexao.prepareStatement(sql);
            statement.setString(1, jTextField1.getText());
            int linhasAfetadas = statement.executeUpdate();
           
            if (linhasAfetadas > 0) {
                System.out.println("Dados excluidos com sucesso!");
                this.jButton1ActionPerformed(evt);
            } else {
                System.out.println("Nenhum dado excluido.");
            }
         } catch (SQLException e) {
            System.out.println("Erro ao EXCLUIR dados: " + e.getMessage());
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (conexao != null) {
                    conexao.close();
                }
            } catch (SQLException e) {
                System.out.println("Erro ao fechar conexão: " + e.getMessage());
            }}
       
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String url = "jdbc:mysql://localhost:3306/patos";
        String usuario = "root";
        String senha = "";
//        String sqlQuery = "SELECT * FROM patos "; 
        Connection conexao = null;
        PreparedStatement statement = null;

       try {
            conexao = DriverManager.getConnection(url, usuario, senha);

            String sql = "UPDATE patos SET pato_nome = ? , pato_descricao = ? where pato_id= ?";
           
            statement = conexao.prepareStatement(sql);
           //statement.setString(1, jTextPane1_ID.getText());
            statement.setString(1, jTextField2.getText()); // NOME
            statement.setString(2, jTextField3.getText()); // CPF
            statement.setString(3, jTextField1.getText()); // ID
            
            int linhasAfetadas = statement.executeUpdate();
           
            if (linhasAfetadas > 0) {
                System.out.println("Dados atualizados com sucesso!");
                this.jButton1ActionPerformed(evt);
            } else {
                System.out.println("Nenhum dado atualizado.");
            }
         } catch (SQLException e) {
            System.out.println("Erro ao atualizar dados: " + e.getMessage());
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (conexao != null) {
                    conexao.close();
                }
            } catch (SQLException e) {
                System.out.println("Erro ao fechar conexão: " + e.getMessage());
            }}
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Patos_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patos_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patos_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patos_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Patos_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
