package Interfaces.Contenido;

import ControladorBD.QueriesAlberto;
import ControladorBD.QueriesJose;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.LineBorder;

public class NuevoClubContent extends javax.swing.JPanel {

    ProcedimientosExtra listen = new ProcedimientosExtra();
    Dialogo diag = new Dialogo ();
    QueriesAlberto query = new QueriesAlberto();
    QueriesJose queryJ = new QueriesJose();

    public NuevoClubContent() {

        initComponents();
        ResultSet res;

        listen.FieldListener(NombreClub);
        listen.FieldListener(CiudadClub);
        listen.FieldListener(PostalClub);
        listen.FieldListener(Dir1Club);
        listen.FieldListener(Dir2Club);
        listen.FieldListener(InstClub);        
        
        res = queryJ.idiomas();
        if (res != null){
            try {
                do{
                    comoIdioma.addItem(res.getString(1));
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
        NombreClub = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CiudadClub = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        PostalClub = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        InstClub = new javax.swing.JTextField();
        Registrar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Dir1Club = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Dir2Club = new javax.swing.JTextField();
        Label1 = new javax.swing.JLabel();
        Label2 = new javax.swing.JLabel();
        Label4 = new javax.swing.JLabel();
        Label5 = new javax.swing.JLabel();
        Label7 = new javax.swing.JLabel();
        Label6 = new javax.swing.JLabel();
        Pais = new javax.swing.JComboBox<>();
        comoIdioma = new javax.swing.JComboBox<>();

        setMaximumSize(new java.awt.Dimension(707, 541));
        setMinimumSize(new java.awt.Dimension(707, 541));
        setPreferredSize(new java.awt.Dimension(707, 541));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Nombre del club");

        NombreClub.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        NombreClub.setForeground(new java.awt.Color(204, 204, 255));
        NombreClub.setText("Ej. Club de estudios científicos");
        NombreClub.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        NombreClub.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NombreClubKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("País");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Ciudad");

        CiudadClub.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CiudadClub.setForeground(new java.awt.Color(204, 204, 255));
        CiudadClub.setText("Ej. Districo Capital");
        CiudadClub.setToolTipText("");
        CiudadClub.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Idioma");

        PostalClub.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        PostalClub.setForeground(new java.awt.Color(204, 204, 255));
        PostalClub.setText("Ej. 1020");
        PostalClub.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        PostalClub.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PostalClubKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Zona postal");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Institución asociada");

        InstClub.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        InstClub.setForeground(new java.awt.Color(204, 204, 255));
        InstClub.setText("Ej. Universidad Católica Andrés Bello");
        InstClub.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        InstClub.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                InstClubKeyTyped(evt);
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

        Dir1Club.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Dir1Club.setForeground(new java.awt.Color(204, 204, 255));
        Dir1Club.setText("Ej. Montalbán II, calle 5");
        Dir1Club.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        Dir1Club.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Dir1ClubKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Dirección");

        Dir2Club.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Dir2Club.setForeground(new java.awt.Color(204, 204, 255));
        Dir2Club.setText("Ej. Edf. \"Yaracuy\", piso 5, Apt. 2B");
        Dir2Club.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));

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

        Label7.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        Label7.setForeground(new java.awt.Color(255, 0, 0));
        Label7.setText("(*)");
        Label7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Label7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Label7MouseExited(evt);
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

        Pais.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Pais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Afganistán", "Albania", "Alemania", "Andorra", "Angola", "Antigua y Barbuda", "Arabia Saudita", "Argelia", "Argentina", "Armenia", "Australia", "Austria", "Azerbaiyán", "Bahamas", "Bangladés", "Barbados", "Baréin", "Bélgica", "Belice", "Benín", "Bielorrusia", "Birmania", "Bolivia", "Bosnia y Herzegovina", "Botsuana", "Brasil", "Brunéi", "Bulgaria", "Burkina Faso", "Burundi", "Bután", "Cabo Verde", "Camboya", "Camerún", "Canadá", "Catar", "Chad", "Chile", "China", "Chipre", "Ciudad del Vaticano", "Colombia", "Comoras", "Corea del Norte", "Corea del Sur", "Costa de Marfil", "Costa Rica", "Croacia", "Cuba", "Dinamarca", "Dominica", "Ecuador", "Egipto", "El Salvador", "Emiratos Árabes Unidos", "Eritrea", "Eslovaquia", "Eslovenia", "España", "Estados Unidos", "Estonia", "Etiopía", "Filipinas", "Finlandia", "Fiyi", "Francia", "Gabón", "Gambia", "Georgia", "Ghana", "Granada", "Grecia", "Guatemala", "Guyana", "Guinea", "Guinea ecuatorial", "Guinea-Bisáu", "Haití", "Honduras", "Hungría", "India", "Indonesia", "Irak", "Irán", "Irlanda", "Islandia", "Islas Marshall", "Islas Salomón", "Israel", "Italia", "Jamaica", "Japón", "Jordania", "Kazajistán", "Kenia", "Kirguistán", "Kiribati", "Kuwait", "Laos", "Lesoto", "Letonia", "Líbano", "Liberia", "Libia", "Liechtenstein", "Lituania", "Luxemburgo", "Macedonia del Norte", "Madagascar", "Malasia", "Malaui", "Maldivas", "Malí", "Malta", "Marruecos", "Mauricio", "Mauritania", "México", "Micronesia", "Moldavia", "Mónaco", "Mongolia", "Montenegro", "Mozambique", "Namibia", "Nauru", "Nepal", "Nicaragua", "Níger", "Nigeria", "Noruega", "Nueva Zelanda", "Omán", "Países Bajos", "Pakistán", "Palaos", "Panamá", "Papúa Nueva Guinea", "Paraguay", "Perú", "Polonia", "Portugal", "Reino Unido", "República Centroafricana", "República Checa", "República del Congo", "República Democrática del Congo", "República Dominicana", "República Sudafricana", "Ruanda", "Rumanía", "Rusia", "Samoa", "San Cristóbal y Nieves", "San Marino", "San Vicente y las Granadinas", "Santa Lucía", "Santo Tomé y Príncipe", "Senegal", "Serbia", "Seychelles", "Sierra Leona", "Singapur", "Siria", "Somalia", "Sri Lanka", "Suazilandia", "Sudán", "Sudán del Sur", "Suecia", "Suiza", "Surinam", "Tailandia", "Tanzania", "Tayikistán", "Timor Oriental", "Togo", "Tonga", "Trinidad y Tobago", "Túnez", "Turkmenistán", "Turquía", "Tuvalu", "Ucrania", "Uganda", "Uruguay", "Uzbekistán", "Vanuatu", "Venezuela", "Vietnam", "Yemen", "Yibuti", "Zambia", "Zimbabue" }));

        comoIdioma.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Dir2Club)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(PostalClub, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(7, 7, 7)
                                        .addComponent(Label6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4)
                                        .addGap(12, 12, 12)
                                        .addComponent(comoIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addGap(90, 90, 90))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(73, 73, 73)))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CiudadClub)
                                    .addComponent(Dir1Club)
                                    .addComponent(NombreClub)
                                    .addComponent(Pais, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label1)
                            .addComponent(Label2)
                            .addComponent(Label4)
                            .addComponent(Label5)
                            .addComponent(Label7))
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(InstClub)
                        .addGap(3, 3, 3))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(NombreClub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Label2)
                    .addComponent(Pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CiudadClub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(Label4))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Dir1Club, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(Label5))
                .addGap(18, 18, 18)
                .addComponent(Dir2Club, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PostalClub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(Label7)
                    .addComponent(Label6)
                    .addComponent(comoIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(InstClub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(116, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        // TODO add your handling code here:
        if (NombreClub.getText().equals("Ej. Club de estudios científicos")) {
            NombreClub.setBorder(new LineBorder(Color.red));
        } else {
            NombreClub.setBorder(new LineBorder(Color.gray));
        }
        /*if (PaisClub.getText().equals("Ej. Venezuela")) {
            PaisClub.setBorder(new LineBorder(Color.red));
        } else {
            PaisClub.setBorder(new LineBorder(Color.gray));
        }
        if (NacionClub.getText().equals("Ej. Venezolana")) {
            NacionClub.setBorder(new LineBorder(Color.red));
        } else {
            NacionClub.setBorder(new LineBorder(Color.gray));
        }
        if (IdiomaClub.getText().equals("Ej. Español")) {
            IdiomaClub.setBorder(new LineBorder(Color.red));
        } else {
            IdiomaClub.setBorder(new LineBorder(Color.gray));
        }*/
        if (CiudadClub.getText().equals("Ej. Districo Capital")) {
            CiudadClub.setBorder(new LineBorder(Color.red));
        } else {
            CiudadClub.setBorder(new LineBorder(Color.gray));
        }
        if (Dir1Club.getText().equals("Ej. Montalbán II, calle 5")) {
            Dir1Club.setBorder(new LineBorder(Color.red));
        } else {
            Dir1Club.setBorder(new LineBorder(Color.gray));
        }
        if (PostalClub.getText().equals("Ej. 1020")) {
            PostalClub.setBorder(new LineBorder(Color.red));
        } else {
            PostalClub.setBorder(new LineBorder(Color.gray));
        }
        if (InstClub.getText().equals("Ej. Universidad Católica Andrés Bello")) {
            InstClub.setBorder(new LineBorder(Color.red));
        } else {
            InstClub.setBorder(new LineBorder(Color.gray));
        }
        query.CrearClub(NombreClub.getText(), Dir1Club.getText(), Integer.parseInt(PostalClub.getText()), true, 1, Integer.parseInt(CiudadClub.getText()));
    }//GEN-LAST:event_RegistrarActionPerformed

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

    private void Label4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label4MouseEntered
        // TODO add your handling code here:
        diag.posicion(Label4.getLocationOnScreen().x-29, Label4.getLocationOnScreen().y+15);
        diag.setVisible(true);
    }//GEN-LAST:event_Label4MouseEntered

    private void Label4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label4MouseExited
        // TODO add your handling code here:
        diag.setVisible(false);
    }//GEN-LAST:event_Label4MouseExited

    private void Label5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label5MouseEntered
        // TODO add your handling code here:
        diag.posicion(Label5.getLocationOnScreen().x-29, Label5.getLocationOnScreen().y+15);
        diag.setVisible(true);
    }//GEN-LAST:event_Label5MouseEntered

    private void Label5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label5MouseExited
        // TODO add your handling code here:
        diag.setVisible(false);
    }//GEN-LAST:event_Label5MouseExited

    private void Label6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label6MouseEntered
        // TODO add your handling code here:
        diag.posicion(Label6.getLocationOnScreen().x-29, Label6.getLocationOnScreen().y+15);
        diag.setVisible(true);
    }//GEN-LAST:event_Label6MouseEntered

    private void Label6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label6MouseExited
        // TODO add your handling code here:
        diag.setVisible(false);
    }//GEN-LAST:event_Label6MouseExited

    private void Label7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label7MouseEntered
        // TODO add your handling code here:
        diag.posicion(Label7.getLocationOnScreen().x-29, Label7.getLocationOnScreen().y+15);
        diag.setVisible(true);
    }//GEN-LAST:event_Label7MouseEntered

    private void Label7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label7MouseExited
        // TODO add your handling code here:
        diag.setVisible(false);
    }//GEN-LAST:event_Label7MouseExited

    private void NombreClubKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreClubKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreClubKeyTyped

    private void Dir1ClubKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Dir1ClubKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Dir1ClubKeyTyped

    private void PostalClubKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PostalClubKeyTyped
        // TODO add your handling code here:
             char c = evt.getKeyChar();
        
        if (c < '0' || c > '9' || PostalClub.getText().length() > 9){
            evt.consume();
        }
    }//GEN-LAST:event_PostalClubKeyTyped

    private void InstClubKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InstClubKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_InstClubKeyTyped

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CiudadClub;
    private javax.swing.JTextField Dir1Club;
    private javax.swing.JTextField Dir2Club;
    private javax.swing.JTextField InstClub;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private javax.swing.JLabel Label4;
    private javax.swing.JLabel Label5;
    private javax.swing.JLabel Label6;
    private javax.swing.JLabel Label7;
    private javax.swing.JTextField NombreClub;
    private javax.swing.JComboBox<String> Pais;
    private javax.swing.JTextField PostalClub;
    private javax.swing.JButton Registrar;
    private javax.swing.JComboBox<String> comoIdioma;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
