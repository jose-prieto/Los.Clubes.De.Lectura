package DBController;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DBConnection {

    public static final String URL = "jdbc:mysql://localhost:3306/depotdb?serverTimezone=UTC";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "24217857";

    public Connection getConnection() {
        Connection con = null;
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
            JOptionPane.showMessageDialog(null, "Successfull Sonnection");

        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }

}