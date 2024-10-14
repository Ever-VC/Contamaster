/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import connection.Conexion;
import javax.persistence.EntityManager;
import models.Asiento;

/**
 *
 * @author ever_vc
 */
public class AsientoControlador {
    private static AsientoControlador _instancia;
    private EntityManager _entityManager;
    
    public static AsientoControlador Instancia() {
        if (_instancia == null) {
            _instancia = new AsientoControlador();
        }
        return _instancia;
    }
    
    private EntityManager setEntityManager() {
        return Conexion.Instancia().getFabrica().createEntityManager();
    }
    
    public void CrearAsiento(Asiento nuevoAsiento) {
        _entityManager = setEntityManager();
        _entityManager.getTransaction().begin();
        _entityManager.persist(nuevoAsiento);
        _entityManager.getTransaction().commit();
        _entityManager.close();
    }
    
}
