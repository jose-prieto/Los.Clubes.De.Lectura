package Interfaces.Contenido;


public class RegistrarLibro extends javax.swing.JPanel {
    
    OpcionesExtra listen = new OpcionesExtra ();

    public RegistrarLibro() {
        initComponents();
        
        listen.FieldListener (ApeAutor);
        listen.FieldListener (Edit);
        listen.FieldListener (EspTitulo);
        listen.FieldListener (NomAutor);
        listen.FieldListener (OriTitulo);
        listen.FieldListener (Pag);
        listen.FieldListener (Tema);
        listen.FieldListener (Year);
        listen.AreaListener (Sinopsis);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        OriTitulo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ApeAutor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        EspTitulo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        NomAutor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Reestableces = new javax.swing.JButton();
        Edit = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Tema = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Sinopsis = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Year = new javax.swing.JTextField();
        Pag = new javax.swing.JTextField();

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("(*)");

        setMaximumSize(new java.awt.Dimension(707, 541));
        setMinimumSize(new java.awt.Dimension(707, 541));
        setPreferredSize(new java.awt.Dimension(707, 541));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Título original");

        OriTitulo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        OriTitulo.setForeground(new java.awt.Color(204, 204, 255));
        OriTitulo.setText("Ej. Romeo and Juliet");
        OriTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OriTituloActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Título en español");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Apellidos del autor");

        ApeAutor.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ApeAutor.setForeground(new java.awt.Color(204, 204, 255));
        ApeAutor.setText("Ej. Shakespeare");
        ApeAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApeAutorActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("N° páginas");

        EspTitulo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        EspTitulo.setForeground(new java.awt.Color(204, 204, 255));
        EspTitulo.setText("Ej. Romeo y Julieta");
        EspTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EspTituloActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Tema principal");

        NomAutor.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        NomAutor.setForeground(new java.awt.Color(204, 204, 255));
        NomAutor.setText("Ej. William");
        NomAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomAutorActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Nombres del autor");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Sinopsis");

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Registrar");

        Reestableces.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Reestableces.setText("Restablecer");
        Reestableces.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReestablecesActionPerformed(evt);
            }
        });

        Edit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Edit.setForeground(new java.awt.Color(204, 204, 255));
        Edit.setText("Ej. Santillana");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Editorial");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Publicado en");

        Tema.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Tema.setForeground(new java.awt.Color(204, 204, 255));
        Tema.setText("Ej. Romeo se suicida tras perder a Julieta...");
        Tema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TemaActionPerformed(evt);
            }
        });

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        Sinopsis.setColumns(20);
        Sinopsis.setForeground(new java.awt.Color(204, 204, 255));
        Sinopsis.setLineWrap(true);
        Sinopsis.setRows(5);
        Sinopsis.setText("Ej. Para entender el argumento de Romeo y Julieta hemos de conocer el concepto de 'tragedia', un género dramático o teatral en el cual los...");
        jScrollPane2.setViewportView(Sinopsis);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("(*)");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("(*)");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText("(*)");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setText("(*)");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 0));
        jLabel17.setText("(*)");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 0, 0));
        jLabel18.setText("(*)");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 0));
        jLabel19.setText("(*)");

        Year.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Year.setForeground(new java.awt.Color(204, 204, 255));
        Year.setText("Ej. 2019");
        Year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YearActionPerformed(evt);
            }
        });

        Pag.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Pag.setForeground(new java.awt.Color(204, 204, 255));
        Pag.setText("Ej. 200");
        Pag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)
                            .addComponent(jLabel11)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Edit, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(OriTitulo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(EspTitulo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NomAutor, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ApeAutor)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(Pag, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Year, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(Tema, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Reestableces, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(OriTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(EspTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ApeAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel15))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel4)
                    .addComponent(jLabel17)
                    .addComponent(jLabel19)
                    .addComponent(Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Tema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(99, 99, 99))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabel18)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Reestableces, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void OriTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OriTituloActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_OriTituloActionPerformed

    private void ApeAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApeAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApeAutorActionPerformed

    private void EspTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EspTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EspTituloActionPerformed

    private void NomAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomAutorActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditActionPerformed

    private void TemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TemaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TemaActionPerformed

    private void ReestablecesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReestablecesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReestablecesActionPerformed

    private void YearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YearActionPerformed

    private void PagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PagActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApeAutor;
    private javax.swing.JTextField Edit;
    private javax.swing.JTextField EspTitulo;
    private javax.swing.JTextField NomAutor;
    private javax.swing.JTextField OriTitulo;
    private javax.swing.JTextField Pag;
    private javax.swing.JButton Reestableces;
    private javax.swing.JTextArea Sinopsis;
    private javax.swing.JTextField Tema;
    private javax.swing.JTextField Year;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
