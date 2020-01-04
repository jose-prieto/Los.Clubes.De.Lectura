package Interfaces.Contenido;

import ControladorBD.BDConexion;
import ControladorBD.QueriesJose;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class FichaLibro extends javax.swing.JPanel {

    ProcedimientosExtra listen = new ProcedimientosExtra();
    Dialogo diag = new Dialogo ();
    QueriesJose query = new QueriesJose();
    BDConexion conexion = new BDConexion();

    public FichaLibro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        libro = new javax.swing.JComboBox<>();
        GenFicha = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(707, 541));
        setMinimumSize(new java.awt.Dimension(707, 541));
        setPreferredSize(new java.awt.Dimension(707, 541));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Libro referencia");

        libro.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        libro.setForeground(new java.awt.Color(51, 51, 51));

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
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(GenFicha)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(46, 46, 46)
                        .addComponent(libro, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(libro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(228, 228, 228)
                .addComponent(GenFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(250, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void inicio(){
        ResultSet res = query.libros();
        
        libro.addItem(" ");

        if (res != null){
            try {
                do{
                    libro.addItem(res.getString(1));
                }while (res.next());
            } catch (SQLException ex) {
                Logger.getLogger(RegistraMiembro2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public boolean val(){
        if (libro.getSelectedItem().toString().equals(" ")){
            JOptionPane.showMessageDialog(null, "Para generar una ficha de libro\ndebe elegir alguna opción.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    public void mostrar(){
        GenFicha.setVisible(true);
    }
    
    private void GenFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenFichaActionPerformed
        // TODO add your handling code here:
        if (val()){
            try (Connection con = conexion.getConnection()){
                
                JasperReport reporte = null;
                String path = "src\\Reportes\\FichaLibro.jasper";
                
                Map parametro = new HashMap();
                parametro.put("isbn", query.isbn(libro.getSelectedItem().toString()));
                
                reporte =  (JasperReport) JRLoader.loadObjectFromFile(path);
                
                JasperPrint jprint = JasperFillManager.fillReport(path, parametro, con);
                
                JasperViewer view = new JasperViewer(jprint, false);
                
                view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                
                view.setVisible(true);
                
            }  catch (Exception e) {
                
                JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
                
            }
        }
    }//GEN-LAST:event_GenFichaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GenFicha;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox<String> libro;
    // End of variables declaration//GEN-END:variables
}
