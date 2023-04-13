package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    
    // Nome do usuário do mysql
    private static final String USERNAME = "root";
    
    // Senha do banco de dados
    private static final String PASSWORD = "";
    
    // Caminho do banco de dados, porta(3306) nome da base de dados
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/manha_eletrotech";
    
    public static Connection createConnectionToMysql() throws Exception {
        
        // Faz com que a classe seja carregada na JVM
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
        
        return connection;
    }
    
    public static void main(String[] args) throws Exception {
        
        // Criar ou recuperar uma conexão com o banco
        Connection con = createConnectionToMysql();
        
        // Teste de conexão com o banco dados
        if (con != null) {
            System.out.println("Conexão estabelecida com sucesso!");
            con.close();
        }
    }
}