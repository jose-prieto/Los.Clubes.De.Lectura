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
            if (dir_id_padre == 0){
                ps.setNull(5, java.sql.Types.NUMERIC);
            }
            else{
                ps.setInt(5, dir_id_padre);
            }
            filasafectadas = ps.executeUpdate();

            if (filasafectadas != 0) {
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }   
        }
     
     public void CrearClasificacion(String clasi_nombre, String clasi_tipo, int clasi_padre) {
        
            String SQL = "INSERT INTO public.clasificacion(\n" +
            "	clasi_nombre, clasi_tipo, clasi_padre)\n" +
            "	VALUES (?,?,?);";
            int filasafectadas = 0;

            try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setString(1, clasi_nombre);
            ps.setString(2, clasi_tipo);
            if (clasi_padre == 0){
                ps.setNull(3, java.sql.Types.NUMERIC);
            }
            else{
                ps.setInt(3, clasi_padre);
            }

            
            
            filasafectadas = ps.executeUpdate();

            if (filasafectadas != 0) {
            }

            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            }
        
            
        }
     
        public void CrearInstitucion(String inst_nombre, String inst_desc, int dir_id) {
        
            String SQL = "INSERT INTO public.institucion(\n" +
            "	inst_nombre, inst_desc, dir_id)\n" +
            "	VALUES (?,?,?);";
            int filasafectadas = 0;

            try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setString(1, inst_nombre);
            ps.setString(2, inst_desc);
            ps.setInt(3, dir_id);
            
            filasafectadas = ps.executeUpdate();

            if (filasafectadas != 0) {
            }

            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            }
        
            
        }
        public void CrearIdioma_miembro(int doc_id, int idio_id) {
        
            String SQL = "INSERT INTO public.idioma_miembro(\n" +
            "	doc_id,idio_id)\n" +
            "	VALUES (?,?);";
            int filasafectadas = 0;

            try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setInt(1, doc_id);
            ps.setInt(2, idio_id);
            
            filasafectadas = ps.executeUpdate();

            if (filasafectadas != 0) {
            }

            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            }
        
            
        }
        public void CrearGrupo(int club_id, String grup_tipo, String dia, int horai, int horaf) {
        
            String SQL = "INSERT INTO public.grupo(\n" +
            " club_id, grup_tipo, dia, horai, horaf)\n" +
            "	VALUES (?,?,?,?,?);";
            int filasafectadas = 0;

            try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setInt(1, club_id);
            ps.setString(2, grup_tipo);
            ps.setString(3, dia);
            ps.setInt(4, horai);
            ps.setInt(5, horaf);
            
            filasafectadas = ps.executeUpdate();

            if (filasafectadas != 0) {
            }

            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            }
        
            
            }
        public void CrearAsociacion(int club1, int club2) {
        
            String SQL = "INSERT INTO public.asociacion(\n" +
            "	club1, club2)\n" +
            "	VALUES (?,?);";
            int filasafectadas = 0;

            try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setInt(1, club1);
            ps.setInt(2, club2);
          
            
            filasafectadas = ps.executeUpdate();

            if (filasafectadas != 0) {
            }

            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            }
        
            
        }
       
        public void CrearAuditorio(int audi_capacidad, String audi_nombre, int dir_id, int club_id) {
        
            String SQL = "INSERT INTO public.auditorio(\n" +
            "	audi_capacidad, audi_nombre, dir_id, club_id)\n" +
            "	VALUES (?,?,?,?);";
            int filasafectadas = 0;

            try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setInt(1, audi_capacidad);
            ps.setString(2, audi_nombre);
            ps.setInt(3, dir_id);
            
            if (club_id == 0){
                ps.setNull(4, java.sql.Types.NUMERIC);
            }
            else{
                ps.setInt(4, club_id);
            }
            
          
            
            filasafectadas = ps.executeUpdate();

            if (filasafectadas != 0) {
            }

            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            }
        
            
        }
        
         public void CrearAutor(int audi_capacidad, String audi_nombre, int dir_id, int club_id) {
        
            String SQL = "INSERT INTO public.auditorio(\n" +
            "	audi_capacidad, audi_nombre, dir_id, club_id)\n" +
            "	VALUES (?,?,?,?);";
            int filasafectadas = 0;

            try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setInt(1, audi_capacidad);
            ps.setString(2, audi_nombre);
            ps.setInt(3, dir_id);
            
            if (club_id == 0){
                ps.setNull(4, java.sql.Types.NUMERIC);
            }
            else{
                ps.setInt(4, club_id);
            }
            
          
            
            filasafectadas = ps.executeUpdate();

            if (filasafectadas != 0) {
            }

            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            }
        
            
        }
         
        public void CrearEditorial(String edit_nombre, int dir_id) {
        
            String SQL = "INSERT INTO public.editorial(\n" +
            " edit_nombre, dir_id)\n" +
            "	VALUES (?,?);";
            int filasafectadas = 0;

            try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setString(1, edit_nombre);
            ps.setInt(2, dir_id);
         
            
          
            
            filasafectadas = ps.executeUpdate();

            if (filasafectadas != 0) {
            }

            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            }
        
            
        }
        
        
        
        public boolean clubExist(int club_id) {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;

            ps = con.prepareStatement("SELECT club_id "
                    + "FROM club "
                    + "WHERE club_id = ?;");
            ps.setInt(1, club_id);
            
            res = ps.executeQuery();

            if (res.next()) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            return false;
            
        }
    }
        
              
}
