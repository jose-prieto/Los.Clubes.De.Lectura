package ControladorBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

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
 
 
 

}
