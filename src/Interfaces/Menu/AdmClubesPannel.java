package Interfaces.Menu;

import Interfaces.Contenido.ProcedimientosExtra;

public class AdmClubesPannel extends javax.swing.JPanel {
    
    ProcedimientosExtra pro = new ProcedimientosExtra ();
    
    public AdmClubesPannel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NuevoClub = new javax.swing.JButton();
        EliminarClub = new javax.swing.JButton();
        AsociarClub = new javax.swing.JButton();
        FichaClub = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));
        setMaximumSize(new java.awt.Dimension(193, 512));

        NuevoClub.setBackground(new java.awt.Color(51, 51, 51));
        NuevoClub.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        NuevoClub.setForeground(new java.awt.Color(204, 204, 204));
        NuevoClub.setText("Nuevo club");
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

        EliminarClub.setBackground(new java.awt.Color(153, 153, 153));
        EliminarClub.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        EliminarClub.setForeground(new java.awt.Color(204, 204, 204));
        EliminarClub.setText("Eliminar club");
        EliminarClub.setBorder(null);
        EliminarClub.setBorderPainted(false);
        EliminarClub.setContentAreaFilled(false);
        EliminarClub.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EliminarClub.setFocusPainted(false);
        EliminarClub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EliminarClubMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EliminarClubMouseExited(evt);
            }
        });
        EliminarClub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarClubActionPerformed(evt);
            }
        });

        AsociarClub.setBackground(new java.awt.Color(153, 153, 153));
        AsociarClub.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        AsociarClub.setForeground(new java.awt.Color(204, 204, 204));
        AsociarClub.setText("Asociación de clubes");
        AsociarClub.setBorder(null);
        AsociarClub.setBorderPainted(false);
        AsociarClub.setContentAreaFilled(false);
        AsociarClub.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AsociarClub.setFocusPainted(false);
        AsociarClub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AsociarClubMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AsociarClubMouseExited(evt);
            }
        });
        AsociarClub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsociarClubActionPerformed(evt);
            }
        });

        FichaClub.setBackground(new java.awt.Color(153, 153, 153));
        FichaClub.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        FichaClub.setForeground(new java.awt.Color(204, 204, 204));
        FichaClub.setText("Ficha de club");
        FichaClub.setBorder(null);
        FichaClub.setBorderPainted(false);
        FichaClub.setContentAreaFilled(false);
        FichaClub.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FichaClub.setFocusPainted(false);
        FichaClub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FichaClubMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FichaClubMouseExited(evt);
            }
        });
        FichaClub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FichaClubActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NuevoClub, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(AsociarClub, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
            .addComponent(EliminarClub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(FichaClub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(NuevoClub, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(AsociarClub, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(EliminarClub, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(FichaClub, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(337, Short.MAX_VALUE))
        );

        NuevoClub.getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

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

    private void EliminarClubMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarClubMouseEntered
        // TODO add your handling code here:
        EliminarClub.setContentAreaFilled(true);
        EliminarClub.setBackground(pro.CasillaSelect);
        EliminarClub.setForeground(pro.FuenteSelect);
    }//GEN-LAST:event_EliminarClubMouseEntered

    private void EliminarClubMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarClubMouseExited
        // TODO add your handling code here:
        EliminarClub.setContentAreaFilled(false);
        EliminarClub.setForeground(pro.FuenteNoSelect);
    }//GEN-LAST:event_EliminarClubMouseExited

    private void EliminarClubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarClubActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EliminarClubActionPerformed

    private void AsociarClubMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AsociarClubMouseEntered
        // TODO add your handling code here:
        AsociarClub.setContentAreaFilled(true);
        AsociarClub.setBackground(pro.CasillaSelect);
        AsociarClub.setForeground(pro.FuenteSelect);
    }//GEN-LAST:event_AsociarClubMouseEntered

    private void AsociarClubMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AsociarClubMouseExited
        // TODO add your handling code here:
        AsociarClub.setContentAreaFilled(false);
        AsociarClub.setForeground(pro.FuenteNoSelect);
    }//GEN-LAST:event_AsociarClubMouseExited

    private void AsociarClubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsociarClubActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AsociarClubActionPerformed

    private void FichaClubMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FichaClubMouseEntered
        // TODO add your handling code here:
        FichaClub.setContentAreaFilled(true);
        FichaClub.setBackground(pro.CasillaSelect);
        FichaClub.setForeground(pro.FuenteSelect);
    }//GEN-LAST:event_FichaClubMouseEntered

    private void FichaClubMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FichaClubMouseExited
        // TODO add your handling code here:
        FichaClub.setContentAreaFilled(false);
        FichaClub.setForeground(pro.FuenteNoSelect);
    }//GEN-LAST:event_FichaClubMouseExited

    private void FichaClubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FichaClubActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FichaClubActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton AsociarClub;
    public javax.swing.JButton EliminarClub;
    public javax.swing.JButton FichaClub;
    public javax.swing.JButton NuevoClub;
    // End of variables declaration//GEN-END:variables
}
