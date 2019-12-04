package Interfaces.Menu;

import Interfaces.Contenido.ProcedimientosExtra;

public class PresentPannel extends javax.swing.JPanel{

    ProcedimientosExtra pro = new ProcedimientosExtra ();
    
    public PresentPannel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CancelPresent = new javax.swing.JButton();
        NuevaPres = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));

        CancelPresent.setBackground(new java.awt.Color(153, 153, 153));
        CancelPresent.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CancelPresent.setForeground(new java.awt.Color(204, 204, 204));
        CancelPresent.setText("Cancelar Presentación");
        CancelPresent.setBorder(null);
        CancelPresent.setBorderPainted(false);
        CancelPresent.setContentAreaFilled(false);
        CancelPresent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CancelPresent.setFocusPainted(false);
        CancelPresent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CancelPresentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CancelPresentMouseExited(evt);
            }
        });
        CancelPresent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelPresentActionPerformed(evt);
            }
        });

        NuevaPres.setBackground(new java.awt.Color(153, 153, 153));
        NuevaPres.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        NuevaPres.setForeground(new java.awt.Color(204, 204, 204));
        NuevaPres.setText("Nueva Presentación");
        NuevaPres.setBorder(null);
        NuevaPres.setBorderPainted(false);
        NuevaPres.setContentAreaFilled(false);
        NuevaPres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NuevaPres.setFocusPainted(false);
        NuevaPres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NuevaPresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NuevaPresMouseExited(evt);
            }
        });
        NuevaPres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevaPresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NuevaPres, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CancelPresent, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(NuevaPres, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(CancelPresent, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(417, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CancelPresentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelPresentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CancelPresentActionPerformed

    private void NuevaPresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevaPresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NuevaPresActionPerformed

    private void NuevaPresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NuevaPresMouseEntered
        // TODO add your handling code here:
        NuevaPres.setContentAreaFilled(true);
        NuevaPres.setBackground(pro.CasillaSelect);
        NuevaPres.setForeground(pro.FuenteSelect);
    }//GEN-LAST:event_NuevaPresMouseEntered

    private void NuevaPresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NuevaPresMouseExited
        // TODO add your handling code here:
        NuevaPres.setContentAreaFilled(false);
        NuevaPres.setForeground(pro.FuenteNoSelect);
    }//GEN-LAST:event_NuevaPresMouseExited

    private void CancelPresentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelPresentMouseEntered
        // TODO add your handling code here:
        CancelPresent.setContentAreaFilled(true);
        CancelPresent.setBackground(pro.CasillaSelect);
        CancelPresent.setForeground(pro.FuenteSelect);
    }//GEN-LAST:event_CancelPresentMouseEntered

    private void CancelPresentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelPresentMouseExited
        // TODO add your handling code here:
        CancelPresent.setContentAreaFilled(false);
        CancelPresent.setForeground(pro.FuenteNoSelect);
    }//GEN-LAST:event_CancelPresentMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton CancelPresent;
    public javax.swing.JButton NuevaPres;
    // End of variables declaration//GEN-END:variables
}
