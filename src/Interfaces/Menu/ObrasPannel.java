package Interfaces.Menu;

import Interfaces.Contenido.ProcedimientosExtra;

public class ObrasPannel extends javax.swing.JPanel{
    
    ProcedimientosExtra pro = new ProcedimientosExtra ();

    public ObrasPannel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Presentaciones = new javax.swing.JButton();
        NuevaObra = new javax.swing.JButton();
        CierreObra = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));

        Presentaciones.setBackground(new java.awt.Color(153, 153, 153));
        Presentaciones.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Presentaciones.setForeground(new java.awt.Color(204, 204, 204));
        Presentaciones.setText("Presentaciones");
        Presentaciones.setBorder(null);
        Presentaciones.setBorderPainted(false);
        Presentaciones.setContentAreaFilled(false);
        Presentaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Presentaciones.setFocusPainted(false);
        Presentaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PresentacionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PresentacionesMouseExited(evt);
            }
        });
        Presentaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PresentacionesActionPerformed(evt);
            }
        });

        NuevaObra.setBackground(new java.awt.Color(153, 153, 153));
        NuevaObra.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        NuevaObra.setForeground(new java.awt.Color(204, 204, 204));
        NuevaObra.setText("Nueva obra");
        NuevaObra.setBorder(null);
        NuevaObra.setBorderPainted(false);
        NuevaObra.setContentAreaFilled(false);
        NuevaObra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NuevaObra.setFocusPainted(false);
        NuevaObra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NuevaObraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NuevaObraMouseExited(evt);
            }
        });
        NuevaObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevaObraActionPerformed(evt);
            }
        });

        CierreObra.setBackground(new java.awt.Color(153, 153, 153));
        CierreObra.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CierreObra.setForeground(new java.awt.Color(204, 204, 204));
        CierreObra.setText("Cierre de obra");
        CierreObra.setBorder(null);
        CierreObra.setBorderPainted(false);
        CierreObra.setContentAreaFilled(false);
        CierreObra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CierreObra.setFocusPainted(false);
        CierreObra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CierreObraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CierreObraMouseExited(evt);
            }
        });
        CierreObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CierreObraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NuevaObra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Presentaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
            .addComponent(CierreObra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(NuevaObra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(CierreObra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Presentaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(377, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void PresentacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PresentacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PresentacionesActionPerformed

    private void NuevaObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevaObraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NuevaObraActionPerformed

    private void NuevaObraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NuevaObraMouseEntered
        // TODO add your handling code here:
        NuevaObra.setContentAreaFilled(true);
        NuevaObra.setBackground(pro.CasillaSelect);
        NuevaObra.setForeground(pro.FuenteSelect);
    }//GEN-LAST:event_NuevaObraMouseEntered

    private void NuevaObraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NuevaObraMouseExited
        // TODO add your handling code here:
        NuevaObra.setContentAreaFilled(false);
        NuevaObra.setForeground(pro.FuenteNoSelect);
    }//GEN-LAST:event_NuevaObraMouseExited

    private void PresentacionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PresentacionesMouseEntered
        // TODO add your handling code here:
        Presentaciones.setContentAreaFilled(true);
        Presentaciones.setBackground(pro.CasillaSelect);
        Presentaciones.setForeground(pro.FuenteSelect);
    }//GEN-LAST:event_PresentacionesMouseEntered

    private void PresentacionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PresentacionesMouseExited
        // TODO add your handling code here:
        Presentaciones.setContentAreaFilled(false);
        Presentaciones.setForeground(pro.FuenteNoSelect);
    }//GEN-LAST:event_PresentacionesMouseExited

    private void CierreObraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CierreObraMouseEntered
        // TODO add your handling code here:
        CierreObra.setContentAreaFilled(true);
        CierreObra.setBackground(pro.CasillaSelect);
        CierreObra.setForeground(pro.FuenteSelect);
    }//GEN-LAST:event_CierreObraMouseEntered

    private void CierreObraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CierreObraMouseExited
        // TODO add your handling code here:
        CierreObra.setContentAreaFilled(false);
        CierreObra.setForeground(pro.FuenteNoSelect);
    }//GEN-LAST:event_CierreObraMouseExited

    private void CierreObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CierreObraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CierreObraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton CierreObra;
    public javax.swing.JButton NuevaObra;
    public javax.swing.JButton Presentaciones;
    // End of variables declaration//GEN-END:variables
}
