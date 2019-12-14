/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author dani_
 */
public class Lanzador {
    public static void main(String[] args){
        crearBD();
        Scripts iniciar = new Scripts();
        int init = iniciar.iniciarBD(); 
        init = iniciar.llenarBD();
        
        
    }
    
    public static void crearBD() {
        BDConexion conexion = new BDConexion();
        String UR = "jdbc:postgresql://localhost:5432/postgres";
        try (Connection con = conexion.getConnection(UR)){

            PreparedStatement ps = null;
            ResultSet res = null;
            ps = con.prepareStatement("CREATE DATABASE CLUB_LECTURA\n" +
    "    WITH \n" +
    "    OWNER = postgres\n" +
    "    ENCODING = 'UTF8'\n" +
    "    LC_COLLATE = 'Spanish_Venezuela.1252'\n" +
    "    LC_CTYPE = 'Spanish_Venezuela.1252'\n" +
    "    TABLESPACE = pg_default\n" +
    "    CONNECTION LIMIT = -1;");
            res = ps.executeQuery();

            } catch (Exception e) {
                System.out.println(e);
            }
        }
        
}

