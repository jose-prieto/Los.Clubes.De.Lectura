/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author dani_
 */
public class Scripts {
    
    
        BDConexion connectivity = new BDConexion();
        Connection con = connectivity.getConnection();

            PreparedStatement ps;
            ResultSet res;
    public void iniciarBD() {
        direccion_lugar();
        idioma();
        institucion();
        representante();
        miembro();
        idioma_miembro();
        telefono();
        club();
        asociacion();
        grupo();
        hist_miembro();
        pago();
        g_lector();
        auditorio();
        editorial();
        clasificacion();
        libro();
        reuniones();
        capitulo_otro();
        seccion();
        autor();
        obra();
        libro_obra();
        club_obra();
        funcion();
        personaje();
        elenco();
        actor();
        libro_miembro();
        libros_preferidos(); 
        
        
        
        
    }  
    public void actor() {
        try {
            ps = con.prepareStatement("CREATE TABLE public.actor(fechai_mie date NOT NULL, club_id numeric(3,0) NOT NULL,doc_id numeric(10,0) NOT NULL,obra_id numeric(3,0) NOT NULL,perso_id numeric(5,0) NOT NULL,func_fecha date NOT NULL,CONSTRAINT pk_actor PRIMARY KEY (fechai_mie, club_id, doc_id, obra_id, perso_id, func_fecha),CONSTRAINT fk_actor_elenco FOREIGN KEY (doc_id, fechai_mie, obra_id, club_id, perso_id)REFERENCES public.elenco (doc_id, fechai_mie, obra_id, club_id, perso_id) MATCH SIMPLE, CONSTRAINT fk_actor_funcion FOREIGN KEY (obra_id, func_fecha) REFERENCES public.funcion (obra_id, func_fecha) MATCH SIMPLE)");
            res = ps.executeQuery();
          /*  if (res.next()) {
                JOptionPane.showMessageDialog(null, res.getString("UserName") + " ");
            } else {
                System.out.println("No Existen Datos");
            }*/
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    
    public void asociacion() {
        try {
        ps = con.prepareStatement("CREATE TABLE public.asociacion ( club1 numeric(3,0) NOT NULL, club2 numeric(3,0) NOT NULL, CONSTRAINT pk_asociacion PRIMARY KEY (club2, club1), CONSTRAINT fk_aso_club1 FOREIGN KEY (club1) REFERENCES public.club (club_id) MATCH SIMPLE, CONSTRAINT fk_aso_club2 FOREIGN KEY (club2) REFERENCES public.club (club_id) MATCH SIMPLE)");
        res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void auditorio() {
        try {
        ps = con.prepareStatement("CREATE TABLE public.auditorio ( audi_id numeric(3,0) NOT NULL, audi_capacidad numeric(4,0) NOT NULL, audi_nombre character varying(30) COLLATE pg_catalog.\"default\" NOT NULL, dir_id numeric(4,0) NOT NULL, club_id numeric(3,0) NOT NULL, CONSTRAINT pk_auditorio PRIMARY KEY (audi_id), CONSTRAINT fk_aud_club FOREIGN KEY (club_id) REFERENCES public.club (club_id) MATCH SIMPLE, CONSTRAINT fk_aud_dir FOREIGN KEY (dir_id) REFERENCES public.direccion_lugar (dir_id) MATCH SIMPLE)");
        res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void autor() {
        try {
        ps = con.prepareStatement("CREATE TABLE public.autor ( aut_id numeric(3,0) NOT NULL, aut_nombre1 character varying(15) COLLATE pg_catalog.\"default\" NOT NULL, aut_nombre2 character varying(15) COLLATE pg_catalog.\"default\", aut_ape1 character varying(15) COLLATE pg_catalog.\"default\" NOT NULL, aut_ape2 character varying(15) COLLATE pg_catalog.\"default\", isbn numeric(15,0) NOT NULL, CONSTRAINT pk_autor PRIMARY KEY (aut_id), CONSTRAINT fk_autor FOREIGN KEY (isbn) REFERENCES public.libro (isbn) MATCH SIMPLE)");
        res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void capitulo_otro() {
        try {
        ps = con.prepareStatement("CREATE TABLE public.capitulo_otro ( cap_id numeric(4,0) NOT NULL, isbn numeric(15,0) NOT NULL, cap_nombre character varying(30) COLLATE pg_catalog.\"default\" NOT NULL, cap_titulo character varying(30) COLLATE pg_catalog.\"default\", CONSTRAINT pk_capitulo_otro PRIMARY KEY (isbn, cap_id), CONSTRAINT fk_capitulo_isbn FOREIGN KEY (isbn) REFERENCES public.libro (isbn) MATCH SIMPLE)");
        res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
        
    public void clasificacion() {
        try {
        ps = con.prepareStatement("CREATE TABLE public.clasificacion ( clasi_id numeric(3,0) NOT NULL, clasi_nombre character varying(30) COLLATE pg_catalog.\"default\" NOT NULL, clasi_tipo character varying(1) COLLATE pg_catalog.\"default\" NOT NULL, clasi_padre numeric(3,0), CONSTRAINT pk_clasificacion PRIMARY KEY (clasi_id), CONSTRAINT fk_clasi_padre FOREIGN KEY (clasi_padre) REFERENCES public.clasificacion (clasi_id) MATCH SIMPLE)");
        res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void club() {
        try {
        ps = con.prepareStatement("CREATE TABLE public.club ( club_id numeric(3,0) NOT NULL, club_nombre character varying(30) COLLATE pg_catalog.\"default\" NOT NULL, club_fecha_inicio date NOT NULL, direccion character varying(50) COLLATE pg_catalog.\"default\" NOT NULL, cod_postal numeric(10,0) NOT NULL, cuota boolean, idio_id numeric(2,0) NOT NULL, dir_id numeric(4,0) NOT NULL, inst_id numeric(3,0), CONSTRAINT pk_club PRIMARY KEY (club_id), CONSTRAINT fk_club_dir FOREIGN KEY (dir_id) REFERENCES public.direccion_lugar (dir_id) MATCH SIMPLE, CONSTRAINT fk_club_idio FOREIGN KEY (idio_id) REFERENCES public.idioma (idio_id) MATCH SIMPLE, CONSTRAINT fk_club_inst FOREIGN KEY (inst_id) REFERENCES public.institucion (inst_id) MATCH SIMPLE)");    
        res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
     public void club_obra() {
        try {
        ps = con.prepareStatement("CREATE TABLE public.club_obra ( obra_id numeric(3,0) NOT NULL, club_id numeric(3,0) NOT NULL, CONSTRAINT pk_club_obra PRIMARY KEY (club_id, obra_id), CONSTRAINT fk_co_club FOREIGN KEY (club_id) REFERENCES public.club (club_id) MATCH SIMPLE, CONSTRAINT fk_co_obra FOREIGN KEY (obra_id) REFERENCES public.obra (obra_id) MATCH SIMPLE )");
        res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void direccion_lugar() {
        try {
        ps = con.prepareStatement("CREATE TABLE public.direccion_lugar ( dir_id numeric(4,0) NOT NULL, dir_tipo character varying(10) COLLATE pg_catalog.\"default\" NOT NULL, dir_nombre character varying(20) COLLATE pg_catalog.\"default\" NOT NULL, \"moneda \" money, nacionalidad character varying(20) COLLATE pg_catalog.\"default\", dir_id_padre numeric(4,0), CONSTRAINT pk_direccion PRIMARY KEY (dir_id), CONSTRAINT fk_direccion FOREIGN KEY (dir_id_padre) REFERENCES public.direccion_lugar (dir_id) MATCH SIMPLE)");
        res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
     public void editorial() {
        try {
            ps = con.prepareStatement("CREATE TABLE public.editorial ( edit_id numeric(3,0) NOT NULL, edit_nombre character varying(50) COLLATE pg_catalog.\"default\" NOT NULL, dir_id numeric(4,0) NOT NULL, CONSTRAINT pk_editorial PRIMARY KEY (edit_id), CONSTRAINT fk_edit_dir FOREIGN KEY (dir_id) REFERENCES public.direccion_lugar (dir_id) MATCH SIMPLE )");
            res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
     
    public void elenco() {
        try {
            ps = con.prepareStatement("CREATE TABLE public.elenco ( fechai_mie date NOT NULL, club_id numeric(3,0) NOT NULL, doc_id numeric(10,0) NOT NULL, obra_id numeric(3,0) NOT NULL, perso_id numeric(5,0) NOT NULL, CONSTRAINT pk_elenco PRIMARY KEY (fechai_mie, club_id, doc_id, obra_id, perso_id), CONSTRAINT fk_elenco_hist FOREIGN KEY (doc_id, fechai_mie, club_id) REFERENCES public.hist_miembro (doc_id, fechai_mie, club_id) MATCH SIMPLE, CONSTRAINT fk_elenco_perso FOREIGN KEY (obra_id, perso_id) REFERENCES public.personaje (obra_id, perso_id) MATCH SIMPLE )");
            res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void funcion() {
        try {
             ps = con.prepareStatement("CREATE TABLE public.funcion ( func_fecha date NOT NULL, obra_id numeric(3,0) NOT NULL, func_hora numeric(2,0) NOT NULL, estatus_realizado boolean NOT NULL, func_valoracion numeric(1,0), func_entradas_vend numeric(4,0), CONSTRAINT pk_funcion PRIMARY KEY (func_fecha, obra_id), CONSTRAINT fk_funcion FOREIGN KEY (obra_id) REFERENCES public.obra (obra_id) MATCH SIMPLE )");
            res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
      public void g_lector() {
        try {
        ps = con.prepareStatement("CREATE TABLE public.g_lector ( grup_id numeric(3,0) NOT NULL, club_id numeric(3,0) NOT NULL, fechai_mie date NOT NULL, doc_id numeric(10,0) NOT NULL, fechai_gru date NOT NULL, fechaf_gru date, CONSTRAINT pk_g_lector PRIMARY KEY (doc_id, fechai_mie, club_id, grup_id), CONSTRAINT fk_g_lector1 FOREIGN KEY (doc_id, fechai_mie, club_id) REFERENCES public.hist_miembro (doc_id, fechai_mie, club_id) MATCH SIMPLE, CONSTRAINT fk_g_lector2 FOREIGN KEY (grup_id, club_id) REFERENCES public.grupo (grup_id, club_id) MATCH SIMPLE)");
        res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
        
    public void grupo() {
        try {
        ps = con.prepareStatement("CREATE TABLE public.grupo ( grup_id numeric(3,0) NOT NULL, club_id numeric(3,0) NOT NULL, grup_tipo character varying(30) COLLATE pg_catalog.\"default\" NOT NULL, dia date NOT NULL, horai numeric(2,0) NOT NULL, horaf numeric(2,0) NOT NULL, CONSTRAINT pk_grupo PRIMARY KEY (club_id, grup_id), CONSTRAINT fk_grupo FOREIGN KEY (club_id) REFERENCES public.club (club_id) MATCH SIMPLE )");
        res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
   public void hist_miembro() {
        try {
            ps = con.prepareStatement("CREATE TABLE public.hist_miembro ( fechai_mie date NOT NULL, club_id numeric(3,0) NOT NULL, doc_id numeric(10,0) NOT NULL, estatus_mie character varying(20) COLLATE pg_catalog.\"default\" NOT NULL, fechaf_mie date, motivo_retiro character varying(20) COLLATE pg_catalog.\"default\", CONSTRAINT pk_hist_miembro PRIMARY KEY (fechai_mie, club_id, doc_id), CONSTRAINT fk_hist_club FOREIGN KEY (club_id) REFERENCES public.club (club_id) MATCH SIMPLE, CONSTRAINT fk_hist_doc FOREIGN KEY (doc_id) REFERENCES public.miembro (doc_id) MATCH SIMPLE )");
            res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
   
    public void idioma() {
        try {
            ps = con.prepareStatement("CREATE TABLE public.idioma ( idio_id numeric(2,0) NOT NULL, idio_nombre character varying(20) COLLATE pg_catalog.\"default\" NOT NULL, CONSTRAINT pk_idioma PRIMARY KEY (idio_id) )");
            res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
     public void idioma_miembro() {
        try {
            ps = con.prepareStatement("CREATE TABLE public.idioma_miembro ( doc_id numeric(10,0) NOT NULL, idio_id numeric(2,0) NOT NULL, CONSTRAINT pk_idioma_miembro PRIMARY KEY (doc_id, idio_id), CONSTRAINT fk_im_doc FOREIGN KEY (doc_id) REFERENCES public.miembro (doc_id) MATCH SIMPLE ON UPDATE NO ACTION ON DELETE NO ACTION NOT VALID, CONSTRAINT fk_im_idioma FOREIGN KEY (idio_id) REFERENCES public.idioma (idio_id) MATCH SIMPLE )");
            res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
     
    public void institucion() {
        try {
            ps = con.prepareStatement("CREATE TABLE public.institucion ( inst_id numeric(3,0) NOT NULL, inst_nombre character varying(30) COLLATE pg_catalog.\"default\" NOT NULL, inst_desc character varying(50) COLLATE pg_catalog.\"default\" NOT NULL, dir_id numeric(4,0) NOT NULL, CONSTRAINT pk_institucion PRIMARY KEY (inst_id), CONSTRAINT fk_inst FOREIGN KEY (dir_id) REFERENCES public.direccion_lugar (dir_id) MATCH SIMPLE )");
            res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void libro() {
        try {
            ps = con.prepareStatement("CREATE TABLE public.libro ( isbn numeric(15,0) NOT NULL, lib_tit_original character varying(50) COLLATE pg_catalog.\"default\" NOT NULL, sinopsis character varying(500) COLLATE pg_catalog.\"default\" NOT NULL, lib_ano_publi date NOT NULL, lib_pag numeric(4,0) NOT NULL, titulo_esp character varying(50) COLLATE pg_catalog.\"default\", tema_princ character varying(100) COLLATE pg_catalog.\"default\", clasi_id numeric(3,0) NOT NULL, edit_id numeric(3,0) NOT NULL, isbn_padre numeric(15,0), CONSTRAINT pk_libro PRIMARY KEY (isbn), CONSTRAINT fk_libro_clasi FOREIGN KEY (clasi_id) REFERENCES public.clasificacion (clasi_id) MATCH SIMPLE, CONSTRAINT fk_libro_edit FOREIGN KEY (edit_id) REFERENCES public.editorial (edit_id) MATCH SIMPLE, CONSTRAINT fk_libro_librop FOREIGN KEY (isbn_padre) REFERENCES public.libro (isbn) MATCH SIMPLE )");
            res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void libro_miembro() {
        try {
            ps = con.prepareStatement("CREATE TABLE public.libro_miembro ( doc_id numeric(10,0) NOT NULL, isbn numeric(15,0) NOT NULL, CONSTRAINT pk_libro_miembro PRIMARY KEY (doc_id, isbn), CONSTRAINT fk_lm_doc FOREIGN KEY (doc_id) REFERENCES public.miembro (doc_id) MATCH SIMPLE, CONSTRAINT fk_lm_isbn FOREIGN KEY (isbn) REFERENCES public.libro (isbn) MATCH SIMPLE )");
            res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void libro_obra() {
        try {
            ps = con.prepareStatement("CREATE TABLE public.libro_obra ( isbn numeric(15,0) NOT NULL, obra_id numeric(3,0) NOT NULL, CONSTRAINT pk_libro_obra PRIMARY KEY (isbn, obra_id), CONSTRAINT fk_lo_isbn FOREIGN KEY (isbn) REFERENCES public.libro (isbn) MATCH SIMPLE, CONSTRAINT fk_lo_obra FOREIGN KEY (obra_id) REFERENCES public.obra (obra_id) MATCH SIMPLE )");
            res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void libros_preferidos() {
        try {
            ps = con.prepareStatement("CREATE TABLE public.libros_preferidos ( doc_id numeric(10,0) NOT NULL, isbn numeric(15,0) NOT NULL, posicion numeric(1,0) NOT NULL, CONSTRAINT pk_libro_preferido PRIMARY KEY (doc_id, isbn), CONSTRAINT fk_lp_doc FOREIGN KEY (doc_id) REFERENCES public.miembro (doc_id) MATCH SIMPLE, CONSTRAINT fk_lp_isbn FOREIGN KEY (isbn) REFERENCES public.libro (isbn) MATCH SIMPLE )");
            res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void miembro() {
        try {
            ps = con.prepareStatement("CREATE TABLE public.miembro ( doc_id numeric(10,0) NOT NULL, miemb_nombre1 character varying(15) COLLATE pg_catalog.\"default\" NOT NULL, miemb_nombre2 character varying(15) COLLATE pg_catalog.\"default\", miemb_ape1 character varying(15) COLLATE pg_catalog.\"default\" NOT NULL, miemb_ape2 character varying(15) COLLATE pg_catalog.\"default\", miemb_genero character varying(10) COLLATE pg_catalog.\"default\" NOT NULL, miemb_fecha_nac date NOT NULL, representante1 numeric(10,0), representante2 numeric(10,0), CONSTRAINT pk_miembro PRIMARY KEY (doc_id), CONSTRAINT fk_representante1 FOREIGN KEY (representante1) REFERENCES public.representante (doc_ident) MATCH SIMPLE, CONSTRAINT fk_representante2 FOREIGN KEY (representante2) REFERENCES public.miembro (doc_id) MATCH SIMPLE )");                    
            res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void obra() {
        try {
            ps = con.prepareStatement("CREATE TABLE public.obra ( obra_id numeric(3,0) NOT NULL, obra_duracion numeric(1,0) NOT NULL, obra_estatus character varying(20) COLLATE pg_catalog.\"default\" NOT NULL, obra_titulo character varying(50) COLLATE pg_catalog.\"default\" NOT NULL, costo_entrada numeric(5,0) NOT NULL, audi_id numeric(3,0) NOT NULL, CONSTRAINT pk_obra PRIMARY KEY (obra_id), CONSTRAINT fk_auditorio FOREIGN KEY (audi_id) REFERENCES public.auditorio (audi_id) MATCH SIMPLE )");
            res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void pago() {
        try {
            ps = con.prepareStatement("CREATE TABLE public.pago ( pago_id numeric(3,0) NOT NULL, fechai_mie date NOT NULL, club_id numeric(3,0) NOT NULL, doc_id numeric(10,0) NOT NULL, pago_fecha date NOT NULL, CONSTRAINT pk_pago PRIMARY KEY (pago_id, fechai_mie, club_id, doc_id), CONSTRAINT fk_pago FOREIGN KEY (doc_id, fechai_mie, club_id) REFERENCES public.hist_miembro (doc_id, fechai_mie, club_id) MATCH SIMPLE )");
            res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
        public void personaje() {
        try {
            ps = con.prepareStatement("CREATE TABLE public.personaje ( perso_id numeric(5,0) NOT NULL, obra_id numeric(3,0) NOT NULL, perso_nombre character varying(20) COLLATE pg_catalog.\"default\" NOT NULL, perso_desc character varying(100) COLLATE pg_catalog.\"default\" NOT NULL, CONSTRAINT pk_personaje PRIMARY KEY (perso_id, obra_id), CONSTRAINT fk_personaje FOREIGN KEY (obra_id) REFERENCES public.obra (obra_id) MATCH SIMPLE )");
            res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
        
    public void representante() {
        try {
            ps = con.prepareStatement("CREATE TABLE public.representante ( doc_ident numeric(10,0) NOT NULL, rep_nombre1 character varying(15) COLLATE pg_catalog.\"default\" NOT NULL, rep_nombre2 character varying(15) COLLATE pg_catalog.\"default\", rep_ape1 character varying(15) COLLATE pg_catalog.\"default\" NOT NULL, rep_ape2 character varying(15) COLLATE pg_catalog.\"default\", rep_genero character varying(10) COLLATE pg_catalog.\"default\" NOT NULL, CONSTRAINT pk_representante PRIMARY KEY (doc_ident) )");
            res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void reuniones() {
        try {
            ps = con.prepareStatement("CREATE TABLE public.reuniones ( reu_fecha date NOT NULL, grup_id numeric(3,0) NOT NULL, club_id numeric(3,0) NOT NULL, reu_conclusiones character varying(400) COLLATE pg_catalog.\"default\", reu_valoracion numeric(1,0), isbn numeric(15,0) NOT NULL, fechai_mie date NOT NULL, doc_id numeric(10,0) NOT NULL, CONSTRAINT pk_reuniones PRIMARY KEY (reu_fecha, grup_id, club_id), CONSTRAINT fk_reu1 FOREIGN KEY (grup_id, doc_id, fechai_mie, club_id) REFERENCES public.g_lector (grup_id, doc_id, fechai_mie, club_id) MATCH SIMPLE, CONSTRAINT fk_reu2 FOREIGN KEY (grup_id, club_id) REFERENCES public.grupo (grup_id, club_id) MATCH SIMPLE, CONSTRAINT fk_reu3 FOREIGN KEY (isbn) REFERENCES public.libro (isbn) MATCH SIMPLE )");
            res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void seccion() {
        try {
            ps = con.prepareStatement("CREATE TABLE public.seccion ( secc_id numeric(4,0) NOT NULL, cap_id numeric(4,0) NOT NULL, isbn numeric(15,0) NOT NULL, secc_nombre character varying(30) COLLATE pg_catalog.\"default\" NOT NULL, secc_titulo character varying(30) COLLATE pg_catalog.\"default\", CONSTRAINT pk_seccion PRIMARY KEY (secc_id, cap_id, isbn), CONSTRAINT fk_secc FOREIGN KEY (cap_id, isbn) REFERENCES public.capitulo_otro (cap_id, isbn) MATCH FULL )");
            res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void telefono() {
        try {
            ps = con.prepareStatement("CREATE TABLE public.telefono ( tel_cod numeric(3,0) NOT NULL, tel_num numeric(7,0) NOT NULL, representante numeric(10,0), miembro numeric(10,0), CONSTRAINT pk_tlf PRIMARY KEY (tel_cod, tel_num), CONSTRAINT fk_miembro FOREIGN KEY (miembro) REFERENCES public.miembro (doc_id) MATCH SIMPLE, CONSTRAINT fk_representante FOREIGN KEY (representante) REFERENCES public.representante (doc_ident) MATCH SIMPLE )");
            res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
