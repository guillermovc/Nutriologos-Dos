package clientes;

import java.sql.SQLException;
import clases.Conexion;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
        
public class PanelModificarCliente extends javax.swing.JPanel {
    String id = "";
    
    public PanelModificarCliente() {
        initComponents();
        
        
        id= PanelVerClientes.id_cliente;
        
        try {
            Connection cn = Conexion.conectar();
            
            PreparedStatement pst = cn.prepareStatement("SELECT nombre, apellido, ciudad, direccion, telefono, mail, sexo, peso, estatura, edad "
                                + "FROM pacientes "
                                + "WHERE id = ?");
            pst.setString(1, id);
            
            ResultSet rs = pst.executeQuery();
            
            if (rs.next()) {
                txt_nombre.setText(rs.getString("nombre"));
                txt_apellidos.setText(rs.getString("apellido"));
                txt_ciudad.setText(rs.getString("ciudad"));
                txt_direccion.setText(rs.getString("direccion"));
                txt_telefono.setText(rs.getString("telefono"));
                txt_mail.setText(rs.getString("mail"));
                
                if (rs.getString("sexo").equals("M")) {
                    cb_sexo.setSelectedIndex(0);
                }
                else {
                    cb_sexo.setSelectedIndex(1);
                }
                
                txt_peso.setText(rs.getString("peso"));
                txt_estatura.setText(rs.getString("estatura"));
                txt_edad.setText(rs.getString("edad"));
                
            }
            
        }
        catch (SQLException e) {
            System.err.println("Error al acceder a la base de datos. " + e);
            JOptionPane.showMessageDialog(null, "Error al conectarse. Contacte al administrador");
        }
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        txt_ciudad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_mail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_edad = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_peso = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_estatura = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnAplicarCambios = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cb_sexo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txt_apellidos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();

        jLabel4.setText("Ciudad:");

        jLabel5.setText("Dirección:");

        jLabel6.setText("Teléfono:");

        jLabel7.setText("Mail");

        jLabel8.setText("Sexo:");

        jLabel9.setText("Edad:");

        jLabel10.setText("Peso:");

        jLabel11.setText("Estatura:");

        btnAplicarCambios.setText("Aplicar cambios");
        btnAplicarCambios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAplicarCambios.setDefaultCapable(false);
        btnAplicarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAplicarCambiosActionPerformed(evt);
            }
        });

        jLabel1.setText("Modificar datos");

        cb_sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellidos:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel6)))
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt_ciudad, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_nombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel3))
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(47, 47, 47)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_mail)
                                    .addComponent(txt_apellidos, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_direccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_peso, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_estatura, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 563, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAplicarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(251, 251, 251))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(cb_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(txt_estatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(txt_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(txt_peso, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(btnAplicarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAplicarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplicarCambiosActionPerformed
        // Declaramos cadenas para almacenar lo que hay en los capos de texto
        String nombres, apellidos, ciudad, direccion, telefono, mail, sexo, edad, peso, estatura;
        int invalidos = 0; // Nos dira si quedaron campos invalidos
        
        // Obtenemos lo que este escrito y validamos
        // Creamos un arreglo para recorrer los campos de texto de una manera mas clara
        JTextField[] campos = {txt_nombre, txt_apellidos, txt_ciudad, txt_direccion,
                               txt_telefono, txt_mail, txt_edad, txt_peso, txt_estatura};
        
        // Recorremos los arreglos
        for (JTextField campo : campos) {
            
            // Verificamos primeramente que no esten vacios
            if (campo.getText().trim().equals("")) {
                // Lo ponemos color rojo
                campo.setBackground(Color.red);
                invalidos++;
            }
            
        }
        
        // Si hubo campos invalidos, mandamos el error correspondiente
        if (invalidos > 0) {
            JOptionPane.showMessageDialog(null, "Por favor, debe llenar todos los campos.");
        }
        else {
            // Guardamos todo lo de los campos de texto en nuestras variables   
            nombres = txt_nombre.getText().trim();
            apellidos = txt_apellidos.getText().trim();
            ciudad = txt_ciudad.getText().trim();
            direccion = txt_direccion.getText().trim();
            telefono = txt_telefono.getText().trim();
            mail = txt_mail.getText().trim();
            edad = txt_edad.getText().trim();
            peso = txt_peso.getText().trim();
            estatura = txt_estatura.getText().trim();
            
            // Ya que obtuvimos los datos nos preparamos para hacer un query en la base de datos
            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement ("UPDATE pacientes "
                        + "SET nombre=?,apellido=?,ciudad=?,direccion=?,telefono=?,mail=?,sexo=?,peso=?,estatura=?,edad=?"
                        + "WHERE id = '" + id + "'");
                
                
                pst.setString(1, nombres);
                pst.setString(2, apellidos);
                pst.setString(3, ciudad);
                pst.setString(4, direccion);
                pst.setString(5, telefono);
                pst.setString(6, mail);
                if (cb_sexo.getSelectedItem().toString().equals("Masculino")) {
                    pst.setString(7, "M");
                }
                else {
                    pst.setString(7, "F");
                }
                pst.setFloat(8, Float.parseFloat(peso));
                pst.setFloat(9, Float.parseFloat(estatura));
                pst.setString(10, edad);
                
                
                pst.executeUpdate();
                
                
                cn.close();
                pst.close();
                
                JOptionPane.showMessageDialog(null, "Datos actualizados con exito.");
                
                for (JTextField campo : campos) {
                    campo.setBackground(Color.white);
                }
            }
            catch (SQLException e) {
                System.err.println("Error en el boton aplicar cambios. " + e);
                JOptionPane.showMessageDialog(null, "Error al aplicar cambios. Contacte al administrador");
            }
            
            
        }

    }//GEN-LAST:event_btnAplicarCambiosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAplicarCambios;
    private javax.swing.JComboBox<String> cb_sexo;
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
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_ciudad;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_edad;
    private javax.swing.JTextField txt_estatura;
    private javax.swing.JTextField txt_mail;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_peso;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
