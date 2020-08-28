
package view;

import controller.PacienteDAOALL;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.PacienteALL;


public class MDI_ALLForm extends javax.swing.JFrame {


    public MDI_ALLForm() {
        initComponents();
         configurarFormulario();
         limparCampo();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtAltura = new javax.swing.JTextField();
        txtidpaciente = new javax.swing.JTextField();
        txtNomepaciente = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        jbSalvar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabResultado = new javax.swing.JTable();
        jbSair = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        txtPorNome = new javax.swing.JTextField();
        jButtonPorNome = new javax.swing.JButton();
        jButtonListar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        jbNovo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Paciente ALL CRUD");
        desktopPane.add(jLabel1);
        jLabel1.setBounds(260, 0, 390, 90);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Altura Paciente");
        desktopPane.add(jLabel2);
        jLabel2.setBounds(110, 210, 100, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("ID");
        desktopPane.add(jLabel3);
        jLabel3.setBounds(180, 120, 40, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Nome Paciente");
        desktopPane.add(jLabel4);
        jLabel4.setBounds(120, 150, 100, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Peso Paciente");
        desktopPane.add(jLabel5);
        jLabel5.setBounds(120, 180, 90, 30);

        txtAltura.setText("jTextField1");
        desktopPane.add(txtAltura);
        txtAltura.setBounds(230, 210, 180, 30);

        txtidpaciente.setText("jTextField1");
        desktopPane.add(txtidpaciente);
        txtidpaciente.setBounds(230, 119, 180, 30);

        txtNomepaciente.setText("jTextField1");
        desktopPane.add(txtNomepaciente);
        txtNomepaciente.setBounds(230, 150, 180, 30);

        txtPeso.setText("jTextField1");
        desktopPane.add(txtPeso);
        txtPeso.setBounds(230, 180, 180, 30);

        jbSalvar.setBackground(new java.awt.Color(204, 204, 255));
        jbSalvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbSalvar.setText("SALVAR");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });
        desktopPane.add(jbSalvar);
        jbSalvar.setBounds(650, 180, 140, 50);

        jbEditar.setBackground(new java.awt.Color(204, 255, 204));
        jbEditar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbEditar.setText("EDITAR");
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });
        desktopPane.add(jbEditar);
        jbEditar.setBounds(480, 110, 150, 50);

        tabResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabResultado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabResultadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabResultado);

        desktopPane.add(jScrollPane1);
        jScrollPane1.setBounds(30, 250, 860, 160);

        jbSair.setBackground(new java.awt.Color(255, 153, 153));
        jbSair.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbSair.setText("SAIR");
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });
        desktopPane.add(jbSair);
        jbSair.setBounds(180, 480, 140, 60);

        jbCancelar.setBackground(new java.awt.Color(102, 255, 102));
        jbCancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbCancelar.setText("CANCELAR");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });
        desktopPane.add(jbCancelar);
        jbCancelar.setBounds(30, 480, 140, 60);

        txtPorNome.setText("jTextField1");
        txtPorNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPorNomeActionPerformed(evt);
            }
        });
        desktopPane.add(txtPorNome);
        txtPorNome.setBounds(540, 420, 340, 30);

        jButtonPorNome.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonPorNome.setText("POR NOME");
        jButtonPorNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPorNomeActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonPorNome);
        jButtonPorNome.setBounds(630, 460, 180, 21);

        jButtonListar.setBackground(new java.awt.Color(255, 255, 102));
        jButtonListar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonListar.setText("LISTAR");
        jButtonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonListar);
        jButtonListar.setBounds(330, 480, 160, 60);

        btnDeletar.setBackground(new java.awt.Color(255, 51, 51));
        btnDeletar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDeletar.setText("DELETAR");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });
        desktopPane.add(btnDeletar);
        btnDeletar.setBounds(650, 110, 140, 50);

        jbNovo.setBackground(new java.awt.Color(0, 255, 204));
        jbNovo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbNovo.setText("NOVO");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });
        desktopPane.add(jbNovo);
        jbNovo.setBounds(480, 180, 150, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 944, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        if (!txtidpaciente.getText().isEmpty()){
            estadoControle(false);
        }
        else{
            JOptionPane.showMessageDialog(null, "Selecione o paciente que deseja editar.", "Pacientes", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        PacienteALL p = new PacienteALL();
        if(!txtidpaciente.getText().isEmpty()){
            p.setId(Integer.parseInt(txtidpaciente.getText()));
        }
        p.setNome(txtNomepaciente.getText());
        p.setPeso(Float.parseFloat(txtPeso.getText()));
        p.setAltura(Float.parseFloat(txtAltura.getText()));
        
        int res = -1;
        
        if(p.getId() == 0){
            res = new PacienteDAOALL().inserir(p);
            txtidpaciente.setText(Integer.toString(res));
        }else{
            res = new PacienteDAOALL().atualizar(p);
            
        }
        if (res != -1){
            JOptionPane.showMessageDialog(null, "Operação realizada com sucesso!", "Pacientes", 
                    JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "Não foi possível realizar a operação.”", "Pacientes", 
                    JOptionPane.ERROR_MESSAGE);
        }
        estadoControle(true);
        preencherTabela(new PacienteDAOALL().listar());
        limparCampo();
        //txtAltura.setText("");
        //txtNomepaciente.setText("");
        //txtPeso.setText("");
        //txtidpaciente.setText("");
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        estadoControle(true);
        limparCampo();
//        txtAltura.setText("");
//        txtNomepaciente.setText("");
//        txtPeso.setText("");
//        txtidpaciente.setText("");

        
        
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        dispose();
    }//GEN-LAST:event_jbSairActionPerformed

    private void tabResultadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabResultadoMouseClicked
        int linha = tabResultado.getSelectedRow();
        if(linha >= 0){
            txtidpaciente.setText(tabResultado.getValueAt(linha, 0).toString());
            txtNomepaciente.setText(tabResultado.getValueAt(linha, 1).toString());
            txtPeso.setText(tabResultado.getValueAt(linha, 2).toString());
            txtAltura.setText(tabResultado.getValueAt(linha, 3).toString());
        }
    }//GEN-LAST:event_tabResultadoMouseClicked

    private void txtPorNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPorNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPorNomeActionPerformed

    private void jButtonPorNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPorNomeActionPerformed

        String nome = txtPorNome.getText();
        if(!nome.isEmpty()){
            JOptionPane.showMessageDialog(null,"Pesquisando nomes com a letra ( "
                + txtPorNome.getText() +  " ) ", "Pesquisa por nome",
                 JOptionPane.INFORMATION_MESSAGE);
            preencherTabela(new PacienteDAOALL().pesquisarPorNome(nome));
        }
        else{
             JOptionPane.showMessageDialog(null, "Retornando Lista completa",
                     "Lista completa",
                   JOptionPane.WARNING_MESSAGE);
            preencherTabela(new PacienteDAOALL().listar());
        }
        estadoControle(false);
    }//GEN-LAST:event_jButtonPorNomeActionPerformed

    private void jButtonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarActionPerformed
        preencherTabela(new PacienteDAOALL().listar());
    }//GEN-LAST:event_jButtonListarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        PacienteALL p = new PacienteALL();
        p.setId(Integer.parseInt(txtidpaciente.getText()));
        PacienteDAOALL d = new PacienteDAOALL();
        d.deletar(p);
        preencherTabela(new PacienteDAOALL().listar());
        estadoControle(true);
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        estadoControle(false);

        txtidpaciente.setText("");
        txtNomepaciente.setText("");
        txtPeso.setText("");
        txtAltura.setText("");

        //configurarTabela();
    }//GEN-LAST:event_jbNovoActionPerformed

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
            java.util.logging.Logger.getLogger(MDI_ALLForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MDI_ALLForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MDI_ALLForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MDI_ALLForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MDI_ALLForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeletar;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jButtonListar;
    private javax.swing.JButton jButtonPorNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbSair;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JTable tabResultado;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtNomepaciente;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtPorNome;
    private javax.swing.JTextField txtidpaciente;
    // End of variables declaration//GEN-END:variables

    
       
    private void configurarFormulario(){
        this.setTitle("Java UPDATE - Escola Evolua Sumaré");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        estadoControle(true); 
        txtidpaciente.setEnabled(false);
        //preencherTabela(new PacienteDAOALL().listar());
        //ou
        configurarTabela();
        //limparCampo();
        txtAltura.setText("");
        txtNomepaciente.setText("");
        txtPeso.setText("");
        txtidpaciente.setText("");
        txtPorNome.setText("");
    }
   
    private void estadoControle(boolean e){
//         jbNovo.setEnabled(e);
         jbEditar.setEnabled(e);
         jbSalvar.setEnabled(!e);
         jbCancelar.setEnabled(!e);

         txtNomepaciente.setEnabled(!e);
         txtPeso.setEnabled(!e);
         txtAltura.setEnabled(!e);

    }
    
    private void configurarTabela(){
        DefaultTableModel m = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }};
            
                m.addColumn("Id do Paciente");
                m.addColumn("Nome do Paciente");
                m.addColumn("Peso do Paciente");
                m.addColumn("Altura do Paciente"); 
                
                tabResultado.setModel(m);
    }
    
    
    private void preencherTabela(List<PacienteALL> lista){
        if(lista.size()>0){
            configurarTabela();
            DefaultTableModel m = (DefaultTableModel)tabResultado.getModel();
            
            for(PacienteALL p : lista){
                m.addRow(new Object[]{
                p.getId(), p.getNome(), p.getPeso(), p.getAltura()
            });
            }
            tabResultado.setModel(m);
        }
    }
    
    
    private void limparCampo(){
        txtAltura.setText("");
        txtNomepaciente.setText("");
        txtPeso.setText("");
        txtidpaciente.setText("");
        txtPorNome.setText("");
    }
}










//listar botao
//       preencherTabela(new PacienteDAOALL().listar());







//Inserir e atualizar
/*
        PacienteALL p = new PacienteALL();
        if(!txtidpaciente.getText().isEmpty()){
            p.setId(Integer.parseInt(txtidpaciente.getText()));
        }
        p.setNome(txtNomepaciente.getText());
        p.setPeso(Float.parseFloat(txtPeso.getText()));
        p.setAltura(Float.parseFloat(txtAltura.getText()));
        
        int res = -1;
        
        if(p.getId() == 0){
            res = new PacienteDAOALL().inserir(p);
            txtidpaciente.setText(Integer.toString(res));
        }
        else{
            res = new PacienteDAOALL().atualizar(p);
        }
        
        if (res != -1){
            JOptionPane.showMessageDialog(null, "Operação realizada com sucesso!", "Pacientes", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "Não foi possível realizar a operação.”", "Pacientes", JOptionPane.ERROR_MESSAGE);
        }
        estadoControle(true);
        preencherTabela(new PacienteDAOALL().listar());
        limparCampo();

*/