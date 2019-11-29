package Interfaces.Menu;

public class MiembrosPannel extends javax.swing.JPanel {
    
    ProcedimientosExtra pro = new ProcedimientosExtra ();

    public MiembrosPannel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ActClub = new javax.swing.JButton();
        NuevoClub = new javax.swing.JButton();
        Desuscribir = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));
        setMaximumSize(new java.awt.Dimension(193, 512));

        ActClub.setBackground(new java.awt.Color(153, 153, 153));
        ActClub.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ActClub.setForeground(new java.awt.Color(204, 204, 204));
        ActClub.setText("Cambiar de club");
        ActClub.setBorder(null);
        ActClub.setBorderPainted(false);
        ActClub.setContentAreaFilled(false);
        ActClub.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ActClub.setFocusPainted(false);
        ActClub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ActClubMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ActClubMouseExited(evt);
            }
        });
        ActClub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActClubActionPerformed(evt);
            }
        });

        NuevoClub.setBackground(new java.awt.Color(51, 51, 51));
        NuevoClub.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        NuevoClub.setForeground(new java.awt.Color(204, 204, 204));
        NuevoClub.setText("Registrar miembro");
        NuevoClub.setBorder(null);
        NuevoClub.setBorderPainted(false);
        NuevoClub.setContentAreaFilled(false);
        NuevoClub.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NuevoClub.setFocusPainted(false);
        NuevoClub.setIconTextGap(0);
        NuevoClub.setMargin(new java.awt.Insets(0, 0, 0, 0));
        NuevoClub.setMaximumSize(new java.awt.Dimension(125, 25));
        NuevoClub.setMinimumSize(new java.awt.Dimension(125, 25));
        NuevoClub.setPreferredSize(new java.awt.Dimension(125, 25));
        NuevoClub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NuevoClubMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NuevoClubMouseExited(evt);
            }
        });
        NuevoClub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoClubActionPerformed(evt);
            }
        });

        Desuscribir.setBackground(new java.awt.Color(153, 153, 153));
        Desuscribir.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Desuscribir.setForeground(new java.awt.Color(204, 204, 204));
        Desuscribir.setText("Desuscribir");
        Desuscribir.setBorder(null);
        Desuscribir.setBorderPainted(false);
        Desuscribir.setContentAreaFilled(false);
        Desuscribir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Desuscribir.setFocusPainted(false);
        Desuscribir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DesuscribirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DesuscribirMouseExited(evt);
            }
        });
        Desuscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesuscribirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NuevoClub, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ActClub, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
            .addComponent(Desuscribir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(NuevoClub, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ActClub, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Desuscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(377, Short.MAX_VALUE))
        );

        NuevoClub.getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void ActClubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActClubActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ActClubActionPerformed

    private void NuevoClubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoClubActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NuevoClubActionPerformed

    private void NuevoClubMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NuevoClubMouseEntered
        // TODO add your handling code here:
        NuevoClub.setContentAreaFilled(true);
        NuevoClub.setBackground(pro.CasillaSelect);
        NuevoClub.setForeground(pro.FuenteSelect);
        
    }//GEN-LAST:event_NuevoClubMouseEntered

    private void NuevoClubMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NuevoClubMouseExited
        // TODO add your handling code here:
        NuevoClub.setContentAreaFilled(false);
        NuevoClub.setForeground(pro.FuenteNoSelect);
    }//GEN-LAST:event_NuevoClubMouseExited

    private void ActClubMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ActClubMouseEntered
        // TODO add your handling code here:
        ActClub.setContentAreaFilled(true);
        ActClub.setBackground(pro.CasillaSelect);
        ActClub.setForeground(pro.FuenteSelect);
    }//GEN-LAST:event_ActClubMouseEntered

    private void ActClubMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ActClubMouseExited
        // TODO add your handling code here:
        ActClub.setContentAreaFilled(false);
        ActClub.setForeground(pro.FuenteNoSelect);
    }//GEN-LAST:event_ActClubMouseExited

    private void DesuscribirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DesuscribirMouseEntered
        // TODO add your handling code here:
        Desuscribir.setContentAreaFilled(true);
        Desuscribir.setBackground(pro.CasillaSelect);
        Desuscribir.setForeground(pro.FuenteSelect);
    }//GEN-LAST:event_DesuscribirMouseEntered

    private void DesuscribirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DesuscribirMouseExited
        // TODO add your handling code here:
        Desuscribir.setContentAreaFilled(false);
        Desuscribir.setForeground(pro.FuenteNoSelect);
    }//GEN-LAST:event_DesuscribirMouseExited

    private void DesuscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesuscribirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DesuscribirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton ActClub;
    public javax.swing.JButton Desuscribir;
    public javax.swing.JButton NuevoClub;
    // End of variables declaration//GEN-END:variables
}
