/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import connection.Conexion;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import models.SessionLog;

/**
 *
 * @author ever_vc
 */
public class SessionLogControlador {
    private static SessionLogControlador _instancia;
    private EntityManager _entityManager;
    
    public static SessionLogControlador instancia() {
        if (_instancia == null) {
            _instancia = new SessionLogControlador();
        }
        return _instancia;
    }
    
    private EntityManager setEntityManager() {
        return Conexion.Instancia().getFabrica().createEntityManager();
    }
    
    public List<Integer> obtenerUsuariosConSesion() {
        // Consulta para obtener los IDs de usuarios que han iniciado sesión
        String jpql = "SELECT DISTINCT s.id_usuario_fk FROM session_log s";
        
        // Crear la consulta
        return _entityManager.createQuery(jpql, Integer.class).getResultList();// Ejecutar la consulta y retorna el resultado
    }
    
    public SessionLog ObtenerSesionPorUsuario(int idUsuario) {
        _entityManager = setEntityManager();

        // Crear la consulta JPQL para obtener la sesión de un usuario específico
        String jpql = "SELECT s FROM SessionLog s WHERE s.idUsuarioFk.id = :idUsuario";

        try {
            // Ejecutar la consulta
            SessionLog sesion = _entityManager.createQuery(jpql, SessionLog.class)
                    .setParameter("idUsuario", idUsuario)
                    .getSingleResult();

            // Retornar la sesión encontrada
            return sesion;

        } catch (NoResultException e) {
            // Si no se encontró ninguna sesión para ese usuario
            return null;
        } finally {
            _entityManager.close();
        }
    }

    
    public void CreararInicioDeSesion(SessionLog nuevoInicioSesion) {
        _entityManager = setEntityManager();
        _entityManager.getTransaction().begin();
        _entityManager.persist(nuevoInicioSesion);
        _entityManager.getTransaction().commit();
        _entityManager.close();
    }
    
    public void GuardarInicioDeSesion(SessionLog inicioSesion) {
        _entityManager = setEntityManager();
        _entityManager.getTransaction().begin();
        SessionLog sesionAbierta = _entityManager.find(SessionLog.class, inicioSesion.getId());
        sesionAbierta.setLoginTimestamp(inicioSesion.getLoginTimestamp());
        _entityManager.getTransaction().commit();
        _entityManager.close();
    }
    
    public void GuardarCierreDeSesion(SessionLog cierreSesion) {
        _entityManager = setEntityManager();
        _entityManager.getTransaction().begin();
        SessionLog sesionAbierta = _entityManager.find(SessionLog.class, cierreSesion.getId());
        sesionAbierta.setLogoutTimestamp(cierreSesion.getLogoutTimestamp());
        _entityManager.getTransaction().commit();
        _entityManager.close();
    }
    
}
