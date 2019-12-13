package Interfaces.Contenido;

import java.awt.Color;
import javax.swing.border.LineBorder;

import ControladorBD.QueriesJose;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CambioClub extends javax.swing.JPanel {

    ProcedimientosExtra listen = new ProcedimientosExtra();
    Dialogo diag = new Dialogo ();
    QueriesJose query = new QueriesJose();    
    ProcedimientosExtra pro = new ProcedimientosExtra();

    public CambioClub() {
        initComponents();

        listen.FieldListener(CIMiem);
        listen.FieldListener(Motiv);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Miembro = new javax.swing.JLabel();
        CIMiem = new javax.swing.JTextField();
        Club = new javax.swing.JLabel();
        Registrar = new javax.swing.JButton();
        Label1 = new javax.swing.JLabel();
        Club1 = new javax.swing.JLabel();
        Motiv = new javax.swing.JTextField();
        Label3 = new javax.swing.JLabel();
        club = new javax.swing.JComboBox<>();

        setMaximumSize(new java.awt.Dimension(707, 541));
        setMinimumSize(new java.awt.Dimension(707, 541));
        setPreferredSize(new java.awt.Dimension(707, 541));

        Miembro.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Miembro.setForeground(new java.awt.Color(51, 51, 51));
        Miembro.setText("C.I del miembro");

        CIMiem.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CIMiem.setForeground(new java.awt.Color(204, 204, 255));
        CIMiem.setText("Ej. 24278596");
        CIMiem.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        CIMiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CIMiemKeyTyped(evt);
            }
        });

        Club.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Club.setForeground(new java.awt.Color(51, 51, 51));
        Club.setText("I.D Club destino");

        Registrar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Registrar.setText("Registrar");
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
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

        Club1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Club1.setForeground(new java.awt.Color(51, 51, 51));
        Club1.setText("Motivo");

        Motiv.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Motiv.setForeground(new java.awt.Color(204, 204, 255));
        Motiv.setText("Ej. Mudanza");
        Motiv.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));

        Label3.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        Label3.setForeground(new java.awt.Color(255, 0, 0));
        Label3.setText("(*)");
        Label3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Label3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Label3MouseExited(evt);
            }
        });

        club.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        club.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Miembro)
                            .addComponent(Club)
                            .addComponent(Club1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Motiv)
                            .addComponent(CIMiem, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                            .addComponent(club, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label1)
                    .addComponent(Label3))
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Miembro)
                    .addComponent(CIMiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label1))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Club)
                    .addComponent(club, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Club1)
                    .addComponent(Motiv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label3))
                .addGap(36, 36, 36)
                .addComponent(Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(260, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Label1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label1MouseEntered
        // TODO add your handling code here:
        diag.posicion(Label1.getLocationOnScreen().x-29, Label1.getLocationOnScreen().y+15);
        diag.setVisible(true);
    }//GEN-LAST:event_Label1MouseEntered

    private void Label1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label1MouseExited
        // TODO add your handling code here:
        diag.setVisible(false);
    }//GEN-LAST:event_Label1MouseExited

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        // TODO add your handling code here:
        if (val() && Cambiar()){
            vacio();
        }
    }//GEN-LAST:event_RegistrarActionPerformed

    private void CIMiemKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CIMiemKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if (c < '0' || c > '9' || CIMiem.getText().length() > 10){
            evt.consume();
        }
    }//GEN-LAST:event_CIMiemKeyTyped

    private void Label3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label3MouseEntered
        // TODO add your handling code here:
        diag.posicion(Label3.getLocationOnScreen().x-29, Label3.getLocationOnScreen().y+15);
        diag.setVisible(true);
    }//GEN-LAST:event_Label3MouseEntered

    private void Label3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label3MouseExited
        // TODO add your handling code here:
        diag.setVisible(false);
    }//GEN-LAST:event_Label3MouseExited
    
    public boolean Cambiar (){
        int grup = query.grupAct(Integer.parseInt(CIMiem.getText()));
        if (grup != 0){
            if (query.MiemInactivo(Motiv.getText(), Integer.parseInt(CIMiem.getText())) && query.HistIns(club.getSelectedItem().toString(), Integer.parseInt(CIMiem.getText()))){
                pro.removemiemGrup(grup);
                return true;
            }
        }
        return false;
    }
    
    public void vacio(){
        CIMiem.setText("Ej. 24278596");
        CIMiem.setForeground(new Color(204,204,255));
        Motiv.setText("Ej. Mudanza");
        Motiv.setForeground(new Color(204,204,255));
    }
    
    public void inicio(){
        ResultSet res = query.clubes();
        club.removeAllItems();
        if (res != null){
            try {
                do{
                    club.addItem(res.getString(1));
                }while (res.next());
            } catch (SQLException ex) {
                Logger.getLogger(RegistraMiembro2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public boolean val() {
        boolean val = true;

        if (CIMiem.getText().equals("Ej. 24278596")) {
            CIMiem.setBorder(new LineBorder(Color.red));
            val = false;
        } else {
            CIMiem.setBorder(new LineBorder(Color.gray));
        }
        if (Motiv.getText().equals("Ej. Mudanza")) {
            Motiv.setBorder(new LineBorder(Color.red));
            val = false;
        } else {
            Motiv.setBorder(new LineBorder(Color.gray));
        }
        if (!val){
            JOptionPane.showMessageDialog(null, "Debe rellenar todos los campos que son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!query.ciExist(Integer.parseInt(CIMiem.getText()))){
            JOptionPane.showMessageDialog(null, "El miembro no existe", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        return val;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CIMiem;
    private javax.swing.JLabel Club;
    private javax.swing.JLabel Club1;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label3;
    private javax.swing.JLabel Miembro;
    private javax.swing.JTextField Motiv;
    public javax.swing.JButton Registrar;
    public javax.swing.JComboBox<String> club;
    // End of variables declaration//GEN-END:variables
}
