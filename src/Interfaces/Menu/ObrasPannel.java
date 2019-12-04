package Interfaces.Menu;

public class ObrasPannel extends javax.swing.JPanel{
    
    ProcedimientosExtra pro = new ProcedimientosExtra ();

    public ObrasPannel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CrudPresentaciones = new javax.swing.JButton();
        CrudObra = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));

        CrudPresentaciones.setBackground(new java.awt.Color(153, 153, 153));
        CrudPresentaciones.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CrudPresentaciones.setForeground(new java.awt.Color(204, 204, 204));
        CrudPresentaciones.setText("Presentaciones");
        CrudPresentaciones.setBorder(null);
        CrudPresentaciones.setBorderPainted(false);
        CrudPresentaciones.setContentAreaFilled(false);
        CrudPresentaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CrudPresentaciones.setFocusPainted(false);
        CrudPresentaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CrudPresentacionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CrudPresentacionesMouseExited(evt);
            }
        });
        CrudPresentaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrudPresentacionesActionPerformed(evt);
            }
        });

        CrudObra.setBackground(new java.awt.Color(153, 153, 153));
        CrudObra.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CrudObra.setForeground(new java.awt.Color(204, 204, 204));
        CrudObra.setText("Obra");
        CrudObra.setBorder(null);
        CrudObra.setBorderPainted(false);
        CrudObra.setContentAreaFilled(false);
        CrudObra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CrudObra.setFocusPainted(false);
        CrudObra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CrudObraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CrudObraMouseExited(evt);
            }
        });
        CrudObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrudObraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CrudObra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CrudPresentaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(CrudObra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(CrudPresentaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(417, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CrudPresentacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrudPresentacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CrudPresentacionesActionPerformed

    private void CrudObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrudObraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CrudObraActionPerformed

    private void CrudObraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrudObraMouseEntered
        // TODO add your handling code here:
        CrudObra.setContentAreaFilled(true);
        CrudObra.setBackground(pro.CasillaSelect);
        CrudObra.setForeground(pro.FuenteSelect);
    }//GEN-LAST:event_CrudObraMouseEntered

    private void CrudObraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrudObraMouseExited
        // TODO add your handling code here:
        CrudObra.setContentAreaFilled(false);
        CrudObra.setForeground(pro.FuenteNoSelect);
    }//GEN-LAST:event_CrudObraMouseExited

    private void CrudPresentacionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrudPresentacionesMouseEntered
        // TODO add your handling code here:
        CrudPresentaciones.setContentAreaFilled(true);
        CrudPresentaciones.setBackground(pro.CasillaSelect);
        CrudPresentaciones.setForeground(pro.FuenteSelect);
    }//GEN-LAST:event_CrudPresentacionesMouseEntered

    private void CrudPresentacionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrudPresentacionesMouseExited
        // TODO add your handling code here:
        CrudPresentaciones.setContentAreaFilled(false);
        CrudPresentaciones.setForeground(pro.FuenteNoSelect);
    }//GEN-LAST:event_CrudPresentacionesMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton CrudObra;
    public javax.swing.JButton CrudPresentaciones;
    // End of variables declaration//GEN-END:variables
}
