
package telas;

import Classes.Pacientes;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class controlePacientesExcluir extends javax.swing.JFrame {

    /**
     * Creates new form controlePacientes
     */
    public controlePacientesExcluir() {
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

        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        WhitePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPlanoSaude = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtAlergia = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtObs = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        frmtNumero = new javax.swing.JFormattedTextField();
        frmtCPF = new javax.swing.JFormattedTextField();
        frmtData = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtMotivo = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle De Pacientes");
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(1, 28, 102));
        jPanel9.setLayout(null);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1112, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 859, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel10);
        jPanel10.setBounds(1576, 24, 1112, 859);

        WhitePanel.setBackground(new java.awt.Color(255, 255, 255));
        WhitePanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        WhitePanel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                WhitePanelFocusGained(evt);
            }
        });
        WhitePanel.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(203, 39, 61));
        jLabel1.setText("Motivo da Consulta");
        WhitePanel.add(jLabel1);
        jLabel1.setBounds(600, 160, 260, 20);

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        WhitePanel.add(txtNome);
        txtNome.setBounds(20, 40, 460, 30);

        jLabel2.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(203, 39, 61));
        jLabel2.setText("Gênero");
        WhitePanel.add(jLabel2);
        jLabel2.setBounds(30, 140, 210, 20);

        jLabel3.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(203, 39, 61));
        jLabel3.setText("Data de Nascimento");
        WhitePanel.add(jLabel3);
        jLabel3.setBounds(30, 80, 210, 20);

        jLabel4.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(203, 39, 61));
        jLabel4.setText("Cpf");
        WhitePanel.add(jLabel4);
        jLabel4.setBounds(30, 200, 310, 20);

        jLabel5.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(203, 39, 61));
        jLabel5.setText("Endereço");
        WhitePanel.add(jLabel5);
        jLabel5.setBounds(30, 260, 210, 20);

        txtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenderActionPerformed(evt);
            }
        });
        WhitePanel.add(txtGender);
        txtGender.setBounds(20, 160, 460, 30);

        jLabel6.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(203, 39, 61));
        jLabel6.setText("Numero de Telefone");
        WhitePanel.add(jLabel6);
        jLabel6.setBounds(30, 320, 210, 20);

        jLabel7.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(203, 39, 61));
        jLabel7.setText("Email");
        WhitePanel.add(jLabel7);
        jLabel7.setBounds(30, 380, 210, 20);

        txtPlanoSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlanoSaudeActionPerformed(evt);
            }
        });
        WhitePanel.add(txtPlanoSaude);
        txtPlanoSaude.setBounds(20, 460, 460, 30);

        jLabel8.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(203, 39, 61));
        jLabel8.setText("Plano de Saude");
        WhitePanel.add(jLabel8);
        jLabel8.setBounds(30, 440, 210, 20);
        WhitePanel.add(txtAlergia);
        txtAlergia.setBounds(590, 40, 410, 110);

        jLabel9.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(203, 39, 61));
        jLabel9.setText("O Paciente Possui Alergias?");
        WhitePanel.add(jLabel9);
        jLabel9.setBounds(590, 10, 410, 30);

        jLabel10.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(203, 39, 61));
        jLabel10.setText("Observações");
        WhitePanel.add(jLabel10);
        jLabel10.setBounds(600, 330, 260, 20);

        txtObs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtObsActionPerformed(evt);
            }
        });
        WhitePanel.add(txtObs);
        txtObs.setBounds(590, 350, 410, 140);

        jButton2.setBackground(new java.awt.Color(203, 39, 61));
        jButton2.setFont(new java.awt.Font("Snap ITC", 0, 12)); // NOI18N
        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        WhitePanel.add(jButton2);
        jButton2.setBounds(760, 500, 120, 24);

        try {
            frmtNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        WhitePanel.add(frmtNumero);
        frmtNumero.setBounds(20, 340, 460, 30);

        try {
            frmtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        WhitePanel.add(frmtCPF);
        frmtCPF.setBounds(20, 220, 460, 30);

        try {
            frmtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        WhitePanel.add(frmtData);
        frmtData.setBounds(20, 100, 460, 30);

        jLabel11.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(203, 39, 61));
        jLabel11.setText("Nome");
        WhitePanel.add(jLabel11);
        jLabel11.setBounds(30, 20, 60, 20);

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        WhitePanel.add(txtEmail);
        txtEmail.setBounds(20, 400, 460, 30);

        txtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoActionPerformed(evt);
            }
        });
        WhitePanel.add(txtEndereco);
        txtEndereco.setBounds(20, 280, 460, 30);
        WhitePanel.add(txtMotivo);
        txtMotivo.setBounds(590, 180, 410, 140);

        jButton4.setFont(new java.awt.Font("Snap ITC", 0, 12)); // NOI18N
        jButton4.setText("Excluir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        WhitePanel.add(jButton4);
        jButton4.setBounds(890, 500, 110, 24);

        jPanel9.add(WhitePanel);
        WhitePanel.setBounds(10, 10, 1060, 540);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void WhitePanelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_WhitePanelFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_WhitePanelFocusGained

    public void setText(String nome, String birthDate, String cpf, String gender, String phoneNumber, String healthPlan, String address, String email, String allergy, String motive, String obs) {
    txtNome.setText(nome);
    frmtData.setText(birthDate);
    frmtCPF.setText(cpf);
    txtGender.setText(gender);
    frmtNumero.setText(phoneNumber);
    txtPlanoSaude.setText(healthPlan); 
    txtEndereco.setText(address);
    txtEmail.setText(email);
    txtAlergia.setText(allergy);
    txtMotivo.setText(motive);
    txtObs.setText(obs);
    }
    
    



    public void desabilitarCampos() {
    txtNome.setEditable(false);
    frmtData.setEditable(false);
    txtGender.setEnabled(false);
    frmtCPF.setEditable(false);
    txtGender.setEditable(false);
    frmtNumero.setEditable(false);
    txtPlanoSaude.setEditable(false);


}

    
    
    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderActionPerformed

    private void txtPlanoSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlanoSaudeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlanoSaudeActionPerformed

    private void txtObsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtObsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtObsActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:

                frmtCPF.disable();
        
    }//GEN-LAST:event_formWindowOpened

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
            optionControle optCntrl = new optionControle();
            optCntrl.show();
            this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        int confirm = JOptionPane.showConfirmDialog(null, "Deseja Realmente Excluir Esse Paciente?");
        if (confirm == JOptionPane.YES_OPTION) {
                Pacientes paciente = new Pacientes();
                paciente.excluir(frmtCPF.getText());
                
        optionControle optCntrl = new optionControle();
        optCntrl.show();
        this.dispose();
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(controlePacientesExcluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(controlePacientesExcluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(controlePacientesExcluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(controlePacientesExcluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new controlePacientesExcluir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel WhitePanel;
    private javax.swing.JFormattedTextField frmtCPF;
    private javax.swing.JFormattedTextField frmtData;
    private javax.swing.JFormattedTextField frmtNumero;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField txtAlergia;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtMotivo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtObs;
    private javax.swing.JTextField txtPlanoSaude;
    // End of variables declaration//GEN-END:variables
}
