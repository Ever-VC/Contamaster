/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

import java.awt.Color;
import java.util.Calendar;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author ever_vc
 */
public class Validaciones {
    
    public boolean ValidarSiEsMayorDeEdad(Date fechaNacimiento) {
        // Verifica si la fecha de nacimiento es nula
        if (fechaNacimiento == null) {
            return false;
        }
        
        // Obtiene la fecha actual
        Calendar today = Calendar.getInstance();
        
        // Establece el calendario con la fecha de nacimiento
        Calendar birthCalendar = Calendar.getInstance();
        birthCalendar.setTime(fechaNacimiento);
        
        // Calcula la diferencia de años
        int age = today.get(Calendar.YEAR) - birthCalendar.get(Calendar.YEAR);
        
        // Ajusta el cálculo si aún no ha pasado el cumpleaños este año
        if (today.get(Calendar.DAY_OF_YEAR) < birthCalendar.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }
        
        // Retorna true si la edad es al menos 18, false en caso contrario
        return age >= 18;
    }
    
    public boolean ValidarEmail(String email) {
        // Expresión regular para validar un correo electrónico
        //String expresion = "^[_a-z0-9]+(.[_a-z0-9-])@[a-z0-9]+(.[a-z0-9-]+)\\.(.[a-z]{2,4})$";//juanjo27.hernandez@gmail.com.sv 
        String expresion = "^[\\w-\\.]+@[\\w-]+\\.[a-zA-Z]{2,7}$";//juanjo27.hernandez@gmail.com.sv 
        
        // Verifica si la cadena de entrada es nula
        if (email == null) {
            return false;
        }
        
        // Retorna true si la cadena coincide con el patrón de la expresión regular
        return email.matches(expresion);
    }
    
    public void ValidarLetrasYEspacios(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        // Si no es letra, se consume el evento para que no se muestre
        if (!Character.isLetter(c) && !Character.isWhitespace(c)) {
            evt.consume();
        }
    }
    
    public void ValidarTodoMenosEspacios(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        // Si es un espacio, se consume el evento para que no se muestre
        if (Character.isWhitespace(c)) {
            evt.consume();
        }
    }
    
    public void ValidarNumerosEnteros(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        // Si el carácter no es un dígito, consume el evento
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }
    
    public void ValidarNumerosDecimales(java.awt.event.KeyEvent evt, javax.swing.JTextField decimalField) {
        char c = evt.getKeyChar();
                
        // Permitir solo dígitos y un único punto decimal
        if (!Character.isDigit(c) && c != '.') {
            evt.consume();  // Si no es dígito ni punto, cancelar el evento
        } else if (c == '.' && decimalField.getText().contains(".")) {
            evt.consume();  // Si ya hay un punto, cancelar el evento
        }
    }
    
    public boolean ValidarFechas(Date fechaInicio, Date fechaFin) {
        if (fechaInicio == null) {
            JOptionPane.showMessageDialog(null, "PARECE QUE HA OLVIDADO SELECCIONAR EL SIGUIENTE CAMPO: \n~ FECHA DE INCIO\nPOR FAVOR ASEGURESE DE LLENAR CORRECTAMENTE TODOS LOS CAMPOS QUE CONTIENEN UN [*].","ERROR:", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (fechaInicio.after(new Date())) {
            JOptionPane.showMessageDialog(null, "EN FECHA DE INICIO, HA SELECCIONADO UNA FECHA MAYOR A LA ACTUAL, POR FAVOR ASEGURESE DE INGRESAR LA FECHA CORRECTAMENTE.","ERROR:", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (fechaFin == null) {
            JOptionPane.showMessageDialog(null, "PARECE QUE HA OLVIDADO SELECCIONAR EL CAMPO: \n~ FECHA DE FIN\nPOR FAVOR ASEGURESE DE LLENAR CORRECTAMENTE TODOS LOS CAMPOS QUE CONTIENEN UN [*].","ERROR:", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (fechaFin.after(new Date())) {
            JOptionPane.showMessageDialog(null, "EN FECHA DE FIN, HA SELECCIONADO UNA FECHA MAYOR A LA ACTUAL, POR FAVOR ASEGURESE DE INGRESAR LA FECHA CORRECTAMENTE.","ERROR:", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (fechaInicio.after(fechaFin)) {
            JOptionPane.showMessageDialog(null, "LA FECHA DE INICIO NO PUEDE SER DESPUÉS DE LA FECHA DE FIN, POR FAVOR ASEGURESE DE INGRESAR LA FECHA CORRECTAMENTE.","ERROR:", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    public void JtxtFocoCambiarColor(javax.swing.JTextField jtxt, boolean esFoco) {
        if (esFoco) {
            jtxt.setBorder(BorderFactory.createLineBorder(new Color(0, 153, 255), 1, true));
        } else {
            jtxt.setBorder(BorderFactory.createLineBorder(new Color(204,204,204), 1, true));
        }        
    }
    
    public void JtxtErrorColor(javax.swing.JTextField jtxt) {
        jtxt.setBorder(BorderFactory.createLineBorder(Color.red, 1, true));
    }
    
    public void JtxtColorInicial(javax.swing.JTextField jtxt) {
        jtxt.setBorder(BorderFactory.createLineBorder(new Color(204,204,204), 1, true));
    }
    
    public void JtxtEfectoPlaceHolder(javax.swing.JTextField jtxt, String texto, boolean esFoco) {
        if (esFoco) {
            if (jtxt.getText().equals(texto)) {
                jtxt.setText("");
                jtxt.setForeground(new java.awt.Color(0,51,51));
            }
        } else {
            if (jtxt.getText().isEmpty()) {
                jtxt.setText(texto);
                jtxt.setForeground(new java.awt.Color(204, 204, 204));
            }
        }
    }
    
    public void JtxtColorInicialTexto(javax.swing.JTextField[] jtxts, java.awt.Color color) {
        for (int i = 0; i < jtxts.length; i++) {
            jtxts[i].setForeground(color);
        }
    }
}
