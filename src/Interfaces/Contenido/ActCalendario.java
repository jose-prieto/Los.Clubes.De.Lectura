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
        HoraI = new javax.swing.JComboBox<>();
        Asistencia = new javax.swing.JButton();
        Label1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        HoraF = new javax.swing.JComboBox<>();

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

        HoraI.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        HoraI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5:00 pm", "5:30 pm", "6:00 pm", "6:30 pm", "7:00 pm" }));
        HoraI.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                HoraIItemStateChanged(evt);
            }
        });

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

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Día de reunión");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Hora comienza");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Hora termina");

        HoraF.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        HoraF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5:30 pm", "6:00 pm", "6:30 pm", "7:00 pm" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Asistencia))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Dias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(IdGrup)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(HoraI, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(HoraF, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label1)
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(IdGrup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Dias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(HoraI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(HoraF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(Asistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(240, Short.MAX_VALUE))
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

    private void HoraIItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_HoraIItemStateChanged
        // TODO add your handling code here:
        if (HoraI.getSelectedItem().toString().equals("5:00 pm")){
            HoraF.removeAllItems();
            HoraF.addItem("5:30 pm");
            HoraF.addItem("6:00 pm");
            HoraF.addItem("6:30 pm");
            HoraF.addItem("7:00 pm");
        }else if (HoraI.getSelectedItem().toString().equals("5:30 pm")){
            HoraF.removeAllItems();
            HoraF.addItem("6:00 pm");
            HoraF.addItem("6:30 pm");
            HoraF.addItem("7:00 pm");
            HoraF.addItem("7:30 pm");
        }else if (HoraI.getSelectedItem().toString().equals("6:00 pm")){
            HoraF.removeAllItems();
            HoraF.addItem("6:30 pm");
            HoraF.addItem("7:00 pm");
            HoraF.addItem("7:30 pm");
            HoraF.addItem("8:00 pm");
        }else if (HoraI.getSelectedItem().toString().equals("6:30 pm")){
            HoraF.removeAllItems();
            HoraF.addItem("7:00 pm");
            HoraF.addItem("7:30 pm");
            HoraF.addItem("8:00 pm");
            HoraF.addItem("8:30 pm");
        }else if (HoraI.getSelectedItem().toString().equals("7:00 pm")){
            HoraF.removeAllItems();
            HoraF.addItem("7:30 pm");
            HoraF.addItem("8:00 pm");
            HoraF.addItem("8:30 pm");
            HoraF.addItem("9:00 pm");
        }
    }//GEN-LAST:event_HoraIItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Asistencia;
    private javax.swing.JComboBox<String> Dias;
    private javax.swing.JComboBox<String> HoraF;
    private javax.swing.JComboBox<String> HoraI;
    private javax.swing.JTextField IdGrup;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
