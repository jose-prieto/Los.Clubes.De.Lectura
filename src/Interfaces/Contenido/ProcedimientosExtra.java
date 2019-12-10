package Interfaces.Contenido;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.Date;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import ControladorBD.QueriesJose;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProcedimientosExtra {
    
    //MainWindow main = new MainWindow ();
    public Color CasillaSelect = new Color(240,240,240);
    public Color FuenteSelect = new Color(51,51,51);
    public Color FuenteNoSelect = new Color(204,204,204);
    
    QueriesJose query = new QueriesJose();
    
    public void FieldListener (JTextField campo){
        String cadena = campo.getText();
        campo.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (campo.getText().equals(cadena)){
                    campo.setText("");
                    campo.setForeground(new Color(51,51,51));
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (campo.getText().equals("")){
                    campo.setForeground(new Color(204,204,255));
                    campo.setText(cadena);
                }
            }
        });

    }
    
    public void AreaListener (JTextArea campo){
        String cadena = campo.getText();
        campo.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (campo.getText().equals(cadena)){
                    campo.setText("");
                    campo.setForeground(new Color(51,51,51));
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (campo.getText().equals("")){
                    campo.setForeground(new Color(204,204,255));
                    campo.setText(cadena);
                }
            }
        });

    }
    /*if (res != null){
            try {
                do{
                    comoIdioma.addItem(res.getString(1));
                }while (res.next());
            } catch (SQLException ex) {
                Logger.getLogger(RegistraMiembro2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }*/
    /*public boolean OrgaAddGrup(int miemID, int clubid, Date fechaNac) {
        
        int edad = query.Edad(fechaNac);
        int size = 0;
        ResultSet rs,rs2;
        
        if (edad > 18){
            rs = query.eleccGrupo(clubid, "Adulto");
            if (rs == null){
                
            }else{
                
            }
        }else if (edad > 12 && edad <19){
            rs = query.eleccGrupo(clubid, "Adulto");
            if (rs == null){
                
            }else{
                
            }
        }else if (edad < 13){
            
        }
    }*/
}