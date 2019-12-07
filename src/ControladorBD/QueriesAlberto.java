package ControladorBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.Date;

//import DBController.DBConnection;
public class QueriesAlberto {

    BDConexion conexion = new BDConexion();

 public void CrearLibro(String OriTitulo, String Sinopsis, int Year, int Pag, String EspTitulo, String Tema, int Edit) {
        
        String SQL = "INSERT INTO public.libro(\n" +
            "	isbn, lib_tit_original, sinopsis, lib_pag, titulo_esp, tema_princ, clasi_id, edit_id, lib_ano)\n" +
            "	VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";
        int filasafectadas = 0;
        int isbn = 3;

        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setInt(1, isbn);
            ps.setString(2, OriTitulo);
            ps.setString(3, Sinopsis);
            ps.setInt(4, Pag);
            ps.setString(5, EspTitulo);
            ps.setString(6, Tema);
            ps.setInt(7, 1);
            ps.setInt(8, Edit);
            ps.setInt(9, Year);
            
            filasafectadas = ps.executeUpdate();

            if (filasafectadas != 0) {
                JOptionPane.showMessageDialog(null, "Libro creado satisfactoriamente", "Información", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        
            
        }
 
     
 
 public void CrearAutorLibro(String NomAutor, String ApeAutor){
      String SQL = "INSERT INTO public.autor(\n" +
            "   aut_nombre1, aut_ape1, isbn)\n" +
            "	VALUES (?, ?, ?);";
        int filasafectadas = 0;
        int isbn = 3;
        
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setString(1, NomAutor);
            ps.setString(2, ApeAutor);
            ps.setInt(3, isbn);
     
            filasafectadas = ps.executeUpdate();

            if (filasafectadas != 0) {
                JOptionPane.showMessageDialog(null, "Libro creado satisfactoriamente", "Información", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }

     
 }
 
    public void BuscarHist(int ci) {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;
            Date fechai;
            int club;
            ps = con.prepareStatement("SELECT doc_id,fechai_mie,club_id  "
                    + "FROM hist_miembro "
                    + "WHERE doc_id = ?;");
            ps.setInt(1, ci);
            
            res = ps.executeQuery();

            if (res.next()) {
                fechai = res.getDate("fechai_mie");
                club = res.getInt("club_id");
                Pago(ci,fechai,club);
                
            } else {
               
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            
            
        }
        
        
    }
 
 
  public void Pago(int ci, Date fechai, int club){
      String SQL = "INSERT INTO public.pago(\n" +
            "   pago_id, fechai_mie, club_id, doc_id, pago_fecha)\n" +
            "	VALUES (?, ?, ?, ?, ?);";
        int filasafectadas = 0;
        
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setInt(1, 1);
            ps.setDate(2, fechai);
            ps.setInt(3, club);
            ps.setInt(4, ci);
            ps.setDate(5,fechai);
            
     
            filasafectadas = ps.executeUpdate();

            if (filasafectadas != 0) {
                JOptionPane.showMessageDialog(null, "Libro creado satisfactoriamente", "Información", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }

     
 }

}
