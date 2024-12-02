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
import models.Mayor;

/**
 *
 * @author ever_vc
 */
public class MayorControlador {
    
    private static MayorControlador _instancia;
    private EntityManager _entityManager;
    
    public static MayorControlador Instancia() {
        if (_instancia == null) {
            _instancia = new MayorControlador();
        }
        return _instancia;
    }
    
    private EntityManager setEntityManager() {
        return Conexion.Instancia().getFabrica().createEntityManager();
    }
    
    public void CrearRegistroDelMayor(Mayor nuevoMayor) {
        _entityManager = setEntityManager();
        _entityManager.getTransaction().begin();
        _entityManager.persist(nuevoMayor);
        _entityManager.getTransaction().commit();
        _entityManager.close();
    }
    
    public List<Mayor> GetListaRegistrosAlMayorPorCuenta(Cuenta cuenta) {
        _entityManager = setEntityManager();
        String jpql = "SELECT m FROM Mayor m WHERE m.idCuentaFk = :cuenta";

        List<Mayor> mayorizaciones = new ArrayList<>();
        try {
            _entityManager.getTransaction().begin();

            mayorizaciones = _entityManager.createQuery(jpql, Mayor.class)
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

        return mayorizaciones;
    }
    
    public List<Mayor> GetListaRegistrosAlMayorPorCuentaFechaInicioYFin(Date fechaInicio, Date fechaFin, Cuenta cuenta) {
        _entityManager = setEntityManager();
        String jpql = "SELECT m FROM Mayor m WHERE m.idCuentaFk = :cuenta AND m.fechaInicio >= :fechaInicio AND m.fechaFin <= :fechaFin";

        List<Mayor> mayorizaciones = new ArrayList<>();
        try {
            _entityManager.getTransaction().begin();

            mayorizaciones = _entityManager.createQuery(jpql, Mayor.class)
                        .setParameter("cuenta", cuenta)
                        .setParameter("fechaInicio", fechaInicio)
                        .setParameter("fechaFin", fechaFin)
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

        return mayorizaciones;
    }
    
    public List<Mayor> GetListaRegistrosAlMayor() {
        _entityManager = setEntityManager();
        _entityManager.getTransaction().begin();
        return _entityManager.createQuery("SELECT m FROM Mayor m").getResultList();
    }
    
}
