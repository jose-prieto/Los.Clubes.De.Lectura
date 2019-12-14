package Interfaces.Contenido;

import ControladorBD.QueriesAlberto;
import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.border.LineBorder;

import ControladorBD.QueriesJose;
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NuevaFunc extends javax.swing.JPanel {
    
    ProcedimientosExtra listen = new ProcedimientosExtra();
    Dialogo diag = new Dialogo ();
    SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
    QueriesJose queryJ = new QueriesJose();
    QueriesAlberto query = new QueriesAlberto();
    public int val = 0;
    

    public NuevaFunc() {

        initComponents();
        Nacimiento.setDate(query.fechamin());
        Nacimiento.setMaxSelectableDate(query.fechamax());
        Nacimiento.setDate(query.fechamin());
        listen.FieldListener(IdObra);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        IdObra = new javax.swing.JTextField();
        Continuar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Label1 = new javax.swing.JLabel();
        Label2 = new javax.swing.JLabel();
        Nacimiento = new com.toedter.calendar.JCalendar();
        jLabel6 = new javax.swing.JLabel();
        Hora = new javax.swing.JSpinner();
        Actor = new javax.swing.JComboBox<>();
        Personaje = new javax.swing.JComboBox<>();
        Agregar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(707, 541));
        setMinimumSize(new java.awt.Dimension(707, 541));
        setPreferredSize(new java.awt.Dimension(707, 541));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("I.D de la obra");

        IdObra.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        IdObra.setForeground(new java.awt.Color(204, 204, 255));
        IdObra.setText("Ej. 123456");
        IdObra.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        IdObra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                IdObraFocusLost(evt);
            }
        });
        IdObra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IdObraKeyTyped(evt);
            }
        });

        Continuar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Continuar.setForeground(new java.awt.Color(51, 51, 51));
        Continuar.setText("Listo");
        Continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinuarActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Fecha de la presentación");

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

        Nacimiento.setBackground(new java.awt.Color(153, 153, 153));
        Nacimiento.setForeground(new java.awt.Color(51, 51, 51));
        Nacimiento.setDate(new java.util.Date(1107213663000L));
        Nacimiento.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Nacimiento.setMaxSelectableDate(new java.util.Date(1107147663000L));
        Nacimiento.setMinSelectableDate(new java.util.Date(-2208969077000L));
        Nacimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NacimientoMouseEntered(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Hora de la función");

        Hora.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Hora.setModel(new javax.swing.SpinnerListModel(new String[] {"06:00", "07:00", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00", "00:00"}));

        Actor.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Actor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActorActionPerformed(evt);
            }
        });

        Personaje.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        Agregar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Agregar.setForeground(new java.awt.Color(51, 51, 51));
        Agregar.setText("Agregar actor");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Actor");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Personaje");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(Personaje, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(Actor, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Hora, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(IdObra, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Nacimiento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Continuar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Label1)
                                    .addComponent(Label2))
                                .addGap(27, 27, 27))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(IdObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(Label2)
                    .addComponent(Nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Actor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Personaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Continuar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinuarActionPerformed
        // TODO add your handling code here:
        if (IdObra.getText().equals("Ej. 123456")) {
            IdObra.setBorder(new LineBorder(Color.red));
        } else {
            IdObra.setBorder(new LineBorder(Color.gray));
        }
    }//GEN-LAST:event_ContinuarActionPerformed

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

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        // TODO add your handling code here:
        if(val==0){
           query.CrearFuncion(getNacimiento(), Integer.parseInt(IdObra.getText()), hora());  
           query.CrearElenco(Integer.parseInt((Actor.getSelectedItem().toString())), Personaje.getSelectedItem().toString(), Integer.parseInt(IdObra.getText()));
           query.CrearActor(Integer.parseInt((String) Actor.getSelectedItem()), Personaje.getSelectedItem().toString(), getNacimiento(), Integer.parseInt(IdObra.getText()));
           val=1;
        }else{
            query.CrearElenco(Integer.parseInt((Actor.getSelectedItem().toString())), Personaje.getSelectedItem().toString(), Integer.parseInt(IdObra.getText()));
            query.CrearActor(Integer.parseInt((String) Actor.getSelectedItem()), Personaje.getSelectedItem().toString(), getNacimiento(), Integer.parseInt(IdObra.getText()));
       
        }
    }//GEN-LAST:event_AgregarActionPerformed

    private void IdObraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IdObraFocusLost
        // TODO add your handling code here:
        if (!IdObra.getText().equals("Ej. 123456")){
            ResultSet rs, rs2;
            Actor.removeAllItems();

            try {
                rs2 = queryJ.miemGrupo(queryJ.clubDeObra(Integer.parseInt(IdObra.getText())));
                if (rs2 == null){
                    //aqui debes eliminar la obra porque el club no tiene miembros
                }else{

                    try {
                        do{
                            Actor.addItem(Integer.toString(rs2.getInt(1)));
                        }while (rs2.next());
                    } catch (SQLException ex) {
                        Logger.getLogger(RegistraMiembro2.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                } catch (Exception ex) {
                    Logger.getLogger(RegistraMiembro2.class.getName()).log(Level.SEVERE, null, ex);
                }

            try {
                
                rs = queryJ.clubHijo(queryJ.clubDeObra(Integer.parseInt(IdObra.getText())));
                    if (rs != null){
                        
                        do{
                            System.out.println(rs.getInt(1));
                            rs2 = queryJ.miemClub(rs.getInt(1));
                            if (rs2 != null){
                                try {
                                    do{
                                        Actor.addItem(Integer.toString(rs2.getInt(1)));
                                    }while (rs2.next());
                                } catch (SQLException ex) {
                                    Logger.getLogger(RegistraMiembro2.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        }while (rs.next());
                    }
            } catch (Exception ex) {
                Logger.getLogger(RegistraMiembro2.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            rs2 = queryJ.personajes(Integer.parseInt(IdObra.getText()));
            if (rs2 != null){
                try {
                    do{
                        Personaje.addItem(rs2.getString(1));
                    }while (rs2.next());
                } catch (SQLException ex) {
                    Logger.getLogger(RegistraMiembro2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_IdObraFocusLost

    public Date getNacimiento() {        
        return java.sql.Date.valueOf(sdf.format(Nacimiento.getDate()));
        
    } 
    
    public int hora(){
       String cadena = Hora.getValue().toString();
       int h = (int)(cadena.charAt(0));
       int i = (int)(cadena.charAt(1));
             if(h==48){
                 return i-48;
             }else if(h==49){
                 return i-38;
             }
        return 0;
             
}
    
    private void IdObraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IdObraKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        
        if (c < '0' || c > '9' || IdObra.getText().length() > 2){
            evt.consume();
        }
    }//GEN-LAST:event_IdObraKeyTyped

    private void ActorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ActorActionPerformed

    private void NacimientoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NacimientoMouseEntered
        // TODO add your handling code here:
        val = 0;
    }//GEN-LAST:event_NacimientoMouseEntered

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Actor;
    public javax.swing.JButton Agregar;
    public javax.swing.JButton Continuar;
    private javax.swing.JSpinner Hora;
    private javax.swing.JTextField IdObra;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private com.toedter.calendar.JCalendar Nacimiento;
    private javax.swing.JComboBox<String> Personaje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
