package pacote2;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import pacote3.*;

public class Parametros {

    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    ArrayList<Object> listaProdutos = new ArrayList<>();
    ArrayList<Object> listaUsuarios = new ArrayList<>();
    ArrayList<Object> listaDescricoes = new ArrayList<>();
    String nomeAdministrador = "ADMINISTRADOR";
    boolean senhaAdm;
    
    public String VerificarSenhaAdministrador(String senha){
        String senhaEncontrada = "";
        try {
            conn = new ConexaoBancoDeDados().conexaoBanco();
            String selectSenha = "SELECT * FROM USUARIO U WHERE U.NOME_USUARIO = (?) AND SENHA_USUARIO = (?)";
            ps = conn.prepareStatement(selectSenha);
            ps.setString(1,nomeAdministrador);
            ps.setString(2,senha);
            rs = ps.executeQuery();            
            while(rs.next()){
                senhaEncontrada = rs.getString("U.SENHA_USUARIO");
            }
            
        } catch (SQLException ERRO_DE_SELECT) {
            JOptionPane.showMessageDialog(null,"Erro ao verificar senha de Administrador "+ERRO_DE_SELECT.getMessage(),"Erro",JOptionPane.WARNING_MESSAGE);
        }
        return senhaEncontrada;
    }
    public ArrayList<Object> ListagemCompletaProdutos(){
        Object objetoProduto = null;
        try {
            conn = new ConexaoBancoDeDados().conexaoBanco();
            String selectProdutos = "SELECT * FROM PRODUTO";
            ps = conn.prepareStatement(selectProdutos);
            rs = ps.executeQuery();
            DadosProdutos produto = new DadosProdutos();
            while(rs.next()){
                produto.setDescricaoProduto(rs.getInt("PRODUTO.CODIGO_PRODUTO")+" - "+rs.getString("PRODUTO.DESCRICAO_PRODUTO"));
                objetoProduto = produto.getDescricaoProduto();
                listaProdutos.add(objetoProduto);
            }           
        } catch (SQLException ERRO_DE_SELECT) {
            JOptionPane.showMessageDialog(null,"Erro ao listar todos os produtos "+ERRO_DE_SELECT.getMessage(),"Erro",JOptionPane.WARNING_MESSAGE);
        }
        return listaProdutos;
    }
    public void CadastrarNovoProduto(int codigoProduto,String descricaoProduto, int codigoCategoria,double valor) {
        try {
            conn = new ConexaoBancoDeDados().conexaoBanco();
            String insertProduto = " INSERT INTO PRODUTO(CODIGO_PRODUTO,DESCRICAO_PRODUTO,CODIGO_CATEGORIA,VALOR_PRODUTO) VALUES (?,?,?,?) ";
            ps = conn.prepareStatement(insertProduto);
            ps.setInt(1,codigoProduto);
            ps.setString(2,descricaoProduto);
            ps.setInt(3,codigoCategoria);
            ps.setFloat(4, (float) valor);
            ps.execute();
        } catch (SQLException ERRO_DE_INSERT) {
            JOptionPane.showMessageDialog(null,"Erro de inserção de novo produto "+ERRO_DE_INSERT.getMessage(),"Erro",JOptionPane.WARNING_MESSAGE);
        }
    
    }
    

    public DadosProdutos PesquisarProdutoPorCodigo(int codigo) {
        DadosProdutos produtoPesquisado = new DadosProdutos();
        try {
            conn = new ConexaoBancoDeDados().conexaoBanco();
            String selectProduto = "SELECT * FROM PRODUTO P WHERE P.CODIGO_PRODUTO = (?)";
            ps = conn.prepareStatement(selectProduto); 
            ps.setInt(1, codigo);
            rs = ps.executeQuery();
            while (rs.next()){               
                produtoPesquisado.setCodigoProduto(rs.getInt("P.CODIGO_PRODUTO"));
                produtoPesquisado.setDescricaoProduto(rs.getString("P.DESCRICAO_PRODUTO"));
                produtoPesquisado.setValorProduto(rs.getFloat("P.VALOR_PRODUTO"));
                produtoPesquisado.setCodigoCategoria(rs.getInt("P.CODIGO_CATEGORIA"));
            }         
        } catch (SQLException ERRO_DE_CONSULTA) {
            JOptionPane.showMessageDialog(null, "Erro: " + ERRO_DE_CONSULTA.getMessage(), "Consulta não realizada", JOptionPane.WARNING_MESSAGE);
        }
        return produtoPesquisado;
    }
    
    public ArrayList<Object> PesquisarProdutoPorDescricao(String descricao){
        Object objetoDescricao ;
        try {
            conn = new ConexaoBancoDeDados().conexaoBanco();
            String selectProduto = "SELECT * FROM PRODUTO P WHERE P.DESCRICAO_PRODUTO LIKE '%" + descricao + "%'" ;
            ps = conn.prepareStatement(selectProduto);
            rs = ps.executeQuery();
            DadosProdutos descricaoProduto = new DadosProdutos();
            while(rs.next()){
                descricaoProduto.setDescricaoProduto(rs.getString("P.DESCRICAO_PRODUTO")+" R$ "+rs.getFloat("P.VALOR_PRODUTO"));
                objetoDescricao = descricaoProduto.getDescricaoProduto();
                listaDescricoes.add(objetoDescricao);
            }
        } catch (SQLException ERRO_DE_SELECT) {
            JOptionPane.showMessageDialog(null, "Erro ao listar descrições similares "+ERRO_DE_SELECT.getMessage(),"Erro",JOptionPane.WARNING_MESSAGE);
        }
        return listaDescricoes;
    }

    public DadosProdutos PesquisarProdutoMaisCaro() {
        DadosProdutos produtoMaiorValor = new DadosProdutos();
        try {
            conn = new ConexaoBancoDeDados().conexaoBanco();
            String selectProduto = "SELECT MAX(DISTINCT VALOR_PRODUTO) AS VALOR_MAXIMO,PRODUTO.CODIGO_CATEGORIA,PRODUTO.CODIGO_PRODUTO,PRODUTO.DESCRICAO_PRODUTO,C.DESCRICAO_CATEGORIA FROM PRODUTO  "
                    + "JOIN CATEGORIA C ON C.CODIGO_CATEGORIA = PRODUTO.CODIGO_CATEGORIA "
                    + " GROUP BY PRODUTO.DESCRICAO_PRODUTO,PRODUTO.CODIGO_CATEGORIA,PRODUTO.CODIGO_PRODUTO,C.DESCRICAO_CATEGORIA ORDER BY VALOR_MAXIMO DESC LIMIT 1" ;
            ps = conn.prepareStatement(selectProduto);
            rs = ps.executeQuery();
            while (rs.next()) {
                produtoMaiorValor.setCodigoCategoria(rs.getInt("PRODUTO.CODIGO_CATEGORIA"));
                produtoMaiorValor.setCodigoProduto(rs.getInt("PRODUTO.CODIGO_PRODUTO"));
                produtoMaiorValor.setDescricaoProduto(rs.getString("PRODUTO.DESCRICAO_PRODUTO"));
                produtoMaiorValor.setValorProduto(rs.getFloat("VALOR_MAXIMO"));
            }           
        } catch (SQLException ERRO_DE_SELECT) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar PRODUTO MAIS CARO " + ERRO_DE_SELECT.getMessage(), "Erro de pesquisa", JOptionPane.WARNING_MESSAGE);
        }
        return produtoMaiorValor;
    }
   
    public DadosProdutos PesquisarProdutoMaisBarato() {
        DadosProdutos produtoMaisBarato = new DadosProdutos();
        try {
            conn = new ConexaoBancoDeDados().conexaoBanco();
            String selectProduto = "SELECT MIN( DISTINCT VALOR_PRODUTO) AS VALOR_MINIMO,P.CODIGO_PRODUTO,P.DESCRICAO_PRODUTO "
                    + " FROM PRODUTO P GROUP BY P.CODIGO_PRODUTO,P.DESCRICAO_PRODUTO ORDER BY VALOR_MINIMO ASC LIMIT 1 ";
            ps = conn.prepareStatement(selectProduto);
            rs = ps.executeQuery();
            while(rs.next()){
                produtoMaisBarato.setCodigoProduto(rs.getInt("P.CODIGO_PRODUTO"));
                produtoMaisBarato.setDescricaoProduto(rs.getString("P.DESCRICAO_PRODUTO"));
                produtoMaisBarato.setValorProduto(rs.getFloat("VALOR_MINIMO"));
            }
        } catch (SQLException ERRO_DE_SELECT) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar PRODUTO MAIS BARATO "+ERRO_DE_SELECT.getMessage(),"Erro",JOptionPane.WARNING_MESSAGE);
        }
        return produtoMaisBarato;
    } 

    public void ExcluirProduto(int codigoProduto) {
            try {
                conn = new ConexaoBancoDeDados().conexaoBanco();
                String deleteProduto = "DELETE FROM PRODUTO WHERE PRODUTO.CODIGO_PRODUTO = (?)";
                ps = conn.prepareStatement(deleteProduto);
                ps.setInt(1, codigoProduto);
                ps.execute();
                JOptionPane.showMessageDialog(null, "Produto excluído com sucesso! ", "Exclusão finalizada", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ERRO_DE_DELETE) {
                JOptionPane.showMessageDialog(null, "Erro ao excluir produto " + ERRO_DE_DELETE.getMessage(), "Exclusão não finalizada", JOptionPane.WARNING_MESSAGE);
            }
        
        
        }
    
    public void AlterarPrecoProduto(double valorProduto, int codigoProduto) {   
            try {
                conn = new ConexaoBancoDeDados().conexaoBanco();
                String updatePreco = "UPDATE PRODUTO SET VALOR_PRODUTO = (?) WHERE PRODUTO.CODIGO_PRODUTO = (?)";
                ps = conn.prepareStatement(updatePreco);
                ps.setFloat(1, (float) valorProduto);
                ps.setInt(2, codigoProduto);
                ps.execute();
                JOptionPane.showMessageDialog(null, "Preço do produto " + codigoProduto + " alterado com sucesso! ", "Alteração de preço finalizada", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ERRO_DE_UPDATE) {
                JOptionPane.showMessageDialog(null, "Erro ao alterar preço " + ERRO_DE_UPDATE.getMessage(), "Erro alterar preço", JOptionPane.INFORMATION_MESSAGE);
            }
        
    }

    public void AlteracaoCategoriaProduto(int codigoProduto, int codigoCategoria) {
            try {
                conn = new ConexaoBancoDeDados().conexaoBanco();
                String updateCategoria = "UPDATE PRODUTO SET CODIGO_CATEGORIA = (?) WHERE PRODUTO.CODIGO_PRODUTO = (?)";
                ps = conn.prepareStatement(updateCategoria);
                ps.setInt(1, codigoCategoria);
                ps.setInt(2, codigoProduto);
                ps.execute();
                JOptionPane.showMessageDialog(null, "Categoria do produto " + codigoProduto + " alterado com sucesso! ", "Alteração de categoria finalizada", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ERRO_DE_UPDATE) {
                JOptionPane.showMessageDialog(null, "Erro ao alterar categoria " + ERRO_DE_UPDATE.getMessage(), "Erro ao alterar categoria", JOptionPane.WARNING_MESSAGE);
            }        
    }
    
    public void AlterarDescricaoProduto(String novaDescricao,int codigoProduto){
        try {
            conn = new ConexaoBancoDeDados().conexaoBanco();
            String updateProduto = "UPDATE PRODUTO SET DESCRICAO_PRODUTO = (?) WHERE PRODUTO.CODIGO_PRODUTO = (?)";
            ps = conn.prepareStatement(updateProduto);
            ps.setString(1,novaDescricao);
            ps.setInt(2,codigoProduto);
            ps.execute();
        } catch (SQLException ERRO_DE_UPDATE) {
            JOptionPane.showMessageDialog(null,"Erro ao atualizar descrição do produto "+ERRO_DE_UPDATE.getMessage(),"Erro",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void InserirQuantidadeEstoqueProduto(int codigoProduto,int quantidadeEstoque){       
            try {
                conn = new ConexaoBancoDeDados().conexaoBanco();
                String updateEstoqueProduto = "UPDATE ESTOQUE_PRODUTO EP SET EP.QUANTIDADE_ESTOQUE = EP.QUANTIDADE_ESTOQUE + (?) WHERE EP.ID_PRODUTO = (?)";
                ps = conn.prepareStatement(updateEstoqueProduto);
                ps.setInt(1,quantidadeEstoque);
                ps.setInt(2,codigoProduto);
                ps.execute();
                JOptionPane.showMessageDialog(null,"Quantidade de estoque inserida com sucesso!","Estoque alterado com sucesso",JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ERRO_DE_UPDATE) {
                JOptionPane.showMessageDialog(null,"Erro ao inserir quantidade em estoque "+ERRO_DE_UPDATE.getMessage(),"Erro",JOptionPane.WARNING_MESSAGE);
            }       
    }
    
    public DadosProdutos PesquisarQuantidadeEstoqueProduto(int codigo_produto){       
            DadosProdutos produtoPesquisado = new DadosProdutos();
            try {
                conn = new ConexaoBancoDeDados().conexaoBanco();
                String selectProduto = "SELECT EP.QUANTIDADE_ESTOQUE,P.CODIGO_PRODUTO FROM PRODUTO P JOIN ESTOQUE_PRODUTO EP ON EP.ID_PRODUTO = P.CODIGO_PRODUTO"
                        + " WHERE P.CODIGO_PRODUTO = (?) ";
                ps = conn.prepareStatement(selectProduto);
                ps.setInt(1,codigo_produto);
                rs = ps.executeQuery();
                while(rs.next()){
                    produtoPesquisado.setCodigoProduto(rs.getInt("P.CODIGO_PRODUTO"));
                    produtoPesquisado.setQuantidadeEstoque(rs.getInt("EP.QUANTIDADE_ESTOQUE"));
                }
            }catch (SQLException ERRO_DE_SELECT){
                JOptionPane.showMessageDialog(null,"Erro ao consultar estoque "+ERRO_DE_SELECT.getMessage(),"Erro",JOptionPane.WARNING_MESSAGE);
            }
            return produtoPesquisado;
        
    }

    public void InserirCategoria(DadosCategorias categoria) {
        try {
            conn = new ConexaoBancoDeDados().conexaoBanco();
            String insertCategoria = "INSERT INTO TB_CATEGORIA (ID_CATEGORIA,DESCRICAO) VALUES (?,?)";
            ps = conn.prepareStatement(insertCategoria);
            ps.setInt(1, categoria.getCodigoCategoria());
            ps.setString(2, categoria.getDescricaoCategoria());
        } catch (SQLException ERRO_DE_INSERT) {
            JOptionPane.showMessageDialog(null, "> " + ERRO_DE_INSERT.getMessage(), "Erro", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    public DadosCategorias PesquisarCategoria(int codigoCategoria) {
            DadosCategorias categoriaPesquisada = new DadosCategorias();
            try {
                conn = new ConexaoBancoDeDados().conexaoBanco();
                String selectCategoria = "SELECT * FROM CATEGORIA C WHERE C.CODIGO_CATEGORIA = (?)";
                ps = conn.prepareStatement(selectCategoria);
                ps.setInt(1, codigoCategoria);
                rs = ps.executeQuery();
                while (rs.next()) {
                    categoriaPesquisada.setCodigoCategoria(rs.getInt("C.CODIGO_CATEGORIA"));
                    categoriaPesquisada.setDescricaoCategoria(rs.getString("C.DESCRICAO_CATEGORIA"));
                }
            } catch (SQLException ERRO_DE_SELECT) {
                JOptionPane.showMessageDialog(null, "Erro as pesquisar categoria " + ERRO_DE_SELECT.getMessage(), "Erro", JOptionPane.WARNING_MESSAGE);
            }        
            return categoriaPesquisada;       
    }

    public void CadastrarNovaCategoria(int codigoCategoria, String descricaoCategoria) {
        try {
            conn = new ConexaoBancoDeDados().conexaoBanco();
            String consultaCategoria = "SELECT *FROM CATEGORIA WHERE CATEGORIA.CODIGO_CATEGORIA =(?)";
            ps = conn.prepareStatement(consultaCategoria);
            ps.setInt(1, codigoCategoria);
            rs = ps.executeQuery();
            int codigoConsultaCategoria = 0;
            while (rs.next()) {
                codigoConsultaCategoria = rs.getInt("CATEGORIA.CODIGO_CATEGORIA");
            }
            if (codigoConsultaCategoria == codigoCategoria) {
                JOptionPane.showMessageDialog(null, "Categoria já existente - Insira um código válido ou consulte os existentes ", "Erro", JOptionPane.WARNING_MESSAGE);
            } else {
                conn = new ConexaoBancoDeDados().conexaoBanco();
                String insertCategoria = "INSERT INTO CATEGORIA (CODIGO_CATEGORIA,DESCRICAO_CATEGORIA) VALUES (?,?)";
                ps = conn.prepareStatement(insertCategoria);
                ps.setInt(1, codigoCategoria);
                ps.setString(2, descricaoCategoria);
                ps.execute();
                JOptionPane.showMessageDialog(null, "Nova categoria cadastrada", "Sucesso no cadastro de categoria", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ERRO_DE_INSERT) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir categoria " + ERRO_DE_INSERT.getMessage(), "Erro", JOptionPane.WARNING_MESSAGE);
        }

    }

    public void AlterarDescricaoCategoria(String novaDescricaoCategoria, int codigoCategoria) {
        try {
            conn = new ConexaoBancoDeDados().conexaoBanco();
            String updateDescricaoCategoria = "UPDATE CATEGORIA SET CATEGORIA.DESCRICAO_CATEGORIA = (?) WHERE CATEGORIA.CODIGO_CATEGORIA = (?)";
            ps = conn.prepareStatement(updateDescricaoCategoria);
            ps.setString(1, novaDescricaoCategoria);
            ps.setInt(2, codigoCategoria);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Descrição da categoria " + codigoCategoria + " alterada com sucesso!", "Sucesso na atualização de descrição", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ERRO_DE_UPDATE) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar descrição de categoria " + ERRO_DE_UPDATE.getMessage(), "Erro", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void ExcluirCategoria(int codigoCategoria) {
        try {
            conn = new ConexaoBancoDeDados().conexaoBanco();
            String deleteCategoria = "DELETE FROM CATEGORIA WHERE CATEGORIA.CODIGO_CATEGORIA = (?)";
            ps = conn.prepareStatement(deleteCategoria);
            ps.setInt(1, codigoCategoria);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Categoria " + codigoCategoria + " excluída com sucesso! ", "Sucesso na exclusão", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ERRO_DE_DELETE) {
            JOptionPane.showMessageDialog(null, "Erro ao excluír categoria " + codigoCategoria + " " + ERRO_DE_DELETE.getMessage(), "Erro", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void CadastrarUsuario(DadosUsuario usuarioNovo){
        try {
            conn = new ConexaoBancoDeDados().conexaoBanco();
            String insertUsuario = "INSERT INTO USUARIO(ID_USUARIO,NOME_USUARIO,SENHA_USUARIO,PERFIL) VALUES (?,?,?,?)";
            ps = conn.prepareStatement(insertUsuario);
            ps.setInt(1,usuarioNovo.getCodigoUsuario());
            ps.setString(2,usuarioNovo.getNomeUsuario());
            ps.setString(3, usuarioNovo.getSenhaUsuario());
            ps.setString(4,usuarioNovo.getPerfilUsuario());
            ps.execute();
            JOptionPane.showMessageDialog(null,"Usuário "+usuarioNovo.getNomeUsuario()+" cadastrado com sucesso!","Cadastro seguro",JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ERRO_DE_INSERT) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir usuário"+ERRO_DE_INSERT.getMessage(),"Erro",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void AlteracaoPerfilUsuario(String nomeusuario,String perfilUsuario, int codigoUsuario){
        try {
            conn = new ConexaoBancoDeDados().conexaoBanco();
            String updateUsuario = "UPDATE USUARIO SET USUARIO.PERFIL = (?) WHERE USUARIO.ID_USUARIO = (?) ";
            ps = conn.prepareStatement(updateUsuario);
            ps.setString(1,perfilUsuario);
            ps.setInt(2,codigoUsuario);
            ps.execute();
            JOptionPane.showMessageDialog(null,"Perfil do usúario "+nomeusuario+" alterado com sucesso!","Sucesso na alteração",JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ERRO_DE_UPDATE) {
            JOptionPane.showMessageDialog(null, "Erro de UPDATE"+ERRO_DE_UPDATE.getMessage(),"Erro",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void ExcluirUsuario(int codigoUsuario){
        try {
            conn = new ConexaoBancoDeDados().conexaoBanco();
            String deleteUsuario = "DELETE FROM USUARIO WHERE USUARIO.ID_USUARIO = (?)";
            ps = conn.prepareStatement(deleteUsuario);
            ps.setInt(1,codigoUsuario);
            ps.execute();
            JOptionPane.showMessageDialog(null,"Usuário excluído com sucesso","Sucesso na exclusão",JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ERRO_DE_DELETE) {
            JOptionPane.showMessageDialog(null,"Erro ao excluír usuário"+ERRO_DE_DELETE.getMessage(),"Erro",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public DadosUsuario PesquisarUsuario(int codigoUsuario){
        DadosUsuario usuarioPesquisado = new DadosUsuario();
        try {
            conn = new ConexaoBancoDeDados().conexaoBanco();
            String selectUsuario = "SELECT * FROM USUARIO WHERE USUARIO.ID_USUARIO = (?)";
            ps = conn.prepareStatement(selectUsuario);
            ps.setInt(1,codigoUsuario);
            rs = ps.executeQuery();
            while(rs.next()){
                usuarioPesquisado.setCodigoUsuario(rs.getInt("ID_USUARIO"));
                usuarioPesquisado.setNomeUsuario(rs.getString("NOME_USUARIO"));
                usuarioPesquisado.setPerfilUsuario(rs.getString("PERFIL"));
                usuarioPesquisado.setSenhaUsuario(rs.getString("SENHA_USUARIO"));
            }
        } catch (SQLException ERRO_DE_SELECT) {
            JOptionPane.showMessageDialog(null,"Erro ao pesquisar usuário"+ERRO_DE_SELECT.getMessage(),"Erro",JOptionPane.WARNING_MESSAGE);
        }
        return usuarioPesquisado;
    }
    
    public ArrayList<Object> ListagemCompletaUsuarios(){
        Object objetoUsuario = null;
        try {
            conn = new ConexaoBancoDeDados().conexaoBanco();
            String selectUsuarios = "SELECT * FROM USUARIO";
            ps = conn.prepareStatement(selectUsuarios);
            rs = ps.executeQuery();
            DadosUsuario usuarioPesquisado = new DadosUsuario();
            while(rs.next()){
                usuarioPesquisado.setNomeUsuario(rs.getString("USUARIO.ID_USUARIO")+" - "+rs.getString("USUARIO.NOME_USUARIO") + " - " +rs.getString("USUARIO.PERFIL"));
                objetoUsuario = usuarioPesquisado.getNomeUsuario();
                listaUsuarios.add(objetoUsuario);
            }
        } catch (SQLException ERRO_DE_SELECT) {
            JOptionPane.showMessageDialog(null,"Erro ao listar usuários "+ERRO_DE_SELECT.getMessage(),"Erro",JOptionPane.WARNING_MESSAGE);
        }
        return listaUsuarios;
    }

}
