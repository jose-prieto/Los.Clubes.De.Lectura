package Interfaces.Contenido;

import java.awt.Color;
import javax.swing.border.LineBorder;

public class NuevoClubContent extends javax.swing.JPanel {

    AsociarClub st = new AsociarClub();
    ProcedimientosExtra listen = new ProcedimientosExtra();

    public NuevoClubContent() {

        initComponents();

        listen.FieldListener(NombreClub);
        listen.FieldListener(CiudadClub);
        listen.FieldListener(PaisClub);
        listen.FieldListener(PostalClub);
        listen.FieldListener(Dir1Club);
        listen.FieldListener(Dir2Club);
        listen.FieldListener(MonedaClub);
        listen.FieldListener(NacionClub);
        listen.FieldListener(IdiomaClub);
        listen.FieldListener(InstClub);

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
        PaisClub = new javax.swing.JTextField();
        PostalClub = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        MonedaClub = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        NacionClub = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        IdiomaClub = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        InstClub = new javax.swing.JTextField();
        Registrar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Dir1Club = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Dir2Club = new javax.swing.JTextField();
        Label1 = new javax.swing.JLabel();
        Label2 = new javax.swing.JLabel();
        Label3 = new javax.swing.JLabel();
        Label4 = new javax.swing.JLabel();
        Label5 = new javax.swing.JLabel();
        Label7 = new javax.swing.JLabel();
        Label6 = new javax.swing.JLabel();
        Label8 = new javax.swing.JLabel();

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

        PaisClub.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        PaisClub.setForeground(new java.awt.Color(204, 204, 255));
        PaisClub.setText("Ej. Venezuela");
        PaisClub.setToolTipText("");
        PaisClub.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));

        PostalClub.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        PostalClub.setForeground(new java.awt.Color(204, 204, 255));
        PostalClub.setText("Ej. 1020");
        PostalClub.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Zona postal");

        MonedaClub.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        MonedaClub.setForeground(new java.awt.Color(204, 204, 255));
        MonedaClub.setText("Ej. Bolívar");
        MonedaClub.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Institución asociada");

        NacionClub.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        NacionClub.setForeground(new java.awt.Color(204, 204, 255));
        NacionClub.setText("Ej. Venezolana");
        NacionClub.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Nacionalidad");

        IdiomaClub.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        IdiomaClub.setForeground(new java.awt.Color(204, 204, 255));
        IdiomaClub.setText("Ej. Español");
        IdiomaClub.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Moneda");

        InstClub.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        InstClub.setForeground(new java.awt.Color(204, 204, 255));
        InstClub.setText("Ej. Universidad Católica Andrés Bello");
        InstClub.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));

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

        Label8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        Label8.setForeground(new java.awt.Color(255, 0, 0));
        Label8.setText("(*)");
        Label8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Label8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Label8MouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel6))
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Dir2Club)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(PostalClub, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                            .addComponent(MonedaClub))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Label6)
                                            .addComponent(Label8))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4)
                                        .addGap(21, 21, 21)
                                        .addComponent(IdiomaClub, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(16, 16, 16)
                                .addComponent(InstClub))
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
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel3))
                                        .addGap(44, 44, 44))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(73, 73, 73)))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CiudadClub)
                                    .addComponent(Dir1Club)
                                    .addComponent(NacionClub)
                                    .addComponent(PaisClub)
                                    .addComponent(NombreClub))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label1)
                            .addComponent(Label2)
                            .addComponent(Label3)
                            .addComponent(Label4)
                            .addComponent(Label5)
                            .addComponent(Label7)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(500, 500, 500)))
                .addGap(32, 32, 32))
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
                    .addComponent(PaisClub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NacionClub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(Label3))
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
                    .addComponent(IdiomaClub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label7)
                    .addComponent(Label6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MonedaClub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(Label8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(InstClub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        // TODO add your handling code here:
        if (NombreClub.getText().equals("Ej. Club de estudios científicos")) {
            NombreClub.setBorder(new LineBorder(Color.red));
        } else {
            NombreClub.setBorder(new LineBorder(Color.gray));
        }
        if (PaisClub.getText().equals("Ej. Venezuela")) {
            PaisClub.setBorder(new LineBorder(Color.red));
        } else {
            PaisClub.setBorder(new LineBorder(Color.gray));
        }
        if (NacionClub.getText().equals("Ej. Venezolana")) {
            NacionClub.setBorder(new LineBorder(Color.red));
        } else {
            NacionClub.setBorder(new LineBorder(Color.gray));
        }
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
        if (IdiomaClub.getText().equals("Ej. Español")) {
            IdiomaClub.setBorder(new LineBorder(Color.red));
        } else {
            IdiomaClub.setBorder(new LineBorder(Color.gray));
        }
        if (MonedaClub.getText().equals("Ej. Bolívar")) {
            MonedaClub.setBorder(new LineBorder(Color.red));
        } else {
            MonedaClub.setBorder(new LineBorder(Color.gray));
        }
        if (InstClub.getText().equals("Ej. Universidad Católica Andrés Bello")) {
            InstClub.setBorder(new LineBorder(Color.red));
        } else {
            InstClub.setBorder(new LineBorder(Color.gray));
        }
    }//GEN-LAST:event_RegistrarActionPerformed

    private void Label1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label1MouseEntered
        // TODO add your handling code here:
        Label1.setText(st.pop);
    }//GEN-LAST:event_Label1MouseEntered

    private void Label1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label1MouseExited
        // TODO add your handling code here:
        Label1.setText(st.calm);
    }//GEN-LAST:event_Label1MouseExited

    private void Label2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label2MouseEntered
        // TODO add your handling code here:
        Label2.setText(st.pop);
    }//GEN-LAST:event_Label2MouseEntered

    private void Label2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label2MouseExited
        // TODO add your handling code here:
        Label2.setText(st.calm);
    }//GEN-LAST:event_Label2MouseExited

    private void Label3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label3MouseEntered
        // TODO add your handling code here:
        Label3.setText(st.pop);
    }//GEN-LAST:event_Label3MouseEntered

    private void Label3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label3MouseExited
        // TODO add your handling code here:
        Label3.setText(st.calm);
    }//GEN-LAST:event_Label3MouseExited

    private void Label4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label4MouseEntered
        // TODO add your handling code here:
        Label4.setText(st.pop);
    }//GEN-LAST:event_Label4MouseEntered

    private void Label4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label4MouseExited
        // TODO add your handling code here:
        Label4.setText(st.calm);
    }//GEN-LAST:event_Label4MouseExited

    private void Label5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label5MouseEntered
        // TODO add your handling code here:
        Label5.setText(st.pop);
    }//GEN-LAST:event_Label5MouseEntered

    private void Label5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label5MouseExited
        // TODO add your handling code here:
        Label5.setText(st.calm);
    }//GEN-LAST:event_Label5MouseExited

    private void Label6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label6MouseEntered
        // TODO add your handling code here:
        Label6.setText(st.pop);
    }//GEN-LAST:event_Label6MouseEntered

    private void Label6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label6MouseExited
        // TODO add your handling code here:
        Label6.setText(st.calm);
    }//GEN-LAST:event_Label6MouseExited

    private void Label7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label7MouseEntered
        // TODO add your handling code here:
        Label7.setText(st.pop);
    }//GEN-LAST:event_Label7MouseEntered

    private void Label7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label7MouseExited
        // TODO add your handling code here:
        Label7.setText(st.calm);
    }//GEN-LAST:event_Label7MouseExited

    private void Label8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label8MouseEntered
        // TODO add your handling code here:
        Label8.setText(st.pop);
    }//GEN-LAST:event_Label8MouseEntered

    private void Label8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label8MouseExited
        // TODO add your handling code here:
        Label8.setText(st.calm);
    }//GEN-LAST:event_Label8MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CiudadClub;
    private javax.swing.JTextField Dir1Club;
    private javax.swing.JTextField Dir2Club;
    private javax.swing.JTextField IdiomaClub;
    private javax.swing.JTextField InstClub;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private javax.swing.JLabel Label3;
    private javax.swing.JLabel Label4;
    private javax.swing.JLabel Label5;
    private javax.swing.JLabel Label6;
    private javax.swing.JLabel Label7;
    private javax.swing.JLabel Label8;
    private javax.swing.JTextField MonedaClub;
    private javax.swing.JTextField NacionClub;
    private javax.swing.JTextField NombreClub;
    private javax.swing.JTextField PaisClub;
    private javax.swing.JTextField PostalClub;
    private javax.swing.JButton Registrar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
