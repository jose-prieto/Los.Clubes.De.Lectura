/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.Menu;

import Interfaces.Contenido.ProcedimientosExtra;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MantLibrosPannel extends javax.swing.JPanel implements ActionListener{
    
    ProcedimientosExtra pro = new ProcedimientosExtra ();

    public MantLibrosPannel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RegistrarLibro = new javax.swing.JButton();
        Secciones = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));

        RegistrarLibro.setBackground(new java.awt.Color(153, 153, 153));
        RegistrarLibro.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        RegistrarLibro.setForeground(new java.awt.Color(204, 204, 204));
        RegistrarLibro.setText("Registrar libro");
        RegistrarLibro.setBorder(null);
        RegistrarLibro.setBorderPainted(false);
        RegistrarLibro.setContentAreaFilled(false);
        RegistrarLibro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegistrarLibro.setFocusPainted(false);
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

        Secciones.setBackground(new java.awt.Color(153, 153, 153));
        Secciones.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Secciones.setForeground(new java.awt.Color(204, 204, 204));
        Secciones.setText("Secciones");
        Secciones.setBorder(null);
        Secciones.setBorderPainted(false);
        Secciones.setContentAreaFilled(false);
        Secciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Secciones.setFocusPainted(false);
        Secciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SeccionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SeccionesMouseExited(evt);
            }
        });
        Secciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeccionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RegistrarLibro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
            .addComponent(Secciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(RegistrarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Secciones, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(417, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RegistrarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegistrarLibroActionPerformed

    private void RegistrarLibroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarLibroMouseEntered
        // TODO add your handling code here:
        RegistrarLibro.setContentAreaFilled(true);
        RegistrarLibro.setBackground(pro.CasillaSelect);
        RegistrarLibro.setForeground(pro.FuenteSelect);
    }//GEN-LAST:event_RegistrarLibroMouseEntered

    private void RegistrarLibroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarLibroMouseExited
        // TODO add your handling code here:
        RegistrarLibro.setContentAreaFilled(false);
        RegistrarLibro.setForeground(pro.FuenteNoSelect);
    }//GEN-LAST:event_RegistrarLibroMouseExited

    private void SeccionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SeccionesMouseEntered
        // TODO add your handling code here:
        Secciones.setContentAreaFilled(true);
        Secciones.setBackground(pro.CasillaSelect);
        Secciones.setForeground(pro.FuenteSelect);
    }//GEN-LAST:event_SeccionesMouseEntered

    private void SeccionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SeccionesMouseExited
        // TODO add your handling code here:
        Secciones.setContentAreaFilled(false);
        Secciones.setForeground(pro.FuenteNoSelect);
    }//GEN-LAST:event_SeccionesMouseExited

    private void SeccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeccionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SeccionesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton RegistrarLibro;
    public javax.swing.JButton Secciones;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
