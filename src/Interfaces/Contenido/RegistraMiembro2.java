package Interfaces.Contenido;

import java.awt.Color;
import javax.swing.border.LineBorder;

public class RegistraMiembro2 extends javax.swing.JPanel {
    
    ProcedimientosExtra listen = new ProcedimientosExtra ();
    Dialogo diag = new Dialogo ();

    public RegistraMiembro2() {
        initComponents();
        
        listen.FieldListener (Libro2);
        listen.FieldListener (Libro3);
        listen.FieldListener (Libro1);
        listen.FieldListener (Cod1);
        listen.FieldListener (Cod2);
        listen.FieldListener (Num1);
        listen.FieldListener (Num2);
        listen.FieldListener (Ciudad);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Cod1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Libro2 = new javax.swing.JTextField();
        Libro1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Libro3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Label1 = new javax.swing.JLabel();
        Label2 = new javax.swing.JLabel();
        Label3 = new javax.swing.JLabel();
        Label4 = new javax.swing.JLabel();
        Label5 = new javax.swing.JLabel();
        Num1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Num2 = new javax.swing.JTextField();
        Cod2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        Label6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Label7 = new javax.swing.JLabel();
        Ciudad = new javax.swing.JTextField();
        Registrar = new javax.swing.JButton();
        Pais = new javax.swing.JComboBox<>();
        Pais1 = new javax.swing.JComboBox<>();

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("(*)");

        setMaximumSize(new java.awt.Dimension(707, 541));
        setMinimumSize(new java.awt.Dimension(707, 541));
        setPreferredSize(new java.awt.Dimension(707, 541));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Teléfono 1");

        Cod1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Cod1.setForeground(new java.awt.Color(204, 204, 255));
        Cod1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Cod1.setText("0424");
        Cod1.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Libro preferido 2");

        Libro2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Libro2.setForeground(new java.awt.Color(204, 204, 255));
        Libro2.setText("Ej. Cien años de soledad");
        Libro2.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));

        Libro1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Libro1.setForeground(new java.awt.Color(204, 204, 255));
        Libro1.setText("Ej. Romeo y Julieta");
        Libro1.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Libro preferido 1");

        Libro3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Libro3.setForeground(new java.awt.Color(204, 204, 255));
        Libro3.setText("Ej. Once minutos");
        Libro3.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Libro preferido 3");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("País de residencia");

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
        Label2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
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
        Label3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
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
        Label4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Label4.setText("(*)");
        Label4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Label4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Label4MouseExited(evt);
            }
        });

        Label5.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        Label5.setForeground(new java.awt.Color(255, 0, 0));
        Label5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Label5.setText("(*)");
        Label5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Label5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Label5MouseExited(evt);
            }
        });

        Num1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Num1.setForeground(new java.awt.Color(204, 204, 255));
        Num1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Num1.setText("1931798");
        Num1.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Teléfono 2");

        Num2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Num2.setForeground(new java.awt.Color(204, 204, 255));
        Num2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Num2.setText("4424833");
        Num2.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));

        Cod2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Cod2.setForeground(new java.awt.Color(204, 204, 255));
        Cod2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Cod2.setText("0212");
        Cod2.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Nacionalidad");

        Label6.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        Label6.setForeground(new java.awt.Color(255, 0, 0));
        Label6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Label6.setText("(*)");
        Label6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Label6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Label6MouseExited(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Ciudad de residencia");

        Label7.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        Label7.setForeground(new java.awt.Color(255, 0, 0));
        Label7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Label7.setText("(*)");
        Label7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Label7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Label7MouseExited(evt);
            }
        });

        Ciudad.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Ciudad.setForeground(new java.awt.Color(204, 204, 255));
        Ciudad.setText("Ej. Distrito Capital");
        Ciudad.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));

        Registrar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Registrar.setText("Registrar");
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });

        Pais.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Pais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Afganistán", "Albania", "Alemania", "Andorra", "Angola", "Antigua y Barbuda", "Arabia Saudita", "Argelia", "Argentina", "Armenia", "Australia", "Austria", "Azerbaiyán", "Bahamas", "Bangladés", "Barbados", "Baréin", "Bélgica", "Belice", "Benín", "Bielorrusia", "Birmania", "Bolivia", "Bosnia y Herzegovina", "Botsuana", "Brasil", "Brunéi", "Bulgaria", "Burkina Faso", "Burundi", "Bután", "Cabo Verde", "Camboya", "Camerún", "Canadá", "Catar", "Chad", "Chile", "China", "Chipre", "Ciudad del Vaticano", "Colombia", "Comoras", "Corea del Norte", "Corea del Sur", "Costa de Marfil", "Costa Rica", "Croacia", "Cuba", "Dinamarca", "Dominica", "Ecuador", "Egipto", "El Salvador", "Emiratos Árabes Unidos", "Eritrea", "Eslovaquia", "Eslovenia", "España", "Estados Unidos", "Estonia", "Etiopía", "Filipinas", "Finlandia", "Fiyi", "Francia", "Gabón", "Gambia", "Georgia", "Ghana", "Granada", "Grecia", "Guatemala", "Guyana", "Guinea", "Guinea ecuatorial", "Guinea-Bisáu", "Haití", "Honduras", "Hungría", "India", "Indonesia", "Irak", "Irán", "Irlanda", "Islandia", "Islas Marshall", "Islas Salomón", "Israel", "Italia", "Jamaica", "Japón", "Jordania", "Kazajistán", "Kenia", "Kirguistán", "Kiribati", "Kuwait", "Laos", "Lesoto", "Letonia", "Líbano", "Liberia", "Libia", "Liechtenstein", "Lituania", "Luxemburgo", "Macedonia del Norte", "Madagascar", "Malasia", "Malaui", "Maldivas", "Malí", "Malta", "Marruecos", "Mauricio", "Mauritania", "México", "Micronesia", "Moldavia", "Mónaco", "Mongolia", "Montenegro", "Mozambique", "Namibia", "Nauru", "Nepal", "Nicaragua", "Níger", "Nigeria", "Noruega", "Nueva Zelanda", "Omán", "Países Bajos", "Pakistán", "Palaos", "Panamá", "Papúa Nueva Guinea", "Paraguay", "Perú", "Polonia", "Portugal", "Reino Unido", "República Centroafricana", "República Checa", "República del Congo", "República Democrática del Congo", "República Dominicana", "República Sudafricana", "Ruanda", "Rumanía", "Rusia", "Samoa", "San Cristóbal y Nieves", "San Marino", "San Vicente y las Granadinas", "Santa Lucía", "Santo Tomé y Príncipe", "Senegal", "Serbia", "Seychelles", "Sierra Leona", "Singapur", "Siria", "Somalia", "Sri Lanka", "Suazilandia", "Sudán", "Sudán del Sur", "Suecia", "Suiza", "Surinam", "Tailandia", "Tanzania", "Tayikistán", "Timor Oriental", "Togo", "Tonga", "Trinidad y Tobago", "Túnez", "Turkmenistán", "Turquía", "Tuvalu", "Ucrania", "Uganda", "Uruguay", "Uzbekistán", "Vanuatu", "Venezuela", "Vietnam", "Yemen", "Yibuti", "Zambia", "Zimbabue" }));

        Pais1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Pais1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Afgano", "Albanes", "Aleman", "Andorrano", "Antiguano", "Argelino", "Argentino", "Armenio", "Australiano", "Austriaco", "Azerbaiyano", "Bahameno", "Bahreini", "Bangladesi", "Barbadense", "Belga", "Beliceno", "Benines", "Bielorruso", "Birmano", "Boliviano", "Bosnio", "Botsuano", "Brasilero", "Britanico", "Bruneano", "Bulgaro", "Burkines", "Burundes", "Butanes", "Caboverdiano", "Camboyano", "Camerunes", "Canadiense", "Catari", "Ceilanes", "Centroafricano", "Chadiano", "Checo", "Chileno", "Chino", "Chipriota", "Colombiano", "Comorense", "Congoleno", "Congoleno", "Costarricense", "Cristobaleno", "Croata", "Cubano", "Danes", "Dominicano", "Dominiques", "Ecuatoguineano", "Ecuatoriano", "Egipcio", "Emirati", "Eritreo", "Eslovaco", "Esloveno", "Espanol", "Estadounidense", "Estonio", "Etiope", "Filipino", "Finlandes", "Fiyiano", "Frances", "Gabones", "Gambiano", "Georgiano", "Ghanes", "Granadino", "Griego", "Guatemalteco", "Guineano", "Guyanes", "Haitiano", "Hondureno", "Hungaro", "Indio", "Indonesio", "Irani", "Iraqui", "Irlandes", "Islandes", "Israeli", "Italiano", "Jamaiquino", "Japones", "Jordano", "Kazajo", "Keniano", "Kirguiso", "Kiribatiano", "Kuwaiti", "Laosiano", "Lesotense", "Leton", "Libanes", "Liberiano", "Libio", "Liechtensteiniano", "Lituano", "Luxemburgues", "Macedonio", "Malasio", "Malaui", "Maldivo", "Malgache", "Maliense", "Maltes", "Marfileno", "Marroqui", "Marshales", "Mauriciano", "Mauritano", "Mexicano", "Micronesio", "Moldavo", "Monegasco", "Mongol", "Montenegrino", "Mozambiqueno", "Namibio", "Nauruano", "Neerlandes", "Neozelandes", "Nepales", "Nicaraguense", "Nigeriano", "Nigerino", "Norcoreano", "Noruego", "Omani", "Pakistani", "Palauano", "Panameno", "Papu", "Paraguayo", "Peruano", "Polaco", "Portugues", "Ruandes", "Rumano", "Ruso", "Salomonense", "Salvadoreno", "Samoano", "Sanmarinense", "Santalucense", "Santotomense", "Sanvicentino", "Saudi", "Senegales", "Serbio", "Seychellense", "Sierraleones", "Singapurense", "Sirio", "Somali", "Suazi", "Sudafricano", "Sudanes", "Sudsudanes", "Sueco", "Suizo", "Surcoreano", "Surinames", "Tailandes", "Tanzano", "Tayiko", "Timorense", "Togoles", "Tongano", "Trinitense", "Tunecino", "Turco", "Turcomano", "Tuvaluano", "Ucraniano", "Ugandes", "Uruguayo", "Uzbeko", "Vanuatuense", "Vaticano", "Venezolano", "Vietnamita", "Yemeni", "Yibutiano", "Zambiano", "Zimbabuense" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3)
                    .addComponent(jLabel11)
                    .addComponent(jLabel5)
                    .addComponent(jLabel13)
                    .addComponent(jLabel1)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Libro2)
                            .addComponent(Libro3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Pais, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Pais1, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label4)
                            .addComponent(Label6)
                            .addComponent(Label3)
                            .addComponent(Label5)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Cod1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Num1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Label1)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(Cod2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Num2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Libro1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Label2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Label7)))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Cod1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label1)
                    .addComponent(Num1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cod2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Num2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Libro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(Label2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Libro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(Label3))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Libro3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(Label4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Label5)
                    .addComponent(Pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(Label6)
                    .addComponent(Pais1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label7))
                .addGap(36, 36, 36)
                .addComponent(Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
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

    private void Label5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label5MouseExited
        // TODO add your handling code here:
        diag.setVisible(false);
    }//GEN-LAST:event_Label5MouseExited

    private void Label5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label5MouseEntered
        // TODO add your handling code here:
        diag.posicion(Label5.getLocationOnScreen().x-29, Label5.getLocationOnScreen().y+15);
        diag.setVisible(true);
    }//GEN-LAST:event_Label5MouseEntered

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

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        // TODO add your handling code here:
        if(Cod1.getText().equals("0424")){
            Cod1.setBorder(new LineBorder(Color.red));
        }else{
            Cod1.setBorder(new LineBorder(Color.gray));
        }
        if(Num1.getText().equals("1931798")){
            Num1.setBorder(new LineBorder(Color.red));
        }else{
            Num1.setBorder(new LineBorder(Color.gray));
        }
        if(Cod2.getText().equals("0212")){
            Cod2.setBorder(new LineBorder(Color.red));
        }else{
            Cod2.setBorder(new LineBorder(Color.gray));
        }
        if(Num2.getText().equals("4424833")){
            Num2.setBorder(new LineBorder(Color.red));
        }else{
            Num2.setBorder(new LineBorder(Color.gray));
        }
        if(Libro1.getText().equals("Ej. Romeo y Julieta")){
            Libro1.setBorder(new LineBorder(Color.red));
        }else{
            Libro1.setBorder(new LineBorder(Color.gray));
        }
        if(Libro2.getText().equals("Ej. Cien años de soledad")){
            Libro2.setBorder(new LineBorder(Color.red));
        }else{
            Libro2.setBorder(new LineBorder(Color.gray));
        }
        if(Libro3.getText().equals("Ej. Once minutos")){
            Libro3.setBorder(new LineBorder(Color.red));
        }else{
            Libro3.setBorder(new LineBorder(Color.gray));
        }
        if(Ciudad.getText().equals("Ej. Distrito Capital")){
            Ciudad.setBorder(new LineBorder(Color.red));
        }else{
            Ciudad.setBorder(new LineBorder(Color.gray));
        }
    }//GEN-LAST:event_RegistrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Ciudad;
    private javax.swing.JTextField Cod1;
    private javax.swing.JTextField Cod2;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private javax.swing.JLabel Label3;
    private javax.swing.JLabel Label4;
    private javax.swing.JLabel Label5;
    private javax.swing.JLabel Label6;
    private javax.swing.JLabel Label7;
    private javax.swing.JTextField Libro1;
    private javax.swing.JTextField Libro2;
    private javax.swing.JTextField Libro3;
    private javax.swing.JTextField Num1;
    private javax.swing.JTextField Num2;
    private javax.swing.JComboBox<String> Pais;
    private javax.swing.JComboBox<String> Pais1;
    public javax.swing.JButton Registrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}