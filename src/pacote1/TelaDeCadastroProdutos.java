
package pacote1;

import java.util.ArrayList;
import javax.swing.JColorChooser;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.runtime.JSType;
import pacote2.*;
import pacote3.DadosProdutos;


public class TelaDeCadastroProdutos extends javax.swing.JFrame {
    
    private SistemaGerenciador telaPrincipalSistema;
    
    public void Insercao(SistemaGerenciador telaPrincipal){
        telaPrincipalSistema = telaPrincipal;
    }
    public TelaDeCadastroProdutos() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campo_codigoNovoProduto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campo_codigoCategoria_novoProduto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campo_descricaoNovoProduto = new javax.swing.JTextField();
        bnt_voltarCadastroNovoProduto = new javax.swing.JButton();
        btn_limparCamposCadastro = new javax.swing.JButton();
        btn_cadastrarNovoProduto = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        campo_valorNovoProduto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 204, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastrar Novo Produto");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        jLabel1.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setText(" CÓDIGO PRODUTO: ");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));

        campo_codigoNovoProduto.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        campo_codigoNovoProduto.setForeground(new java.awt.Color(51, 0, 153));
        campo_codigoNovoProduto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campo_codigoNovoProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel3.setText(" CÓDIGO CATEGORIA: ");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));

        campo_codigoCategoria_novoProduto.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        campo_codigoCategoria_novoProduto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campo_codigoCategoria_novoProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel4.setText(" DESCRIÇÃO PRODUTO: ");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));

        campo_descricaoNovoProduto.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        campo_descricaoNovoProduto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campo_descricaoNovoProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bnt_voltarCadastroNovoProduto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bnt_voltarCadastroNovoProduto.setText("Voltar");
        bnt_voltarCadastroNovoProduto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bnt_voltarCadastroNovoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_voltarCadastroNovoProdutoActionPerformed(evt);
            }
        });

        btn_limparCamposCadastro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_limparCamposCadastro.setForeground(new java.awt.Color(102, 0, 0));
        btn_limparCamposCadastro.setText("Limpar");
        btn_limparCamposCadastro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_limparCamposCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparCamposCadastroActionPerformed(evt);
            }
        });

        btn_cadastrarNovoProduto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_cadastrarNovoProduto.setForeground(new java.awt.Color(0, 0, 102));
        btn_cadastrarNovoProduto.setText("Cadastrar");
        btn_cadastrarNovoProduto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_cadastrarNovoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarNovoProdutoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel5.setText(" VALOR: ");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));

        campo_valorNovoProduto.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        campo_valorNovoProduto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campo_valorNovoProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        campo_valorNovoProduto.setDisabledTextColor(new java.awt.Color(0, 102, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_descricaoNovoProduto))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_codigoNovoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_codigoCategoria_novoProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_valorNovoProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bnt_voltarCadastroNovoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_limparCamposCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_cadastrarNovoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campo_codigoNovoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(campo_codigoCategoria_novoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campo_descricaoNovoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campo_valorNovoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cadastrarNovoProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_limparCamposCadastro)
                    .addComponent(bnt_voltarCadastroNovoProduto))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_limparCamposCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparCamposCadastroActionPerformed
        campo_codigoNovoProduto.setText("");
        campo_codigoCategoria_novoProduto.setText("");
        campo_descricaoNovoProduto.setText("");
        campo_valorNovoProduto.setText("");
    }//GEN-LAST:event_btn_limparCamposCadastroActionPerformed

    private void bnt_voltarCadastroNovoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_voltarCadastroNovoProdutoActionPerformed
        setVisible(false);
        telaPrincipalSistema.setVisible(true);
    }//GEN-LAST:event_bnt_voltarCadastroNovoProdutoActionPerformed

    private void btn_cadastrarNovoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarNovoProdutoActionPerformed
        if(campo_codigoNovoProduto.getText().equals("") || campo_descricaoNovoProduto.getText().equals("") || campo_descricaoNovoProduto.getText().equals("") || campo_valorNovoProduto.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Preencha todos os campos para o cadastro do produto!","Aviso",JOptionPane.WARNING_MESSAGE);
        }else{
            int codigoProdutoNovoTraduzido = JSType.toInteger(campo_codigoNovoProduto.getText());
            int codigoCategoriaTraduzida = JSType.toInteger(campo_codigoCategoria_novoProduto.getText());
            double valorTraduzido = JSType.toLong(campo_valorNovoProduto.getText());
            String descricaoProduto = campo_descricaoNovoProduto.getText();      
            Parametros insercaoProdutoNovo = new Parametros();
            insercaoProdutoNovo.CadastrarNovoProduto(codigoProdutoNovoTraduzido,descricaoProduto,codigoCategoriaTraduzida,valorTraduzido); 
            JOptionPane.showMessageDialog(null,"Produto cadastrado com sucesso!","Cadastro seguro",JOptionPane.INFORMATION_MESSAGE);
            campo_codigoNovoProduto.setText("");
            campo_codigoCategoria_novoProduto.setText("");
            campo_descricaoNovoProduto.setText("");
            campo_valorNovoProduto.setText("");
        }       
    }//GEN-LAST:event_btn_cadastrarNovoProdutoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeCadastroProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnt_voltarCadastroNovoProduto;
    private javax.swing.JButton btn_cadastrarNovoProduto;
    private javax.swing.JButton btn_limparCamposCadastro;
    private javax.swing.JTextField campo_codigoCategoria_novoProduto;
    private javax.swing.JTextField campo_codigoNovoProduto;
    private javax.swing.JTextField campo_descricaoNovoProduto;
    private javax.swing.JTextField campo_valorNovoProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
