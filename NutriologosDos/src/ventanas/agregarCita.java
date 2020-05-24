/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import clases.Conexion;
import javax.swing.JTextField;
import java.awt.Color;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
/**
 *
 * @author Andrew
 */
public class agregarCita extends javax.swing.JPanel {

    /**
     * Creates new form agregarCita
     */
    public agregarCita() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_pacienteID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_fecha = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_descripcion = new javax.swing.JTextField();
        btnAgregarCita = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setText("Agregar Cita");

        jLabel2.setText("Paciente ID:");

        jLabel3.setText("Fecha:");

        jLabel4.setText("Descripcion:");

        btnAgregarCita.setText("Agregar");
        btnAgregarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCitaActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("ejemplo: 2020-05-24");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_pacienteID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 40, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(btnAgregarCita)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_pacienteID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(32, 32, 32)
                .addComponent(btnAgregarCita)
                .addContainerGap(66, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCitaActionPerformed
        String descripcion, fecha, pacienteID;
        int invalidos = 0;

        JTextField[] campos = {txt_descripcion,txt_fecha,txt_pacienteID};

        // Recorremos los arreglos
        for (JTextField campo : campos) {

            // Verificamos primeramente que no esten vacios
            if (campo.getText().trim().equals("")) {
                // Lo ponemos color rojo
                campo.setBackground(Color.red);
                invalidos++;
            }
        }

        if (invalidos > 0) {
            JOptionPane.showMessageDialog(null, "Por favor, debe llenar todos los campos.");
        }
        else {
            // Guardamos todo lo de los campos de texto en nuestras variables
            descripcion = txt_descripcion.getText().trim();
            fecha = txt_fecha.getText().trim();
            pacienteID = txt_pacienteID.getText().trim();

            // Ya que obtuvimos los datos nos preparamos para hacer un query en la base de datos
            try {
                ResultSet rs = null;
                ResultSet RS = null;
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement ("INSERT INTO citas "
                    + "VALUES(?,?,?,?,?,?,?)");
                
                PreparedStatement ps = cn.prepareStatement("SELECT id FROM nutriologos");
                rs = ps.executeQuery();

                PreparedStatement PS = cn.prepareStatement("SELECT fecha_registro FROM pacientes WHERE id = ?");
                PS.setString(1, pacienteID);
                RS = PS.executeQuery();

                pst.setInt(1, 0);
                pst.setInt(2, Integer.parseInt(pacienteID));
                if(rs.next()){
                    pst.setInt(3,Integer.parseInt(rs.getString("id")));
                }
                pst.setDate(4, Date.valueOf(fecha));
                if(RS.next()){
                    pst.setString(5, RS.getString("fecha_registro"));
                } else {
                    JOptionPane.showMessageDialog(null,"No existe persona con esa id");
                }
                pst.setInt(6,0);
                pst.setString(7, descripcion);

                pst.executeUpdate();

                // Ahora limpiamos todos los campos y los ponemos en verde indicando exito
                for (JTextField campo : campos) {
                    campo.setText("");
                    campo.setBackground(Color.green);
                }

                cn.close();
                pst.close();
                rs.close();
                RS.close();
                ps.close();
                PS.close();

                JOptionPane.showMessageDialog(null, "Cita registrada con exito.");

                for (JTextField campo : campos) {
                    campo.setBackground(Color.white);
                }
            }
            catch (SQLException e) {
                System.err.println("Error en el boton agregar. " + e);
                JOptionPane.showMessageDialog(null, "Error al agendar cita. Contacte al administrador");
            }

        }
    }//GEN-LAST:event_btnAgregarCitaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txt_descripcion;
    private javax.swing.JTextField txt_fecha;
    private javax.swing.JTextField txt_pacienteID;
    // End of variables declaration//GEN-END:variables
}
