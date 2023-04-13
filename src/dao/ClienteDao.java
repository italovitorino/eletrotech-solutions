package dao;

import com.mysql.cj.xdevapi.PreparableStatement;
import database.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Cliente;

public class ClienteDao {
    
    public List<Cliente> listarClientes() {
        
        String sql = "SELECT cliente.idcliente, cliente.nome, cliente.telefone, cliente.email, cliente.cpf, cliente.endereco, plano.nome FROM cliente INNER JOIN plano ON cliente.idplano = plano.idplano;";
        
        List<Cliente> clientes = new ArrayList<Cliente>();
        
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        
        try {
            
            conn = Conexao.createConnectionToMysql();
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            
            rset = pstm.executeQuery();
            
            while (rset.next()) {
                Cliente cliente = new Cliente();
                
                cliente.setId(rset.getInt("idcliente"));
                
                cliente.setNome(rset.getString("nome"));
                cliente.setTelefone(rset.getString("telefone"));
                cliente.setEmail(rset.getString("email"));
                cliente.setCpf(rset.getString("cpf"));
                cliente.setEndereco(rset.getString("endereco"));
                cliente.setPlano(rset.getString("plano.nome"));
                
                clientes.add(cliente);
            }
            
        } catch (Exception e) {
            
            System.out.println("Erro ao listar clientes!");
            e.printStackTrace();
            
        } finally {
            
            try {

                if (rset != null) {
                    rset.close();
                }
                if (conn != null) {
                    conn.close();
                }
                if (pstm != null) {
                    pstm.close();
                }

            } catch (Exception e) {

                e.printStackTrace();
            }
        }
        return clientes;
    }
}
