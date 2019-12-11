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
    
    public boolean addmiemGrup(int miemID, int clubid, Date fechaNac) {
        
        int edad = query.Edad(fechaNac);
        int size = 0;
        int n;
        String tipo;
        ResultSet rs,rs2;
        
        if (edad >= 19){
            tipo = "adulto";
            n = 15;
        }else if (edad >= 13 && edad <= 18){
            tipo = "joven";
            n = 10;
        }else{
            tipo = "nino";
            n = 10;
        }
        
        rs = query.eleccGrupo(clubid, tipo);
        
        if (rs == null){
            query.newGrup(clubid, tipo);
            return addmiemGrup(miemID, clubid, fechaNac);
        }else{
            try {
                do{
                    rs2 = query.miemGrupo(rs.getInt(1));
                    size = 0;
                    try {
                        do{
                           size++;
                        }while (rs2.next());
                        if (size < n){
                            query.grupAdd(rs.getInt(1), clubid, miemID);
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(RegistraMiembro2.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }while (rs.next());
            } catch (SQLException ex) {
                Logger.getLogger(RegistraMiembro2.class.getName()).log(Level.SEVERE, null, ex);
            }
            query.newGrup(clubid, tipo);
            return addmiemGrup(miemID, clubid, fechaNac);
        }
    }
    
    public boolean removemiemGrup(int grupo) {
        
        int size = 0;
        int n, clubid;
        String tipo;
        ResultSet rs,rs2;
        
        rs2 = query.bucarGrupo(grupo);
        try {
            clubid = rs2.getInt(1);
            tipo = rs2.getString(2);
        } catch (SQLException ex) {
            Logger.getLogger(RegistraMiembro2.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        rs = query.eleccGrupo(clubid, tipo);
        
        if (rs == null){
            query.newGrup(clubid, tipo);
            return addmiemGrup(miemID, clubid, fechaNac);
        }else{
            try {
                do{
                    rs2 = query.miemGrupo(rs.getInt(1));
                    try {
                        do{
                           size++;
                        }while (rs2.next());
                        if (size < n){
                            query.grupAdd(rs.getInt(1), clubid, miemID);
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(RegistraMiembro2.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }while (rs.next());
            } catch (SQLException ex) {
                Logger.getLogger(RegistraMiembro2.class.getName()).log(Level.SEVERE, null, ex);
            }
            query.newGrup(clubid, tipo);
            return addmiemGrup(miemID, clubid, fechaNac);
        }
    }
}