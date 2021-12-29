/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Persistencia.ControladorPersistencia;

/**
 *
 * @author devra
 */
public class ControladorLogica {
    ControladorPersistencia controlPersis = new ControladorPersistencia();
    
    // metodos CRUD vinculados con el controlador de persistencia
    
    public void crearMascota(Mascota mascota){
        controlPersis.crearMascota(mascota);
    }
    
    public void crearMascota(int num_cliente, String nombre_perro, String raza, 
                            String color, boolean alergico, boolean atencion_especial, 
                            String nombre_duenio, String celular_duenio, String observaciones){
        Mascota mascota = new Mascota (num_cliente,nombre_perro,raza,color,alergico,atencion_especial,
                                        nombre_duenio, celular_duenio, observaciones);
        crearMascota(mascota);
    }
}
