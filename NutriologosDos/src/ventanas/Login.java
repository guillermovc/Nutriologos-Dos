/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.sql.*;
import clases.Conexion;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {
    
    public static String user = "";
    String pass = "";
    
    public Login() {
        initComponents();
        setSize(400,450);
        setResizable(false);
        setTitle("Acceso al sistema");
        setLocationRelativeTo(null);
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_usuario = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        btn_acceder = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btn_acceder.setText("Acceder");
        btn_acceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_accederActionPerformed(evt);
            }
        });

        jLabel1.setText("NUTRIOLOGOS");

        jLabel2.setText("Nombre de usuario:");

        jLabel3.setText("Contraseña:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(136, 136, 136))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_password)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(txt_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(btn_acceder, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btn_acceder)
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_accederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_accederActionPerformed
        
        user = txt_usuario.getText().trim();
        pass = txt_password.getText().trim();
        
        if (!user.equals("") && !pass.equals("")) {
            
            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement (
                "SELECT nombre, apellido FROM nutriologos WHERE nombre_usuario = '" + user 
                        + "' AND password = '" + pass + "'");
                
                ResultSet rs = pst.executeQuery();
                if ( rs.next() ) {
                    
                    String nombre = rs.getString("nombre");
                    String apellido = rs.getString("apellido");
                    
                    JOptionPane.showMessageDialog(null, "Se ha logeado con el usuario: "
                    + nombre + " " + apellido);
                    
                    // Se abre la ventana principal
                    setVisible(false);
                    Consultor ventanaConsultor = new Consultor();
                    
                }
                else {
                    JOptionPane.showMessageDialog(null, "Datos de acceso incorrectos.");
                    txt_usuario.setText("");
                    txt_password.setText("");
                }
            }
            catch (SQLException e) {
                System.err.println("Error en el boton Acceder. " + e);
                JOptionPane.showMessageDialog(null, "Error al iniciar sesión. Contacte al administrador");
            }
            
        }
        else {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos.");
        }
        
    }//GEN-LAST:event_btn_accederActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_acceder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
