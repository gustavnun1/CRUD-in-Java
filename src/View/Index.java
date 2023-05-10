
package View;

import Controler.Conexao;
import java.util.Properties;
import javax.swing.JOptionPane;


public class Index extends javax.swing.JFrame {

    
    public Index() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btUsuario = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        tfEmail = new javax.swing.JTextField();
        tfSexo = new javax.swing.JTextField();
        tfSenha = new javax.swing.JTextField();
        tfNome = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        lblSexoUsuario = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        btCadastroUsuario = new javax.swing.JButton();
        tfCNPJ = new javax.swing.JTextField();
        tfCEP = new javax.swing.JTextField();
        tfBairro = new javax.swing.JTextField();
        tfRazaoSocial = new javax.swing.JTextField();
        lblCNPJ = new javax.swing.JLabel();
        lblCEP = new javax.swing.JLabel();
        lblRua = new javax.swing.JLabel();
        lblRazao = new javax.swing.JLabel();
        lblBairro = new javax.swing.JLabel();
        tfRua = new javax.swing.JTextField();
        btCadastroForn = new javax.swing.JButton();
        tfProduto = new javax.swing.JTextField();
        tfQtd = new javax.swing.JTextField();
        lblProduto = new javax.swing.JLabel();
        lblQtd = new javax.swing.JLabel();
        btCadastroProduto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Atualizar", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Excluir", jPanel3);

        jPanel1.setLayout(null);

        btUsuario.setText("Usuario");
        btUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(btUsuario);
        btUsuario.setBounds(20, 50, 230, 22);

        jButton2.setText("Fornecedor");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(350, 50, 220, 22);

        jButton3.setText("Produto em Estoque");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(680, 50, 180, 22);

        tfEmail.setEnabled(false);
        jPanel1.add(tfEmail);
        tfEmail.setBounds(20, 230, 220, 22);

        tfSexo.setEnabled(false);
        tfSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSexoActionPerformed(evt);
            }
        });
        jPanel1.add(tfSexo);
        tfSexo.setBounds(20, 430, 40, 22);

        tfSenha.setEnabled(false);
        jPanel1.add(tfSenha);
        tfSenha.setBounds(20, 330, 220, 22);

        tfNome.setEnabled(false);
        jPanel1.add(tfNome);
        tfNome.setBounds(20, 140, 230, 22);

        lblEmail.setText("E-mail");
        lblEmail.setEnabled(false);
        jPanel1.add(lblEmail);
        lblEmail.setBounds(20, 200, 37, 16);

        lblSenha.setText("Senha");
        lblSenha.setEnabled(false);
        jPanel1.add(lblSenha);
        lblSenha.setBounds(20, 300, 37, 16);

        lblSexoUsuario.setText("Sexo (M ou F)");
        lblSexoUsuario.setEnabled(false);
        jPanel1.add(lblSexoUsuario);
        lblSexoUsuario.setBounds(20, 400, 80, 16);

        lblNome.setText("Nome");
        lblNome.setEnabled(false);
        jPanel1.add(lblNome);
        lblNome.setBounds(20, 110, 37, 16);

        btCadastroUsuario.setText("Cadastrar");
        btCadastroUsuario.setEnabled(false);
        btCadastroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastroUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(btCadastroUsuario);
        btCadastroUsuario.setBounds(20, 520, 210, 40);

        tfCNPJ.setEnabled(false);
        jPanel1.add(tfCNPJ);
        tfCNPJ.setBounds(350, 230, 220, 22);

        tfCEP.setEnabled(false);
        jPanel1.add(tfCEP);
        tfCEP.setBounds(350, 310, 220, 22);

        tfBairro.setEnabled(false);
        jPanel1.add(tfBairro);
        tfBairro.setBounds(350, 380, 220, 22);

        tfRazaoSocial.setEnabled(false);
        jPanel1.add(tfRazaoSocial);
        tfRazaoSocial.setBounds(350, 140, 220, 22);

        lblCNPJ.setText("CNPJ");
        lblCNPJ.setEnabled(false);
        jPanel1.add(lblCNPJ);
        lblCNPJ.setBounds(350, 200, 60, 16);

        lblCEP.setText("CEP");
        lblCEP.setEnabled(false);
        jPanel1.add(lblCEP);
        lblCEP.setBounds(350, 290, 21, 16);

        lblRua.setText("Rua");
        lblRua.setEnabled(false);
        jPanel1.add(lblRua);
        lblRua.setBounds(350, 420, 60, 16);

        lblRazao.setText("Razão Social");
        lblRazao.setEnabled(false);
        jPanel1.add(lblRazao);
        lblRazao.setBounds(350, 110, 100, 16);

        lblBairro.setText("Bairro");
        lblBairro.setEnabled(false);
        jPanel1.add(lblBairro);
        lblBairro.setBounds(350, 360, 60, 16);

        tfRua.setEnabled(false);
        jPanel1.add(tfRua);
        tfRua.setBounds(350, 450, 220, 22);

        btCadastroForn.setText("Cadastrar");
        btCadastroForn.setEnabled(false);
        btCadastroForn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastroFornActionPerformed(evt);
            }
        });
        jPanel1.add(btCadastroForn);
        btCadastroForn.setBounds(350, 520, 220, 40);

        tfProduto.setEnabled(false);
        jPanel1.add(tfProduto);
        tfProduto.setBounds(690, 140, 160, 22);

        tfQtd.setEnabled(false);
        jPanel1.add(tfQtd);
        tfQtd.setBounds(690, 230, 160, 22);

        lblProduto.setText("ID Produto");
        lblProduto.setEnabled(false);
        jPanel1.add(lblProduto);
        lblProduto.setBounds(690, 110, 90, 16);

        lblQtd.setText("Quantidade");
        lblQtd.setEnabled(false);
        lblQtd.setInheritsPopupMenu(false);
        jPanel1.add(lblQtd);
        lblQtd.setBounds(690, 200, 80, 16);

        btCadastroProduto.setText("Cadastrar");
        btCadastroProduto.setEnabled(false);
        btCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastroProdutoActionPerformed(evt);
            }
        });
        jPanel1.add(btCadastroProduto);
        btCadastroProduto.setBounds(690, 300, 160, 40);

        jTabbedPane1.addTab("Cadastro", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSexoActionPerformed
        
    }//GEN-LAST:event_tfSexoActionPerformed



    private void btUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUsuarioActionPerformed
        
        lblEmail.setEnabled(true);
        lblSenha.setEnabled(true);
        lblSexoUsuario.setEnabled(true);
        lblNome.setEnabled(true);
        tfEmail.setEnabled(true);
        tfNome.setEnabled(true);
        tfSenha.setEnabled(true);
        tfSexo.setEnabled(true);
        
        btCadastroUsuario.setEnabled(true);
        
        
        
        lblRazao.setEnabled(false);
        lblCNPJ.setEnabled(false);
        lblCEP.setEnabled(false);
        lblRua.setEnabled(false);
        lblBairro.setEnabled(false);
        tfRazaoSocial.setEnabled(false);
        tfCNPJ.setEnabled(false);
        tfCEP.setEnabled(false);
        tfRua.setEnabled(false);
        tfBairro.setEnabled(false);
        
        btCadastroForn.setEnabled(false);

        
        
        
        lblQtd.setEnabled(false);
        lblProduto.setEnabled(false);
        tfProduto.setEnabled(false);
        tfQtd.setEnabled(false);
        
        btCadastroProduto.setEnabled(false);
        
        
        
        
      
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_btUsuarioActionPerformed
     
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        lblEmail.setEnabled(false);
        lblSenha.setEnabled(false);
        lblSexoUsuario.setEnabled(false);
        lblNome.setEnabled(false);
        tfEmail.setEnabled(false);
        tfNome.setEnabled(false);
        tfSenha.setEnabled(false);
        tfSexo.setEnabled(false);
        
        btCadastroUsuario.setEnabled(false);
        
        
        
        lblRazao.setEnabled(true);
        lblCNPJ.setEnabled(true);
        lblCEP.setEnabled(true);
        lblRua.setEnabled(true);
        lblBairro.setEnabled(true);
        tfRazaoSocial.setEnabled(true);
        tfCNPJ.setEnabled(true);
        tfCEP.setEnabled(true);
        tfRua.setEnabled(true);
        tfBairro.setEnabled(true);
        
        btCadastroForn.setEnabled(true);

        
        
        
        lblQtd.setEnabled(false);
        lblProduto.setEnabled(false);
        tfProduto.setEnabled(false);
        tfQtd.setEnabled(false);
        
        btCadastroProduto.setEnabled(false);
        
        
        
          
        
        
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        lblEmail.setEnabled(false);
        lblSenha.setEnabled(false);
        lblSexoUsuario.setEnabled(false);
        lblNome.setEnabled(false);
        tfEmail.setEnabled(false);
        tfNome.setEnabled(false);
        tfSenha.setEnabled(false);
        tfSexo.setEnabled(false);
        
        btCadastroUsuario.setEnabled(false);
        
        
        
        lblRazao.setEnabled(false);
        lblCNPJ.setEnabled(false);
        lblCEP.setEnabled(false);
        lblRua.setEnabled(false);
        lblBairro.setEnabled(false);
        tfRazaoSocial.setEnabled(false);
        tfCNPJ.setEnabled(false);
        tfCEP.setEnabled(false);
        tfRua.setEnabled(false);
        tfBairro.setEnabled(false);
        
        btCadastroForn.setEnabled(false);

        
        
        
        lblQtd.setEnabled(true);
        lblProduto.setEnabled(true);
        tfProduto.setEnabled(true);
        tfQtd.setEnabled(true);
        
        btCadastroProduto.setEnabled(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btCadastroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastroUsuarioActionPerformed
        
        
        String nome = tfNome.getText();
        String senha = tfSenha.getText();
        String email = tfEmail.getText();
        String sexo = tfSexo.getText();
        
        
        
        Conexao conexao = new Conexao();
        conexao.inserirCliente(nome, email, senha, sexo);
        
        JOptionPane.showMessageDialog(this, "Usuário cadastrado com sucesso!");
        tfNome.setText("");
        tfSenha.setText("");
        tfEmail.setText("");
        tfSexo.setText("");
        
    }//GEN-LAST:event_btCadastroUsuarioActionPerformed

    private void btCadastroFornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastroFornActionPerformed
       
        
        String razao = tfRazaoSocial.getText();
        String cnpj = tfCNPJ.getText();
        String cep = tfCEP.getText();
        String rua = tfRua.getText();
        String bairro = tfBairro.getText();
        
        
        Conexao conexao = new Conexao();
        conexao.inserirFornecedor(razao, cnpj, cep, rua, bairro);
        
        JOptionPane.showMessageDialog(this, "Fornecedor cadastrado com sucesso!");
        tfRazaoSocial.setText("");
        tfCNPJ.setText("");
        tfCEP.setText("");
        tfRua.setText("");
        tfBairro.setText("");
        
        
    }//GEN-LAST:event_btCadastroFornActionPerformed

    private void btCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastroProdutoActionPerformed
       
        
        String produto = tfProduto.getText();
        String quantidade = tfQtd.getText(); 
        
        Conexao conexao = new Conexao();
        conexao.inserirProduto(produto, quantidade);
        JOptionPane.showMessageDialog(this, "Produto cadastrado com sucesso!");
        tfProduto.setText("");
        tfQtd.setText("");
        
        
    }//GEN-LAST:event_btCadastroProdutoActionPerformed

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
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastroForn;
    private javax.swing.JButton btCadastroProduto;
    private javax.swing.JButton btCadastroUsuario;
    private javax.swing.JButton btUsuario;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblCNPJ;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblProduto;
    private javax.swing.JLabel lblQtd;
    private javax.swing.JLabel lblRazao;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblSexoUsuario;
    private javax.swing.JTextField tfBairro;
    private javax.swing.JTextField tfCEP;
    private javax.swing.JTextField tfCNPJ;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfProduto;
    private javax.swing.JTextField tfQtd;
    private javax.swing.JTextField tfRazaoSocial;
    private javax.swing.JTextField tfRua;
    private javax.swing.JTextField tfSenha;
    private javax.swing.JTextField tfSexo;
    // End of variables declaration//GEN-END:variables
}
