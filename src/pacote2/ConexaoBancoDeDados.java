
package pacote2;

import java.sql.*;
import javax.swing.*;
import pacote1.TelaDeLogin;

public class ConexaoBancoDeDados {
    
    public Connection conexaoBanco(){
        Connection conexao = null;
        try {                                                       //Banco será definido aqui....
            String parametro_de_conexao = "jdbc:mysql://localhost:3306/GVP?user=Projetos&password=@projetos_teste@";
            conexao = DriverManager.getConnection(parametro_de_conexao);
            
        } catch (SQLException erro) {
             JOptionPane.showMessageDialog(null,"Não foi possível se conectar ao Banco de Dados ","Erro de Conexão",JOptionPane.INFORMATION_MESSAGE);
             System.exit(0);
             
        }
        return conexao;   
    }
    
}


