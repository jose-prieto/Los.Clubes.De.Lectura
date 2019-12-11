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
import java.util.logging.Level;
import java.util.logging.Logger;

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
    public boolean addmiemGrup(int miemID, int clubid, Date fechaNac) {
        
        int edad = query.Edad(fechaNac);
        int size = 0;
        int n = 0;
        String h = "";
        ResultSet rs,rs2;
        
        if (edad >= 19){
            h = "Adulto";
            n = 15;
        }else if (edad >= 13 && edad <= 18){
            h = "Joven";
            n = 10;
        }else{
            h = "Nino";
            n = 10;
        }
        
        rs = query.eleccGrupo(clubid, h);
        
        if (rs == null){
            //creargrupo
            //agregar a grupo
            return true;
        }else{
            try {
                do{
                    rs2 = query.miemGrupo(rs.getInt(1));
                    try {
                        do{
                           size++;
                        }while (rs2.next());
                    } catch (SQLException ex) {
                        Logger.getLogger(RegistraMiembro2.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    if (size < n){
                        //return agregarmiembro
                    }
                }while (rs.next());
            } catch (SQLException ex) {
                Logger.getLogger(RegistraMiembro2.class.getName()).log(Level.SEVERE, null, ex);
            }
            //return agregar grupo adulto
            //return agregar miembro a grupo anterior
        }
            
        return false;
    }
    
    public boolean removemiemGrup(int grupo) {
        
        String tipo = "";
        int club;
        int n = 0;
        String h = "";
        ResultSet rs = query.bucarGrupo(grupo);
        
        try {
            
            tipo = rs.getString(2);
            club = rs.getInt(1);
            
            } catch (SQLException ex) {
                Logger.getLogger(RegistraMiembro2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if (edad >= 19){
            h = "Adulto";
            n = 15;
        }else if (edad >= 13 && edad <= 18){
            h = "Joven";
            n = 10;
        }else{
            h = "Nino";
            n = 10;
        }
        
        rs = query.eleccGrupo(clubid, h);
        
        if (rs == null){
            //creargrupo
            //agregar a grupo
            return true;
        }else{
            try {
                do{
                    rs2 = query.miemGrupo(rs.getInt(1));
                    try {
                        do{
                           size++;
                        }while (rs2.next());
                    } catch (SQLException ex) {
                        Logger.getLogger(RegistraMiembro2.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    if (size < n){
                        //return agregarmiembro
                    }
                }while (rs.next());
            } catch (SQLException ex) {
                Logger.getLogger(RegistraMiembro2.class.getName()).log(Level.SEVERE, null, ex);
            }
            //return agregar grupo adulto
            //return agregar miembro a grupo anterior
        }
            
        return false;
    }
}