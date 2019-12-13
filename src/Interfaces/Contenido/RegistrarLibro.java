package Interfaces.Contenido;

import ControladorBD.QueriesAlberto;
import ControladorBD.QueriesJose;
import java.awt.Color;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

public class RegistrarLibro extends javax.swing.JPanel {
    
    ProcedimientosExtra listen = new ProcedimientosExtra ();
    Dialogo diag = new Dialogo ();
    QueriesAlberto query = new QueriesAlberto();
    QueriesJose queryJ = new QueriesJose();
    SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");

    public RegistrarLibro() {
        initComponents();
        
        listen.FieldListener (ISBN);
        listen.FieldListener (ApeAutor);
        listen.FieldListener (EspTitulo);
        listen.FieldListener (NomAutor);
        listen.FieldListener (OriTitulo);
        listen.FieldListener (Pag);
        listen.FieldListener (Tema);
        listen.AreaListener (Sinopsis);
    }
    
    public Date getNacimiento() {
        
        return java.sql.Date.valueOf(sdf.format(Publicado.getDate()));
        
    }
    
    public void inicio(){
        ResultSet res;
        res = queryJ.libros();
        Libros.removeAllItems();
        Libros.addItem(" ");
        if (res != null){
            try {
                do{
                    Libros.addItem(res.getString(1));
                }while (res.next());
            } catch (SQLException ex) {
                Logger.getLogger(RegistraMiembro2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        res = queryJ.editoriales();
        Editorial.removeAllItems();
        if (res != null){
            try {
                do{
                    Editorial.addItem(res.getString(1));
                }while (res.next());
            } catch (SQLException ex) {
                Logger.getLogger(RegistraMiembro2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
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
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Tema = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Sinopsis = new javax.swing.JTextArea();
        Label1 = new javax.swing.JLabel();
        Label2 = new javax.swing.JLabel();
        Label3 = new javax.swing.JLabel();
        Label6 = new javax.swing.JLabel();
        Label7 = new javax.swing.JLabel();
        Pag = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ISBN = new javax.swing.JTextField();
        Label8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        comboTipo = new javax.swing.JComboBox<>();
        comboSub = new javax.swing.JComboBox<>();
        Editorial = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        Libros = new javax.swing.JComboBox<>();
        Publicado = new com.toedter.calendar.JDateChooser();

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
        OriTitulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                OriTituloKeyTyped(evt);
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
        ApeAutor.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        ApeAutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ApeAutorKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("N° páginas");

        EspTitulo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        EspTitulo.setForeground(new java.awt.Color(204, 204, 255));
        EspTitulo.setText("Ej. Romeo y Julieta");
        EspTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        EspTitulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EspTituloKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Tema principal");

        NomAutor.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        NomAutor.setForeground(new java.awt.Color(204, 204, 255));
        NomAutor.setText("Ej. William");
        NomAutor.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        NomAutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NomAutorKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Nombres del autor");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Sinopsis");

        Registrar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Registrar.setText("Registrar");
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
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
        Tema.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        Tema.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TemaKeyTyped(evt);
            }
        });

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        Sinopsis.setColumns(20);
        Sinopsis.setForeground(new java.awt.Color(204, 204, 255));
        Sinopsis.setLineWrap(true);
        Sinopsis.setRows(5);
        Sinopsis.setText("Ej. Para entender el argumento de Romeo y Julieta hemos de conocer el concepto de 'tragedia', un género dramático o teatral en el cual los...");
        Sinopsis.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        Sinopsis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SinopsisKeyTyped(evt);
            }
        });
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

        Pag.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Pag.setForeground(new java.awt.Color(204, 204, 255));
        Pag.setText("Ej. 200");
        Pag.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        Pag.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PagKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("ISBN");

        ISBN.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ISBN.setForeground(new java.awt.Color(204, 204, 255));
        ISBN.setText("Ej. 9788877547224");
        ISBN.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        ISBN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ISBNKeyTyped(evt);
            }
        });

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
        jLabel9.setText("Subgénero");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Tipo");

        comboTipo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        comboTipo.setForeground(new java.awt.Color(51, 51, 51));
        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lirica", "Epica", "Prosa", "Dramatica" }));
        comboTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboTipoItemStateChanged(evt);
            }
        });

        comboSub.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        comboSub.setForeground(new java.awt.Color(51, 51, 51));
        comboSub.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "La oda", "la elegía", "la égloga", "la sátira", "épica", "la canción" }));

        Editorial.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Editorial.setForeground(new java.awt.Color(51, 51, 51));
        Editorial.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                EditorialItemStateChanged(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Libro padre");

        Libros.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Libros.setForeground(new java.awt.Color(51, 51, 51));
        Libros.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                LibrosItemStateChanged(evt);
            }
        });

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
                            .addComponent(Tema, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ISBN)
                                    .addComponent(OriTitulo, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(EspTitulo, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(NomAutor, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ApeAutor)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(18, 18, 18)
                                                .addComponent(Pag, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addGap(18, 18, 18)
                                                .addComponent(comboSub, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(Libros, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Editorial, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Publicado, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label1)
                    .addComponent(Label2)
                    .addComponent(Label3)
                    .addComponent(Label6)
                    .addComponent(Label7)
                    .addComponent(Label8))
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
                    .addComponent(jLabel14)
                    .addComponent(Libros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboSub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Editorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jLabel4)
                        .addComponent(Label6)
                        .addComponent(Pag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Publicado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(35, Short.MAX_VALUE))
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
            val = false;
        }else{
            OriTitulo.setBorder(new LineBorder(Color.gray));
        }
        if(NomAutor.getText().equals("Ej. William")){
            NomAutor.setBorder(new LineBorder(Color.red));
            val = false;
        }else{
            NomAutor.setBorder(new LineBorder(Color.gray));
        }
        if(ApeAutor.getText().equals("Ej. Shakespeare")){
            ApeAutor.setBorder(new LineBorder(Color.red));
            val = false;
        }else{
            ApeAutor.setBorder(new LineBorder(Color.gray));
        }
        if(Pag.getText().equals("Ej. 200")){
            Pag.setBorder(new LineBorder(Color.red));
            val = false;
        }else{
            Pag.setBorder(new LineBorder(Color.gray));
        }
        if(Sinopsis.getText().equals("Ej. Para entender el argumento de Romeo y Julieta hemos de conocer el concepto de 'tragedia', un género dramático o teatral en el cual los...")){
            Sinopsis.setBorder(new LineBorder(Color.red));
            val = false;
        }else{
            Sinopsis.setBorder(new LineBorder(Color.gray));
        }
        if(ISBN.getText().equals("Ej. 9788877547224")){
            ISBN.setBorder(new LineBorder(Color.red));
            val = false;
        }else{
            ISBN.setBorder(new LineBorder(Color.gray));
        }
        if (!val){
            JOptionPane.showMessageDialog(null, "Debe llenar los campos obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        return val; 
    }
    
    public int clasif(){
        int sub = comboSub.getSelectedIndex() + 1;
        int tipo = comboTipo.getSelectedIndex() + 1;
        int valor=0;
        
        if (tipo==2){
            switch (sub) {
                case 1:
                    valor=5;
                    break;
                case 2:
                    valor=6;
                    break;
                case 3:
                    valor=7;    
                    break;
                default:
                    break;
            }
        }
        
        return valor;
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

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        if (val() && query.CrearLibro(Integer.parseInt(ISBN.getText()),OriTitulo.getText(), Sinopsis.getText(), 
                    getNacimiento(), Integer.parseInt(Pag.getText()), EspTitulo.getText(), Tema.getText(), 
                    Editorial.getSelectedItem().toString(),clasif()) && query.CrearAutorLibro(NomAutor.getText(), 
                            ApeAutor.getText(), Integer.parseInt(ISBN.getText()))){
            if (!Libros.getSelectedItem().toString().equals(" ")){
                queryJ.addPadreLibro(Libros.getSelectedItem().toString(), Integer.parseInt(ISBN.getText()));
            }
            JOptionPane.showMessageDialog(null, "Libro registrado con éxito", "Información", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_RegistrarActionPerformed

    private void ISBNKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ISBNKeyTyped
          // TODO add your handling code here:
                  char c = evt.getKeyChar();
        
        if (c < '0' || c > '9' || ISBN.getText().length() > 14){
            evt.consume();
        }
    }//GEN-LAST:event_ISBNKeyTyped

    private void OriTituloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_OriTituloKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')){
            evt.consume();
            } 
    }//GEN-LAST:event_OriTituloKeyTyped

    private void EspTituloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EspTituloKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')){
            evt.consume();
         }     
    }//GEN-LAST:event_EspTituloKeyTyped

    private void NomAutorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NomAutorKeyTyped
        // TODO add your handling code here:
                char c = evt.getKeyChar();
        
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')){
            evt.consume();
         }     
        
    }//GEN-LAST:event_NomAutorKeyTyped

    private void ApeAutorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ApeAutorKeyTyped
        // TODO add your handling code here:
                char c = evt.getKeyChar();
        
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')){
            evt.consume();
         }     
    }//GEN-LAST:event_ApeAutorKeyTyped

    private void PagKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PagKeyTyped
        // TODO add your handling code here:
                 char c = evt.getKeyChar();
        
        if (c < '0' || c > '9' || Pag.getText().length() > 7){
            evt.consume();
        }
    }//GEN-LAST:event_PagKeyTyped

    private void TemaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TemaKeyTyped
        // TODO add your handling code here:
                  char c = evt.getKeyChar();
        
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')){
            evt.consume();
         } 
    }//GEN-LAST:event_TemaKeyTyped

    private void SinopsisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SinopsisKeyTyped
        // TODO add your handling code here:
                  char c = evt.getKeyChar();
        
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')){
            evt.consume();
         } 
    }//GEN-LAST:event_SinopsisKeyTyped

    private void comboTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboTipoItemStateChanged
        // TODO add your handling code here:
        switch(comboTipo.getSelectedIndex()) {
            case 0:
                comboSub.removeAllItems();
                comboSub.addItem("La Oda");
                comboSub.addItem("La Elegia");
                comboSub.addItem("La Egloga");
                comboSub.addItem("La Satira");
                comboSub.addItem("Epica");
                comboSub.addItem("La Cancion");
              break;
            case 1:
                comboSub.removeAllItems();
                comboSub.addItem("La Epopeya");
                comboSub.addItem("Fabula el poema epico");
                comboSub.addItem("El Romance");
              break;
            case 2:
                comboSub.removeAllItems();
                comboSub.addItem("Novela");
                comboSub.addItem("Cuento");
                comboSub.addItem("Leyenda");
                comboSub.addItem("Fábula");
              break;
            case 3:
                comboSub.removeAllItems();
                comboSub.addItem("La Tragedia");
                comboSub.addItem("La Comedia");
                comboSub.addItem("El Drama");
                comboSub.addItem("La Opera");
                comboSub.addItem("La Zarzuela");
              break;
            default:
              break;
          }
    }//GEN-LAST:event_comboTipoItemStateChanged

    private void EditorialItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_EditorialItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_EditorialItemStateChanged

    private void LibrosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_LibrosItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_LibrosItemStateChanged

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApeAutor;
    private javax.swing.JComboBox<String> Editorial;
    private javax.swing.JTextField EspTitulo;
    private javax.swing.JTextField ISBN;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private javax.swing.JLabel Label3;
    private javax.swing.JLabel Label6;
    private javax.swing.JLabel Label7;
    private javax.swing.JLabel Label8;
    private javax.swing.JComboBox<String> Libros;
    private javax.swing.JTextField NomAutor;
    private javax.swing.JTextField OriTitulo;
    private javax.swing.JTextField Pag;
    private com.toedter.calendar.JDateChooser Publicado;
    public javax.swing.JButton Registrar;
    private javax.swing.JTextArea Sinopsis;
    private javax.swing.JTextField Tema;
    private javax.swing.JComboBox<String> comboSub;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
