
package telas;


public class gestaoExamesConsultar extends javax.swing.JFrame {


    public gestaoExamesConsultar() {
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

        popupMenu1 = new java.awt.PopupMenu();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        WhitePanel = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtExamPacient = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        frmtExamData = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        txtMedic = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtExamObs = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtExamUrge = new javax.swing.JTextField();
        txtExamType = new javax.swing.JTextField();
        txtExamStatus = new javax.swing.JTextField();
        fileProntuario = new javax.swing.JFileChooser();

        popupMenu1.setLabel("popupMenu1");
        popupMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popupMenu1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestão de Exames");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(1, 28, 102));
        jPanel2.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1112, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 859, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel1);
        jPanel1.setBounds(1576, 24, 1112, 859);

        WhitePanel.setBackground(new java.awt.Color(255, 255, 255));
        WhitePanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        WhitePanel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                WhitePanelFocusGained(evt);
            }
        });
        WhitePanel.setLayout(null);

        jButton2.setBackground(new java.awt.Color(203, 39, 61));
        jButton2.setFont(new java.awt.Font("Snap ITC", 0, 12)); // NOI18N
        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        WhitePanel.add(jButton2);
        jButton2.setBounds(760, 500, 240, 24);

        jLabel9.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(203, 39, 61));
        jLabel9.setText("Paciente");
        WhitePanel.add(jLabel9);
        jLabel9.setBounds(30, 20, 150, 20);

        txtExamPacient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExamPacientActionPerformed(evt);
            }
        });
        WhitePanel.add(txtExamPacient);
        txtExamPacient.setBounds(20, 40, 460, 30);

        jLabel3.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(203, 39, 61));
        jLabel3.setText("Data e Hora do Exame");
        WhitePanel.add(jLabel3);
        jLabel3.setBounds(30, 330, 280, 20);

        try {
            frmtExamData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####   ##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        WhitePanel.add(frmtExamData);
        frmtExamData.setBounds(20, 350, 460, 30);

        jLabel10.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(203, 39, 61));
        jLabel10.setText("Médico Responsável");
        WhitePanel.add(jLabel10);
        jLabel10.setBounds(30, 260, 240, 20);

        txtMedic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedicActionPerformed(evt);
            }
        });
        WhitePanel.add(txtMedic);
        txtMedic.setBounds(20, 280, 460, 30);

        jLabel4.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(203, 39, 61));
        jLabel4.setText("Status do Exame");
        WhitePanel.add(jLabel4);
        jLabel4.setBounds(30, 140, 210, 20);

        jLabel11.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(203, 39, 61));
        jLabel11.setText("Observações");
        WhitePanel.add(jLabel11);
        jLabel11.setBounds(540, 10, 160, 30);

        txtExamObs.setActionCommand("<Not Set>");
        txtExamObs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExamObsActionPerformed(evt);
            }
        });
        WhitePanel.add(txtExamObs);
        txtExamObs.setBounds(540, 40, 460, 400);

        jLabel5.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(203, 39, 61));
        jLabel5.setText("Tipo de Exame");
        WhitePanel.add(jLabel5);
        jLabel5.setBounds(30, 80, 210, 20);

        jButton4.setBackground(new java.awt.Color(203, 39, 61));
        jButton4.setFont(new java.awt.Font("Snap ITC", 0, 12)); // NOI18N
        jButton4.setText("Voltar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        WhitePanel.add(jButton4);
        jButton4.setBounds(760, 500, 120, 24);

        jLabel6.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(203, 39, 61));
        jLabel6.setText("Upload De Resultados do Exame");
        WhitePanel.add(jLabel6);
        jLabel6.setBounds(30, 400, 330, 20);

        jButton6.setFont(new java.awt.Font("Snap ITC", 0, 12)); // NOI18N
        jButton6.setText("Fazer Upload");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        WhitePanel.add(jButton6);
        jButton6.setBounds(30, 430, 130, 24);

        jLabel7.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(203, 39, 61));
        jLabel7.setText("Urgência do Exame");
        WhitePanel.add(jLabel7);
        jLabel7.setBounds(30, 200, 210, 20);
        WhitePanel.add(txtExamUrge);
        txtExamUrge.setBounds(20, 222, 460, 30);
        WhitePanel.add(txtExamType);
        txtExamType.setBounds(20, 100, 460, 30);
        WhitePanel.add(txtExamStatus);
        txtExamStatus.setBounds(20, 160, 460, 30);
        WhitePanel.add(fileProntuario);
        fileProntuario.setBounds(20, 10, 597, 347);

        jPanel2.add(WhitePanel);
        WhitePanel.setBounds(10, 10, 1060, 540);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 565, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void WhitePanelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_WhitePanelFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_WhitePanelFocusGained

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        optionExames optExame = new optionExames();
        optExame.show();
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void popupMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popupMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_popupMenu1ActionPerformed

    private void txtExamPacientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExamPacientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExamPacientActionPerformed

    private void txtMedicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedicActionPerformed

    private void txtExamObsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExamObsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExamObsActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        optionRegistro optRgstr = new optionRegistro();
        optRgstr.show();
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        fileProntuario.show();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        fileProntuario.hide();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(gestaoExamesConsultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gestaoExamesConsultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gestaoExamesConsultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gestaoExamesConsultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gestaoExamesConsultar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel WhitePanel;
    private javax.swing.JFileChooser fileProntuario;
    private javax.swing.JFormattedTextField frmtExamData;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JTextField txtExamObs;
    private javax.swing.JTextField txtExamPacient;
    private javax.swing.JTextField txtExamStatus;
    private javax.swing.JTextField txtExamType;
    private javax.swing.JTextField txtExamUrge;
    private javax.swing.JTextField txtMedic;
    // End of variables declaration//GEN-END:variables

    public void setText(String paciente,String type, String status, String urge, String medic, String data, String obs) {
       txtExamPacient.setText(paciente);
       txtExamType.setText(type);
       txtExamStatus.setText(status);
       txtExamUrge.setText(urge);
       txtMedic.setText(medic);
       frmtExamData.setText(data);
       txtExamObs.setText(obs);
    }
}
