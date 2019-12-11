package ControladorBD;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class QueriesAlberto {

    BDConexion conexion = new BDConexion();

 public void CrearLibro(int isbn, String OriTitulo, String Sinopsis, int Year, int Pag, String EspTitulo, String Tema, int Edit, int clasif) {
        
        String SQL = "INSERT INTO public.libro(\n" +
            "	isbn, lib_tit_original, sinopsis, lib_pag, titulo_esp, tema_princ, clasi_id, edit_id, lib_ano)\n" +
            "	VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";
        int filasafectadas = 0;

        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setInt(1, isbn);
            ps.setString(2, OriTitulo);
            ps.setString(3, Sinopsis);
            ps.setInt(4, Pag);
            ps.setString(5, EspTitulo);
            ps.setString(6, Tema);
            ps.setInt(7, clasif);
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
 
     
  public void CrearAutorLibro(String NomAutor, String ApeAutor, int isbn){
      String SQL = "INSERT INTO public.autor(\n" +
            "   aut_nombre1, aut_ape1, isbn)\n" +
            "	VALUES (?, ?, ?);";
        int filasafectadas = 0;
        
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setString(1, NomAutor);
            ps.setString(2, ApeAutor);
            ps.setInt(3, isbn);
     
            filasafectadas = ps.executeUpdate();

            if (filasafectadas != 0) {
                JOptionPane.showMessageDialog(null, "Autor creado satisfactoriamente", "Información", JOptionPane.INFORMATION_MESSAGE);
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
            return false;
            
        }
    }
     
 
  public boolean libroExist(int i) {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;

            ps = con.prepareStatement("SELECT isbn "
                    + "FROM libro "
                    + "WHERE isbn = ?;");
            ps.setInt(1, i);
            
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
     
  
 /* public void BuscarHist(int ci) {
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

            res.next();
                fechai = res.getDate("fechai_mie");
                club = res.getInt("club_id");
                Pago(ci,fechai,club);
                
           
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            
            
        }
        
        
    }*/
 
 
public void Pago(int ci){
      String SQL = "INSERT INTO public.pago(\n" +
            "     fechai_mie, club_id, doc_id)\n" +
            "	VALUES ((SELECT fechai_mie FROM public.hist_miembro WHERE doc_id=? AND fechaf_mie is null),(SELECT club_id FROM public.hist_miembro WHERE doc_id=? AND fechaf_mie is null), ?);";
        int filasafectadas = 0;
        
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setInt(1,ci);
            ps.setInt(2, ci);
            ps.setInt(3, ci);        
     
            filasafectadas = ps.executeUpdate();
            
            if (filasafectadas != 0) {
                JOptionPane.showMessageDialog(null, "Pago creado satisfactoriamente", "Información", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }

     
 }
  
  
 public void CrearClub(String nombre, String direccion, int codp, boolean cuota, int idio, int ciudad) {

        String SQL = "INSERT INTO public.club(\n" +
            "	 club_nombre, direccion, cod_postal, cuota, idio_id, dir_id)\n" +
            "	VALUES (lower(?), lower(?), ?, ?, ?, ?);";
        int filasafectadas = 0;
        
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
        
            ps.setString(1, nombre);
            ps.setString(2, direccion);
            ps.setInt(3, codp);
            ps.setBoolean(4, cuota);
            ps.setInt(5, idio);
            ps.setInt(6, ciudad);

            
            filasafectadas = ps.executeUpdate();

            if (filasafectadas != 0) {
                JOptionPane.showMessageDialog(null, "Club creado satisfactoriamente", "Información", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        
            
        }
  
  
 public void CrearClubI(String nombre, String direccion, int codp, boolean cuota, int idio, int ciudad) {

        String SQL = "INSERT INTO public.club(\n" +
            "	 club_nombre, direccion, cod_postal, cuota, idio_id, dir_id, inst_id)\n" +
            "	VALUES (lower(?), lower(?), ?, ?, ?, ?, (SELECT inst_id from institucion WHERE inst_id = (SELECT MAX(inst_id) FROM institucion)));";
        int filasafectadas = 0;
        
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
        
            ps.setString(1, nombre);
            ps.setString(2, direccion);
            ps.setInt(3, codp);
            ps.setBoolean(4, cuota);
            ps.setInt(5, idio);
            ps.setInt(6, ciudad);
           // ps.setInt(7, BuscarInst());

            
            filasafectadas = ps.executeUpdate();

            if (filasafectadas != 0) {
                JOptionPane.showMessageDialog(null, "Club creado satisfactoriamente", "Información", JOptionPane.INFORMATION_MESSAGE);
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
 

 public int BuscarInst() {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;
            int Id=0;
            int club;
            ps = con.prepareStatement("SELECT inst_id  "
                    + "FROM institucion "
                    + "WHERE inst_id =  (SELECT MAX(inst_id) FROM institucion) ;");
            
            res = ps.executeQuery();

            res.next();
                Id = res.getInt("inst_id");

            return Id;    
           
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            return 0;
            
        }
        }
        
  
 public int BuscarCiudad(String ciudad) {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;
            int dirId=0;
            int club;
            ps = con.prepareStatement("SELECT dir_id, dir_nombre  "
                    + "FROM direccion_lugar "
                    + "WHERE dir_nombre = lower(?);");
            ps.setString(1, ciudad);
            
            res = ps.executeQuery();

            res.next();
                dirId = res.getInt("dir_id");

            return dirId;    
           
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            return 0;
            
        }
        
       
    }
   
   
  public boolean clubExist(int club) {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;

            ps = con.prepareStatement("SELECT club_id "
                    + "FROM club "
                    + "WHERE club_id = ?;");
            ps.setInt(1, club);
            
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
  
  
  public void EliminarClub(int club) {
      Statement stmt = null;
        try (Connection con = conexion.getConnection()){

            stmt = con.createStatement();
            stmt.executeUpdate("DELETE FROM public.club \n"
                    + "WHERE club_id ="+club+";");
      
                JOptionPane.showMessageDialog(null, "Club eliminado satisfactoriamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
                
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
  
  
  public int idiomaClub(int club) {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;
            int idio_id = 0;
            ps = con.prepareStatement("SELECT idio_id "
                    + "FROM club "
                    + "WHERE club_id = ?;");
            ps.setInt(1, club);
            
            res = ps.executeQuery();

            res.next();
                idio_id= res.getInt("idio_id");
                return idio_id;
            

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            return 0;
            
        }
    } 
    
    
  public void CrearAsociacion(int club1, int club2){
      String SQL = "INSERT INTO public.asociacion(\n" +
            "   club1, club2)\n" +
            "	VALUES (?, ?);";
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
  
  
  public void EliminarAsociacion(int club) {
      Statement stmt = null;
        try (Connection con = conexion.getConnection()){
            stmt = con.createStatement();
            stmt.executeUpdate("DELETE FROM public.asociacion \n"
                    + "WHERE club1 ="+club+ "or club2 ="+club+";");
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

  //tiene tablas #2
  public void CrearObra(int durac, String estatus, String titulo, int costo, int audi) {

        String SQL = "INSERT INTO public.obra2(\n" +
            "	obra_duracion, obra_estatus, obra_titulo, costo_entrada, audi_id)\n" +
            "	VALUES (?, ?, ?, ?, ?);";
        int filasafectadas = 0;
        
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
        
            ps.setInt(1, durac);
            ps.setString(2, estatus);
            ps.setString(3, titulo);
            ps.setInt(4, costo);
            ps.setInt(5, audi);

            
            filasafectadas = ps.executeUpdate();

            if (filasafectadas != 0) {
                JOptionPane.showMessageDialog(null, "Obra creado satisfactoriamente", "Información", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        
            
        }
  
  
  public void lib_obra(int isbn){
      String SQL = "INSERT INTO public.libro_obra2(\n" +
            "   isbn)\n" +
            "	VALUES (?);";
        int filasafectadas = 0;
        
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setInt(1, isbn);
     
            filasafectadas = ps.executeUpdate();

            if (filasafectadas != 0) {
                JOptionPane.showMessageDialog(null, "Lib_obra creado satisfactoriamente", "Información", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }

     
 }
  
  
  public void club_obra(int club){
      String SQL = "INSERT INTO public.club_obra2(\n" +
            "   club_id)\n" +
            "	VALUES (?);";
        int filasafectadas = 0;
        
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setInt(1, club);
     
            filasafectadas = ps.executeUpdate();

            if (filasafectadas != 0) {
                JOptionPane.showMessageDialog(null, "club_obra creado satisfactoriamente", "Información", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }

     
 }
   
}
