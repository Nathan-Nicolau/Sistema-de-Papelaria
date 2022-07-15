
package pacote1;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import jdk.nashorn.internal.runtime.JSType;
import pacote3.*;
import pacote2.*;

public class SistemaGerenciador extends javax.swing.JFrame {
    
    private static boolean pesquisaProduto;
    private static boolean pesquisaDescricao;
    ArrayList<JComponent> listaComponentesPainel = new ArrayList<>();
    private String perfilPainel;

    public final void AnexarUsuario(String nome,String perfil){
       campo_nomeUsuarioLogado.setText(nome);
       campo_txt_perfilUsuario.setText(perfil);
       perfilPainel = perfil;
    }
    public final void PermissoesPerfil(String perfil){
        if("Padrão".equals(perfil)){
            listaComponentesPainel.add(btn_cadastrarNovoProduto);
            listaComponentesPainel.add(btn_alteracaoPrecoProduto);
            listaComponentesPainel.add(btn_alteracaoCategoriaProduto);
            listaComponentesPainel.add(btn_exclusaoProduto);
            listaComponentesPainel.add(btn_exclusaoCategoria);
            listaComponentesPainel.add(btn_alteracaoDescricaoCategoria);
            listaComponentesPainel.add(jbtn_cadastroDeNovaCategoria);
            listaComponentesPainel.add(btn_cadastrarCategoria);
            listaComponentesPainel.add(btn_limparCampos_cadastroNovaCategoria);
            listaComponentesPainel.add(jbtn_insercaoQuantidadeProdutoEstoque);
            listaComponentesPainel.add(btn_inserirQuantidadeEstoqueProduto);
            listaComponentesPainel.add(btn_limparCampos_insercaoEstoqueProduto);
            listaComponentesPainel.add(bnt_configurarUsuarios);
            for(JComponent componente: listaComponentesPainel){
                componente.setEnabled(false);
            }
        }else if("Gerenciador".equals(perfil)){
            listaComponentesPainel.add(btn_alteracaoPrecoProduto);
            listaComponentesPainel.add(btn_alteracaoCategoriaProduto);
            listaComponentesPainel.add(btn_exclusaoProduto);
            listaComponentesPainel.add(btn_exclusaoCategoria);
            listaComponentesPainel.add(btn_alteracaoDescricaoCategoria);
            listaComponentesPainel.add(bnt_configurarUsuarios);
            for(JComponent componente: listaComponentesPainel){
                componente.setEnabled(false);
            }
        }
    }

    public final void Inicializacao(){
        
        campo_codigoProdutoPesquisado.setEnabled(false);
        campo_descricaoProdutoPesquisado.setEnabled(false);  
        campo_valorProdutoPesquisado.setEnabled(false);
        campo_nomeUsuarioLogado.setEditable(false);
        campo_codigoCategoriaPesquisada.setEnabled(false);
        campo_txt_descricaoCategoriaPesquisada.setEnabled(false);
        campo_codigoNovaCategoria.setEnabled(false);
        campo_descricaoNovaCategoria.setEnabled(false);
        campo_codigoProduto_paraInsercaoEstoque.setEnabled(false);
        campo_quantidadeInsercao_produtoEstoque.setEnabled(false);
        campo_codigoProduto_consultadoEstoque.setEnabled(false);
        campo_txt_quantidadeProdutoEstoque.setEnabled(false);

    }
      
    public SistemaGerenciador() {
        initComponents();
        setResizable(false);
        Inicializacao();
        setLocationRelativeTo(null);
        jbtn_pesquisaNaoSelecionada.setSelected(true);
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngroup_tipoInteracaoCategoria = new javax.swing.ButtonGroup();
        btngroup_tipoInteracaoEstoque = new javax.swing.ButtonGroup();
        btngroup_tipoPesquisaProduto = new javax.swing.ButtonGroup();
        painel_deGuias4 = new javax.swing.JTabbedPane();
        jPanel44 = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        campo_codigoProdutoPesquisado = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        campo_descricaoProdutoPesquisado = new javax.swing.JTextField();
        jbtn_pesquisaProduto_porCodigo = new javax.swing.JRadioButton();
        btn_pesquisaProduto = new javax.swing.JButton();
        btn_limparCamposPesquisaProduto = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel44 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        campo_txt_DescricaoProduto_maisBarato = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        campo_txt_CategoriaProduto_maisBarato = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        campo_txt_PrecoProdutoMaisBarato = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        campo_txt_DescricaoProduto_maisValioso = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        campo_txt_CategoriaProduto_maisValioso = new javax.swing.JTextField();
        campo_txt_PrecoProdutoMaisValioso = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        campo_codigoProduto_paraAlteracao = new javax.swing.JTextField();
        btn_exclusaoProduto = new javax.swing.JButton();
        btn_alteracaoPrecoProduto = new javax.swing.JButton();
        btn_alteracaoCategoriaProduto = new javax.swing.JButton();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel55 = new javax.swing.JLabel();
        btn_exclusaoCategoria = new javax.swing.JButton();
        btn_alteracaoDescricaoCategoria = new javax.swing.JButton();
        campo_codigoCategoria_paraAlteracao = new javax.swing.JTextField();
        btn_alterarDescricaoProduto = new javax.swing.JButton();
        btn_sair = new javax.swing.JButton();
        campo_nomeUsuarioLogado = new javax.swing.JTextField();
        jbtn_pesquisaNaoSelecionada = new javax.swing.JRadioButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        campo_valorProdutoPesquisado = new javax.swing.JTextField();
        bnt_listarProdutoMenorValor = new javax.swing.JButton();
        btn_listarProdutoMaisCaro = new javax.swing.JButton();
        btn_limparCampos_produtoMaiorValor = new javax.swing.JButton();
        btn_limparCampos_produtoMaisBarato = new javax.swing.JButton();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        btn_cadastrarNovoProduto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        campo_txt_perfilUsuario = new javax.swing.JTextField();
        jbtn_pesquisa_porDescricao = new javax.swing.JRadioButton();
        cb_listagemDescricoes = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel42 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        campo_codigoCategoriaPesquisada = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        campo_txt_descricaoCategoriaPesquisada = new javax.swing.JTextField();
        jbtn_pesquisaDeCategoria = new javax.swing.JRadioButton();
        jbtn_cadastroDeNovaCategoria = new javax.swing.JRadioButton();
        btn_pesquisarCategoria = new javax.swing.JButton();
        jSeparator15 = new javax.swing.JSeparator();
        jLabel60 = new javax.swing.JLabel();
        campo_codigoNovaCategoria = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        campo_descricaoNovaCategoria = new javax.swing.JTextField();
        btn_cadastrarCategoria = new javax.swing.JButton();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        btn_limparPesquisaCategoria = new javax.swing.JButton();
        btn_limparCampos_cadastroNovaCategoria = new javax.swing.JButton();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel39 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        btn_listarProdutosCadastrados = new javax.swing.JButton();
        jSeparator18 = new javax.swing.JSeparator();
        cb_listagemProdutos = new javax.swing.JComboBox<>();
        jLabel65 = new javax.swing.JLabel();
        btn_limparListagem = new javax.swing.JButton();
        jPanel40 = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        jbtn_insercaoQuantidadeProdutoEstoque = new javax.swing.JRadioButton();
        jLabel67 = new javax.swing.JLabel();
        campo_codigoProduto_paraInsercaoEstoque = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        campo_quantidadeInsercao_produtoEstoque = new javax.swing.JTextField();
        jbtn_consultaQuantidadeProdutoEstoque = new javax.swing.JRadioButton();
        jLabel69 = new javax.swing.JLabel();
        campo_codigoProduto_consultadoEstoque = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        campo_txt_quantidadeProdutoEstoque = new javax.swing.JTextField();
        btn_pesquisarQuantidadeProdutoEstoque = new javax.swing.JButton();
        btn_inserirQuantidadeEstoqueProduto = new javax.swing.JButton();
        jSeparator19 = new javax.swing.JSeparator();
        btn_cancelarPesquisa_estoqueProduto = new javax.swing.JButton();
        btn_limparCampos_insercaoEstoqueProduto = new javax.swing.JButton();
        jSeparator20 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel41 = new javax.swing.JPanel();
        jLabel71 = new javax.swing.JLabel();
        bnt_configurarUsuarios = new javax.swing.JButton();
        jLabel72 = new javax.swing.JLabel();
        jSeparator21 = new javax.swing.JSeparator();
        jSeparator22 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        btn_trocarUsuarioLogado = new javax.swing.JButton();
        bnt_informacoes = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel74 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painel_deGuias4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPanel43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jPanel37.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisar Produtos:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 9))); // NOI18N
        jPanel37.setOpaque(false);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel17.setText(" CÓDIGO DO PRODUTO: ");
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));

        campo_codigoProdutoPesquisado.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        campo_codigoProdutoPesquisado.setForeground(new java.awt.Color(51, 0, 153));
        campo_codigoProdutoPesquisado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campo_codigoProdutoPesquisado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        campo_codigoProdutoPesquisado.setDisabledTextColor(new java.awt.Color(51, 0, 153));
        campo_codigoProdutoPesquisado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campo_codigoProdutoPesquisadoKeyPressed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel18.setText(" DESCRIÇÃO: ");
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));

        campo_descricaoProdutoPesquisado.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        campo_descricaoProdutoPesquisado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campo_descricaoProdutoPesquisado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        campo_descricaoProdutoPesquisado.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        btngroup_tipoPesquisaProduto.add(jbtn_pesquisaProduto_porCodigo);
        jbtn_pesquisaProduto_porCodigo.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jbtn_pesquisaProduto_porCodigo.setForeground(new java.awt.Color(0, 0, 102));
        jbtn_pesquisaProduto_porCodigo.setText("Pesquisar por código de cadastro");
        jbtn_pesquisaProduto_porCodigo.setToolTipText("Métodos de pesquisas possíveis");
        jbtn_pesquisaProduto_porCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_pesquisaProduto_porCodigoActionPerformed(evt);
            }
        });

        btn_pesquisaProduto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_pesquisaProduto.setForeground(new java.awt.Color(0, 51, 0));
        btn_pesquisaProduto.setText("Pesquisar");
        btn_pesquisaProduto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_pesquisaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesquisaProdutoActionPerformed(evt);
            }
        });

        btn_limparCamposPesquisaProduto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_limparCamposPesquisaProduto.setForeground(new java.awt.Color(102, 0, 0));
        btn_limparCamposPesquisaProduto.setText("X");
        btn_limparCamposPesquisaProduto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_limparCamposPesquisaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparCamposPesquisaProdutoActionPerformed(evt);
            }
        });

        jSeparator10.setForeground(new java.awt.Color(102, 102, 102));

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 0, 102));
        jLabel44.setText(" Produto com menor valor: ");
        jLabel44.setToolTipText("Pesquisa que resulta no produto mais barato cadastrado no banco de dados");

        jPanel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel45.setText(" DESCRIÇÃO: ");
        jLabel45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));

        campo_txt_DescricaoProduto_maisBarato.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        campo_txt_DescricaoProduto_maisBarato.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campo_txt_DescricaoProduto_maisBarato.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel46.setText(" CATEGORIA: ");
        jLabel46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));

        campo_txt_CategoriaProduto_maisBarato.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        campo_txt_CategoriaProduto_maisBarato.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campo_txt_CategoriaProduto_maisBarato.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_txt_DescricaoProduto_maisBarato, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jLabel46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_txt_CategoriaProduto_maisBarato)))
                .addGap(10, 10, 10))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(campo_txt_DescricaoProduto_maisBarato, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(campo_txt_CategoriaProduto_maisBarato, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(0, 0, 102));
        jLabel47.setText(" PREÇO:");

        campo_txt_PrecoProdutoMaisBarato.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        campo_txt_PrecoProdutoMaisBarato.setForeground(new java.awt.Color(0, 102, 51));
        campo_txt_PrecoProdutoMaisBarato.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campo_txt_PrecoProdutoMaisBarato.setToolTipText("Pesquisa que resulta no produto mais barato cadastrado no banco de dados");
        campo_txt_PrecoProdutoMaisBarato.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(0, 0, 102));
        jLabel48.setText(" Produto com maior valor:");
        jLabel48.setToolTipText("Pesquisa que resulta no produto mais caro cadastrado no banco de dados");

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 0, 102));
        jLabel49.setText(" PREÇO:");

        jPanel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel50.setText(" DESCRIÇÃO: ");
        jLabel50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));

        campo_txt_DescricaoProduto_maisValioso.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        campo_txt_DescricaoProduto_maisValioso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campo_txt_DescricaoProduto_maisValioso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel51.setText(" CATEGORIA: ");
        jLabel51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));

        campo_txt_CategoriaProduto_maisValioso.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        campo_txt_CategoriaProduto_maisValioso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campo_txt_CategoriaProduto_maisValioso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jLabel50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_txt_DescricaoProduto_maisValioso))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jLabel51)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_txt_CategoriaProduto_maisValioso)))
                .addGap(10, 10, 10))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(campo_txt_DescricaoProduto_maisValioso, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(campo_txt_CategoriaProduto_maisValioso, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        campo_txt_PrecoProdutoMaisValioso.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        campo_txt_PrecoProdutoMaisValioso.setForeground(new java.awt.Color(0, 102, 51));
        campo_txt_PrecoProdutoMaisValioso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campo_txt_PrecoProdutoMaisValioso.setToolTipText("Pesquisa que resulta no produto mais caro cadastrado no banco de dados");
        campo_txt_PrecoProdutoMaisValioso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel52.setText(" R$ ");
        jLabel52.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel53.setText(" R$ ");
        jLabel53.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alterações:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 9), new java.awt.Color(51, 51, 51))); // NOI18N

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel54.setText(" CÓDIGO PRODUTO: ");
        jLabel54.setToolTipText("Todas as alterações possíveis \nrelacionadas aos PRODUTOS");
        jLabel54.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));

        campo_codigoProduto_paraAlteracao.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        campo_codigoProduto_paraAlteracao.setForeground(new java.awt.Color(51, 0, 153));
        campo_codigoProduto_paraAlteracao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campo_codigoProduto_paraAlteracao.setToolTipText("Todas as alterações possíveis \nrelacionadas aos PRODUTOS");
        campo_codigoProduto_paraAlteracao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_exclusaoProduto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_exclusaoProduto.setForeground(new java.awt.Color(153, 0, 0));
        btn_exclusaoProduto.setText("Excluir");
        btn_exclusaoProduto.setToolTipText("Alterações não permitidas");
        btn_exclusaoProduto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_exclusaoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exclusaoProdutoActionPerformed(evt);
            }
        });

        btn_alteracaoPrecoProduto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_alteracaoPrecoProduto.setForeground(new java.awt.Color(0, 102, 51));
        btn_alteracaoPrecoProduto.setText(" Preço");
        btn_alteracaoPrecoProduto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_alteracaoPrecoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alteracaoPrecoProdutoActionPerformed(evt);
            }
        });

        btn_alteracaoCategoriaProduto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_alteracaoCategoriaProduto.setForeground(new java.awt.Color(51, 51, 0));
        btn_alteracaoCategoriaProduto.setText("Categoria");
        btn_alteracaoCategoriaProduto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_alteracaoCategoriaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alteracaoCategoriaProdutoActionPerformed(evt);
            }
        });

        jSeparator11.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel55.setText(" CÓDIGO CATEGORIA: ");
        jLabel55.setToolTipText("Todas as alterações possíveis \nrelacionadas as CATEGORIAS");
        jLabel55.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));

        btn_exclusaoCategoria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_exclusaoCategoria.setText("Excluir");
        btn_exclusaoCategoria.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_exclusaoCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exclusaoCategoriaActionPerformed(evt);
            }
        });

        btn_alteracaoDescricaoCategoria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_alteracaoDescricaoCategoria.setForeground(new java.awt.Color(51, 51, 0));
        btn_alteracaoDescricaoCategoria.setText("Descrição");
        btn_alteracaoDescricaoCategoria.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_alteracaoDescricaoCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alteracaoDescricaoCategoriaActionPerformed(evt);
            }
        });

        campo_codigoCategoria_paraAlteracao.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        campo_codigoCategoria_paraAlteracao.setForeground(new java.awt.Color(51, 0, 153));
        campo_codigoCategoria_paraAlteracao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campo_codigoCategoria_paraAlteracao.setToolTipText("Todas as alterações possíveis \nrelacionadas as CATEGORIAS");
        campo_codigoCategoria_paraAlteracao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_alterarDescricaoProduto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_alterarDescricaoProduto.setText("Descrição");
        btn_alterarDescricaoProduto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_alterarDescricaoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarDescricaoProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel54)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_codigoProduto_paraAlteracao, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_alteracaoPrecoProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_exclusaoProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_alterarDescricaoProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                            .addComponent(btn_alteracaoCategoriaProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(btn_exclusaoCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_alteracaoDescricaoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel55)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_codigoCategoria_paraAlteracao)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_codigoProduto_paraAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_exclusaoProduto)
                    .addComponent(btn_alteracaoCategoriaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_alteracaoPrecoProduto)
                    .addComponent(btn_alterarDescricaoProduto))
                .addGap(26, 26, 26))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel55)
                            .addComponent(campo_codigoCategoria_paraAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_alteracaoDescricaoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_exclusaoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btn_sair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_sair.setForeground(new java.awt.Color(204, 0, 0));
        btn_sair.setText("Sair");
        btn_sair.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });

        campo_nomeUsuarioLogado.setBackground(new java.awt.Color(255, 255, 204));
        campo_nomeUsuarioLogado.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        campo_nomeUsuarioLogado.setForeground(new java.awt.Color(0, 0, 153));
        campo_nomeUsuarioLogado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campo_nomeUsuarioLogado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        btngroup_tipoPesquisaProduto.add(jbtn_pesquisaNaoSelecionada);
        jbtn_pesquisaNaoSelecionada.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jbtn_pesquisaNaoSelecionada.setForeground(new java.awt.Color(0, 0, 102));
        jbtn_pesquisaNaoSelecionada.setText("Sem pesquisa");
        jbtn_pesquisaNaoSelecionada.setToolTipText("Métodos de pesquisas possíveis");
        jbtn_pesquisaNaoSelecionada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_pesquisaNaoSelecionadaActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText(" Usuário: ");

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel56.setText(" VALOR: ");
        jLabel56.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));

        campo_valorProdutoPesquisado.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        campo_valorProdutoPesquisado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campo_valorProdutoPesquisado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        campo_valorProdutoPesquisado.setDisabledTextColor(new java.awt.Color(0, 102, 51));

        bnt_listarProdutoMenorValor.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        bnt_listarProdutoMenorValor.setText("Listar");
        bnt_listarProdutoMenorValor.setToolTipText("Pesquisa que resulta no produto mais barato cadastrado no banco de dados");
        bnt_listarProdutoMenorValor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bnt_listarProdutoMenorValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_listarProdutoMenorValorActionPerformed(evt);
            }
        });

        btn_listarProdutoMaisCaro.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btn_listarProdutoMaisCaro.setText("Listar");
        btn_listarProdutoMaisCaro.setToolTipText("Pesquisa que resulta no produto mais caro cadastrado no banco de dados");
        btn_listarProdutoMaisCaro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_listarProdutoMaisCaro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listarProdutoMaisCaroActionPerformed(evt);
            }
        });

        btn_limparCampos_produtoMaiorValor.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btn_limparCampos_produtoMaiorValor.setForeground(new java.awt.Color(102, 0, 0));
        btn_limparCampos_produtoMaiorValor.setText("X");
        btn_limparCampos_produtoMaiorValor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_limparCampos_produtoMaiorValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparCampos_produtoMaiorValorActionPerformed(evt);
            }
        });

        btn_limparCampos_produtoMaisBarato.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btn_limparCampos_produtoMaisBarato.setForeground(new java.awt.Color(102, 0, 0));
        btn_limparCampos_produtoMaisBarato.setText("X");
        btn_limparCampos_produtoMaisBarato.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_limparCampos_produtoMaisBarato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparCampos_produtoMaisBaratoActionPerformed(evt);
            }
        });

        jSeparator12.setForeground(new java.awt.Color(102, 102, 102));

        jSeparator13.setForeground(new java.awt.Color(102, 102, 102));

        btn_cadastrarNovoProduto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_cadastrarNovoProduto.setForeground(new java.awt.Color(0, 0, 153));
        btn_cadastrarNovoProduto.setText("Cadastrar novo produto");
        btn_cadastrarNovoProduto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_cadastrarNovoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarNovoProdutoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Perfil:");

        campo_txt_perfilUsuario.setBackground(new java.awt.Color(255, 255, 204));
        campo_txt_perfilUsuario.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        campo_txt_perfilUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campo_txt_perfilUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        campo_txt_perfilUsuario.setDisabledTextColor(new java.awt.Color(153, 0, 0));
        campo_txt_perfilUsuario.setEnabled(false);

        btngroup_tipoPesquisaProduto.add(jbtn_pesquisa_porDescricao);
        jbtn_pesquisa_porDescricao.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jbtn_pesquisa_porDescricao.setForeground(new java.awt.Color(0, 0, 102));
        jbtn_pesquisa_porDescricao.setText("Pesquisa por descrição");
        jbtn_pesquisa_porDescricao.setToolTipText("Métodos de pesquisas possíveis");
        jbtn_pesquisa_porDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_pesquisa_porDescricaoActionPerformed(evt);
            }
        });

        cb_listagemDescricoes.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        cb_listagemDescricoes.setToolTipText("Aqui, quando selecionada a pesquisa por DESCRIÇÃO,\nserão listados todos os produtos similares a descrição\n                              pesquisada");
        cb_listagemDescricoes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addComponent(jbtn_pesquisaProduto_porCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtn_pesquisa_porDescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtn_pesquisaNaoSelecionada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel56)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_valorProdutoPesquisado, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_cadastrarNovoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel1))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campo_nomeUsuarioLogado, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                            .addComponent(campo_txt_perfilUsuario))
                        .addGap(18, 18, 18)
                        .addComponent(btn_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel37Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campo_codigoProdutoPesquisado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campo_descricaoProdutoPesquisado, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel37Layout.createSequentialGroup()
                                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel37Layout.createSequentialGroup()
                                        .addComponent(jLabel44)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSeparator12))
                                    .addGroup(jPanel37Layout.createSequentialGroup()
                                        .addComponent(jLabel47)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel52)
                                        .addGap(10, 10, 10)
                                        .addComponent(campo_txt_PrecoProdutoMaisBarato, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bnt_listarProdutoMenorValor, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_limparCampos_produtoMaisBarato, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPanel29, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel37Layout.createSequentialGroup()
                                        .addComponent(jLabel48)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE))
                                    .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createSequentialGroup()
                                        .addComponent(jLabel49)
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel53)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campo_txt_PrecoProdutoMaisValioso)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_listarProdutoMaisCaro, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_limparCampos_produtoMaiorValor, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel37Layout.createSequentialGroup()
                                .addComponent(cb_listagemDescricoes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_pesquisaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_limparCamposPesquisaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jSeparator14)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator10))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(campo_nomeUsuarioLogado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(campo_txt_perfilUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn_sair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jbtn_pesquisaProduto_porCodigo)
                                .addComponent(jbtn_pesquisa_porDescricao)
                                .addComponent(jbtn_pesquisaNaoSelecionada)
                                .addComponent(jLabel56)
                                .addComponent(campo_valorProdutoPesquisado, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_cadastrarNovoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(campo_codigoProdutoPesquisado, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(campo_descricaoProdutoPesquisado, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_pesquisaProduto)
                    .addComponent(btn_limparCamposPesquisaProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_listagemDescricoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel44)
                            .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel48)
                                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel37Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel47)
                            .addComponent(campo_txt_PrecoProdutoMaisBarato, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel49)
                            .addComponent(campo_txt_PrecoProdutoMaisValioso, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel52)
                            .addComponent(jLabel53)
                            .addComponent(btn_listarProdutoMaisCaro)
                            .addComponent(bnt_listarProdutoMenorValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_limparCampos_produtoMaisBarato)
                            .addComponent(btn_limparCampos_produtoMaiorValor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3))
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(22, 22, 22)
                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel42.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 9))); // NOI18N
        jPanel42.setForeground(new java.awt.Color(153, 153, 153));

        jPanel38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel58.setText(" CÓDIGO CATEGORIA:");
        jLabel58.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));

        campo_codigoCategoriaPesquisada.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        campo_codigoCategoriaPesquisada.setForeground(new java.awt.Color(51, 0, 153));
        campo_codigoCategoriaPesquisada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campo_codigoCategoriaPesquisada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel59.setText(" DESCRIÇÃO:");
        jLabel59.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));

        campo_txt_descricaoCategoriaPesquisada.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        campo_txt_descricaoCategoriaPesquisada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campo_txt_descricaoCategoriaPesquisada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        campo_txt_descricaoCategoriaPesquisada.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        btngroup_tipoInteracaoCategoria.add(jbtn_pesquisaDeCategoria);
        jbtn_pesquisaDeCategoria.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jbtn_pesquisaDeCategoria.setForeground(new java.awt.Color(0, 0, 102));
        jbtn_pesquisaDeCategoria.setText("Pesquisar categorias");
        jbtn_pesquisaDeCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_pesquisaDeCategoriaActionPerformed(evt);
            }
        });

        btngroup_tipoInteracaoCategoria.add(jbtn_cadastroDeNovaCategoria);
        jbtn_cadastroDeNovaCategoria.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jbtn_cadastroDeNovaCategoria.setForeground(new java.awt.Color(0, 0, 102));
        jbtn_cadastroDeNovaCategoria.setText(" Cadastrar nova categoria");
        jbtn_cadastroDeNovaCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_cadastroDeNovaCategoriaActionPerformed(evt);
            }
        });

        btn_pesquisarCategoria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_pesquisarCategoria.setForeground(new java.awt.Color(0, 51, 0));
        btn_pesquisarCategoria.setText("Pesquisar");
        btn_pesquisarCategoria.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_pesquisarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesquisarCategoriaActionPerformed(evt);
            }
        });

        jSeparator15.setForeground(new java.awt.Color(102, 102, 102));

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel60.setText(" CÓDIGO:");
        jLabel60.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));

        campo_codigoNovaCategoria.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        campo_codigoNovaCategoria.setForeground(new java.awt.Color(51, 0, 153));
        campo_codigoNovaCategoria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campo_codigoNovaCategoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        campo_codigoNovaCategoria.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel61.setText(" DESCRIÇÃO:");
        jLabel61.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));

        campo_descricaoNovaCategoria.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        campo_descricaoNovaCategoria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campo_descricaoNovaCategoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        campo_descricaoNovaCategoria.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        btn_cadastrarCategoria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_cadastrarCategoria.setForeground(new java.awt.Color(51, 0, 153));
        btn_cadastrarCategoria.setText("Cadastrar");
        btn_cadastrarCategoria.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_cadastrarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarCategoriaActionPerformed(evt);
            }
        });

        jLabel62.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(51, 51, 51));
        jLabel62.setText("O código deve ser numérico de até 5 digitos");

        jLabel63.setBackground(new java.awt.Color(255, 204, 51));
        jLabel63.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setText("Categorias");
        jLabel63.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        jLabel63.setOpaque(true);

        btn_limparPesquisaCategoria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_limparPesquisaCategoria.setForeground(new java.awt.Color(102, 0, 0));
        btn_limparPesquisaCategoria.setText("X");
        btn_limparPesquisaCategoria.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_limparPesquisaCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparPesquisaCategoriaActionPerformed(evt);
            }
        });

        btn_limparCampos_cadastroNovaCategoria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_limparCampos_cadastroNovaCategoria.setForeground(new java.awt.Color(102, 0, 0));
        btn_limparCampos_cadastroNovaCategoria.setText("X");
        btn_limparCampos_cadastroNovaCategoria.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_limparCampos_cadastroNovaCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparCampos_cadastroNovaCategoriaActionPerformed(evt);
            }
        });

        jSeparator16.setForeground(new java.awt.Color(102, 102, 102));

        jSeparator17.setForeground(new java.awt.Color(102, 102, 102));

        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator15)
            .addComponent(jLabel63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jbtn_pesquisaDeCategoria)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addComponent(jLabel61)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_descricaoNovaCategoria))
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addComponent(jLabel60)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campo_codigoNovaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_cadastrarCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel62, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addComponent(jLabel59)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_txt_descricaoCategoriaPesquisada))
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addComponent(jLabel58)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campo_codigoCategoriaPesquisada, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_pesquisarCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jSeparator16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_limparPesquisaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addComponent(jbtn_cadastroDeNovaCategoria)
                        .addGap(6, 6, 6)
                        .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_limparCampos_cadastroNovaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2))
                .addContainerGap())
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel38Layout.createSequentialGroup()
                            .addComponent(btn_limparPesquisaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(5, 5, 5))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel38Layout.createSequentialGroup()
                            .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addComponent(jbtn_pesquisaDeCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(campo_codigoCategoriaPesquisada, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_pesquisarCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(campo_txt_descricaoCategoriaPesquisada, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_limparCampos_cadastroNovaCategoria)
                        .addComponent(jbtn_cadastroDeNovaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabel62)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(campo_codigoNovaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cadastrarCategoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(campo_descricaoNovaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jPanel39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel64.setBackground(new java.awt.Color(255, 204, 51));
        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel64.setText("Listagem de Produtos");
        jLabel64.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        jLabel64.setOpaque(true);

        btn_listarProdutosCadastrados.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_listarProdutosCadastrados.setForeground(new java.awt.Color(0, 51, 0));
        btn_listarProdutosCadastrados.setText("Listar");
        btn_listarProdutosCadastrados.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_listarProdutosCadastrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listarProdutosCadastradosActionPerformed(evt);
            }
        });

        jSeparator18.setForeground(new java.awt.Color(102, 102, 102));

        cb_listagemProdutos.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        cb_listagemProdutos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cb_listagemProdutos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(51, 51, 51));
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setText("Os produtos são listados por seus códigos e descrições");
        jLabel65.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        btn_limparListagem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_limparListagem.setText("Cancelar");
        btn_limparListagem.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_limparListagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparListagemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_listagemProdutos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addComponent(btn_limparListagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_listarProdutosCadastrados, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel39Layout.createSequentialGroup()
                .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_listarProdutosCadastrados, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_limparListagem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel65)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cb_listagemProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel66.setBackground(new java.awt.Color(255, 204, 51));
        jLabel66.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel66.setText("Estoque");
        jLabel66.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        jLabel66.setOpaque(true);

        btngroup_tipoInteracaoEstoque.add(jbtn_insercaoQuantidadeProdutoEstoque);
        jbtn_insercaoQuantidadeProdutoEstoque.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jbtn_insercaoQuantidadeProdutoEstoque.setForeground(new java.awt.Color(0, 0, 102));
        jbtn_insercaoQuantidadeProdutoEstoque.setText("Inserir quantidade no estoque");
        jbtn_insercaoQuantidadeProdutoEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_insercaoQuantidadeProdutoEstoqueActionPerformed(evt);
            }
        });

        jLabel67.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel67.setText(" CÓDIGO PRODUTO: ");
        jLabel67.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));

        campo_codigoProduto_paraInsercaoEstoque.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        campo_codigoProduto_paraInsercaoEstoque.setForeground(new java.awt.Color(51, 0, 153));
        campo_codigoProduto_paraInsercaoEstoque.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campo_codigoProduto_paraInsercaoEstoque.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        campo_codigoProduto_paraInsercaoEstoque.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jLabel68.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel68.setText(" QTD A SER INSERIDA: ");
        jLabel68.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));

        campo_quantidadeInsercao_produtoEstoque.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        campo_quantidadeInsercao_produtoEstoque.setForeground(new java.awt.Color(51, 51, 0));
        campo_quantidadeInsercao_produtoEstoque.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campo_quantidadeInsercao_produtoEstoque.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        campo_quantidadeInsercao_produtoEstoque.setDisabledTextColor(new java.awt.Color(51, 51, 0));

        btngroup_tipoInteracaoEstoque.add(jbtn_consultaQuantidadeProdutoEstoque);
        jbtn_consultaQuantidadeProdutoEstoque.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jbtn_consultaQuantidadeProdutoEstoque.setForeground(new java.awt.Color(0, 0, 102));
        jbtn_consultaQuantidadeProdutoEstoque.setText("Ver quantidade em estoque");
        jbtn_consultaQuantidadeProdutoEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_consultaQuantidadeProdutoEstoqueActionPerformed(evt);
            }
        });

        jLabel69.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel69.setText(" CÓDIGO PRODUTO: ");
        jLabel69.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));

        campo_codigoProduto_consultadoEstoque.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        campo_codigoProduto_consultadoEstoque.setForeground(new java.awt.Color(51, 0, 153));
        campo_codigoProduto_consultadoEstoque.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campo_codigoProduto_consultadoEstoque.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        campo_codigoProduto_consultadoEstoque.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jLabel70.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel70.setText(" QUANTIDADE: ");
        jLabel70.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));

        campo_txt_quantidadeProdutoEstoque.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        campo_txt_quantidadeProdutoEstoque.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campo_txt_quantidadeProdutoEstoque.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        campo_txt_quantidadeProdutoEstoque.setDisabledTextColor(new java.awt.Color(51, 51, 0));

        btn_pesquisarQuantidadeProdutoEstoque.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_pesquisarQuantidadeProdutoEstoque.setForeground(new java.awt.Color(0, 51, 0));
        btn_pesquisarQuantidadeProdutoEstoque.setText("Pesquisar");
        btn_pesquisarQuantidadeProdutoEstoque.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_pesquisarQuantidadeProdutoEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesquisarQuantidadeProdutoEstoqueActionPerformed(evt);
            }
        });

        btn_inserirQuantidadeEstoqueProduto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_inserirQuantidadeEstoqueProduto.setForeground(new java.awt.Color(51, 0, 153));
        btn_inserirQuantidadeEstoqueProduto.setText("Inserir");
        btn_inserirQuantidadeEstoqueProduto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_inserirQuantidadeEstoqueProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inserirQuantidadeEstoqueProdutoActionPerformed(evt);
            }
        });

        jSeparator19.setForeground(new java.awt.Color(102, 102, 102));

        btn_cancelarPesquisa_estoqueProduto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_cancelarPesquisa_estoqueProduto.setText("Cancelar");
        btn_cancelarPesquisa_estoqueProduto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_cancelarPesquisa_estoqueProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarPesquisa_estoqueProdutoActionPerformed(evt);
            }
        });

        btn_limparCampos_insercaoEstoqueProduto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_limparCampos_insercaoEstoqueProduto.setForeground(new java.awt.Color(102, 0, 0));
        btn_limparCampos_insercaoEstoqueProduto.setText("X");
        btn_limparCampos_insercaoEstoqueProduto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_limparCampos_insercaoEstoqueProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparCampos_insercaoEstoqueProdutoActionPerformed(evt);
            }
        });

        jSeparator20.setForeground(new java.awt.Color(102, 102, 102));

        jSeparator6.setForeground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator6)
                    .addComponent(jSeparator20)
                    .addComponent(jSeparator19)
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addComponent(btn_cancelarPesquisa_estoqueProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btn_pesquisarQuantidadeProdutoEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addComponent(btn_limparCampos_insercaoEstoqueProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_inserirQuantidadeEstoqueProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addComponent(jLabel68)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_quantidadeInsercao_produtoEstoque))
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addComponent(jLabel67)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_codigoProduto_paraInsercaoEstoque))
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addComponent(jLabel69)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_codigoProduto_consultadoEstoque))
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addComponent(jLabel70)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_txt_quantidadeProdutoEstoque))
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtn_insercaoQuantidadeProdutoEstoque)
                            .addComponent(jbtn_consultaQuantidadeProdutoEstoque))
                        .addGap(0, 7, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtn_insercaoQuantidadeProdutoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67)
                    .addComponent(campo_codigoProduto_paraInsercaoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68)
                    .addComponent(campo_quantidadeInsercao_produtoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_inserirQuantidadeEstoqueProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addComponent(btn_limparCampos_insercaoEstoqueProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtn_consultaQuantidadeProdutoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69)
                    .addComponent(campo_codigoProduto_consultadoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel70)
                    .addComponent(campo_txt_quantidadeProdutoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_pesquisarQuantidadeProdutoEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(btn_cancelarPesquisa_estoqueProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel71.setBackground(new java.awt.Color(255, 204, 51));
        jLabel71.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel71.setText("Usuários");
        jLabel71.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        jLabel71.setOpaque(true);

        bnt_configurarUsuarios.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bnt_configurarUsuarios.setText("Configurar usuários");
        bnt_configurarUsuarios.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bnt_configurarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_configurarUsuariosActionPerformed(evt);
            }
        });

        jLabel72.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(51, 51, 51));
        jLabel72.setText(" Alteração de perfil | Cadastro de Novo Usuário | Exclusão ");

        jSeparator21.setForeground(new java.awt.Color(102, 102, 102));

        jSeparator22.setForeground(new java.awt.Color(102, 102, 102));

        jSeparator3.setForeground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel72)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator22)
                            .addComponent(jSeparator21))))
                .addContainerGap())
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(bnt_configurarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel72)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator22, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(bnt_configurarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator21, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel73.setBackground(new java.awt.Color(255, 204, 51));
        jLabel73.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel73.setText("Sobre");
        jLabel73.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        jLabel73.setOpaque(true);

        btn_trocarUsuarioLogado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_trocarUsuarioLogado.setText("Trocar Usuário");
        btn_trocarUsuarioLogado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_trocarUsuarioLogado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_trocarUsuarioLogadoActionPerformed(evt);
            }
        });

        bnt_informacoes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bnt_informacoes.setText("Informações");
        bnt_informacoes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bnt_informacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_informacoesActionPerformed(evt);
            }
        });

        jSeparator4.setForeground(new java.awt.Color(153, 153, 153));

        jSeparator5.setForeground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel73, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_trocarUsuarioLogado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bnt_informacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(btn_trocarUsuarioLogado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bnt_informacoes)
                .addGap(18, 18, 18)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addComponent(jPanel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLabel74.setBackground(new java.awt.Color(255, 204, 51));
        jLabel74.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel74.setText("Produtos");
        jLabel74.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        jLabel74.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("  Gerenciador de Produtos de Papelaria - 1.0  ");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel74, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel42, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        painel_deGuias4.addTab("Informações", jPanel44);

        getContentPane().add(painel_deGuias4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getAccessibleContext().setAccessibleName("JFramePrincipal");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bnt_informacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_informacoesActionPerformed
        TelaInformacoes telaInformativa = new TelaInformacoes();
        setVisible(false);
        telaInformativa.Insercao(this);
        telaInformativa.setVisible(true);
    }//GEN-LAST:event_bnt_informacoesActionPerformed

    private void btn_trocarUsuarioLogadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_trocarUsuarioLogadoActionPerformed
        int telaOpcao = JOptionPane.showConfirmDialog(null,"Deseja realmente trocar de usuário?","Aviso",JOptionPane.OK_CANCEL_OPTION);
        if(telaOpcao == JOptionPane.OK_OPTION){
            TelaDeLogin telaNovoLogin = new TelaDeLogin();
            setVisible(false);
            telaNovoLogin.AlterarTitulo("Novo Login");
            telaNovoLogin.setVisible(true); 
        }              
    }//GEN-LAST:event_btn_trocarUsuarioLogadoActionPerformed

    private void btn_limparCampos_insercaoEstoqueProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparCampos_insercaoEstoqueProdutoActionPerformed
        campo_codigoProduto_paraInsercaoEstoque.setText("");
        campo_quantidadeInsercao_produtoEstoque.setText("");
    }//GEN-LAST:event_btn_limparCampos_insercaoEstoqueProdutoActionPerformed

    private void btn_cancelarPesquisa_estoqueProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarPesquisa_estoqueProdutoActionPerformed
        campo_codigoProduto_consultadoEstoque.setText("");
        campo_txt_quantidadeProdutoEstoque.setText("");
    }//GEN-LAST:event_btn_cancelarPesquisa_estoqueProdutoActionPerformed

    private void btn_inserirQuantidadeEstoqueProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inserirQuantidadeEstoqueProdutoActionPerformed
        int codigoProdutoTraduzido = JSType.toInteger(campo_codigoProduto_paraInsercaoEstoque.getText());
        int codigoProdutoPesquisado;
        DadosProdutos produtoPesquisado = new DadosProdutos();
        int quantidadeProduto = JSType.toInteger(campo_quantidadeInsercao_produtoEstoque.getText());
        Parametros insercaoProduto = new Parametros();
        produtoPesquisado = insercaoProduto.PesquisarProdutoPorCodigo(codigoProdutoTraduzido);
        codigoProdutoPesquisado = produtoPesquisado.getCodigoProduto();
        if(codigoProdutoTraduzido != codigoProdutoPesquisado){
            JOptionPane.showMessageDialog(null,"Não existe nenhum produto com o código informado para inserção em estoque!","Aviso",JOptionPane.WARNING_MESSAGE);
        }else{
            insercaoProduto.InserirQuantidadeEstoqueProduto(codigoProdutoTraduzido,quantidadeProduto);
            campo_codigoProduto_paraInsercaoEstoque.setText("");
            campo_quantidadeInsercao_produtoEstoque.setText("");
            JOptionPane.showMessageDialog(null,"Estoque alterado com sucesso!","Alteraçaõ segura",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_inserirQuantidadeEstoqueProdutoActionPerformed

    private void btn_pesquisarQuantidadeProdutoEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquisarQuantidadeProdutoEstoqueActionPerformed
        int codigoProdutoTraduzido = JSType.toInteger(campo_codigoProduto_consultadoEstoque.getText());
        int codigoProdutoPesquisado;
        DadosProdutos produtoPesquisado;
        Parametros consultaProduto = new Parametros();
        produtoPesquisado = consultaProduto.PesquisarQuantidadeEstoqueProduto(codigoProdutoTraduzido);
        codigoProdutoPesquisado = produtoPesquisado.getCodigoProduto();
        if(codigoProdutoTraduzido != codigoProdutoPesquisado){
            JOptionPane.showMessageDialog(null,"Não existe nenhum produto com o código informado para pesquisa!","Aviso",JOptionPane.WARNING_MESSAGE);
        }else{
            String quantidadeTraduzida = Integer.toString(produtoPesquisado.getQuantidadeEstoque());
            campo_txt_quantidadeProdutoEstoque.setText(quantidadeTraduzida+" UN");
        }
    }//GEN-LAST:event_btn_pesquisarQuantidadeProdutoEstoqueActionPerformed

    private void jbtn_consultaQuantidadeProdutoEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_consultaQuantidadeProdutoEstoqueActionPerformed
        if(jbtn_consultaQuantidadeProdutoEstoque.isSelected() ==  true){
            campo_codigoProduto_paraInsercaoEstoque.setEnabled(false);
            campo_codigoProduto_consultadoEstoque.setEnabled(true);
        }
    }//GEN-LAST:event_jbtn_consultaQuantidadeProdutoEstoqueActionPerformed

    private void jbtn_insercaoQuantidadeProdutoEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_insercaoQuantidadeProdutoEstoqueActionPerformed
        if(jbtn_insercaoQuantidadeProdutoEstoque.isSelected() ==  true){
            campo_codigoProduto_consultadoEstoque.setEnabled(false);
            campo_codigoProduto_paraInsercaoEstoque.setEnabled(true);
            campo_quantidadeInsercao_produtoEstoque.setEnabled(true);
        }
    }//GEN-LAST:event_jbtn_insercaoQuantidadeProdutoEstoqueActionPerformed

    private void btn_listarProdutosCadastradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listarProdutosCadastradosActionPerformed
       DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_listagemProdutos.getModel();
       ArrayList<Object> listaProdutos;
       Parametros listagemProdutos = new Parametros();
       listaProdutos = listagemProdutos.ListagemCompletaProdutos();
       for(int i = 0;i<listaProdutos.size();i++){
           modelo.addElement(listaProdutos.get(i));
       }
    }//GEN-LAST:event_btn_listarProdutosCadastradosActionPerformed

    private void btn_limparCampos_cadastroNovaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparCampos_cadastroNovaCategoriaActionPerformed
        campo_codigoNovaCategoria.setText("");
        campo_descricaoNovaCategoria.setText("");
    }//GEN-LAST:event_btn_limparCampos_cadastroNovaCategoriaActionPerformed

    private void btn_limparPesquisaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparPesquisaCategoriaActionPerformed
        campo_codigoCategoriaPesquisada.setText("");
        campo_txt_descricaoCategoriaPesquisada.setText("");
    }//GEN-LAST:event_btn_limparPesquisaCategoriaActionPerformed

    private void btn_cadastrarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarCategoriaActionPerformed
        int codigoCategoriaTraduzido = JSType.toInteger(campo_codigoNovaCategoria.getText());
        String descricaoCategoria = campo_descricaoNovaCategoria.getText();
        Parametros cadastroCategoria = new Parametros();
        int codigoCategoriaEncontrado;
        DadosCategorias categoriaConsulta;
        categoriaConsulta = cadastroCategoria.PesquisarCategoria(codigoCategoriaTraduzido);
        codigoCategoriaEncontrado = categoriaConsulta.getCodigoCategoria();
        if(codigoCategoriaEncontrado == codigoCategoriaTraduzido){
            JOptionPane.showMessageDialog(null,"O código informado para cadastro pertence a outra categoria","Aviso",JOptionPane.WARNING_MESSAGE);
        }else{
        cadastroCategoria.CadastrarNovaCategoria(codigoCategoriaTraduzido, descricaoCategoria);
        campo_codigoNovaCategoria.setText("");
        campo_descricaoNovaCategoria.setText("");
        }
    }//GEN-LAST:event_btn_cadastrarCategoriaActionPerformed

    private void btn_pesquisarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquisarCategoriaActionPerformed
        if("".equals(campo_codigoCategoriaPesquisada.getText())){
            JOptionPane.showMessageDialog(null,"Nenhum código de categoria informada para pesquisa!","Aviso",JOptionPane.WARNING_MESSAGE);
        }else{
            int codigoCategoriaTraduzido = JSType.toInteger(campo_codigoCategoriaPesquisada.getText());
            int codigoCategoriaEncontrado;
            DadosCategorias categoriaPesquisada;
            Parametros consultaCategoria = new Parametros();
            categoriaPesquisada = consultaCategoria.PesquisarCategoria(codigoCategoriaTraduzido);
            codigoCategoriaEncontrado = categoriaPesquisada.getCodigoCategoria();
            if(codigoCategoriaTraduzido != codigoCategoriaEncontrado){
                JOptionPane.showMessageDialog(null,"Não existe nenhuma categoria com o código informado","Aviso",JOptionPane.WARNING_MESSAGE);
            }else{
                campo_txt_descricaoCategoriaPesquisada.setText(categoriaPesquisada.getDescricaoCategoria());
            }
        }
    }//GEN-LAST:event_btn_pesquisarCategoriaActionPerformed

    private void jbtn_cadastroDeNovaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_cadastroDeNovaCategoriaActionPerformed
        if(jbtn_cadastroDeNovaCategoria.isSelected() == true){
            campo_codigoNovaCategoria.setEnabled(true);
            campo_codigoCategoriaPesquisada.setEnabled(false);
            campo_descricaoNovaCategoria.setEnabled(true);
        }
    }//GEN-LAST:event_jbtn_cadastroDeNovaCategoriaActionPerformed

    private void jbtn_pesquisaDeCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_pesquisaDeCategoriaActionPerformed
        if(jbtn_pesquisaDeCategoria.isSelected() ==  true){
            campo_codigoCategoriaPesquisada.setEnabled(true); 
            campo_codigoNovaCategoria.setEnabled(false);
        }
    }//GEN-LAST:event_jbtn_pesquisaDeCategoriaActionPerformed

    private void btn_limparListagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparListagemActionPerformed
        DefaultComboBoxModel modeloLimpo =  new DefaultComboBoxModel(); 
        cb_listagemProdutos.setModel(modeloLimpo);
    }//GEN-LAST:event_btn_limparListagemActionPerformed

    private void bnt_configurarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_configurarUsuariosActionPerformed
        TelaConfiguracaoUsuarios telaUsuarios = new TelaConfiguracaoUsuarios();
        telaUsuarios.Inicializacao(this);
        setVisible(false);
        telaUsuarios.setVisible(true);
    }//GEN-LAST:event_bnt_configurarUsuariosActionPerformed

    private void btn_cadastrarNovoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarNovoProdutoActionPerformed
        TelaDeCadastroProdutos telaCadastro = new TelaDeCadastroProdutos();
        telaCadastro.Insercao(this);
        setVisible(false);
        telaCadastro.setVisible(true);
    }//GEN-LAST:event_btn_cadastrarNovoProdutoActionPerformed

    private void btn_limparCampos_produtoMaisBaratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparCampos_produtoMaisBaratoActionPerformed
        campo_txt_CategoriaProduto_maisBarato.setText("");
        campo_txt_DescricaoProduto_maisBarato.setText("");
        campo_txt_PrecoProdutoMaisBarato.setText("");
    }//GEN-LAST:event_btn_limparCampos_produtoMaisBaratoActionPerformed

    private void btn_limparCampos_produtoMaiorValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparCampos_produtoMaiorValorActionPerformed
        campo_txt_DescricaoProduto_maisValioso.setText("");
        campo_txt_CategoriaProduto_maisValioso.setText("");
        campo_txt_PrecoProdutoMaisValioso.setText("");
    }//GEN-LAST:event_btn_limparCampos_produtoMaiorValorActionPerformed

    private void btn_listarProdutoMaisCaroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listarProdutoMaisCaroActionPerformed
        DadosProdutos produtoMaiorValor;
        Parametros consultaProduto = new Parametros();
        produtoMaiorValor = consultaProduto.PesquisarProdutoMaisCaro();
        String valorTraduzido = Double.toString(produtoMaiorValor.getValorProduto());
        String codigoCategoriaTraduzida = Integer.toString(produtoMaiorValor.getCodigoCategoria());
        campo_txt_DescricaoProduto_maisValioso.setText(produtoMaiorValor.getDescricaoProduto());
        campo_txt_CategoriaProduto_maisValioso.setText(codigoCategoriaTraduzida);
        campo_txt_PrecoProdutoMaisValioso.setText(valorTraduzido);
    }//GEN-LAST:event_btn_listarProdutoMaisCaroActionPerformed

    private void bnt_listarProdutoMenorValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_listarProdutoMenorValorActionPerformed
        DadosProdutos produtoMenorValor;
        Parametros consultaProduto = new Parametros();
        produtoMenorValor = consultaProduto.PesquisarProdutoMaisBarato();
        campo_txt_DescricaoProduto_maisBarato.setText(produtoMenorValor.getDescricaoProduto());
        String valorTraduzido = Double.toString(produtoMenorValor.getValorProduto());
        String codigoCategoriaTraduzida = Integer.toString(produtoMenorValor.getCodigoCategoria());
        campo_txt_PrecoProdutoMaisBarato.setText(valorTraduzido);
        campo_txt_CategoriaProduto_maisBarato.setText(codigoCategoriaTraduzida);
    }//GEN-LAST:event_bnt_listarProdutoMenorValorActionPerformed

    private void jbtn_pesquisaNaoSelecionadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_pesquisaNaoSelecionadaActionPerformed
        if(jbtn_pesquisaNaoSelecionada.isSelected() ==  true){
            pesquisaProduto = false;
            pesquisaDescricao = false;
        }
    }//GEN-LAST:event_jbtn_pesquisaNaoSelecionadaActionPerformed

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
        int decisao = JOptionPane.showConfirmDialog(null, "Deseja realmente sair "+campo_nomeUsuarioLogado.getText()+" ?","Saindo",JOptionPane.OK_CANCEL_OPTION);
        if(decisao == JOptionPane.OK_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_btn_sairActionPerformed

    private void btn_alteracaoDescricaoCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alteracaoDescricaoCategoriaActionPerformed
        int codigoCategoriaTraduzida = JSType.toInteger(campo_codigoCategoria_paraAlteracao.getText());
        int telaOpcao = JOptionPane.showConfirmDialog(null,"Deseja realmente alterar a descrção da categoria "+codigoCategoriaTraduzida+" ?","Alteração segura",JOptionPane.OK_CANCEL_OPTION);
        if(telaOpcao == JOptionPane.OK_OPTION){
            TelaDeAlteracaoDescricaoCategoria telaAlteracao = new TelaDeAlteracaoDescricaoCategoria();
            telaAlteracao.Insercao(codigoCategoriaTraduzida, this);
            setVisible(false);
            telaAlteracao.setVisible(true);
        }
    }//GEN-LAST:event_btn_alteracaoDescricaoCategoriaActionPerformed

    private void btn_exclusaoCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exclusaoCategoriaActionPerformed
        int codigoCategoriaTraduzido = JSType.toInteger(campo_codigoCategoria_paraAlteracao.getText());
        int telaOpcao = JOptionPane.showConfirmDialog(null,"Deseja realmente excluír a categoria "+codigoCategoriaTraduzido+" ?","Exclusão segura",JOptionPane.OK_CANCEL_OPTION);
        if(telaOpcao == JOptionPane.OK_OPTION){
            Parametros exclusaoCategoria = new Parametros();
            exclusaoCategoria.ExcluirCategoria(codigoCategoriaTraduzido);
        }else{
            JOptionPane.showMessageDialog(null,"Exclusão cancelada","Exclusão segura",JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btn_exclusaoCategoriaActionPerformed

    private void btn_alteracaoCategoriaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alteracaoCategoriaProdutoActionPerformed
        int codigoProdutoTraduzido = JSType.toInteger(campo_codigoProduto_paraAlteracao.getText());
        TelaDeAlteracaoCategoria telaAlteracao = new TelaDeAlteracaoCategoria();
        telaAlteracao.Insercao(codigoProdutoTraduzido, this);
        setVisible(false);
        telaAlteracao.setVisible(true);
    }//GEN-LAST:event_btn_alteracaoCategoriaProdutoActionPerformed

    private void btn_alteracaoPrecoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alteracaoPrecoProdutoActionPerformed
        int codigoTraduzido = JSType.toInteger(campo_codigoProduto_paraAlteracao.getText());
        int telaDecisao = JOptionPane.showConfirmDialog(null,"Deseja realmente alterar o preço do produto "+codigoTraduzido+" ?","Alteração segura",JOptionPane.OK_CANCEL_OPTION);
        Parametros consultaProduto = new Parametros();
        DadosProdutos produto = new DadosProdutos();
        produto = consultaProduto.PesquisarProdutoPorCodigo(codigoTraduzido);
        String valorTraduzido = Double.toString(produto.getValorProduto());
        if(telaDecisao == JOptionPane.OK_OPTION){
            TelaDeAlteracaoProdutos telaAlteracaoPreco = new TelaDeAlteracaoProdutos();
            telaAlteracaoPreco.Inicializacao(codigoTraduzido, valorTraduzido,this);
            setVisible(false);
            telaAlteracaoPreco.setVisible(true);
        }

    }//GEN-LAST:event_btn_alteracaoPrecoProdutoActionPerformed

    private void btn_limparCamposPesquisaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparCamposPesquisaProdutoActionPerformed
        if(pesquisaProduto == true){
            campo_codigoProdutoPesquisado.setText("");
            campo_descricaoProdutoPesquisado.setText("");
            campo_valorProdutoPesquisado.setText("");
        }else if(pesquisaDescricao == true){
            DefaultComboBoxModel modeloPadrao = new DefaultComboBoxModel();
            cb_listagemDescricoes.setModel(modeloPadrao);
            campo_descricaoProdutoPesquisado.setText("");
        }
       
    }//GEN-LAST:event_btn_limparCamposPesquisaProdutoActionPerformed

    private void btn_pesquisaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquisaProdutoActionPerformed
        int codigoProdutoEntradaUsuario = 0;
        int codigoProdutoEncontrado;
        if(pesquisaProduto == true){
            if("".equals(campo_codigoProdutoPesquisado.getText())){
                JOptionPane.showMessageDialog(null,"Nenhum código informado para pesquisa!","Código inválido",JOptionPane.WARNING_MESSAGE);
            }else{
                int codigoTraduzido = JSType.toInteger(campo_codigoProdutoPesquisado.getText());
                DadosProdutos produto;
                Parametros consultaProduto = new Parametros();
                produto = consultaProduto.PesquisarProdutoPorCodigo(codigoTraduzido);
                String valorTraduzido = Double.toString(produto.getValorProduto());
                codigoProdutoEntradaUsuario = codigoTraduzido;
                codigoProdutoEncontrado = produto.getCodigoProduto();
                if(codigoProdutoEntradaUsuario != codigoProdutoEncontrado){
                    JOptionPane.showMessageDialog(null, "Não existe nenhum produto com o código informado","Erro na consulta",JOptionPane.WARNING_MESSAGE);
                }else{
                    campo_descricaoProdutoPesquisado.setText(produto.getDescricaoProduto());
                    campo_valorProdutoPesquisado.setText("R$ "+valorTraduzido);
                }
            }
        }else if(pesquisaDescricao == true){
            if("".equals(campo_descricaoProdutoPesquisado.getText())){
                JOptionPane.showMessageDialog(null,"Nenhuma descrição informada para pesquisa!","Descrição inválida",JOptionPane.WARNING_MESSAGE);
            }else{
                String descricaoPesquisa = campo_descricaoProdutoPesquisado.getText();
                DefaultComboBoxModel modeloListagem = (DefaultComboBoxModel) cb_listagemDescricoes.getModel();
                Parametros pesquisaProdutoDescricao = new Parametros();
                ArrayList<Object> listaDescricoes;
                listaDescricoes = pesquisaProdutoDescricao.PesquisarProdutoPorDescricao(descricaoPesquisa);
                for(int i = 0;i<listaDescricoes.size();i++){
                    modeloListagem.addElement(listaDescricoes.get(i));
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Selecione um tipo de PESQUISA","Alerta",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_pesquisaProdutoActionPerformed

    private void jbtn_pesquisaProduto_porCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_pesquisaProduto_porCodigoActionPerformed
        if(jbtn_pesquisaProduto_porCodigo.isSelected() ==  true){
            pesquisaProduto = true;
            campo_codigoProdutoPesquisado.setEnabled(true);
        }
    }//GEN-LAST:event_jbtn_pesquisaProduto_porCodigoActionPerformed

    private void campo_codigoProdutoPesquisadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo_codigoProdutoPesquisadoKeyPressed
        int codigoProdutoEntradaUsuario = 0;
        int codigoProdutoEncontrado;
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(pesquisaProduto == true){
                if("".equals(campo_codigoProdutoPesquisado.getText())){
                    JOptionPane.showMessageDialog(null,"Nenhum CÓDIGO informado para pesquisa!","Código inválido",JOptionPane.WARNING_MESSAGE);
                }else{
                    int codigoTraduzido = JSType.toInteger(campo_codigoProdutoPesquisado.getText());
                    DadosProdutos produto;
                    Parametros consultaProduto = new Parametros();
                    produto = consultaProduto.PesquisarProdutoPorCodigo(codigoTraduzido);
                    String valorTraduzido = Double.toString(produto.getValorProduto());
                    codigoProdutoEntradaUsuario = codigoTraduzido;
                    codigoProdutoEncontrado = produto.getCodigoProduto();
                    if(codigoProdutoEntradaUsuario != codigoProdutoEncontrado){
                        JOptionPane.showMessageDialog(null, "Não existe nenhum produto com o código informado","Erro na consulta",JOptionPane.WARNING_MESSAGE);
                    }
                    else{
                        campo_descricaoProdutoPesquisado.setText(produto.getDescricaoProduto());
                        campo_valorProdutoPesquisado.setText("R$ "+valorTraduzido);
                    }
                }
            }else{
                JOptionPane.showMessageDialog(null,"Selecione um tipo de PESQUISA","Alerta",JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_campo_codigoProdutoPesquisadoKeyPressed

    private void jbtn_pesquisa_porDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_pesquisa_porDescricaoActionPerformed
        if(jbtn_pesquisa_porDescricao.isSelected() == true){
            pesquisaProduto = false;
            pesquisaDescricao = true;
            campo_codigoProdutoPesquisado.setEnabled(false);
            campo_descricaoProdutoPesquisado.setEnabled(true);
        }
    }//GEN-LAST:event_jbtn_pesquisa_porDescricaoActionPerformed

    private void btn_exclusaoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exclusaoProdutoActionPerformed
        int telaOpcao = JOptionPane.showConfirmDialog(null,"Deseja realmente excluir o produto "+campo_codigoProduto_paraAlteracao.getText()+" da sua Base de Dados? ","Exclusão segura",JOptionPane.OK_CANCEL_OPTION);
        if(telaOpcao == JOptionPane.OK_OPTION){
            int codigoProdutoTraduzido = JSType.toInteger(campo_codigoProduto_paraAlteracao.getText());
            Parametros exclusaoProduto = new Parametros();
            exclusaoProduto.ExcluirProduto(codigoProdutoTraduzido);
            campo_codigoProduto_paraAlteracao.setText("");
        }else{
            JOptionPane.showMessageDialog(null,"Exclusão cancelada","Exclusão segura",JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_btn_exclusaoProdutoActionPerformed

    private void btn_alterarDescricaoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarDescricaoProdutoActionPerformed
        int telaOpcao = JOptionPane.showConfirmDialog(null,"Deseja realmente alterar a descrição do produto "+campo_codigoProduto_paraAlteracao.getText()+" ?","Alteração com segurança",JOptionPane.OK_CANCEL_OPTION);
        if(telaOpcao == JOptionPane.OK_OPTION){
            int codigoProdutoTraduzido = JSType.toInteger(campo_codigoProduto_paraAlteracao.getText());
            Parametros consultaProduto = new Parametros();
            DadosProdutos produtoPesquisado;
            produtoPesquisado = consultaProduto.PesquisarProdutoPorCodigo(codigoProdutoTraduzido);
            TelaAlteracaoDescricaoProduto telaAlteracao = new TelaAlteracaoDescricaoProduto();
            telaAlteracao.Inicializacao(this,produtoPesquisado.getDescricaoProduto(),codigoProdutoTraduzido);
            campo_codigoProduto_paraAlteracao.setText("");
            setVisible(false);
            telaAlteracao.setVisible(true);
        }
    }//GEN-LAST:event_btn_alterarDescricaoProdutoActionPerformed
    
    public void SelecionarBotaoPesquisa(){
        jbtn_pesquisaProduto_porCodigo.setSelected(true);
    }
    
    public void LimparCampos(){
        campo_codigoProduto_paraAlteracao.setText("");
        campo_codigoCategoria_paraAlteracao.setText("");
    }
    
    public static void main(String args[])  {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SistemaGerenciador().setVisible(true);               
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnt_configurarUsuarios;
    private javax.swing.JButton bnt_informacoes;
    private javax.swing.JButton bnt_listarProdutoMenorValor;
    private javax.swing.JButton btn_alteracaoCategoriaProduto;
    private javax.swing.JButton btn_alteracaoDescricaoCategoria;
    private javax.swing.JButton btn_alteracaoPrecoProduto;
    private javax.swing.JButton btn_alterarDescricaoProduto;
    private javax.swing.JButton btn_cadastrarCategoria;
    private javax.swing.JButton btn_cadastrarNovoProduto;
    private javax.swing.JButton btn_cancelarPesquisa_estoqueProduto;
    private javax.swing.JButton btn_exclusaoCategoria;
    private javax.swing.JButton btn_exclusaoProduto;
    private javax.swing.JButton btn_inserirQuantidadeEstoqueProduto;
    private javax.swing.JButton btn_limparCamposPesquisaProduto;
    private javax.swing.JButton btn_limparCampos_cadastroNovaCategoria;
    private javax.swing.JButton btn_limparCampos_insercaoEstoqueProduto;
    private javax.swing.JButton btn_limparCampos_produtoMaiorValor;
    private javax.swing.JButton btn_limparCampos_produtoMaisBarato;
    private javax.swing.JButton btn_limparListagem;
    private javax.swing.JButton btn_limparPesquisaCategoria;
    private javax.swing.JButton btn_listarProdutoMaisCaro;
    private javax.swing.JButton btn_listarProdutosCadastrados;
    private javax.swing.JButton btn_pesquisaProduto;
    private javax.swing.JButton btn_pesquisarCategoria;
    private javax.swing.JButton btn_pesquisarQuantidadeProdutoEstoque;
    private javax.swing.JButton btn_sair;
    private javax.swing.JButton btn_trocarUsuarioLogado;
    private javax.swing.ButtonGroup btngroup_tipoInteracaoCategoria;
    private javax.swing.ButtonGroup btngroup_tipoInteracaoEstoque;
    private javax.swing.ButtonGroup btngroup_tipoPesquisaProduto;
    private javax.swing.JTextField campo_codigoCategoriaPesquisada;
    private javax.swing.JTextField campo_codigoCategoria_paraAlteracao;
    private javax.swing.JTextField campo_codigoNovaCategoria;
    private javax.swing.JTextField campo_codigoProdutoPesquisado;
    private javax.swing.JTextField campo_codigoProduto_consultadoEstoque;
    private javax.swing.JTextField campo_codigoProduto_paraAlteracao;
    private javax.swing.JTextField campo_codigoProduto_paraInsercaoEstoque;
    private javax.swing.JTextField campo_descricaoNovaCategoria;
    private javax.swing.JTextField campo_descricaoProdutoPesquisado;
    private javax.swing.JTextField campo_nomeUsuarioLogado;
    private javax.swing.JTextField campo_quantidadeInsercao_produtoEstoque;
    private javax.swing.JTextField campo_txt_CategoriaProduto_maisBarato;
    private javax.swing.JTextField campo_txt_CategoriaProduto_maisValioso;
    private javax.swing.JTextField campo_txt_DescricaoProduto_maisBarato;
    private javax.swing.JTextField campo_txt_DescricaoProduto_maisValioso;
    private javax.swing.JTextField campo_txt_PrecoProdutoMaisBarato;
    private javax.swing.JTextField campo_txt_PrecoProdutoMaisValioso;
    private javax.swing.JTextField campo_txt_descricaoCategoriaPesquisada;
    private javax.swing.JTextField campo_txt_perfilUsuario;
    private javax.swing.JTextField campo_txt_quantidadeProdutoEstoque;
    private javax.swing.JTextField campo_valorProdutoPesquisado;
    private javax.swing.JComboBox<String> cb_listagemDescricoes;
    private javax.swing.JComboBox<String> cb_listagemProdutos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JRadioButton jbtn_cadastroDeNovaCategoria;
    private javax.swing.JRadioButton jbtn_consultaQuantidadeProdutoEstoque;
    private javax.swing.JRadioButton jbtn_insercaoQuantidadeProdutoEstoque;
    private javax.swing.JRadioButton jbtn_pesquisaDeCategoria;
    private javax.swing.JRadioButton jbtn_pesquisaNaoSelecionada;
    private javax.swing.JRadioButton jbtn_pesquisaProduto_porCodigo;
    private javax.swing.JRadioButton jbtn_pesquisa_porDescricao;
    private javax.swing.JTabbedPane painel_deGuias4;
    // End of variables declaration//GEN-END:variables
}
