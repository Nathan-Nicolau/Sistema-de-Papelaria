
package pacote1;

import javax.swing.JOptionPane;
import pacote2.*;

public class TelaDeAlteracaoDescricaoCategoria extends javax.swing.JFrame {

    private SistemaGerenciador telaPrincipalSistema;
    private int codigoCategoria;
    
    public void Insercao(int codigo, SistemaGerenciador telaPrincipal){
        telaPrincipalSistema = telaPrincipal;
        codigoCategoria = codigo;
    }
    public TelaDeAlteracaoDescricaoCategoria() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campo_novaDescricaoCategoria = new javax.swing.JTextField();
        btn_cancelarAlteracaoDeDescricao = new javax.swing.JButton();
        bnt_limparCampoNovaDescricao = new javax.swing.JButton();
        btn_gravarNovaDescricaoCategoria = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 204, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Alteração de Descrição de Categoria");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        jLabel1.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setText(" NOVA DESCRIÇÃO DA CATEGORIA: ");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));

        campo_novaDescricaoCategoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_cancelarAlteracaoDeDescricao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_cancelarAlteracaoDeDescricao.setText("Cancelar");
        btn_cancelarAlteracaoDeDescricao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_cancelarAlteracaoDeDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarAlteracaoDeDescricaoActionPerformed(evt);
            }
        });

        bnt_limparCampoNovaDescricao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bnt_limparCampoNovaDescricao.setForeground(new java.awt.Color(102, 0, 0));
        bnt_limparCampoNovaDescricao.setText("Limpar");
        bnt_limparCampoNovaDescricao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bnt_limparCampoNovaDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_limparCampoNovaDescricaoActionPerformed(evt);
            }
        });

        btn_gravarNovaDescricaoCategoria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_gravarNovaDescricaoCategoria.setForeground(new java.awt.Color(0, 0, 102));
        btn_gravarNovaDescricaoCategoria.setText("Gravar");
        btn_gravarNovaDescricaoCategoria.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_gravarNovaDescricaoCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gravarNovaDescricaoCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_cancelarAlteracaoDeDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addComponent(bnt_limparCampoNovaDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_gravarNovaDescricaoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(campo_novaDescricaoCategoria)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_novaDescricaoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bnt_limparCampoNovaDescricao)
                    .addComponent(btn_gravarNovaDescricaoCategoria)
                    .addComponent(btn_cancelarAlteracaoDeDescricao))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_gravarNovaDescricaoCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gravarNovaDescricaoCategoriaActionPerformed
        Parametros novaDescricaoCategoria = new Parametros();
        novaDescricaoCategoria.AlterarDescricaoCategoria(campo_novaDescricaoCategoria.getText(), codigoCategoria);
        setVisible(false);
        telaPrincipalSistema.LimparCampos();
        telaPrincipalSistema.setVisible(true);
    }//GEN-LAST:event_btn_gravarNovaDescricaoCategoriaActionPerformed

    private void bnt_limparCampoNovaDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_limparCampoNovaDescricaoActionPerformed
        campo_novaDescricaoCategoria.setText("");
    }//GEN-LAST:event_bnt_limparCampoNovaDescricaoActionPerformed

    private void btn_cancelarAlteracaoDeDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarAlteracaoDeDescricaoActionPerformed
        JOptionPane.showMessageDialog(null,"Cancelando alteração de descrição da categoria...","Cancelamento",JOptionPane.INFORMATION_MESSAGE);
        setVisible(false);
        telaPrincipalSistema.LimparCampos();
        telaPrincipalSistema.setVisible(true);
    }//GEN-LAST:event_btn_cancelarAlteracaoDeDescricaoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeAlteracaoDescricaoCategoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnt_limparCampoNovaDescricao;
    private javax.swing.JButton btn_cancelarAlteracaoDeDescricao;
    private javax.swing.JButton btn_gravarNovaDescricaoCategoria;
    private javax.swing.JTextField campo_novaDescricaoCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
