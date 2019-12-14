package Interfaces.Contenido;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.LineBorder;

import ControladorBD.QueriesJose;
import javax.swing.JOptionPane;

public class CierreReu extends javax.swing.JPanel {
    
    ProcedimientosExtra listen = new ProcedimientosExtra ();
    Dialogo diag = new Dialogo ();
    QueriesJose query = new QueriesJose();
    
    public CierreReu() {
        initComponents();
        Cerrar.setEnabled(true);
        
        listen.FieldListener(IdGrupo);
    }
    
    public void vaciar(){
        IdGrupo.setText("");
        Moderador.removeAllItems();
        Conclusiones.setText("");
        Cerrar.setEnabled(false);
    }
    
    public void inicio(){
        ResultSet res;
        res = query.libros();
        Cerrar.setEnabled(false);
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
    
    public int getGrup(){
        if (IdGrupo.getText().equals("Ej. 123") || IdGrupo.getText().equals("")){
            return 0;
        }else {
            return Integer.parseInt(IdGrupo.getText());
        }
    }
    
    public boolean val(){
        if (Conclusiones.getText().equals("")){
            Conclusiones.setBorder(new LineBorder(Color.red));
            JOptionPane.showMessageDialog(null, "Debe rellenar todos los campos obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }else{
            Conclusiones.setBorder(new LineBorder(Color.gray));
            return true;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        IdGrupo = new javax.swing.JTextField();
        Cerrar = new javax.swing.JButton();
        Label1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Valor = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        Conclusiones = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Libros = new javax.swing.JComboBox<>();
        Moderador = new javax.swing.JComboBox<>();
        Label2 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(707, 541));
        setMinimumSize(new java.awt.Dimension(707, 541));
        setPreferredSize(new java.awt.Dimension(707, 541));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("I.D del grupo");

        IdGrupo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        IdGrupo.setForeground(new java.awt.Color(204, 204, 255));
        IdGrupo.setText("Ej. 123");
        IdGrupo.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        IdGrupo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                IdGrupoFocusLost(evt);
            }
        });

        Cerrar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Cerrar.setText("Cerrar Discusión");
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
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
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Valoración del libro");

        Valor.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Valor.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));

        Conclusiones.setColumns(20);
        Conclusiones.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Conclusiones.setRows(5);
        jScrollPane1.setViewportView(Conclusiones);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Conclusiones");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Próximo libro");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Próximo moderador");

        Libros.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        Moderador.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

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
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Cerrar)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                                    .addComponent(Libros, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Moderador, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Label2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IdGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Valor, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Label1)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(IdGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(Label2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Libros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Moderador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
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

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        // TODO add your handling code here:
        if (val() && query.actReu2(getGrup(), Conclusiones.getText(), (Integer)Valor.getValue()) 
                && query.actReu3(Libros.getSelectedItem().toString(), getGrup())){
            JOptionPane.showMessageDialog(null, "Discusión cerrada exitosamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_CerrarActionPerformed

    private void Label2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label2MouseEntered
        // TODO add your handling code here:
        diag.posicion(Label2.getLocationOnScreen().x-29, Label2.getLocationOnScreen().y+15);
        diag.setVisible(true);
    }//GEN-LAST:event_Label2MouseEntered

    private void Label2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label2MouseExited
        // TODO add your handling code here:
        diag.setVisible(false);
    }//GEN-LAST:event_Label2MouseExited

    private void IdGrupoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IdGrupoFocusLost
        // TODO add your handling code here:
        ResultSet res;
        res = query.miemGrupo(Integer.parseInt(IdGrupo.getText()));
        Moderador.removeAllItems();
        if (res != null){
            if (query.reuHoy(getGrup())){
                try {
                    do{
                        Moderador.addItem(res.getString(1));
                    }while (res.next());
                } catch (SQLException ex) {
                    Logger.getLogger(RegistraMiembro2.class.getName()).log(Level.SEVERE, null, ex);
                }
                Cerrar.setEnabled(true);
                IdGrupo.setBorder(new LineBorder(Color.gray));
            }else{
                JOptionPane.showMessageDialog(null, "Dicho grupo no tiene reunión programada para hoy", "Error", JOptionPane.ERROR_MESSAGE);
                IdGrupo.setBorder(new LineBorder(Color.red));
                Cerrar.setEnabled(false);
            }
        }else {
            
            JOptionPane.showMessageDialog(null, "Grupo inexistente", "Error", JOptionPane.ERROR_MESSAGE);
            IdGrupo.setBorder(new LineBorder(Color.red));
            Cerrar.setEnabled(false);
        }
    }//GEN-LAST:event_IdGrupoFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cerrar;
    private javax.swing.JTextArea Conclusiones;
    private javax.swing.JTextField IdGrupo;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private javax.swing.JComboBox<String> Libros;
    private javax.swing.JComboBox<String> Moderador;
    private javax.swing.JSpinner Valor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
