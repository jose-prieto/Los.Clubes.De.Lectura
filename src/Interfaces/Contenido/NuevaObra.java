package Interfaces.Contenido;

import Interfaces.Menu.ProcedimientosExtra;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class NuevaObra extends javax.swing.JPanel {
    
    AsociarClub st = new AsociarClub ();
    ProcedimientosExtra listen = new ProcedimientosExtra ();

    public NuevaObra() {
        
        initComponents();
        
        listen.FieldListener (TitObra);
        listen.FieldListener (Costo);
        listen.FieldListener (LibObra);
        listen.FieldListener (NomAud);
        listen.FieldListener (PersObra);
        listen.AreaListener (Resumen);
        listen.FieldListener(CiMiemb);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TitObra = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Costo = new javax.swing.JTextField();
        LibObra = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        NomAud = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Label1 = new javax.swing.JLabel();
        Label2 = new javax.swing.JLabel();
        Label3 = new javax.swing.JLabel();
        Label4 = new javax.swing.JLabel();
        Label5 = new javax.swing.JLabel();
        PersObra = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        AgrPers = new javax.swing.JButton();
        HorasSpinner = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Resumen = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        PersAgr = new javax.swing.JList<>();
        jLabel10 = new javax.swing.JLabel();
        AsigPers = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        CiMiemb = new javax.swing.JTextField();

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
        TitObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TitObraActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Libro de referencia");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Nombre del auditorio");

        Costo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Costo.setForeground(new java.awt.Color(204, 204, 255));
        Costo.setText("15000");
        Costo.setToolTipText("");
        Costo.setBorder(new javax.swing.border.LineBorder(java.awt.Color.gray, 1, true));
        Costo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CostoActionPerformed(evt);
            }
        });

        LibObra.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        LibObra.setForeground(new java.awt.Color(204, 204, 255));
        LibObra.setText("Ej. Romeo y Julieta");
        LibObra.setToolTipText("");
        LibObra.setBorder(new javax.swing.border.LineBorder(java.awt.Color.gray, 1, true));
        LibObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LibObraActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Duración en horas");

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Continuar >");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Reestablecer");

        NomAud.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        NomAud.setForeground(new java.awt.Color(204, 204, 255));
        NomAud.setText("Ej. Hermanos lanz");
        NomAud.setBorder(new javax.swing.border.LineBorder(java.awt.Color.gray, 1, true));

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

        PersObra.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        PersObra.setForeground(new java.awt.Color(204, 204, 255));
        PersObra.setText("Ej. Romeo Montesco");
        PersObra.setBorder(new javax.swing.border.LineBorder(java.awt.Color.gray, 1, true));
        PersObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PersObraActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Personajes de la obra");

        AgrPers.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        AgrPers.setForeground(new java.awt.Color(51, 51, 51));
        AgrPers.setText("Agregar personaje");
        AgrPers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgrPersActionPerformed(evt);
            }
        });

        HorasSpinner.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        HorasSpinner.setModel(new javax.swing.SpinnerListModel(new String[] {"1 hora", "2 horas", "3 horas", "4 horas", "5 horas", "6 horas", "7 horas", "8 horas", "9 horas"}));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Resumen");

        jScrollPane1.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N

        Resumen.setColumns(20);
        Resumen.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Resumen.setForeground(new java.awt.Color(204, 204, 255));
        Resumen.setRows(5);
        Resumen.setText("Aquí se debe especificar el resumen del argumento de la obra en cuestión.");
        Resumen.setBorder(new javax.swing.border.LineBorder(java.awt.Color.gray, 1, true));
        jScrollPane1.setViewportView(Resumen);

        PersAgr.setBackground(new java.awt.Color(240, 240, 240));
        PersAgr.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        PersAgr.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "rgr", "rg", "rg", "rg", "rg", "rg", "r" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        PersAgr.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        PersAgr.setToolTipText("");
        jScrollPane2.setViewportView(PersAgr);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Personajes agregados");

        AsigPers.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        AsigPers.setForeground(new java.awt.Color(51, 51, 51));
        AsigPers.setText("Asignar personaje");
        AsigPers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsigPersActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("C.I. del miembro");

        CiMiemb.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CiMiemb.setForeground(new java.awt.Color(204, 204, 255));
        CiMiemb.setText("Ej. 25369875");
        CiMiemb.setBorder(new javax.swing.border.LineBorder(java.awt.Color.gray, 1, true));
        CiMiemb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CiMiembActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel11)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(PersObra)
                                    .addGap(18, 18, 18)
                                    .addComponent(AgrPers))
                                .addComponent(NomAud, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(HorasSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Costo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(LibObra, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TitObra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(CiMiemb, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(AsigPers, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label1)
                    .addComponent(Label2)
                    .addComponent(Label3)
                    .addComponent(Label4)
                    .addComponent(Label5))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(TitObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(LibObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(Costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HorasSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(Label1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(NomAud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label4))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PersObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(AgrPers, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(CiMiemb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AsigPers, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(Label5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TitObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TitObraActionPerformed
        // TODO add your handling code here:        
    }//GEN-LAST:event_TitObraActionPerformed

    private void CostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CostoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CostoActionPerformed

    private void LibObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LibObraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LibObraActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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

    private void PersObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PersObraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PersObraActionPerformed

    private void AgrPersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgrPersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgrPersActionPerformed

    private void AsigPersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsigPersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AsigPersActionPerformed

    private void CiMiembActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CiMiembActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CiMiembActionPerformed

    private void Label5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label5MouseExited
        // TODO add your handling code here:
        Label5.setText(st.calm);
    }//GEN-LAST:event_Label5MouseExited

    private void Label5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label5MouseEntered
        // TODO add your handling code here:
        Label5.setText(st.pop);
    }//GEN-LAST:event_Label5MouseEntered

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        if (TitObra.getText().equals("Ej. La gran tragedia")){
            TitObra.setBorder(new LineBorder(Color.red));
        }else{
            TitObra.setBorder(new LineBorder(Color.gray));
        }
        if (LibObra.getText().equals("Ej. Romeo y Julieta")){
            LibObra.setBorder(new LineBorder(Color.red));
        }else{
            LibObra.setBorder(new LineBorder(Color.gray));
        }
        if (Costo.getText().equals("15000")){
            Costo.setBorder(new LineBorder(Color.red));
        }else{
            Costo.setBorder(new LineBorder(Color.gray));
        }
        if (NomAud.getText().equals("Ej. Hermanos lanz")){
            NomAud.setBorder(new LineBorder(Color.red));
        }else{
            NomAud.setBorder(new LineBorder(Color.gray));
        }
        if (PersObra.getText().equals("Ej. Romeo Montesco")){
            PersObra.setBorder(new LineBorder(Color.red));
        }else{
            PersObra.setBorder(new LineBorder(Color.gray));
        }
        if (CiMiemb.getText().equals("Ej. 25369875")){
            CiMiemb.setBorder(new LineBorder(Color.red));
        }else{
            CiMiemb.setBorder(new LineBorder(Color.gray));
        }
        if (Resumen.getText().equals("Aquí se debe especificar el resumen del argumento de la obra en cuestión.")){
            Resumen.setBorder(new LineBorder(Color.red));
        }else{
            Resumen.setBorder(new LineBorder(Color.gray));
        }
    }//GEN-LAST:event_jButton1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgrPers;
    private javax.swing.JButton AsigPers;
    private javax.swing.JTextField CiMiemb;
    private javax.swing.JTextField Costo;
    private javax.swing.JSpinner HorasSpinner;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private javax.swing.JLabel Label3;
    private javax.swing.JLabel Label4;
    private javax.swing.JLabel Label5;
    private javax.swing.JTextField LibObra;
    private javax.swing.JTextField NomAud;
    private javax.swing.JList<String> PersAgr;
    private javax.swing.JTextField PersObra;
    private javax.swing.JTextArea Resumen;
    private javax.swing.JTextField TitObra;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
