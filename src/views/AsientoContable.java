/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import controllers.CuentaControlador;
import controllers.EmpresaControlador;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import models.Cuenta;
import models.Empresa;

/**
 *
 * @author ever_vc
 */
public class AsientoContable extends javax.swing.JPanel {
    
    private String _tipoCuenta = "";
    private List<Cuenta> lstCuentasSegunTipo;

    /**
     * Creates new form AsientoContable
     */
    public AsientoContable() {
        initComponents();
        CargarEmpresas();
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
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jcmbTipoCuenta = new javax.swing.JComboBox<>();
        jcmbEmpresa = new javax.swing.JComboBox();
        jtxtDescripcion = new javax.swing.JTextField();
        jtxtDebe = new javax.swing.JTextField();
        jtxtHaber = new javax.swing.JTextField();
        jbtnListarCuentas = new javax.swing.JButton();
        jpnlCuentas = new javax.swing.JPanel();
        jtxtNombreCuenta = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jlstCuentas = new javax.swing.JList();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbtnGuardar = new javax.swing.JButton();
        jbtnLimpiar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jbtnGuardarMovimiento = new javax.swing.JButton();
        jbtnEliminarMovimiento = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1051, 835));

        jlblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jlblTitulo.setForeground(new java.awt.Color(0, 0, 0));
        jlblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblTitulo.setText("ASIENTOS CONTABLES");

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Fecha de movimiento:");

        jcmbTipoCuenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- SELECCIONAR TIPO --", "Activo", "Pasivo", "Capital", "Ingresos", "Gastos", "Retiros" }));
        jcmbTipoCuenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtrar por tipo de cuenta:"));
        jcmbTipoCuenta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbTipoCuentaItemStateChanged(evt);
            }
        });

        jcmbEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Empresa:"));

        jtxtDescripcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Descripción:"));

        jtxtDebe.setBorder(javax.swing.BorderFactory.createTitledBorder("Debe:"));

        jtxtHaber.setBorder(javax.swing.BorderFactory.createTitledBorder("Haber:"));

        jbtnListarCuentas.setText("LISTAR CUENTAS");
        jbtnListarCuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnListarCuentasActionPerformed(evt);
            }
        });

        jpnlCuentas.setBackground(new java.awt.Color(255, 255, 255));
        jpnlCuentas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jScrollPane2.setViewportView(jlstCuentas);

        javax.swing.GroupLayout jpnlCuentasLayout = new javax.swing.GroupLayout(jpnlCuentas);
        jpnlCuentas.setLayout(jpnlCuentasLayout);
        jpnlCuentasLayout.setHorizontalGroup(
            jpnlCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlCuentasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnlCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtNombreCuenta)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpnlCuentasLayout.setVerticalGroup(
            jpnlCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlCuentasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtxtNombreCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "FECHA", "DESCRIPCION", "DEBE", "HABER"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(250);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(50);
        }

        jbtnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnGuardar.setText("CREAR ASIENTO");
        jbtnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarActionPerformed(evt);
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

        jTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder("TOTAL DEBE:"));

        jTextField2.setBorder(javax.swing.BorderFactory.createTitledBorder("TOTAL HABER:"));

        jbtnGuardarMovimiento.setText("GUARDAR");

        jbtnEliminarMovimiento.setText("ELIMINAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlblTitulo)
                        .addGap(323, 323, 323))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtxtDescripcion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jcmbEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel1)
                                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(119, 119, 119)
                                                .addComponent(jcmbTipoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jbtnGuardarMovimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jtxtDebe, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                                        .addGap(55, 55, 55)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jtxtHaber, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                            .addComponent(jbtnEliminarMovimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(46, 46, 46)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jbtnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jbtnListarCuentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpnlCuentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnlCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jcmbTipoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcmbEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtDebe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtHaber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnListarCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbtnGuardarMovimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnEliminarMovimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarActionPerformed
        // TODO add your handling code here:
        /**
        * Validaciones...
        */
    }//GEN-LAST:event_jbtnGuardarActionPerformed

    private void jbtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnLimpiarActionPerformed

    private void jbtnListarCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnListarCuentasActionPerformed
        // TODO add your handling code here:
        if (jcmbEmpresa.getSelectedItem() != "-- SELECCIONAR EMPRESA --") {
            // Busca la empresa seleccionada para obtener su catalogo de cuentas completo
            Empresa empresaSeleccionada = (Empresa) jcmbEmpresa.getSelectedItem();
            DefaultListModel modeloLista = new DefaultListModel();
            jlstCuentas.setModel(modeloLista);
            //modeloLista.setSize(0);// Limpia el modelo de la lista (elimina todos los elementos que hayan)
            modeloLista.removeAllElements();// Limpia el modelo de la lista (elimina todos los elementos que hayan)
            if (_tipoCuenta != "") {
                // Code...
            } else {
                lstCuentasSegunTipo = CuentaControlador.Instancia().GetListaCuentasPorEmpresa(empresaSeleccionada.getId());
                for (Cuenta cuenta : lstCuentasSegunTipo) {
                    modeloLista.addElement(cuenta);
                }
                //modeloLista.addAll(lstCuentasSegunTipo);
            }
        } else {
            JOptionPane.showMessageDialog(null, "POR FAVOR SELECCIONE LA EMPRESA A LA CUAL DESEA CREARLE EL ASIENTO CONTABLE.","ERROR:", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbtnListarCuentasActionPerformed

    private void jcmbTipoCuentaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbTipoCuentaItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            String tipoSeleccionado = (String) jcmbTipoCuenta.getSelectedItem();
            if (tipoSeleccionado != "-- SELECCIONAR TIPO --") {
                _tipoCuenta = tipoSeleccionado;       
            }
        }
    }//GEN-LAST:event_jcmbTipoCuentaItemStateChanged

    private void CargarEmpresas() {
        List<Empresa> lstEmpresas = EmpresaControlador.Instancia().GetListaEmpresas();
        jcmbEmpresa.addItem("-- SELECCIONAR EMPRESA --");
        for (Empresa empresa : lstEmpresas) {
            jcmbEmpresa.addItem(empresa);
        }
    }
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton jbtnEliminarMovimiento;
    private javax.swing.JButton jbtnGuardar;
    private javax.swing.JButton jbtnGuardarMovimiento;
    private javax.swing.JButton jbtnLimpiar;
    private javax.swing.JButton jbtnListarCuentas;
    private javax.swing.JComboBox jcmbEmpresa;
    private javax.swing.JComboBox<String> jcmbTipoCuenta;
    private javax.swing.JLabel jlblTitulo;
    private javax.swing.JList jlstCuentas;
    private javax.swing.JPanel jpnlCuentas;
    private javax.swing.JTextField jtxtDebe;
    private javax.swing.JTextField jtxtDescripcion;
    private javax.swing.JTextField jtxtHaber;
    private javax.swing.JTextField jtxtNombreCuenta;
    // End of variables declaration//GEN-END:variables
}
