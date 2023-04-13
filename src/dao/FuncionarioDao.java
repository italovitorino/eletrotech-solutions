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

public class FuncionarioDao {

    public boolean checkLogin(int rp, String senha) {

        String sql = "SELECT * FROM funcionario where rp = ? and senha = ?";

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        boolean check = false;

        int rpLogged;

        try {

            // Criar conexão com o banco de dados
            conn = Conexao.createConnectionToMysql();

            // Criar uma confirmação para executar uma query(consulta) no banco
            pstm = (PreparedStatement) conn.prepareStatement(sql);

            // Adicionar os valores na query criada na variável sql
            pstm.setInt(1, rp);
            pstm.setString(2, senha);

            rset = pstm.executeQuery();

            if (rset.next()) {

                check = true;
            }

        } catch (Exception e) {

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

        return check;
    }

    public List<Funcionario> pesquisarFuncionario(int rp) {

        String sql = "SELECT * FROM funcionario WHERE rp = ?";

        List<Funcionario> funcionarios = new ArrayList<Funcionario>();

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
                Funcionario funcionario = new Funcionario();

                //Buscar rp do profissional
                funcionario.setRp(rset.getInt("rp"));
                funcionario.setAdmin(rset.getInt("admin"));
                funcionario.setNome(rset.getString("nome"));
                funcionario.setCpf(rset.getString("cpf"));
                funcionario.setCargo(rset.getString("cargo"));
                funcionario.setEspecialidade(rset.getString("especialidade"));
                funcionario.setTelefone(rset.getString("telefone"));

                funcionarios.add(funcionario);
            }
        } catch (Exception e) {
        }
        return funcionarios;
    }

    public void cadastrarFuncionario(Funcionario funcionario) {

        String sql = "INSERT INTO funcionario (admin, nome, cpf, cargo, especialidade, telefone, senha) VALUES (?, ?, ?, ?, ?, ?, ?)";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {

            conn = Conexao.createConnectionToMysql();
            pstm = (PreparedStatement) conn.prepareStatement(sql);

            pstm.setInt(1, funcionario.getAdmin());
            pstm.setString(2, funcionario.getNome());
            pstm.setString(3, funcionario.getCpf());
            pstm.setString(4, funcionario.getCargo());
            pstm.setString(5, funcionario.getEspecialidade());
            pstm.setString(6, funcionario.getTelefone());
            pstm.setString(7, funcionario.getSenha());

            pstm.execute();

        } catch (Exception e) {

            System.out.println("Erro ao tentar cadastrar o funcionário na base de dados!");
            e.printStackTrace();

        } finally {

            try {

                if (pstm != null) {
                    pstm.close();
                }

                if (conn != null) {
                    conn.close();
                }

            } catch (Exception e) {

                e.printStackTrace();
            }
        }
    }

    public void alterarFuncionario(Funcionario funcionario) {

        String sql = "UPDATE funcionario SET admin = ?, nome = ?, cpf = ?, cargo = ?, especialidade = ?, telefone = ?, senha = ? WHERE rp = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {

            conn = Conexao.createConnectionToMysql();
            pstm = (PreparedStatement) conn.prepareStatement(sql);

            pstm.setInt(1, funcionario.getAdmin());
            pstm.setString(2, funcionario.getNome());
            pstm.setString(3, funcionario.getCpf());
            pstm.setString(4, funcionario.getCargo());
            pstm.setString(5, funcionario.getEspecialidade());
            pstm.setString(6, funcionario.getTelefone());
            pstm.setString(7, funcionario.getSenha());

            pstm.setInt(8, funcionario.getRp());

            pstm.execute();

        } catch (Exception e) {
        }
    }

    public void excluirFuncionario(int rp) {

        String sql = "DELETE FROM funcionario WHERE rp = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {

            conn = Conexao.createConnectionToMysql();
            pstm = (PreparedStatement) conn.prepareStatement(sql);

            pstm.setInt(1, rp);
            pstm.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Funcionario> listarFuncionarios() {

        String sql = "SELECT * FROM funcionario";

        List<Funcionario> funcionarios = new ArrayList<Funcionario>();

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try {

            conn = Conexao.createConnectionToMysql();
            pstm = (PreparedStatement) conn.prepareStatement(sql);

            rset = pstm.executeQuery();

            while (rset.next()) {
                Funcionario funcionario = new Funcionario();

                funcionario.setRp(rset.getInt("rp"));
                funcionario.setAdmin(rset.getInt("admin"));
                funcionario.setNome(rset.getString("nome"));
                funcionario.setCpf(rset.getString("cpf"));
                funcionario.setCargo(rset.getString("cargo"));
                funcionario.setEspecialidade(rset.getString("especialidade"));
                funcionario.setTelefone(rset.getString("telefone"));

                funcionarios.add(funcionario);
            }
        } catch (Exception e) {
            System.out.println("Erro ao listar funcionários");
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
        return funcionarios;
    }
    
    public void funcionarioLogado(int rp) {
        
        String sql = "SELECT rp, nome FROM funcionario WHERE rp = ?";
        
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
                Funcionario funcionario = new Funcionario();
                
                funcionario.setRp(rset.getInt("rp"));
                funcionario.setNome(rset.getString("nome"));
            }
            
        } catch (Exception e) {
        }
        
    }
}
