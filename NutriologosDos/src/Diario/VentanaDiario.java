/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diario;

import Diario.Diario;
import javax.swing.WindowConstants;

/**
 *
 * @author JAHC
 */
public class VentanaDiario extends javax.swing.JFrame {
    Diario panel = new Diario();
    
    public VentanaDiario() {
        initComponents();
        setSize(795, 480);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Registrar paciente");
        add(panel, "Center");
        
        // Se cierra la interfaz pero el programa no finaliza
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables


}
