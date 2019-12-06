package Interfaces.Contenido;

import java.awt.Color;
import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.swing.border.LineBorder;

import ControladorBD.QueriesJose;
import javax.swing.JOptionPane;

public class RegistraMiembro extends javax.swing.JPanel {
    
    ProcedimientosExtra listen = new ProcedimientosExtra();
    Dialogo diag = new Dialogo ();
    SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
    QueriesJose query = new QueriesJose();
    
    public RegistraMiembro() {

        initComponents();
        
        Nacimiento.setMaxSelectableDate(query.fechaMax());
        Nacimiento.setDate(query.fechaMax());

        listen.FieldListener(Nombre);
        listen.FieldListener(Apellido);
        listen.FieldListener(Cedula);
        listen.FieldListener(CedulaRep);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Apellido = new javax.swing.JTextField();
        Cedula = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Continuar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Label1 = new javax.swing.JLabel();
        Label2 = new javax.swing.JLabel();
        Label3 = new javax.swing.JLabel();
        Label5 = new javax.swing.JLabel();
        Nacimiento = new com.toedter.calendar.JCalendar();
        Genero = new javax.swing.JComboBox<>();
        Label4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        CedulaRep = new javax.swing.JTextField();

        setMaximumSize(new java.awt.Dimension(707, 541));
        setMinimumSize(new java.awt.Dimension(707, 541));
        setPreferredSize(new java.awt.Dimension(707, 541));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Nombres");

        Nombre.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Nombre.setForeground(new java.awt.Color(204, 204, 255));
        Nombre.setText("Ej. José Antonio");
        Nombre.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NombreKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Apellidos");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Género");

        Apellido.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Apellido.setForeground(new java.awt.Color(204, 204, 255));
        Apellido.setText("Ej. Prieto Quintero");
        Apellido.setToolTipText("");
        Apellido.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        Apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ApellidoKeyTyped(evt);
            }
        });

        Cedula.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Cedula.setForeground(new java.awt.Color(204, 204, 255));
        Cedula.setText("Ej. 30698625");
        Cedula.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        Cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CedulaKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Cédula");

        Continuar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Continuar.setText("Continuar >");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Fecha de nacimiento");

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

        Label5.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        Label5.setForeground(new java.awt.Color(255, 0, 0));
        Label5.setText("(*)");
        Label5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Label5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Label5MouseExited(evt);
            }
        });

        Nacimiento.setBackground(new java.awt.Color(153, 153, 153));
        Nacimiento.setDate(new java.util.Date(1328053863000L));
        Nacimiento.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Nacimiento.setMaxSelectableDate(new java.util.Date(1296451863000L));
        Nacimiento.setMinSelectableDate(new java.util.Date(-2208969077000L));

        Genero.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Genero.setForeground(new java.awt.Color(51, 51, 51));
        Genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino", "Neutro" }));

        Label4.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        Label4.setForeground(new java.awt.Color(255, 0, 0));
        Label4.setText("(*)");
        Label4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Label4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Label4MouseExited(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Cédula del representante");

        CedulaRep.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CedulaRep.setForeground(new java.awt.Color(204, 204, 255));
        CedulaRep.setText("Ej. 30698625");
        CedulaRep.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        CedulaRep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CedulaRepKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(CedulaRep, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(564, 672, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Continuar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(253, 314, Short.MAX_VALUE)
                                        .addComponent(jLabel3)
                                        .addGap(20, 20, 20)
                                        .addComponent(Genero, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(137, 137, 137)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Nombre)
                                            .addComponent(Apellido)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Label4)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(Nacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label1)
                            .addComponent(Label2)
                            .addComponent(Label3)
                            .addComponent(Label5))
                        .addGap(32, 32, 32))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(Label3)
                    .addComponent(jLabel3)
                    .addComponent(Genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(Label5)
                    .addComponent(Nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CedulaRep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(Continuar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
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

    private void Label2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label2MouseEntered
        // TODO add your handling code here:
        diag.posicion(Label2.getLocationOnScreen().x-29, Label2.getLocationOnScreen().y+15);
        diag.setVisible(true);
    }//GEN-LAST:event_Label2MouseEntered

    private void Label2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label2MouseExited
        // TODO add your handling code here:
        diag.setVisible(false);
    }//GEN-LAST:event_Label2MouseExited

    private void Label3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label3MouseEntered
        // TODO add your handling code here:
        diag.posicion(Label3.getLocationOnScreen().x-29, Label3.getLocationOnScreen().y+15);
        diag.setVisible(true);
    }//GEN-LAST:event_Label3MouseEntered

    private void Label3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label3MouseExited
        // TODO add your handling code here:
        diag.setVisible(false);
    }//GEN-LAST:event_Label3MouseExited

    private void Label5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label5MouseEntered
        // TODO add your handling code here:
        diag.posicion(Label5.getLocationOnScreen().x-29, Label5.getLocationOnScreen().y+15);
        diag.setVisible(true);
    }//GEN-LAST:event_Label5MouseEntered

    private void Label5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label5MouseExited
        // TODO add your handling code here:
        diag.setVisible(false);
    }//GEN-LAST:event_Label5MouseExited

    private void Label4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label4MouseEntered
        // TODO add your handling code here:
        diag.posicion(Label4.getLocationOnScreen().x-29, Label4.getLocationOnScreen().y+15);
        diag.setVisible(true);
    }//GEN-LAST:event_Label4MouseEntered

    private void Label4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label4MouseExited
        // TODO add your handling code here:
        diag.setVisible(false);
    }//GEN-LAST:event_Label4MouseExited

    private void NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if (c != ' ' && (c < 'a' || c > 'z') && (c < 'A' || c > 'Z')){
            evt.consume();
        }
    }//GEN-LAST:event_NombreKeyTyped

    private void ApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ApellidoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if (c != ' ' && (c < 'a' || c > 'z') && (c < 'A' || c > 'Z')){
            evt.consume();
        }
    }//GEN-LAST:event_ApellidoKeyTyped

    private void CedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CedulaKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if (c < '0' || c > '9'){
            evt.consume();
        }
    }//GEN-LAST:event_CedulaKeyTyped

    private void CedulaRepKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CedulaRepKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if (c < '0' || c > '9'){
            evt.consume();
        }
    }//GEN-LAST:event_CedulaRepKeyTyped

    public boolean val() {
        boolean val = true;

        if (Nombre.getText().equals("Ej. José Antonio")) {
            Nombre.setBorder(new LineBorder(Color.red));
            val = false;
        } else {
            Nombre.setBorder(new LineBorder(Color.gray));
        }
        if (Apellido.getText().equals("Ej. Prieto Quintero")) {
            Apellido.setBorder(new LineBorder(Color.red));
            val = false;
        } else {
            Apellido.setBorder(new LineBorder(Color.gray));
        }
        if (Cedula.getText().equals("Ej. 30698625")) {
            Cedula.setBorder(new LineBorder(Color.red));
            val = false;
        } else {
            Cedula.setBorder(new LineBorder(Color.gray));
        }
        if (val == false) {
            JOptionPane.showMessageDialog(null, "Debe rellenar todos los campos que son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (ciExist(getCedula(Cedula.getText()))){
            Cedula.setBorder(new LineBorder(Color.red));
            JOptionPane.showMessageDialog(null, "El miembro que desea ingresar ya está registrado", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (CalcularEdad() <=18){
            if (CedulaRep.getText().equals("Ej. 30698625")){
                CedulaRep.setBorder(new LineBorder(Color.red));
                JOptionPane.showMessageDialog(null, "El miembro que desea ingresar es menor\npor ende necesita de un representante", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }else if (CedulaRep.getText().equals(Cedula.getText())){
                JOptionPane.showMessageDialog(null, "El miembro y su representante no pueden\ntener la misma cedula", "Error", JOptionPane.ERROR_MESSAGE);
                CedulaRep.setBorder(new LineBorder(Color.red));
                Cedula.setBorder(new LineBorder(Color.red));
                return false;
            }else{
                CedulaRep.setBorder(new LineBorder(Color.gray));
            }
        }
        
        return val;
    }
    
    public boolean ciExist(int ced){        
        return query.ciExist(ced);
    }
    
    public int CalcularEdad(){        
        return query.Edad(getNacimiento());
   }

    public String getApellido() {
        return Apellido.getText();
    }

    public int getCedula(String ced) {
        
        return Integer.parseInt(Cedula.getText());
    }

    public Date getNacimiento() {
        
        return java.sql.Date.valueOf(sdf.format(Nacimiento.getDate()));
        
    }

    public String getNombre() {
        return Nombre.getText();
    }

    public String getGenero() {
        return Genero.getSelectedItem().toString();
    }
    
    public void CrearAdulto() {
    }
    
    /*query.CrearMiembAdult(nuevomiembro.getCedula(), nuevomiembro.getNombre(), nuevomiembro.getApellido(),
                                        nuevomiembro.getGenero(), nuevomiembro.getNacimiento());*/

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apellido;
    private javax.swing.JTextField Cedula;
    public javax.swing.JTextField CedulaRep;
    public javax.swing.JButton Continuar;
    private javax.swing.JComboBox<String> Genero;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private javax.swing.JLabel Label3;
    private javax.swing.JLabel Label4;
    private javax.swing.JLabel Label5;
    public com.toedter.calendar.JCalendar Nacimiento;
    private javax.swing.JTextField Nombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
