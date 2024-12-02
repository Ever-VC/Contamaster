/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import connection.Conexion;
import java.util.List;
import javax.persistence.EntityManager;
import models.Empresa;

/**
 *
 * @author ever_vc
 */
public class EmpresaControlador {
    private static EmpresaControlador _instancia;
    private EntityManager _entityManager;
    
    public static EmpresaControlador Instancia() {
        if (_instancia == null) {
            _instancia = new EmpresaControlador();
        }
        return _instancia;
    }
    
    private EntityManager setEntityManager() {
        return Conexion.Instancia().getFabrica().createEntityManager();
    }
    
    public void CrearEmpresa(Empresa nuevaEmpresa) {
        _entityManager = setEntityManager();
        _entityManager.getTransaction().begin();
        _entityManager.persist(nuevaEmpresa);
        _entityManager.getTransaction().commit();
        _entityManager.close();
    }
    
    public Empresa GetEmpresaPorId(Integer id) {
        _entityManager = setEntityManager();
        _entityManager.getTransaction().begin();
        Empresa empresaBuscada = _entityManager.find(Empresa.class, id);
        _entityManager.close();
        return empresaBuscada;
    }
    
    public List<Empresa> GetListaEmpresas() {
        _entityManager = setEntityManager();
        _entityManager.getTransaction().begin();
        return _entityManager.createQuery("SELECT empresas FROM Empresa empresas").getResultList();
    }
    
    public void ActualizarEmpresa(Empresa empresaActualizada) {
        _entityManager = setEntityManager();
        _entityManager.getTransaction().begin();
        Empresa empresaAEditar = _entityManager.find(Empresa.class, empresaActualizada.getId());
        empresaAEditar.setNombre(empresaActualizada.getNombre());
        empresaAEditar.setDireccion(empresaActualizada.getDireccion());
        empresaAEditar.setEmail(empresaActualizada.getEmail());
        empresaAEditar.setPropietario(empresaActualizada.getPropietario());
        _entityManager.getTransaction().commit();
        _entityManager.close();
    }
    
    public void EliminarEmpresa(Integer id) {
        _entityManager = setEntityManager();
        _entityManager.getTransaction().begin();
        Empresa empresaEliminar = _entityManager.find(Empresa.class, id);
        _entityManager.remove(_entityManager.merge(empresaEliminar));
        _entityManager.getTransaction().commit();
        _entityManager.close();
    }
}
