package Interfaces.Contenido;

import ControladorBD.QueriesJose;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

public class Capitulos extends javax.swing.JPanel {
    
    ProcedimientosExtra listen = new ProcedimientosExtra ();
    Dialogo diag = new Dialogo ();
    QueriesJose query = new QueriesJose();
    ProcedimientosExtra pro = new ProcedimientosExtra();

    public Capitulos() {
        initComponents();
        
        pro.FieldListener(CapN);
        pro.FieldListener(CapT);
        pro.FieldListener(SeccN);
        pro.FieldListener(SeccT);
        
    }
    
    public void inicio(){
        ResultSet res = query.libros();
        
        res = query.libros();
        Libros.removeAllItems();
        if (res != null){
            try {
                do{
                    Libros.addItem(res.getString(1));
                }while (res.next());
            } catch (SQLException ex) {
                Logger.getLogger(RegistraMiembro2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Libros = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        CapN = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        CapT = new javax.swing.JTextField();
        AddCap = new javax.swing.JButton();
        AddSecc = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        SeccN = new javax.swing.JTextField();
        SeccT = new javax.swing.JTextField();
        Label1 = new javax.swing.JLabel();
        Label2 = new javax.swing.JLabel();

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("(*)");

        setMaximumSize(new java.awt.Dimension(707, 541));
        setMinimumSize(new java.awt.Dimension(707, 541));
        setPreferredSize(new java.awt.Dimension(707, 541));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Libro");

        Libros.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Libros.setForeground(new java.awt.Color(51, 51, 51));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Capítulo nombre");

        CapN.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CapN.setForeground(new java.awt.Color(204, 204, 255));
        CapN.setText("Ej. Capítulo 1");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Sección nombre");

        CapT.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CapT.setForeground(new java.awt.Color(204, 204, 255));
        CapT.setText("Ej. La profe nos pone 20");
        CapT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CapTActionPerformed(evt);
            }
        });

        AddCap.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        AddCap.setForeground(new java.awt.Color(51, 51, 51));
        AddCap.setText("Agregar capítulo");
        AddCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCapActionPerformed(evt);
            }
        });

        AddSecc.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        AddSecc.setForeground(new java.awt.Color(51, 51, 51));
        AddSecc.setText("Agregar sección");
        AddSecc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSeccActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("Capítulo título");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("Sección título");

        SeccN.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        SeccN.setForeground(new java.awt.Color(204, 204, 255));
        SeccN.setText("Ej. Sección 1");

        SeccT.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        SeccT.setForeground(new java.awt.Color(204, 204, 255));
        SeccT.setText("Ej. primeros pasos");
        SeccT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeccTActionPerformed(evt);
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

        Label2.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        Label2.setForeground(new java.awt.Color(255, 0, 0));
        Label2.setText("(*)");
        Label2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Label2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Label2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AddSecc)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15)
                            .addComponent(jLabel19))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(SeccT, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SeccN, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddCap)
                            .addComponent(CapT, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CapN, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Libros, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label1)
                    .addComponent(Label2))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(Libros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(CapN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(CapT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(AddCap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SeccN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(Label2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SeccT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(40, 40, 40)
                .addComponent(AddSecc)
                .addGap(185, 185, 185))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CapTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CapTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CapTActionPerformed

    private void SeccTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeccTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SeccTActionPerformed

    private void AddSeccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSeccActionPerformed
        // TODO add your handling code here:
        if (valSec() && query.addSecc(Libros.getSelectedItem().toString(), SeccN.getText(), SecT())){
            JOptionPane.showMessageDialog(null, "Sección agregada exitosamnete", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_AddSeccActionPerformed

    private void AddCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCapActionPerformed
        // TODO add your handling code here:
        if (valCap() && query.addCap(Libros.getSelectedItem().toString(), CapN.getText(), CapT())){
            JOptionPane.showMessageDialog(null, "Capítulo agregado exitosamnete", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_AddCapActionPerformed

    private void Label1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label1MouseEntered
        // TODO add your handling code here:
        diag.posicion(Label1.getLocationOnScreen().x-29, Label1.getLocationOnScreen().y+15);
        diag.setVisible(true);
    }//GEN-LAST:event_Label1MouseEntered

    private void Label1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label1MouseExited
        // TODO add your handling code here:
        diag.setVisible(false);
    }//GEN-LAST:event_Label1MouseExited

    private void Label2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label2MouseEntered
        // TODO add your handling code here:
        diag.posicion(Label2.getLocationOnScreen().x-29, Label2.getLocationOnScreen().y+15);
        diag.setVisible(true);
    }//GEN-LAST:event_Label2MouseEntered

    private void Label2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label2MouseExited
        // TODO add your handling code here:
        diag.setVisible(false);
    }//GEN-LAST:event_Label2MouseExited
    
    public String CapT(){
        if(CapT.getText().equals("Ej. La profe nos pone 20")){
            return null;
        }else{
            return CapT.getText();
        }
    }
    
    public String SecT(){
        if(SeccT.getText().equals("Ej. primeros pasos")){
            return null;
        }else{
            return SeccT.getText();
        }
    }
    
    public boolean valCap(){
        if(CapN.getText().equals("Ej. Capítulo 1")){
            CapN.setBorder(new LineBorder(Color.red));
            JOptionPane.showMessageDialog(null, "Debe poner el nombre de un capitulo antes de agregarlo", "Error", JOptionPane.ERROR);
            return false;
        }else{
            CapN.setBorder(new LineBorder(Color.gray));
        }
        return true;
    }
    
    public boolean valSec(){
        if(SeccN.getText().equals("Ej. Sección 1")){
            SeccN.setBorder(new LineBorder(Color.red));
            JOptionPane.showMessageDialog(null, "Debe poner el nombre de una sección antes de agregarlo", "Error", JOptionPane.ERROR);
            return false;
        }else{
            SeccN.setBorder(new LineBorder(Color.gray));
        }
        return true;
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddCap;
    private javax.swing.JButton AddSecc;
    private javax.swing.JTextField CapN;
    private javax.swing.JTextField CapT;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private javax.swing.JComboBox<String> Libros;
    private javax.swing.JTextField SeccN;
    private javax.swing.JTextField SeccT;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    // End of variables declaration//GEN-END:variables
}
