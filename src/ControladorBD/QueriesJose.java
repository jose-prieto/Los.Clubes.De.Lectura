package ControladorBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;
import javax.swing.JOptionPane;

public class QueriesJose {

    BDConexion conexion = new BDConexion();

    public boolean CrearMiemb(int id, String nombre1, String nombre2, String apellido1, String apellido2, String genero, Date fecha_nac) {
        
        String SQL = "INSERT INTO public.miembro(\n" +
            "	doc_id, miemb_nombre1, miemb_nombre2, miemb_ape1, miemb_ape2, miemb_genero, miemb_fecha_nac)\n" +
            "	VALUES (?, ?, ?, ?, ?, ?, ?);";
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
    
    
    public boolean CrearRep(int id, String nombre1, String nombre2, String apellido1, String apellido2, String genero) {
        
        String SQL = "INSERT INTO public.miembro(\n" +
            "	doc_ident, rep_nombre1, rep_nombre2, rep_ape1, rep_ape2, rep_genero)\n" +
            "	VALUES (?, ?, ?, ?, ?, ?);";
        int filasafectadas = 0;
        
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
    
    public boolean repExist(int ci) {
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps;
            ResultSet res;

            ps = con.prepareStatement("SELECT doc_ident "
                    + "FROM representante "
                    + "WHERE doc_ident = ?;");
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
                JOptionPane.showMessageDialog(null, "Libro inexistente", "Error", JOptionPane.ERROR_MESSAGE);
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            return false;
            
        }
    }
    
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
            
        }
        
        return 40;
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
    
    public void BorraMiembro(int id) {
        
        String SQL = "DELETE FROM miembro WHERE doc_id = ?;";
        int filasafectadas = 0;
        
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setInt(1, id);
            
            filasafectadas = ps.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
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
    
    public boolean ActMiemb1(int idrep, int idmiemb) {
        
        String SQL = "UPDATE public.miembro\n" +
                        "	SET representante1=?\n" +
                        "	WHERE doc_id = ?;\n" +
            "	VALUES (?, ?);";
        int filasafectadas = 0;
        
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setInt(1, idrep);
            ps.setInt(2, idmiemb);
            
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
    
    public boolean ActMiemb2(int idrep, int idmiemb) {
        
        String SQL = "UPDATE public.miembro\n" +
                        "	SET representante2=?\n" +
                        "	WHERE doc_id = ?;\n" +
            "	VALUES (?, ?);";
        int filasafectadas = 0;
        
        try (Connection con = conexion.getConnection()){

            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setInt(1, idrep);
            ps.setInt(2, idmiemb);
            
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
}
