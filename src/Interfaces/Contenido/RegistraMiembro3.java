package Interfaces.Contenido;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

import ControladorBD.QueriesJose;

public class RegistraMiembro3 extends javax.swing.JPanel {
    
    RegistraMiembro regi = new RegistraMiembro();
    ProcedimientosExtra listen = new ProcedimientosExtra ();
    Dialogo diag = new Dialogo ();
    QueriesJose query = new QueriesJose();

    public RegistraMiembro3() {
        initComponents();
        
        listen.FieldListener (Cod1);
        listen.FieldListener (Cod2);
        listen.FieldListener (Num1);
        listen.FieldListener (Num2);
        listen.FieldListener(Nombre);
        listen.FieldListener(Apellido);
        listen.FieldListener(Cedula);
        
        Cedula.setEnabled(false);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Cod1 = new javax.swing.JTextField();
        Label4 = new javax.swing.JLabel();
        Num1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Num2 = new javax.swing.JTextField();
        Cod2 = new javax.swing.JTextField();
        Genero = new javax.swing.JComboBox<>();
        Apellido = new javax.swing.JTextField();
        Label3 = new javax.swing.JLabel();
        Cedula = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Label1 = new javax.swing.JLabel();
        Label2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Continuar = new javax.swing.JButton();
        Nombre2 = new javax.swing.JTextField();
        Apellido2 = new javax.swing.JTextField();

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("(*)");

        setMaximumSize(new java.awt.Dimension(707, 541));
        setMinimumSize(new java.awt.Dimension(707, 541));
        setPreferredSize(new java.awt.Dimension(707, 541));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Teléfono 1");

        Cod1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Cod1.setForeground(new java.awt.Color(204, 204, 255));
        Cod1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Cod1.setText("0424");
        Cod1.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        Cod1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Cod1KeyTyped(evt);
            }
        });

        Label4.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
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

        Num1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Num1.setForeground(new java.awt.Color(204, 204, 255));
        Num1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Num1.setText("1931798");
        Num1.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        Num1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Num1KeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Teléfono 2");

        Num2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Num2.setForeground(new java.awt.Color(204, 204, 255));
        Num2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Num2.setText("4424833");
        Num2.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        Num2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Num2KeyTyped(evt);
            }
        });

        Cod2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Cod2.setForeground(new java.awt.Color(204, 204, 255));
        Cod2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Cod2.setText("0212");
        Cod2.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        Cod2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Cod2KeyTyped(evt);
            }
        });

        Genero.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Genero.setForeground(new java.awt.Color(51, 51, 51));
        Genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino", "Neutro" }));

        Apellido.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Apellido.setForeground(new java.awt.Color(204, 204, 255));
        Apellido.setText("Ej. Prieto");
        Apellido.setToolTipText("");
        Apellido.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        Apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ApellidoKeyTyped(evt);
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

        Cedula.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Cedula.setForeground(new java.awt.Color(51, 51, 51));
        Cedula.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Cédula");

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

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Nombres");

        Nombre.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Nombre.setForeground(new java.awt.Color(204, 204, 255));
        Nombre.setText("Ej. José");
        Nombre.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NombreKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Apellidos");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Género");

        Continuar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Continuar.setText("Continuar >");

        Nombre2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Nombre2.setForeground(new java.awt.Color(204, 204, 255));
        Nombre2.setText("Ej. Antonio");
        Nombre2.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        Nombre2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Nombre2KeyTyped(evt);
            }
        });

        Apellido2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Apellido2.setForeground(new java.awt.Color(204, 204, 255));
        Apellido2.setText("Ej. Quintero");
        Apellido2.setToolTipText("");
        Apellido2.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        Apellido2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Apellido2KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Continuar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Label3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Cod1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Num1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Label4)))
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(Cod2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Num2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(Genero, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Apellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                    .addComponent(Nombre, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Label1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Nombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Label2)
                                        .addGap(97, 97, 97)
                                        .addComponent(Apellido2)))))))
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label1)
                    .addComponent(Nombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label2)
                    .addComponent(Apellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel6)
                    .addComponent(Genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Cod1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label4)
                    .addComponent(Num1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cod2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Num2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(Continuar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(229, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Label4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label4MouseEntered
        // TODO add your handling code here:
        diag.posicion(Label4.getLocationOnScreen().x-29, Label4.getLocationOnScreen().y+15);
        diag.setVisible(true);
    }//GEN-LAST:event_Label4MouseEntered

    private void Label4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label4MouseExited
        // TODO add your handling code here:
        diag.setVisible(false);
    }//GEN-LAST:event_Label4MouseExited

    private void Label3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label3MouseEntered
        // TODO add your handling code here:
        diag.posicion(Label3.getLocationOnScreen().x-29, Label3.getLocationOnScreen().y+15);
        diag.setVisible(true);
    }//GEN-LAST:event_Label3MouseEntered

    private void Label3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label3MouseExited
        // TODO add your handling code here:
        diag.setVisible(false);
    }//GEN-LAST:event_Label3MouseExited

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

    private void Cod1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cod1KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if (c < '0' || c > '9' || Cod1.getText().length() > 3){
            evt.consume();
        }
    }//GEN-LAST:event_Cod1KeyTyped

    private void Num1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Num1KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if (c < '0' || c > '9' || Num1.getText().length() > 6){
            evt.consume();
        }
    }//GEN-LAST:event_Num1KeyTyped

    private void Cod2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cod2KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if (c < '0' || c > '9' || Cod2.getText().length() > 3){
            evt.consume();
        }
    }//GEN-LAST:event_Cod2KeyTyped

    private void Num2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Num2KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if (c < '0' || c > '9' || Num2.getText().length() > 6){
            evt.consume();
        }
    }//GEN-LAST:event_Num2KeyTyped

    private void Nombre2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nombre2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Nombre2KeyTyped

    private void Apellido2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Apellido2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Apellido2KeyTyped

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
        }if (Cod1.getText().equals("0424") || Num1.getText().equals("1931798")) {
            Cod1.setBorder(new LineBorder(Color.red));
            Num1.setBorder(new LineBorder(Color.red));
            val = false;
        } else {
            Cod1.setBorder(new LineBorder(Color.gray));
            Num1.setBorder(new LineBorder(Color.gray));
        }if (Cod2.getText().equals("0212") || Num2.getText().equals("4424833")) {
            Cod2.setBorder(new LineBorder(Color.red));
            Num2.setBorder(new LineBorder(Color.red));
            val = false;
        } else {
            Cod2.setBorder(new LineBorder(Color.gray));
            Num2.setBorder(new LineBorder(Color.gray));
        }
        if (val == false) {
            JOptionPane.showMessageDialog(null, "Debe rellenar todos los campos que son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        return val;
    }
    
    public int getCedula(String ced) {
        
        return Integer.parseInt(Cedula.getText());
    }
    
    public String getNombre() {
        if (Nombre.getText().equals("Ej. José")){
            return null;
        }else {
            return Nombre.getText();
        }
    }
    
    public String getNombre2() {
        
        if (Nombre2.getText().equals("Ej. Antonio")){
            return null;
        }else {
            return Nombre2.getText();
        }
        
    }
    
    public String getApellido2() {
        
        if (Apellido2.getText().equals("Ej. Quintero")){
            return null;
        }else {
            return Apellido2.getText();
        }
        
    }
    
    public String getApellido() {
        return Apellido.getText();
    }
    
    public String getGenero() {
        return Genero.getSelectedItem().toString();
    }
    
    public boolean CrearRep() {
        return query.CrearRep(getCedula(Cedula.getText()), getNombre(), getNombre2(), getApellido(), getApellido2(),getGenero());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField Apellido;
    private javax.swing.JTextField Apellido2;
    public javax.swing.JTextField Cedula;
    private javax.swing.JTextField Cod1;
    private javax.swing.JTextField Cod2;
    public javax.swing.JButton Continuar;
    private javax.swing.JComboBox<String> Genero;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private javax.swing.JLabel Label3;
    private javax.swing.JLabel Label4;
    public javax.swing.JTextField Nombre;
    private javax.swing.JTextField Nombre2;
    private javax.swing.JTextField Num1;
    private javax.swing.JTextField Num2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
