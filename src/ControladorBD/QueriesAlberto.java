package ControladorBD;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class QueriesAlberto {

    BDConexion conexion = new BDConexion();

    public boolean CrearLibro(long isbn, String OriTitulo, String Sinopsis, Date Year, int Pag, String EspTitulo, String Tema, String Edit, int clasif) {
        
        String SQL = "INSERT INTO public.libro(\n" +
            "	isbn, lib_tit_original, sinopsis, lib_pag, titulo_esp, tema_princ, clasi_id, edit_id, lib_ano_publi)\n" +
            "	VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";
        int filasafectadas = 0;

        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setLong(1, isbn);
            ps.setString(2, OriTitulo);
            ps.setString(3, Sinopsis);
            ps.setInt(4, Pag);
            ps.setString(5, EspTitulo);
            ps.setString(6, Tema);
            ps.setInt(7, clasif);
            ps.setInt(8, editid(Edit));
            ps.setDate(9, Year);
            
            filasafectadas = ps.executeUpdate();

            if (filasafectadas != 0) {
                return true;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
            
    }
 
    public int editid(String edit) {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;

            ps = con.prepareStatement("SELECT edit_id\n" +
"	FROM public.editorial WHERE edit_nombre=lower(?);");
            ps.setString(1, edit);
            
            res = ps.executeQuery();

            if (res.next()) {
                return res.getInt(1);
            }

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            
            
        }
        return 0;
    }
 
     
    public boolean CrearAutorLibro(String NomAutor, String NomAutor2, String ApeAutor, String ApeAutor2, long isbn){
        String SQL = "INSERT INTO public.autor(\n" +
                "   aut_nombre1, aut_nombre2, aut_ape1, aut_ape2, isbn)\n" +
                "	VALUES (?, ?, ?, ?, ?);";
            int filasafectadas = 0;

            try (Connection con = conexion.getConnection()){

                PreparedStatement ps = con.prepareStatement(SQL);

                ps.setString(1, NomAutor);
                ps.setString(2, NomAutor2);
                ps.setString(3, ApeAutor);
                ps.setString(4, ApeAutor2);
                ps.setLong(5, isbn);

                filasafectadas = ps.executeUpdate();

                if (filasafectadas != 0) {
                    return true;
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            }

        return false;
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
     
  
  public int BuscarIsbn(String nombre) {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;
            int isbn=0;
            int club;
            ps = con.prepareStatement("SELECT isbn, lib_tit_original  "
                    + "FROM libro "
                    + "WHERE lib_tit_original = lower(?);");
            ps.setString(1, nombre);
            
            res = ps.executeQuery();

            res.next();
                isbn = res.getInt("isbn");

            return isbn;    
           
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            return 0;
            
        }
        
       
    }
 
 
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
 

  public int UltiInst() {
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
            JOptionPane.showMessageDialog(null, "Club no eliminado porque posee información importante", "Error", JOptionPane.ERROR_MESSAGE);
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


  public void CrearObra(int durac, String estatus, String titulo, int costo) {

        String SQL = "INSERT INTO public.obra(\n" +
            "	obra_duracion, obra_estatus, obra_titulo, costo_entrada, audi_id)\n" +
            "	VALUES (?, ?, lower(?), ?, (SELECT audi_id from auditorio WHERE audi_id = (SELECT MAX(audi_id) FROM auditorio)));";
        int filasafectadas = 0;
        
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
        
            ps.setInt(1, durac);
            ps.setString(2, estatus);
            ps.setString(3, titulo);
            ps.setInt(4, costo);

            
            filasafectadas = ps.executeUpdate();

            if (filasafectadas != 0) {
                JOptionPane.showMessageDialog(null, "Obra creada satisfactoriamente", "Información", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        
            
        }
  
  
  public void CrearObra2(int durac, String estatus, String titulo, int costo, int audi) {

        String SQL = "INSERT INTO public.obra(\n" +
            "	obra_duracion, obra_estatus, obra_titulo, costo_entrada, audi_id)\n" +
            "	VALUES (?, ?, lower(?), ?, ?);";
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
                JOptionPane.showMessageDialog(null, "Obra creada satisfactoriamente", "Información", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        
            
        }
  
  
  public int BuscarAudi(String audi) {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;
            int auId=0;
            int club;
            ps = con.prepareStatement("SELECT audi_id, audi_nombre  "
                    + "FROM auditorio "
                    + "WHERE audi_nombre = lower(?);");
            ps.setString(1, audi);
            
            res = ps.executeQuery();

            res.next();
                auId = res.getInt("audi_id");

            return auId;    
           
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            return 0;
            
        }
        
       
    }
  
  
  public void lib_obra(int isbn){
      String SQL = "INSERT INTO public.libro_obra(\n" +
            "  isbn, obra_id)\n" +
            "	VALUES ((?),(SELECT obra_id from obra WHERE obra_id = (SELECT MAX(obra_id) FROM obra)));";
        int filasafectadas = 0;
        
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setInt(1, isbn);
     
            filasafectadas = ps.executeUpdate();


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }

     
 }
  
  
  public void club_obra(int club){
      String SQL = "INSERT INTO public.club_obra(\n" +
            "   obra_id , club_id)\n" +
            "	VALUES ((SELECT obra_id from obra WHERE obra_id = (SELECT MAX(obra_id) FROM obra)), (?));";
        int filasafectadas = 0;
        
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setInt(1, club);
     
            filasafectadas = ps.executeUpdate();

            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }

     
 }
  
  
  public void CrearAuditorio(int audi_capacidad, String audi_nombre, int dir_id, int club_id) {
        
            String SQL = "INSERT INTO public.auditorio(\n" +
            "	audi_capacidad, audi_nombre, dir_id, club_id)\n" +
            "	VALUES (?,lower(?),?,?);";
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
   
  
  public int BuscarCiudad2(String club) {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;
            int dirId=0;
            ps = con.prepareStatement("SELECT dir_id  "
                    + "FROM club "
                    + "WHERE club_nombre = lower(?);");
            ps.setString(1, club);
            
            res = ps.executeQuery();

            res.next();
                dirId = res.getInt("dir_id");

            return dirId;    
           
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            return 0;
            
        }
        
       
    }
  
  
  public int BuscarClub(String club) {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;
            int dirId=0;
            ps = con.prepareStatement("SELECT club_id,club_nombre "
                    + "FROM club "
                    + "WHERE club_nombre = lower(?);");
            ps.setString(1, club);
            
            res = ps.executeQuery();

            res.next();
                dirId = res.getInt("club_id");

            return dirId;    
           
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            return 0;
            
        }
  }   
  
  
    public boolean obraExist(int i) {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;

            ps = con.prepareStatement("SELECT obra_id "
                    + "FROM obra "
                    + "WHERE obra_id = ?;");
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
    
  public void ActualizarObra(int obra) {
      Statement stmt = null;
        try (Connection con = conexion.getConnection()){

            stmt = con.createStatement();
            stmt.executeUpdate("UPDATE obra \n"
                    + "SET  obra_estatus= 'inactiva' \n"
                    + "WHERE obra_id ="+obra+";");
      
                JOptionPane.showMessageDialog(null, "Estatus de obra cambiado a inactiva satisfactoriamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
                
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
  
      
  public boolean estadoObra(int obra) {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;
            String cadena;
            ps = con.prepareStatement("SELECT obra_estatus "
                    + "FROM obra "
                    + "WHERE obra_id = ?;");
            ps.setInt(1, obra);
            
            res = ps.executeQuery();

            res.next();
                cadena = res.getString("obra_estatus");
                
                if (!cadena.equals("inactiva")){
                  return true;
                }else {
                    return false;
                }
               
           
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            return false;
            
        }
  }     
  
      
  public void EliminarCO() {
      Statement stmt = null;
        try (Connection con = conexion.getConnection()){
            stmt = con.createStatement();
            stmt.executeUpdate("DELETE FROM public.club_obra \n"
                    + "WHERE obra_id =(SELECT obra_id from obra WHERE obra_id = (SELECT MAX(obra_id) FROM obra));");
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
                  
    
  public void EliminarLO() {
      Statement stmt = null;
        try (Connection con = conexion.getConnection()){
            stmt = con.createStatement();
            stmt.executeUpdate("DELETE FROM public.libro_obra \n"
                    + "WHERE obra_id =(SELECT obra_id from obra WHERE obra_id = (SELECT MAX(obra_id) FROM obra));");
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
  
  
  public void EliminarObra(){
      Statement stmt = null;
        try (Connection con = conexion.getConnection()){
            stmt = con.createStatement();
            stmt.executeUpdate("DELETE FROM public.obra \n"
                    + "WHERE obra_id =(SELECT obra_id from obra WHERE obra_id = (SELECT MAX(obra_id) FROM obra));");
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
  
}
