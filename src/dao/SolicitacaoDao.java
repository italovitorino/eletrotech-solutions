package dao;

import com.mysql.cj.xdevapi.PreparableStatement;
import database.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Solicitacao;

public class SolicitacaoDao {
    
    public List<Solicitacao> listarSolicitacoes() {
        
        String sql = "SELECT solicitacao.numeroSolicitacao, cliente.nome, solicitacao.data, cliente.endereco, solicitacao.especialidade FROM solicitacao INNER JOIN cliente ON solicitacao.idcliente = cliente.idcliente";
        
        List<Solicitacao> solicitacoes = new ArrayList<Solicitacao>();
        
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        
        try {
            
            conn = Conexao.createConnectionToMysql();
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            
            rset = pstm.executeQuery();
            
            while (rset.next()) {
                Solicitacao solicitacao = new Solicitacao();
                
                solicitacao.setNumSolicitacao(rset.getInt("numeroSolicitacao"));
                solicitacao.setCliente(rset.getString("cliente.nome"));
                solicitacao.setData(rset.getString("data"));
                solicitacao.setEndereco(rset.getString("cliente.endereco"));
                solicitacao.setEspecialidade(rset.getString("especialidade"));
                
                solicitacoes.add(solicitacao);
            }
            
        } catch (Exception e) {
            System.out.println("Erro ao listar solicitações");
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
        return solicitacoes;
    }
    
    public List<Solicitacao> pesquisarSolicitacao(int numSolicitacao) {
        
        String sql = "SELECT cliente.nome, solicitacao.data, cliente.telefone, cliente. endereco, solicitacao.especialidade FROM solicitacao INNER JOIN cliente ON solicitacao.idcliente = cliente.idcliente AND solicitacao.numeroSolicitacao = ?";
        
        List<Solicitacao> solicitacoes = new ArrayList<Solicitacao>();
        
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        
        try {
            
            conn = Conexao.createConnectionToMysql();
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            
            pstm.setInt(1, numSolicitacao);
            pstm.execute();
            
            rset = pstm.executeQuery();
            
            while (rset.next()) {
                Solicitacao solicitacao = new Solicitacao();
                
                solicitacao.setCliente(rset.getString("cliente.nome"));
                solicitacao.setData(rset.getString("data"));
                solicitacao.setTelefone(rset.getString("cliente.telefone"));
                solicitacao.setEndereco(rset.getString("cliente.endereco"));
                solicitacao.setEspecialidade(rset.getString("especialidade"));
                
                solicitacoes.add(solicitacao);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return solicitacoes;
    }
}