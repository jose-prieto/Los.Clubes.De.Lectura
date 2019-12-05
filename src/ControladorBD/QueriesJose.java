package ControladorBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;
import javax.swing.JOptionPane;

//import DBController.DBConnection;


/*BDConexion conexion = new BDConexion();

    public void CrearMiembAdult(int id, String nombre1, String apellido1, String genero, Date fecha_nac) {
        try {
            Connection con = null;
            con = conexion.getConnection();

            PreparedStatement ps;
            ResultSet res;

            ps = con.prepareStatement("INSERT INTO public.miembro(\n" +
            "	doc_id, miemb_nombre1, miemb_ape1, miemb_genero, miemb_fecha_nac)\n" +
            "	VALUES (?, ?, ?, ?, ?);");
            
            ps.setInt(1, id);
            ps.setString(2, nombre1);
            ps.setString(3, apellido1);
            ps.setString(4, genero);
            ps.setDate(5, fecha_nac);
            
            res = ps.executeQuery();

            if (res.next()) {
                JOptionPane.showMessageDialog(null, "Miembro creado satisfactoriamente", "Información", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
            System.out.println(e);
            if (!e.equals("org.postgresql.util.PSQLException: La consulta no retornó ningún resultado.")){
                JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }*/
/*public int updateLastName(int id, String lastName) {
        String SQL = "UPDATE actor "
                + "SET last_name = ? "
                + "WHERE actor_id = ?";
 
        int affectedrows = 0;
 
        try (Connection conn = connect();
                PreparedStatement pstmt = conn.prepareStatement(SQL)) {
 
            pstmt.setString(1, lastName);
            pstmt.setInt(2, id);
 
            affectedrows = pstmt.executeUpdate();
 
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return affectedrows;
    }*/
public class QueriesJose {

    BDConexion conexion = new BDConexion();

    public void CrearMiembAdult(int id, String nombre1, String apellido1, String genero, Date fecha_nac) {
        
        String SQL = "INSERT INTO public.miembro(\n" +
            "	doc_id, miemb_nombre1, miemb_ape1, miemb_genero, miemb_fecha_nac)\n" +
            "	VALUES (?, ?, ?, ?, ?);";
        int filasafectadas = 0;
        
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setInt(1, id);
            ps.setString(2, nombre1);
            ps.setString(3, apellido1);
            ps.setString(4, genero);
            ps.setDate(5, fecha_nac);
            
            filasafectadas = ps.executeUpdate();

            if (filasafectadas != 0) {
                JOptionPane.showMessageDialog(null, "Miembro creado satisfactoriamente", "Información", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
