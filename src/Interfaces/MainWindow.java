package Interfaces;

import ControladorBD.BDConexion;
import ControladorBD.Scripts;

import Interfaces.Contenido.Dialogo;
import Interfaces.Menu.ClubesPannel;
import Interfaces.Menu.MainPannel;
import Interfaces.Menu.MantLibrosPannel;
import Interfaces.Menu.ObrasPannel;
import Interfaces.Menu.ReunionesPannel;
import Interfaces.Menu.MiembrosPannel;
import Interfaces.Menu.AdmClubesPannel;

import Interfaces.Contenido.EmptyPannel;
import Interfaces.Contenido.AsociarClub;
import Interfaces.Contenido.NuevoClubContent;
import Interfaces.Contenido.EliminarClub;
import Interfaces.Contenido.Pagos;
import Interfaces.Contenido.RegistrarLibro;
import Interfaces.Contenido.RegistraMiembro;
import Interfaces.Contenido.RegistraMiembro2;
import Interfaces.Contenido.RegistraMiembro3;
import Interfaces.Contenido.CambioClub;
import Interfaces.Contenido.Asistencias;
import Interfaces.Contenido.CierreReu;
import Interfaces.Contenido.ActCalendario;
import Interfaces.Contenido.NuevaObra;
import Interfaces.Contenido.CierreObra;
import Interfaces.Contenido.NuevaFunc;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

import ControladorBD.QueriesJose;
import javax.swing.JOptionPane;

public class MainWindow extends javax.swing.JFrame implements ActionListener {

    int cond = 1;
    
    QueriesJose query = new QueriesJose();
    
    Dialogo diag = new Dialogo ();
    
    BDConexion conexion = new BDConexion();
    
    Scripts ejecutar = new Scripts();

    //Menu
    MainPannel main = new MainPannel();
    ReunionesPannel reuniones = new ReunionesPannel();
    ClubesPannel clubes = new ClubesPannel();
    ObrasPannel obras = new ObrasPannel();
    MantLibrosPannel libros = new MantLibrosPannel();
    MiembrosPannel miembros = new MiembrosPannel();
    AdmClubesPannel admclub = new AdmClubesPannel();

    //Content
    ActCalendario actualizar = new ActCalendario();
    CierreReu cierre = new CierreReu();
    Asistencias asistencia = new Asistencias();
    RegistrarLibro nuevolibro = new RegistrarLibro();
    EliminarClub eliminarclub = new EliminarClub();
    NuevoClubContent nuevoclub = new NuevoClubContent();
    AsociarClub asociarclub = new AsociarClub();
    EmptyPannel vacio = new EmptyPannel();
    Pagos pago = new Pagos();
    RegistraMiembro nuevomiembro = new RegistraMiembro();
    RegistraMiembro2 nuevomiembro2 = new RegistraMiembro2();
    RegistraMiembro3 nuevomiembro3 = new RegistraMiembro3();
    CambioClub cambioclub = new CambioClub();
    NuevaObra nuevaobra = new NuevaObra();
    CierreObra cierreobra = new CierreObra();
    NuevaFunc nuevafunc = new NuevaFunc();
    

    public MainWindow() {
        
        if (conexion.getConnection() != null){
            
            initComponents();
            ejecutar.iniciarBD();

            setIconImage(new ImageIcon(getClass().getResource("../Images/LogoApp.png")).getImage());

            OptionPannel.add(main);
            ContentPannel.add(vacio);
            Atras.setVisible(false);
            
            actionlist();

        }else{
            System.exit(0);
        }
        
    }
    
    public void actionlist(){
        //action listener de botones de clubes
            clubes.Libros.addActionListener(this);
            clubes.Miembros.addActionListener(this);
            clubes.Pagos.addActionListener(this);
            clubes.Club.addActionListener(this);

            //action listener de botones admclub
            admclub.AsociarClub.addActionListener(this);
            admclub.EliminarClub.addActionListener(this);
            admclub.NuevoClub.addActionListener(this);

            //action listener de botones de reuniones manager pannel
            reuniones.Asistencias.addActionListener(this);
            reuniones.Calendario.addActionListener(this);
            reuniones.Cierre.addActionListener(this);

            //action listener de botones de option main pannel
            main.Reuniones.addActionListener(this);
            main.Clubes.addActionListener(this);
            main.Obras.addActionListener(this);

            //action listener de home button
            HomeButton.addActionListener(this);

            //action listener de libros
            libros.RegistrarLibro.addActionListener(this);

            //action listener de miembros
            miembros.RegMiemb.addActionListener(this);
            miembros.CambClub.addActionListener(this);

            //action listener de nuevo miembro
            nuevomiembro.Continuar.addActionListener(this);
            nuevomiembro2.Registrar.addActionListener(this);
            nuevomiembro3.Continuar.addActionListener(this);

            //action listener de obras
            obras.NuevaObra.addActionListener(this);
            obras.CierreObra.addActionListener(this);
            obras.Presentaciones.addActionListener(this);
            
            //cambioclub action listener
            cambioclub.Registrar.addActionListener(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OptionPannel = new javax.swing.JPanel();
        Atras = new javax.swing.JButton();
        TitlePannel = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        HomeButtonPannel = new javax.swing.JPanel();
        HomeButton = new javax.swing.JButton();
        ContentPannel = new javax.swing.JPanel();
        TitPannel = new javax.swing.JPanel();
        Nombre = new javax.swing.JLabel();
        Vacio = new javax.swing.JPanel();
        Vaci = new javax.swing.JLabel();
        ExitPannel = new javax.swing.JPanel();
        Cerrar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(102, 102, 102, 102));
        setForeground(java.awt.Color.white);
        setMaximizedBounds(new java.awt.Rectangle(900, 600, 0, 0));
        setMaximumSize(new java.awt.Dimension(1600, 900));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(900, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(900, 600));

        OptionPannel.setBackground(new java.awt.Color(51, 51, 51));
        OptionPannel.setForeground(new java.awt.Color(102, 102, 102));
        OptionPannel.setLayout(new java.awt.BorderLayout());

        Atras.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Atras.setForeground(new java.awt.Color(204, 204, 204));
        Atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BotonAtras.png"))); // NOI18N
        Atras.setText("Atras");
        Atras.setAlignmentX(2.0F);
        Atras.setBorder(null);
        Atras.setBorderPainted(false);
        Atras.setContentAreaFilled(false);
        Atras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Atras.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Atras.setFocusPainted(false);
        Atras.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Atras.setIconTextGap(10);
        Atras.setMargin(new java.awt.Insets(40, 40, 40, 40));
        Atras.setPreferredSize(new java.awt.Dimension(97, 50));
        Atras.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });
        OptionPannel.add(Atras, java.awt.BorderLayout.PAGE_END);

        TitlePannel.setBackground(new java.awt.Color(255, 255, 255));
        TitlePannel.setLayout(new java.awt.BorderLayout());

        Titulo.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(51, 51, 51));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Inicio");
        Titulo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Titulo.setPreferredSize(new java.awt.Dimension(85, 35));
        Titulo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                TituloMouseDragged(evt);
            }
        });
        Titulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TituloMousePressed(evt);
            }
        });
        TitlePannel.add(Titulo, java.awt.BorderLayout.PAGE_END);

        HomeButtonPannel.setBackground(new java.awt.Color(51, 51, 51));
        HomeButtonPannel.setPreferredSize(new java.awt.Dimension(210, 210));

        HomeButton.setBackground(new java.awt.Color(0, 0, 0));
        HomeButton.setForeground(new java.awt.Color(255, 255, 255));
        HomeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LogoApp.png"))); // NOI18N
        HomeButton.setBorder(null);
        HomeButton.setBorderPainted(false);
        HomeButton.setContentAreaFilled(false);
        HomeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HomeButton.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        HomeButton.setFocusPainted(false);
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
                .addGap(0, 0, 0)
                .addComponent(HomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        ContentPannel.setLayout(new java.awt.BorderLayout());

        TitPannel.setBackground(new java.awt.Color(51, 51, 51));
        TitPannel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        Nombre.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Nombre.setForeground(new java.awt.Color(204, 204, 204));
        Nombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconApp.png"))); // NOI18N
        Nombre.setText("Clubes de Lectura");
        Nombre.setPreferredSize(new java.awt.Dimension(122, 22));
        Nombre.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                NombreMouseDragged(evt);
            }
        });
        Nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NombreMousePressed(evt);
            }
        });

        javax.swing.GroupLayout TitPannelLayout = new javax.swing.GroupLayout(TitPannel);
        TitPannel.setLayout(TitPannelLayout);
        TitPannelLayout.setHorizontalGroup(
            TitPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(TitPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
        );
        TitPannelLayout.setVerticalGroup(
            TitPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(TitPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
        );

        Vacio.setBackground(new java.awt.Color(255, 255, 255));

        Vaci.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                VaciMouseDragged(evt);
            }
        });
        Vaci.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VaciMousePressed(evt);
            }
        });

        javax.swing.GroupLayout VacioLayout = new javax.swing.GroupLayout(Vacio);
        Vacio.setLayout(VacioLayout);
        VacioLayout.setHorizontalGroup(
            VacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Vaci, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE)
        );
        VacioLayout.setVerticalGroup(
            VacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Vaci, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ExitPannel.setBackground(new java.awt.Color(255, 255, 255));

        Cerrar.setBackground(new java.awt.Color(255, 255, 255));
        Cerrar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Cerrar.setForeground(new java.awt.Color(255, 0, 0));
        Cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cerrar.setText("X");
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CerrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ExitPannelLayout = new javax.swing.GroupLayout(ExitPannel);
        ExitPannel.setLayout(ExitPannelLayout);
        ExitPannelLayout.setHorizontalGroup(
            ExitPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ExitPannelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ExitPannelLayout.setVerticalGroup(
            ExitPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Cerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(TitPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HomeButtonPannel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                    .addComponent(OptionPannel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ContentPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TitlePannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Vacio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ExitPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TitPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ExitPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Vacio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(HomeButtonPannel, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(OptionPannel, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TitlePannel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(ContentPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5))))
        );

        setSize(new java.awt.Dimension(1000, 700));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed

        Alistar();

        main.setVisible(true);
        vacio.setVisible(true);

        OptionPannel.add(main);
        Titulo.setText("Inicio");
        ContentPannel.add(vacio);

        cond = 1;

        Atras.setVisible(false);

    }//GEN-LAST:event_HomeButtonActionPerformed

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        // TODO add your handling code here:
        Alistar();
        
        if (cond == 1) {

            main.setVisible(true);
            vacio.setVisible(true);

            OptionPannel.add(main);
            Titulo.setText("Inicio");
            ContentPannel.add(vacio);

            Atras.setVisible(false);

        } else if (cond == 2) {

            clubes.setVisible(true);
            pago.setVisible(true);

            ContentPannel.add(pago);
            Titulo.setText("Registrar pago");
            OptionPannel.add(clubes);

            cond = 1;
        }
    }//GEN-LAST:event_AtrasActionPerformed

    private void CerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseEntered
        // TODO add your handling code here:
        Cerrar.setForeground(Color.white);
        ExitPannel.setBackground(Color.red);
    }//GEN-LAST:event_CerrarMouseEntered

    private void CerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseExited
        // TODO add your handling code here:
        Cerrar.setForeground(new Color(255, 0, 0));
        ExitPannel.setBackground(Color.white);
    }//GEN-LAST:event_CerrarMouseExited

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_CerrarMouseClicked

    int xx, xy;

    private void NombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NombreMousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_NombreMousePressed

    private void NombreMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NombreMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_NombreMouseDragged

    private void VaciMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VaciMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xx, y - xy);

    }//GEN-LAST:event_VaciMouseDragged

    private void VaciMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VaciMousePressed
        // TODO add your handling code here:
        xx = evt.getX() + 193;
        xy = evt.getY();
    }//GEN-LAST:event_VaciMousePressed

    private void TituloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TituloMousePressed
        // TODO add your handling code here:
        xx = evt.getX() + 193;
        xy = evt.getY() + 25;
    }//GEN-LAST:event_TituloMousePressed

    private void TituloMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TituloMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_TituloMouseDragged

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new MainWindow().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atras;
    private javax.swing.JLabel Cerrar;
    public javax.swing.JPanel ContentPannel;
    private javax.swing.JPanel ExitPannel;
    private javax.swing.JButton HomeButton;
    private javax.swing.JPanel HomeButtonPannel;
    private javax.swing.JLabel Nombre;
    public javax.swing.JPanel OptionPannel;
    private javax.swing.JPanel TitPannel;
    private javax.swing.JPanel TitlePannel;
    public javax.swing.JLabel Titulo;
    private javax.swing.JLabel Vaci;
    private javax.swing.JPanel Vacio;
    // End of variables declaration//GEN-END:variables

    public void Alistar() {

        //Invisibles contenido
        vacio.setVisible(false);
        asociarclub.setVisible(false);
        eliminarclub.setVisible(false);
        nuevoclub.setVisible(false);
        pago.setVisible(false);
        nuevolibro.setVisible(false);
        nuevomiembro.setVisible(false);
        nuevomiembro2.setVisible(false);
        nuevomiembro3.setVisible(false);
        cambioclub.setVisible(false);
        asistencia.setVisible(false);
        cierre.setVisible(false);
        actualizar.setVisible(false);
        nuevaobra.setVisible(false);
        cierreobra.setVisible(false);
        nuevafunc.setVisible(false);

        //Invisibles menus
        main.setVisible(false);
        reuniones.setVisible(false);
        clubes.setVisible(false);
        obras.setVisible(false);
        libros.setVisible(false);
        miembros.setVisible(false);
        admclub.setVisible(false);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object evt = ae.getSource();

        if (evt.equals(main.Reuniones)) {

            Alistar();

            reuniones.setVisible(true);
            actualizar.setVisible(true);

            ContentPannel.add(actualizar);
            Titulo.setText("Actualizar calendario");
            OptionPannel.add(reuniones);

            cond = 1;

            Atras.setVisible(true);

        } else if (evt.equals(reuniones.Asistencias)) {

            Alistar();

            reuniones.setVisible(true);
            asistencia.setVisible(true);

            OptionPannel.add(reuniones);
            Titulo.setText("Registrar asistencia");
            ContentPannel.add(asistencia);

            cond = 1;

            Atras.setVisible(true);

        } else if (evt.equals(reuniones.Calendario)) {

            Alistar();

            reuniones.setVisible(true);
            actualizar.setVisible(true);

            OptionPannel.add(reuniones);
            Titulo.setText("Actualizar calendario");
            ContentPannel.add(actualizar);

            cond = 1;

            Atras.setVisible(true);

        } else if (evt.equals(reuniones.Cierre)) {

            Alistar();

            reuniones.setVisible(true);
            cierre.setVisible(true);

            OptionPannel.add(reuniones);
            Titulo.setText("Cierre de discusión");
            ContentPannel.add(cierre);

        } else if (evt.equals(main.Obras)) {

            Alistar();

            obras.setVisible(true);
            nuevaobra.setVisible(true);

            OptionPannel.add(obras);
            Titulo.setText("Nueva obra");
            ContentPannel.add(nuevaobra);

            cond = 1;

            Atras.setVisible(true);

        } else if (evt.equals(obras.NuevaObra)) {

            Alistar();

            obras.setVisible(true);
            nuevaobra.setVisible(true);

            OptionPannel.add(obras);
            Titulo.setText("Nueva obra");
            ContentPannel.add(nuevaobra);

        } else if (evt.equals(obras.CierreObra)) {

            Alistar();

            obras.setVisible(true);
            cierreobra.setVisible(true);

            OptionPannel.add(obras);
            Titulo.setText("Cierre de obra");
            ContentPannel.add(cierreobra);

        } else if (evt.equals(obras.Presentaciones)) {

            Alistar();

            obras.setVisible(true);
            nuevafunc.setVisible(true);

            OptionPannel.add(obras);
            Titulo.setText("Nueva función");
            ContentPannel.add(nuevafunc);

        } else if (evt.equals(main.Clubes)) {

            Alistar();

            clubes.setVisible(true);
            pago.setVisible(true);

            ContentPannel.add(pago);
            Titulo.setText("Registrar pago");
            OptionPannel.add(clubes);

            cond = 1;

            Atras.setVisible(true);

        } else if (evt.equals(clubes.Club)) {

            Alistar();

            admclub.setVisible(true);
            nuevoclub.setVisible(true);

            ContentPannel.add(nuevoclub);
            Titulo.setText("Nuevo club");
            OptionPannel.add(admclub);

            cond = 2;

        } else if (evt.equals(clubes.Libros)) {

            Alistar();

            libros.setVisible(true);
            nuevolibro.setVisible(true);

            ContentPannel.add(nuevolibro);
            Titulo.setText("Registrar libro");
            OptionPannel.add(libros);

            cond = 2;

        } else if (evt.equals(clubes.Miembros)) {

            Alistar();
            
            nuevomiembro.inicio();

            miembros.setVisible(true);
            nuevomiembro.setVisible(true);

            ContentPannel.add(nuevomiembro);
            Titulo.setText("Registrar miembro");
            OptionPannel.add(miembros);

            cond = 2;

        } else if (evt.equals(miembros.CambClub)) {
            
            cambioclub.inicio();
            
            Alistar();

            miembros.setVisible(true);
            cambioclub.setVisible(true);

            ContentPannel.add(cambioclub);
            Titulo.setText("Cambiar de club");
            OptionPannel.add(miembros);

        } else if (evt.equals(miembros.RegMiemb)) {
            
            Alistar();
            
            nuevomiembro.Continuar.addActionListener(this);

            miembros.setVisible(true);
            nuevomiembro.setVisible(true);

            ContentPannel.add(nuevomiembro);
            Titulo.setText("Registrar miembro");
            OptionPannel.add(miembros);

        } else if (evt.equals(nuevomiembro.Continuar)) {
            
            if (nuevomiembro.val()){
                int edad = nuevomiembro.CalcularEdad();
                if(edad <= 18 && !nuevomiembro.valrep){

                    Alistar();

                    miembros.setVisible(true);
                    nuevomiembro3.setVisible(true);

                    ContentPannel.add(nuevomiembro3);
                    Titulo.setText("Registrar representante");
                    OptionPannel.add(miembros);
                    nuevomiembro3.Cedula.setText(nuevomiembro.CedulaRep.getText());

                }else if (edad >= 19 || nuevomiembro.valrep){

                    Alistar();

                    miembros.setVisible(true);
                    nuevomiembro2.setVisible(true);

                    ContentPannel.add(nuevomiembro2);
                    OptionPannel.add(miembros);

                }
                nuevomiembro2.docid = nuevomiembro.getCedula(nuevomiembro.Cedula.getText());
                nuevomiembro.CrearMiembro();
                nuevomiembro2.inicio(nuevomiembro.club.getSelectedItem().toString());
            }

        } else if (evt.equals(nuevomiembro3.Continuar)) {
            
            if (nuevomiembro3.val()){
                
                nuevomiembro3.CrearRep();

                Alistar();

                miembros.setVisible(true);
                nuevomiembro2.setVisible(true);

                ContentPannel.add(nuevomiembro2);
                OptionPannel.add(miembros);
            }

        } else if (evt.equals(nuevomiembro2.Registrar)) {
            
            if (nuevomiembro2.val() && nuevomiembro2.ActMiembro(nuevomiembro.CalcularEdad(), 
                    nuevomiembro.getCedula(nuevomiembro.Cedula.getText()), nuevomiembro.getCedulaRep(), 
                    nuevomiembro.valrep)){
                JOptionPane.showMessageDialog(null, "El miembro:\n"+ nuevomiembro.getCedula(nuevomiembro.Cedula.getText()) +"\nha sido registrado exitosamente", "Error", JOptionPane.INFORMATION_MESSAGE);
                nuevomiembro.vaciar();
                nuevomiembro2.vaciar();
                nuevomiembro3.vaciar();
                Alistar();

                miembros.setVisible(true);
                nuevomiembro.setVisible(true);

                ContentPannel.add(nuevomiembro);
                Titulo.setText("Registrar miembro");
                OptionPannel.add(miembros);

                cond = 2;
            }

        } else if (evt.equals(clubes.Pagos)) {

            Alistar();

            clubes.setVisible(true);
            pago.setVisible(true);

            ContentPannel.add(pago);
            Titulo.setText("Registrar pago");
            OptionPannel.add(clubes);

        } else if (evt.equals(admclub.NuevoClub)) {

            Alistar();

            admclub.setVisible(true);
            nuevoclub.setVisible(true);

            ContentPannel.add(nuevoclub);
            Titulo.setText("Nuevo club");
            OptionPannel.add(admclub);

        } else if (evt.equals(admclub.EliminarClub)) {

            Alistar();

            admclub.setVisible(true);
            eliminarclub.setVisible(true);

            ContentPannel.add(eliminarclub);
            Titulo.setText("Eliminar club");
            OptionPannel.add(admclub);

        } else if (evt.equals(admclub.AsociarClub)) {

            Alistar();

            admclub.setVisible(true);
            asociarclub.setVisible(true);

            ContentPannel.add(asociarclub);
            Titulo.setText("Asociar clubes");
            OptionPannel.add(admclub);

        } else if (evt.equals(libros.RegistrarLibro)) {
            
                Alistar();

                libros.setVisible(true);
                nuevolibro.setVisible(true);

                ContentPannel.add(nuevolibro);
                Titulo.setText("Registrar libro");
                OptionPannel.add(libros);

        } else if (evt.equals(nuevolibro.Registrar)) {
            

        } else if (evt.equals(OptionPannel)) {

            Alistar();

            libros.setVisible(true);
            nuevolibro.setVisible(true);

            ContentPannel.add(nuevolibro);
            Titulo.setText("Registrar libro");
            OptionPannel.add(libros);

        }
    }
}
