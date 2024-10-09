/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import controllers.EmpresaControlador;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Empresa;

/**
 *
 * @author ever_vc
 */
public class GestionEmpresa extends javax.swing.JPanel {
    
    private int _idEmpresaSeleccionada = -1;
    private Principal _frmPrincipal;

    /**
     * Creates new form GestionEmpresa
     */
    public GestionEmpresa() {
        initComponents();
        CargarEmpresas();// Carga las empresas en la tabla
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
        jSeparator1 = new javax.swing.JSeparator();
        jtxtNombre = new javax.swing.JTextField();
        jtxtPropietario = new javax.swing.JTextField();
        jtxtDireccion = new javax.swing.JTextField();
        jtxtEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblEmpresas = new javax.swing.JTable();
        jbtnCatalogoCuentas = new javax.swing.JButton();
        jbtnGuardar = new javax.swing.JButton();
        jbtnEliminar = new javax.swing.JButton();
        jbtnLimpiar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jlblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jlblTitulo.setForeground(new java.awt.Color(0, 0, 0));
        jlblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblTitulo.setText("GESTION DE EMPRESAS");

        jtxtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre:"));

        jtxtPropietario.setBorder(javax.swing.BorderFactory.createTitledBorder("Propietario:"));

        jtxtDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Dirección:"));

        jtxtEmail.setBorder(javax.swing.BorderFactory.createTitledBorder("Email:"));

        jtblEmpresas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "DIRECCION", "PROPIETARIO", "EMAIL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtblEmpresas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblEmpresasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtblEmpresas);
        if (jtblEmpresas.getColumnModel().getColumnCount() > 0) {
            jtblEmpresas.getColumnModel().getColumn(0).setResizable(false);
            jtblEmpresas.getColumnModel().getColumn(0).setPreferredWidth(50);
            jtblEmpresas.getColumnModel().getColumn(1).setResizable(false);
            jtblEmpresas.getColumnModel().getColumn(1).setPreferredWidth(250);
            jtblEmpresas.getColumnModel().getColumn(2).setResizable(false);
            jtblEmpresas.getColumnModel().getColumn(2).setPreferredWidth(250);
            jtblEmpresas.getColumnModel().getColumn(3).setResizable(false);
            jtblEmpresas.getColumnModel().getColumn(3).setPreferredWidth(250);
            jtblEmpresas.getColumnModel().getColumn(4).setResizable(false);
            jtblEmpresas.getColumnModel().getColumn(4).setPreferredWidth(250);
        }

        jbtnCatalogoCuentas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnCatalogoCuentas.setText("ABRIR CATALOGO DE CUENTAS");
        jbtnCatalogoCuentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnCatalogoCuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCatalogoCuentasActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbtnCatalogoCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(381, 381, 381))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtxtDireccion)
                                    .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(121, 121, 121)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtxtPropietario)
                                    .addComponent(jtxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlblTitulo)
                                .addGap(153, 153, 153)))
                        .addGap(163, 163, 163))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 978, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jlblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbtnCatalogoCuentas)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(100, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarActionPerformed
        // TODO add your handling code here:
        /**
         * Validaciones...
         */
        if (_idEmpresaSeleccionada != -1) { // Actualizar información de empresa
            Empresa empresaActualizada = EmpresaControlador.Instancia().GetEmpresaPorId(_idEmpresaSeleccionada);
            
            // Almacena la información actualizada de la empresa
            empresaActualizada.setNombre(jtxtNombre.getText());
            empresaActualizada.setDireccion(jtxtDireccion.getText());
            empresaActualizada.setEmail(jtxtEmail.getText());
            
            EmpresaControlador.Instancia().ActualizarEmpresa(empresaActualizada);
            JOptionPane.showMessageDialog(null, "LA EMPRESA HA SIDO ACTUALIZADA EN LA BASE DE DATOS EXITOSAMENTE.","TAREA REALIZADA CON EXITO:", JOptionPane.INFORMATION_MESSAGE);
        } else { // Crear nueva empresa
            Empresa nuevaEmpresa = new Empresa();
            
            // Almacena la información actualizada de la empresa
            nuevaEmpresa.setNombre(jtxtNombre.getText());
            nuevaEmpresa.setDireccion(jtxtDireccion.getText());
            nuevaEmpresa.setEmail(jtxtEmail.getText());
            
            EmpresaControlador.Instancia().CrearEmpresa(nuevaEmpresa);
            JOptionPane.showMessageDialog(null, "LA EMPRESA HA SIDO REGISTRADA EN LA BASE DE DATOS EXITOSAMENTE.","TAREA REALIZADA CON EXITO:", JOptionPane.INFORMATION_MESSAGE);
        }
        LimpiarTodo();
        CargarEmpresas();
    }//GEN-LAST:event_jbtnGuardarActionPerformed

    private void jbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarActionPerformed
        

    }//GEN-LAST:event_jbtnEliminarActionPerformed

    private void jbtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnLimpiarActionPerformed

    private void jtblEmpresasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblEmpresasMouseClicked
        // TODO add your handling code here:
        _idEmpresaSeleccionada = Integer.parseInt(jtblEmpresas.getValueAt(jtblEmpresas.getSelectedRow(), 0).toString());
        CargarDatosDeEmpresaSeleccionada();
    }//GEN-LAST:event_jtblEmpresasMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        _idEmpresaSeleccionada = -1;
        jtblEmpresas.clearSelection();
    }//GEN-LAST:event_formMouseClicked

    private void jbtnCatalogoCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCatalogoCuentasActionPerformed
        // TODO add your handling code here:
        if (_idEmpresaSeleccionada != -1) {
            _frmPrincipal.AbrirCatalogoDeEmpresas(_idEmpresaSeleccionada);
        } else {
            JOptionPane.showMessageDialog(null, "POR FAVOR SELECCIONE DESDE LA TABLA A LA EMPRESA QUE DESEA ADMINISTRARLE EL CATALOGO DE CUENTAS.","ERROR:", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbtnCatalogoCuentasActionPerformed

    public void SetFormularioPrincipal(Principal frmPrincipal) {
        this._frmPrincipal = frmPrincipal;
    }
    
    private void CargarEmpresas() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo = (DefaultTableModel)jtblEmpresas.getModel();
        modelo.setRowCount(0);//Limpia todas los registros de la tabla (indicando que no quiere ninguna fila)
        List<Empresa> lstEmpresas = EmpresaControlador.Instancia().GetListaEmpresas();
        
        for (Empresa empresa : lstEmpresas) {
            modelo.addRow(new Object[]{empresa.getId(), empresa.getNombre(), empresa.getDireccion(), "-- Sin definir --", empresa.getEmail()});
        }
    }
    
    private void CargarDatosDeEmpresaSeleccionada() {
        if (_idEmpresaSeleccionada != -1) {
            Empresa empresaSeleccionada = EmpresaControlador.Instancia().GetEmpresaPorId(_idEmpresaSeleccionada);
            jtxtNombre.setText(empresaSeleccionada.getNombre());
            jtxtPropietario.setText("-- Sin definir --");
            jtxtDireccion.setText(empresaSeleccionada.getDireccion());
            jtxtEmail.setText(empresaSeleccionada.getEmail());
        }
    }
    
    private void LimpiarTodo() {
        jtxtNombre.setText("");
        jtxtPropietario.setText("");
        jtxtDireccion.setText("");
        jtxtEmail.setText("");
        _idEmpresaSeleccionada = -1;
        jtblEmpresas.clearSelection();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtnCatalogoCuentas;
    private javax.swing.JButton jbtnEliminar;
    private javax.swing.JButton jbtnGuardar;
    private javax.swing.JButton jbtnLimpiar;
    private javax.swing.JLabel jlblTitulo;
    private javax.swing.JTable jtblEmpresas;
    private javax.swing.JTextField jtxtDireccion;
    private javax.swing.JTextField jtxtEmail;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtPropietario;
    // End of variables declaration//GEN-END:variables
}
