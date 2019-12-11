package ControladorBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;
import javax.swing.JOptionPane;

public class QueriesJose {

    BDConexion conexion = new BDConexion();
    
    //Miembros

    public boolean CrearMiemb(int id, String nombre1, String nombre2, String apellido1, String apellido2, String genero, Date fecha_nac) {
        
        String SQL = "INSERT INTO public.miembro(\n" +
            "	doc_id, miemb_nombre1, miemb_nombre2, miemb_ape1, miemb_ape2, miemb_genero, miemb_fecha_nac)\n" +
            "	VALUES (?, lower(?), lower(?), lower(?), lower(?), lower(?), ?);";
        int filasafectadas = 0;
        
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setInt(1, id);
            ps.setString(2, nombre1);
            ps.setString(3, nombre2);
            ps.setString(4, apellido1);
            ps.setString(5, apellido2);
            ps.setString(6, genero);
            ps.setDate(7, fecha_nac);
            
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
    
    /*public Date fechainic(int miemid) {
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
    }   */   
    
    public boolean ActMiembM(int idrep, int idmiemb, int dir) {
        String SQL = "UPDATE public.miembro\n" +
"	SET dir_id=?, representante_m=?\n" +
"	WHERE doc_id=?";
 
        int affectedrows = 0;
 
        try (Connection con = conexion.getConnection();
                PreparedStatement pstmt = con.prepareStatement(SQL)) {
 
            pstmt.setInt(1, dir);
            pstmt.setInt(2, idrep);
            pstmt.setInt(3, idmiemb);
            
            affectedrows = pstmt.executeUpdate();
            
            if (affectedrows != 0) {
                return true;
            }
 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
    
    public boolean ActMiemb(int idrep, int idmiemb, int dir) {
        String SQL = "UPDATE public.miembro\n" +
"	SET dir_id=?, representante=?\n" +
"	WHERE doc_id=?";
 
        int affectedrows = 0;
 
        try (Connection con = conexion.getConnection();
                PreparedStatement pstmt = con.prepareStatement(SQL)) {
 
            pstmt.setInt(1, dir);
            pstmt.setInt(2, idrep);
            pstmt.setInt(3, idmiemb);
            
            affectedrows = pstmt.executeUpdate();
            
            if (affectedrows != 0) {
                return true;
            }
 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
    
    public boolean ActAdult(int idmiemb, int dir) {
        String SQL = "UPDATE public.miembro\n" +
"	SET dir_id=?\n" +
"	WHERE doc_id=?";
 
        int affectedrows = 0;
 
        try (Connection con = conexion.getConnection();
                PreparedStatement pstmt = con.prepareStatement(SQL)) {
 
            pstmt.setInt(1, dir);
            pstmt.setInt(2, idmiemb);
            
            affectedrows = pstmt.executeUpdate();
            
            if (affectedrows != 0) {
                return true;
            }
 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
    
    public boolean miemPref(int ced, int isbn, int pos) {
        
        String SQL = "INSERT INTO public.libros_preferidos(\n" +
                        "	doc_id, isbn, posicion)\n" +
                        "	VALUES (?, ?, ?);";
        int filasafectadas = 0;
        
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setInt(1, ced);
            ps.setInt(2, isbn);
            ps.setInt(3, pos);
            
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
    
    public boolean libMiem(int ced, int isbn) {
        
        String SQL = "INSERT INTO public.libro_miembro(\n" +
                        "	doc_id, isbn)\n" +
                        "	VALUES (?, ?);";
        
        int filasafectadas = 0;
        
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setInt(1, ced);
            ps.setInt(2, isbn);
            
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
    
    public boolean MiemInactivo(String motiv, int doc) {
        
        String SQL = "UPDATE public.hist_miembro\n" +
                        "	SET estatus_mie='Inactivo', fechaf_mie=current_date, motivo_retiro=?\n" +
                        "	WHERE estatus_mie = 'activo' and doc_id = ?;";
        int filasafectadas = 0;
        
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setString(1, motiv);
            ps.setInt(2, doc);
            
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
            }

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            return false;
            
        }
        
        return false;
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
    
    //Representante
    
    public boolean CrearRep(int id, String nombre1, String nombre2, String apellido1, String apellido2, String genero) {
        
        String SQL = "INSERT INTO public.representante(\n" +
                        "	doc_ident, rep_nombre1, rep_nombre2, rep_ape1, rep_ape2, rep_genero)\n" +
                        "	VALUES (?, lower(?), lower(?), lower(?), lower(?), lower(?));";
        int filasafectadas;
        
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setInt(1, id);
            ps.setString(2, nombre1);
            ps.setString(3, nombre2);
            ps.setString(4, apellido1);
            ps.setString(5, apellido2);
            ps.setString(6, genero);
            
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
    
    public void BorraRep(int id) {
        
        String SQL = "DELETE FROM representante WHERE doc_ident = ?;";
        int filasafectadas = 0;
        
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setInt(1, id);
            
            filasafectadas = ps.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public boolean repExist(int ci) {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;
            
            ps = con.prepareStatement("SELECT doc_ident FROM public.representante WHERE doc_ident=?;");
            ps.setInt(1, ci);
            
            res = ps.executeQuery();

            if (res.next()) {
                return true;
            }

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            return false;
            
        }
        return false;
    }
    
    //historico
    
    public boolean HistIns(String clubnom, int miemid) {
        
        String SQL = "INSERT INTO public.hist_miembro(\n" +
                        "	fechai_mie, club_id, doc_id, estatus_mie)\n" +
                        "	VALUES (current_date, ?, ?, 'activo');";
        int filasafectadas = 0;
        
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setInt(1, clubid(clubnom));
            ps.setInt(2, miemid);
            
            filasafectadas = ps.executeUpdate();

            if (filasafectadas != 0) {
                return true;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.toString());
            return false;
        }
        return false;
    }
    
    //Teléfonos
    
    public boolean CrearTelRep(int cod, int num, int rep) {
        
        String SQL = "INSERT INTO public.telefono(\n" +
            "	tel_cod, tel_num, representante)\n" +
            "	VALUES (?, ?, ?);";
        int filasafectadas = 0;
        
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setInt(1, cod);
            ps.setInt(2, num);
            ps.setInt(3, rep);
            
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
    
    public boolean CrearTelMiem(int cod, int num, int miem) {
        
        String SQL = "INSERT INTO public.telefono(\n" +
            "	tel_cod, tel_num, miembro)\n" +
            "	VALUES (?, ?, ?);";
        int filasafectadas = 0;
        
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setInt(1, cod);
            ps.setInt(2, num);
            ps.setInt(3, miem);
            
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
    
    public boolean fabGruposAdult(int ci) {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;

            ps = con.prepareStatement("SELECT doc_id FROM miembro"
                    + "WHERE date_part('year', age(current_date, miemb_fecha_nac)) > 18;");
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
    
    public boolean fabGruposJoven(int ci) {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;

            ps = con.prepareStatement("SELECT doc_id FROM miembro"
                    + "WHERE date_part('year', age(current_date, miemb_fecha_nac)) < 19 AND date_part('year', age(current_date, miemb_fecha_nac)) > 12;");
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
    
    public boolean fabGruposNino(int ci) {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;

            ps = con.prepareStatement("SELECT doc_id FROM miembro"
                    + "WHERE date_part('year', age(current_date, miemb_fecha_nac)) < 13;");
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
    
    //libros
    
    public boolean libroExist(int isbn) {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;

            ps = con.prepareStatement("SELECT isbn "
                    + "FROM libro "
                    + "WHERE isbn = ?;");
            ps.setInt(1, isbn);
            
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
    
    //Idiomas
    
    public boolean IdioMiem(int idioId, int docId) {
        
        String SQL = "INSERT INTO public.idioma_miembro(\n" +
                        "	doc_id, idio_id)\n" +
                        "	VALUES (?, ?);";
        int filasafectadas = 0;
        
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setInt(1, idioId);
            ps.setInt(2, docId);
            
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
    
    //extra
    
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
            return 0;
        }
        
        return 0;
    }
    
    //grupos
    
    public ResultSet eleccGrupo(int idclub, String tipo) {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;

            ps = con.prepareStatement("SELECT grup_id, grup_tipo FROM public.grupo WHERE grup_tipo=? AND club_id=?;");
            ps.setString(1, tipo);
            ps.setInt(2, idclub);
                   
            res = ps.executeQuery();

            if (res.next()) {
                return res;
            }

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            return null;
            
        }
        
        return null;
    }
    
    public ResultSet miemGrupo(int idclub) {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;

            ps = con.prepareStatement("SELECT doc_id FROM public.hist_miembro WHERE fechaf_mie is null AND club_id = ?;");
            ps.setInt(1, idclub);
                   
            res = ps.executeQuery();

            if (res.next()) {
                return res;
            }

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            return null;
            
        }
        
        return null;
    }
    
    public ResultSet bucarGrupo(int idgrup) {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;

            ps = con.prepareStatement("SELECT club_id, grup_tipo FROM public.grupo WHERE grup_id=?;");
            ps.setInt(1, idgrup);
                   
            res = ps.executeQuery();

            if (res.next()) {
                return res;
            }

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            return null;
            
        }
        
        return null;
    }
    
    public boolean newGrup(int clubid, String gruptipo) {
        
        String SQL = "INSERT INTO public.grupo(\n" +
"	club_id, grup_tipo)\n" +
"	VALUES (?, ?);";
        int filasafectadas = 0;
        
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setInt(1, clubid);
            ps.setString(2, gruptipo);
            
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
    
    public boolean grupAdd(int grupid, int clubid, int docid) {
        
        String SQL = "INSERT INTO public.g_lector(\n" +
"	grup_id, club_id, fechai_mie, clubh_id, doc_id, fechai_gru)\n" +
"	VALUES (?, ?, (SELECT fechai_mie FROM public.hist_miembro WHERE doc_id=? AND fechaf_mie is null;), ?, ?, ?, current_date);";
        int filasafectadas = 0;
        
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setInt(1, grupid);
            ps.setInt(2, clubid);
            ps.setInt(3, docid);
            ps.setInt(4, clubid);
            ps.setInt(5, docid);
            
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
    
    //idiomas
    
    public ResultSet idiomas() {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;

            ps = con.prepareStatement("SELECT initcap(idio_nombre)\n" +
                                        "	FROM public.idioma;");
                   
            res = ps.executeQuery();

            if (res.next()) {
                return res;
            }

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            return null;
            
        }
        
        return null;
    }
    
    public int idiomaSearch(String idio) {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;

            ps = con.prepareStatement("SELECT idio_id FROM public.idioma WHERE idio_nombre=lower(?);");
            ps.setString(1, idio);
            res = ps.executeQuery();

            if (res.next()) {
                return res.getInt(1);
            }

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            return 0;
            
        }
        
        return 0;
    }
    
    public boolean addIdiom(int docid, String idio) {
        
        String SQL = "INSERT INTO public.idioma_miembro(\n" +
                        "	doc_id, idio_id)\n" +
                        "	VALUES (?, ?);";
        int filasafectadas = 0;
        
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setInt(1, docid);
            ps.setInt(2, idiomaSearch(idio));
            
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
    
    
    //clubes
    
    public int paisclub(String club) {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;

            ps = con.prepareStatement("SELECT dir_id_padre FROM public.direccion_lugar WHERE dir_id in (SELECT dir_id FROM public.club WHERE club_nombre=lower(?));");
            ps.setString(1, club);
            
            res = ps.executeQuery();

            if (res.next()) {
                return res.getInt(1);
            }

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            return 0;
            
        }
        return 0;
    }
    
    public ResultSet clubes() {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;

            ps = con.prepareStatement("SELECT initcap(club_nombre) FROM public.club;");
            res = ps.executeQuery();

            if (res.next()) {
                return res;
            }

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            return null;
            
        }
        
        return null;
    }
    
    public int clubid(String clubnom) {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;

            ps = con.prepareStatement("SELECT club_id FROM public.club WHERE club_nombre=lower(?);");
            ps.setString(1, clubnom);
            res = ps.executeQuery();

            if (res.next()) {
                return res.getInt(1);
            }

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            return 0;
            
        }
        
        return 0;
    }
    
    //paises ciudades
    public ResultSet pais() {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;

            ps = con.prepareStatement("SELECT dir_nombre FROM public.direccion_lugar WHERE dir_id_padre is null;");
            
            res = ps.executeQuery();

            if (res.next()) {
                return res;
            }

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            return null;
            
        }
        
        return null;
    }
    
    public int paiscod(String pais) {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;

            ps = con.prepareStatement("SELECT dir_id FROM public.direccion_lugar WHERE dir_nombre=lower(?);");
            ps.setString(1, pais);
            
            res = ps.executeQuery();

            if (res.next()) {
                return res.getInt(1);
            }

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            return 0;
            
        }
        
        return 0;
    }
    
    public String paisnom(int pais) {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;

            ps = con.prepareStatement("SELECT initcap(dir_nombre) FROM public.direccion_lugar WHERE dir_id=?;");
            ps.setInt(1, pais);
            
            res = ps.executeQuery();

            if (res.next()) {
                return res.getString(1);
            }

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            return null;
            
        }
        return null;
    }
    
    public ResultSet ciudad(int paisId) {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;

            ps = con.prepareStatement("SELECT initcap(dir_nombre) FROM public.direccion_lugar WHERE dir_id_padre=?;");
            ps.setInt(1, paisId);
            
            res = ps.executeQuery();

            if (res.next()) {
                return res;
            }

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            return null;
            
        }
        
        return null;
    }
}
