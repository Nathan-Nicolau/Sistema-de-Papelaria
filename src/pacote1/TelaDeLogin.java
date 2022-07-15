
package pacote1;

import java.awt.event.KeyEvent;
import pacote2.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class TelaDeLogin extends javax.swing.JFrame {


    public TelaDeLogin() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        campo_NomeUsuarioLogin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btn_EntrarSistema = new javax.swing.JButton();
        label_tituloLogin = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campo_SenhaUsuarioLogin = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel1.setText(" NOME DE USUÁRIO: ");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));

        campo_NomeUsuarioLogin.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        campo_NomeUsuarioLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel3.setText(" SENHA: ");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));

        btn_EntrarSistema.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_EntrarSistema.setText("Entrar");
        btn_EntrarSistema.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_EntrarSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EntrarSistemaActionPerformed(evt);
            }
        });

        label_tituloLogin.setBackground(new java.awt.Color(255, 204, 51));
        label_tituloLogin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label_tituloLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_tituloLogin.setText("Login");
        label_tituloLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        label_tituloLogin.setOpaque(true);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("     G.P.P. - 1.0");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel6.setText("Gerenciador de Produtos");

        campo_SenhaUsuarioLogin.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        campo_SenhaUsuarioLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        campo_SenhaUsuarioLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campo_SenhaUsuarioLoginKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jLabel7.setText("de Papelaria");

        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_tituloLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campo_NomeUsuarioLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(campo_SenhaUsuarioLogin)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(btn_EntrarSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(label_tituloLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_NomeUsuarioLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_SenhaUsuarioLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btn_EntrarSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_EntrarSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EntrarSistemaActionPerformed
        ValidarUsuario();
    }//GEN-LAST:event_btn_EntrarSistemaActionPerformed

    private void campo_SenhaUsuarioLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo_SenhaUsuarioLoginKeyPressed
         if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            ValidarUsuario();
        }
    }//GEN-LAST:event_campo_SenhaUsuarioLoginKeyPressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_EntrarSistema;
    private javax.swing.JTextField campo_NomeUsuarioLogin;
    private javax.swing.JPasswordField campo_SenhaUsuarioLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel label_tituloLogin;
    // End of variables declaration//GEN-END:variables
    private final void ValidarUsuario(){
        String nomeUsuarioEntrada;
        String senhaUsuarioEntrada;
        String nomeEncontrado = "";
        String senhaEncontrada = "";
        String perfilUsuario = "";
        Connection con ;
        PreparedStatement ps;
        ResultSet rs;
        try {           
            nomeUsuarioEntrada = campo_NomeUsuarioLogin.getText().toUpperCase();
            senhaUsuarioEntrada = campo_SenhaUsuarioLogin.getText().toUpperCase();      
            con = new ConexaoBancoDeDados().conexaoBanco();
            String verificacao = "SELECT *FROM USUARIO U WHERE U.NOME_USUARIO = (?) AND U.SENHA_USUARIO = (?)";
            ps = con.prepareStatement(verificacao);
            ps.setString(1, nomeUsuarioEntrada);
            ps.setString(2, senhaUsuarioEntrada);
            rs = ps.executeQuery();
            while(rs.next()){
                nomeEncontrado = rs.getString("U.NOME_USUARIO");
                senhaEncontrada = rs.getString("U.SENHA_USUARIO");
                perfilUsuario = rs.getString("U.PERFIL");
            }
            if(nomeUsuarioEntrada.isEmpty() == true && senhaUsuarioEntrada.isEmpty() == false){
                JOptionPane.showMessageDialog(null,"Usuário não informado!","Erro",JOptionPane.WARNING_MESSAGE);
            }
            else if(nomeUsuarioEntrada.isEmpty() == false && senhaUsuarioEntrada.isEmpty() == true){
                JOptionPane.showMessageDialog(null,"Senha não informada!","Erro",JOptionPane.WARNING_MESSAGE);
            }
            else if(nomeUsuarioEntrada.isEmpty() == true && senhaUsuarioEntrada.isEmpty() == true){
                JOptionPane.showMessageDialog(null,"Usuário e senha não foram informados \n "
                                                 + "           para entrada no Sistema","Erro de Login",JOptionPane.WARNING_MESSAGE);
            }
            else{
                if(nomeEncontrado.equals(nomeUsuarioEntrada) && senhaEncontrada.equals(senhaUsuarioEntrada)){
                    SistemaGerenciador telaPrincipal  = new SistemaGerenciador();
                    setVisible(false);
                    telaPrincipal.setVisible(true);
                    telaPrincipal.AnexarUsuario(nomeEncontrado,perfilUsuario);
                    telaPrincipal.PermissoesPerfil(perfilUsuario);
                    
                }else if(!nomeEncontrado.equals(nomeUsuarioEntrada) && senhaEncontrada.equals(senhaUsuarioEntrada)){
                        JOptionPane.showMessageDialog(null,"Erro! Senha incorreta","Senha inválida",JOptionPane.WARNING_MESSAGE);
                }else if(nomeEncontrado.equals(nomeUsuarioEntrada)&& !senhaEncontrada.equals(senhaUsuarioEntrada)){
                        JOptionPane.showMessageDialog(null,"Erro! Usuário incorreto","Usuário inválido",JOptionPane.WARNING_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Erro! Usuário ou senha inválidos","Erro de LOGIN",JOptionPane.WARNING_MESSAGE);
                }
            }
        } catch (SQLException ERRO_DE_LOGIN) {
            JOptionPane.showMessageDialog(null, " "+ERRO_DE_LOGIN,"Erro",JOptionPane.INFORMATION_MESSAGE);
        }

    }
    
    public void AlterarTitulo(String texto){
        label_tituloLogin.setText(texto);
    }



}

