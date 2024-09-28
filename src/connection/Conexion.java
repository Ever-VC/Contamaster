/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author ever_vc
 */
public class Conexion {
    private static Conexion _instancia;
    private EntityManagerFactory _fabrica;
    
    public Conexion() {
        _fabrica = Persistence.createEntityManagerFactory("ContamasterPU");
    }
    
    public static Conexion Instancia() {
        if (_instancia == null) {
            _instancia = new Conexion();
        }
        
        return _instancia;
    }
    
    public EntityManagerFactory getFabrica() {
        return _fabrica;
    }
}
