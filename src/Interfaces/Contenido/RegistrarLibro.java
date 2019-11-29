package Interfaces.Contenido;

import Interfaces.Menu.ProcedimientosExtra;

public class RegistrarLibro extends javax.swing.JPanel {
    
    ProcedimientosExtra listen = new ProcedimientosExtra ();
    AsociarClub st = new AsociarClub ();

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
        Label1 = new javax.swing.JLabel();
        Label2 = new javax.swing.JLabel();
        Label3 = new javax.swing.JLabel();
        Label4 = new javax.swing.JLabel();
        Label6 = new javax.swing.JLabel();
        Label7 = new javax.swing.JLabel();
        Label5 = new javax.swing.JLabel();
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

        Label1.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
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

        Label2.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
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

        Label3.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
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

        Label4.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
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

        Label6.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
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

        Label7.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
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

        Label5.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
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
                                .addComponent(Label5)
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
                    .addComponent(Label1)
                    .addComponent(Label2)
                    .addComponent(Label3)
                    .addComponent(Label4)
                    .addComponent(Label6)
                    .addComponent(Label7))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(OriTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(EspTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(Label2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ApeAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(Label3))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(Label4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel4)
                    .addComponent(Label6)
                    .addComponent(Label5)
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
                                .addComponent(Label7)))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApeAutor;
    private javax.swing.JTextField Edit;
    private javax.swing.JTextField EspTitulo;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private javax.swing.JLabel Label3;
    private javax.swing.JLabel Label4;
    private javax.swing.JLabel Label5;
    private javax.swing.JLabel Label6;
    private javax.swing.JLabel Label7;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
