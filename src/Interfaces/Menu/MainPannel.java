package Interfaces.Menu;

public class MainPannel extends javax.swing.JPanel {
    
    ProcedimientosExtra pro = new ProcedimientosExtra();

    public MainPannel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Reuniones = new javax.swing.JButton();
        Clubes = new javax.swing.JButton();
        Obras = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));
        setMaximumSize(new java.awt.Dimension(193, 512));

        Reuniones.setBackground(new java.awt.Color(153, 153, 153));
        Reuniones.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Reuniones.setForeground(new java.awt.Color(204, 204, 204));
        Reuniones.setText("Reuniones");
        Reuniones.setBorder(null);
        Reuniones.setBorderPainted(false);
        Reuniones.setContentAreaFilled(false);
        Reuniones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Reuniones.setFocusPainted(false);
        Reuniones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReunionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ReunionesMouseExited(evt);
            }
        });
        Reuniones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReunionesActionPerformed(evt);
            }
        });

        Clubes.setBackground(new java.awt.Color(51, 51, 51));
        Clubes.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Clubes.setForeground(new java.awt.Color(204, 204, 204));
        Clubes.setText("Clubes");
        Clubes.setBorder(null);
        Clubes.setBorderPainted(false);
        Clubes.setContentAreaFilled(false);
        Clubes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Clubes.setFocusPainted(false);
        Clubes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ClubesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ClubesMouseExited(evt);
            }
        });
        Clubes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClubesActionPerformed(evt);
            }
        });

        Obras.setBackground(new java.awt.Color(153, 153, 153));
        Obras.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Obras.setForeground(new java.awt.Color(204, 204, 204));
        Obras.setText("Obras");
        Obras.setBorder(null);
        Obras.setBorderPainted(false);
        Obras.setContentAreaFilled(false);
        Obras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Obras.setFocusPainted(false);
        Obras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ObrasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ObrasMouseExited(evt);
            }
        });
        Obras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ObrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Clubes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Reuniones, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
            .addComponent(Obras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Clubes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Reuniones, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Obras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(377, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ReunionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReunionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReunionesActionPerformed

    private void ClubesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClubesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClubesActionPerformed

    private void ClubesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClubesMouseEntered
        // TODO add your handling code here:
        Clubes.setContentAreaFilled(true);
        Clubes.setBackground(pro.CasillaSelect);
        Clubes.setForeground(pro.FuenteSelect);
        
    }//GEN-LAST:event_ClubesMouseEntered

    private void ClubesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClubesMouseExited
        // TODO add your handling code here:
        Clubes.setContentAreaFilled(false);
        Clubes.setForeground(pro.FuenteNoSelect);
    }//GEN-LAST:event_ClubesMouseExited

    private void ReunionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReunionesMouseEntered
        // TODO add your handling code here:
        Reuniones.setContentAreaFilled(true);
        Reuniones.setBackground(pro.CasillaSelect);
        Reuniones.setForeground(pro.FuenteSelect);
    }//GEN-LAST:event_ReunionesMouseEntered

    private void ReunionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReunionesMouseExited
        // TODO add your handling code here:
        Reuniones.setContentAreaFilled(false);
        Reuniones.setForeground(pro.FuenteNoSelect);
    }//GEN-LAST:event_ReunionesMouseExited

    private void ObrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ObrasMouseEntered
        // TODO add your handling code here:        
        Obras.setContentAreaFilled(true);
        Obras.setBackground(pro.CasillaSelect);
        Obras.setForeground(pro.FuenteSelect);
    }//GEN-LAST:event_ObrasMouseEntered

    private void ObrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ObrasMouseExited
        // TODO add your handling code here:
        Obras.setContentAreaFilled(false);
        Obras.setForeground(pro.FuenteNoSelect);
    }//GEN-LAST:event_ObrasMouseExited

    private void ObrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ObrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ObrasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Clubes;
    public javax.swing.JButton Obras;
    public javax.swing.JButton Reuniones;
    // End of variables declaration//GEN-END:variables
}
