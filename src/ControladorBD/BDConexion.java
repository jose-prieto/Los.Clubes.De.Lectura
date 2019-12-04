package ControladorBD;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

import Interfaces.BDMensaje;

public class BDConexion {
    
    BDMensaje mensaje = new BDMensaje();
    
    public static final String URL = "jdbc:postgresql://localhost:5432/CLUB_LECTUR";
    public static final String USERNAME = "postgres";
    public static final String PASSWORD = "24217857";

    public Connection getConnection() {
        Connection conexion = null;
        try {

            Class.forName("org.postgresql.Driver");
            conexion = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error",JOptionPane.ERROR_MESSAGE);
        }
        return conexion;
    }

}
