package Interfaces.Contenido;

import java.awt.Color;
import javax.swing.border.LineBorder;
import ControladorBD.QueriesJose;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ActCalendario extends javax.swing.JPanel {

    ProcedimientosExtra listen = new ProcedimientosExtra();
    Dialogo diag = new Dialogo();
    QueriesJose query = new QueriesJose();
    int val = 1;

    public ActCalendario() {

        initComponents();

        listen.FieldListener(IdGrup);
        
        Libro.setVisible(false);
        libro.setVisible(false);
    }
    
    public boolean val (){
        if (IdGrup.getText().equals("Ej. 123")){
            IdGrup.setBorder(new LineBorder(Color.red));
            return false;
        }else if (query.bucarclub(getGrup()) == null){
            IdGrup.setBorder(new LineBorder(Color.red));
            return false;
        }else{
            IdGrup.setBorder(new LineBorder(Color.gray));
        }
        return true;
    }
    
    public int getGrup(){
        if (IdGrup.getText().equals("Ej. 123") || IdGrup.getText().equals("")){
            return 0;
        }else {
            return Integer.parseInt(IdGrup.getText());
        }
    }
    
    public boolean Actualizar(){
        return query.grupAct(Dias.getSelectedItem().toString(), 
                Integer.parseInt(Character.toString(HoraI.getSelectedItem().toString().charAt(0))), 
                Integer.parseInt(Character.toString(HoraF.getSelectedItem().toString().charAt(0))), 
                getGrup());
    }
    
    public boolean crearReus(){
        ResultSet rs,rs2;
        rs = 
        if (rs == null){
            query.newGrup(clubid, tipo);
            return addmiemGrup(miemID, clubid, fechaNac);
        }else{
            try {
                do{
                    rs2 = query.miemGrupo(rs.getInt(1));
                    if (rs2 == null){
                        return query.grupAdd(rs.getInt(1), clubid, miemID);
                    }
                    size = 0;
                    try {
                        do{
                           size++;
                        }while (rs2.next());
                        if (size < max){
                            return query.grupAdd(rs.getInt(1), clubid, miemID);
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(RegistraMiembro2.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }while (rs.next());
            } catch (SQLException ex) {
                Logger.getLogger(RegistraMiembro2.class.getName()).log(Level.SEVERE, null, ex);
            }
            query.newGrup(clubid, tipo);
            return addmiemGrup(miemID, clubid, fechaNac);
        }
    }
    
    public int indexFecha(){
        return Dias.getSelectedIndex() + 8;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        IdGrup = new javax.swing.JTextField();
        Dias = new javax.swing.JComboBox<>();
        HoraI = new javax.swing.JComboBox<>();
        Registrar = new javax.swing.JButton();
        Label1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        HoraF = new javax.swing.JComboBox<>();
        Libro = new javax.swing.JComboBox<>();
        libro = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(707, 541));
        setMinimumSize(new java.awt.Dimension(707, 541));
        setPreferredSize(new java.awt.Dimension(707, 541));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("I.D del grupo");

        IdGrup.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        IdGrup.setForeground(new java.awt.Color(204, 204, 255));
        IdGrup.setText("Ej. 123");
        IdGrup.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        IdGrup.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                IdGrupFocusLost(evt);
            }
        });
        IdGrup.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IdGrupKeyTyped(evt);
            }
        });

        Dias.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Dias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes" }));

        HoraI.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        HoraI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5:00 pm", "6:00 pm", "7:00 pm" }));
        HoraI.setEnabled(false);
        HoraI.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                HoraIItemStateChanged(evt);
            }
        });

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

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Día de reunión");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Hora comienza");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Hora termina");

        HoraF.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        HoraF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:00 pm", "7:00 pm" }));
        HoraF.setEnabled(false);

        Libro.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Libro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LibroActionPerformed(evt);
            }
        });

        libro.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        libro.setText("Libro a leer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Registrar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Dias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(IdGrup)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(libro))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Libro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(HoraI, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(HoraF, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Libro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(libro))
                .addGap(18, 18, 18)
                .addComponent(Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(240, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        // TODO add your handling code here:
        if (val() && Actualizar()){
            
        }
    }//GEN-LAST:event_RegistrarActionPerformed

    private void Label1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label1MouseEntered
        // TODO add your handling code here:
        diag.posicion(Label1.getLocationOnScreen().x-29, Label1.getLocationOnScreen().y+15);
        diag.setVisible(true);
    }//GEN-LAST:event_Label1MouseEntered

    private void Label1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label1MouseExited
        // TODO add your handling code here:
        diag.setVisible(false);
    }//GEN-LAST:event_Label1MouseExited

    private void IdGrupKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IdGrupKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if (c < '0' || c > '9' || IdGrup.getText().length() > 2){
            evt.consume();
        }
    }//GEN-LAST:event_IdGrupKeyTyped

    private void IdGrupFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IdGrupFocusLost
        // TODO add your handling code here:
        System.out.println();
        if (getGrup() != 0){
            
            ResultSet res = query.bucarclub(getGrup());

            try {
                if (res != null){
                    if (res.getString(2).equals("nino")){
                        val = 2;
                        HoraI.removeItemAt(2);
                        
                        HoraI.setEnabled(true);
                        HoraF.setEnabled(true);
                    }else {
                        HoraI.setEnabled(true);
                        HoraF.setEnabled(true);
                        
                        if (val == 2){
                            HoraI.addItem("7:00 pm");
                        }
                        val = 1;
                        
                    }
                    if (query.reuAbierta(getGrup()) == null){

                        res = query.libros();
                        libro.setVisible(true);
                        Libro.setVisible(true);
                        Libro.removeAllItems();

                        if (res != null){
                            try {
                                do{
                                    Libro.addItem(res.getString(1));
                                }while (res.next());
                            } catch (SQLException ex) {
                                Logger.getLogger(RegistraMiembro2.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }else{
                        libro.setVisible(false);
                        Libro.setVisible(false);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Club ingresado inexistente", "Error", JOptionPane.ERROR_MESSAGE);
                    libro.setVisible(false);
                    Libro.setVisible(false);
                }
            } catch (SQLException ex) {
                Logger.getLogger(RegistraMiembro2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_IdGrupFocusLost

    private void LibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LibroActionPerformed

    private void HoraIItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_HoraIItemStateChanged
        // TODO add your handling code here:
        
        if (val == 1){
            if (HoraI.getSelectedItem().toString().equals("5:00 pm")){
                HoraF.removeAllItems();
                HoraF.addItem("6:00 pm");
                HoraF.addItem("7:00 pm");
            }else if (HoraI.getSelectedItem().toString().equals("6:00 pm")){
                HoraF.removeAllItems();
                HoraF.addItem("7:00 pm");
                HoraF.addItem("8:00 pm");
            }else if (HoraI.getSelectedItem().toString().equals("7:00 pm")){
                HoraF.removeAllItems();
                HoraF.addItem("8:00 pm");
                HoraF.addItem("9:00 pm");
            }
        }else{
            if (HoraI.getSelectedItem().toString().equals("5:00 pm")){
                HoraF.removeAllItems();
                HoraF.addItem("6:00 pm");
                HoraF.addItem("7:00 pm");
            }else if (HoraI.getSelectedItem().toString().equals("6:00 pm")){
                HoraF.removeAllItems();
                HoraF.addItem("7:00 pm");
            }
        }
    }//GEN-LAST:event_HoraIItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Dias;
    private javax.swing.JComboBox<String> HoraF;
    private javax.swing.JComboBox<String> HoraI;
    private javax.swing.JTextField IdGrup;
    private javax.swing.JLabel Label1;
    private javax.swing.JComboBox<String> Libro;
    private javax.swing.JButton Registrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel libro;
    // End of variables declaration//GEN-END:variables
}
