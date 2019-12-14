package ControladorBD;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
public class QueriesDaniel {

     BDConexion conexion = new BDConexion();
     
     //Clubes y lugares
     
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
        
        //Grupos y reuniones 
        
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
        
        public void crearReu(int dia, int grup, int club, String libro, int docid) {
        
        String SQL = "INSERT INTO public.reuniones(\n" +
"	reu_fecha, grup_id, club_id, isbn, grupg_l_id, clubg_l_id, clubh_id, fechai_mie, doc_id)\n" +
"	VALUES (current_date + ? - cast(date_part('dow',current_date) as int), ?, ?, ?, ?, ?, ?, (SELECT fechai_mie FROM public.hist_miembro WHERE doc_id=? AND fechaf_mie is null), ?);";
        int filasafectadas;
        
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
           QueriesJose qj = new QueriesJose(); 
            ps.setInt(1, dia);
            ps.setInt(2, grup);
            ps.setInt(3, club);
            ps.setLong(4, qj.isbn(libro));
            ps.setInt(5, grup);
            ps.setInt(6, club);
            ps.setInt(7, club);
            ps.setInt(8, docid);
            ps.setInt(9, docid);
            
            filasafectadas = ps.executeUpdate();
            
           

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            
        }
        
    }
        
        
    public boolean Inasistencia(int dia, int grup, int club, int docid) {
        
        String SQL = "INSERT INTO public.inasistencia(\n" +
"	reu_fecha, grupr_id, clubr_id, grup_id, club_id, fechai_mie, clubh_id, doc_id)\n" +
"	VALUES (current_date + ? - cast(date_part('dow',current_date) as int), ?, ?, ?, ?, (SELECT fechai_mie FROM public.hist_miembro WHERE doc_id=? AND fechaf_mie is null), ?, ?);";
        int filasafectadas = 0;
        
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setInt(1, dia);
            ps.setInt(2, grup);
            ps.setInt(3, club);
            ps.setInt(4, grup);
            ps.setInt(5, club);
            ps.setInt(6, docid);
            ps.setInt(7, club);
            ps.setInt(8, docid);
            
            filasafectadas = ps.executeUpdate();

            if (filasafectadas != 0) {
                return true;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return false;
    }
        
        
        
        //Libros
        
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
        
        //Obras
        
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
    
          public void EliminarLibro_obra(int obra_id, String lib_nombre) {
        
        String SQL = "DELETE FROM public.libro_obra WHERE obra_id = ? AND isbn = ? ;";
        int filasafectadas = 0;

        try (Connection con = conexion.getConnection()){
            
            QueriesJose qj = new QueriesJose();

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setInt(1, obra_id);
            ps.setLong(2, qj.isbn(lib_nombre));
            
            filasafectadas = ps.executeUpdate();

            if (filasafectadas != 0) {
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }   
        }
          
          
    
    public void EliminarClub_obra(int obra_id, String club_nombre) {
        
        String SQL = "DELETE FROM public.club_obra WHERE obra_id = ? AND club_id = ? ;";
        int filasafectadas = 0;

        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            QueriesJose qj = new QueriesJose();
            ps.setInt(1, obra_id);
            ps.setInt(2, qj.clubid(club_nombre));
            
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
    
    
    public void CrearFuncion(Date func_fecha, int obra_id, int func_hora) {
        
        String SQL = "INSERT INTO public.funcion(\n" +
            " func_fecha, obra_id, func_hora, estatus_realizado)\n" +
            "	VALUES (?,?,?,FALSE);";
        int filasafectadas = 0;

        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setDate(1, func_fecha);
            ps.setInt(2, obra_id);
            ps.setInt(3, func_hora);
          
            
            filasafectadas = ps.executeUpdate();

            if (filasafectadas != 0) {
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }   
        }
    
    
    
       public void TerminarObra(int obra_id) {
        
        String SQL = "UPDATE public.obra\n" +
            "  SET obra_estatus = 'inactiva' \n" +
            "  WHERE obra_id = ? ;";
        int filasafectadas = 0;

        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setInt(1, obra_id);
          
            
            filasafectadas = ps.executeUpdate();

            if (filasafectadas != 0) {
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }   
        }
       
              public void EliminarObra(int obra_id) {
        
        String SQL = "DELETE FROM public.obra WHERE obra_id = ?";
        int filasafectadas = 0;

        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setInt(1, obra_id);
          
            
            filasafectadas = ps.executeUpdate();

            if (filasafectadas != 0) {
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }   
        }
       
       
       
      public void CerrarFuncion(Date func_fecha, int obra_id, int func_valoracion, int func_entradas_vend) {
        
        String SQL = "UPDATE public.funcion\n" +
            "  SET estatus_realizado = TRUE, func_valoracion = ?, func_entradas_vend = ? \n" +
            "  WHERE func_fecha = ? and obra_id = ? ;";
        int filasafectadas = 0;

        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setInt(1, func_valoracion);
            ps.setInt(2, func_entradas_vend);
            ps.setDate(3, func_fecha);
            ps.setInt(4, obra_id);

            
           
            
            filasafectadas = ps.executeUpdate();

            if (filasafectadas != 0) {
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }   
        }
         
        
              
}
