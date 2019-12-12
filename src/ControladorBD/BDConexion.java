package ControladorBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class BDConexion {

    public static final String URL = "jdbc:postgresql://localhost:5432/club_lectura";
    public static final String USERNAME = "postgres";
    public static final String PASSWORD = "24217857";

    public Connection getConnection(String UR) {
        Connection conexion = null;
        try {

            Class.forName("org.postgresql.Driver");
            conexion = (Connection) DriverManager.getConnection(UR, USERNAME, PASSWORD);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return conexion;
    }
    public Connection getConnection() {
        Connection conexion = null;
        try {

            Class.forName("org.postgresql.Driver");
            conexion = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return conexion;
    }

}
