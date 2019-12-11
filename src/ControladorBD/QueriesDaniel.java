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
            "	VALUES (lower(?));";
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
            "	VALUES (lower(?),lower(?),lower(?),lower(?),?);";
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
     
         
      
     
     public void CrearCapitulo(int isbn, String cap_nombre,String cap_titulo) {
        
        String SQL = "INSERT INTO public.capitulo_otro(\n" +
            " isbn, cap_nombre, cap_titulo)\n" +
            "	VALUES (?,lower(?),lower(?));";
        int filasafectadas = 0;

        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setInt(1, isbn);
            ps.setString(2, cap_nombre);
            ps.setString(3, cap_titulo);
            
            filasafectadas = ps.executeUpdate();

            if (filasafectadas != 0) {
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }   
        }
     
     public void CrearSeccion(int cap_id, int isbn, String secc_nombre,String secc_titulo) {
        
        String SQL = "INSERT INTO public.seccion(\n" +
            " cap_id, isbn, secc_nombre, secc_titulo)\n" +
            "	VALUES (?,?,lower(?),lower(?));";
        int filasafectadas = 0;

        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setInt(1, cap_id);
            ps.setInt(2, isbn);
            ps.setString(3, secc_nombre);
            ps.setString(4, secc_titulo);
            
            filasafectadas = ps.executeUpdate();

            if (filasafectadas != 0) {
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }   
        }
     
     
    public void CrearPersonaje(int obra_id, String perso_nombre,String perso_desc) {
        
        String SQL = "INSERT INTO public.personaje(\n" +
            " obra_id, perso_nombre, perso_desc)\n" +
            "	VALUES (?,lower(?),lower(?));";
        int filasafectadas = 0;

        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setInt(1, obra_id);
            ps.setString(2, perso_nombre);
            ps.setString(3, perso_desc);
            
            filasafectadas = ps.executeUpdate();

            if (filasafectadas != 0) {
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }   
        }
    
    public void CrearFuncion(Date func_fecha, int obra_id,int func_hora, boolean estatus_realizado, int func_valoracion, int func_entradas_vend) {
        
        String SQL = "INSERT INTO public.funcion(\n" +
            " func_fecha, obra_id, func_hora, estatus_realizado, func_valoracion, func_entradas_vend)\n" +
            "	VALUES (?,?,?,?,?,?);";
        int filasafectadas = 0;

        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setDate(1, func_fecha);
            ps.setInt(2, obra_id);
            ps.setInt(3, func_hora);
            ps.setBoolean(4, estatus_realizado);
             if (func_valoracion == 0){ps.setNull(5, java.sql.Types.NUMERIC);}
            else{ps.setInt(5, func_valoracion);}
             if (func_entradas_vend == 0){ps.setNull(6, java.sql.Types.NUMERIC);}
            else{ps.setInt(6, func_entradas_vend);}
            
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
            "	VALUES (lower(?),lower(?),?);";
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
            "	VALUES (lower(?),lower(?),?);";
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
            "	VALUES (?,lower(?),lower(?),?,?);";
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
        
        
        public void CrearLibro(int isbn, String lib_tit_original, String sinopsis, Date lib_ano_publi, int lib_pag, String titulo_esp, String tema_princ, int clasi_id, int edit_id, int isbn_padre) {
        
            String SQL = "INSERT INTO public.libro(\n" +
            " isbn, lib_tit_original, sinopsis, lib_ano_publi, lib_pag, titulo_esp, tema_princ, clasi_id, edit_id, isbn_padre)\n" +
            "	VALUES (?,lower(?),lower(?),?,?,lower(?),lower(?),?,?,?);";
            int filasafectadas = 0;

            try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setInt(1, isbn);            
            ps.setString(2, lib_tit_original);
            ps.setString(3, sinopsis);
            ps.setDate(4, lib_ano_publi);
            ps.setInt(5, lib_pag);
            ps.setString(6, titulo_esp);
            ps.setString(7, tema_princ);
            ps.setInt(8, clasi_id);
            ps.setInt(9, edit_id);
            if (isbn_padre == 0){ps.setNull(10, java.sql.Types.NUMERIC);}
            else{ps.setInt(10, isbn_padre);}
           
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
        
         public void CrearAutor(int audi_capacidad, String audi_nombre, int dir_id, int club_id) {
        
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
         
        public void CrearEditorial(String edit_nombre, int dir_id) {
        
            String SQL = "INSERT INTO public.editorial(\n" +
            " edit_nombre, dir_id)\n" +
            "	VALUES (lower(?),?);";
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
        
         public void CrearElenco(int doc_id, String perso_nombre) {
        
            String SQL = "INSERT INTO public.elenco(\n" +
            " fechai_mie,club_id, doc_id, obra_id, perso_id)\n" +
            "	VALUES ((SELECT fechai_mie FROM public.hist_miembro WHERE doc_id=? AND fechaf_mie is null),(SELECT club_id FROM public.hist_miembro WHERE doc_id=? AND fechaf_mie is null),?, (SELECT obra_id FROM public.personaje WHERE perso_id=?),?);";
            int filasafectadas = 0;

            try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setInt(1, doc_id);
            ps.setInt(2,doc_id);
            ps.setInt(3,doc_id);
            ps.setInt(4, PersoId(perso_nombre));
            ps.setInt(5, PersoId(perso_nombre));
         
            
          
            
            filasafectadas = ps.executeUpdate();

            if (filasafectadas != 0) {
            }

            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            }
        
            
        }
         
        public void CrearActor(int doc_id, String perso_nombre, Date func_fecha) {
        
            String SQL = "INSERT INTO public.actor(\n" +
            " fechai_mie,club_id, doc_id, obra_id, perso_id, obraf_id, func_fecha)\n" +
            "	VALUES ((SELECT fechai_mie FROM public.hist_miembro WHERE doc_id=? AND fechaf_mie is null),(SELECT club_id FROM public.hist_miembro WHERE doc_id=? AND fechaf_mie is null),?,(SELECT obra_id FROM public.personaje WHERE perso_id=?),?,(SELECT obra_id FROM public.personaje WHERE perso_id=?),?);";
            int filasafectadas = 0;

            try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setInt(1, doc_id);
            ps.setInt(2,doc_id);
            ps.setInt(3,doc_id);
            ps.setInt(4, PersoId(perso_nombre));
            ps.setInt(5, PersoId(perso_nombre));
            ps.setInt(6, PersoId(perso_nombre));
            ps.setDate(7, func_fecha);
         
            
          
            
            filasafectadas = ps.executeUpdate();

            if (filasafectadas != 0) {
            }

            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            }
        
            
        }
        
        
        public int PersoId(String perso_nombre) {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;

            ps = con.prepareStatement("SELECT perso_id "
                    + "FROM personaje "
                    + "WHERE perso_nombre = lower(?);");
            ps.setString(1, perso_nombre);
            
            res = ps.executeQuery();
            res.next();
            return res.getInt(1);
            

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
           return 0;
        }
    }
        
              
}
