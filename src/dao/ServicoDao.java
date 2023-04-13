package dao;

import com.mysql.cj.xdevapi.PreparableStatement;
import database.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Funcionario;
import model.Servico;
import model.Solicitacao;

public class ServicoDao {

    public void designarFuncionario(int rp, int numSolicitacao) {

        String sql = "INSERT INTO servico (funcionario_rp, numeroSolicitacao) VALUES (?, ?)";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {

            conn = Conexao.createConnectionToMysql();
            pstm = (PreparedStatement) conn.prepareCall(sql);

            pstm.setInt(1, rp);
            pstm.setInt(2, numSolicitacao);

            pstm.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Servico> listarServicos() {

        String sql = "SELECT servico.idservico, servico.numeroSolicitacao, cliente.nome, cliente.telefone, solicitacao.data, cliente.endereco, funcionario.nome FROM servico INNER JOIN solicitacao ON solicitacao.numeroSolicitacao = servico.numeroSolicitacao INNER JOIN cliente ON cliente.idcliente = solicitacao.idcliente INNER JOIN funcionario ON funcionario.rp = servico.funcionario_rp";

        List<Servico> servicos = new ArrayList<Servico>();

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try {

            conn = Conexao.createConnectionToMysql();
            pstm = (PreparedStatement) conn.prepareStatement(sql);

            rset = pstm.executeQuery();

            while (rset.next()) {
                Servico servico = new Servico();

                servico.setId(rset.getInt("idservico"));
                servico.setNumSolicitacao(rset.getInt("servico.numeroSolicitacao"));
                servico.setCliente(rset.getString("cliente.nome"));
                servico.setTelefone(rset.getString("cliente.telefone"));
                servico.setData(rset.getString("solicitacao.data"));
                servico.setEndereco(rset.getString("cliente.endereco"));
                servico.setFuncionario(rset.getString("funcionario.nome"));

                servicos.add(servico);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return servicos;
    }
    
    public List<Servico> servicosFuncionario(int rp) {
        
        List<Servico> servicos = new ArrayList<Servico>();
        
        String sql = "SELECT cliente.nome, cliente.endereco, solicitacao.data, cliente.telefone FROM servico INNER JOIN solicitacao ON solicitacao.numeroSolicitacao = servico.numeroSolicitacao INNER JOIN cliente ON cliente.idcliente = solicitacao.idcliente INNER JOIN funcionario ON funcionario.rp = ?";
        
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        
        try {
            
            conn = Conexao.createConnectionToMysql();
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            
            pstm.setInt(1, rp);
            pstm.execute();
            
            rset = pstm.executeQuery();
            
            while (rset.next()) {
                Servico servico = new Servico();
                
                servico.setCliente(rset.getString("cliente.nome"));
                servico.setEndereco(rset.getString("cliente.endereco"));
                servico.setData(rset.getString("solicitacao.data"));
                servico.setTelefone(rset.getString("cliente.telefone"));
                
                servicos.add(servico);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return servicos;
    }
}
