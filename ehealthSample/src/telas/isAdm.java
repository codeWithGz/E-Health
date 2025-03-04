
package telas;

import Classes.Funcionario;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class isAdm extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public isAdm() {
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        WhitePanel = new javax.swing.JPanel();
        btnControlePacientes = new javax.swing.JButton();
        lblSenha = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        ckSenha = new javax.swing.JCheckBox();
        txtSenha = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        eHealthText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fazer Login Com Administrador");
        setSize(new java.awt.Dimension(1080, 549));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

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

        btnControlePacientes.setBackground(new java.awt.Color(255, 255, 255));
        btnControlePacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/e-healthLogo.png"))); // NOI18N
        btnControlePacientes.setBorder(null);
        btnControlePacientes.setBorderPainted(false);
        btnControlePacientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnControlePacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnControlePacientesActionPerformed(evt);
            }
        });
        WhitePanel.add(btnControlePacientes);
        btnControlePacientes.setBounds(40, 20, 80, 100);

        lblSenha.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(122, 25, 182));
        lblSenha.setText("Senha");
        WhitePanel.add(lblSenha);
        lblSenha.setBounds(50, 180, 140, 20);

        lblUser.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        lblUser.setForeground(new java.awt.Color(122, 25, 182));
        lblUser.setText("Usuário");
        WhitePanel.add(lblUser);
        lblUser.setBounds(50, 120, 150, 20);

        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
        });
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        WhitePanel.add(txtEmail);
        txtEmail.setBounds(30, 140, 340, 30);

        ckSenha.setFont(new java.awt.Font("Snap ITC", 0, 12)); // NOI18N
        ckSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-closed-eye-64.png"))); // NOI18N
        ckSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckSenhaActionPerformed(evt);
            }
        });
        WhitePanel.add(ckSenha);
        ckSenha.setBounds(330, 201, 30, 29);

        txtSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSenhaFocusGained(evt);
            }
        });
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        WhitePanel.add(txtSenha);
        txtSenha.setBounds(30, 200, 340, 30);

        btnLogin.setBackground(new java.awt.Color(53, 47, 143));
        btnLogin.setFont(new java.awt.Font("Snap ITC", 0, 12)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Confirmar");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        WhitePanel.add(btnLogin);
        btnLogin.setBounds(80, 240, 220, 50);

        eHealthText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eHtxt.png"))); // NOI18N
        WhitePanel.add(eHealthText);
        eHealthText.setBounds(0, -170, 480, 340);

        jPanel2.add(WhitePanel);
        WhitePanel.setBounds(10, 10, 410, 350);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 430, 370);

        setSize(new java.awt.Dimension(446, 408));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:

        Funcionario func = new Funcionario();
        func.setUsuario(txtEmail.getText());
        func.setSenha(txtSenha.getText());
        
        boolean teste = func.LoginComAdm();
        
        
        
        if(teste)
        {
            cadastroFuncionarios inicial = new cadastroFuncionarios();
            inicial.show();
            this.dispose();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Permissão Negada!!");   

        }
        /*
        if (txtEmail.getText().equalsIgnoreCase("Giuuuustt" ) && txtSenha.getText().equals("1234") || txtEmail.getText().equalsIgnoreCase("" ) && txtSenha.getText().equals("") ) {
            JOptionPane.showMessageDialog(null, "Login Efetuado Com Sucesso, Seja Bem Vindo " + txtEmail.getText());
            index inicial = new index();
            inicial.show();
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Login ou Senha Invalidos");   
        }*/
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void txtSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhaFocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtSenhaFocusGained

    private void WhitePanelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_WhitePanelFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_WhitePanelFocusGained

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        txtEmail.requestFocus();
    }//GEN-LAST:event_formWindowOpened

    private void ckSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckSenhaActionPerformed
        // TODO add your handling code here:

        if (ckSenha.isSelected()) {
            txtSenha.setEchoChar((char)0);
            ckSenha.setIcon(new ImageIcon(getClass().getResource("/img/icons8-eye-64.png")));
        }else{
            txtSenha.setEchoChar('*');
            ckSenha.setIcon(new ImageIcon(getClass().getResource("/img/icons8-closed-eye-64.png")));
        }
    }//GEN-LAST:event_ckSenhaActionPerformed

    private void btnControlePacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnControlePacientesActionPerformed
        // TODO add your handling code here:
        
        login lgn = new login();
        lgn.show();
        this.dispose();
    }//GEN-LAST:event_btnControlePacientesActionPerformed

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
            java.util.logging.Logger.getLogger(isAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(isAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(isAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(isAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new isAdm().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel WhitePanel;
    private javax.swing.JButton btnControlePacientes;
    private javax.swing.JButton btnLogin;
    private javax.swing.JCheckBox ckSenha;
    private javax.swing.JLabel eHealthText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUser;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
