package Interfaces.Contenido;

public class NuevoClubContent extends javax.swing.JPanel {
    
    OpcionesExtra listen = new OpcionesExtra ();

    public NuevoClubContent() {
        
        initComponents();
        
        listen.FieldListener (NombreClub);
        listen.FieldListener (CiudadClub);
        listen.FieldListener (PaisClub);
        listen.FieldListener (PostalClub);
        listen.FieldListener (Dir1Club);
        listen.FieldListener (Dir2Club);
        listen.FieldListener (MonedaClub);
        listen.FieldListener (NacionClub);
        listen.FieldListener (IdiomaClub);
        listen.FieldListener (IntClub);
        
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
        IntClub = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Dir1Club = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Dir2Club = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(707, 541));
        setMinimumSize(new java.awt.Dimension(707, 541));
        setPreferredSize(new java.awt.Dimension(707, 541));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Nombre del club");

        NombreClub.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        NombreClub.setForeground(new java.awt.Color(204, 204, 255));
        NombreClub.setText("Ej. Club de estudios científicos");
        NombreClub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreClubActionPerformed(evt);
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
        CiudadClub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CiudadClubActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Idioma");

        PaisClub.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        PaisClub.setForeground(new java.awt.Color(204, 204, 255));
        PaisClub.setText("Ej. Venezuela");
        PaisClub.setToolTipText("");
        PaisClub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaisClubActionPerformed(evt);
            }
        });

        PostalClub.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        PostalClub.setForeground(new java.awt.Color(204, 204, 255));
        PostalClub.setText("Ej. 1020");
        PostalClub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PostalClubActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Zona postal");

        MonedaClub.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        MonedaClub.setForeground(new java.awt.Color(204, 204, 255));
        MonedaClub.setText("Ej. Bolívar");
        MonedaClub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonedaClubActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Institución asociada");

        NacionClub.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        NacionClub.setForeground(new java.awt.Color(204, 204, 255));
        NacionClub.setText("Ej. Venezolana");
        NacionClub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NacionClubActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Nacionalidad");

        IdiomaClub.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        IdiomaClub.setForeground(new java.awt.Color(204, 204, 255));
        IdiomaClub.setText("Ej. Español");
        IdiomaClub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdiomaClubActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Moneda");

        IntClub.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        IntClub.setForeground(new java.awt.Color(204, 204, 255));
        IntClub.setText("Ej. Universidad Católica Andrés Bello");
        IntClub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IntClubActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Registrar");

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Reestablecer");

        Dir1Club.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Dir1Club.setForeground(new java.awt.Color(204, 204, 255));
        Dir1Club.setText("Ej. Montalbán II, calle 5");
        Dir1Club.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dir1ClubActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Dirección");

        Dir2Club.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Dir2Club.setForeground(new java.awt.Color(204, 204, 255));
        Dir2Club.setText("Ej. Edf. \"Yaracuy\", piso 5, Apt. 2B");
        Dir2Club.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dir2ClubActionPerformed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("(*)");

        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("(*)");

        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("(*)");

        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("(*)");

        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("(*)");

        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText("(*)");

        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setText("(*)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel6))
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(MonedaClub, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(PostalClub, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel16)
                                        .addGap(98, 98, 98)
                                        .addComponent(jLabel4)
                                        .addGap(21, 21, 21)
                                        .addComponent(IdiomaClub, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Dir2Club)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(16, 16, 16)
                                .addComponent(IntClub))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(NombreClub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(PaisClub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NacionClub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CiudadClub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel13))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Dir1Club, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addComponent(Dir2Club, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PostalClub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(IdiomaClub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MonedaClub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(IntClub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void NombreClubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreClubActionPerformed
        // TODO add your handling code here:        
    }//GEN-LAST:event_NombreClubActionPerformed

    private void CiudadClubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CiudadClubActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CiudadClubActionPerformed

    private void PaisClubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaisClubActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PaisClubActionPerformed

    private void PostalClubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PostalClubActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PostalClubActionPerformed

    private void MonedaClubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonedaClubActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MonedaClubActionPerformed

    private void NacionClubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NacionClubActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NacionClubActionPerformed

    private void IdiomaClubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdiomaClubActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdiomaClubActionPerformed

    private void IntClubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IntClubActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IntClubActionPerformed

    private void Dir1ClubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dir1ClubActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Dir1ClubActionPerformed

    private void Dir2ClubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dir2ClubActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Dir2ClubActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CiudadClub;
    private javax.swing.JTextField Dir1Club;
    private javax.swing.JTextField Dir2Club;
    private javax.swing.JTextField IdiomaClub;
    private javax.swing.JTextField IntClub;
    private javax.swing.JTextField MonedaClub;
    private javax.swing.JTextField NacionClub;
    private javax.swing.JTextField NombreClub;
    private javax.swing.JTextField PaisClub;
    private javax.swing.JTextField PostalClub;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
