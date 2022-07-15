package pacote1;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.runtime.JSType;
import pacote2.*;
import pacote3.*;

public class TelaConfiguracaoUsuarios extends javax.swing.JFrame {

    private static String perfilUsuario;
    private SistemaGerenciador telaPrincipal;
    ArrayList<Object> listaUsuarios = new ArrayList<>();
    private boolean usuarioPesquisado;

    public void Inicializacao(SistemaGerenciador telaSistema) {
        usuarioPesquisado = false;
        telaPrincipal = telaSistema;
        jbtn_perfilAdministrador.setEnabled(false);
        jbtn_perfilGerenciador.setEnabled(false);
        jbtn_perfilPadrao.setEnabled(false);
        btn_AlterarPefilUsuario.setEnabled(false);
        jbtn_exclusaoUsuario.setEnabled(false);
        jbtn_alteracaoPerfilUsuario.setEnabled(false);
        campo_senhaAdmAprovacao2.setEnabled(false);
    }

    public TelaConfiguracaoUsuarios() {
        initComponents();
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngroup_perfisDeUsuario = new javax.swing.ButtonGroup();
        btngroup_acoesDeModificacao = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        campo_NomeUsuario_paraCadastro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        campo_senhaUsuario_paraCadastro = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jbtn_cadastroPerfil_deAdministardor1 = new javax.swing.JRadioButton();
        jbtn_cadastroPerfil_deGerenciador1 = new javax.swing.JRadioButton();
        jbtn_cadastroPerfil_dePadrao1 = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        btn_cadastrarUsuarioNovo = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        btn_voltar1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        campo_codigoNovoUsuario = new javax.swing.JTextField();
        btn_limparCampos_cadastroUsuario = new javax.swing.JButton();
        campo_txt_perfilSelecionado = new javax.swing.JTextField();
        campo_senhaAdmAprovacao = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jbtn_perfilAdministrador = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        jbtn_perfilGerenciador = new javax.swing.JRadioButton();
        jbtn_perfilPadrao = new javax.swing.JRadioButton();
        jbtn_exclusaoUsuario = new javax.swing.JRadioButton();
        btn_AlterarPefilUsuario = new javax.swing.JButton();
        jbtn_alteracaoPerfilUsuario = new javax.swing.JRadioButton();
        btn_exclusaoUsuario = new javax.swing.JButton();
        btn_pesquisarUsuario = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        campo_senhaAdmAprovacao2 = new javax.swing.JTextField();
        campo_txtNomeUsuario = new javax.swing.JTextField();
        btn_voltar2 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        campo_txtTipoPerfilUsuario = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        campo_txtSenhaUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        campo_codigoUsuario_paraAlteracao = new javax.swing.JTextField();
        btn_limparCamposAlteracao = new javax.swing.JButton();
        campo_txt_NovoPerfilUsuario = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_cancelar_listagemUsuarios = new javax.swing.JButton();
        btn_listarUsuarios = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        cb_listaUsuarios = new javax.swing.JComboBox<>();
        btn_voltar3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel8.setText(" NOME DO USUÁRIO: ");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));

        campo_NomeUsuario_paraCadastro.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        campo_NomeUsuario_paraCadastro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel9.setText(" PERFIL: ");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel10.setText(" SENHA: ");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));

        campo_senhaUsuario_paraCadastro.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        campo_senhaUsuario_paraCadastro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel11.setText("  O nome deve ser escrito em letras maísculas, sem símbolos ou especiais");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel12.setText(" A senha deve ter até 10 caracteres e conter somente números ");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        btngroup_perfisDeUsuario.add(jbtn_cadastroPerfil_deAdministardor1);
        jbtn_cadastroPerfil_deAdministardor1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jbtn_cadastroPerfil_deAdministardor1.setForeground(new java.awt.Color(0, 0, 102));
        jbtn_cadastroPerfil_deAdministardor1.setText("Administrador");
        jbtn_cadastroPerfil_deAdministardor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_cadastroPerfil_deAdministardor1ActionPerformed(evt);
            }
        });

        btngroup_perfisDeUsuario.add(jbtn_cadastroPerfil_deGerenciador1);
        jbtn_cadastroPerfil_deGerenciador1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jbtn_cadastroPerfil_deGerenciador1.setForeground(new java.awt.Color(0, 0, 102));
        jbtn_cadastroPerfil_deGerenciador1.setText("Gerenciador");
        jbtn_cadastroPerfil_deGerenciador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_cadastroPerfil_deGerenciador1ActionPerformed(evt);
            }
        });

        btngroup_perfisDeUsuario.add(jbtn_cadastroPerfil_dePadrao1);
        jbtn_cadastroPerfil_dePadrao1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jbtn_cadastroPerfil_dePadrao1.setForeground(new java.awt.Color(0, 0, 102));
        jbtn_cadastroPerfil_dePadrao1.setText("Padrão");
        jbtn_cadastroPerfil_dePadrao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_cadastroPerfil_dePadrao1ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel13.setText(" SENHA DE APROVAÇÃO: ");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        btn_cadastrarUsuarioNovo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_cadastrarUsuarioNovo.setForeground(new java.awt.Color(0, 0, 102));
        btn_cadastrarUsuarioNovo.setText("Cadastrar");
        btn_cadastrarUsuarioNovo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_cadastrarUsuarioNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarUsuarioNovoActionPerformed(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(255, 204, 51));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Cadastro de Usuário");
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        jLabel14.setOpaque(true);

        btn_voltar1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_voltar1.setText("Voltar");
        btn_voltar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_voltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltar1ActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel21.setText(" CÓDIGO:");
        jLabel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));

        campo_codigoNovoUsuario.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        campo_codigoNovoUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campo_codigoNovoUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_limparCampos_cadastroUsuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_limparCampos_cadastroUsuario.setForeground(new java.awt.Color(102, 0, 0));
        btn_limparCampos_cadastroUsuario.setText("Limpar");
        btn_limparCampos_cadastroUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_limparCampos_cadastroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparCampos_cadastroUsuarioActionPerformed(evt);
            }
        });

        campo_txt_perfilSelecionado.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        campo_txt_perfilSelecionado.setForeground(new java.awt.Color(102, 0, 0));
        campo_txt_perfilSelecionado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campo_txt_perfilSelecionado.setDisabledTextColor(new java.awt.Color(153, 0, 0));
        campo_txt_perfilSelecionado.setEnabled(false);

        campo_senhaAdmAprovacao.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        campo_senhaAdmAprovacao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_senhaUsuario_paraCadastro))
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_voltar1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_limparCampos_cadastroUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_cadastrarUsuarioNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_codigoNovoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campo_NomeUsuario_paraCadastro))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtn_cadastroPerfil_deAdministardor1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtn_cadastroPerfil_deGerenciador1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtn_cadastroPerfil_dePadrao1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_txt_perfilSelecionado))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_senhaAdmAprovacao)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_NomeUsuario_paraCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(campo_codigoNovoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jLabel12)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(campo_senhaUsuario_paraCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtn_cadastroPerfil_deAdministardor1)
                        .addComponent(jbtn_cadastroPerfil_deGerenciador1)
                        .addComponent(jbtn_cadastroPerfil_dePadrao1)
                        .addComponent(campo_txt_perfilSelecionado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_senhaAdmAprovacao, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_cadastrarUsuarioNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn_voltar1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_limparCampos_cadastroUsuario))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cadastro", jPanel1);

        btngroup_perfisDeUsuario.add(jbtn_perfilAdministrador);
        jbtn_perfilAdministrador.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jbtn_perfilAdministrador.setForeground(new java.awt.Color(0, 0, 51));
        jbtn_perfilAdministrador.setText("Administrador");
        jbtn_perfilAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_perfilAdministradorActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel15.setText(" NOME: ");
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));

        btngroup_perfisDeUsuario.add(jbtn_perfilGerenciador);
        jbtn_perfilGerenciador.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jbtn_perfilGerenciador.setForeground(new java.awt.Color(0, 0, 51));
        jbtn_perfilGerenciador.setText("Gerenciador");
        jbtn_perfilGerenciador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_perfilGerenciadorActionPerformed(evt);
            }
        });

        btngroup_perfisDeUsuario.add(jbtn_perfilPadrao);
        jbtn_perfilPadrao.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jbtn_perfilPadrao.setForeground(new java.awt.Color(0, 0, 51));
        jbtn_perfilPadrao.setText("Padrão");
        jbtn_perfilPadrao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_perfilPadraoActionPerformed(evt);
            }
        });

        btngroup_acoesDeModificacao.add(jbtn_exclusaoUsuario);
        jbtn_exclusaoUsuario.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jbtn_exclusaoUsuario.setForeground(new java.awt.Color(0, 0, 51));
        jbtn_exclusaoUsuario.setText("Excluir usuário");
        jbtn_exclusaoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_exclusaoUsuarioActionPerformed(evt);
            }
        });

        btn_AlterarPefilUsuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_AlterarPefilUsuario.setText("Alterar");
        btn_AlterarPefilUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_AlterarPefilUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AlterarPefilUsuarioActionPerformed(evt);
            }
        });

        btngroup_acoesDeModificacao.add(jbtn_alteracaoPerfilUsuario);
        jbtn_alteracaoPerfilUsuario.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jbtn_alteracaoPerfilUsuario.setForeground(new java.awt.Color(0, 0, 51));
        jbtn_alteracaoPerfilUsuario.setText("Alterar perfil");
        jbtn_alteracaoPerfilUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_alteracaoPerfilUsuarioActionPerformed(evt);
            }
        });

        btn_exclusaoUsuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_exclusaoUsuario.setForeground(new java.awt.Color(102, 0, 0));
        btn_exclusaoUsuario.setText("Excluir");
        btn_exclusaoUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_exclusaoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exclusaoUsuarioActionPerformed(evt);
            }
        });

        btn_pesquisarUsuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_pesquisarUsuario.setText("Pesquisar");
        btn_pesquisarUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_pesquisarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesquisarUsuarioActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel16.setText(" SENHA DE APROVAÇÃO: ");
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel17.setText(" CÓDIGO USUÁRIO: ");
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));

        campo_senhaAdmAprovacao2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        campo_senhaAdmAprovacao2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        campo_txtNomeUsuario.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        campo_txtNomeUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        campo_txtNomeUsuario.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        campo_txtNomeUsuario.setEnabled(false);

        btn_voltar2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_voltar2.setText("Voltar");
        btn_voltar2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_voltar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltar2ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel18.setText(" TIPO DE PERFIL: ");
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 151)));

        campo_txtTipoPerfilUsuario.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        campo_txtTipoPerfilUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campo_txtTipoPerfilUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        campo_txtTipoPerfilUsuario.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        campo_txtTipoPerfilUsuario.setEnabled(false);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel19.setText(" NOVO PERFIL: ");
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));

        jLabel20.setBackground(new java.awt.Color(255, 204, 51));
        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Alteração de Usuários");
        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        jLabel20.setOpaque(true);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        campo_txtSenhaUsuario.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        campo_txtSenhaUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel1.setText(" SENHA:");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));

        jSeparator4.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));

        campo_codigoUsuario_paraAlteracao.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        campo_codigoUsuario_paraAlteracao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campo_codigoUsuario_paraAlteracao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        campo_codigoUsuario_paraAlteracao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campo_codigoUsuario_paraAlteracaoKeyPressed(evt);
            }
        });

        btn_limparCamposAlteracao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_limparCamposAlteracao.setForeground(new java.awt.Color(153, 0, 0));
        btn_limparCamposAlteracao.setText("Limpar");
        btn_limparCamposAlteracao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_limparCamposAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparCamposAlteracaoActionPerformed(evt);
            }
        });

        campo_txt_NovoPerfilUsuario.setEditable(false);
        campo_txt_NovoPerfilUsuario.setBackground(new java.awt.Color(255, 255, 255));
        campo_txt_NovoPerfilUsuario.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        campo_txt_NovoPerfilUsuario.setForeground(new java.awt.Color(102, 0, 0));
        campo_txt_NovoPerfilUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campo_txt_NovoPerfilUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        campo_txt_NovoPerfilUsuario.setDisabledTextColor(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campo_txtNomeUsuario))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jbtn_exclusaoUsuario)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbtn_alteracaoPerfilUsuario))
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(btn_voltar2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                            .addComponent(btn_exclusaoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel16)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(campo_senhaAdmAprovacao2))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campo_txt_NovoPerfilUsuario))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jbtn_perfilGerenciador)
                                            .addComponent(jbtn_perfilAdministrador)
                                            .addComponent(jbtn_perfilPadrao))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                        .addComponent(btn_AlterarPefilUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 1, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campo_codigoUsuario_paraAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campo_txtSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campo_txtTipoPerfilUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                    .addComponent(btn_limparCamposAlteracao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(10, 10, 10)
                                .addComponent(btn_pesquisarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(campo_txtNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(campo_txtTipoPerfilUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo_codigoUsuario_paraAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campo_txtSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(btn_limparCamposAlteracao)))
                    .addComponent(btn_pesquisarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbtn_alteracaoPerfilUsuario, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jbtn_exclusaoUsuario))
                                .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campo_senhaAdmAprovacao2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(8, 8, 8)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn_exclusaoUsuario)
                                .addComponent(btn_voltar2)))
                        .addComponent(jSeparator1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(campo_txt_NovoPerfilUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jbtn_perfilAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbtn_perfilPadrao, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtn_perfilGerenciador, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_AlterarPefilUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 479, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Alteração", jPanel2);

        jLabel2.setBackground(new java.awt.Color(255, 204, 51));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Lista de Usuários");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        jLabel2.setOpaque(true);

        btn_cancelar_listagemUsuarios.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_cancelar_listagemUsuarios.setText("Cancelar");
        btn_cancelar_listagemUsuarios.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_cancelar_listagemUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelar_listagemUsuariosActionPerformed(evt);
            }
        });

        btn_listarUsuarios.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_listarUsuarios.setText("Listar");
        btn_listarUsuarios.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_listarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listarUsuariosActionPerformed(evt);
            }
        });

        jSeparator5.setForeground(new java.awt.Color(102, 102, 102));

        cb_listaUsuarios.setBackground(new java.awt.Color(204, 204, 204));
        cb_listaUsuarios.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        cb_listaUsuarios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_voltar3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_voltar3.setText("Voltar");
        btn_voltar3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_voltar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltar3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jLabel3.setText(" Código usuário | Nome | Perfil ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_listaUsuarios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btn_cancelar_listagemUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_listarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_voltar3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_listarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_cancelar_listagemUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_listaUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(btn_voltar3)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Listagem", jPanel4);

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

    private void jbtn_cadastroPerfil_deAdministardor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_cadastroPerfil_deAdministardor1ActionPerformed
        perfilUsuario = "Administrador";
        campo_txt_perfilSelecionado.setText(perfilUsuario);
    }//GEN-LAST:event_jbtn_cadastroPerfil_deAdministardor1ActionPerformed

    private void jbtn_cadastroPerfil_deGerenciador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_cadastroPerfil_deGerenciador1ActionPerformed
        perfilUsuario = "Gerenciador";
        campo_txt_perfilSelecionado.setText(perfilUsuario);
    }//GEN-LAST:event_jbtn_cadastroPerfil_deGerenciador1ActionPerformed

    private void jbtn_cadastroPerfil_dePadrao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_cadastroPerfil_dePadrao1ActionPerformed
        perfilUsuario = "Padrão";
        campo_txt_perfilSelecionado.setText(perfilUsuario);
    }//GEN-LAST:event_jbtn_cadastroPerfil_dePadrao1ActionPerformed

    private void btn_cadastrarUsuarioNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarUsuarioNovoActionPerformed
        String senhaEntrada = campo_senhaAdmAprovacao.getText().toUpperCase() ;
        String senhaEncontrada ;
        if(senhaEntrada.equals("")){
            JOptionPane.showMessageDialog(null,"Nenhuma senha de aprovação foi informada!","Erro de segurança",JOptionPane.WARNING_MESSAGE);
        }else{
            Parametros cadastroUsuario = new Parametros();
            senhaEncontrada = cadastroUsuario.VerificarSenhaAdministrador(senhaEntrada);
            if(senhaEntrada.equals(senhaEncontrada)){
                DadosUsuario novoUsuario = new DadosUsuario();
                int codigoTraduzido = JSType.toInteger(campo_codigoNovoUsuario.getText());
                novoUsuario.setCodigoUsuario(codigoTraduzido);
                novoUsuario.setNomeUsuario(campo_NomeUsuario_paraCadastro.getText().toUpperCase());
                novoUsuario.setSenhaUsuario(campo_senhaUsuario_paraCadastro.getText().toUpperCase());
                novoUsuario.setPerfilUsuario(perfilUsuario);
                cadastroUsuario.CadastrarUsuario(novoUsuario);
                //campo_codigoNovoUsuario.setText("");
                campo_NomeUsuario_paraCadastro.setText("");
                campo_senhaUsuario_paraCadastro.setText("");
                campo_senhaAdmAprovacao.setText("");
                campo_txt_perfilSelecionado.setText("");
                btn_limparCampos_cadastroUsuarioActionPerformed(evt);
            }else{
                JOptionPane.showMessageDialog(null,"Senha de ADMINISTRADOR incorreta!","Erro de segurança",JOptionPane.WARNING_MESSAGE);
            }
        }       
    }//GEN-LAST:event_btn_cadastrarUsuarioNovoActionPerformed

    private void btn_limparCampos_cadastroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparCampos_cadastroUsuarioActionPerformed
        campo_codigoNovoUsuario.setText("");
        campo_NomeUsuario_paraCadastro.setText("");
        campo_senhaUsuario_paraCadastro.setText("");
        campo_senhaAdmAprovacao.setText("");
        campo_txt_perfilSelecionado.setText("");
    }//GEN-LAST:event_btn_limparCampos_cadastroUsuarioActionPerformed

    private void btn_voltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltar1ActionPerformed
        setVisible(false);
        telaPrincipal.setVisible(true);
    }//GEN-LAST:event_btn_voltar1ActionPerformed

    private void btn_exclusaoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exclusaoUsuarioActionPerformed
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente excluír o usuário "+campo_txtNomeUsuario.getText(),"Exclusão segura",JOptionPane.OK_CANCEL_OPTION);
        if(opcao == JOptionPane.OK_OPTION){                       
            String senhaEntrada = campo_senhaAdmAprovacao2.getText().toUpperCase();
            String senhaEncontrada;
            Parametros exclusaoUsuario = new Parametros();
            senhaEncontrada = exclusaoUsuario.VerificarSenhaAdministrador(senhaEntrada);
            if(senhaEntrada.equals("")){
                JOptionPane.showMessageDialog(null,"Nenhuma senha de aprovação foi informada!","Erro de segurança",JOptionPane.WARNING_MESSAGE);
            }else{
               if(senhaEntrada.equals(senhaEncontrada)){
                int codigoUsuarioTraduzido = JSType.toInteger(campo_codigoUsuario_paraAlteracao.getText());
                exclusaoUsuario.ExcluirUsuario(codigoUsuarioTraduzido);   
               }
               else{
                JOptionPane.showMessageDialog(null,"Senha de aprovação incorreta!","Erro de segurança",JOptionPane.WARNING_MESSAGE);
               }    
            }              
        }else if(opcao == JOptionPane.CANCEL_OPTION){
            JOptionPane.showMessageDialog(null,"Exclusão de usuário CANCELADA","Cancelamento de exclusão",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_exclusaoUsuarioActionPerformed

    private void btn_pesquisarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquisarUsuarioActionPerformed
        usuarioPesquisado = true;
        if("".equals(campo_codigoUsuario_paraAlteracao.getText())){
            JOptionPane.showMessageDialog(null,"Nenhum CÓDIGO informado para pesquisa!","Código inválido",JOptionPane.WARNING_MESSAGE);
        }else{
            int codigoUsuarioTraduzido = JSType.toInteger(campo_codigoUsuario_paraAlteracao.getText());           
            DadosUsuario usuario;
            Parametros pesquisaUsuario = new Parametros();
            usuario = pesquisaUsuario.PesquisarUsuario(codigoUsuarioTraduzido);
            int codigoUsuarioEncontrado = usuario.getCodigoUsuario();
                if(codigoUsuarioTraduzido != codigoUsuarioEncontrado){
                    JOptionPane.showMessageDialog(null, "Não existe nenhum usuário com o código informado!","Aviso",JOptionPane.WARNING_MESSAGE);
                }else{
                    campo_txtNomeUsuario.setText(usuario.getNomeUsuario());
                    campo_txtTipoPerfilUsuario.setText(usuario.getPerfilUsuario());           
                    jbtn_exclusaoUsuario.setEnabled(true);
                    jbtn_alteracaoPerfilUsuario.setEnabled(true);
                }
        }
    }//GEN-LAST:event_btn_pesquisarUsuarioActionPerformed

    private void btn_voltar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltar2ActionPerformed
        setVisible(false);
        telaPrincipal.setVisible(true);
    }//GEN-LAST:event_btn_voltar2ActionPerformed

    private void jbtn_exclusaoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_exclusaoUsuarioActionPerformed
        if(jbtn_exclusaoUsuario.isSelected() ==  true){
            campo_senhaAdmAprovacao2.setEnabled(true);
            jbtn_perfilAdministrador.setEnabled(false);
            jbtn_perfilGerenciador.setEnabled(false);
            jbtn_perfilPadrao.setEnabled(false);
            btn_AlterarPefilUsuario.setEnabled(false);
        }
    }//GEN-LAST:event_jbtn_exclusaoUsuarioActionPerformed

    private void jbtn_alteracaoPerfilUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_alteracaoPerfilUsuarioActionPerformed
        if(jbtn_alteracaoPerfilUsuario.isSelected() == true){
            jbtn_perfilAdministrador.setEnabled(true);
            jbtn_perfilGerenciador.setEnabled(true);
            jbtn_perfilPadrao.setEnabled(true);
            btn_AlterarPefilUsuario.setEnabled(true);
            campo_senhaAdmAprovacao2.setEnabled(false);
        }
    }//GEN-LAST:event_jbtn_alteracaoPerfilUsuarioActionPerformed

    private void btn_limparCamposAlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparCamposAlteracaoActionPerformed
        usuarioPesquisado = false;
        campo_codigoUsuario_paraAlteracao.setText("");
        campo_txtNomeUsuario.setText("");
        campo_txtSenhaUsuario.setText("");
        campo_senhaAdmAprovacao.setText("");
        campo_txtTipoPerfilUsuario.setText("");
        campo_senhaAdmAprovacao2.setText("");
        campo_senhaAdmAprovacao2.setEnabled(false);
        jbtn_exclusaoUsuario.setEnabled(false);
        jbtn_alteracaoPerfilUsuario.setEnabled(false);
    }//GEN-LAST:event_btn_limparCamposAlteracaoActionPerformed

    private void jbtn_perfilAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_perfilAdministradorActionPerformed
        perfilUsuario = "Administrador";
        campo_txt_NovoPerfilUsuario.setText(perfilUsuario);
    }//GEN-LAST:event_jbtn_perfilAdministradorActionPerformed

    private void jbtn_perfilPadraoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_perfilPadraoActionPerformed
        perfilUsuario = "Padrão";
        campo_txt_NovoPerfilUsuario.setText(perfilUsuario);
    }//GEN-LAST:event_jbtn_perfilPadraoActionPerformed

    private void jbtn_perfilGerenciadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_perfilGerenciadorActionPerformed
        perfilUsuario = "Gerenciador";
        campo_txt_NovoPerfilUsuario.setText(perfilUsuario);
    }//GEN-LAST:event_jbtn_perfilGerenciadorActionPerformed

    private void btn_cancelar_listagemUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar_listagemUsuariosActionPerformed
        DefaultComboBoxModel modeloPadrao = new DefaultComboBoxModel();
        cb_listaUsuarios.setModel(modeloPadrao);
    }//GEN-LAST:event_btn_cancelar_listagemUsuariosActionPerformed

    private void btn_listarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listarUsuariosActionPerformed
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_listaUsuarios.getModel();
        Parametros listagemUsuarios = new Parametros();
        listaUsuarios = listagemUsuarios.ListagemCompletaUsuarios();
        for(int i =0;i<listaUsuarios.size();i++){
            modelo.addElement(listaUsuarios.get(i));
        }      
    }//GEN-LAST:event_btn_listarUsuariosActionPerformed

    private void btn_AlterarPefilUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AlterarPefilUsuarioActionPerformed
        if(usuarioPesquisado == false){
            JOptionPane.showMessageDialog(null,"Nenhum usuário informado para alteração de perfil!","Erro",JOptionPane.WARNING_MESSAGE);
        }
        else{
            if(campo_txt_NovoPerfilUsuario.getText().equals(campo_txtTipoPerfilUsuario.getText())){
                JOptionPane.showMessageDialog(null,"O perfil "+ campo_txt_NovoPerfilUsuario.getText() + " já está atribuido ao usuário "+campo_txtNomeUsuario.getText(),"Erro",JOptionPane.WARNING_MESSAGE);
            }else{
                if(campo_txt_NovoPerfilUsuario.equals("")){
                    JOptionPane.showMessageDialog(null,"Nenhum perfil de usuário selecionado para alteração","Erro",JOptionPane.WARNING_MESSAGE);
                }else{
                   int codigoUsuarioTraduzido = JSType.toInteger(campo_codigoUsuario_paraAlteracao.getText());
                   Parametros alteracaoUsuario = new Parametros();
                   alteracaoUsuario.AlteracaoPerfilUsuario(campo_txtNomeUsuario.getText(), campo_txt_NovoPerfilUsuario.getText(), codigoUsuarioTraduzido);        
                }
            }
        }     
    }//GEN-LAST:event_btn_AlterarPefilUsuarioActionPerformed

    private void campo_codigoUsuario_paraAlteracaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo_codigoUsuario_paraAlteracaoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            int codigoUsuarioTraduzido = JSType.toInteger(campo_codigoUsuario_paraAlteracao.getText());
            DadosUsuario usuarioConsultado = new DadosUsuario();
            Parametros consultaUsuario = new Parametros();
            usuarioConsultado = consultaUsuario.PesquisarUsuario(codigoUsuarioTraduzido);
            campo_txtNomeUsuario.setText(usuarioConsultado.getNomeUsuario());
            campo_txtSenhaUsuario.setText(usuarioConsultado.getSenhaUsuario());
            campo_txtTipoPerfilUsuario.setText(usuarioConsultado.getPerfilUsuario());
        }
    }//GEN-LAST:event_campo_codigoUsuario_paraAlteracaoKeyPressed

    private void btn_voltar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltar3ActionPerformed
        setVisible(false);
        telaPrincipal.setVisible(true);
    }//GEN-LAST:event_btn_voltar3ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConfiguracaoUsuarios().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AlterarPefilUsuario;
    private javax.swing.JButton btn_cadastrarUsuarioNovo;
    private javax.swing.JButton btn_cancelar_listagemUsuarios;
    private javax.swing.JButton btn_exclusaoUsuario;
    private javax.swing.JButton btn_limparCamposAlteracao;
    private javax.swing.JButton btn_limparCampos_cadastroUsuario;
    private javax.swing.JButton btn_listarUsuarios;
    private javax.swing.JButton btn_pesquisarUsuario;
    private javax.swing.JButton btn_voltar1;
    private javax.swing.JButton btn_voltar2;
    private javax.swing.JButton btn_voltar3;
    private javax.swing.ButtonGroup btngroup_acoesDeModificacao;
    private javax.swing.ButtonGroup btngroup_perfisDeUsuario;
    private javax.swing.JTextField campo_NomeUsuario_paraCadastro;
    private javax.swing.JTextField campo_codigoNovoUsuario;
    private javax.swing.JTextField campo_codigoUsuario_paraAlteracao;
    private javax.swing.JPasswordField campo_senhaAdmAprovacao;
    private javax.swing.JTextField campo_senhaAdmAprovacao2;
    private javax.swing.JTextField campo_senhaUsuario_paraCadastro;
    private javax.swing.JTextField campo_txtNomeUsuario;
    private javax.swing.JTextField campo_txtSenhaUsuario;
    private javax.swing.JTextField campo_txtTipoPerfilUsuario;
    private javax.swing.JTextField campo_txt_NovoPerfilUsuario;
    private javax.swing.JTextField campo_txt_perfilSelecionado;
    private javax.swing.JComboBox<String> cb_listaUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton jbtn_alteracaoPerfilUsuario;
    private javax.swing.JRadioButton jbtn_cadastroPerfil_deAdministardor1;
    private javax.swing.JRadioButton jbtn_cadastroPerfil_deGerenciador1;
    private javax.swing.JRadioButton jbtn_cadastroPerfil_dePadrao1;
    private javax.swing.JRadioButton jbtn_exclusaoUsuario;
    private javax.swing.JRadioButton jbtn_perfilAdministrador;
    private javax.swing.JRadioButton jbtn_perfilGerenciador;
    private javax.swing.JRadioButton jbtn_perfilPadrao;
    // End of variables declaration//GEN-END:variables
}
