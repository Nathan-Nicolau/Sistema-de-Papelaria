
package pacote1;

import javax.swing.JOptionPane;
import jdk.nashorn.internal.runtime.JSType;
import pacote2.Parametros;


public class TelaDeAlteracaoCategoria extends javax.swing.JFrame {

    private int codigoProduto;
    private SistemaGerenciador telaPrincipal;
    
    public void Insercao(int codigoProdutoAlterado,SistemaGerenciador telaSistema){       
        codigoProduto = codigoProdutoAlterado;
        telaPrincipal = telaSistema;
        
    }
    
    public TelaDeAlteracaoCategoria() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campo_novoCodigoCategoria = new javax.swing.JTextField();
        btn_limparNovaDescricaoCategoria = new javax.swing.JButton();
        btn_gravarNovaCodigoCategoria = new javax.swing.JButton();
        btn_cancelarAltercaoCategoria = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 204, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Alteração de Categoria");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        jLabel1.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setText(" NOVA CÓDIGO CATEGORIA : ");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));

        campo_novoCodigoCategoria.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        campo_novoCodigoCategoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_limparNovaDescricaoCategoria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_limparNovaDescricaoCategoria.setForeground(new java.awt.Color(102, 0, 0));
        btn_limparNovaDescricaoCategoria.setText("Limpar");
        btn_limparNovaDescricaoCategoria.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_limparNovaDescricaoCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparNovaDescricaoCategoriaActionPerformed(evt);
            }
        });

        btn_gravarNovaCodigoCategoria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_gravarNovaCodigoCategoria.setForeground(new java.awt.Color(0, 0, 102));
        btn_gravarNovaCodigoCategoria.setText("Gravar");
        btn_gravarNovaCodigoCategoria.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_gravarNovaCodigoCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gravarNovaCodigoCategoriaActionPerformed(evt);
            }
        });

        btn_cancelarAltercaoCategoria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_cancelarAltercaoCategoria.setText("Cancelar");
        btn_cancelarAltercaoCategoria.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_cancelarAltercaoCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarAltercaoCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_cancelarAltercaoCategoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_limparNovaDescricaoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_gravarNovaCodigoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_novoCodigoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campo_novoCodigoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_gravarNovaCodigoCategoria)
                    .addComponent(btn_limparNovaDescricaoCategoria)
                    .addComponent(btn_cancelarAltercaoCategoria))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_gravarNovaCodigoCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gravarNovaCodigoCategoriaActionPerformed
        int codigoCategoriaTraduzido = JSType.toInteger(campo_novoCodigoCategoria.getText());
        Parametros novaCategoriaProduto = new Parametros();
        novaCategoriaProduto.AlteracaoCategoriaProduto(codigoProduto, codigoCategoriaTraduzido);
        setVisible(false); 
    }//GEN-LAST:event_btn_gravarNovaCodigoCategoriaActionPerformed

    private void btn_cancelarAltercaoCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarAltercaoCategoriaActionPerformed
        JOptionPane.showMessageDialog(null,"Cancelando alteração de categoria do produto","Cancelamento",JOptionPane.INFORMATION_MESSAGE);
        setVisible(false);
        telaPrincipal.LimparCampos();
        telaPrincipal.setVisible(true);
    }//GEN-LAST:event_btn_cancelarAltercaoCategoriaActionPerformed

    private void btn_limparNovaDescricaoCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparNovaDescricaoCategoriaActionPerformed
        campo_novoCodigoCategoria.setText("");
    }//GEN-LAST:event_btn_limparNovaDescricaoCategoriaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeAlteracaoCategoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelarAltercaoCategoria;
    private javax.swing.JButton btn_gravarNovaCodigoCategoria;
    private javax.swing.JButton btn_limparNovaDescricaoCategoria;
    private javax.swing.JTextField campo_novoCodigoCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
