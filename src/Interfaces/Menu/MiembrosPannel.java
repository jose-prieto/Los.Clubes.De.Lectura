package Interfaces.Menu;

public class MiembrosPannel extends javax.swing.JPanel {
    
    ProcedimientosExtra pro = new ProcedimientosExtra ();

    public MiembrosPannel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CambClub = new javax.swing.JButton();
        RegMiemb = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));
        setMaximumSize(new java.awt.Dimension(193, 512));

        CambClub.setBackground(new java.awt.Color(153, 153, 153));
        CambClub.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CambClub.setForeground(new java.awt.Color(204, 204, 204));
        CambClub.setText("Cambiar de club");
        CambClub.setBorder(null);
        CambClub.setBorderPainted(false);
        CambClub.setContentAreaFilled(false);
        CambClub.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CambClub.setFocusPainted(false);
        CambClub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CambClubMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CambClubMouseExited(evt);
            }
        });
        CambClub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CambClubActionPerformed(evt);
            }
        });

        RegMiemb.setBackground(new java.awt.Color(51, 51, 51));
        RegMiemb.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        RegMiemb.setForeground(new java.awt.Color(204, 204, 204));
        RegMiemb.setText("Registrar miembro");
        RegMiemb.setBorder(null);
        RegMiemb.setBorderPainted(false);
        RegMiemb.setContentAreaFilled(false);
        RegMiemb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegMiemb.setFocusPainted(false);
        RegMiemb.setIconTextGap(0);
        RegMiemb.setMargin(new java.awt.Insets(0, 0, 0, 0));
        RegMiemb.setMaximumSize(new java.awt.Dimension(125, 25));
        RegMiemb.setMinimumSize(new java.awt.Dimension(125, 25));
        RegMiemb.setPreferredSize(new java.awt.Dimension(125, 25));
        RegMiemb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegMiembMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RegMiembMouseExited(evt);
            }
        });
        RegMiemb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegMiembActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RegMiemb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CambClub, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(RegMiemb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(CambClub, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(417, Short.MAX_VALUE))
        );

        RegMiemb.getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void CambClubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CambClubActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CambClubActionPerformed

    private void RegMiembActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegMiembActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegMiembActionPerformed

    private void RegMiembMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegMiembMouseEntered
        // TODO add your handling code here:
        RegMiemb.setContentAreaFilled(true);
        RegMiemb.setBackground(pro.CasillaSelect);
        RegMiemb.setForeground(pro.FuenteSelect);
        
    }//GEN-LAST:event_RegMiembMouseEntered

    private void RegMiembMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegMiembMouseExited
        // TODO add your handling code here:
        RegMiemb.setContentAreaFilled(false);
        RegMiemb.setForeground(pro.FuenteNoSelect);
    }//GEN-LAST:event_RegMiembMouseExited

    private void CambClubMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CambClubMouseEntered
        // TODO add your handling code here:
        CambClub.setContentAreaFilled(true);
        CambClub.setBackground(pro.CasillaSelect);
        CambClub.setForeground(pro.FuenteSelect);
    }//GEN-LAST:event_CambClubMouseEntered

    private void CambClubMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CambClubMouseExited
        // TODO add your handling code here:
        CambClub.setContentAreaFilled(false);
        CambClub.setForeground(pro.FuenteNoSelect);
    }//GEN-LAST:event_CambClubMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton CambClub;
    public javax.swing.JButton RegMiemb;
    // End of variables declaration//GEN-END:variables
}
