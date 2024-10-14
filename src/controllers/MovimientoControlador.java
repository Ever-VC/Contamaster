/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import connection.Conexion;
import javax.persistence.EntityManager;
import models.Movimiento;

/**
 *
 * @author ever_vc
 */
public class MovimientoControlador {
    private static MovimientoControlador _instancia;
    private EntityManager _entityManager;
    
    public static MovimientoControlador Instancia() {
        if (_instancia == null) {
            _instancia = new MovimientoControlador();
        }
        return _instancia;
    }
    
    private EntityManager setEntityManager() {
        return Conexion.Instancia().getFabrica().createEntityManager();
    }
    
    public void CrearMovimiento(Movimiento nuevoMovimiento) {
        _entityManager = setEntityManager();
        _entityManager.getTransaction().begin();
        _entityManager.persist(nuevoMovimiento);
        _entityManager.getTransaction().commit();
        _entityManager.close();
    }
    
}
