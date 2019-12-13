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
    
    public boolean borraMiem(int idmiem){
        String SQL = "DELETE FROM public.miembro WHERE doc_id = ?;";
 
        int affectedrows = 0;
 
        try (Connection con = conexion.getConnection();
                PreparedStatement pstmt = con.prepareStatement(SQL)) {
 
            pstmt.setInt(1, idmiem);
            
            affectedrows = pstmt.executeUpdate();
            if (affectedrows != 0){
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
    
    public boolean borraHist(int idmiem){
        String SQL = "DELETE FROM public.hist_miembro WHERE doc_id = ?;";
 
        int affectedrows = 0;
 
        try (Connection con = conexion.getConnection();
                PreparedStatement pstmt = con.prepareStatement(SQL)) {
 
            pstmt.setInt(1, idmiem);
            
            affectedrows = pstmt.executeUpdate();
            if (affectedrows != 0){
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
    
    public boolean borraMiemGrup(int idmiem){
        String SQL = "DELETE FROM public.g_lector\n" +
"	WHERE doc_id=?;";
 
        int affectedrows = 0;
 
        try (Connection con = conexion.getConnection();
                PreparedStatement pstmt = con.prepareStatement(SQL)) {
 
            pstmt.setInt(1, idmiem);
            
            affectedrows = pstmt.executeUpdate();
            if (affectedrows != 0){
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
    
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
    
    public boolean miemPref(int ced, String isbn, int pos) {
        
        String SQL = "INSERT INTO public.libros_preferidos(\n" +
                        "	doc_id, isbn, posicion)\n" +
                        "	VALUES (?, ?, ?);";
        int filasafectadas = 0;
        
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setInt(1, ced);
            ps.setLong(2, isbn(isbn));
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
    
    public boolean libMiem(int ced, String isbn) {
        
        String SQL = "INSERT INTO public.libro_miembro(\n" +
                        "	doc_id, isbn)\n" +
                        "	VALUES (?, ?);";
        
        int filasafectadas = 0;
        
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setInt(1, ced);
            ps.setLong(2, isbn(isbn));
            
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
                        "	SET estatus_mie='inactivo', fechaf_mie=current_date, motivo_retiro=?\n" +
                        "	WHERE estatus_mie = 'activo' AND doc_id = ?;";
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
    
    public String ciToNom(int ci) {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;

            ps = con.prepareStatement("SELECT\n" +
"   concat_ws (\n" +
"      ', ',\n" +
"      INITCAP (miemb_ape1),\n" +
"      INITCAP (miemb_nombre1)\n" +
"   ) as name\n" +
"FROM\n" +
"   miembro WHERE doc_id = ?;");
            ps.setInt(1, ci);
            
            res = ps.executeQuery();

            if (res.next()) {
                return res.getString(1);
            }

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            
        }
        
        return null;
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
    
    public Date fechaHoy() {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;

            ps = con.prepareStatement("SELECT current_date;");
                   
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
    
    public boolean BorraRep(int id) {
        
        String SQL = "DELETE FROM public.representante WHERE doc_ident = ?;";
        int filasafectadas = 0;
        
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setInt(1, id);
            
            filasafectadas = ps.executeUpdate();
            
            if (filasafectadas != 0){
                return true;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
    
    public boolean BorraTelRep(int id) {
        
        String SQL = "DELETE FROM public.telefono WHERE representante = ?;";
        int filasafectadas = 0;
        
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setInt(1, id);
            
            filasafectadas = ps.executeUpdate();
            
            if (filasafectadas != 0){
                return true;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
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
        int filasafectadas;
        
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
            return false;
        }
        return false;
    }
    
    public boolean HistPago(String clubnom, int miemid) {
        
        String SQL = "INSERT INTO public.pago(\n" +
"	fechai_mie, club_id, doc_id, pago_fecha)\n" +
"	VALUES (current_date, ?, ?, current_date);";
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
    
    public boolean BorraPago(int docid, String clubnom) {
        
        String SQL = "DELETE FROM public.pago\n" +
"	WHERE docId=? AND club_id=? AND fechai_mie=current_date;";
        int filasafectadas = 0;
        
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setInt(1, docid);
            ps.setInt(2, clubid(clubnom));
            
            filasafectadas = ps.executeUpdate();
            
            if (filasafectadas != 0){
                return true;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
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
    
    public long isbn(String libro) {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;

            ps = con.prepareStatement("SELECT isbn\n" +
"	FROM public.libro\n" +
"	WHERE lib_tit_original = lower(?);");
            ps.setString(1, libro);
            
            res = ps.executeQuery();

            if (res.next()) {
                return res.getLong(1);
            }

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return 0;
    }
        
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
    
    public ResultSet libros() {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;

            ps = con.prepareStatement("SELECT initcap(lib_tit_original) FROM public.libro ORDER BY lib_tit_original;");
            
            res = ps.executeQuery();

            if (res.next()) {
                return res;
            }

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            
        }
        return null;
    }
    
    public boolean addPadreLibro(String isbn, long isbn2) {
        String SQL = "UPDATE public.libro\n" +
"	SET isbn_padre=?\n" +
"	WHERE isbn=?";
 
        int affectedrows = 0;
 
        try (Connection con = conexion.getConnection();
                PreparedStatement pstmt = con.prepareStatement(SQL)) {
 
            pstmt.setLong(1, isbn(isbn));
            pstmt.setLong(2, isbn2);
            
            affectedrows = pstmt.executeUpdate();
            
            if (affectedrows != 0) {
                return true;
            }
 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
    
    //Idiomas
    
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
    
    public boolean BorraIdioMiem(int idmiem) {
        
        String SQL = "DELETE FROM public.idioma_miembro WHERE doc_id = ?;";
 
        int affectedrows;
 
        try (Connection con = conexion.getConnection();
                PreparedStatement pstmt = con.prepareStatement(SQL)) {
 
            pstmt.setInt(1, idmiem);
            
            affectedrows = pstmt.executeUpdate();
            
            if (affectedrows != 0){
                return true;
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
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
    
    public boolean grupAct(String dia, int horaI, int horaF, int grupid) {
        String SQL = "UPDATE public.grupo\n" +
"	SET dia=lower(?), horai=?, horaf=?\n" +
"	WHERE grup_id=?";
 
        int affectedrows;
 
        try (Connection con = conexion.getConnection();
                PreparedStatement pstmt = con.prepareStatement(SQL)) {
 
            pstmt.setString(1, dia);
            pstmt.setInt(2, horaI);
            pstmt.setInt(3, horaF);
            pstmt.setInt(4, grupid);
            
            affectedrows = pstmt.executeUpdate();
            
            if (affectedrows != 0) {
                return true;
            }
 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
    
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
    
    public ResultSet miemGrupo(int grupid) {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;

            ps = con.prepareStatement("SELECT doc_id FROM public.g_lector WHERE grup_id=? and fechaf_gru is null;");
            ps.setInt(1, grupid);
                   
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
"	VALUES (?, ?, (SELECT fechai_mie FROM public.hist_miembro WHERE doc_id=? AND fechaf_mie is null), ?, ?, current_date);";
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
    
    public int grupIdMiem(int docid) {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;

            ps = con.prepareStatement("SELECT grup_id\n" +
"	FROM public.g_lector\n" +
"	WHERE doc_id=? AND fechaf_gru is null;");
            ps.setInt(1, docid);
                   
            res = ps.executeQuery();

            if (res.next()) {
                return 1;
            }

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            return 0;
            
        }
        
        return 0;
    }
    
    //clubes
    
    public ResultSet bucarclub(int idgrup) {
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
    
    public int ciudadclub(String club) {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;

            ps = con.prepareStatement("SELECT dir_id FROM public.club WHERE club_nombre=lower(?);");
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

            ps = con.prepareStatement("SELECT initcap(club_nombre) FROM public.club ORDER BY club_nombre;");
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
    
    public ResultSet clubesPart() {
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
    
    public boolean clubInst(String clubnom) {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;

            ps = con.prepareStatement("SELECT inst_id\n" +
"	FROM public.club\n" +
"	WHERE club_id=?;");
            ps.setInt(1, clubid(clubnom));
            res = ps.executeQuery();

            if (res.next()) {
                return true;
            }

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            
        }
        
        return false;
    }
    
    //paises ciudades
    public ResultSet pais() {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;

            ps = con.prepareStatement("SELECT initcap(dir_nombre) FROM public.direccion_lugar WHERE dir_id_padre is null;");
            
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
    
    //Auditorios
    
    public ResultSet auditorios() {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;

            ps = con.prepareStatement("SELECT audi_nombre FROM public.auditorio;");
            
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
    
    public ResultSet auditorios2(String club) {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;

            ps = con.prepareStatement("SELECT initcap(audi_nombre) FROM public.auditorio WHERE dir_id = ? order by audi_nombre;");
            ps.setInt(1, ciudadclub(club));
            
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
    
    //reuniones
    
    public String reuAbierta(int grupId) {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;

            ps = con.prepareStatement("SELECT isbn FROM public.reuniones WHERE grup_id=?;");
            ps.setInt(1, grupId);
            
            res = ps.executeQuery();

            if (res.next()) {
                return "hola";
            }

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            
        }
        
        return null;
    }
    
    public boolean reuHoy(int grupId) {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;

            ps = con.prepareStatement("SELECT isbn FROM public.reuniones WHERE grup_id=? AND reu_fecha=current_date;");
            ps.setInt(1, grupId);
            
            res = ps.executeQuery();

            if (res.next()) {
                return true;
            }

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            
        }
        
        return false;
    }
    
    public boolean crearReuN(int dia, int grup, int club, String libro, Date fechai, int docid) {
        
        String SQL = "INSERT INTO public.reuniones(\n" +
"	reu_fecha, grup_id, club_id, isbn, grupg_l_id, clubg_l_id, clubh_id, fechai_mie, doc_id)\n" +
"	VALUES (current_date + ? - cast(date_part('dow',current_date) as int), ?, ?, ?, ?, ?, ?, ?, ?);";
        int filasafectadas;
        
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setInt(1, dia);
            ps.setInt(2, grup);
            ps.setInt(3, club);
            ps.setLong(4, isbn(libro));
            ps.setInt(5, grup);
            ps.setInt(6, club);
            ps.setInt(7, club);
            ps.setDate(8, fechai);
            ps.setInt(9, docid);
            
            filasafectadas = ps.executeUpdate();
            
            return true;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            
        }
        return false;
    }
    
    public ResultSet Info(int idgrup, int docid) {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;

            ps = con.prepareStatement("SELECT club_id, fechai_mie FROM public.g_lector WHERE grup_id = ? AND doc_id = ? AND fechaf_gru is null;");
            ps.setInt(1, idgrup);
            ps.setInt(2, docid);
            
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
    
    public ResultSet Info2(int idgrup) {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;

            ps = con.prepareStatement("SELECT club_id, fechai_mie, doc_id FROM public.g_lector WHERE grup_id = ? AND fechaf_gru is null;");
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
    
    public boolean actReu(int index, int grupid) {
        String SQL = "UPDATE public.reuniones\n" +
"	SET reu_fecha=(current_date + ?)\n" +
"	WHERE (reu_fecha-current_date > 0) AND grup_id=?;";
 
        int affectedrows = 0;
 
        try (Connection con = conexion.getConnection();
                PreparedStatement pstmt = con.prepareStatement(SQL)) {
 
            pstmt.setInt(1, index);
            pstmt.setInt(2, grupid);
            
            affectedrows = pstmt.executeUpdate();
            
            if (affectedrows != 0) {
                return true;
            }
 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
    
    public boolean actReu2(int grupid, String conclusion, int valor) {
        String SQL = "UPDATE public.reuniones\n" +
"	SET reu_conclusiones=?, reu_valoracion=?\n" +
"	WHERE reu_fecha=current_date AND grup_id=?;";
 
        int affectedrows = 0;
 
        try (Connection con = conexion.getConnection();
                PreparedStatement pstmt = con.prepareStatement(SQL)) {
 
            pstmt.setString(1, conclusion);
            pstmt.setInt(2, valor);
            pstmt.setInt(3, grupid);
            
            affectedrows = pstmt.executeUpdate();
            
            if (affectedrows != 0) {
                return true;
            }
 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
    
    public boolean actReu3(String isbn, int grupid) {
        String SQL = "UPDATE public.reuniones\n" +
"	SET isbn=?\n" +
"	WHERE reu_fecha=current_date+7 AND grup_id=?;";
 
        int affectedrows = 0;
 
        try (Connection con = conexion.getConnection();
                PreparedStatement pstmt = con.prepareStatement(SQL)) {
 
            pstmt.setLong(1, isbn(isbn));
            pstmt.setInt(2, grupid);
            
            affectedrows = pstmt.executeUpdate();
            
            if (affectedrows != 0) {
                return true;
            }
 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
    
    
    public boolean Inasistencia(int dia, int grup, int club, Date fechai, int docid) {
        
        String SQL = "INSERT INTO public.inasistencia(\n" +
"	reu_fecha, grupr_id, clubr_id, grup_id, club_id, fechai_mie, clubh_id, doc_id)\n" +
"	VALUES (current_date + ? - cast(date_part('dow',current_date) as int), ?, ?, ?, ?, ?, ?, ?);";
        int filasafectadas = 0;
        
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setInt(1, dia);
            ps.setInt(2, grup);
            ps.setInt(3, club);
            ps.setInt(4, grup);
            ps.setInt(5, club);
            ps.setDate(6, fechai);
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
    
    public ResultSet ReusHoy() {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;

            ps = con.prepareStatement("SELECT grup_id, club_id, isbn, fechai_mie, doc_id\n" +
"	FROM public.reuniones\n" +
"	WHERE reu_fecha=current_date AND reu_conclusiones is null AND reu_valoracion is null;");
            
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
    
    public boolean reuProxSem(int grupId) {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;

            ps = con.prepareStatement("SELECT isbn FROM public.reuniones WHERE grup_id=? AND reu_fecha=current_date+7;");
            ps.setInt(1, grupId);
            
            res = ps.executeQuery();

            if (res.next()) {
                return true;
            }

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            
        }
        
        return false;
    }
    
    public boolean crearReuProxSem(int grupid, int clubid, int isbn, Date fechai, int docid) {
        
        String SQL = "INSERT INTO public.reuniones(\n" +
"	reu_fecha, grup_id, club_id, isbn, grupg_l_id, clubg_l_id, clubh_id, fechai_mie, doc_id)\n" +
"	VALUES (current_date+7, ?, ?, ?, ?, ?, ?, ?, ?);";
        int filasafectadas = 0;
        
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setInt(1, grupid);
            ps.setInt(2, clubid);
            ps.setInt(3, isbn);
            ps.setInt(4, grupid);
            ps.setInt(5, clubid);
            ps.setInt(6, clubid);
            ps.setDate(7, fechai);
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
    
    //inasistencia
    
    public ResultSet inasistentes(int idgrup) {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;

            ps = con.prepareStatement("SELECT doc_id\n" +
"	FROM public.inasistencia\n" +
"	WHERE reu_fecha=current_date AND grup_id=?;");
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
    
    
    public boolean asistentes(int docid) {
        String SQL = "DELETE FROM public.inasistencia\n" +
"	WHERE reu_fecha=current_date AND doc_id=?;";
 
        int affectedrows = 0;
 
        try (Connection con = conexion.getConnection();
                PreparedStatement pstmt = con.prepareStatement(SQL)) {
 
            pstmt.setInt(1, docid);
            
            affectedrows = pstmt.executeUpdate();
            System.out.println("hola1");
            if (affectedrows != 0){
                System.out.println("hola2");
                return true;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("hola3");
        return false;
    }
    
    //editorial
    
    public ResultSet editoriales() {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;

            ps = con.prepareStatement("SELECT initcap(edit_nombre)\n" +
"	FROM public.editorial;");
            
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
    
    // clasificaciones
    
    public ResultSet tipos() {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;

            ps = con.prepareStatement("SELECT initcap(clasi_nombre)\n" +
"	FROM public.clasificacion\n" +
"	WHERE clasi_padre is null\n" +
"	ORDER BY clasi_nombre;");
            
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
    
    public ResultSet subge(String padre) {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;

            ps = con.prepareStatement("SELECT initcap(clasi_nombre)\n" +
"	FROM public.clasificacion\n" +
"	WHERE clasi_padre=?;");
            ps.setInt(1, clasid(padre));
            
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
    
    public int clasid(String tipo) {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;

            ps = con.prepareStatement("SELECT clasi_id\n" +
"	FROM public.clasificacion\n" +
"	WHERE clasi_nombre=lower(?);");
            ps.setString(1, tipo);
            
            res = ps.executeQuery();
            
            if (res.next()) {
                return res.getInt(1);
            }

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            
        }
        
        return 0;
    }
}
