
package Controler;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class Conexao {
    private Connection conectar() {
        String url = "jdbc:mysql://localhost:3306/meu_banco_de_dados";
        String usuario = "usuario";
        String senha = "senha";
        Connection conexao = null;

        try {
            conexao = DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException e) {
            System.out.println("Erro ao conectar com o banco de dados: " + e.getMessage());
        }

        return conexao;
    }

  
    public void inserirFornecedor(String razao, String cnpj, String cep, String rua, String bairro) {
        String sql = "INSERT INTO fornecedor (razao, cnpj, cep, rua, bairro) VALUES (?, ?, ?, ?, ?)";
        try (Connection conexao = conectar();
             PreparedStatement statement = conexao.prepareStatement(sql)) {
            statement.setString(1, razao);
            statement.setString(2, cnpj);
            statement.setString(3, cep);
            statement.setString(4, rua);
            statement.setString(5, bairro);
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao inserir o fornecedor: " + e.getMessage());
        }
    }
    
    
     public void inserirProduto(String produto, String quantidade) {
        String sql = "INSERT INTO produto (ID_Produto, quantidade) VALUES (?, ?)";
        try (Connection conexao = conectar();
             PreparedStatement statement = conexao.prepareStatement(sql)) {
            statement.setString(1, produto);
            statement.setString(2, quantidade);
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao inserir o produto: " + e.getMessage());
        }
    }

     
    public void inserirCliente(String nome, String email, String senha, String sexo) {
        String sql = "INSERT INTO clientes (nome, email, senha, sexo) VALUES (?, ?, ?, ?)";
        try (Connection conexao = conectar();
             PreparedStatement statement = conexao.prepareStatement(sql)) {
            statement.setString(1, nome);
            statement.setString(2, email);
            statement.setString(3, senha);
            statement.setString(4, sexo);
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao inserir o cliente: " + e.getMessage());
        }
        
    }
}