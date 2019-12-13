package Interfaces.Contenido;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

import ControladorBD.QueriesJose;


public class Asistencias extends javax.swing.JPanel {

    ProcedimientosExtra listen = new ProcedimientosExtra();
    Dialogo diag = new Dialogo();
    QueriesJose query = new QueriesJose();
    
    public Asistencias() {
        initComponents();

        listen.FieldListener(IdGrupo);
    }
    
    public void vaciar(){
        IdGrupo.setText("");
    }
    
    public int getGrup(){
        if (IdGrupo.getText().equals("Ej. 123") || IdGrupo.getText().equals("")){
            return 0;
        }else {
            return Integer.parseInt(IdGrupo.getText());
        }
    }
    
    public boolean val(){
        ResultSet rs;
        rs = query.inasistentes(getGrup());
        
        if (IdGrupo.getText().equals("Ej. 1234")){
            IdGrupo.setBorder(new LineBorder(Color.red));
            JOptionPane.showMessageDialog(null, "Debe rellenar los campos obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }else{
            IdGrupo.setBorder(new LineBorder(Color.gray));
        }
        if (rs == null){
            IdGrupo.setBorder(new LineBorder(Color.red));
            JOptionPane.showMessageDialog(null, "No existe reunion pautada para hoy del grupo"+getGrup(), "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }else{
            IdGrupo.setBorder(new LineBorder(Color.gray));
        }
            
        
        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        IdGrupo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Asistencia = new javax.swing.JButton();
        Label1 = new javax.swing.JLabel();
        Miembro = new javax.swing.JComboBox<>();

        setMaximumSize(new java.awt.Dimension(707, 541));
        setMinimumSize(new java.awt.Dimension(707, 541));
        setPreferredSize(new java.awt.Dimension(707, 541));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("I.D del grupo");

        IdGrupo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        IdGrupo.setForeground(new java.awt.Color(204, 204, 255));
        IdGrupo.setText("Ej. 1234");
        IdGrupo.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        IdGrupo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                IdGrupoFocusLost(evt);
            }
        });
        IdGrupo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IdGrupoKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Nombre del miembro");

        Asistencia.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Asistencia.setText("Marcar Asistencia");
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

        Miembro.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Miembro.setForeground(new java.awt.Color(51, 51, 51));
        Miembro.setMaximumRowCount(15);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Asistencia))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(80, 80, 80)
                                .addComponent(IdGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(Miembro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label1)
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(IdGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label1))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Miembro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112)
                .addComponent(Asistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(201, Short.MAX_VALUE))
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

    private void AsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsistenciaActionPerformed
        // TODO add your handling code here:
        if (val() && query.asistentes(Integer.parseInt(Miembro.getSelectedItem().toString()))){
            JOptionPane.showMessageDialog(null, "El miembro: "+query.ciToNom(Integer.parseInt(Miembro.getSelectedItem().toString()))+"\nMarcado como asistente.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_AsistenciaActionPerformed

    private void IdGrupoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IdGrupoFocusLost
        // TODO add your handling code here:
        Miembro.removeAllItems();
        if (getGrup() != 0){
            ResultSet rs;
            rs = query.inasistentes(getGrup());

            if (rs != null){
                try {
                    do{
                        Miembro.addItem(String.valueOf(rs.getInt(1)));
                    }while (rs.next());
                } catch (SQLException ex) {
                    Logger.getLogger(RegistraMiembro2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_IdGrupoFocusLost

    private void IdGrupoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IdGrupoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if (c < '0' || c > '9' || IdGrupo.getText().length() > 2){
            evt.consume();
        }
    }//GEN-LAST:event_IdGrupoKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Asistencia;
    private javax.swing.JTextField IdGrupo;
    private javax.swing.JLabel Label1;
    private javax.swing.JComboBox<String> Miembro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
