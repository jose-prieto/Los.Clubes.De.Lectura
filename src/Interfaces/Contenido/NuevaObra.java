package Interfaces.Contenido;

import ControladorBD.QueriesAlberto;
import ControladorBD.QueriesJose;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

public class NuevaObra extends javax.swing.JPanel {

    ProcedimientosExtra listen = new ProcedimientosExtra();
    Dialogo diag = new Dialogo ();
    QueriesAlberto query = new QueriesAlberto();
    QueriesJose queryJ = new QueriesJose();
    int val = 1;

    public NuevaObra() {

        initComponents();

        listen.FieldListener(TitObra);
        listen.FieldListener(Costo);
        listen.FieldListener(AudiNombre);
        listen.FieldListener(Cap);
        listen.FieldListener(Personajes);
        listen.FieldListener(Descripcion);
        
        jLabel4.setVisible(false);
        AudiNombre.setVisible(false);
        Label2.setVisible(false);
        jLabel8.setVisible(false);
        Cap.setVisible(false);
        Label4.setVisible(false);
        AudClub.setVisible(false);
        jLabel10.setVisible(false);
        Personajes.setVisible(false);
        Agregar.setVisible(false);
        Label5.setVisible(false);
        jLabel11.setVisible(false);
        Descripcion.setVisible(false);
        Label6.setVisible(false);
        
        ResultSet res = queryJ.libros();

        if (res != null){
            try {
                do{
                    libro.addItem(res.getString(1));
                }while (res.next());
            } catch (SQLException ex) {
                Logger.getLogger(RegistraMiembro2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        res = queryJ.auditorios() ;
        
        audi.addItem("Auditorios disponibles");
        if (res != null){
            try {
                do{
                    audi.addItem(res.getString(1));
                }while (res.next());
            } catch (SQLException ex) {
                Logger.getLogger(RegistraMiembro2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        res = queryJ.clubes();
        
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TitObra = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Costo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Continuar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Label1 = new javax.swing.JLabel();
        Label3 = new javax.swing.JLabel();
        hora = new javax.swing.JSpinner();
        libro = new javax.swing.JComboBox<>();
        audi = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        club = new javax.swing.JComboBox<>();
        NuevoAuditorio = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        AudiNombre = new javax.swing.JTextField();
        Label2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Cap = new javax.swing.JTextField();
        Label4 = new javax.swing.JLabel();
        AudClub = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        Personajes = new javax.swing.JTextField();
        Agregar = new javax.swing.JButton();
        Label5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Descripcion = new javax.swing.JTextField();
        Label6 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(707, 541));
        setMinimumSize(new java.awt.Dimension(707, 541));
        setPreferredSize(new java.awt.Dimension(707, 541));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Título");

        TitObra.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        TitObra.setForeground(new java.awt.Color(204, 204, 255));
        TitObra.setText("Ej. La gran tragedia");
        TitObra.setBorder(new javax.swing.border.LineBorder(java.awt.Color.gray, 1, true));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Libro referencia");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Auditorio");

        Costo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Costo.setForeground(new java.awt.Color(204, 204, 255));
        Costo.setText("ej. 15000");
        Costo.setToolTipText("");
        Costo.setBorder(new javax.swing.border.LineBorder(java.awt.Color.gray, 1, true));
        Costo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CostoKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Duración en horas");

        Continuar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Continuar.setText("Continuar ");
        Continuar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContinuarMouseClicked(evt);
            }
        });
        Continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinuarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Costo de la entrada");

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

        hora.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        hora.setModel(new javax.swing.SpinnerListModel(new String[] {"1 hora", "2 horas", "3 horas", "4 horas", "5 horas", "6 horas", "7 horas", "8 horas", "9 horas"}));

        libro.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        libro.setForeground(new java.awt.Color(51, 51, 51));

        audi.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        audi.setForeground(new java.awt.Color(51, 51, 51));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Club");

        club.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        club.setForeground(new java.awt.Color(51, 51, 51));
        club.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                clubItemStateChanged(evt);
            }
        });

        NuevoAuditorio.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        NuevoAuditorio.setForeground(new java.awt.Color(51, 51, 51));
        NuevoAuditorio.setText("Nuevo auditorio");
        NuevoAuditorio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                NuevoAuditorioItemStateChanged(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Nombre del auditorio");

        AudiNombre.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        AudiNombre.setForeground(new java.awt.Color(204, 204, 255));
        AudiNombre.setText("Ej. Teresa Carreño");
        AudiNombre.setBorder(new javax.swing.border.LineBorder(java.awt.Color.gray, 1, true));

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

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Capacidad del auditorio");

        Cap.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Cap.setForeground(new java.awt.Color(204, 204, 255));
        Cap.setText("Ej. 20000");
        Cap.setBorder(new javax.swing.border.LineBorder(java.awt.Color.gray, 1, true));
        Cap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CapKeyTyped(evt);
            }
        });

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

        AudClub.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        AudClub.setForeground(new java.awt.Color(51, 51, 51));
        AudClub.setText("Este auditorio pertenece al club en cuestión");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Personaje");

        Personajes.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Personajes.setForeground(new java.awt.Color(204, 204, 255));
        Personajes.setText("Ej. Caperucita roja");
        Personajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PersonajesActionPerformed(evt);
            }
        });

        Agregar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Agregar.setText("Agregar");
        Agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgregarMouseClicked(evt);
            }
        });
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
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

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Descripción");

        Descripcion.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Descripcion.setForeground(new java.awt.Color(204, 204, 255));
        Descripcion.setText("Breve descripción del personaje");
        Descripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescripcionActionPerformed(evt);
            }
        });

        Label6.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        Label6.setForeground(new java.awt.Color(255, 0, 0));
        Label6.setText("(*)");
        Label6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Label6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Label6MouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(NuevoAuditorio)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(libro, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TitObra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(club, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(audi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(Costo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label3)
                            .addComponent(Label1)))
                    .addComponent(AudClub)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addComponent(Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Label6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(33, 33, 33)
                                        .addComponent(Personajes, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Label5)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Continuar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(AudiNombre)
                                    .addComponent(Cap, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label2)
                            .addComponent(Label4))))
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TitObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(libro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(Label1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(club, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(audi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(NuevoAuditorio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AudiNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label4))))
                .addGap(18, 18, 18)
                .addComponent(AudClub)
                .addGap(1, 1, 1)
                .addComponent(Continuar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(Personajes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label5))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label6))))
                .addContainerGap(121, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
/*ResultSet rs, rs2;
Miembros.removeAllItems();
int clubid = queryJ.clubid(club.getSelectedItem().toString());

try {
    rs2 = queryJ.miemGrupo(clubid);
    if (rs2 == null){
        //aqui debes eliminar la obra porque el club no tiene miembros
    }else{

        try {
            do{
                Miembros.addItem(queryJ.ciToNom(rs2.getInt(1)));
            }while (rs2.next());
        } catch (SQLException ex) {
            Logger.getLogger(RegistraMiembro2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    } catch (Exception ex) {
        Logger.getLogger(RegistraMiembro2.class.getName()).log(Level.SEVERE, null, ex);
    }

try {
    rs = queryJ.clubHijo(queryJ.clubid(club.getSelectedItem().toString()));
        if (rs != null){
            do{
                rs2 = queryJ.miemClub(rs.getInt(1));
                if (rs2 != null){
                    try {
                        do{
                            Miembros.addItem(queryJ.ciToNom(rs2.getInt(1)));
                        }while (rs2.next());
                    } catch (SQLException ex) {
                        Logger.getLogger(RegistraMiembro2.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }while (rs.next());
        }
} catch (Exception ex) {
    Logger.getLogger(RegistraMiembro2.class.getName()).log(Level.SEVERE, null, ex);
}*/
    private void ContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinuarActionPerformed
        
        if(val() == true) {
            mostrar();
            val = 0;
        }
        
    }//GEN-LAST:event_ContinuarActionPerformed

    public boolean val(){
                boolean val = true;
        if (TitObra.getText().equals("Ej. La gran tragedia")) {
            TitObra.setBorder(new LineBorder(Color.red));
            val = false;
        } else {
            TitObra.setBorder(new LineBorder(Color.gray));
        }
        if (Costo.getText().equals("ej. 15000")) {
            Costo.setBorder(new LineBorder(Color.red));
            val = false;
        } else {
            Costo.setBorder(new LineBorder(Color.gray));
        }
        if (val == false) {
            JOptionPane.showMessageDialog(null, "Debe rellenar todos los campos que son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }else{
        if((audi.getItemAt(0)==null) && (NuevoAuditorio.isSelected()==false)){
                JOptionPane.showMessageDialog(null, "Por favor agregue un nuevo auditorio.", "Error", JOptionPane.ERROR_MESSAGE);  
                return false;
        }else if((NuevoAuditorio.isSelected()==true)){
                  if (AudiNombre.getText().equals("Ej. Teresa Carreño")) {
                  AudiNombre.setBorder(new LineBorder(Color.red));
                  val = false;
                    } else {
                       AudiNombre.setBorder(new LineBorder(Color.gray));
                        }
                  if (Cap.getText().equals("Ej. 20000")) {
                  Cap.setBorder(new LineBorder(Color.red));
                  val = false;
                    } else {
                       Cap.setBorder(new LineBorder(Color.gray));
                        }
                  if (val == false) {
                   JOptionPane.showMessageDialog(null, "Debe rellenar todos los campos que son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
                    return false;
                  }else if ((AudClub.isSelected()==true)){
                   query.CrearAuditorio(Integer.parseInt(Cap.getText()), AudiNombre.getText(), query.BuscarCiudad2(club.getSelectedItem().toString()), query.BuscarClub(club.getSelectedItem().toString()));
                    }else{
                   query.CrearAuditorio(Integer.parseInt(Cap.getText()), AudiNombre.getText(), query.BuscarCiudad2(club.getSelectedItem().toString()),0);
               }
               query.CrearObra(duracion(),"inactiva", TitObra.getText(), Integer.parseInt(Costo.getText()));
               query.lib_obra(query.BuscarIsbn(libro.getSelectedItem().toString()));
               query.club_obra(query.BuscarClub(club.getSelectedItem().toString()));
               TitObra.setText("");
               Costo.setText("");
               AudiNombre.setText("");
               Cap.setText("");
                  }
        else if((audi.getItemAt(0)!=null) && (NuevoAuditorio.isSelected()==false)){
               query.CrearObra2(duracion(),"inactiva", TitObra.getText(), Integer.parseInt(Costo.getText()),query.BuscarAudi(audi.getSelectedItem().toString()));
               query.lib_obra(query.BuscarIsbn(libro.getSelectedItem().toString()));
               query.club_obra(query.BuscarClub(club.getSelectedItem().toString()));
               TitObra.setText("");
               Costo.setText("");
                           }
        return true;
        
        }
    }
    
    public boolean val2(){
        boolean val = true;
        if (Personajes.getText().equals("Ej. Caperucita roja")){
            Personajes.setBorder(new LineBorder(Color.red));
            val = false;
        }else{
            Personajes.setBorder(new LineBorder(Color.gray));
        }
        if (Descripcion.getText().equals("Breve descripción del personaje")){
            Descripcion.setBorder(new LineBorder(Color.red));
            val = false;
        }else{
            Descripcion.setBorder(new LineBorder(Color.gray));
        }
        if (!val){
            JOptionPane.showMessageDialog(null, "Debe rellenar todos los campos que son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return val;
    }
    
    public void mostrar(){
        jLabel10.setVisible(true);
        Personajes.setVisible(true);
        Agregar.setVisible(true);
        Label5.setVisible(true);
        Label6.setVisible(true);
        jLabel11.setVisible(true);
        Descripcion.setVisible(true);
    }
    
    private void Label1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label1MouseEntered
        // TODO add your handling code here:
        diag.posicion(Label1.getLocationOnScreen().x-29, Label1.getLocationOnScreen().y+15);
        diag.setVisible(true);
    }//GEN-LAST:event_Label1MouseEntered

    private void Label1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label1MouseExited
        // TODO add your handling code here:
        diag.setVisible(false);
    }//GEN-LAST:event_Label1MouseExited

    private void Label3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label3MouseEntered
        // TODO add your handling code here:
        diag.posicion(Label3.getLocationOnScreen().x-29, Label3.getLocationOnScreen().y+15);
        diag.setVisible(true);
    }//GEN-LAST:event_Label3MouseEntered

    private void Label3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label3MouseExited
        // TODO add your handling code here:
        diag.setVisible(false);
    }//GEN-LAST:event_Label3MouseExited

    private void ContinuarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContinuarMouseClicked
        // TODO add your handling code here:
      /*  if (TitObra.getText().equals("Ej. La gran tragedia")) {
            TitObra.setBorder(new LineBorder(Color.red));
        } else {
            TitObra.setBorder(new LineBorder(Color.gray));
        }
        if (Costo.getText().equals("ej. 15000")) {
            Costo.setBorder(new LineBorder(Color.red));
        } else {
            Costo.setBorder(new LineBorder(Color.gray));
        }
        if (Resumen.getText().equals("Aquí se debe especificar el resumen del argumento de la obra en cuestión.")) {
            Resumen.setBorder(new LineBorder(Color.red));
        } else {
            Resumen.setBorder(new LineBorder(Color.gray));
        }
        
           if(audi.getSelectedIndex()!=0){
               query.CrearObra(duracion(),"inactiva", TitObra.getText(), Integer.parseInt(Costo.getText()), audi.getSelectedIndex());
               query.lib_obra(query.BuscarIsbn(libro.getSelectedItem().toString()));
               query.club_obra(club.getSelectedIndex()+1);
                 }*/
    }//GEN-LAST:event_ContinuarMouseClicked


  
public int duracion(){
       String cadena = hora.getValue().toString();
       int h = (int)(cadena.charAt(0));
       return h-48;
}
    
    private void CostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CostoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if (c < '0' || c > '9' || Costo.getText().length() > 4){
            evt.consume();
        }
    }//GEN-LAST:event_CostoKeyTyped

    private void Label2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label2MouseEntered
        // TODO add your handling code here:
        diag.posicion(Label2.getLocationOnScreen().x-29, Label2.getLocationOnScreen().y+15);
        diag.setVisible(true);
    }//GEN-LAST:event_Label2MouseEntered

    private void Label2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label2MouseExited
        // TODO add your handling code here:
        diag.setVisible(false);
    }//GEN-LAST:event_Label2MouseExited

    private void Label4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label4MouseEntered
        // TODO add your handling code here:
        diag.posicion(Label4.getLocationOnScreen().x-29, Label4.getLocationOnScreen().y+15);
        diag.setVisible(true);
    }//GEN-LAST:event_Label4MouseEntered

    private void Label4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label4MouseExited
        // TODO add your handling code here:
        diag.setVisible(false);
    }//GEN-LAST:event_Label4MouseExited

    private void CapKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CapKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if (c < '0' || c > '9' || Cap.getText().length() > 4){
            evt.consume();
        }
    }//GEN-LAST:event_CapKeyTyped

    private void NuevoAuditorioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_NuevoAuditorioItemStateChanged
        // TODO add your handling code here:
        if (NuevoAuditorio.isSelected()){
            jLabel4.setVisible(true);
            AudiNombre.setVisible(true);
            Label2.setVisible(true);
            jLabel8.setVisible(true);
            Cap.setVisible(true);
            Label4.setVisible(true);
            AudClub.setVisible(true);
        }else{
            jLabel4.setVisible(false);
            AudiNombre.setVisible(false);
            Label2.setVisible(false);
            jLabel8.setVisible(false);
            Cap.setVisible(false);
            Label4.setVisible(false);
            AudClub.setVisible(false);
        }
    }//GEN-LAST:event_NuevoAuditorioItemStateChanged

    private void clubItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_clubItemStateChanged
        // TODO add your handling code here:
        ResultSet res = queryJ.auditorios2(club.getSelectedItem().toString());
        audi.removeAllItems();
        if (res != null){
            try {
                do{
                    audi.addItem(res.getString(1));
                }while (res.next());
            } catch (SQLException ex) {
                Logger.getLogger(RegistraMiembro2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_clubItemStateChanged

    private void PersonajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PersonajesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PersonajesActionPerformed

    private void AgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_AgregarMouseClicked

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        // TODO add your handling code here:
        if (val2() && queryJ.addPersonaje(Personajes.getText(), Descripcion.getText())){
            JOptionPane.showMessageDialog(null, "Personaje agregado correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
            val = 1;
        }
        
    }//GEN-LAST:event_AgregarActionPerformed

    private void Label5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label5MouseEntered
        // TODO add your handling code here:
        diag.posicion(Label5.getLocationOnScreen().x-29, Label5.getLocationOnScreen().y+15);
        diag.setVisible(true);
    }//GEN-LAST:event_Label5MouseEntered

    private void Label5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label5MouseExited
        // TODO add your handling code here:
        diag.setVisible(false);
    }//GEN-LAST:event_Label5MouseExited

    private void DescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DescripcionActionPerformed

    private void Label6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label6MouseEntered
        // TODO add your handling code here:
        diag.posicion(Label6.getLocationOnScreen().x-29, Label6.getLocationOnScreen().y+15);
        diag.setVisible(true);
    }//GEN-LAST:event_Label6MouseEntered

    private void Label6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label6MouseExited
        // TODO add your handling code here:
        diag.setVisible(false);
    }//GEN-LAST:event_Label6MouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Agregar;
    private javax.swing.JCheckBox AudClub;
    private javax.swing.JTextField AudiNombre;
    private javax.swing.JTextField Cap;
    public javax.swing.JButton Continuar;
    private javax.swing.JTextField Costo;
    private javax.swing.JTextField Descripcion;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private javax.swing.JLabel Label3;
    private javax.swing.JLabel Label4;
    private javax.swing.JLabel Label5;
    private javax.swing.JLabel Label6;
    private javax.swing.JCheckBox NuevoAuditorio;
    private javax.swing.JTextField Personajes;
    private javax.swing.JTextField TitObra;
    private javax.swing.JComboBox<String> audi;
    private javax.swing.JComboBox<String> club;
    private javax.swing.JSpinner hora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JComboBox<String> libro;
    // End of variables declaration//GEN-END:variables
}
