package ControladorBD;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

//import DBController.DBConnection;
public class QueriesDaniel {

     BDConexion conexion = new BDConexion();

     public void CrearIdioma(String idio_nombre) {
        
        String SQL = "INSERT INTO public.idioma(\n" +
            "	idio_nombre)\n" +
            "	VALUES (?);";
        int filasafectadas = 0;

        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setString(1, idio_nombre);

            
            filasafectadas = ps.executeUpdate();

            if (filasafectadas != 0) {
                JOptionPane.showMessageDialog(null, "Idioma creado satisfactoriamente", "Información", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        
            
        }
     public void CrearDireccion_lugar(String dir_tipo, String dir_nombre,String moneda, String nacionalidad, int dir_id_padre) {
        
        String SQL = "INSERT INTO public.direccion_lugar(\n" +
            "	dir_tipo, dir_nombre, moneda, nacionalidad, dir_id_padre)\n" +
            "	VALUES (?,?,?,?,?);";
        int filasafectadas = 0;

        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setString(1, dir_tipo);
            ps.setString(2, dir_nombre);
            ps.setString(3, moneda);
            ps.setString(4, nacionalidad);
            ps.setInt(5, dir_id_padre);
            
            filasafectadas = ps.executeUpdate();

            if (filasafectadas != 0) {
                JOptionPane.showMessageDialog(null, "Idioma creado satisfactoriamente", "Información", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        
            
        }
        public void CrearInstitucion(String inst_nombre, String desc, int dir_id) {
        
        String SQL = "INSERT INTO public.institucion(\n" +
            "	inst_nombre, desc, dir_id)\n" +
            "	VALUES (?,?,?);";
        int filasafectadas = 0;

        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setString(1, inst_nombre);
            ps.setString(2, desc);
            ps.setInt(3, dir_id);
            
            filasafectadas = ps.executeUpdate();

            if (filasafectadas != 0) {
                JOptionPane.showMessageDialog(null, "Idioma creado satisfactoriamente", "Información", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        
            
        }
        public void CrearIdioma_miembro(int doc_id, int idio_id) {
        
        String SQL = "INSERT INTO public.idioma(\n" +
            "	idio_nombre)\n" +
            "	VALUES (?,?);";
        int filasafectadas = 0;

        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setInt(1, doc_id);
            ps.setInt(2, idio_id);
            
            filasafectadas = ps.executeUpdate();

            if (filasafectadas != 0) {
                JOptionPane.showMessageDialog(null, "Idioma creado satisfactoriamente", "Información", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        
            
        }
        public void CrearGrupo(int grup_id, int club_id, String grupo_tipo, Date dia, Date fechai, Date fechaf) {
        
        String SQL = "INSERT INTO public.idioma(\n" +
            "	idio_nombre)\n" +
            "	VALUES (?,?,?,?,?,?);";
        int filasafectadas = 0;

        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setInt(1, grup_id);
            ps.setInt(2, club_id);
            ps.setString(3, grupo_tipo);
            ps.setDate(4, dia);
            ps.setDate(5, fechai);
            ps.setDate(5, fechaf);
            
            filasafectadas = ps.executeUpdate();

            if (filasafectadas != 0) {
                JOptionPane.showMessageDialog(null, "Idioma creado satisfactoriamente", "Información", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        
            
        }

}
