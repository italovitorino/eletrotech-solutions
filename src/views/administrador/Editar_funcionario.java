/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.administrador;

import controller.PagesController;
import dao.FuncionarioDao;
import javax.swing.JOptionPane;
import model.Funcionario;

/**
 *
 * @author Italo
 */
public class Editar_funcionario extends javax.swing.JFrame {

    public static Funcionario funcionario = new Funcionario();
    public static FuncionarioDao funcionariodao = new FuncionarioDao();
    public static PagesController controller = new PagesController();

    /**
     * Creates new form Editar_funcionario
     */
    public Editar_funcionario() {
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
        label_rp = new javax.swing.JLabel();
        input_rp = new javax.swing.JTextField();
        label_nome = new javax.swing.JLabel();
        input_nome = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        label_sobrenome = new javax.swing.JLabel();
        input_sobrenome = new javax.swing.JTextField();
        label_cpf = new javax.swing.JLabel();
        label_telefone = new javax.swing.JLabel();
        label_cargo = new javax.swing.JLabel();
        select_cargo = new javax.swing.JComboBox<>();
        label_especialidade = new javax.swing.JLabel();
        select_especialidade = new javax.swing.JComboBox<>();
        label_adm = new javax.swing.JLabel();
        select_adm = new javax.swing.JComboBox<>();
        btn_ok = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        label_senha = new javax.swing.JLabel();
        input_senha = new javax.swing.JPasswordField();
        input_cpf = new javax.swing.JTextField();
        input_telefone = new javax.swing.JTextField();

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
        jLabel1.setText("Editar funcionário");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(249, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(242, 242, 242))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addContainerGap(319, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 50));

        jPanel2.setMaximumSize(new java.awt.Dimension(640, 360));
        jPanel2.setMinimumSize(new java.awt.Dimension(640, 360));
        jPanel2.setPreferredSize(new java.awt.Dimension(640, 360));

        img_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/edit.png"))); // NOI18N

        label_rp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_rp.setText("Digite o RP do funcionário");

        label_nome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_nome.setText("Nome");

        jButton1.setBackground(new java.awt.Color(14, 118, 196));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        label_sobrenome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_sobrenome.setText("Sobrenome");

        label_cpf.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_cpf.setText("CPF");

        label_telefone.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_telefone.setText("Telefone");

        label_cargo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_cargo.setText("Cargo");

        select_cargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Selecione --", "Júnior", "Pleno", "Sênior", "Sócio" }));

        label_especialidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_especialidade.setText("Especialidade");

        select_especialidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Selecione --", "Comercial", "Edifício", "Residencial", "Administração" }));

        label_adm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_adm.setText("Este usuário é administrador?");

        select_adm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Selecione --", "Sim", "Não" }));
        select_adm.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                select_admItemStateChanged(evt);
            }
        });

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

        label_senha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_senha.setText("Senha para o usuário");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_adm)
                            .addComponent(label_senha))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(select_adm, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(input_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addComponent(btn_ok)
                        .addGap(6, 6, 6)
                        .addComponent(btn_cancelar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_rp)
                            .addComponent(input_rp, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72)
                        .addComponent(img_edit))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(input_telefone, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(label_telefone, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_nome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(input_nome))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(input_sobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(input_cpf)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(select_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                .addComponent(select_especialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_sobrenome)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(label_cargo)
                                        .addGap(160, 160, 160)
                                        .addComponent(label_especialidade)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(img_edit))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label_rp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(input_rp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(label_nome)
                        .addGap(5, 5, 5)
                        .addComponent(input_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_telefone))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(label_sobrenome)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(label_cargo))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(input_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label_especialidade))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(label_cpf))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(input_sobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(select_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(select_especialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(label_adm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_senha))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(select_adm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(input_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_ok)
                    .addComponent(btn_cancelar)))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 640, 320));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void select_admItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_select_admItemStateChanged
        if (evt.getStateChange() == 2) {
            if (select_adm.getSelectedItem().toString().equals("Sim")) {
                label_senha.setVisible(true);
                input_senha.setVisible(true);

                return;
            }

            if (select_adm.getSelectedItem().toString().equals("Não")) {
                label_senha.setVisible(false);
                input_senha.setVisible(false);

                return;
            }
        }
    }//GEN-LAST:event_select_admItemStateChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        label_senha.setVisible(false);
        input_senha.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {

            for (Funcionario f : funcionariodao.pesquisarFuncionario(Integer.parseInt(input_rp.getText()))) {
                input_nome.setText(f.getNome());
                input_cpf.setText(f.getCpf());
                input_telefone.setText(f.getTelefone());
                select_cargo.setSelectedItem(f.getCargo().toString());
                select_especialidade.setSelectedItem(f.getEspecialidade().toString());

                if (f.getAdmin() == 1) {
                    select_adm.setSelectedItem("Sim");
                } else if (f.getAdmin() == 0) {
                    select_adm.setSelectedItem("Não");
                }

                input_senha.setText(f.getSenha());
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(
                    null,
                    "Funcionário não encontrado",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_okActionPerformed

        try {

            funcionario.setRp(Integer.parseInt(input_rp.getText()));
            funcionario.setNome(input_nome.getText());
            funcionario.setCpf(input_cpf.getText());
            funcionario.setTelefone(input_telefone.getText());
            funcionario.setCargo(select_cargo.getSelectedItem().toString());
            funcionario.setEspecialidade(select_especialidade.getSelectedItem().toString());

            if (select_adm.getSelectedItem().toString() == "Sim") {
                funcionario.setAdmin(1);
            } else if (select_adm.getSelectedItem().toString() == "Não") {
                funcionario.setAdmin(0);
            }

            funcionario.setSenha(input_senha.getText());

            funcionariodao.alterarFuncionario(funcionario);

            JOptionPane.showMessageDialog(
                    null,
                    "Dados alterados com sucesso!",
                    "Dados alterados",
                    JOptionPane.INFORMATION_MESSAGE);
            
            input_rp.setText("");
            input_nome.setText("");
            input_sobrenome.setText("");
            input_cpf.setText("");
            select_cargo.setSelectedItem("-- Selecione --");
            select_especialidade.setSelectedItem("-- Selecione --");
            input_telefone.setText("");
            input_senha.setText("");
            select_adm.setSelectedItem("-- Selecione --");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Não foi possível alterar os dados!",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btn_okActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        controller.fechaTelaInterna(this);
    }//GEN-LAST:event_btn_cancelarActionPerformed

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
            java.util.logging.Logger.getLogger(Editar_funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editar_funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editar_funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editar_funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editar_funcionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_ok;
    private javax.swing.JLabel img_edit;
    private javax.swing.JTextField input_cpf;
    private javax.swing.JTextField input_nome;
    private javax.swing.JTextField input_rp;
    private javax.swing.JPasswordField input_senha;
    private javax.swing.JTextField input_sobrenome;
    private javax.swing.JTextField input_telefone;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel label_adm;
    private javax.swing.JLabel label_cargo;
    private javax.swing.JLabel label_cpf;
    private javax.swing.JLabel label_especialidade;
    private javax.swing.JLabel label_nome;
    private javax.swing.JLabel label_rp;
    private javax.swing.JLabel label_senha;
    private javax.swing.JLabel label_sobrenome;
    private javax.swing.JLabel label_telefone;
    private javax.swing.JComboBox<String> select_adm;
    private javax.swing.JComboBox<String> select_cargo;
    private javax.swing.JComboBox<String> select_especialidade;
    // End of variables declaration//GEN-END:variables
}
