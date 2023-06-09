/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.administrador;

import controller.PagesController;
import dao.FuncionarioDao;
import dao.ServicoDao;
import dao.SolicitacaoDao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Funcionario;
import model.Servico;
import model.Solicitacao;

/**
 *
 * @author Italo
 */
public class Designar_funcionario extends javax.swing.JFrame {

    public static PagesController controller = new PagesController();

    public static SolicitacaoDao solicitacaodao = new SolicitacaoDao();
    public static Solicitacao solicitacao = new Solicitacao();

    public static FuncionarioDao funcionariodao = new FuncionarioDao();

    public static Servico servico = new Servico();
    public static ServicoDao servicodao = new ServicoDao();

    /**
     * Creates new form Editar_funcionario
     */
    public Designar_funcionario() {
        setUndecorated(true);
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        img_edit = new javax.swing.JLabel();
        label_id = new javax.swing.JLabel();
        input_numSolicitacao = new javax.swing.JTextField();
        label_nome = new javax.swing.JLabel();
        input_nome = new javax.swing.JTextField();
        btn_pesquisar = new javax.swing.JButton();
        label_telefone = new javax.swing.JLabel();
        btn_ok = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        input_telefone = new javax.swing.JTextField();
        label_data = new javax.swing.JLabel();
        input_data = new javax.swing.JTextField();
        label_endereco = new javax.swing.JLabel();
        input_endereco = new javax.swing.JTextField();
        label_especialidade = new javax.swing.JLabel();
        input_especialidade = new javax.swing.JTextField();
        label_funcionario = new javax.swing.JLabel();
        select_funcionario = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(640, 360));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(14, 118, 196));
        jPanel1.setMaximumSize(new java.awt.Dimension(640, 360));
        jPanel1.setMinimumSize(new java.awt.Dimension(640, 360));
        jPanel1.setPreferredSize(new java.awt.Dimension(640, 360));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Designar funcionário");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(234, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(232, 232, 232))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(320, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 50));

        jPanel2.setMaximumSize(new java.awt.Dimension(640, 360));
        jPanel2.setMinimumSize(new java.awt.Dimension(640, 360));
        jPanel2.setPreferredSize(new java.awt.Dimension(640, 360));

        img_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/tools.png"))); // NOI18N

        label_id.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_id.setText("Digite o número da solicitação");

        label_nome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_nome.setText("Cliente");

        btn_pesquisar.setBackground(new java.awt.Color(14, 118, 196));
        btn_pesquisar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_pesquisar.setForeground(new java.awt.Color(255, 255, 255));
        btn_pesquisar.setText("OK");
        btn_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesquisarActionPerformed(evt);
            }
        });

        label_telefone.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_telefone.setText("Telefone");

        btn_ok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/ok.png"))); // NOI18N
        btn_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_okActionPerformed(evt);
            }
        });

        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/back.png"))); // NOI18N
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        label_data.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_data.setText("Data");

        label_endereco.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_endereco.setText("Endereço");

        label_especialidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_especialidade.setText("Especialidade");

        label_funcionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_funcionario.setText("Funcionário");

        select_funcionario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Selecione --" }));
        select_funcionario.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                select_funcionarioAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_id)
                            .addComponent(input_numSolicitacao, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addComponent(img_edit))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_nome)
                                    .addComponent(input_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_endereco))
                                .addGap(46, 46, 46)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(input_data, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_data)))
                            .addComponent(input_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(label_funcionario)
                                .addComponent(select_funcionario, 0, 346, Short.MAX_VALUE)))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn_ok)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_cancelar))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(input_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(label_telefone)
                                .addComponent(label_especialidade)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(input_especialidade)
                                    .addGap(1, 1, 1))))))
                .addGap(13, 13, 13))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(label_id)
                        .addGap(6, 6, 6)
                        .addComponent(input_numSolicitacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btn_pesquisar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(img_edit)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_nome)
                    .addComponent(label_data)
                    .addComponent(label_telefone))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_endereco)
                    .addComponent(label_especialidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input_especialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_ok)
                            .addComponent(btn_cancelar)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(label_funcionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(select_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 640, 320));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        input_nome.setEnabled(false);
        input_data.setEnabled(false);
        input_telefone.setEnabled(false);
        input_endereco.setEnabled(false);
        input_especialidade.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void btn_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquisarActionPerformed

        try {

            for (Solicitacao s : solicitacaodao.pesquisarSolicitacao(Integer.parseInt(input_numSolicitacao.getText()))) {
                input_nome.setText(s.getCliente());
                input_data.setText(s.getData());
                input_telefone.setText(s.getTelefone());
                input_endereco.setText(s.getEndereco());
                input_especialidade.setText(s.getEspecialidade());
            }

            select_funcionario.removeAllItems();

            for (Funcionario f : funcionariodao.listarFuncionarios()) {
                if (f.getEspecialidade().equals(input_especialidade.getText())) {
                    select_funcionario.addItem(f);
                }
            }

        } catch (Exception e) {
        }

    }//GEN-LAST:event_btn_pesquisarActionPerformed

    private void btn_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_okActionPerformed
        try {
            Funcionario funcionario = (Funcionario) select_funcionario.getSelectedItem();

            servicodao.designarFuncionario(funcionario.getRp(), Integer.parseInt(input_numSolicitacao.getText()));

            JOptionPane.showMessageDialog(
                    null,
                    "Funcionário designado com sucesso!",
                    "Funcionário designado",
                    JOptionPane.INFORMATION_MESSAGE);
            
            input_numSolicitacao.setText("");
            input_nome.setText("");
            input_data.setText("");
            input_telefone.setText("");
            input_endereco.setText("");
            input_especialidade.setText("");
            select_funcionario.removeAllItems();

        } catch (Exception e) {
        }
    }//GEN-LAST:event_btn_okActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        controller.fechaTelaInterna(this);
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void select_funcionarioAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_select_funcionarioAncestorAdded

    }//GEN-LAST:event_select_funcionarioAncestorAdded

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Designar_funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Designar_funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Designar_funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Designar_funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Designar_funcionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_ok;
    private javax.swing.JButton btn_pesquisar;
    private javax.swing.JLabel img_edit;
    private javax.swing.JTextField input_data;
    private javax.swing.JTextField input_endereco;
    private javax.swing.JTextField input_especialidade;
    private javax.swing.JTextField input_nome;
    private javax.swing.JTextField input_numSolicitacao;
    private javax.swing.JTextField input_telefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel label_data;
    private javax.swing.JLabel label_endereco;
    private javax.swing.JLabel label_especialidade;
    private javax.swing.JLabel label_funcionario;
    private javax.swing.JLabel label_id;
    private javax.swing.JLabel label_nome;
    private javax.swing.JLabel label_telefone;
    private javax.swing.JComboBox<Object> select_funcionario;
    // End of variables declaration//GEN-END:variables
}
