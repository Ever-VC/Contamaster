/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import controllers.CuentaControlador;
import controllers.EmpresaControlador;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Cuenta;

/**
 *
 * @author ever_vc
 */
public class CatalogoCuentas extends javax.swing.JPanel {
    
    private int _idEmpresa = -1;
    private int _idCuenta = -1;

    /**
     * Creates new form CatalogoCuentas
     */
    public CatalogoCuentas(int idEmpresa) {
        this._idEmpresa = idEmpresa;
        initComponents();
        CargarCuentas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtblCuentas = new javax.swing.JTable();
        jlblTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jtxtNombre = new javax.swing.JTextField();
        jtxtCodigo = new javax.swing.JTextField();
        jtxtSaldo = new javax.swing.JTextField();
        jcmbTipoCuenta = new javax.swing.JComboBox<>();
        jbtnGuardar = new javax.swing.JButton();
        jbtnEliminar = new javax.swing.JButton();
        jbtnLimpiar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1051, 835));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jtblCuentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "CODIGO", "NOMBRE", "TIPO", "SALDO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtblCuentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblCuentasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtblCuentas);
        if (jtblCuentas.getColumnModel().getColumnCount() > 0) {
            jtblCuentas.getColumnModel().getColumn(0).setResizable(false);
            jtblCuentas.getColumnModel().getColumn(0).setPreferredWidth(30);
            jtblCuentas.getColumnModel().getColumn(1).setResizable(false);
            jtblCuentas.getColumnModel().getColumn(1).setPreferredWidth(50);
            jtblCuentas.getColumnModel().getColumn(2).setResizable(false);
            jtblCuentas.getColumnModel().getColumn(2).setPreferredWidth(200);
            jtblCuentas.getColumnModel().getColumn(3).setResizable(false);
            jtblCuentas.getColumnModel().getColumn(3).setPreferredWidth(100);
            jtblCuentas.getColumnModel().getColumn(4).setResizable(false);
            jtblCuentas.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        jlblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jlblTitulo.setForeground(new java.awt.Color(0, 0, 0));
        jlblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblTitulo.setText("CATALOGO DE CUENTAS");

        jtxtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre:"));

        jtxtCodigo.setBorder(javax.swing.BorderFactory.createTitledBorder("Código:"));

        jtxtSaldo.setBorder(javax.swing.BorderFactory.createTitledBorder("Saldo:"));

        jcmbTipoCuenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- SELECCIONAR TIPO --", "Activo Normal", "Contra-Cuenta de Activo", "Pasivo", "Capital", "Ingresos", "Gastos", "Retiros" }));

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
                .addGap(155, 155, 155)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlblTitulo)
                        .addGap(178, 178, 178))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(132, 132, 132))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbtnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(42, 42, 42)
                        .addComponent(jbtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jbtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jtxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jcmbTipoCuenta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jtxtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 808, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jlblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcmbTipoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarActionPerformed
        // TODO add your handling code here:
        /**
        * Validaciones...
        */
        if (_idCuenta != -1) { // Actualizar cuenta
            Cuenta cuentaActualizada = CuentaControlador.Instancia().GetCuentaPorId(_idCuenta);
            
            // Captura y almacena la información
            cuentaActualizada.setCodigo(jtxtCodigo.getText());
            cuentaActualizada.setNombre(jtxtNombre.getText());
            cuentaActualizada.setTipo((String) jcmbTipoCuenta.getSelectedItem());
            String textoSaldo = jtxtSaldo.getText();
            BigDecimal saldo = new BigDecimal(textoSaldo);
            cuentaActualizada.setSaldo(saldo);
            
            CuentaControlador.Instancia().ActualizarCuenta(cuentaActualizada);
            JOptionPane.showMessageDialog(null, "LA CUENTA HA SIDO ACTUALIZADA EN LA BASE DE DATOS EXITOSAMENTE.","TAREA REALIZADA CON EXITO:", JOptionPane.INFORMATION_MESSAGE);
        } else { // Crear nueva cuenta
            Cuenta nuevaCuenta = new Cuenta();
            
            // Captura y almacena la información
            nuevaCuenta.setIdEmpresaFk(EmpresaControlador.Instancia().GetEmpresaPorId(_idEmpresa));
            nuevaCuenta.setCodigo(jtxtCodigo.getText());
            nuevaCuenta.setNombre(jtxtNombre.getText());
            nuevaCuenta.setTipo((String) jcmbTipoCuenta.getSelectedItem());
            String textoSaldo = jtxtSaldo.getText();
            BigDecimal saldo = new BigDecimal(textoSaldo);
            nuevaCuenta.setSaldo(saldo);
            
            CuentaControlador.Instancia().CrearCuenta(nuevaCuenta);
            JOptionPane.showMessageDialog(null, "LA CUENTA HA SIDO REGISTRADA EN LA BASE DE DATOS EXITOSAMENTE.","TAREA REALIZADA CON EXITO:", JOptionPane.INFORMATION_MESSAGE);
        }
        CargarCuentas();
        LimpiarTodo();
    }//GEN-LAST:event_jbtnGuardarActionPerformed

    private void jbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarActionPerformed
        // TODO add your handling code here:
        if (_idCuenta != -1) {
            Cuenta cuentaAEliminar = CuentaControlador.Instancia().GetCuentaPorId(_idCuenta);
            int response = JOptionPane.showConfirmDialog(
                CatalogoCuentas.this,
                "¿Estás seguro de que deseas eliminar " + cuentaAEliminar.getNombre() + " de la base de datos? Este proceso no se puede revertir.",
                "ATENCIÓN:",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE
            );

            if (response == JOptionPane.YES_OPTION) {
                CuentaControlador.Instancia().EliminarCuenta(_idCuenta);
                JOptionPane.showMessageDialog(null, "LA CUENTA HA SIDO ELIMINADA DE LA BASE DE DATOS EXITOSAMENTE.","TAREA REALIZADA CON EXITO:", JOptionPane.INFORMATION_MESSAGE);
                CargarCuentas();// Recarga la tabla para actualizarla
                LimpiarTodo();// Limpia todos los campos
            }
        }
    }//GEN-LAST:event_jbtnEliminarActionPerformed

    private void jbtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimpiarActionPerformed
        // TODO add your handling code here:
        LimpiarTodo();
    }//GEN-LAST:event_jbtnLimpiarActionPerformed

    private void jtblCuentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblCuentasMouseClicked
        // TODO add your handling code here:
        _idCuenta = Integer.parseInt(jtblCuentas.getValueAt(jtblCuentas.getSelectedRow(), 0).toString());
        CargarDatosDeCuentaSeleccionada();
    }//GEN-LAST:event_jtblCuentasMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        jtblCuentas.clearSelection();
        _idCuenta = -1;
    }//GEN-LAST:event_formMouseClicked


    private void CargarCuentas() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo = (DefaultTableModel)jtblCuentas.getModel();
        modelo.setRowCount(0);//Limpia todas los registros de la tabla (indicando que no quiere ninguna fila)
        
        List<Cuenta> lstCuentas = CuentaControlador.Instancia().GetListaCuentasPorEmpresa(_idEmpresa);
        
        for (Cuenta cuenta : lstCuentas) {
            modelo.addRow(new Object[]{cuenta.getId(), cuenta.getCodigo(), cuenta.getNombre(), cuenta.getTipo(), cuenta.getSaldo()});
        }
    }
    
    private void LimpiarTodo() {
        jtxtCodigo.setText("");
        jtxtNombre.setText("");
        jcmbTipoCuenta.setSelectedIndex(0);
        jtxtSaldo.setText("");
        jtblCuentas.clearSelection();
        _idCuenta = -1;
    }
    
    private void CargarDatosDeCuentaSeleccionada() {
        if (_idCuenta != -1) {
            Cuenta cuentaSeleccionada = CuentaControlador.Instancia().GetCuentaPorId(_idCuenta);
            jtxtCodigo.setText(cuentaSeleccionada.getCodigo());
            jtxtNombre.setText(cuentaSeleccionada.getNombre());
            jcmbTipoCuenta.setSelectedItem(cuentaSeleccionada.getTipo());
            jtxtSaldo.setText(cuentaSeleccionada.getSaldo().toString());            
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtnEliminar;
    private javax.swing.JButton jbtnGuardar;
    private javax.swing.JButton jbtnLimpiar;
    private javax.swing.JComboBox<String> jcmbTipoCuenta;
    private javax.swing.JLabel jlblTitulo;
    private javax.swing.JTable jtblCuentas;
    private javax.swing.JTextField jtxtCodigo;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtSaldo;
    // End of variables declaration//GEN-END:variables
}
