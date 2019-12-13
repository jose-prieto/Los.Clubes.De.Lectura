package Interfaces.Contenido;

import java.awt.Color;
import javax.swing.JOptionPane;

import javax.swing.border.LineBorder;
import ControladorBD.QueriesJose;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RegistraMiembro2 extends javax.swing.JPanel {
    
    ProcedimientosExtra listen = new ProcedimientosExtra ();
    Dialogo diag = new Dialogo ();
    QueriesJose query = new QueriesJose();
    
    public int docid=0;

    public RegistraMiembro2() {
        initComponents();
        
        listen.FieldListener (Cod1);
        listen.FieldListener (Cod2);
        listen.FieldListener (Num1);
        listen.FieldListener (Num2);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Cod1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Label1 = new javax.swing.JLabel();
        Num1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Num2 = new javax.swing.JTextField();
        Cod2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Registrar = new javax.swing.JButton();
        Pais1 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        comoIdioma = new javax.swing.JComboBox<>();
        addIdioma = new javax.swing.JButton();
        Ciudad = new javax.swing.JComboBox<>();
        Pais = new javax.swing.JTextField();
        libro1 = new javax.swing.JComboBox<>();
        libro2 = new javax.swing.JComboBox<>();
        libro3 = new javax.swing.JComboBox<>();

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
        Cod1.setText("ej.424");
        Cod1.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        Cod1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Cod1KeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("ISBN libro 2");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("ISBN libro 1");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("ISBN libro 3");

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

        Num1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Num1.setForeground(new java.awt.Color(204, 204, 255));
        Num1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Num1.setText("ej.1931798");
        Num1.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        Num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num1ActionPerformed(evt);
            }
        });
        Num1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Num1KeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Teléfono 2");

        Num2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Num2.setForeground(new java.awt.Color(204, 204, 255));
        Num2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Num2.setText("ej.4424833");
        Num2.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        Num2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Num2KeyTyped(evt);
            }
        });

        Cod2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Cod2.setForeground(new java.awt.Color(204, 204, 255));
        Cod2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Cod2.setText("ej.212");
        Cod2.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        Cod2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Cod2KeyTyped(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Nacionalidad");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Ciudad de residencia");

        Registrar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Registrar.setText("Registrar");
        Registrar.setEnabled(false);
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });

        Pais1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Pais1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Afgano", "Albanes", "Aleman", "Andorrano", "Antiguano", "Argelino", "Argentino", "Armenio", "Australiano", "Austriaco", "Azerbaiyano", "Bahameno", "Bahreini", "Bangladesi", "Barbadense", "Belga", "Beliceno", "Benines", "Bielorruso", "Birmano", "Boliviano", "Bosnio", "Botsuano", "Brasilero", "Britanico", "Bruneano", "Bulgaro", "Burkines", "Burundes", "Butanes", "Caboverdiano", "Camboyano", "Camerunes", "Canadiense", "Catari", "Ceilanes", "Centroafricano", "Chadiano", "Checo", "Chileno", "Chino", "Chipriota", "Colombiano", "Comorense", "Congoleno", "Congoleno", "Costarricense", "Cristobaleno", "Croata", "Cubano", "Danes", "Dominicano", "Dominiques", "Ecuatoguineano", "Ecuatoriano", "Egipcio", "Emirati", "Eritreo", "Eslovaco", "Esloveno", "Espanol", "Estadounidense", "Estonio", "Etiope", "Filipino", "Finlandes", "Fiyiano", "Frances", "Gabones", "Gambiano", "Georgiano", "Ghanes", "Granadino", "Griego", "Guatemalteco", "Guineano", "Guyanes", "Haitiano", "Hondureno", "Hungaro", "Indio", "Indonesio", "Irani", "Iraqui", "Irlandes", "Islandes", "Israeli", "Italiano", "Jamaiquino", "Japones", "Jordano", "Kazajo", "Keniano", "Kirguiso", "Kiribatiano", "Kuwaiti", "Laosiano", "Lesotense", "Leton", "Libanes", "Liberiano", "Libio", "Liechtensteiniano", "Lituano", "Luxemburgues", "Macedonio", "Malasio", "Malaui", "Maldivo", "Malgache", "Maliense", "Maltes", "Marfileno", "Marroqui", "Marshales", "Mauriciano", "Mauritano", "Mexicano", "Micronesio", "Moldavo", "Monegasco", "Mongol", "Montenegrino", "Mozambiqueno", "Namibio", "Nauruano", "Neerlandes", "Neozelandes", "Nepales", "Nicaraguense", "Nigeriano", "Nigerino", "Norcoreano", "Noruego", "Omani", "Pakistani", "Palauano", "Panameno", "Papu", "Paraguayo", "Peruano", "Polaco", "Portugues", "Ruandes", "Rumano", "Ruso", "Salomonense", "Salvadoreno", "Samoano", "Sanmarinense", "Santalucense", "Santotomense", "Sanvicentino", "Saudi", "Senegales", "Serbio", "Seychellense", "Sierraleones", "Singapurense", "Sirio", "Somali", "Suazi", "Sudafricano", "Sudanes", "Sudsudanes", "Sueco", "Suizo", "Surcoreano", "Surinames", "Tailandes", "Tanzano", "Tayiko", "Timorense", "Togoles", "Tongano", "Trinitense", "Tunecino", "Turco", "Turcomano", "Tuvaluano", "Ucraniano", "Ugandes", "Uruguayo", "Uzbeko", "Vanuatuense", "Vaticano", "Venezolano", "Vietnamita", "Yemeni", "Yibutiano", "Zambiano", "Zimbabuense" }));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Agregar idioma");

        comoIdioma.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        addIdioma.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        addIdioma.setText("Agregar idioma");
        addIdioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addIdiomaActionPerformed(evt);
            }
        });

        Ciudad.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        Pais.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Pais.setForeground(new java.awt.Color(204, 204, 255));
        Pais.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        Pais.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        Pais.setEnabled(false);

        libro1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        libro2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        libro3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
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
                                .addComponent(Num2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Pais1, 0, 446, Short.MAX_VALUE)
                                    .addComponent(Pais)
                                    .addComponent(libro2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(libro3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Ciudad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(libro1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(comoIdioma, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(addIdioma)))
                                .addGap(46, 46, 46))))))
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
                    .addComponent(jLabel7)
                    .addComponent(libro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(libro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(libro3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(Pais1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(comoIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
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

    public boolean val() {
        boolean val = true;

        if (Cod1.getText().equals("ej.424")) {
            Cod1.setBorder(new LineBorder(Color.red));
            val = false;
        }else if (Cod1.getText().length() < 3) {
            Cod1.setBorder(new LineBorder(Color.red));
            JOptionPane.showMessageDialog(null, "Los códigos de teléfono deben tener 3 dígitos", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            Cod1.setBorder(new LineBorder(Color.gray));
        }
        if (Num1.getText().equals("ej.1931798")) {
            Num1.setBorder(new LineBorder(Color.red));
            val = false;
        }else if (Num1.getText().length() < 7) {
            Num1.setBorder(new LineBorder(Color.red));
            JOptionPane.showMessageDialog(null, "Los números de teléfono deben tener 7 dígitos", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            Num1.setBorder(new LineBorder(Color.gray));
        }
        if (!Cod2.getText().equals("ej.212") && Cod2.getText().length() < 3) {
            Cod2.setBorder(new LineBorder(Color.red));
            JOptionPane.showMessageDialog(null, "Los códigos de teléfono deben tener 3 dígitos", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            Cod2.setBorder(new LineBorder(Color.gray));
        }
        if (!Num2.getText().equals("ej.4424833") && Num2.getText().length() < 7) {
            Num2.setBorder(new LineBorder(Color.red));
            JOptionPane.showMessageDialog(null, "Los números de teléfono deben tener 7 dígitos", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            Num2.setBorder(new LineBorder(Color.gray));
        }
        if (val == false) {
            JOptionPane.showMessageDialog(null, "Debe rellenar todos los campos que son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (libro1.getSelectedIndex() == libro2.getSelectedIndex() || libro1.getSelectedIndex() == libro3.getSelectedIndex() || 
                libro2.getSelectedIndex() == libro3.getSelectedIndex()){
            JOptionPane.showMessageDialog(null, "Los libros no deben estar repetidos", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        return val;
    }
    
    public int num(String num) {
        
        return Integer.parseInt(num);
    }
    
    public void inicio(String club){
        ResultSet res;
        int paiscod = query.paisclub(club);
        Pais.setText(query.paisnom(paiscod));
        
        res = query.ciudad(paiscod);
        Ciudad.removeAllItems();
        if (res != null){
            try {
                do{
                    Ciudad.addItem(res.getString(1));
                }while (res.next());
                Ciudad.setSelectedIndex(0);
            } catch (SQLException ex) {
                Logger.getLogger(RegistraMiembro2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        res = query.idiomas();
        comoIdioma.removeAllItems();
        if (res != null){
            try {
                do{
                    comoIdioma.addItem(res.getString(1));
                }while (res.next());
            } catch (SQLException ex) {
                Logger.getLogger(RegistraMiembro2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        res = query.libros();
        libro1.removeAllItems();
        libro2.removeAllItems();
        libro3.removeAllItems();
        if (res != null){
            try {
                do{
                    libro1.addItem(res.getString(1));
                    libro2.addItem(res.getString(1));
                    libro3.addItem(res.getString(1));
                }while (res.next());
            } catch (SQLException ex) {
                Logger.getLogger(RegistraMiembro2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public boolean ActMiembro(int edad, int idmiem, int idrep, int exist){
        
        if (edad < 19 && idrep != 0 && exist == 1){
            if (!query.ActMiembM(idrep, idmiem, query.paiscod(Ciudad.getSelectedItem().toString()))){
                return false;
            }
        }else if (edad < 19 && idrep != 0 && (exist == 2 || exist == 0)){
            if (!query.ActMiemb(idrep, idmiem, query.paiscod(Ciudad.getSelectedItem().toString()))){
                return false;
            }
        }else if (edad > 18){
            if (!query.ActAdult(idmiem, query.paiscod(Ciudad.getSelectedItem().toString()))){
                return false;
            }
        }
        if(!query.CrearTelMiem(num(Cod1.getText()), num(Num1.getText()), idmiem)){
                return false;
            }
        
        if (!Cod2.getText().equals("ej.212") && !Num2.getText().equals("ej.4424833") && Cod2.getText().length() == 3 && Num2.getText().length() == 7){
            if(!query.CrearTelMiem(num(Cod2.getText()), num(Num2.getText()), idmiem)){
                return false;
            }
        }
        if (!query.miemPref(idmiem, libro1.getSelectedItem().toString(), 1)){
            return false;
        }
        if (!query.miemPref(idmiem, libro2.getSelectedItem().toString(), 2)){
            return false;
        }
        if (!query.miemPref(idmiem, libro3.getSelectedItem().toString(), 3)){
            return false;
        }
        if (!query.libMiem(idmiem, libro1.getSelectedItem().toString())){
            return false;
        }
        if (!query.libMiem(idmiem, libro2.getSelectedItem().toString())){
            return false;
        }
        if (!query.libMiem(idmiem, libro3.getSelectedItem().toString())){
            return false;
        }
        
        return true;
    }
    
    public void vaciar (){
        Cod1.setText("ej.424");
        Cod1.setForeground(new Color(204,204,255));
        Num1.setText("ej.1931798");
        Num1.setForeground(new Color(204,204,255));
        Cod2.setText("ej.212");
        Cod2.setForeground(new Color(204,204,255));
        Registrar.setEnabled(false);
    }
    
    private void Cod1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cod1KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if (c < '0' || c > '9' || Cod1.getText().length() > 2){
            evt.consume();
        }
    }//GEN-LAST:event_Cod1KeyTyped

    private void Num1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Num1KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if (c < '0' || c > '9' || Num1.getText().length() > 6){
            evt.consume();
        }
    }//GEN-LAST:event_Num1KeyTyped

    private void Cod2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cod2KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if (c < '0' || c > '9' || Cod2.getText().length() > 2){
            evt.consume();
        }
    }//GEN-LAST:event_Cod2KeyTyped

    private void Num2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Num2KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if (c < '0' || c > '9' || Num2.getText().length() > 6){
            evt.consume();
        }
    }//GEN-LAST:event_Num2KeyTyped

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegistrarActionPerformed

    private void Num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Num1ActionPerformed

    private void addIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addIdiomaActionPerformed
        // TODO add your handling code here:
        if (query.addIdiom(docid, comoIdioma.getSelectedItem().toString())){
            Registrar.setEnabled(true);
        }
    }//GEN-LAST:event_addIdiomaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> Ciudad;
    private javax.swing.JTextField Cod1;
    private javax.swing.JTextField Cod2;
    private javax.swing.JLabel Label1;
    private javax.swing.JTextField Num1;
    private javax.swing.JTextField Num2;
    private javax.swing.JTextField Pais;
    private javax.swing.JComboBox<String> Pais1;
    public javax.swing.JButton Registrar;
    public javax.swing.JButton addIdioma;
    private javax.swing.JComboBox<String> comoIdioma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JComboBox<String> libro1;
    private javax.swing.JComboBox<String> libro2;
    private javax.swing.JComboBox<String> libro3;
    // End of variables declaration//GEN-END:variables
}
