package Interfaces.Contenido;

import java.awt.Color;
import javax.swing.border.LineBorder;

public class ActCalendario extends javax.swing.JPanel {

    ProcedimientosExtra listen = new ProcedimientosExtra();
    Dialogo diag = new Dialogo();

    public ActCalendario() {

        initComponents();

        listen.FieldListener(IdGrup);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        IdGrup = new javax.swing.JTextField();
        Dias = new javax.swing.JComboBox<>();
        Hora = new javax.swing.JComboBox<>();
        Asistencia = new javax.swing.JButton();
        Label1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(707, 541));
        setMinimumSize(new java.awt.Dimension(707, 541));
        setPreferredSize(new java.awt.Dimension(707, 541));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("I.D del grupo");

        IdGrup.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        IdGrup.setForeground(new java.awt.Color(204, 204, 255));
        IdGrup.setText("Ej. 1234");
        IdGrup.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        IdGrup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IdGrupMouseClicked(evt);
            }
        });

        Dias.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Dias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes" }));

        Hora.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Hora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5:00 pm", "5:30 pm", "6:00 pm", "6:30 pm", "7:00 pm" }));

        Asistencia.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Asistencia.setText("Confirmar");
        Asistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsistenciaActionPerformed(evt);
            }
        });

        Label1.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        Label1.setForeground(new java.awt.Color(255, 0, 0));
        Label1.setText("(*)");
        Label1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Label1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Label1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Asistencia)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(IdGrup, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Dias, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Hora, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label1)
                .addGap(68, 68, 68))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(IdGrup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label1))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Dias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(Asistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(283, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void IdGrupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IdGrupMouseClicked
        // TODO add your handling code here:
        //System.out.println(jDateChooser1.);
    }//GEN-LAST:event_IdGrupMouseClicked

    private void AsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsistenciaActionPerformed
        // TODO add your handling code here:
        if (IdGrup.getText().equals("Ej. 1234")) {
            IdGrup.setBorder(new LineBorder(Color.red));
        } else {
            IdGrup.setBorder(new LineBorder(Color.gray));
        }
    }//GEN-LAST:event_AsistenciaActionPerformed

    private void Label1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label1MouseEntered
        // TODO add your handling code here:
        diag.posicion(Label1.getLocationOnScreen().x-29, Label1.getLocationOnScreen().y+15);
        diag.setVisible(true);
    }//GEN-LAST:event_Label1MouseEntered

    private void Label1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label1MouseExited
        // TODO add your handling code here:
        diag.setVisible(false);
    }//GEN-LAST:event_Label1MouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Asistencia;
    private javax.swing.JComboBox<String> Dias;
    private javax.swing.JComboBox<String> Hora;
    private javax.swing.JTextField IdGrup;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
