/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientes;

        
import clases.Conexion;
import javax.swing.JTextField;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;

/**
 *
 * @author JAHC
 */
public class PanelAgregarCliente extends javax.swing.JPanel {

    /**
     * Creates new form agregarCliente
     */
    public PanelAgregarCliente() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_apellidos = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_ciudad = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_mail = new javax.swing.JTextField();
        txt_edad = new javax.swing.JTextField();
        txt_peso = new javax.swing.JTextField();
        txt_estatura = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        cb_sexo = new javax.swing.JComboBox<>();

        jLabel1.setText("Agregar Paciente");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellidos:");

        jLabel4.setText("Ciudad:");

        jLabel5.setText("Dirección:");

        jLabel6.setText("Teléfono:");

        jLabel7.setText("Correo Electrónico:");

        jLabel8.setText("Sexo:");

        jLabel9.setText("Edad:");

        jLabel10.setText("Peso:");

        jLabel11.setText("Estatura:");

        jLabel12.setText("Automáticamente se generará el ID del paciente y se guardará la FECHA DE REGISTRO.");

        btnAgregar.setText("Agregar");
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAgregar.setDefaultCapable(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        cb_sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel4)
                                .addComponent(jLabel8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_nombre)
                                    .addComponent(txt_ciudad, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_telefono, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel3))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txt_apellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                                            .addComponent(txt_direccion)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cb_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_peso, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_estatura, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAgregar)))
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel1))
                .addContainerGap(189, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(cb_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(txt_estatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txt_peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(btnAgregar)
                .addGap(32, 32, 32)
                .addComponent(jLabel12)
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        
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
                PreparedStatement pst = cn.prepareStatement ("INSERT INTO pacientes "
                        + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
                
                pst.setInt(1, 0);
                pst.setString(2, nombres);
                pst.setString(3, apellidos);
                pst.setString(4, ciudad);
                pst.setString(5, direccion);
                pst.setString(6, telefono);
                pst.setString(7, mail);
                if (cb_sexo.getSelectedItem().toString().equals("Masculino")) {
                    pst.setString(8, "M");
                }
                else {
                    pst.setString(8, "F");
                }
                pst.setFloat(9, Float.parseFloat(peso));
                pst.setFloat(10, Float.parseFloat(estatura));
                pst.setInt(11, Integer.parseInt(edad));
                
                // Para agregar la fecha
                SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
                String fecha = formatoFecha.format(new java.util.Date());
                pst.setString(12, fecha);
                
                pst.executeUpdate();
                
                // Ahora limpiamos todos los campos y los ponemos en verde indicando exito
                for (JTextField campo : campos) {
                    campo.setText("");
                    campo.setBackground(Color.green);
                }
                
                cn.close();
                pst.close();
                
                JOptionPane.showMessageDialog(null, "Paciente registrado con exito.");
                
                for (JTextField campo : campos) {
                    campo.setBackground(Color.white);
                }
            }
            catch (SQLException e) {
                System.err.println("Error en el boton agregar. " + e);
                JOptionPane.showMessageDialog(null, "Error al registrar usuario. Contacte al administrador");
            }
            
            
        }
        
    }//GEN-LAST:event_btnAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JComboBox<String> cb_sexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
