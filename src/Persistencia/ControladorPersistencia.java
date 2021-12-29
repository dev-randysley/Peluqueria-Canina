/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Logica.Mascota;

/**
 *
 * @author devra
 */
public class ControladorPersistencia {
    
    MascotaJpaController mascotaJpa = new MascotaJpaController();
    
    // metodos para la gestion en alto nivel de las acciones CRUD
    
    public void crearMascota(Mascota mascota){
        mascotaJpa.create(mascota);
    }
}
