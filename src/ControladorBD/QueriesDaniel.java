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
                JOptionPane.showMessageDialog(null, "Direccion_lugar creado satisfactoriamente", "Información", JOptionPane.INFORMATION_MESSAGE);
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
                JOptionPane.showMessageDialog(null, "Institucion creado satisfactoriamente", "Información", JOptionPane.INFORMATION_MESSAGE);
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
                JOptionPane.showMessageDialog(null, "Idioma_miembro creado satisfactoriamente", "Información", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        
            
        }
        public void CrearGrupo(int grup_id, int club_id, String grup_tipo, Date dia, Date fechai, Date fechaf) {
        
        String SQL = "INSERT INTO public.grupo(\n" +
            "	grup_id, club_id, grup_tipo, dia, fechai, fechaf)\n" +
            "	VALUES (?,?,?,?,?,?);";
        int filasafectadas = 0;

        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setInt(1, grup_id);
            ps.setInt(2, club_id);
            ps.setString(3, grup_tipo);
            ps.setDate(4, dia);
            ps.setDate(5, fechai);
            ps.setDate(6, fechaf);
            
            filasafectadas = ps.executeUpdate();

            if (filasafectadas != 0) {
                JOptionPane.showMessageDialog(null, "Grupo creado satisfactoriamente", "Información", JOptionPane.INFORMATION_MESSAGE);
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
                JOptionPane.showMessageDialog(null, "Asociacion creado satisfactoriamente", "Información", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        
            
        }
        
        public void CrearHist_miembro(Date fechai_mie, int club_id, int doc_id, String estatus_mie, Date fechaf_mie, String motivo_retiro) {
        
        String SQL = "INSERT INTO public.hist_miembro(\n" +
            "	fechai_mie, club_id, doc_id, estatus_mie, fechaf_mie, motivo_retiro)\n" +
            "	VALUES (?,?);";
        int filasafectadas = 0;

        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setDate(1, fechai_mie);
            ps.setInt(2, club_id);
            ps.setInt(3, doc_id);
            ps.setString(4, estatus_mie);
            ps.setDate(5, fechaf_mie);
            ps.setString(6, motivo_retiro);
          
            
            filasafectadas = ps.executeUpdate();

            if (filasafectadas != 0) {
                JOptionPane.showMessageDialog(null, "Hist_miembro creado satisfactoriamente", "Información", JOptionPane.INFORMATION_MESSAGE);
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
