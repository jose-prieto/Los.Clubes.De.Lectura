package ControladorBD;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class BDConexion {
    //../Images/LogoApp.png
    public static final String URL = "PGLectura.sql";
    //public static final String URL = "jdbc:postgresql://localhost:5432/test";
    public static final String USERNAME = "postgres";
    public static final String PASSWORD = "24217857";

    public Connection getConnection() {
        Connection con = null;
        try {

            Class.forName("org.postgresql.Driver");
            con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
            JOptionPane.showMessageDialog(null, "Successfull Sonnection");

        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }

}
