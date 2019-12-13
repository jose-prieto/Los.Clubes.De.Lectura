package Interfaces.Menu;

import Interfaces.Contenido.ProcedimientosExtra;

public class ClubesPannel extends javax.swing.JPanel {
    
    ProcedimientosExtra pro = new ProcedimientosExtra();

    public ClubesPannel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Libros = new javax.swing.JButton();
        Miembros = new javax.swing.JButton();
        Pagos = new javax.swing.JButton();
        Club = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));
        setMaximumSize(new java.awt.Dimension(193, 512));

        Libros.setBackground(new java.awt.Color(153, 153, 153));
        Libros.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Libros.setForeground(new java.awt.Color(204, 204, 204));
        Libros.setText("Libros");
        Libros.setBorder(null);
        Libros.setBorderPainted(false);
        Libros.setContentAreaFilled(false);
        Libros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Libros.setFocusPainted(false);
        Libros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LibrosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LibrosMouseExited(evt);
            }
        });
        Libros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LibrosActionPerformed(evt);
            }
        });

        Miembros.setBackground(new java.awt.Color(153, 153, 153));
        Miembros.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Miembros.setForeground(new java.awt.Color(204, 204, 204));
        Miembros.setText("Miembros");
        Miembros.setBorder(null);
        Miembros.setBorderPainted(false);
        Miembros.setContentAreaFilled(false);
        Miembros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Miembros.setFocusPainted(false);
        Miembros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MiembrosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MiembrosMouseExited(evt);
            }
        });
        Miembros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiembrosActionPerformed(evt);
            }
        });

        Pagos.setBackground(new java.awt.Color(153, 153, 153));
        Pagos.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Pagos.setForeground(new java.awt.Color(204, 204, 204));
        Pagos.setText("Pagos");
        Pagos.setBorder(null);
        Pagos.setBorderPainted(false);
        Pagos.setContentAreaFilled(false);
        Pagos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Pagos.setFocusPainted(false);
        Pagos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PagosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PagosMouseExited(evt);
            }
        });
        Pagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagosActionPerformed(evt);
            }
        });

        Club.setBackground(new java.awt.Color(51, 51, 51));
        Club.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Club.setForeground(new java.awt.Color(204, 204, 204));
        Club.setText("Club");
        Club.setBorder(null);
        Club.setBorderPainted(false);
        Club.setContentAreaFilled(false);
        Club.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Club.setFocusPainted(false);
        Club.setIconTextGap(0);
        Club.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Club.setMaximumSize(new java.awt.Dimension(125, 25));
        Club.setMinimumSize(new java.awt.Dimension(125, 25));
        Club.setPreferredSize(new java.awt.Dimension(125, 25));
        Club.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ClubMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ClubMouseExited(evt);
            }
        });
        Club.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClubActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Libros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Miembros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Pagos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Club, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Pagos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Club, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Libros, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Miembros, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(295, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void LibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LibrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LibrosActionPerformed

    private void LibrosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LibrosMouseEntered
        // TODO add your handling code here:
        Libros.setContentAreaFilled(true);
        Libros.setBackground(pro.CasillaSelect);
        Libros.setForeground(pro.FuenteSelect);
    }//GEN-LAST:event_LibrosMouseEntered

    private void LibrosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LibrosMouseExited
        // TODO add your handling code here:
        Libros.setContentAreaFilled(false);
        Libros.setForeground(pro.FuenteNoSelect);
                
    }//GEN-LAST:event_LibrosMouseExited

    private void MiembrosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MiembrosMouseEntered
        // TODO add your handling code here:
        Miembros.setContentAreaFilled(true);
        Miembros.setBackground(pro.CasillaSelect);
        Miembros.setForeground(pro.FuenteSelect);
    }//GEN-LAST:event_MiembrosMouseEntered

    private void MiembrosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MiembrosMouseExited
        // TODO add your handling code here:
        Miembros.setContentAreaFilled(false);
        Miembros.setForeground(pro.FuenteNoSelect);
    }//GEN-LAST:event_MiembrosMouseExited

    private void PagosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PagosMouseEntered
        // TODO add your handling code here:
        Pagos.setContentAreaFilled(true);
        Pagos.setBackground(pro.CasillaSelect);
        Pagos.setForeground(pro.FuenteSelect);
    }//GEN-LAST:event_PagosMouseEntered

    private void PagosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PagosMouseExited
        // TODO add your handling code here:
        Pagos.setContentAreaFilled(false);
        Pagos.setForeground(pro.FuenteNoSelect);
    }//GEN-LAST:event_PagosMouseExited

    private void PagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PagosActionPerformed

    private void MiembrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiembrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MiembrosActionPerformed

    private void ClubMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClubMouseEntered
        // TODO add your handling code here:
        Club.setContentAreaFilled(true);
        Club.setBackground(pro.CasillaSelect);
        Club.setForeground(pro.FuenteSelect);
    }//GEN-LAST:event_ClubMouseEntered

    private void ClubMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClubMouseExited
        // TODO add your handling code here:
        Club.setContentAreaFilled(false);
        Club.setForeground(pro.FuenteNoSelect);
    }//GEN-LAST:event_ClubMouseExited

    private void ClubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClubActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClubActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Club;
    public javax.swing.JButton Libros;
    public javax.swing.JButton Miembros;
    public javax.swing.JButton Pagos;
    // End of variables declaration//GEN-END:variables
}
