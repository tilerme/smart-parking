/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesUsuario;

import bancoDeDados.ConexaoBanco;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.ControleVagas;

/**
 * @author Smart Parking
 * @version 1.0
 */
public class CadastroUsuario extends javax.swing.JFrame {

    private ConexaoBanco conexaoBanco;
    private Statement statement;
    private ResultSet result;
    
    /**
     * Creates new form CadastroEstudante
     */
    public CadastroUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    private void limparCampos (){
        Nome.setText(null);
        CPF.setText(null);
        Matricula.setText(null);
        Curso.setText(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Matricula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Curso = new javax.swing.JTextField();
        TemDeficiencia = new javax.swing.JCheckBox();
        Confirmar = new javax.swing.JButton();
        Voltar = new javax.swing.JButton();
        Estudante = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        Senha = new javax.swing.JPasswordField();
        CPF = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Cadastro de Usuário");
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jLabel1.setText("Nome Completo");

        jLabel2.setText("Matrícula/Código de Acesso");

        jLabel3.setText("CPF");

        jLabel4.setText("Curso/Cargo");

        TemDeficiencia.setText("Portador de Deficiência");

        Confirmar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Confirmar.setText("Confirmar");
        Confirmar.setToolTipText("Clique para confirmar gravação.");
        Confirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConfirmarMouseClicked(evt);
            }
        });
        Confirmar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ConfirmarKeyPressed(evt);
            }
        });

        Voltar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Voltar.setText("Voltar");
        Voltar.setToolTipText("Clique para cancelar a operação.");
        Voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VoltarMouseClicked(evt);
            }
        });
        Voltar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                VoltarKeyPressed(evt);
            }
        });

        Estudante.setText("Estudante");

        jLabel5.setText("Senha");

        try {
            CPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(Matricula, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)))
                    .addComponent(Nome, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Curso, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(TemDeficiencia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Estudante)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Senha)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Confirmar, Voltar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TemDeficiencia)
                    .addComponent(Estudante))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Confirmar, Voltar});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmarMouseClicked
        if (this.validaGravacao()){
            this.gravarUsuario();
        }
    }//GEN-LAST:event_ConfirmarMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

    }//GEN-LAST:event_formMouseClicked

    private void VoltarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_VoltarKeyPressed
        if (evt.getKeyCode() == 10){
            this.retornarTela();
        }
    }//GEN-LAST:event_VoltarKeyPressed

    private void ConfirmarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ConfirmarKeyPressed
        if (evt.getKeyCode() == 10){
            if (this.validaGravacao()){
                this.gravarUsuario();
            }
        }
    }//GEN-LAST:event_ConfirmarKeyPressed

    private void VoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VoltarMouseClicked
        this.retornarTela();
    }//GEN-LAST:event_VoltarMouseClicked

    private void retornarTela(){
        Administracao administracao = new Administracao();
        administracao.show();
        this.dispose();
    }
    
     /**
     * Validar gravação de um novo usuário.
     * @return boolean
     */
    private boolean validaGravacao(){
        if ("".equals(Nome.getText().trim())){
            JOptionPane.showMessageDialog(null,"Favor preencher o nome do usuário.");
            return false;
        }
        if ("".equals(CPF.getText().trim())){
            JOptionPane.showMessageDialog(null,"Favor preencher o CPF do usuário.");
            return false;
        }
        if ("".equals(Curso.getText().trim())){
            JOptionPane.showMessageDialog(null,"Favor preencher o curso do usuário.");
            return false;
        }
        if ("".equals(Matricula.getText().trim())){
            JOptionPane.showMessageDialog(null,"Favor preencher o código de acesso do usuário.");
            return false;
        }
        if ("".equals(Senha.getText().trim())){
            JOptionPane.showMessageDialog(null,"Favor preencher a senha do usuário.");
            return false;
        }
        
        try{
           long teste = Long.parseLong(Matricula.getText());
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Favor digitar uma numeração válida para o código de acesso.");
            return false;
        }
        
        String matricula = Matricula.getText().trim();
        if (matricula.length() > 8){
            JOptionPane.showMessageDialog(null,"A matrícula deve possuir no máximo 8 caracteres.");
            return false;
        }
        
        return true;
    }
    
     /**
     * Grava novo usuário no banco de dados.
     * @return void
     */
    private void gravarUsuario(){
        String update, insert;
        
        try {
            conexaoBanco = new ConexaoBanco();
            statement = conexaoBanco.conexao.createStatement();
            result = statement.executeQuery("select * from usuarios where CodigoAcesso_Usuario = " + Integer.parseInt(Matricula.getText()));

            if (result.next()){
                update = "UPDATE usuarios SET ";
                update = update + "Nome_Usuario = '" + Nome.getText() + "', ";
                update = update + "CPF_Usuario = '" + CPF.getText() + "', ";
                if (TemDeficiencia.isSelected()){
                    update = update + "Deficiente_Usuario = 'S', ";
                }
                else{
                    update = update + "Deficiente_Usuario = 'N', ";
                }
                if (Estudante.isSelected()){
                    update = update + "Tipo_Usuario = 'E', ";
                }
                else{
                    update = update + "Tipo_Usuario = 'F', ";
                }
                update = update + "Cargo_Usuario = '" + Curso.getText() + "', ";
                update = update + "Senha_Usuario = '" + Senha.getText() + "' ";
                update = update + "WHERE CodigoAcesso_Usuario = " + Matricula.getText();
                int updateStatement = statement.executeUpdate(update);
                if (updateStatement > 0){
                    JOptionPane.showMessageDialog(null,"Usuario Alterado com Sucesso!");
                    this.retornarTela();
                }
            }
            else{
                insert = "INSERT INTO estacionamento.usuarios(Nome_Usuario, CPF_Usuario, CodigoAcesso_Usuario,";
                insert = insert + " Deficiente_Usuario, Tipo_Usuario, Cargo_Usuario, Senha_Usuario, CodigoVaga_Usuario) VALUES (";
                insert = insert + "'" + Nome.getText() + "', ";
                insert = insert + "'" + CPF.getText() + "', ";
                insert = insert + Matricula.getText() + ", ";
                if (TemDeficiencia.isSelected()){
                    insert = insert + "'S', ";
                }
                else{
                    insert = insert + "'N', ";
                }
                if (Estudante.isSelected()){
                    insert = insert + "'E', ";
                }
                else{
                    insert = insert + "'F', ";
                }
                insert = insert + "'" + Curso.getText() + "', ";
                insert = insert + "'" + Senha.getText() + "', ";
                insert = insert + "' ')";
                int updateStatement = statement.executeUpdate(insert);
                if (updateStatement > 0){
                    JOptionPane.showMessageDialog(null,"Usuario Cadastrado com Sucesso!");
                    this.retornarTela();
                }  
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ControleVagas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro ao inserir/alterar usuario. \n" + ex.getMessage());
        }
        finally{
            try {
                if (!statement.isClosed()){
                    statement.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(ControleVagas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField CPF;
    private javax.swing.JButton Confirmar;
    private javax.swing.JTextField Curso;
    private javax.swing.JCheckBox Estudante;
    private javax.swing.JTextField Matricula;
    private javax.swing.JTextField Nome;
    private javax.swing.JPasswordField Senha;
    private javax.swing.JCheckBox TemDeficiencia;
    private javax.swing.JButton Voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
