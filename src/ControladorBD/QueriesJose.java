package ControladorBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;
import javax.swing.JOptionPane;

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
    
    public boolean ciExist(int ci) {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;

            ps = con.prepareStatement("SELECT doc_id "
                    + "FROM miembro "
                    + "WHERE doc_id = ?;");
            ps.setInt(1, ci);
            
            res = ps.executeQuery();

            if (res.next()) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            
        }
        
        return true;
    }
    
    public int Edad(Date nac) {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;

            ps = con.prepareStatement("SELECT date_part('year', age(current_date, ?));");
            ps.setDate(1, nac);
                   
            res = ps.executeQuery();

            if (res.next()) {
                return res.getInt(1);
            }

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            
        }
        
        return 40;
    }
    
    public Date fechaMax() {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;

            ps = con.prepareStatement("SELECT current_date - interval '9 year';");
                   
            res = ps.executeQuery();

            if (res.next()) {
                return res.getDate(1);
            }

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
            
        }
        
        return null;
    }

}
