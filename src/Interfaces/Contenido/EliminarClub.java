package Interfaces.Contenido;

import java.awt.Color;
import javax.swing.border.LineBorder;

public class EliminarClub extends javax.swing.JPanel {
    
    ProcedimientosExtra listen = new ProcedimientosExtra ();
    Dialogo diag = new Dialogo ();
    
    public EliminarClub() {
        initComponents();
        listen.FieldListener(Club);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Club = new javax.swing.JTextField();
        Eliminar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Label = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(707, 541));
        setMinimumSize(new java.awt.Dimension(707, 541));
        setPreferredSize(new java.awt.Dimension(707, 541));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Club a eliminar");

        Club.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Club.setForeground(new java.awt.Color(204, 204, 255));
        Club.setText("Ej. Club de estudios científicos");
        Club.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));

        Eliminar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Reestablecer");

        Label.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        Label.setForeground(new java.awt.Color(255, 0, 0));
        Label.setText("(*)");
        Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32)
                        .addComponent(Club)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label)
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Club, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(325, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        // TODO add your handling code here:
        if(Club.getText().equals("Ej. Club de estudios científicos")){
            Club.setBorder(new LineBorder(Color.red));
        }else{
            Club.setBorder(new LineBorder(Color.gray));
        }
    }//GEN-LAST:event_EliminarActionPerformed

    private void LabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelMouseEntered
        // TODO add your handling code here:
        diag.posicion(Label.getLocationOnScreen().x-29, Label.getLocationOnScreen().y+15);
        diag.setVisible(true);
    }//GEN-LAST:event_LabelMouseEntered

    private void LabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelMouseExited
        // TODO add your handling code here:
        diag.setVisible(false);
    }//GEN-LAST:event_LabelMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Club;
    private javax.swing.JButton Eliminar;
    private javax.swing.JLabel Label;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}