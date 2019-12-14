package Interfaces.Contenido;

import ControladorBD.QueriesAlberto;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

public class CierreObra extends javax.swing.JPanel {

    ProcedimientosExtra listen = new ProcedimientosExtra();
     QueriesAlberto query = new QueriesAlberto();
    Dialogo diag = new Dialogo();
    
    public CierreObra() {
        initComponents();

        listen.FieldListener(obra);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        obra = new javax.swing.JTextField();
        Cierre = new javax.swing.JButton();
        Label1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(707, 541));
        setMinimumSize(new java.awt.Dimension(707, 541));
        setPreferredSize(new java.awt.Dimension(707, 541));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("I.D de la obra");

        obra.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        obra.setForeground(new java.awt.Color(204, 204, 255));
        obra.setText("Ej. 123456");
        obra.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        obra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                obraKeyTyped(evt);
            }
        });

        Cierre.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Cierre.setText("Cierre de obra");
        Cierre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CierreActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1)
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(obra, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Label1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Cierre)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(obra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label1))
                .addGap(80, 80, 80)
                .addComponent(Cierre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(340, Short.MAX_VALUE))
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

    private void CierreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CierreActionPerformed
        // TODO add your handling code here:
        if (obra.getText().equals("Ej. 123")) {
            obra.setBorder(new LineBorder(Color.red));
             JOptionPane.showMessageDialog(null, "Por favor ingrese el id de la obra.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            obra.setBorder(new LineBorder(Color.gray));
           if ( query.obraExist(Integer.parseInt(obra.getText()))){
               if (query.estadoObra(Integer.parseInt(obra.getText()))){
                    query.ActualizarObra(Integer.parseInt(obra.getText()));  
                      }else{
                       JOptionPane.showMessageDialog(null, "Ya esta obra se encuentra inactiva.", "Error", JOptionPane.ERROR_MESSAGE); 
                    }  
           }else {              
               JOptionPane.showMessageDialog(null, "No existe una obra con el id ingresado.", "Error", JOptionPane.ERROR_MESSAGE);  
               }
        }
    }//GEN-LAST:event_CierreActionPerformed

    private void obraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_obraKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        
        if (c < '0' || c > '9' || obra.getText().length() > 2){
            evt.consume();
        }
    }//GEN-LAST:event_obraKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cierre;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField obra;
    // End of variables declaration//GEN-END:variables
}
