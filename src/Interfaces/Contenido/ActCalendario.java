package Interfaces.Contenido;

import java.awt.Color;
import javax.swing.border.LineBorder;
import ControladorBD.QueriesJose;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ActCalendario extends javax.swing.JPanel {

    ProcedimientosExtra listen = new ProcedimientosExtra();
    Dialogo diag = new Dialogo();
    QueriesJose query = new QueriesJose();
    int val = 5;
    int val2 = 0;
    int cont = 0;

    public ActCalendario() {

        initComponents();

        listen.FieldListener(IdGrup);
        
        Libro.setVisible(false);
        libro.setVisible(false);
        Moderador.setVisible(false);
        moderador.setVisible(false);
    }
    
    public boolean val (){
        ResultSet rs;
        rs = query.Info2(getGrup());
        
        if (rs != null){
            cont = 0;
            try {
                do{
                    cont++;
                }while (rs.next());
            } catch (SQLException ex) {
                Logger.getLogger(RegistraMiembro2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (IdGrup.getText().equals("Ej. 123")){
            IdGrup.setBorder(new LineBorder(Color.red));
            JOptionPane.showMessageDialog(null, "Debe rellenar los campos obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }else if (query.bucarclub(getGrup()) == null){
            IdGrup.setBorder(new LineBorder(Color.red));
            return false;
        }else{
            IdGrup.setBorder(new LineBorder(Color.gray));
        }
        /*if (cont < val){
            JOptionPane.showMessageDialog(null, "El grupo: "+getGrup()+"\nDebe tener un mínimo de: "+val+
                    " personas\nPara organizar una reunión\nY el grupo solo cuenta con: "+cont+
                    " personas", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }*/
        return true;
    }
    
    public int getGrup(){
        if (IdGrup.getText().equals("Ej. 123") || IdGrup.getText().equals("")){
            return 0;
        }else {
            return Integer.parseInt(IdGrup.getText());
        }
    }
    
    public int getMod(){
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
    
    public boolean crearReuN(){
        ResultSet rs, rs2;
        rs = query.Info2(getGrup());
        rs2 = query.Info(getGrup(), Integer.parseInt(Moderador.getSelectedItem().toString()));
        
        if (rs2 != null){
            try {
                query.crearReuN(indexFecha(), getGrup(), rs2.getInt(1), Libro.getSelectedItem().toString(),
                        rs2.getDate(2), Integer.parseInt(Moderador.getSelectedItem().toString()));
            } catch (SQLException ex) {
                Logger.getLogger(RegistraMiembro2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else
        
        if (rs != null){
            cont = 0;
            try {
                do{
                    cont++;
                    query.Inasistencia(indexFecha(), getGrup(), rs.getInt(1), rs.getDate(2), rs.getInt(3));
                }while (rs.next());
            } catch (SQLException ex) {
                Logger.getLogger(RegistraMiembro2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return false;
    }
    
    public boolean actReu(){
        return (query.actReu(indexFecha(), getGrup()));
    }
    
    public int indexFecha(){
        return Dias.getSelectedIndex() + 8;
    }
    
    public void vaciar(){
        HoraI.setEnabled(false);
        HoraF.setEnabled(false);
        Libro.setVisible(false);
        libro.setVisible(false);
        Moderador.setVisible(false);
        moderador.setVisible(false);
        IdGrup.setForeground(new Color(204,204,255));
        IdGrup.setText("Ej. 123");
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
        Moderador = new javax.swing.JComboBox<>();
        moderador = new javax.swing.JLabel();

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
        IdGrup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdGrupActionPerformed(evt);
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

        Moderador.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Moderador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModeradorActionPerformed(evt);
            }
        });

        moderador.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        moderador.setText("Moderador");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(moderador)
                        .addGap(48, 48, 48)
                        .addComponent(Moderador, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 475, Short.MAX_VALUE)
                        .addComponent(Registrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Dias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(IdGrup)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(libro))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Libro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(HoraI, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Moderador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(moderador))
                .addGap(18, 18, 18)
                .addComponent(Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(194, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        // TODO add your handling code here:
        ResultSet rs,rs2;
        
        if (val2 == 1){
            if (val() && Actualizar()){
                crearReuN();                
                vaciar();
                
                JOptionPane.showMessageDialog(null, "Próxima reunión pautada para el dia: "+Dias.getSelectedItem().toString()+
                        "\nDesde las "+HoraI.getSelectedItem().toString()+" a las "+HoraF.getSelectedItem().toString(), 
                        "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
        }else{
            if (val() && Actualizar()){
                
                query.BorraInasist(Integer.parseInt(IdGrup.getText()));
                actReu();
                rs = query.Info2(Integer.parseInt(IdGrup.getText()));
                if (rs != null){
                    cont = 0;
                    try {
                        do{
                            cont++;
                            query.Inasistencia(indexFecha(), getGrup(), rs.getInt(1), rs.getDate(2), rs.getInt(3));
                        }while (rs.next());
                    } catch (SQLException ex) {
                        Logger.getLogger(RegistraMiembro2.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                vaciar();
                JOptionPane.showMessageDialog(null, "Próxima reunión pautada para el dia: "+Dias.getSelectedItem().toString()+
                        "\nDesde las "+HoraI.getSelectedItem().toString()+" a las "+HoraF.getSelectedItem().toString(), 
                        "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
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
        if (getGrup() != 0){
            
            ResultSet res = query.bucarclub(getGrup());

            try {
                if (res != null){
                    if (res.getString(2).equals("niños")){
                        val = 7;
                        HoraI.removeItemAt(2);
                        
                        HoraI.setEnabled(true);
                        HoraF.setEnabled(true);
                        HoraI.removeItem("7:00 pm");
                    }else {
                        HoraI.setEnabled(true);
                        HoraF.setEnabled(true);
                        
                        if (val == 7){
                            HoraI.addItem("7:00 pm");
                        }
                        if (res.getString(2).equals("jovenes")){
                            val = 5;
                        }
                        if (res.getString(2).equals("adultos")){
                            val = 10;
                        }
                        
                    }
                    if (query.reuAbierta(getGrup()) == null){
                        val2 = 1;
                        
                        libro.setVisible(true);
                        Libro.setVisible(true);
                        Moderador.setVisible(true);
                        moderador.setVisible(true);
                        Libro.removeAllItems();
                        Moderador.removeAllItems();
                        
                        res = query.libros();
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
                        
                        res = query.miemGrupo(getGrup());
                        Moderador.removeAllItems();
                        if (res != null){
                            try {
                                do{
                                    Moderador.addItem(res.getString(1));
                                }while (res.next());
                            } catch (SQLException ex) {
                                Logger.getLogger(RegistraMiembro2.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }else{
                        libro.setVisible(false);
                        Libro.setVisible(false);
                        Moderador.setVisible(false);
                        moderador.setVisible(false);
                        val2 = 0;
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
        
        if (val == 7){
            if (HoraI.getSelectedItem().toString().equals("5:00 pm")){
                HoraF.removeAllItems();
                HoraF.addItem("6:00 pm");
                HoraF.addItem("7:00 pm");
            }else if (HoraI.getSelectedItem().toString().equals("6:00 pm")){
                HoraF.removeAllItems();
                HoraF.addItem("7:00 pm");
            }
        }else{
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
        }
    }//GEN-LAST:event_HoraIItemStateChanged

    private void ModeradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModeradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModeradorActionPerformed

    private void IdGrupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdGrupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdGrupActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Dias;
    private javax.swing.JComboBox<String> HoraF;
    private javax.swing.JComboBox<String> HoraI;
    private javax.swing.JTextField IdGrup;
    private javax.swing.JLabel Label1;
    private javax.swing.JComboBox<String> Libro;
    private javax.swing.JComboBox<String> Moderador;
    private javax.swing.JButton Registrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel libro;
    private javax.swing.JLabel moderador;
    // End of variables declaration//GEN-END:variables
}
