package Interfaces.Contenido;

import Interfaces.Menu.ProcedimientosExtra;
import javax.swing.JSpinner;

public class NuevaObra extends javax.swing.JPanel {
    
    AsociarClub st = new AsociarClub ();
    ProcedimientosExtra listen = new ProcedimientosExtra ();

    public NuevaObra() {
        
        initComponents();
        
        listen.FieldListener (NombreClub);
        listen.FieldListener (CiudadClub);
        listen.FieldListener (PaisClub);
        listen.FieldListener (Dir1Club);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        NombreClub = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CiudadClub = new javax.swing.JTextField();
        PaisClub = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Dir1Club = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Label1 = new javax.swing.JLabel();
        Label2 = new javax.swing.JLabel();
        Label3 = new javax.swing.JLabel();
        Label4 = new javax.swing.JLabel();
        Label5 = new javax.swing.JLabel();
        Dir1Club1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        HorasSpinner = new javax.swing.JSpinner();
        Label6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel10 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(707, 541));
        setMinimumSize(new java.awt.Dimension(707, 541));
        setPreferredSize(new java.awt.Dimension(707, 541));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Título");

        NombreClub.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        NombreClub.setForeground(new java.awt.Color(204, 204, 255));
        NombreClub.setText("Ej. La gran tragedia");
        NombreClub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreClubActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Libro de referencia");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Nombre del auditorio");

        CiudadClub.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CiudadClub.setForeground(new java.awt.Color(204, 204, 255));
        CiudadClub.setText("15000");
        CiudadClub.setToolTipText("");
        CiudadClub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CiudadClubActionPerformed(evt);
            }
        });

        PaisClub.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        PaisClub.setForeground(new java.awt.Color(204, 204, 255));
        PaisClub.setText("Ej. Romeo y Julieta");
        PaisClub.setToolTipText("");
        PaisClub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaisClubActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Duración en horas");

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Reestablecer");

        Dir1Club.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Dir1Club.setForeground(new java.awt.Color(204, 204, 255));
        Dir1Club.setText("Ej. Hermanos lanz");
        Dir1Club.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dir1ClubActionPerformed(evt);
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

        Dir1Club1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Dir1Club1.setForeground(new java.awt.Color(204, 204, 255));
        Dir1Club1.setText("Ej. Romeo Montesco");
        Dir1Club1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dir1Club1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Personajes de la obra");

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setText("Agregar personaje");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        HorasSpinner.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        HorasSpinner.setModel(new javax.swing.SpinnerListModel(new String[] {"1 hora", "2 horas", "3 horas", "4 horas", "5 horas", "6 horas", "7 horas", "8 horas", "9 horas"}));

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

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Resumen");

        jScrollPane1.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jList1.setBackground(new java.awt.Color(240, 240, 240));
        jList1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.setToolTipText("");
        jScrollPane2.setViewportView(jList1);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Personajes agregados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(532, 807, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel9))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(HorasSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(CiudadClub, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(PaisClub, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(NombreClub)
                                    .addComponent(Dir1Club, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(Dir1Club1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton3))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel4))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2)
                                    .addComponent(jScrollPane1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label1)
                            .addComponent(Label2)
                            .addComponent(Label3)
                            .addComponent(Label4)
                            .addComponent(Label5)
                            .addComponent(Label6))
                        .addGap(32, 32, 32))))
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
                    .addComponent(jLabel7)
                    .addComponent(Label3)
                    .addComponent(jLabel5)
                    .addComponent(CiudadClub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HorasSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Label4)
                    .addComponent(Dir1Club, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label5)
                    .addComponent(Dir1Club1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label6)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
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

    private void Dir1ClubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dir1ClubActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Dir1ClubActionPerformed

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

    private void Label5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label5MouseEntered
        // TODO add your handling code here:
        Label5.setText(st.pop);
    }//GEN-LAST:event_Label5MouseEntered

    private void Label5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label5MouseExited
        // TODO add your handling code here:
        Label5.setText(st.calm);
    }//GEN-LAST:event_Label5MouseExited

    private void Dir1Club1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dir1Club1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Dir1Club1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void Label6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Label6MouseEntered

    private void Label6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label6MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Label6MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CiudadClub;
    private javax.swing.JTextField Dir1Club;
    private javax.swing.JTextField Dir1Club1;
    private javax.swing.JSpinner HorasSpinner;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private javax.swing.JLabel Label3;
    private javax.swing.JLabel Label4;
    private javax.swing.JLabel Label5;
    private javax.swing.JLabel Label6;
    private javax.swing.JTextField NombreClub;
    private javax.swing.JTextField PaisClub;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
