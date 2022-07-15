
package pacote1;

import javax.swing.JOptionPane;
import pacote2.Parametros;
import pacote3.DadosProdutos;

public class TelaAlteracaoDescricaoProduto extends javax.swing.JFrame {

    private SistemaGerenciador telaPrincipalSistema;
    private int codigo;
    private String descricao;
    
    
    public void Inicializacao(SistemaGerenciador telaPrincipal,String descricaoAtual,int codigoProduto){
        this.telaPrincipalSistema = telaPrincipal;
        this.codigo = codigoProduto;
        this.descricao = descricaoAtual;
        campo_descricaoAtualProduto.setText(descricao);
    }
    
    public TelaAlteracaoDescricaoProduto() {
        initComponents();
        setLocationRelativeTo(null);
        campo_descricaoAtualProduto.setEnabled(false); 
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campo_novaDescricaoProduto = new javax.swing.JTextField();
        btn_voltarTelaPrincipal = new javax.swing.JButton();
        btn_limparCampos = new javax.swing.JButton();
        btn_gravarAlteracaoDescricao = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        campo_descricaoAtualProduto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 204, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Alteração de Descrição Produto");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        jLabel1.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setText(" NOVA DESCRIÇÃO PRODUTO: ");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));

        campo_novaDescricaoProduto.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        campo_novaDescricaoProduto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campo_novaDescricaoProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_voltarTelaPrincipal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_voltarTelaPrincipal.setText("Voltar");
        btn_voltarTelaPrincipal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_voltarTelaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarTelaPrincipalActionPerformed(evt);
            }
        });

        btn_limparCampos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_limparCampos.setForeground(new java.awt.Color(153, 0, 0));
        btn_limparCampos.setText("Limpar");
        btn_limparCampos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_limparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparCamposActionPerformed(evt);
            }
        });

        btn_gravarAlteracaoDescricao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_gravarAlteracaoDescricao.setText("Alterar");
        btn_gravarAlteracaoDescricao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_gravarAlteracaoDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gravarAlteracaoDescricaoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel3.setText(" DESCRIÇÃO ATUAL: ");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));

        campo_descricaoAtualProduto.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        campo_descricaoAtualProduto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campo_descricaoAtualProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        campo_descricaoAtualProduto.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        campo_descricaoAtualProduto.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(btn_voltarTelaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campo_novaDescricaoProduto)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 45, Short.MAX_VALUE)
                                .addComponent(btn_limparCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(btn_gravarAlteracaoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_descricaoAtualProduto)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campo_descricaoAtualProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campo_novaDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_voltarTelaPrincipal)
                    .addComponent(btn_limparCampos)
                    .addComponent(btn_gravarAlteracaoDescricao))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_voltarTelaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarTelaPrincipalActionPerformed
        setVisible(false);
        telaPrincipalSistema.setVisible(true);
    }//GEN-LAST:event_btn_voltarTelaPrincipalActionPerformed

    private void btn_limparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparCamposActionPerformed
        campo_novaDescricaoProduto.setText("");
    }//GEN-LAST:event_btn_limparCamposActionPerformed

    private void btn_gravarAlteracaoDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gravarAlteracaoDescricaoActionPerformed
        String descricaoAtualizada = campo_novaDescricaoProduto.getText();
        Parametros alteracaoProduto = new Parametros();
        int codigoProdutoEncontrado;
        DadosProdutos produtoPesquisado ;
        produtoPesquisado =  alteracaoProduto.PesquisarProdutoPorCodigo(codigo);
        codigoProdutoEncontrado = produtoPesquisado.getCodigoProduto();
        if(codigo != codigoProdutoEncontrado){
            JOptionPane.showMessageDialog(null,"Não existe nenhum produto com o código informado!","Aviso",JOptionPane.WARNING_MESSAGE);
        }else{
            alteracaoProduto.AlterarDescricaoProduto(descricaoAtualizada, codigo);
            campo_novaDescricaoProduto.setText("");
        }
    }//GEN-LAST:event_btn_gravarAlteracaoDescricaoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAlteracaoDescricaoProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAlteracaoDescricaoProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAlteracaoDescricaoProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAlteracaoDescricaoProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAlteracaoDescricaoProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_gravarAlteracaoDescricao;
    private javax.swing.JButton btn_limparCampos;
    private javax.swing.JButton btn_voltarTelaPrincipal;
    private javax.swing.JTextField campo_descricaoAtualProduto;
    private javax.swing.JTextField campo_novaDescricaoProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
