/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Igu.Principal;

/**
 *
 * @author Randy Mendoza
 * 
 * Aplicacion de gestion de mascotas para peluqueria canina
 */
public class PeluqueriaCanina {

    public static void main(String[] args) {
        
        ControladorLogica controlador = new ControladorLogica();
        Principal princ = new Principal(controlador);
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);
        
    }
    
}
