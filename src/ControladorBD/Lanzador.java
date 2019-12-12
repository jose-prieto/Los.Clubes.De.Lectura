/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorBD;

/**
 *
 * @author dani_
 */
public class Lanzador {
    public static void main(String[] args){
        Scripts iniciar = new Scripts();
        int init = iniciar.iniciarBD(); 
        init = iniciar.llenarBD();
    }
}
