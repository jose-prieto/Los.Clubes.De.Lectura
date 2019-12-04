package Interfaces.Menu;

public class ReunionesPannel extends javax.swing.JPanel{

    ProcedimientosExtra pro = new ProcedimientosExtra ();
    
    public ReunionesPannel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Asistencias = new javax.swing.JButton();
        Calendario = new javax.swing.JButton();
        Cierre = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));

        Asistencias.setBackground(new java.awt.Color(153, 153, 153));
        Asistencias.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Asistencias.setForeground(new java.awt.Color(204, 204, 204));
        Asistencias.setText("Asistencias");
        Asistencias.setBorder(null);
        Asistencias.setBorderPainted(false);
        Asistencias.setContentAreaFilled(false);
        Asistencias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Asistencias.setFocusPainted(false);
        Asistencias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AsistenciasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AsistenciasMouseExited(evt);
            }
        });
        Asistencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsistenciasActionPerformed(evt);
            }
        });

        Calendario.setBackground(new java.awt.Color(153, 153, 153));
        Calendario.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Calendario.setForeground(new java.awt.Color(204, 204, 204));
        Calendario.setText("Calendario");
        Calendario.setBorder(null);
        Calendario.setBorderPainted(false);
        Calendario.setContentAreaFilled(false);
        Calendario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Calendario.setFocusPainted(false);
        Calendario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CalendarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CalendarioMouseExited(evt);
            }
        });
        Calendario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalendarioActionPerformed(evt);
            }
        });

        Cierre.setBackground(new java.awt.Color(153, 153, 153));
        Cierre.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Cierre.setForeground(new java.awt.Color(204, 204, 204));
        Cierre.setText("Cierre de reunión");
        Cierre.setBorder(null);
        Cierre.setBorderPainted(false);
        Cierre.setContentAreaFilled(false);
        Cierre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cierre.setFocusPainted(false);
        Cierre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CierreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CierreMouseExited(evt);
            }
        });
        Cierre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CierreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Calendario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Asistencias, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
            .addComponent(Cierre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Asistencias, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Cierre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(377, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AsistenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsistenciasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AsistenciasActionPerformed

    private void CalendarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalendarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CalendarioActionPerformed

    private void CalendarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CalendarioMouseEntered
        // TODO add your handling code here:
        Calendario.setContentAreaFilled(true);
        Calendario.setBackground(pro.CasillaSelect);
        Calendario.setForeground(pro.FuenteSelect);
    }//GEN-LAST:event_CalendarioMouseEntered

    private void CalendarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CalendarioMouseExited
        // TODO add your handling code here:
        Calendario.setContentAreaFilled(false);
        Calendario.setForeground(pro.FuenteNoSelect);
    }//GEN-LAST:event_CalendarioMouseExited

    private void AsistenciasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AsistenciasMouseEntered
        // TODO add your handling code here:
        Asistencias.setContentAreaFilled(true);
        Asistencias.setBackground(pro.CasillaSelect);
        Asistencias.setForeground(pro.FuenteSelect);
    }//GEN-LAST:event_AsistenciasMouseEntered

    private void AsistenciasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AsistenciasMouseExited
        // TODO add your handling code here:
        Asistencias.setContentAreaFilled(false);
        Asistencias.setForeground(pro.FuenteNoSelect);
    }//GEN-LAST:event_AsistenciasMouseExited

    private void CierreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CierreMouseEntered
        // TODO add your handling code here:
        Cierre.setContentAreaFilled(true);
        Cierre.setBackground(pro.CasillaSelect);
        Cierre.setForeground(pro.FuenteSelect);
    }//GEN-LAST:event_CierreMouseEntered

    private void CierreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CierreMouseExited
        // TODO add your handling code here:
        Cierre.setContentAreaFilled(false);
        Cierre.setForeground(pro.FuenteNoSelect);
    }//GEN-LAST:event_CierreMouseExited

    private void CierreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CierreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CierreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Asistencias;
    public javax.swing.JButton Calendario;
    public javax.swing.JButton Cierre;
    // End of variables declaration//GEN-END:variables
}
