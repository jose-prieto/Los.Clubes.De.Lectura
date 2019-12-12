/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorBD;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Scripts {
    
    
        BDConexion connectivity = new BDConexion();
        
    public int llenarBD(){
        
              QueriesDaniel ejecD = new QueriesDaniel();
      QueriesJose ejecJ = new QueriesJose();
      QueriesAlberto ejecA = new QueriesAlberto();
      
      ejecD.CrearIdioma("tamil");
      ejecD.CrearIdioma("hebreo");
      ejecD.CrearIdioma("arameo");
      ejecD.CrearIdioma("gaelico");
      ejecD.CrearIdioma("latin");
      ejecD.CrearIdioma("geonosiano");
      ejecD.CrearIdioma("bengali");
      ejecD.CrearIdioma("farsi"); 
      
      ejecD.CrearDireccion_lugar("pais", "Islandia",null, null, 0);
      ejecD.CrearDireccion_lugar("pais", "Uruguay","Peso uruguayo", "Uruguaya", 0);
      ejecD.CrearDireccion_lugar("pais", "Colombia","Peso colombiano", "Colombiana", 0);
      ejecD.CrearDireccion_lugar("ciudad", "Medellin", null, null, 3);
      ejecD.CrearDireccion_lugar("ciudad", "Bogota", null, null, 3);
      ejecD.CrearDireccion_lugar("ciudad", "Rivera", null, null, 2);
      ejecD.CrearDireccion_lugar("ciudad", "Montevideo", null, null, 2);
      ejecD.CrearDireccion_lugar("pais", "Ginea", "franco guineano", "guineana", 0);
      ejecD.CrearDireccion_lugar("ciudad", "Akureyri", null, null, 1);
      ejecD.CrearDireccion_lugar("ciudad", "Conakri", null, null, 8);
      
      ejecJ.CrearRep(20111113, "Robert", null, "Serra", null, "m");
      ejecJ.CrearRep(12345678, "Elsa", null, "Pote", null, "f");
      ejecJ.CrearRep(28093123, "Gazpacho", "De", "Sopa", "Rodriguez", "m");
      ejecJ.CrearRep(5123789, "Maria", null, "Panchita", null, "f");
      ejecJ.CrearRep(2432489, "Jose", null, "Prieto", null, "m");
      ejecJ.CrearRep(1723711, "Daniel", null, "Jaspe", null, "m");
      ejecJ.CrearRep(2893238, "Alberto", null, "Ayala", null, "m");
      ejecJ.CrearRep(27348774, "Ana", "Josefina", "Maldonado", "Escolar", "f");

      ejecD.CrearClasificacion("epica", "genero",0);
      ejecD.CrearClasificacion("lirica", "genero",0);
      ejecD.CrearClasificacion("prosa", "genero",0);
      ejecD.CrearClasificacion("dramatica", "genero",0);
      ejecD.CrearClasificacion("la epopeya", "subgenero",1);
      ejecD.CrearClasificacion("fabula", "subgenero",2);
      ejecD.CrearClasificacion("romance", "subgenero",3);
      ejecD.CrearClasificacion("tragedia", "subgenero",4);
      
      ejecJ.CrearMiemb(27342711, "Roberto", null, "Hidalgo", null, "m", new Date(99,02,01));
      ejecJ.CrearMiemb(2253421, "Jose", null, "Prado", null, "m", new Date(99,02,01));
      ejecJ.CrearMiemb(16268735, "Carmen", null, "Delgadito", null, "f", new Date(99,02,01));
      ejecJ.CrearMiemb(20345678, "Alan", null, "Brito", null, "m", new Date(99,02,01));
      ejecJ.CrearMiemb(18234631, "Armando", null, "Casitas", null, "m", new Date(99,02,01));
      ejecJ.CrearMiemb(15234557, "Robert", null, "Plant", null, "m", new Date(99,02,01));
      ejecJ.CrearMiemb(5964816, "Gabriela", null, "Moreno", null, "f", new Date(99,02,01));
      ejecJ.CrearMiemb(22734126, "Artur", null, "Rito", null, "m", new Date(99,02,01));
      
      ejecJ.CrearTelMiem(414, 1381872, 27342711);
      ejecJ.CrearTelMiem(412, 2476721, 2253421);
      ejecJ.CrearTelMiem(414, 8135672, 16268735);
      ejecJ.CrearTelMiem(426, 1234567, 18234631);
      ejecJ.CrearTelRep(426, 1871826, 27348774);
      ejecJ.CrearTelRep(424, 1812318, 2432489);
      ejecJ.CrearTelRep(412, 1596312, 28093123);
      ejecJ.CrearTelRep(414, 1234567, 2893238);
      
      ejecD.CrearIdioma_miembro(27342711, 2);
      ejecD.CrearIdioma_miembro(2253421, 2);
      ejecD.CrearIdioma_miembro(16268735, 2);
      ejecD.CrearIdioma_miembro(20345678, 2);
      ejecD.CrearIdioma_miembro(18234631, 2);
      ejecD.CrearIdioma_miembro(15234557, 2);
      ejecD.CrearIdioma_miembro(5964816, 2);
      ejecD.CrearIdioma_miembro(22734126, 2);
      
      ejecD.CrearInstitucion("Googlo","Empresa de desarrollo de aplicaciones", 4);
      ejecD.CrearInstitucion("Muc Donels","Empresa de comida rapida", 6);
      ejecD.CrearInstitucion("Wawey", "Empresa fabricante de telefonos", 7);
      ejecD.CrearInstitucion("Mockey", "Empresa de entretenimiento", 5);
      ejecD.CrearInstitucion("Minalbo", "Empresa de agua", 6);
      ejecD.CrearInstitucion("Polarcita","Empresa de cervezas", 4);
      ejecD.CrearInstitucion("Canaima","Empresa de tecnologia punta", 5);
      ejecD.CrearInstitucion("Chorichipi","Empresa de choripanes", 7);
      
      ejecA.CrearClub("Lectura empedernida", "La esquna de mi casa", 1020, true, 2, 4);
      ejecA.CrearClub("Entretenimiento en papel", "Av. El Ejercito", 1012, false, 2, 4);
      ejecA.CrearClub("Lectores Anonimos", "Calle Antonio Guerrero", 1020, false, 2, 5);
      ejecA.CrearClub("Escritores frustrados", "Av. Libertador", 1020, true, 2, 5);
      ejecA.CrearClub("Libros con mucho té", "Esq. Albañales", 1020, false, 2, 6);
      ejecA.CrearClub("Sonrisas estudiosas", "Bello Monte", 1020, false, 2, 6);
      ejecA.CrearClub("Detectives encubiertos", "Ronda de Outeiro", 1020, false, 2, 7);
      ejecA.CrearClub("Los ebook son mejores", "A Estrada", 1020, false, 2, 7);
      
      ejecA.CrearAsociacion(1, 3);
      ejecA.CrearAsociacion(2, 3);
      ejecA.CrearAsociacion(1, 2);
      ejecA.CrearAsociacion(5, 4);
      ejecA.CrearAsociacion(6, 2);
      ejecA.CrearAsociacion(4, 7);
      ejecA.CrearAsociacion(1, 8);
      ejecA.CrearAsociacion(7, 6);
      
      ejecD.CrearGrupo( 1, "niños", "4", 5 , 6);
      ejecD.CrearGrupo( 2, "adultos", "2", 6 , 7);
      ejecD.CrearGrupo( 3, "adultos", "5", 6 , 7);
      ejecD.CrearGrupo( 4, "adultos", "6", 5 , 6);
      ejecD.CrearGrupo( 5, "adultos", "4", 5 , 6);
      ejecD.CrearGrupo( 6, "adultos", "3", 6 , 7);
      ejecD.CrearGrupo( 7, "niños", "2", 5 , 6);
      ejecD.CrearGrupo( 8, "niños", "3", 5 , 6);
      
      ejecD.CrearAuditorio(500, "Aula Magna UCAB", 5, 0);
      ejecD.CrearAuditorio(2000, "Naranja", 4, 0);
      ejecD.CrearAuditorio(1800, "Tobias Lasser", 6, 0);
      ejecD.CrearAuditorio(1500, "Madre Matilde", 4, 0);
      ejecD.CrearAuditorio(4000, "Teatro Municipal", 6, 0);
      ejecD.CrearAuditorio(7000, "TEATREX", 7, 0);
      ejecD.CrearAuditorio(3000, "Aula Magna UCV", 7, 0);
      ejecD.CrearAuditorio(1100, "Luisa Rodriguez de Mendoza", 5, 0);
      
      ejecD.CrearEditorial("Ediciones Trilce", 6);
      ejecD.CrearEditorial("Artefato", 7);
      ejecD.CrearEditorial("Atico Ediciones", 7);
      ejecD.CrearEditorial("Criatura Editora", 6);
      ejecD.CrearEditorial("Editorial Voluntad", 4);
      ejecD.CrearEditorial("Unibiblos", 5);
      ejecD.CrearEditorial("Angosta Editores", 4);
      ejecD.CrearEditorial("Babel Libros", 5);
      
      ejecJ.HistIns("Lectura empedernida", 27342711);
      ejecJ.HistIns("Entretenimiento en papel", 2253421);
      ejecJ.HistIns("Lectores Anonimos", 16268735);
      ejecJ.HistIns("Escritores frustrados", 20345678);
      ejecJ.HistIns("Libros con mucho té", 18234631);
      ejecJ.HistIns("Sonrisas estudiosas", 15234557);
      ejecJ.HistIns("Detectives encubiertos", 5964816);
      ejecJ.HistIns("Los ebook son mejores", 22734126);
      
     ejecJ.grupAdd(1, 1, 27342711 );
      ejecJ.grupAdd(2, 2, 2253421);
      ejecJ.grupAdd(3, 3, 16268735);
      ejecJ.grupAdd(4, 4, 20345678);
      ejecJ.grupAdd(5, 5, 18234631);
      ejecJ.grupAdd(6, 6, 15234557);
      ejecJ.grupAdd(7, 7, 5964816);
      ejecJ.grupAdd(8, 8, 22734126); 
     

     ejecA.Pago(27342711);
     ejecA.Pago(2253421 );
     ejecA.Pago(16268735);
     ejecA.Pago(20345678);
     ejecA.Pago(18234631);
     ejecA.Pago(15234557);
     ejecA.Pago(5964816);
     ejecA.Pago(22734126); 
     
     ejecD.CrearLibro(1234567, "la tregua", "habla sobre un hombre viudo y, cercano a jubilarse, que se enamora perdidamente de su empleada muy joven.", new Date(59,0,0), 200, null, null, 7, 2, 0);
     ejecD.CrearLibro(3817312, "la biblioteca de babel", "La biblioteca de Babel es un complejo compuesto por un número indefinido de galerías hexagonales e idénticas, donde hay grandes ventilaciones en el medio, cercadas por pequeñas barandas.", new Date(41,0,0), 120, null, null, 4, 3, 0);
     ejecD.CrearLibro(446677, "adan buenosayres", "describen las peripecias de Adán Buenosayres en el lapso comprendido entre un jueves santo y un domingo de resurrección transcurridos desde el 27 hasta el 29 de abril de un año indeterminado sobre la década de 1920.", new Date(48,0,0), 418, null, null, 2,  5, 0);
     ejecD.CrearLibro(4589556, "la casa de los espiritus", "narra las vivencias de cuatro generaciones de una familia y la forma en la que esta se ve afectada por las transformaciones que vive Chile, el país donde se desarrolla la obra.", new Date(82,0,0), 200, null, null, 1, 8, 0);
     ejecD.CrearLibro(92848, "la voragine", "narra las peripecias del poeta Arturo Cova y su amante Alicia, historia de pasión y venganza enmarcada en la selva amazónica, donde los dos amantes huyen y que expone, las duras condiciones de vida de los colonos e indígenas esclavizados durante la fiebre del caucho", new Date(24,0,0), 116, null, null, 3, 5, 0);
     ejecD.CrearLibro(7859665, "la casa verde", "narra 3 historias principales: La de Don Anselmo, la del Sargento Lituma y la del Bandido Fushia", new Date(66,0,0), 319, null, null, 2, 4, 0);
     ejecD.CrearLibro(1636657, "el crimen del otro", "Un conjunto de 12 cuentos del escritor Pablo Neruda.", new Date(4,0,0), 235, null, null, 6, 3, 0);
     ejecD.CrearLibro(3574567, "la ciudad", "el protagonista se muda a una casa prestada, provisionalmente, en un lugar indeterminado, del que tampoco se nos informa. Como la encuentra en un estado general de abandono debido a que había estado muchos años vacía, sale a buscar provisiones a un almacén sin tener una noción clara de la dirección por donde queda.", new Date(70,0,0), 118, null, null, 5, 5, 0);
     
     /*ejecA.CrearAutorLibro("Mario", null, "Bendetti", null, 1234567);
     ejecA.CrearAutorLibro("Jorge", "Luis", "Borges", null, 3817312);
     ejecA.CrearAutorLibro("Isabel", null, "Allende", "Llona", 4589556);
     ejecA.CrearAutorLibro("Jose", "Eustasio", "Rivera", "Salas", 92848);
     ejecA.CrearAutorLibro("Horacio", "Silvestre", "Quiroga", "Forteza", 1636657);
     ejecA.CrearAutorLibro("Jorge","Mario", "Varlotta", "Levrero", 1234567);
     ejecA.CrearAutorLibro("Leopoldo", null, "Marechal", null, 446677);
     ejecA.CrearAutorLibro("Mario", null, "Vargas", "Llosa", 7859665);*/
     
     ejecA.CrearObra(3,"activa","La tregua", 5000, 1);
      ejecA.club_obra(1);
      ejecA.lib_obra(1234567);
     ejecA.CrearObra(1,"inactiva","La biblioteca de Babel", 3200, 2);
      ejecA.club_obra(2);
      ejecA.lib_obra(3817312);
     ejecA.CrearObra(2,"activa","Adam Buenosayres", 4000, 3);
      ejecA.club_obra(3);
      ejecA.lib_obra(446677);
     ejecA.CrearObra(1,"activa","La casa de los espiritus", 2300, 4);
      ejecA.club_obra(4);
      ejecA.lib_obra(4589556);
     ejecA.CrearObra(3,"activa","La Voragine", 4800, 5);
      ejecA.club_obra(5);
      ejecA.lib_obra(92848);
     ejecA.CrearObra(2,"activa","La casa verde", 1600, 6);
      ejecA.club_obra(6);
      ejecA.lib_obra(7859665);
     ejecA.CrearObra(3,"activa","El crimen del otro", 6500, 7);
      ejecA.club_obra(7);
      ejecA.lib_obra(1636657);
     ejecA.CrearObra(1,"activa","La ciudad", 2000, 8);
      ejecA.club_obra(8);
      ejecA.lib_obra(3574567);
     
     
     ejecJ.libMiem(27342711,1234567);
     ejecJ.libMiem(2253421,3817312);
     ejecJ.libMiem(16268735,446677);
     ejecJ.libMiem(20345678,4589556);
     ejecJ.libMiem(18234631,92848);
     ejecJ.libMiem(15234557,7859665);
     ejecJ.libMiem(5964816,1636657);
     ejecJ.libMiem(22734126,3574567);
     
          
     ejecJ.miemPref(27342711,1234567, 1);
     ejecJ.miemPref(2253421,3817312, 1);
     ejecJ.miemPref(16268735,446677, 1);
     ejecJ.miemPref(20345678,4589556, 1);
     ejecJ.miemPref(18234631,92848, 1);
     ejecJ.miemPref(15234557,7859665, 1);
     ejecJ.miemPref(5964816,1636657, 1);
     ejecJ.miemPref(22734126,3574567, 1);
     
          
    ejecD.CrearFuncion(new Date(119,5,9), 1, 2, false, 0, 0);
    ejecD.CrearFuncion(new Date(119,8,12), 2, 2, true, 4, 2137);
    ejecD.CrearFuncion(new Date(119,4,3), 3, 1, true, 3, 812);
    ejecD.CrearFuncion(new Date(119,1,27), 4, 3, true, 5, 2443);
    ejecD.CrearFuncion(new Date(119,11,18), 5, 1, true, 2, 1578);
    ejecD.CrearFuncion(new Date(119,2,25), 6, 4, false, 0, 0);
    ejecD.CrearFuncion(new Date(119,7,4), 7, 2, false, 0, 0);
    ejecD.CrearFuncion(new Date(119,6,13), 8, 1, false, 0, 0);     
    
        
    ejecD.CrearPersonaje(1, "Martin Santome", "personaje principal de la obra, un hombre maduro de 49 años, canoso, funcionario.");
    ejecD.CrearPersonaje(2, "El Bibliotecario", "nuestro narrador, un bibliotecario que pasa sus días en soledad, es el único personaje de la historia.");
    ejecD.CrearPersonaje(3, "Adan Buenosayres", "el personaje principal de la obra.");
    ejecD.CrearPersonaje(4, "Clara Del Valle", "Clara, es la matriarca esquiva y misteriosa, quien predice las tragedias de la familia y establece el destino de la casa y de los Trueba.");
    ejecD.CrearPersonaje(5, "Arturo Cova", "personaje principal de la obra.");
    ejecD.CrearPersonaje(6, "Don Anselmo", " Parece ser un personaje que está más allá del tiempo, pues nadie sabe nada de su pasado y él no parece tener proyectos a futuro.");
    ejecD.CrearPersonaje(7, "Brandimarte de Normandía", "flor de la nobleza cristiana y vástago de una gloriosa familia.");
    ejecD.CrearPersonaje(8, "Giménez", "el simpático encargado de una estación de servicio descomunal ubicada en un pueblucho por el que jamás pasa un auto.");
    
    
    ejecD.CrearCapitulo(7859665,"capitulo uno", null);
    ejecD.CrearCapitulo(7859665,"capitulo dos", null);
    ejecD.CrearCapitulo(7859665,"capitulo tres", null);
    ejecD.CrearCapitulo(7859665,"capitulo cuatro", null);
    ejecD.CrearCapitulo(7859665,"epilogo",null);
    ejecD.CrearCapitulo(1636657,"capitulo uno", null);
    ejecD.CrearCapitulo(1636657,"capitulo dos", null);
    ejecD.CrearCapitulo(1636657,"capitulo tres", null);
    
    
    ejecD.CrearSeccion(1, 7859665,"prologo", null);
    ejecD.CrearSeccion(1, 7859665,"I", null);
    ejecD.CrearSeccion(1, 7859665,"II", null);
    ejecD.CrearSeccion(1, 7859665,"III", null);
    ejecD.CrearSeccion(1, 7859665,"IV",null);
    ejecD.CrearSeccion(2, 7859665,"prologo", null);
    ejecD.CrearSeccion(2, 7859665,"I", null);
    ejecD.CrearSeccion(2, 7859665,"II", null);
    
    
    ejecD.CrearElenco(27342711, "Martin Santome");
    ejecD.CrearElenco(2253421, "El Bibliotecario");
    ejecD.CrearElenco(16268735, "Adan Buenosayres");
    ejecD.CrearElenco(20345678, "Clara Del Valle");
    ejecD.CrearElenco(18234631, "Arturo Cova");
    ejecD.CrearElenco(15234557, "Don Anselmo");
    ejecD.CrearElenco(5964816, "Brandimarte de Normandía");
    ejecD.CrearElenco(22734126, "Giménez");
    
    
    ejecD.CrearActor(27342711, "Martin Santome", new Date(119,5,9));
    ejecD.CrearActor(2253421, "El Bibliotecario", new Date(119,8,12));
    ejecD.CrearActor(16268735,"Adan Buenosayres", new Date(119,4,3));
    ejecD.CrearActor(20345678,"Clara Del Valle", new Date(119,1,27));
    ejecD.CrearActor(18234631,"Arturo Cova", new Date(119,11,18));
    ejecD.CrearActor(15234557,"Don Anselmo", new Date(119,2,25));
    ejecD.CrearActor(5964816, "Brandimarte de Normandía",new Date(119,7,4));
    ejecD.CrearActor(22734126,"Giménez", new Date(119,6,13));
    
      
      
     
      
      
    return 1;
    }
       
    public int iniciarBD(){
       try (Connection con = connectivity.getConnection()){
        PreparedStatement ps = null;
        ResultSet res = null;
        
        secuencias();
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
        inasistencia();
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
      
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
       }
       return 1; 
    }  
    public void actor() {
        try (Connection con = connectivity.getConnection()){
        PreparedStatement ps = null;
        ResultSet res = null;
            ps = con.prepareStatement("CREATE TABLE public.actor ( fechai_mie date NOT NULL, club_id numeric(3,0) NOT NULL, doc_id numeric(10,0) NOT NULL, obra_id numeric(3,0) NOT NULL, perso_id numeric(5,0) NOT NULL, obraf_id numeric(3,0) NOT NULL,  func_fecha date NOT NULL, CONSTRAINT pk_actor PRIMARY KEY (doc_id, club_id, fechai_mie, obra_id, perso_id, obraf_id, func_fecha), CONSTRAINT fk_actor_elenco FOREIGN KEY (doc_id, club_id, fechai_mie, obra_id, perso_id) REFERENCES public.elenco (doc_id, club_id, fechai_mie, obra_id, perso_id) MATCH SIMPLE ON UPDATE NO ACTION ON DELETE NO ACTION, CONSTRAINT fk_actor_funcion FOREIGN KEY (obraf_id, func_fecha) REFERENCES public.funcion (obra_id, func_fecha) MATCH SIMPLE ON UPDATE NO ACTION ON DELETE NO ACTION )");
            res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    
    public void asociacion() {
        try (Connection con = connectivity.getConnection()){
        PreparedStatement ps = null;
        ResultSet res = null;
        ps = con.prepareStatement("CREATE TABLE public.asociacion ( club1 numeric(3,0) NOT NULL, club2 numeric(3,0) NOT NULL, CONSTRAINT pk_asociacion PRIMARY KEY (club2, club1), CONSTRAINT fk_aso_club1 FOREIGN KEY (club1) REFERENCES public.club (club_id) MATCH SIMPLE, CONSTRAINT fk_aso_club2 FOREIGN KEY (club2) REFERENCES public.club (club_id) MATCH SIMPLE)");
        res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void auditorio() {
        try (Connection con = connectivity.getConnection()){
        PreparedStatement ps = null;
        ResultSet res = null;
        ps = con.prepareStatement("CREATE TABLE public.auditorio ( audi_id numeric(3,0) NOT NULL DEFAULT nextval('audi_audi_id_seq'::regclass), audi_capacidad numeric(4,0) NOT NULL, audi_nombre character varying(30) COLLATE pg_catalog.\"default\" NOT NULL, dir_id numeric(4,0) NOT NULL, club_id numeric(3,0), CONSTRAINT pk_auditorio PRIMARY KEY (audi_id), CONSTRAINT fk_aud_club FOREIGN KEY (club_id) REFERENCES public.club (club_id) MATCH SIMPLE, CONSTRAINT fk_aud_dir FOREIGN KEY (dir_id) REFERENCES public.direccion_lugar (dir_id) MATCH SIMPLE)");
        res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void autor() {
        try (Connection con = connectivity.getConnection()){
        PreparedStatement ps = null;
        ResultSet res = null;
        ps = con.prepareStatement("CREATE TABLE public.autor ( aut_id numeric(3,0) NOT NULL DEFAULT nextval('aut_aut_id_seq'::regclass), aut_nombre1 character varying(15) COLLATE pg_catalog.\"default\" NOT NULL, aut_nombre2 character varying(15) COLLATE pg_catalog.\"default\", aut_ape1 character varying(15) COLLATE pg_catalog.\"default\" NOT NULL, aut_ape2 character varying(15) COLLATE pg_catalog.\"default\", isbn numeric(15,0) NOT NULL, CONSTRAINT pk_autor PRIMARY KEY (aut_id), CONSTRAINT fk_autor FOREIGN KEY (isbn) REFERENCES public.libro (isbn) MATCH SIMPLE)");
        res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void capitulo_otro() {
        try (Connection con = connectivity.getConnection()){
        PreparedStatement ps = null;
        ResultSet res = null;
        ps = con.prepareStatement("CREATE TABLE public.capitulo_otro ( cap_id numeric(4,0) NOT NULL DEFAULT nextval('cap_cap_id_seq'::regclass), isbn numeric(15,0) NOT NULL, cap_nombre character varying(30) COLLATE pg_catalog.\"default\" NOT NULL, cap_titulo character varying(30) COLLATE pg_catalog.\"default\", CONSTRAINT pk_capitulo_otro PRIMARY KEY (isbn, cap_id), CONSTRAINT fk_capitulo_isbn FOREIGN KEY (isbn) REFERENCES public.libro (isbn) MATCH SIMPLE)");
        res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
        
    public void clasificacion() {
            try (Connection con = connectivity.getConnection()){
        PreparedStatement ps = null;
        ResultSet res = null;
        ps = con.prepareStatement("CREATE TABLE public.clasificacion ( clasi_id numeric(3,0) NOT NULL DEFAULT nextval('clasi_clasi_id_seq'::regclass), clasi_nombre character varying(30) COLLATE pg_catalog.\"default\" UNIQUE NOT NULL, clasi_tipo character varying(12) COLLATE pg_catalog.\"default\" NOT NULL, clasi_padre numeric(3,0), CONSTRAINT pk_clasificacion PRIMARY KEY (clasi_id), CONSTRAINT fk_clasi_padre FOREIGN KEY (clasi_padre) REFERENCES public.clasificacion (clasi_id) MATCH SIMPLE)");
        res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void club() {
        try (Connection con = connectivity.getConnection()){
        PreparedStatement ps = null;
        ResultSet res = null;
        ps = con.prepareStatement("CREATE TABLE public.club ( club_id numeric(3,0) NOT NULL DEFAULT nextval('club_club_id_seq'::regclass), club_nombre character varying(30) COLLATE pg_catalog.\"default\" UNIQUE NOT NULL, club_fecha_inicio timestamp without time zone NOT NULL DEFAULT CURRENT_DATE, direccion character varying(50) COLLATE pg_catalog.\"default\" NOT NULL, cod_postal numeric(10,0) NOT NULL, cuota boolean, idio_id numeric(2,0) NOT NULL, dir_id numeric(4,0) NOT NULL, inst_id numeric(3,0), CONSTRAINT pk_club PRIMARY KEY (club_id), CONSTRAINT fk_club_dir FOREIGN KEY (dir_id) REFERENCES public.direccion_lugar (dir_id) MATCH SIMPLE, CONSTRAINT fk_club_idio FOREIGN KEY (idio_id) REFERENCES public.idioma (idio_id) MATCH SIMPLE, CONSTRAINT fk_club_inst FOREIGN KEY (inst_id) REFERENCES public.institucion (inst_id) MATCH SIMPLE)");    
        res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
     public void club_obra() {
        try (Connection con = connectivity.getConnection()){
        PreparedStatement ps = null;
        ResultSet res = null;
        ps = con.prepareStatement("CREATE TABLE public.club_obra ( obra_id numeric(3,0) NOT NULL, club_id numeric(3,0) NOT NULL, CONSTRAINT pk_club_obra PRIMARY KEY (club_id, obra_id), CONSTRAINT fk_co_club FOREIGN KEY (club_id) REFERENCES public.club (club_id) MATCH SIMPLE, CONSTRAINT fk_co_obra FOREIGN KEY (obra_id) REFERENCES public.obra (obra_id) MATCH SIMPLE )");
        res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void direccion_lugar() {
        try (Connection con = connectivity.getConnection()){
        PreparedStatement ps = null;
        ResultSet res = null;
        ps = con.prepareStatement("CREATE TABLE public.direccion_lugar ( dir_id numeric(4,0) NOT NULL DEFAULT nextval('dir_dir_id_seq'::regclass), dir_tipo character varying(10) COLLATE pg_catalog.\"default\" NOT NULL, dir_nombre character varying(20) COLLATE pg_catalog.\"default\" UNIQUE NOT NULL, moneda varchar(45), nacionalidad character varying(20) COLLATE pg_catalog.\"default\", dir_id_padre numeric(4,0), CONSTRAINT pk_direccion PRIMARY KEY (dir_id), CONSTRAINT fk_direccion FOREIGN KEY (dir_id_padre) REFERENCES public.direccion_lugar (dir_id) MATCH SIMPLE)");
        res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
     public void editorial() {
        try (Connection con = connectivity.getConnection()){
        PreparedStatement ps = null;
        ResultSet res = null;
            ps = con.prepareStatement("CREATE TABLE public.editorial ( edit_id numeric(3,0) NOT NULL DEFAULT nextval('edit_edit_id_seq'::regclass), edit_nombre character varying(50) COLLATE pg_catalog.\"default\" UNIQUE NOT NULL, dir_id numeric(4,0) NOT NULL, CONSTRAINT pk_editorial PRIMARY KEY (edit_id), CONSTRAINT fk_edit_dir FOREIGN KEY (dir_id) REFERENCES public.direccion_lugar (dir_id) MATCH SIMPLE )");
            res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
     
    public void elenco() {
        try (Connection con = connectivity.getConnection()){
        PreparedStatement ps = null;
        ResultSet res = null;
            ps = con.prepareStatement("CREATE TABLE public.elenco ( fechai_mie date NOT NULL, club_id numeric(3,0) NOT NULL, doc_id numeric(10,0) NOT NULL, obra_id numeric(3,0) NOT NULL, perso_id numeric(5,0) NOT NULL, CONSTRAINT pk_elenco PRIMARY KEY (doc_id, club_id, fechai_mie, obra_id, perso_id), CONSTRAINT fk_elenco_hist FOREIGN KEY (doc_id, club_id, fechai_mie) REFERENCES public.hist_miembro (doc_id, club_id, fechai_mie) MATCH SIMPLE, CONSTRAINT fk_elenco_perso FOREIGN KEY (obra_id, perso_id) REFERENCES public.personaje (obra_id, perso_id) MATCH SIMPLE )");
            res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void funcion() {
        try (Connection con = connectivity.getConnection()){
        PreparedStatement ps = null;
        ResultSet res = null;
             ps = con.prepareStatement("CREATE TABLE public.funcion ( func_fecha date NOT NULL, obra_id numeric(3,0) NOT NULL, func_hora numeric(2,0) NOT NULL, estatus_realizado boolean NOT NULL, func_valoracion numeric(1,0), func_entradas_vend numeric(4,0), CONSTRAINT pk_funcion PRIMARY KEY (obra_id, func_fecha), CONSTRAINT fk_funcion FOREIGN KEY (obra_id) REFERENCES public.obra (obra_id) MATCH SIMPLE )");
            res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
      public void g_lector() {
        try (Connection con = connectivity.getConnection()){
        PreparedStatement ps = null;
        ResultSet res = null;
        ps = con.prepareStatement("CREATE TABLE public.g_lector ( grup_id numeric(3,0) NOT NULL, club_id numeric(3,0) NOT NULL, fechai_mie date NOT NULL, clubh_id numeric(3,0) NOT NULL, doc_id numeric(10,0) NOT NULL, fechai_gru date NOT NULL, fechaf_gru date, CONSTRAINT pk_g_lector PRIMARY KEY (club_id, grup_id, doc_id, clubh_id, fechai_mie), CONSTRAINT fk_g_lector1 FOREIGN KEY (doc_id, clubh_id, fechai_mie) REFERENCES public.hist_miembro (doc_id, club_id, fechai_mie) MATCH SIMPLE, CONSTRAINT fk_g_lector2 FOREIGN KEY (club_id, grup_id) REFERENCES public.grupo (club_id, grup_id) MATCH SIMPLE )");
        res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
        
    public void grupo() {
        try (Connection con = connectivity.getConnection()){
        PreparedStatement ps = null;
        ResultSet res = null;
        ps = con.prepareStatement("CREATE TABLE public.grupo ( grup_id numeric(3,0) NOT NULL DEFAULT nextval('grup_grup_id_seq'::regclass), club_id numeric(3,0) NOT NULL, grup_tipo character varying(30) COLLATE pg_catalog.\"default\" NOT NULL, dia character varying(10), horai numeric(2,0), horaf numeric(2,0), CONSTRAINT pk_grupo PRIMARY KEY (club_id, grup_id), CONSTRAINT fk_grupo FOREIGN KEY (club_id) REFERENCES public.club (club_id) MATCH SIMPLE )");
        res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
   public void hist_miembro() {
        try (Connection con = connectivity.getConnection()){
        PreparedStatement ps = null;
        ResultSet res = null;
            ps = con.prepareStatement("CREATE TABLE public.hist_miembro (fechai_mie timestamp without time zone NOT NULL DEFAULT CURRENT_DATE, club_id numeric(3,0) NOT NULL, doc_id numeric(10,0) NOT NULL, estatus_mie character varying(20) COLLATE pg_catalog.\"default\" NOT NULL, fechaf_mie date, motivo_retiro character varying(20) COLLATE pg_catalog.\"default\", CONSTRAINT pk_hist_miembro PRIMARY KEY (doc_id, club_id, fechai_mie), CONSTRAINT fk_hist_club FOREIGN KEY (club_id) REFERENCES public.club (club_id) MATCH SIMPLE, CONSTRAINT fk_hist_doc FOREIGN KEY (doc_id) REFERENCES public.miembro (doc_id) MATCH SIMPLE )");
            res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
   
    public void idioma() {
        try (Connection con = connectivity.getConnection()){
        PreparedStatement ps = null;
        ResultSet res = null;
            ps = con.prepareStatement("CREATE TABLE public.idioma ( idio_id numeric(2,0) NOT NULL DEFAULT nextval('idio_idio_id_seq'::regclass), idio_nombre character varying(20) COLLATE pg_catalog.\"default\" UNIQUE NOT NULL, CONSTRAINT pk_idioma PRIMARY KEY (idio_id) )");
            res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
     public void idioma_miembro() {
        try (Connection con = connectivity.getConnection()){
        PreparedStatement ps = null;
        ResultSet res = null;
            ps = con.prepareStatement("CREATE TABLE public.idioma_miembro ( doc_id numeric(10,0) NOT NULL, idio_id numeric(2,0) NOT NULL, CONSTRAINT pk_idioma_miembro PRIMARY KEY (doc_id, idio_id), CONSTRAINT fk_im_doc FOREIGN KEY (doc_id) REFERENCES public.miembro (doc_id) MATCH SIMPLE ON UPDATE NO ACTION ON DELETE NO ACTION NOT VALID, CONSTRAINT fk_im_idioma FOREIGN KEY (idio_id) REFERENCES public.idioma (idio_id) MATCH SIMPLE )");
            res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void inasistencia() {
        try (Connection con = connectivity.getConnection()){
        PreparedStatement ps = null;
        ResultSet res = null;
            ps = con.prepareStatement("CREATE TABLE public.inasistencia (reu_fecha date NOT NULL, grupr_id numeric(3,0) NOT NULL, clubr_id numeric(3,0) NOT NULL, grup_id numeric(3,0) NOT NULL, club_id numeric(3,0) NOT NULL, fechai_mie date NOT NULL, clubh_id numeric(3,0) NOT NULL, doc_id numeric(10,0) NOT NULL, CONSTRAINT pk_inasistencia PRIMARY KEY (clubr_id, grupr_id, reu_fecha, club_id, grup_id, doc_id, clubh_id, fechai_mie), CONSTRAINT fk_inasist1 FOREIGN KEY (clubr_id, grupr_id, reu_fecha) REFERENCES public.reuniones (club_id, grup_id, reu_fecha) MATCH SIMPLE, CONSTRAINT fk_inasist2 FOREIGN KEY (club_id, grup_id, doc_id, clubh_id, fechai_mie) REFERENCES public.g_lector (club_id, grup_id, doc_id, clubh_id, fechai_mie) MATCH SIMPLE )");
            res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
     
    public void institucion() {
        try (Connection con = connectivity.getConnection()){
        PreparedStatement ps = null;
        ResultSet res = null;
            ps = con.prepareStatement("CREATE TABLE public.institucion ( inst_id numeric(3,0) NOT NULL DEFAULT nextval('inst_inst_id_seq'::regclass), inst_nombre character varying(30) COLLATE pg_catalog.\"default\" NOT NULL, inst_desc character varying(50) COLLATE pg_catalog.\"default\" NOT NULL, dir_id numeric(4,0) NOT NULL, CONSTRAINT pk_institucion PRIMARY KEY (inst_id), CONSTRAINT fk_inst FOREIGN KEY (dir_id) REFERENCES public.direccion_lugar (dir_id) MATCH SIMPLE )");
            res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void libro() {
        try (Connection con = connectivity.getConnection()){
        PreparedStatement ps = null;
        ResultSet res = null;
            ps = con.prepareStatement("CREATE TABLE public.libro ( isbn numeric(15,0) NOT NULL, lib_tit_original character varying(50) COLLATE pg_catalog.\"default\" UNIQUE NOT NULL, sinopsis character varying(500) COLLATE pg_catalog.\"default\" NOT NULL, lib_ano_publi date NOT NULL, lib_pag numeric(4,0) NOT NULL, titulo_esp character varying(50) COLLATE pg_catalog.\"default\", tema_princ character varying(100) COLLATE pg_catalog.\"default\", clasi_id numeric(3,0) NOT NULL, edit_id numeric(3,0) NOT NULL, isbn_padre numeric(15,0), CONSTRAINT pk_libro PRIMARY KEY (isbn), CONSTRAINT fk_libro_clasi FOREIGN KEY (clasi_id) REFERENCES public.clasificacion (clasi_id) MATCH SIMPLE, CONSTRAINT fk_libro_edit FOREIGN KEY (edit_id) REFERENCES public.editorial (edit_id) MATCH SIMPLE, CONSTRAINT fk_libro_librop FOREIGN KEY (isbn_padre) REFERENCES public.libro (isbn) MATCH SIMPLE )");
            res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void libro_miembro() {
        try (Connection con = connectivity.getConnection()){
        PreparedStatement ps = null;
        ResultSet res = null;
            ps = con.prepareStatement("CREATE TABLE public.libro_miembro ( doc_id numeric(10,0) NOT NULL, isbn numeric(15,0) NOT NULL, CONSTRAINT pk_libro_miembro PRIMARY KEY (doc_id, isbn), CONSTRAINT fk_lm_doc FOREIGN KEY (doc_id) REFERENCES public.miembro (doc_id) MATCH SIMPLE, CONSTRAINT fk_lm_isbn FOREIGN KEY (isbn) REFERENCES public.libro (isbn) MATCH SIMPLE )");
            res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void libro_obra() {
        try (Connection con = connectivity.getConnection()){
        PreparedStatement ps = null;
        ResultSet res = null;
            ps = con.prepareStatement("CREATE TABLE public.libro_obra ( isbn numeric(15,0) NOT NULL, obra_id numeric(3,0) NOT NULL, CONSTRAINT pk_libro_obra PRIMARY KEY (isbn, obra_id), CONSTRAINT fk_lo_isbn FOREIGN KEY (isbn) REFERENCES public.libro (isbn) MATCH SIMPLE, CONSTRAINT fk_lo_obra FOREIGN KEY (obra_id) REFERENCES public.obra (obra_id) MATCH SIMPLE )");
            res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void libros_preferidos() {
        try (Connection con = connectivity.getConnection()){
        PreparedStatement ps = null;
        ResultSet res = null;
            ps = con.prepareStatement("CREATE TABLE public.libros_preferidos ( doc_id numeric(10,0) NOT NULL, isbn numeric(15,0) NOT NULL, posicion numeric(1,0) NOT NULL, CONSTRAINT pk_libro_preferido PRIMARY KEY (doc_id, isbn), CONSTRAINT fk_lp_doc FOREIGN KEY (doc_id) REFERENCES public.miembro (doc_id) MATCH SIMPLE, CONSTRAINT fk_lp_isbn FOREIGN KEY (isbn) REFERENCES public.libro (isbn) MATCH SIMPLE )");
            res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void miembro() {
        try (Connection con = connectivity.getConnection()){
        PreparedStatement ps = null;
        ResultSet res = null;
            ps = con.prepareStatement("CREATE TABLE public.miembro ( doc_id numeric(10,0) NOT NULL, miemb_nombre1 character varying(15) COLLATE pg_catalog.\"default\" NOT NULL, miemb_nombre2 character varying(15) COLLATE pg_catalog.\"default\", miemb_ape1 character varying(15) COLLATE pg_catalog.\"default\" NOT NULL, miemb_ape2 character varying(15) COLLATE pg_catalog.\"default\", miemb_genero character varying(10) COLLATE pg_catalog.\"default\" NOT NULL, miemb_fecha_nac date NOT NULL, dir_id numeric(3,0), representante numeric(10,0), representante_m numeric(10,0), CONSTRAINT pk_miembro PRIMARY KEY (doc_id),CONSTRAINT fk_direccion FOREIGN KEY (dir_id) REFERENCES public.direccion_lugar (dir_id) MATCH SIMPLE, CONSTRAINT fk_representante FOREIGN KEY (representante) REFERENCES public.representante (doc_ident) MATCH SIMPLE, CONSTRAINT fk_representante_m FOREIGN KEY (representante_m) REFERENCES public.miembro (doc_id) MATCH SIMPLE )");                    
            res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void obra() {
        try (Connection con = connectivity.getConnection()){
        PreparedStatement ps = null;
        ResultSet res = null;
            ps = con.prepareStatement("CREATE TABLE public.obra ( obra_id numeric(3,0) NOT NULL DEFAULT nextval('obra_obra_id_seq'::regclass), obra_duracion numeric(1,0) NOT NULL, obra_estatus character varying(20) COLLATE pg_catalog.\"default\" NOT NULL, obra_titulo character varying(50) COLLATE pg_catalog.\"default\" NOT NULL, costo_entrada numeric(10,0) NOT NULL, audi_id numeric(3,0) NOT NULL, CONSTRAINT pk_obra PRIMARY KEY (obra_id), CONSTRAINT fk_auditorio FOREIGN KEY (audi_id) REFERENCES public.auditorio (audi_id) MATCH SIMPLE )");
            res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void pago() {
        try (Connection con = connectivity.getConnection()){
        PreparedStatement ps = null;
        ResultSet res = null;
            ps = con.prepareStatement("CREATE TABLE public.pago ( pago_id numeric(3,0) NOT NULL DEFAULT nextval('pago_pago_id_seq'::regclass), fechai_mie date NOT NULL, club_id numeric(3,0) NOT NULL, doc_id numeric(10,0) NOT NULL, pago_fecha timestamp without time zone NOT NULL DEFAULT CURRENT_DATE, CONSTRAINT pk_pago PRIMARY KEY (pago_id, fechai_mie, club_id, doc_id), CONSTRAINT fk_pago FOREIGN KEY (doc_id, fechai_mie, club_id) REFERENCES public.hist_miembro (doc_id, fechai_mie, club_id) MATCH SIMPLE )");
            res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
        public void personaje() {
        try (Connection con = connectivity.getConnection()){
        PreparedStatement ps = null;
        ResultSet res = null;
            ps = con.prepareStatement("CREATE TABLE public.personaje ( perso_id numeric(5,0) NOT NULL DEFAULT nextval('perso_perso_id_seq'::regclass), obra_id numeric(3,0) NOT NULL, perso_nombre character varying(35) COLLATE pg_catalog.\"default\" NOT NULL, perso_desc character varying(500) COLLATE pg_catalog.\"default\" NOT NULL, CONSTRAINT pk_personaje PRIMARY KEY (obra_id, perso_id), CONSTRAINT fk_personaje FOREIGN KEY (obra_id) REFERENCES public.obra (obra_id) MATCH SIMPLE )");
            res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
        
    public void representante() {
        try (Connection con = connectivity.getConnection()){
        PreparedStatement ps = null;
        ResultSet res = null;
            ps = con.prepareStatement("CREATE TABLE public.representante ( doc_ident numeric(10,0) NOT NULL, rep_nombre1 character varying(15) COLLATE pg_catalog.\"default\" NOT NULL, rep_nombre2 character varying(15) COLLATE pg_catalog.\"default\", rep_ape1 character varying(15) COLLATE pg_catalog.\"default\" NOT NULL, rep_ape2 character varying(15) COLLATE pg_catalog.\"default\", rep_genero character varying(10) COLLATE pg_catalog.\"default\" NOT NULL, CONSTRAINT pk_representante PRIMARY KEY (doc_ident) )");
            res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void reuniones() {
        try (Connection con = connectivity.getConnection()){
        PreparedStatement ps = null;
        ResultSet res = null;
            ps = con.prepareStatement("CREATE TABLE public.reuniones (reu_fecha date NOT NULL, grup_id numeric(3,0) NOT NULL, club_id numeric(3,0) NOT NULL, reu_conclusiones character varying(400), reu_valoracion numeric(1,0), isbn numeric(15,0) NOT NULL, grupg_l_id numeric(3,0) NOT NULL, clubg_l_id numeric(3,0) NOT NULL, clubh_id numeric(3,0) NOT NULL, fechai_mie date NOT NULL, doc_id numeric(10,0) NOT NULL, CONSTRAINT pk_reuniones PRIMARY KEY (club_id, grup_id, reu_fecha), CONSTRAINT fk_reu1 FOREIGN KEY (clubg_l_id, grupg_l_id, doc_id, clubh_id, fechai_mie) REFERENCES public.g_lector (club_id, grup_id, doc_id, clubh_id, fechai_mie) MATCH SIMPLE, CONSTRAINT fk_reu2 FOREIGN KEY ( club_id, grup_id) REFERENCES public.grupo (club_id, grup_id) MATCH SIMPLE, CONSTRAINT fk_reu3 FOREIGN KEY (isbn) REFERENCES public.libro (isbn) MATCH SIMPLE )");
            res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void seccion() {
        try (Connection con = connectivity.getConnection()){
        PreparedStatement ps = null;
        ResultSet res = null;
            ps = con.prepareStatement("CREATE TABLE public.seccion ( secc_id numeric(4,0) NOT NULL DEFAULT nextval('secc_secc_id_seq'::regclass), cap_id numeric(4,0) NOT NULL, isbn numeric(15,0) NOT NULL, secc_nombre character varying(30) COLLATE pg_catalog.\"default\" NOT NULL, secc_titulo character varying(30) COLLATE pg_catalog.\"default\", CONSTRAINT pk_seccion PRIMARY KEY (isbn, cap_id, secc_id), CONSTRAINT fk_secc FOREIGN KEY (isbn, cap_id) REFERENCES public.capitulo_otro (isbn, cap_id) MATCH FULL )");
            res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void secuencias() {
        try (Connection con = connectivity.getConnection()){
        PreparedStatement ps = null;
        ResultSet res = null;
        ps = con.prepareStatement("CREATE SEQUENCE idio_idio_id_seq increment by 1 start with 1; CREATE SEQUENCE dir_dir_id_seq increment by 1 start with 1; CREATE SEQUENCE club_club_id_seq increment by 1 start with 1; CREATE SEQUENCE grup_grup_id_seq increment by 1 start with 1; CREATE SEQUENCE secc_secc_id_seq increment by 1 start with 1; CREATE SEQUENCE cap_cap_id_seq increment by 1 start with 1; CREATE SEQUENCE pago_pago_id_seq increment by 1 start with 1; CREATE SEQUENCE edit_edit_id_seq increment by 1 start with 1; CREATE SEQUENCE clasi_clasi_id_seq increment by 1 start with 1; CREATE SEQUENCE audi_audi_id_seq increment by 1 start with 1; CREATE SEQUENCE obra_obra_id_seq increment by 1 start with 1; CREATE SEQUENCE aut_aut_id_seq increment by 1 start with 1; CREATE SEQUENCE perso_perso_id_seq increment by 1 start with 1; CREATE SEQUENCE inst_inst_id_seq increment by 1 start with 1;");
        res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }   
    
    public void telefono() {
        try (Connection con = connectivity.getConnection()){
        PreparedStatement ps = null;
        ResultSet res = null;
            ps = con.prepareStatement("CREATE TABLE public.telefono ( tel_cod numeric(3,0) NOT NULL, tel_num numeric(7,0) NOT NULL, representante numeric(10,0), miembro numeric(10,0), CONSTRAINT pk_tlf PRIMARY KEY (tel_cod, tel_num), CONSTRAINT fk_miembro FOREIGN KEY (miembro) REFERENCES public.miembro (doc_id) MATCH SIMPLE, CONSTRAINT fk_representante FOREIGN KEY (representante) REFERENCES public.representante (doc_ident) MATCH SIMPLE )");
            res = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
