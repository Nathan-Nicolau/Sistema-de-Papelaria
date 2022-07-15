
package pacote1;

import javax.swing.JOptionPane;
import jdk.nashorn.internal.runtime.JSType;
import pacote2.Parametros;


public class TelaDeAlteracaoProdutos extends javax.swing.JFrame {

    private int codigoProdutoParaAlteracao;
    private String precoAtualProduto;
    private SistemaGerenciador telaPrincipal;
    
    
    public void Inicializacao(int codigoProduto,String preco,SistemaGerenciador telaSistemaPrincipal){
        this.codigoProdutoParaAlteracao = codigoProduto;
        this.precoAtualProduto = preco;
        this.telaPrincipal = telaSistemaPrincipal;
        campo_precoAtualProduto.setText(preco);
    }
       
    public TelaDeAlteracaoProdutos() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        campo_precoAtualProduto.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campo_novoPrecoProduto = new javax.swing.JTextField();
        bnt_LimparCampo_PrecoProduto = new javax.swing.JButton();
        btn_gravarNovoPrecoProduto = new javax.swing.JButton();
        btn_voltarAlteracaoPreco = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        campo_precoAtualProduto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 204, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Alteração de Preço");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        jLabel1.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setText(" NOVO PREÇO DO PRODUTO: ");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));

        campo_novoPrecoProduto.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        campo_novoPrecoProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bnt_LimparCampo_PrecoProduto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bnt_LimparCampo_PrecoProduto.setForeground(new java.awt.Color(153, 0, 0));
        bnt_LimparCampo_PrecoProduto.setText("Limpar");
        bnt_LimparCampo_PrecoProduto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_gravarNovoPrecoProduto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_gravarNovoPrecoProduto.setForeground(new java.awt.Color(0, 0, 102));
        btn_gravarNovoPrecoProduto.setText("Gravar");
        btn_gravarNovoPrecoProduto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_gravarNovoPrecoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gravarNovoPrecoProdutoActionPerformed(evt);
            }
        });

        btn_voltarAlteracaoPreco.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_voltarAlteracaoPreco.setText("Voltar");
        btn_voltarAlteracaoPreco.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_voltarAlteracaoPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarAlteracaoPrecoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel3.setText(" PREÇO ATUAL DO PRODUTO: ");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));

        campo_precoAtualProduto.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        campo_precoAtualProduto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campo_precoAtualProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        campo_precoAtualProduto.setDisabledTextColor(new java.awt.Color(0, 153, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_voltarAlteracaoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(bnt_LimparCampo_PrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_gravarNovoPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campo_precoAtualProduto))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campo_novoPrecoProduto)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campo_precoAtualProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campo_novoPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bnt_LimparCampo_PrecoProduto)
                    .addComponent(btn_gravarNovoPrecoProduto)
                    .addComponent(btn_voltarAlteracaoPreco))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_gravarNovoPrecoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gravarNovoPrecoProdutoActionPerformed
        double novoValorProduto = JSType.toLong(campo_novoPrecoProduto.getText());
        Parametros novoPrecoProduto = new Parametros();
        novoPrecoProduto.AlterarPrecoProduto(novoValorProduto,codigoProdutoParaAlteracao);  
        setVisible(false);
        telaPrincipal.setVisible(true);
        telaPrincipal.LimparCampos();        
    }//GEN-LAST:event_btn_gravarNovoPrecoProdutoActionPerformed

    private void btn_voltarAlteracaoPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarAlteracaoPrecoActionPerformed
        JOptionPane.showMessageDialog(null, "Cancelando alteração de preço...","Cancelamento",JOptionPane.INFORMATION_MESSAGE);
        setVisible(false);
        telaPrincipal.LimparCampos(); 
        telaPrincipal.setVisible(true);
    }//GEN-LAST:event_btn_voltarAlteracaoPrecoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeAlteracaoProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnt_LimparCampo_PrecoProduto;
    private javax.swing.JButton btn_gravarNovoPrecoProduto;
    private javax.swing.JButton btn_voltarAlteracaoPreco;
    private javax.swing.JTextField campo_novoPrecoProduto;
    private javax.swing.JTextField campo_precoAtualProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
