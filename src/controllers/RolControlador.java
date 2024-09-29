/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import connection.Conexion;
import javax.persistence.EntityManager;
import models.Rol;

/**
 *
 * @author ever_vc
 */
public class RolControlador {
    private static RolControlador _instancia;
    private EntityManager _entityManager;
    
    /***
     * Permite acceder de forma estática a los métodos de la clase.
     * @return _instancia
    */
    public static RolControlador Instancia() {
        if (_instancia == null) {
            _instancia = new RolControlador();
        }
        
        return _instancia;
    }
    
    private EntityManager setEntityManager() {
        return Conexion.Instancia().getFabrica().createEntityManager();
    }
    
    public Rol getRolPorId(Integer id) {
        _entityManager = setEntityManager();
        _entityManager.getTransaction().begin();
        Rol rolBuscado = _entityManager.find(Rol.class, id);
        _entityManager.close();
        return rolBuscado;
    }
    
}
