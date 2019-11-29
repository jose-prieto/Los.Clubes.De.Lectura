package Interfaces.Contenido;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class OpcionesExtra {
    
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
    
}