package Interfaces.Contenido;

import ControladorBD.QueriesJose;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import ControladorBD.BDConexion;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class FichaClub extends javax.swing.JPanel {

    ProcedimientosExtra listen = new ProcedimientosExtra();
    Dialogo diag = new Dialogo ();
    QueriesJose query = new QueriesJose();    
    BDConexion conexion = new BDConexion();
    ProcedimientosExtra pro = new ProcedimientosExtra();

    public FichaClub() {
        
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Club = new javax.swing.JLabel();
        club = new javax.swing.JComboBox<>();
        GenFicha = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(707, 541));
        setMinimumSize(new java.awt.Dimension(707, 541));
        setPreferredSize(new java.awt.Dimension(707, 541));

        Club.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Club.setForeground(new java.awt.Color(51, 51, 51));
        Club.setText("Nombre del club");

        club.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        club.setForeground(new java.awt.Color(51, 51, 51));
        club.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clubActionPerformed(evt);
            }
        });

        GenFicha.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        GenFicha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icono-PDF.png"))); // NOI18N
        GenFicha.setText("Generar ficha");
        GenFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenFichaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GenFicha))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(Club)
                        .addGap(18, 18, 18)
                        .addComponent(club, 0, 413, Short.MAX_VALUE)))
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Club)
                    .addComponent(club, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112)
                .addComponent(GenFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(243, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void GenFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenFichaActionPerformed
        // TODO add your handling code here:
        if (val()){
            try (Connection con = conexion.getConnection()){

                JasperReport reporte = null;
                String path = "src\\Reportes\\FichaClub.jasper";

                Map parametro = new HashMap();
                parametro.put("idClub", 1);

                reporte =  (JasperReport) JRLoader.loadObjectFromFile(path);

                JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, con);

                JasperViewer view = new JasperViewer(jprint, false);

                view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

                view.setVisible(true);

            }  catch (Exception e) {

                JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);

            }
            
        }
    }//GEN-LAST:event_GenFichaActionPerformed

    private void clubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clubActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clubActionPerformed

    public void inicio(){
        ResultSet res = query.clubes();
        club.removeAllItems();
        club.addItem(" ");
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
        
        if (club.getSelectedItem().toString().equals(" ")){
            JOptionPane.showMessageDialog(null, "Debe seleccionar algún club para generar su ficha.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Club;
    public javax.swing.JButton GenFicha;
    public javax.swing.JComboBox<String> club;
    // End of variables declaration//GEN-END:variables
}
