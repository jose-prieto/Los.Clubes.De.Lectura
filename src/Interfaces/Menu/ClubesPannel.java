package Interfaces.Menu;

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
        Grupos = new javax.swing.JButton();
        Pagos = new javax.swing.JButton();
        NuevoClub = new javax.swing.JButton();
        AsociarClub = new javax.swing.JButton();
        Eliminarclub = new javax.swing.JButton();

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

        Grupos.setBackground(new java.awt.Color(153, 153, 153));
        Grupos.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Grupos.setForeground(new java.awt.Color(204, 204, 204));
        Grupos.setText("Grupos");
        Grupos.setBorder(null);
        Grupos.setBorderPainted(false);
        Grupos.setContentAreaFilled(false);
        Grupos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Grupos.setFocusPainted(false);
        Grupos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                GruposMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                GruposMouseExited(evt);
            }
        });
        Grupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GruposActionPerformed(evt);
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

        AsociarClub.setBackground(new java.awt.Color(51, 51, 51));
        AsociarClub.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        AsociarClub.setForeground(new java.awt.Color(204, 204, 204));
        AsociarClub.setText("Asociar clubes");
        AsociarClub.setBorder(null);
        AsociarClub.setBorderPainted(false);
        AsociarClub.setContentAreaFilled(false);
        AsociarClub.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AsociarClub.setFocusPainted(false);
        AsociarClub.setIconTextGap(0);
        AsociarClub.setMargin(new java.awt.Insets(0, 0, 0, 0));
        AsociarClub.setMaximumSize(new java.awt.Dimension(125, 25));
        AsociarClub.setMinimumSize(new java.awt.Dimension(125, 25));
        AsociarClub.setPreferredSize(new java.awt.Dimension(125, 25));
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

        Eliminarclub.setBackground(new java.awt.Color(51, 51, 51));
        Eliminarclub.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Eliminarclub.setForeground(new java.awt.Color(204, 204, 204));
        Eliminarclub.setText("Eliminar club");
        Eliminarclub.setBorder(null);
        Eliminarclub.setBorderPainted(false);
        Eliminarclub.setContentAreaFilled(false);
        Eliminarclub.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Eliminarclub.setFocusPainted(false);
        Eliminarclub.setIconTextGap(0);
        Eliminarclub.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Eliminarclub.setMaximumSize(new java.awt.Dimension(125, 25));
        Eliminarclub.setMinimumSize(new java.awt.Dimension(125, 25));
        Eliminarclub.setPreferredSize(new java.awt.Dimension(125, 25));
        Eliminarclub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EliminarclubMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EliminarclubMouseExited(evt);
            }
        });
        Eliminarclub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarclubActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Libros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Miembros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Pagos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Grupos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(NuevoClub, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
            .addComponent(AsociarClub, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Eliminarclub, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NuevoClub, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(AsociarClub, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Eliminarclub, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Libros, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Miembros, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Grupos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Pagos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(179, Short.MAX_VALUE))
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

    private void GruposMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GruposMouseEntered
        // TODO add your handling code here:
        Grupos.setContentAreaFilled(true);
        Grupos.setBackground(pro.CasillaSelect);
        Grupos.setForeground(pro.FuenteSelect);
    }//GEN-LAST:event_GruposMouseEntered

    private void GruposMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GruposMouseExited
        // TODO add your handling code here:
        Grupos.setContentAreaFilled(false);
        Grupos.setForeground(pro.FuenteNoSelect);
    }//GEN-LAST:event_GruposMouseExited

    private void GruposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GruposActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GruposActionPerformed

    private void MiembrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiembrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MiembrosActionPerformed

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

    private void NuevoClubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoClubActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NuevoClubActionPerformed

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

    private void EliminarclubMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarclubMouseEntered
        // TODO add your handling code here:
        Eliminarclub.setContentAreaFilled(true);
        Eliminarclub.setBackground(pro.CasillaSelect);
        Eliminarclub.setForeground(pro.FuenteSelect);
    }//GEN-LAST:event_EliminarclubMouseEntered

    private void EliminarclubMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarclubMouseExited
        // TODO add your handling code here:
        Eliminarclub.setContentAreaFilled(false);
        Eliminarclub.setForeground(pro.FuenteNoSelect);
    }//GEN-LAST:event_EliminarclubMouseExited

    private void EliminarclubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarclubActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EliminarclubActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton AsociarClub;
    public javax.swing.JButton Eliminarclub;
    public javax.swing.JButton Grupos;
    public javax.swing.JButton Libros;
    public javax.swing.JButton Miembros;
    public javax.swing.JButton NuevoClub;
    public javax.swing.JButton Pagos;
    // End of variables declaration//GEN-END:variables
}
