/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import connection.Conexion;
import javax.persistence.EntityManager;
import models.DetalleAsiento;

/**
 *
 * @author ever_vc
 */
public class DetalleAsientoControlador {
    private static DetalleAsientoControlador _instancia;
    private EntityManager _entityManager;
    
    public static DetalleAsientoControlador Instancia() {
        if (_instancia == null) {
            _instancia = new DetalleAsientoControlador();
        }
        return _instancia;
    }
    
    private EntityManager setEntityManager() {
        return Conexion.Instancia().getFabrica().createEntityManager();
    }
    
    public void CrearDetalleMovimiento(DetalleAsiento nuevoDetalleAsiento) {
        _entityManager = setEntityManager();
        _entityManager.getTransaction().begin();
        _entityManager.persist(nuevoDetalleAsiento);
        _entityManager.getTransaction().commit();
        _entityManager.close();
    }
}
