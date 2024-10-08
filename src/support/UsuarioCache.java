/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package support;

import java.util.Date;

/**
 *
 * @author ever_vc
 */
public class UsuarioCache {
    //Almacena y mantiene en la chache la información del usuario que haya iniciado sesión (durante toda la ejecución del ptograma)
    public static int Id;
    public static String Nombres;    
    public static String Apellidos;
    public static String Sexo;
    public static Date FechaNacimiento;
    public static String Direccion;
    public static String Email;
    public static String Username;
    public static String RolUsuario;
    
    public static String GetNombreApellidoUsuario() {
        String nombre = "", apellido = "";

        // Verifica si existe un ' ' (espacio en blanco) dentro del nombre
        if (UsuarioCache.Nombres.contains(" ")) {
            // Almacena el índice en donde se encuentra el primer espacio en blanco (Ya que solo quiero el primer nombre)
            int indice1 = UsuarioCache.Nombres.indexOf(" ");
            nombre = UsuarioCache.Nombres.substring(0, indice1); // Remueve el resto de la cadena
        } else {
            nombre = UsuarioCache.Nombres; // En caso que no exista un espacio (tiene nombre único), deja tal cual el nombre
        }

        // Verifica si existe un ' ' (espacio en blanco) dentro del apellido
        if (UsuarioCache.Apellidos.contains(" ")) {
            // Almacena el índice en donde se encuentra el primer espacio en blanco (Ya que solo quiero el primer apellido)
            int indice2 = UsuarioCache.Apellidos.indexOf(" ");
            apellido = UsuarioCache.Apellidos.substring(0, indice2); // Remueve el resto de la cadena

            // Si el "apellido" es "de", significa que es una preposición (por ejemplo: De Hernándes)
            if (apellido.toLowerCase().equals("de")) {
                apellido = UsuarioCache.Apellidos; // Deja todo el apellido
            }
        } else {
            apellido = UsuarioCache.Apellidos; // En caso que no exista un espacio (tiene apellido único), deja tal cual el apellido
        }

        // Concatena el nombre recortado hasta el "indice1", así mismo el apellido recortado hasta el "indice2"
        return nombre + " " + apellido;
    }
    
}
