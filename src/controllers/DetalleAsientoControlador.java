/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import connection.Conexion;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import models.DetalleAsiento;
import models.Movimiento;

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
    
    public List<DetalleAsiento> GetAsientosPorMovimiento(Movimiento movimiento) {
        _entityManager = setEntityManager();
        List<DetalleAsiento> detallesAsiento = new ArrayList<>();
        try {
            _entityManager.getTransaction().begin();

            detallesAsiento = _entityManager.createQuery("SELECT d FROM DetalleAsiento d WHERE d.idMovimientoFk = :movimiento", DetalleAsiento.class)
                        .setParameter("movimiento", movimiento)
                        .getResultList();// Ejecuta la consulta y obtiene el resultado

            _entityManager.getTransaction().commit();
        } catch (Exception ex) {
            if (_entityManager.getTransaction().isActive()) {
                _entityManager.getTransaction().rollback();// Hace rollback en caso de error
            }
            ex.printStackTrace();// Imprime el error para depuración
        } finally {
            if (_entityManager != null) {
                _entityManager.close();// Cierra el EntityManager
            }
        }

        return detallesAsiento;
    }
}
