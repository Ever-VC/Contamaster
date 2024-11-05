/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import controllers.RolControlador;
import controllers.SessionLogControlador;
import controllers.UsuarioControlador;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Rol;
import models.SessionLog;
import models.Usuario;
import support.UsuarioCache;

/**
 *
 * @author ever_vc
 */
public class GestionUsuario extends javax.swing.JPanel {

    private int _idUsuarioSeleccionado = -1;
    private Validaciones validar = new Validaciones();

    /**
     * Creates new form GestionUsuarios
     */
    public GestionUsuario() {
        initComponents();
        CargarUsuarios();
        CargarRoles();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblUsuarios = new javax.swing.JTable();
        jtxtNombres = new javax.swing.JTextField();
        jtxtApellidos = new javax.swing.JTextField();
        jcmbSexo = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jlblFechaNacimiento = new javax.swing.JLabel();
        jtxtDireccion = new javax.swing.JTextField();
        jtxtEmail = new javax.swing.JTextField();
        jtxtUsername = new javax.swing.JTextField();
        jtxtPassword = new javax.swing.JTextField();
        jcmbRol = new javax.swing.JComboBox();
        jbtnGuardar = new javax.swing.JButton();
        jbtnEliminar = new javax.swing.JButton();
        jbtnLimpiar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1051, 835));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jlblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jlblTitulo.setForeground(new java.awt.Color(0, 0, 0));
        jlblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblTitulo.setText("GESTION DE USUARIOS");

        jtblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "EMAIL", "SEXO", "CARGO", "ULTIMA  CONEXION"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtblUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtblUsuarios);
        if (jtblUsuarios.getColumnModel().getColumnCount() > 0) {
            jtblUsuarios.getColumnModel().getColumn(0).setResizable(false);
            jtblUsuarios.getColumnModel().getColumn(0).setPreferredWidth(10);
            jtblUsuarios.getColumnModel().getColumn(1).setResizable(false);
            jtblUsuarios.getColumnModel().getColumn(1).setPreferredWidth(200);
            jtblUsuarios.getColumnModel().getColumn(2).setResizable(false);
            jtblUsuarios.getColumnModel().getColumn(2).setPreferredWidth(200);
            jtblUsuarios.getColumnModel().getColumn(3).setResizable(false);
            jtblUsuarios.getColumnModel().getColumn(3).setPreferredWidth(100);
            jtblUsuarios.getColumnModel().getColumn(4).setResizable(false);
            jtblUsuarios.getColumnModel().getColumn(4).setPreferredWidth(100);
            jtblUsuarios.getColumnModel().getColumn(5).setResizable(false);
            jtblUsuarios.getColumnModel().getColumn(5).setPreferredWidth(150);
        }

        jtxtNombres.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombres:"));
        jtxtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtNombresKeyTyped(evt);
            }
        });

        jtxtApellidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Apellidos:"));
        jtxtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtApellidosKeyTyped(evt);
            }
        });

        jcmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- SELECCIONAR SEXO --", "Masculino", "Femenino" }));
        jcmbSexo.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleccione el sexo:"));

        jlblFechaNacimiento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlblFechaNacimiento.setForeground(new java.awt.Color(0, 0, 0));
        jlblFechaNacimiento.setText("Fecha de nacimiento:");

        jtxtDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Dirección de residencia:"));

        jtxtEmail.setBorder(javax.swing.BorderFactory.createTitledBorder("Email:"));
        jtxtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtEmailKeyTyped(evt);
            }
        });

        jtxtUsername.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuario:"));
        jtxtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtUsernameKeyTyped(evt);
            }
        });

        jtxtPassword.setBorder(javax.swing.BorderFactory.createTitledBorder("Contraseña:"));
        jtxtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtPasswordKeyTyped(evt);
            }
        });

        jcmbRol.setBorder(javax.swing.BorderFactory.createTitledBorder("Rol del usuario:"));

        jbtnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnGuardar.setText("GUARDAR");
        jbtnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarActionPerformed(evt);
            }
        });

        jbtnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnEliminar.setText("ELIMINAR");
        jbtnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarActionPerformed(evt);
            }
        });

        jbtnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnLimpiar.setText("LIMPIAR CAMPOS");
        jbtnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimpiarActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("*");

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("*");

        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("*");

        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("*");

        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("*");

        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jbtnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtxtNombres)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlblFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jtxtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jtxtPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jbtnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jtxtEmail)
                                        .addComponent(jcmbRol, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jcmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jlblTitulo)
                                .addGap(205, 205, 205))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(123, 123, 123)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 991, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jlblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel3)))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlblFechaNacimiento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jcmbRol, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                                    .addComponent(jtxtPassword))
                                .addGap(40, 40, 40))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarActionPerformed
        // TODO add your handling code here:
        String nombres = jtxtNombres.getText();
        String apellidos = jtxtApellidos.getText();
        String sexo = (String) jcmbSexo.getSelectedItem();
        Date fechaNacimiento = jDateChooser1.getDate();
        String direccion = jtxtDireccion.getText();
        String email = jtxtEmail.getText();
        String username = jtxtUsername.getText();
        String password = jtxtPassword.getText();
        // Valida que todos los campos obligatorios tengan datos
        if (!ValidarCamposObligatorios(nombres, apellidos, sexo, username, jcmbRol.getSelectedItem().toString())) {
            return;
        }
        
        Rol rolUsuario = (Rol) jcmbRol.getSelectedItem(); // Dado que ya se ha validado que el rol sea el adecuado, lo almacena
        
        // Valida que sea mayor de 18 años
        if (fechaNacimiento != null) {
            if (!validar.ValidarSiEsMayorDeEdad(fechaNacimiento)) {
                JOptionPane.showMessageDialog(null, "LA FECHA DE NACIMIENTO QUE ESTA INGRESANDO NO ES VALIDA, EL SISTEMA NO PERMITE REGISTRO DE USUARIOS MENOSRES DE 18 AÑOS.","ERROR:", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        
        // Validación de email con expresión regular
        if (!"".equals(email)) { // Valida si el campo no está vacío (significa que sí se desea agregar un email)
            if (!validar.ValidarEmail(email)) { // Valida que el email contenga el formato
                JOptionPane.showMessageDialog(null, "EL [EMAIL] QUE HA INGRESADO NO ES VALIDO, ASEGURESE DE HABERLO ESCRITO CORRECTAMENTE.","ERROR:", JOptionPane.ERROR_MESSAGE);
                return; // Sino coincide, entonces retorna
            }
        }
        
        if (_idUsuarioSeleccionado != -1) { // ACTUALIZAR UN USUARIO SELECCIONADO DESDE LA TABLA
            Usuario usuarioActualizado = UsuarioControlador.Instancia().GetUsuarioPorId(_idUsuarioSeleccionado);// Crea e instancia el nuevo objeto
           // Insertando la información del nuevo usuario
           usuarioActualizado.setNombres(nombres);
           usuarioActualizado.setApellidos(apellidos);
           usuarioActualizado.setSexo(sexo);
           usuarioActualizado.setFechaNacimiento(fechaNacimiento);
           usuarioActualizado.setDireccion(direccion);
           usuarioActualizado.setEmail(email);
           usuarioActualizado.setUsername(username);
           usuarioActualizado.setPassword(password);
           usuarioActualizado.setIdRolFk(rolUsuario);
           
           UsuarioControlador.Instancia().ActualizarUsuario(usuarioActualizado);// Manda a crear el usuario actualizado al controlador
           JOptionPane.showMessageDialog(null, "EL USUARIO HA SIDO ACTUALIZADO EN LA BASE DE DATOS EXITOSAMENTE.","TAREA REALIZADA CON EXITO:", JOptionPane.INFORMATION_MESSAGE);
            
        } else { // GUARDAR NUEVO USUARIO
            
            if ("".equals(password)) { // Si es un usuario nuevo, entonces sí o sí debe ingresar una contraseña
                JOptionPane.showMessageDialog(null, "PARECE QUE HA OLVIDADO LLENAR EL CAMPO DE [CONTRASEÑA], POR FAVOR ASEGURESE DE LLENAR CORRECTAMENTE TODOS LOS CAMPOS QUE CONTIENEN UN [*].","ERROR:", JOptionPane.ERROR_MESSAGE);
                return;
            }
           Usuario nuevoUsuario = new Usuario();// Crea e instancia el nuevo objeto
           // Insertando la información del nuevo usuario
           nuevoUsuario.setNombres(nombres);
           nuevoUsuario.setApellidos(apellidos);
           nuevoUsuario.setSexo(sexo);
           nuevoUsuario.setFechaNacimiento(fechaNacimiento);
           nuevoUsuario.setDireccion(direccion);
           nuevoUsuario.setEmail(email);
           nuevoUsuario.setUsername(username);
           nuevoUsuario.setPassword(password);
           nuevoUsuario.setIdRolFk(rolUsuario);

           UsuarioControlador.Instancia().CrearUsuario(nuevoUsuario);// Manda a crear el nuevo usuario al controlador
           // Si todo ha salido bien, muestra el mensaje de exito
           JOptionPane.showMessageDialog(null, "EL USUARIO HA SIDO REGISTRADO EN LA BASE DE DATOS EXITOSAMENTE.","TAREA REALIZADA CON EXITO:", JOptionPane.INFORMATION_MESSAGE);
        }
        CargarUsuarios();// Recarga la tabla para actualizarla
        LimpiarTodo();// Limpia todos los campos

    }//GEN-LAST:event_jbtnGuardarActionPerformed

    private void jbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarActionPerformed
        // TODO add your handling code here:
        if (_idUsuarioSeleccionado != -1) {
            Usuario usuarioAEliminar = UsuarioControlador.Instancia().GetUsuarioPorId(_idUsuarioSeleccionado);
            int response = JOptionPane.showConfirmDialog(
                GestionUsuario.this,
                "¿Estás seguro de que deseas eliminar el usuario " + usuarioAEliminar.getNombres() + " " + usuarioAEliminar.getApellidos() + " de la base de datos? Este proceso no se puede revertir.",
                "ATENCIÓN:",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE
            );

            if (response == JOptionPane.YES_OPTION) {
                UsuarioControlador.Instancia().EliminarUsuario(_idUsuarioSeleccionado);
                JOptionPane.showMessageDialog(null, "EL USUARIO HA SIDO ELIMINADO DE LA BASE DE DATOS EXITOSAMENTE.","TAREA REALIZADA CON EXITO:", JOptionPane.INFORMATION_MESSAGE);
                CargarUsuarios();// Recarga la tabla para actualizarla
                LimpiarTodo();// Limpia todos los campos
            }
        } else {
            JOptionPane.showMessageDialog(null, "POR FAVOR SELECCIONE DESDE LA TABLA AL USUARIO QUE DESEA ELIMINAR.","ERROR:", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jbtnEliminarActionPerformed

    private void jbtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimpiarActionPerformed
        // TODO add your handling code here:
        LimpiarTodo();
    }//GEN-LAST:event_jbtnLimpiarActionPerformed

    private void jtblUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblUsuariosMouseClicked
        // TODO add your handling code here:
        _idUsuarioSeleccionado = Integer.parseInt(jtblUsuarios.getValueAt(jtblUsuarios.getSelectedRow(), 0).toString());
        CargarDatosDeUsuarioSeleccionado();
    }//GEN-LAST:event_jtblUsuariosMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        _idUsuarioSeleccionado = -1;
        jtblUsuarios.clearSelection();
    }//GEN-LAST:event_formMouseClicked

    private void jtxtNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtNombresKeyTyped
        // TODO add your handling code here:
        validar.ValidarLetrasYEspacios(evt);
    }//GEN-LAST:event_jtxtNombresKeyTyped

    private void jtxtApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtApellidosKeyTyped
        // TODO add your handling code here:
        validar.ValidarLetrasYEspacios(evt);
    }//GEN-LAST:event_jtxtApellidosKeyTyped

    private void jtxtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtEmailKeyTyped
        // TODO add your handling code here:
        validar.ValidarTodoMenosEspacios(evt);
    }//GEN-LAST:event_jtxtEmailKeyTyped

    private void jtxtUsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtUsernameKeyTyped
        // TODO add your handling code here:
        validar.ValidarTodoMenosEspacios(evt);
    }//GEN-LAST:event_jtxtUsernameKeyTyped

    private void jtxtPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtPasswordKeyTyped
        // TODO add your handling code here:
        validar.ValidarTodoMenosEspacios(evt);
    }//GEN-LAST:event_jtxtPasswordKeyTyped
    
    private boolean ValidarCamposObligatorios(String nombres, String apellidos, String sexo, String username, String rol) {
        if ("".equals(nombres)) {
            JOptionPane.showMessageDialog(null, "PARECE QUE HA OLVIDADO LLENAR EL CAMPO DE [NOMBRES], POR FAVOR ASEGURESE DE LLENAR CORRECTAMENTE TODOS LOS CAMPOS QUE CONTIENEN UN [*].","ERROR:", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if ("".equals(apellidos)) {
            JOptionPane.showMessageDialog(null, "PARECE QUE HA OLVIDADO LLENAR EL CAMPO DE [APELLIDOS], POR FAVOR ASEGURESE DE LLENAR CORRECTAMENTE TODOS LOS CAMPOS QUE CONTIENEN UN [*].","ERROR:", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if ("".equals(sexo) || "-- SELECCIONAR SEXO --".equals(sexo)) {
            JOptionPane.showMessageDialog(null, "PARECE QUE HA OLVIDADO SELECCIONAR EL CAMPO DE [SEXO], POR FAVOR ASEGURESE DE LLENAR CORRECTAMENTE TODOS LOS CAMPOS QUE CONTIENEN UN [*].","ERROR:", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if ("".equals(username)) {
            JOptionPane.showMessageDialog(null, "PARECE QUE HA OLVIDADO LLENAR EL CAMPO DE [USUARIO], POR FAVOR ASEGURESE DE LLENAR CORRECTAMENTE TODOS LOS CAMPOS QUE CONTIENEN UN [*].","ERROR:", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if ("".equals(rol) || "-- SELECCIONAR ROL --".equals(rol)) {
            JOptionPane.showMessageDialog(null, "PARECE QUE HA OLVIDADO SELECCIONAR EL CAMPO DE [ROL DEL USUARIO], POR FAVOR ASEGURESE DE LLENAR CORRECTAMENTE TODOS LOS CAMPOS QUE CONTIENEN UN [*].","ERROR:", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true; // Retorna verdadero únicamente cuando todos los campos tienen datos
    }
    
    private void CargarUsuarios() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo = (DefaultTableModel)jtblUsuarios.getModel();
        modelo.setRowCount(0);//Limpia todas los registros de la tabla (indicando que no quiere ninguna fila)
        List<Usuario> lstUsuarios = UsuarioControlador.Instancia().GetListaUsuarios();
         
        for (Usuario usuario : lstUsuarios) {
            SessionLog sesionUsuario = SessionLogControlador.instancia().ObtenerSesionPorUsuario(usuario.getId());
            String infoDesesion = "Sin inicar sesión";
            if (sesionUsuario != null) {
                infoDesesion = GetSessionStatus(sesionUsuario.getLogoutTimestamp(), sesionUsuario.getLoginTimestamp());
                if (sesionUsuario.getIdUsuarioFk().getId() == UsuarioCache.Id) {
                    infoDesesion += " (Tú)";
                }
            }
            modelo.addRow(new Object[]{usuario.getId(), usuario.getNombres() + " " + usuario.getApellidos(), usuario.getEmail(), usuario.getSexo(), usuario.getIdRolFk().getNombre(), infoDesesion});
        }
    }
    
    private void CargarDatosDeUsuarioSeleccionado() {
        if (_idUsuarioSeleccionado != -1) {
            Usuario usuarioSeleccionado = UsuarioControlador.Instancia().GetUsuarioPorId(_idUsuarioSeleccionado);
            jtxtNombres.setText(usuarioSeleccionado.getNombres());
            jtxtApellidos.setText(usuarioSeleccionado.getApellidos());
            jcmbSexo.setSelectedItem(usuarioSeleccionado.getSexo().toString());
            jDateChooser1.setDate(usuarioSeleccionado.getFechaNacimiento());
            jtxtDireccion.setText(usuarioSeleccionado.getDireccion());
            jtxtEmail.setText(usuarioSeleccionado.getEmail());
            jtxtUsername.setText(usuarioSeleccionado.getUsername());
            jcmbRol.setSelectedItem(usuarioSeleccionado.getIdRolFk());
        }
    }
    
    private void CargarRoles() {
        List<Rol> lstRoles = RolControlador.Instancia().GetListaRoles();
        jcmbRol.addItem("-- SELECCIONAR ROL --");
        for (Rol rol : lstRoles) {
            jcmbRol.addItem(rol);
        }
    }
    
    private String GetSessionStatus(Date logoutTimestamp, Date loginTimestamp) {
        Date now = new Date();

        if (logoutTimestamp == null || logoutTimestamp.before(loginTimestamp)) {
            return "Activo ahora mismo";
        }

        long difInMillis = now.getTime() - logoutTimestamp.getTime();// Calcula la diferencia de hora de cierre de sesión con respecto a la actual (en milisegundos)
        long difInMinutos = TimeUnit.MILLISECONDS.toMinutes(difInMillis);// Calcula ese tiempo en minutos
        long difInHours = TimeUnit.MILLISECONDS.toHours(difInMillis);// Calcula ese tiempo en horas

        if (difInHours > 0) {// Si ha pasado al menos una hora
            return "Activo hace " + difInHours + " hrs";// Muestra hace cuántas horas fue
        } else if (difInMinutos > 0) {// Si sólo han pasado minutos
            return "Activo hace " + difInMinutos + " min";// Muestra hace cuántos minutos fue
        } else {// Sino se cumplen las anteriores, significa que han pasado únicmanete segundos
            return "Activo hace unos segundos";
        }
    }
    
    private void LimpiarTodo() {
        jtxtNombres.setText("");
        jtxtApellidos.setText("");
        jcmbSexo.setSelectedIndex(0);
        jDateChooser1.setDate(null);
        jtxtDireccion.setText("");
        jtxtEmail.setText("");
        jtxtUsername.setText("");
        jtxtPassword.setText("");
        jcmbRol.setSelectedIndex(0);
        _idUsuarioSeleccionado = -1;
        jtblUsuarios.clearSelection();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtnEliminar;
    private javax.swing.JButton jbtnGuardar;
    private javax.swing.JButton jbtnLimpiar;
    private javax.swing.JComboBox jcmbRol;
    private javax.swing.JComboBox<String> jcmbSexo;
    private javax.swing.JLabel jlblFechaNacimiento;
    private javax.swing.JLabel jlblTitulo;
    private javax.swing.JTable jtblUsuarios;
    private javax.swing.JTextField jtxtApellidos;
    private javax.swing.JTextField jtxtDireccion;
    private javax.swing.JTextField jtxtEmail;
    private javax.swing.JTextField jtxtNombres;
    private javax.swing.JTextField jtxtPassword;
    private javax.swing.JTextField jtxtUsername;
    // End of variables declaration//GEN-END:variables
}
