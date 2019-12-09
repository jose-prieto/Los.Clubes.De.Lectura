package Interfaces.Contenido;

import ControladorBD.QueriesAlberto;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import ControladorBD.QueriesAlberto;

public class Pagos extends javax.swing.JPanel {

    ProcedimientosExtra listen = new ProcedimientosExtra();
    Dialogo diag = new Dialogo ();
    QueriesAlberto query = new QueriesAlberto();
    
    public Pagos() {
        initComponents();

        listen.FieldListener(IdPaga);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        IdPaga = new javax.swing.JTextField();
        Registrar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Label = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(707, 541));
        setMinimumSize(new java.awt.Dimension(707, 541));
        setPreferredSize(new java.awt.Dimension(707, 541));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("I.D del pagador");

        IdPaga.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        IdPaga.setForeground(new java.awt.Color(204, 204, 255));
        IdPaga.setText("Ej. 58698569");
        IdPaga.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        IdPaga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IdPagaKeyTyped(evt);
            }
        });

        Registrar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Registrar.setText("Registrar");
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Reestablecer");

        Label.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        Label.setForeground(new java.awt.Color(255, 0, 0));
        Label.setText("(*)");
        Label.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(278, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(IdPaga)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label)
                .addGap(116, 116, 116))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(IdPaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(326, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        // TODO add your handling code here:
       // int ci;
        if (IdPaga.getText().equals("Ej. 58698569")) {
            IdPaga.setBorder(new LineBorder(Color.red));
        } else {
            if (!ciExist(Integer.parseInt(IdPaga.getText()))){
             IdPaga.setBorder(new LineBorder(Color.red));
             IdPaga.setText("");   
             JOptionPane.showMessageDialog(null, "El miembro no se encuentra registrado.", "Error", JOptionPane.ERROR_MESSAGE);
             }else{
                IdPaga.setBorder(new LineBorder(Color.gray));
                query.BuscarHist(Integer.parseInt(IdPaga.getText()));
            }
        }
    }//GEN-LAST:event_RegistrarActionPerformed

    private void LabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelMouseEntered
        // TODO add your handling code here:
        diag.posicion(Label.getLocationOnScreen().x-29, Label.getLocationOnScreen().y+15);
        diag.setVisible(true);
    }//GEN-LAST:event_LabelMouseEntered

    private void LabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelMouseExited
        // TODO add your handling code here:
        diag.setVisible(false);
    }//GEN-LAST:event_LabelMouseExited

    private void IdPagaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IdPagaKeyTyped
        // TODO add your handling code here:
                          char c = evt.getKeyChar();
        
        if (c < '0' || c > '9' || IdPaga.getText().length() > 9){
            evt.consume();
        }
    }//GEN-LAST:event_IdPagaKeyTyped

    public boolean ciExist(int ced){        
        //return query.ciExist(ced);
        return true;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IdPaga;
    private javax.swing.JLabel Label;
    private javax.swing.JButton Registrar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
