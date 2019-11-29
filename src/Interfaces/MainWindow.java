/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import ControladorBD.DBConnection;

import Interfaces.Menu.ClubesPannel;
import Interfaces.Menu.MainPannel;
import Interfaces.Menu.MantLibrosPannel;
import Interfaces.Menu.ObrasPannel;
import Interfaces.Menu.ReunionesPannel;
import Interfaces.Menu.MiembrosPannel;

import Interfaces.Contenido.EmptyPannel;
import Interfaces.Contenido.AsociarClub;
import Interfaces.Contenido.NuevoClubContent;
import Interfaces.Contenido.EliminarClub;
import Interfaces.Contenido.Pagos;
import Interfaces.Contenido.RegistrarLibro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
//import javax.swing.ImageIcon;


/**
 *
 * @author Jose Prieto
 */
public class MainWindow extends javax.swing.JFrame implements ActionListener{
    
    DBConnection conexion = new DBConnection ();
    
    //Menu pannels
    MainPannel option = new MainPannel();
    ReunionesPannel reuniones = new ReunionesPannel();
    ClubesPannel clubes = new ClubesPannel ();
    ObrasPannel obras = new ObrasPannel ();
    MantLibrosPannel libros = new MantLibrosPannel ();
    MiembrosPannel miembros = new MiembrosPannel ();
    
    //Content pannels
    RegistrarLibro nuevolibro = new RegistrarLibro ();
    EliminarClub eliminarclub = new EliminarClub ();
    NuevoClubContent nuevoclub = new NuevoClubContent ();
    AsociarClub asociarclub = new AsociarClub ();
    EmptyPannel vacio = new EmptyPannel();
    Pagos pago = new Pagos ();

    public MainWindow() {        
        initComponents();
        
        setIconImage(new ImageIcon(getClass().getResource("../Images/Icono.png")).getImage());
        
        OptionPannel.add(option);
        ContentPannel.add(vacio);
        
        //action listener de botones de clubes
        clubes.Libros.addActionListener(this);
        clubes.Miembros.addActionListener(this);
        clubes.Pagos.addActionListener(this);
        clubes.AsociarClub.addActionListener(this);
        clubes.Eliminarclub.addActionListener(this);
        clubes.NuevoClub.addActionListener(this);
        
        //action listener de botones de reuniones manager pannel
        reuniones.Asistencias.addActionListener(this);
        reuniones.Calendario.addActionListener(this);
        
        //action listener de botones de option main pannel
        option.Reuniones.addActionListener(this);
        option.Clubes.addActionListener(this);
        option.Obras.addActionListener(this);
        
        //action listener de home button
        HomeButton.addActionListener(this);
        
        //action listener de home button
        libros.RegistrarLibro.addActionListener(this);
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OptionPannel = new javax.swing.JPanel();
        TitlePannel = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        HomeButtonPannel = new javax.swing.JPanel();
        HomeButton = new javax.swing.JButton();
        ContentPannel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clubes de lectura");
        setBackground(new java.awt.Color(102, 102, 102));
        setBounds(new java.awt.Rectangle(102, 102, 102, 102));
        setMaximizedBounds(new java.awt.Rectangle(900, 600, 0, 0));
        setMaximumSize(new java.awt.Dimension(1600, 900));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(900, 600));

        OptionPannel.setBackground(new java.awt.Color(51, 51, 51));
        OptionPannel.setForeground(new java.awt.Color(102, 102, 102));
        OptionPannel.setLayout(new java.awt.BorderLayout());

        TitlePannel.setBackground(new java.awt.Color(255, 255, 255));
        TitlePannel.setLayout(new java.awt.BorderLayout());

        Titulo.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(51, 51, 51));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Inicio");
        TitlePannel.add(Titulo, java.awt.BorderLayout.CENTER);

        HomeButtonPannel.setBackground(new java.awt.Color(51, 51, 51));
        HomeButtonPannel.setPreferredSize(new java.awt.Dimension(210, 210));

        HomeButton.setBackground(new java.awt.Color(255, 255, 255));
        HomeButton.setForeground(new java.awt.Color(255, 255, 255));
        HomeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icono.png"))); // NOI18N
        HomeButton.setBorder(null);
        HomeButton.setBorderPainted(false);
        HomeButton.setContentAreaFilled(false);
        HomeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HomeButton.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        HomeButton.setMaximumSize(new java.awt.Dimension(70, 34));
        HomeButton.setMinimumSize(new java.awt.Dimension(70, 34));
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HomeButtonPannelLayout = new javax.swing.GroupLayout(HomeButtonPannel);
        HomeButtonPannel.setLayout(HomeButtonPannelLayout);
        HomeButtonPannelLayout.setHorizontalGroup(
            HomeButtonPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HomeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
        );
        HomeButtonPannelLayout.setVerticalGroup(
            HomeButtonPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeButtonPannelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(HomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        ContentPannel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(HomeButtonPannel, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                    .addComponent(OptionPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TitlePannel, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
                    .addComponent(ContentPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HomeButtonPannel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(OptionPannel, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(TitlePannel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ContentPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(916, 672));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HomeButtonActionPerformed
    
    /*private void HomeButtonMouseEntered(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        HomeButton.setBackground(Color.yellow);
        HomeButton.setBackground(Color.DARK_GRAY);
    }  */                                     
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContentPannel;
    private javax.swing.JButton HomeButton;
    private javax.swing.JPanel HomeButtonPannel;
    private javax.swing.JPanel OptionPannel;
    private javax.swing.JPanel TitlePannel;
    private javax.swing.JLabel Titulo;
    // End of variables declaration//GEN-END:variables

    public void SetInvisibleContent(){
        vacio.setVisible(false);
        asociarclub.setVisible(false);
        eliminarclub.setVisible(false);
        nuevoclub.setVisible(false);
        pago.setVisible(false);
        nuevolibro.setVisible(false);
        
        
    }
    
    public void SetInvisibleMenu(){
        
        option.setVisible(false);
        reuniones.setVisible(false);
        clubes.setVisible(false);
        obras.setVisible(false);
        libros.setVisible(false);
        miembros.setVisible(false);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object evt = ae.getSource();
        
        if (evt.equals(option.Reuniones)){

            SetInvisibleMenu();
            SetInvisibleContent();
            
            reuniones.setVisible(true);
            vacio.setVisible(true);
            
            OptionPannel.validate();
            ContentPannel.validate();
            
            ContentPannel.add(vacio);
            Titulo.setText("Cierre de reunión");
            OptionPannel.add(reuniones);
            conexion.getConnection();

        }else if (evt.equals(HomeButton)){
            
            SetInvisibleMenu();
            SetInvisibleContent();
            
            option.setVisible(true);
            vacio.setVisible(true);
            
            OptionPannel.validate();
            ContentPannel.validate();
            
            OptionPannel.add(option);
            Titulo.setText("Inicio");
            ContentPannel.add(vacio);
            
        }else if (evt.equals(option.Obras)){
            
            SetInvisibleMenu();
            SetInvisibleContent();
            
            obras.setVisible(true);
            vacio.setVisible(true);
            
            OptionPannel.validate();
            ContentPannel.validate();
            
            OptionPannel.add(obras);
            Titulo.setText("Administración de obras");
            ContentPannel.add(vacio);
            
        }else if (evt.equals(option.Clubes)){
            
            SetInvisibleMenu();
            SetInvisibleContent();
            
            clubes.setVisible(true);
            pago.setVisible(true);
            
            OptionPannel.validate();
            ContentPannel.validate();
            
            ContentPannel.add(pago);
            Titulo.setText("Registrar pago");
            OptionPannel.add(clubes);
            
        }else if (evt.equals(clubes.NuevoClub)){
            
            SetInvisibleMenu();
            SetInvisibleContent();
            
            clubes.setVisible(true);
            nuevoclub.setVisible(true);
            
            OptionPannel.validate();
            ContentPannel.validate();
            
            ContentPannel.add(nuevoclub);
            Titulo.setText("Nuevo club");
            OptionPannel.add(clubes);
            
        }else if (evt.equals(clubes.Eliminarclub)){
            
            SetInvisibleMenu();
            SetInvisibleContent();
            
            clubes.setVisible(true);
            eliminarclub.setVisible(true);
            
            OptionPannel.validate();
            ContentPannel.validate();
            
            ContentPannel.add(eliminarclub);
            Titulo.setText("Eliminar club");
            OptionPannel.add(clubes);
            
        }else if (evt.equals(clubes.Miembros)){
            
            SetInvisibleMenu();
            SetInvisibleContent();
            
            miembros.setVisible(true);
            vacio.setVisible(true);
            
            OptionPannel.validate();
            ContentPannel.validate();
            
            ContentPannel.add(vacio);
            Titulo.setText("Registrar Miembro");
            OptionPannel.add(miembros);
            
        }else if (evt.equals(clubes.Libros)){
            
            SetInvisibleMenu();
            SetInvisibleContent();
            
            libros.setVisible(true);
            nuevolibro.setVisible(true);
            
            OptionPannel.validate();
            ContentPannel.validate();
            
            ContentPannel.add(nuevolibro);
            Titulo.setText("Registrar libro");
            OptionPannel.add(libros);
            
        }else if (evt.equals(clubes.Pagos)){
            
            SetInvisibleMenu();
            SetInvisibleContent();
            
            clubes.setVisible(true);
            pago.setVisible(true);
            
            OptionPannel.validate();
            ContentPannel.validate();
            
            ContentPannel.add(pago);
            Titulo.setText("Registrar pago");
            OptionPannel.add(clubes);
            
        }else if (evt.equals(clubes.AsociarClub)){
            
            SetInvisibleMenu();
            SetInvisibleContent();
            
            clubes.setVisible(true);
            asociarclub.setVisible(true);
            
            OptionPannel.validate();
            ContentPannel.validate();
            
            ContentPannel.add(asociarclub);
            Titulo.setText("Asociar clubes");
            OptionPannel.add(clubes);
            
        }else if (evt.equals(libros.RegistrarLibro)){
            
            SetInvisibleMenu();
            SetInvisibleContent();
            
            libros.setVisible(true);
            nuevolibro.setVisible(true);
            
            OptionPannel.validate();
            ContentPannel.validate();
            
            ContentPannel.add(nuevolibro);
            Titulo.setText("Registrar libro");
            OptionPannel.add(libros);
            
        }
    }
}