/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import controllers.CuentaControlador;
import controllers.EmpresaControlador;
import java.awt.Color;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import models.Cuenta;

/**
 *
 * @author ever_vc
 */
public class CatalogoCuentas extends javax.swing.JPanel {
    
    private int _idEmpresa = -1;
    private int _idCuenta = -1;
    private Validaciones validar = new Validaciones();

    /**
     * Creates new form CatalogoCuentas
     */
    public CatalogoCuentas(int idEmpresa) {
        this._idEmpresa = idEmpresa;
        initComponents();
        CargarCuentas();
        
        // Diseño de la tabla => Crea un renderer para personalizar el encabezado
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(new java.awt.Color(0,51,51)); // Cambia el color de fondo del encabezado al del diseño principal new java.awt.Color(0,51,51)
        headerRenderer.setForeground(Color.WHITE); // Cambia el color de la fuente del encabezado

        // Asigna el renderer a cada columna del encabezado
        for (int i = 0; i < jtblCuentas.getColumnModel().getColumnCount(); i++) {
            jtblCuentas.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
        
        // Cambia el fondo de la tabla
        jtblCuentas.setBackground(Color.WHITE); // Fondo de la tabla (celdas)
        // Cambia el fondo del área vacía de la tabla
        jtblCuentas.setFillsViewportHeight(true);
        jtblCuentas.getParent().setBackground(Color.WHITE); // Fondo del viewport
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
        jbtnGuardar = new javax.swing.JButton();
        jbtnEliminar = new javax.swing.JButton();
        jbtnLimpiar = new javax.swing.JButton();
        jpnlForm = new javax.swing.JPanel();
        jlblTipo1 = new javax.swing.JLabel();
        jlblNombre = new javax.swing.JLabel();
        jtxtCodigo = new javax.swing.JTextField();
        jcmbTipoCuenta = new javax.swing.JComboBox<>();
        jtxtNombre = new javax.swing.JTextField();
        jlblCodigo = new javax.swing.JLabel();
        jtxtSaldo = new javax.swing.JTextField();
        jlblTipo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1051, 835));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jtblCuentas.setBackground(new java.awt.Color(255, 255, 255));
        jtblCuentas.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jtblCuentas.setForeground(new java.awt.Color(0, 51, 51));
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
        jtblCuentas.setGridColor(new java.awt.Color(0, 51, 51));
        jtblCuentas.setRowHeight(25);
        jtblCuentas.setSelectionBackground(new java.awt.Color(26, 173, 220));
        jtblCuentas.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jtblCuentas.setShowGrid(true);
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

        jbtnGuardar.setBackground(new java.awt.Color(0, 102, 0));
        jbtnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnGuardar.setText("GUARDAR");
        jbtnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarActionPerformed(evt);
            }
        });

        jbtnEliminar.setBackground(new java.awt.Color(153, 0, 0));
        jbtnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnEliminar.setText("ELIMINAR");
        jbtnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarActionPerformed(evt);
            }
        });

        jbtnLimpiar.setBackground(new java.awt.Color(0, 51, 51));
        jbtnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnLimpiar.setText("LIMPIAR CAMPOS");
        jbtnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimpiarActionPerformed(evt);
            }
        });

        jpnlForm.setBackground(new java.awt.Color(255, 255, 255));
        jpnlForm.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jlblTipo1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlblTipo1.setForeground(new java.awt.Color(0, 51, 51));
        jlblTipo1.setText("Saldo de la cuenta:");

        jlblNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlblNombre.setForeground(new java.awt.Color(0, 51, 51));
        jlblNombre.setText("Nombre:");

        jtxtCodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtxtCodigo.setForeground(new java.awt.Color(0, 51, 51));
        jtxtCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtCodigo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jtxtCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtCodigoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtCodigoFocusLost(evt);
            }
        });
        jtxtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtCodigoKeyTyped(evt);
            }
        });

        jcmbTipoCuenta.setForeground(new java.awt.Color(0, 51, 51));
        jcmbTipoCuenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- SELECCIONAR TIPO --", "Activo Normal", "Contra-Cuenta de Activo", "Pasivo", "Capital", "Ingresos", "Gastos", "Retiros" }));
        jcmbTipoCuenta.setBorder(null);

        jtxtNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtxtNombre.setForeground(new java.awt.Color(0, 51, 51));
        jtxtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jtxtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtNombreFocusLost(evt);
            }
        });
        jtxtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtNombreKeyTyped(evt);
            }
        });

        jlblCodigo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlblCodigo.setForeground(new java.awt.Color(0, 51, 51));
        jlblCodigo.setText("Código de la cuenta:");

        jtxtSaldo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtxtSaldo.setForeground(new java.awt.Color(0, 51, 51));
        jtxtSaldo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtSaldo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jtxtSaldo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtSaldoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtSaldoFocusLost(evt);
            }
        });
        jtxtSaldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtSaldoKeyTyped(evt);
            }
        });

        jlblTipo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlblTipo.setForeground(new java.awt.Color(0, 51, 51));
        jlblTipo.setText("Tipo de cuenta:");

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("*");

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("*");

        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("*");

        javax.swing.GroupLayout jpnlFormLayout = new javax.swing.GroupLayout(jpnlForm);
        jpnlForm.setLayout(jpnlFormLayout);
        jpnlFormLayout.setHorizontalGroup(
            jpnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlFormLayout.createSequentialGroup()
                        .addComponent(jlblCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jpnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlFormLayout.createSequentialGroup()
                        .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jcmbTipoCuenta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpnlFormLayout.createSequentialGroup()
                        .addComponent(jlblNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143)
                        .addComponent(jlblTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jpnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblTipo1)
                    .addComponent(jtxtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );
        jpnlFormLayout.setVerticalGroup(
            jpnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblCodigo)
                    .addComponent(jlblNombre)
                    .addComponent(jlblTipo)
                    .addComponent(jlblTipo1)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcmbTipoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpnlForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlblTitulo)
                        .addGap(178, 178, 178))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbtnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(42, 42, 42)
                        .addComponent(jbtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jbtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 808, Short.MAX_VALUE))
                .addContainerGap(121, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(239, 239, 239))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jlblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 20, Short.MAX_VALUE)
                .addComponent(jpnlForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarActionPerformed
        // TODO add your handling code here:
        String codigo = jtxtCodigo.getText();
        String nombre = jtxtNombre.getText();
        String tipo = (String) jcmbTipoCuenta.getSelectedItem();
        String textoSaldo = jtxtSaldo.getText();
        
        // Valida que se hayan ingresado todos los campos obligatorios (menos el saldo, ya que si se deja vacío, el sistema le asignará 0.00)
        if (!ValidarCamposObligatorios(codigo, nombre, tipo)) {
            return;
        }
        
        // Sino hay texto en el saldo inicial, entonces se establece por defecto en 0.00
        if ("".equals(textoSaldo)) {
            textoSaldo = "0.00";
        }
        
        if (_idCuenta != -1) { // Actualizar cuenta
            Cuenta cuentaActualizada = CuentaControlador.Instancia().GetCuentaPorId(_idCuenta);
            
            // Captura y almacena la información
            cuentaActualizada.setCodigo(codigo);
            cuentaActualizada.setNombre(nombre);
            cuentaActualizada.setTipo(tipo);
            BigDecimal saldo = new BigDecimal(textoSaldo);
            cuentaActualizada.setSaldo(saldo);
            
            CuentaControlador.Instancia().ActualizarCuenta(cuentaActualizada);
            JOptionPane.showMessageDialog(null, "LA CUENTA HA SIDO ACTUALIZADA EN LA BASE DE DATOS EXITOSAMENTE.","TAREA REALIZADA CON EXITO:", JOptionPane.INFORMATION_MESSAGE);
        } else { // Crear nueva cuenta
            Cuenta nuevaCuenta = new Cuenta();
            
            // Captura y almacena la información
            nuevaCuenta.setIdEmpresaFk(EmpresaControlador.Instancia().GetEmpresaPorId(_idEmpresa));
            nuevaCuenta.setCodigo(codigo);
            nuevaCuenta.setNombre(nombre);
            nuevaCuenta.setTipo(tipo);
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
        } else {
            JOptionPane.showMessageDialog(null, "POR FAVOR SELECCIONE DESDE LA TABLA LA CUENTA QUE DESEA ELIMINAR.","ERROR:", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbtnEliminarActionPerformed

    private void jbtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimpiarActionPerformed
        // TODO add your handling code here:
        LimpiarTodo();
    }//GEN-LAST:event_jbtnLimpiarActionPerformed

    private void jtblCuentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblCuentasMouseClicked
        // TODO add your handling code here:
        int selectedRow = jtblCuentas.getSelectedRow();
    
        // Verifica que una fila válida esté seleccionada (Es decir que no haya dado click en un espacio vacío)
        if (selectedRow >= 0) {
            _idCuenta = Integer.parseInt(jtblCuentas.getValueAt(selectedRow, 0).toString());        
            CargarDatosDeCuentaSeleccionada();
        }
        //_idCuenta = Integer.parseInt(jtblCuentas.getValueAt(jtblCuentas.getSelectedRow(), 0).toString());
        //CargarDatosDeCuentaSeleccionada();
    }//GEN-LAST:event_jtblCuentasMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        if (_idCuenta != -1) {
            LimpiarTodo();
        }
    }//GEN-LAST:event_formMouseClicked

    private void jtxtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCodigoKeyTyped
        // TODO add your handling code here:
        validar.ValidarNumerosEnteros(evt);
    }//GEN-LAST:event_jtxtCodigoKeyTyped

    private void jtxtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtNombreKeyTyped
        // TODO add your handling code here:
        validar.ValidarLetrasYEspacios(evt);
    }//GEN-LAST:event_jtxtNombreKeyTyped

    private void jtxtSaldoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtSaldoKeyTyped
        // TODO add your handling code here:
        validar.ValidarNumerosDecimales(evt, jtxtSaldo);
    }//GEN-LAST:event_jtxtSaldoKeyTyped

    private void jtxtCodigoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtCodigoFocusGained
        // TODO add your handling code here:
        validar.JtxtFocoCambiarColor(jtxtCodigo, true);
    }//GEN-LAST:event_jtxtCodigoFocusGained

    private void jtxtCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtCodigoFocusLost
        // TODO add your handling code here:
        validar.JtxtFocoCambiarColor(jtxtCodigo, false);
    }//GEN-LAST:event_jtxtCodigoFocusLost

    private void jtxtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtNombreFocusGained
        // TODO add your handling code here:
        validar.JtxtFocoCambiarColor(jtxtNombre, true);
    }//GEN-LAST:event_jtxtNombreFocusGained

    private void jtxtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtNombreFocusLost
        // TODO add your handling code here:
        validar.JtxtFocoCambiarColor(jtxtNombre, false);
    }//GEN-LAST:event_jtxtNombreFocusLost

    private void jtxtSaldoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtSaldoFocusGained
        // TODO add your handling code here:
        validar.JtxtFocoCambiarColor(jtxtSaldo, true);
    }//GEN-LAST:event_jtxtSaldoFocusGained

    private void jtxtSaldoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtSaldoFocusLost
        // TODO add your handling code here:
        validar.JtxtFocoCambiarColor(jtxtSaldo, false);
    }//GEN-LAST:event_jtxtSaldoFocusLost

    private boolean ValidarCamposObligatorios(String codigo, String nombre, String tipo) {
        boolean sonValidos = true;
        int cantidadCamposInvalidos = 0;
        String camposNoValidos = "";
        if ("".equals(codigo)) {
            validar.JtxtErrorColor(jtxtCodigo);
            cantidadCamposInvalidos ++;
            camposNoValidos += "\n~ CODIGO DE LA CUENTA";
            sonValidos = false;
        }
        if ("".equals(nombre)) {
            validar.JtxtErrorColor(jtxtNombre);
            cantidadCamposInvalidos ++;
            camposNoValidos += "\n~ NOMBRE";
            sonValidos = false;
        }
        if ("".equals(tipo) || "-- SELECCIONAR TIPO --".equals(tipo)) {
            cantidadCamposInvalidos ++;
            camposNoValidos += "\n~ TIPO DE CUENTA";
            sonValidos = false;
        }
        if (!sonValidos) {
            if (cantidadCamposInvalidos > 1) {
                JOptionPane.showMessageDialog(null, "PARECE QUE HA OLVIDADO LLENAR LOS CAMPOS: " + camposNoValidos + "\nPOR FAVOR ASEGURESE DE LLENAR CORRECTAMENTE TODOS LOS CAMPOS QUE CONTIENEN UN [*].","ERROR:", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "PARECE QUE HA OLVIDADO LLENAR EL CAMPO DE: " + camposNoValidos + "\nPOR FAVOR ASEGURESE DE LLENAR CORRECTAMENTE TODOS LOS CAMPOS QUE CONTIENEN UN [*].","ERROR:", JOptionPane.ERROR_MESSAGE);
            }
        }
        return sonValidos; // Retorna verdadero únicamente cuando todos los campos tienen datos
    }
    
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
        JtxtFinFoco();
    }
    
    private void JtxtFinFoco() {
        validar.JtxtColorInicial(jtxtNombre);
        validar.JtxtColorInicial(jtxtCodigo);
        validar.JtxtColorInicial(jtxtSaldo);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtnEliminar;
    private javax.swing.JButton jbtnGuardar;
    private javax.swing.JButton jbtnLimpiar;
    private javax.swing.JComboBox<String> jcmbTipoCuenta;
    private javax.swing.JLabel jlblCodigo;
    private javax.swing.JLabel jlblNombre;
    private javax.swing.JLabel jlblTipo;
    private javax.swing.JLabel jlblTipo1;
    private javax.swing.JLabel jlblTitulo;
    private javax.swing.JPanel jpnlForm;
    private javax.swing.JTable jtblCuentas;
    private javax.swing.JTextField jtxtCodigo;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtSaldo;
    // End of variables declaration//GEN-END:variables
}
