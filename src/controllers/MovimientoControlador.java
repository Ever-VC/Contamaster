/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import connection.Conexion;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import models.Cuenta;
import models.Empresa;
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
    
    public List<Movimiento> GetMovimientosPorEmpresaYFechaInicioYFin(Date fechaInicio, Date fechaFin, Empresa empresa) {
        _entityManager = setEntityManager();
        String jpql = "SELECT m FROM Movimiento m WHERE m.fecha >= :fechaInicio AND m.fecha <= :fechaFin AND m.idCuentaFk.idEmpresaFk = :empresa";
        
        List<Movimiento> movimientos = new ArrayList<>();
        try {
            _entityManager.getTransaction().begin();

            movimientos = _entityManager.createQuery(jpql, Movimiento.class)
                        .setParameter("fechaInicio", fechaInicio)
                        .setParameter("fechaFin", fechaFin)
                        .setParameter("empresa", empresa)
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

        return movimientos;
    }
    
    public List<Movimiento> GetMovimientosPorCuentaYFechaInicioYFin(Date fechaInicio, Date fechaFin, Cuenta cuenta) {
        _entityManager = setEntityManager();
        String jpql = "SELECT m FROM Movimiento m WHERE m.fecha >= :fechaInicio AND m.fecha <= :fechaFin AND m.idCuentaFk = :cuenta";
        
        List<Movimiento> movimientos = new ArrayList<>();
        try {
            _entityManager.getTransaction().begin();

            movimientos = _entityManager.createQuery(jpql, Movimiento.class)
                        .setParameter("fechaInicio", fechaInicio)
                        .setParameter("fechaFin", fechaFin)
                        .setParameter("cuenta", cuenta)
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

        return movimientos;
    }
}
