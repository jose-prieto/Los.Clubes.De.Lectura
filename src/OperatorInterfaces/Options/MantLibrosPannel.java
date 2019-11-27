/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OperatorInterfaces.Options;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Jose Prieto
 */
public class MantLibrosPannel extends javax.swing.JPanel implements ActionListener{

    /**
     * Creates new form MainOptionPannel
     */
    public MantLibrosPannel() {
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

        RegistrarLibro = new javax.swing.JButton();
        CrearLibro = new javax.swing.JButton();
        FichaLibro = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));

        RegistrarLibro.setBackground(new java.awt.Color(153, 153, 153));
        RegistrarLibro.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        RegistrarLibro.setForeground(new java.awt.Color(204, 204, 204));
        RegistrarLibro.setText("Registrar libro");
        RegistrarLibro.setContentAreaFilled(false);
        RegistrarLibro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegistrarLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegistrarLibroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RegistrarLibroMouseExited(evt);
            }
        });
        RegistrarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarLibroActionPerformed(evt);
            }
        });

        CrearLibro.setBackground(new java.awt.Color(153, 153, 153));
        CrearLibro.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CrearLibro.setForeground(new java.awt.Color(204, 204, 204));
        CrearLibro.setText("Crear libro");
        CrearLibro.setContentAreaFilled(false);
        CrearLibro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CrearLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CrearLibroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CrearLibroMouseExited(evt);
            }
        });
        CrearLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearLibroActionPerformed(evt);
            }
        });

        FichaLibro.setBackground(new java.awt.Color(153, 153, 153));
        FichaLibro.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        FichaLibro.setForeground(new java.awt.Color(204, 204, 204));
        FichaLibro.setText("Ficha de libro");
        FichaLibro.setContentAreaFilled(false);
        FichaLibro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FichaLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FichaLibroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FichaLibroMouseExited(evt);
            }
        });
        FichaLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FichaLibroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CrearLibro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(RegistrarLibro, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
            .addComponent(FichaLibro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CrearLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(RegistrarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(FichaLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(381, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RegistrarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegistrarLibroActionPerformed

    private void CrearLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CrearLibroActionPerformed

    private void CrearLibroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearLibroMouseEntered
        // TODO add your handling code here:
        CrearLibro.setContentAreaFilled(true);
        CrearLibro.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_CrearLibroMouseEntered

    private void CrearLibroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearLibroMouseExited
        // TODO add your handling code here:
        CrearLibro.setContentAreaFilled(false);
    }//GEN-LAST:event_CrearLibroMouseExited

    private void RegistrarLibroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarLibroMouseEntered
        // TODO add your handling code here:
        RegistrarLibro.setContentAreaFilled(true);
        RegistrarLibro.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_RegistrarLibroMouseEntered

    private void RegistrarLibroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarLibroMouseExited
        // TODO add your handling code here:
        RegistrarLibro.setContentAreaFilled(false);
    }//GEN-LAST:event_RegistrarLibroMouseExited

    private void FichaLibroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FichaLibroMouseEntered
        // TODO add your handling code here:
        FichaLibro.setContentAreaFilled(true);
        FichaLibro.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_FichaLibroMouseEntered

    private void FichaLibroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FichaLibroMouseExited
        // TODO add your handling code here:
        FichaLibro.setContentAreaFilled(false);
    }//GEN-LAST:event_FichaLibroMouseExited

    private void FichaLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FichaLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FichaLibroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton CrearLibro;
    public javax.swing.JButton FichaLibro;
    public javax.swing.JButton RegistrarLibro;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
