package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Feedback;
import database.Conexao;

public class FeedbackDao {
    
    public List<Feedback> listarFeedbacks() {
        
        String sql = "SELECT * FROM feedback";
        
        List<Feedback> feedbacks = new ArrayList<Feedback>();
        
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        
        try {
            
            conn = Conexao.createConnectionToMysql();
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            
            rset = pstm.executeQuery();
            
            while (rset.next()) {
                Feedback feedback = new Feedback();
                
                feedback.setId(rset.getInt("idfeedback"));
                feedback.setNumServico(rset.getInt("idservico"));
                feedback.setNota(rset.getInt("nota"));
                feedback.setComentario(rset.getString("comentario"));
                
                feedbacks.add(feedback);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return feedbacks;
    }
    
}
