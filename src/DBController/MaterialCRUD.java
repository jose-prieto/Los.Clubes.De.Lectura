package DBController;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

//import DBController.DBConnection;
public class MaterialCRUD {

    DBConnection connectivity = new DBConnection();

    public void AddNewMaterial() {
        try {
            Connection con = null;
            con = connectivity.getConnection();

            PreparedStatement ps;
            ResultSet res;

            ps = con.prepareStatement("SELECT * FROM users");
            res = ps.executeQuery();

            if (res.next()) {
                JOptionPane.showMessageDialog(null, res.getString("UserName") + " ");
            } else {
                System.out.println("No Existen Datos");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
