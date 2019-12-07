package Interfaces.Contenido;

import java.awt.Color;
import javax.swing.border.LineBorder;
//d
public class RegistrarLibro extends javax.swing.JPanel {
    
    ProcedimientosExtra listen = new ProcedimientosExtra ();
    Dialogo diag = new Dialogo ();

    public RegistrarLibro() {
        initComponents();
        
        listen.FieldListener (ISBN);
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
        Registrar = new javax.swing.JButton();
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
        jLabel8 = new javax.swing.JLabel();
        ISBN = new javax.swing.JTextField();
        Label8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Label9 = new javax.swing.JLabel();
        Label10 = new javax.swing.JLabel();
        comboSub = new javax.swing.JComboBox<>();
        comboTip = new javax.swing.JComboBox<>();

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
        OriTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Título en español");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Apellidos del autor");

        ApeAutor.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ApeAutor.setForeground(new java.awt.Color(204, 204, 255));
        ApeAutor.setText("Ej. Shakespeare");
        ApeAutor.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("N° páginas");

        EspTitulo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        EspTitulo.setForeground(new java.awt.Color(204, 204, 255));
        EspTitulo.setText("Ej. Romeo y Julieta");
        EspTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Tema principal");

        NomAutor.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        NomAutor.setForeground(new java.awt.Color(204, 204, 255));
        NomAutor.setText("Ej. William");
        NomAutor.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Nombres del autor");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Sinopsis");

        Registrar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Registrar.setText("Registrar");

        Edit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Edit.setForeground(new java.awt.Color(204, 204, 255));
        Edit.setText("Ej. Santillana");
        Edit.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Editorial");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Publicado en");

        Tema.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Tema.setForeground(new java.awt.Color(204, 204, 255));
        Tema.setText("Ej. Romeo se suicida tras perder a Julieta...");
        Tema.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        Sinopsis.setColumns(20);
        Sinopsis.setForeground(new java.awt.Color(204, 204, 255));
        Sinopsis.setLineWrap(true);
        Sinopsis.setRows(5);
        Sinopsis.setText("Ej. Para entender el argumento de Romeo y Julieta hemos de conocer el concepto de 'tragedia', un género dramático o teatral en el cual los...");
        Sinopsis.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
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
        Year.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));

        Pag.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Pag.setForeground(new java.awt.Color(204, 204, 255));
        Pag.setText("Ej. 200");
        Pag.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("ISBN");

        ISBN.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ISBN.setForeground(new java.awt.Color(204, 204, 255));
        ISBN.setText("Ej. 9788877547224");
        ISBN.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));

        Label8.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
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

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Tipo");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Subgénero");

        Label9.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        Label9.setForeground(new java.awt.Color(255, 0, 0));
        Label9.setText("(*)");
        Label9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Label9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Label9MouseExited(evt);
            }
        });

        Label10.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        Label10.setForeground(new java.awt.Color(255, 0, 0));
        Label10.setText("(*)");
        Label10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Label10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Label10MouseExited(evt);
            }
        });

        comboSub.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        comboSub.setForeground(new java.awt.Color(51, 51, 51));
        comboSub.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lirica", "Epica", "Prosa", "Dramatica" }));
        comboSub.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                comboSubFocusLost(evt);
            }
        });

        comboTip.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        comboTip.setForeground(new java.awt.Color(51, 51, 51));
        comboTip.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "La oda", "la elegía", "la égloga", "la sátira", "épica", "la canción" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)
                            .addComponent(jLabel11)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ISBN)
                            .addComponent(Edit, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(OriTitulo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(EspTitulo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NomAutor, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ApeAutor)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(Pag, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(comboSub, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Label10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboTip, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(152, 152, 152)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label1)
                    .addComponent(Label2)
                    .addComponent(Label3)
                    .addComponent(Label4)
                    .addComponent(Label6)
                    .addComponent(Label7)
                    .addComponent(Label8)
                    .addComponent(Label9))
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(ISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label8))
                .addGap(18, 18, 18)
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
                    .addComponent(jLabel13)
                    .addComponent(jLabel9)
                    .addComponent(Label9)
                    .addComponent(Label10)
                    .addComponent(comboSub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboTip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
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
                        .addGap(51, 51, 51)
                        .addComponent(Label7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel10)))
                .addGap(18, 18, 18)
                .addComponent(Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
    }// </editor-fold>//GEN-END:initComponents

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

    private void Label3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label3MouseEntered
        // TODO add your handling code here:
        diag.posicion(Label3.getLocationOnScreen().x-29, Label3.getLocationOnScreen().y+15);
        diag.setVisible(true);
    }//GEN-LAST:event_Label3MouseEntered

    private void Label3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label3MouseExited
        // TODO add your handling code here:
        diag.setVisible(false);
    }//GEN-LAST:event_Label3MouseExited

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
    
    public boolean val(){
        
        boolean val = true;
        
        if(OriTitulo.getText().equals("Ej. Romeo and Juliet")){
            OriTitulo.setBorder(new LineBorder(Color.red));
        }else{
            OriTitulo.setBorder(new LineBorder(Color.gray));
        }
        if(EspTitulo.getText().equals("Ej. Romeo y Julieta")){
            EspTitulo.setBorder(new LineBorder(Color.red));
        }else{
            EspTitulo.setBorder(new LineBorder(Color.gray));
        }
        if(NomAutor.getText().equals("Ej. William")){
            NomAutor.setBorder(new LineBorder(Color.red));
        }else{
            NomAutor.setBorder(new LineBorder(Color.gray));
        }
        if(ApeAutor.getText().equals("Ej. Shakespeare")){
            ApeAutor.setBorder(new LineBorder(Color.red));
        }else{
            ApeAutor.setBorder(new LineBorder(Color.gray));
        }
        if(Edit.getText().equals("Ej. Santillana")){
            Edit.setBorder(new LineBorder(Color.red));
        }else{
            Edit.setBorder(new LineBorder(Color.gray));
        }
        if(Year.getText().equals("Ej. 2019")){
            Year.setBorder(new LineBorder(Color.red));
        }else{
            Year.setBorder(new LineBorder(Color.gray));
        }
        if(Pag.getText().equals("Ej. 200")){
            Pag.setBorder(new LineBorder(Color.red));
        }else{
            Pag.setBorder(new LineBorder(Color.gray));
        }
        if(Tema.getText().equals("Ej. Romeo se suicida tras perder a Julieta...")){
            Tema.setBorder(new LineBorder(Color.red));
        }else{
            Tema.setBorder(new LineBorder(Color.gray));
        }
        if(Sinopsis.getText().equals("Ej. Para entender el argumento de Romeo y Julieta hemos de conocer el concepto de 'tragedia', un género dramático o teatral en el cual los...")){
            Sinopsis.setBorder(new LineBorder(Color.red));
        }else{
            Sinopsis.setBorder(new LineBorder(Color.gray));
        }
        
        return val;
        
    }
    
    private void Label8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label8MouseEntered
        // TODO add your handling code here:
        diag.posicion(Label8.getLocationOnScreen().x-29, Label8.getLocationOnScreen().y+15);
        diag.setVisible(true);
    }//GEN-LAST:event_Label8MouseEntered

    private void Label8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label8MouseExited
        // TODO add your handling code here:
        diag.setVisible(false);
    }//GEN-LAST:event_Label8MouseExited

    private void Label9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label9MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Label9MouseEntered

    private void Label9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label9MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Label9MouseExited

    private void Label10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label10MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Label10MouseEntered

    private void Label10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label10MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Label10MouseExited

    private void comboSubFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comboSubFocusLost
        // TODO add your handling code here:
        switch(comboSub.getSelectedIndex()) {
            case 0:
                comboTip.removeAllItems();
                comboTip.addItem("La oda");
                comboTip.addItem("la elegia");
                comboTip.addItem("la egloga");
                comboTip.addItem("la satira");
                comboTip.addItem("epica");
                comboTip.addItem("la cancion");
              break;
            case 1:
                comboTip.removeAllItems();
                comboTip.addItem("La epopeya");
                comboTip.addItem("fabula el poema epico");
                comboTip.addItem("el romance");
              break;
            case 2:
                comboTip.removeAllItems();
                comboTip.addItem("Novela");
                comboTip.addItem("Cuento");
                comboTip.addItem("Leyenda");
                comboTip.addItem("Fábula");
              break;
            case 3:
                comboTip.removeAllItems();
                comboTip.addItem("La tragedia");
                comboTip.addItem("la comedia");
                comboTip.addItem("el drama");
                comboTip.addItem("la opera");
                comboTip.addItem("la zarzuela");
              break;
            default:
              break;
          }
    }//GEN-LAST:event_comboSubFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApeAutor;
    private javax.swing.JTextField Edit;
    private javax.swing.JTextField EspTitulo;
    private javax.swing.JTextField ISBN;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label10;
    private javax.swing.JLabel Label2;
    private javax.swing.JLabel Label3;
    private javax.swing.JLabel Label4;
    private javax.swing.JLabel Label5;
    private javax.swing.JLabel Label6;
    private javax.swing.JLabel Label7;
    private javax.swing.JLabel Label8;
    private javax.swing.JLabel Label9;
    private javax.swing.JTextField NomAutor;
    private javax.swing.JTextField OriTitulo;
    private javax.swing.JTextField Pag;
    public javax.swing.JButton Registrar;
    private javax.swing.JTextArea Sinopsis;
    private javax.swing.JTextField Tema;
    private javax.swing.JTextField Year;
    private javax.swing.JComboBox<String> comboSub;
    private javax.swing.JComboBox<String> comboTip;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
