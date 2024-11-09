/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import controllers.CuentaControlador;
import controllers.EmpresaControlador;
import controllers.MayorControlador;
import controllers.MovimientoControlador;
import java.awt.Color;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import models.Cuenta;
import models.Empresa;
import models.Mayor;
import models.Movimiento;

/**
 *
 * @author ever_vc
 */
public class LibroMayor extends javax.swing.JPanel {
    private Validaciones validar = new Validaciones();
    private int _idCuenta = -1;
    private Principal _frmPrincipal;
    private Empresa _empresaSeleccionada = null;
    private Date ultimaMayorizacion = null; // Almacena la fecha de la mayorización más reciente
    private boolean huboMayorizacion = false; // Permite validar si hubo alguna mayorización (es decir que habían movimientos pendientes de mayorizar)

    /**
     * Creates new form LibroMayor
     */
    public LibroMayor() {
        initComponents();
        CargarEmpresas();
        
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

        jSeparator1 = new javax.swing.JSeparator();
        jlblTitulo = new javax.swing.JLabel();
        jcmbEmpresa = new javax.swing.JComboBox();
        jbtnMayorizar = new javax.swing.JButton();
        jbtnCuentaT = new javax.swing.JButton();
        jbtnBalanzaComprobacion = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblCuentas = new javax.swing.JTable();
        jdcFechaInicio = new com.toedter.calendar.JDateChooser();
        jdcFechaFin = new com.toedter.calendar.JDateChooser();
        jlblFechaInicio = new javax.swing.JLabel();
        jlblFechaFin = new javax.swing.JLabel();
        jlblEmpresa = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbtnMayorizacionesPorCuenta = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jlblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jlblTitulo.setForeground(new java.awt.Color(0, 0, 0));
        jlblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblTitulo.setText("LIBRO MAYOR");

        jcmbEmpresa.setForeground(new java.awt.Color(0, 51, 51));
        jcmbEmpresa.setBorder(null);
        jcmbEmpresa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbEmpresaItemStateChanged(evt);
            }
        });

        jbtnMayorizar.setText("MAYORIZAR CUENTAS");
        jbtnMayorizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnMayorizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMayorizarActionPerformed(evt);
            }
        });

        jbtnCuentaT.setBackground(new java.awt.Color(0, 51, 0));
        jbtnCuentaT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnCuentaT.setForeground(new java.awt.Color(255, 255, 255));
        jbtnCuentaT.setText("VER ESTADO DE CUENTA");
        jbtnCuentaT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnCuentaT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCuentaTActionPerformed(evt);
            }
        });

        jbtnBalanzaComprobacion.setBackground(new java.awt.Color(0, 0, 51));
        jbtnBalanzaComprobacion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnBalanzaComprobacion.setForeground(new java.awt.Color(255, 255, 255));
        jbtnBalanzaComprobacion.setText("BALANCE DE COMPROBACION (ULTIMA MAYORIZACION)");
        jbtnBalanzaComprobacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnBalanzaComprobacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBalanzaComprobacionActionPerformed(evt);
            }
        });

        jtblCuentas.setBackground(new java.awt.Color(255, 255, 255));
        jtblCuentas.setForeground(new java.awt.Color(0, 51, 51));
        jtblCuentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CODIGO", "NOMBRE", "TIPO", "SALDO", "ULTIMA MAYORIZACION"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
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
            jtblCuentas.getColumnModel().getColumn(0).setPreferredWidth(10);
            jtblCuentas.getColumnModel().getColumn(1).setResizable(false);
            jtblCuentas.getColumnModel().getColumn(1).setPreferredWidth(50);
            jtblCuentas.getColumnModel().getColumn(2).setResizable(false);
            jtblCuentas.getColumnModel().getColumn(2).setPreferredWidth(250);
            jtblCuentas.getColumnModel().getColumn(3).setResizable(false);
            jtblCuentas.getColumnModel().getColumn(3).setPreferredWidth(50);
            jtblCuentas.getColumnModel().getColumn(4).setResizable(false);
            jtblCuentas.getColumnModel().getColumn(4).setPreferredWidth(50);
            jtblCuentas.getColumnModel().getColumn(5).setResizable(false);
            jtblCuentas.getColumnModel().getColumn(5).setPreferredWidth(150);
        }

        jlblFechaInicio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlblFechaInicio.setForeground(new java.awt.Color(0, 0, 0));
        jlblFechaInicio.setText("Fecha Inicio:");

        jlblFechaFin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlblFechaFin.setForeground(new java.awt.Color(0, 0, 0));
        jlblFechaFin.setText("Fecha Fin:");

        jlblEmpresa.setBackground(new java.awt.Color(0, 0, 0));
        jlblEmpresa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlblEmpresa.setForeground(new java.awt.Color(0, 51, 51));
        jlblEmpresa.setText("Seleccione la empresa:");

        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("*");

        jbtnMayorizacionesPorCuenta.setBackground(new java.awt.Color(0, 51, 51));
        jbtnMayorizacionesPorCuenta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnMayorizacionesPorCuenta.setForeground(new java.awt.Color(255, 255, 255));
        jbtnMayorizacionesPorCuenta.setText("MAYORIZACIONES DE CUENTA");
        jbtnMayorizacionesPorCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnMayorizacionesPorCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMayorizacionesPorCuentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlblEmpresa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jlblTitulo)
                                    .addGap(138, 138, 138))
                                .addComponent(jcmbEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnCuentaT, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbtnBalanzaComprobacion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbtnMayorizacionesPorCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 823, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jdcFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlblFechaInicio))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlblFechaFin)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jdcFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addComponent(jbtnMayorizar, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jlblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jlblEmpresa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcmbEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblFechaInicio)
                            .addComponent(jlblFechaFin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jdcFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdcFechaInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnMayorizar, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnCuentaT, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnBalanzaComprobacion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnMayorizacionesPorCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jcmbEmpresaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbEmpresaItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            if (!jcmbEmpresa.getSelectedItem().equals("-- SELECCIONAR EMPRESA --")) {
                CargarCuentas();
            } else {
                _empresaSeleccionada = null;
            }
        }
    }//GEN-LAST:event_jcmbEmpresaItemStateChanged

    private void jtblCuentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblCuentasMouseClicked
        // TODO add your handling code here:
        int selectedRow = jtblCuentas.getSelectedRow();
    
        // Verifica que una fila válida esté seleccionada (Es decir que no haya dado click en un espacio vacío)
        if (selectedRow >= 0) {
            _idCuenta = Integer.parseInt(jtblCuentas.getValueAt(selectedRow, 0).toString());
        }
       //_idCuenta = Integer.parseInt(jtblCuentas.getValueAt(jtblCuentas.getSelectedRow(), 0).toString());
    }//GEN-LAST:event_jtblCuentasMouseClicked

    private void jbtnMayorizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMayorizarActionPerformed
        // TODO add your handling code here:            
        if (_empresaSeleccionada != null) {
            Date fechaInicio = jdcFechaInicio.getDate();
            Date fechaFin = jdcFechaFin.getDate();

            if (!validar.ValidarFechas(fechaInicio, fechaFin)) {
                return;
            }
            List<Cuenta> lstCuentas = CuentaControlador.Instancia().GetListaCuentasPorEmpresa(_empresaSeleccionada.getId());
            // Valida si hay cuentas en la empresa (sino tiene cuentas, evita hacer la solicitud)
            if (lstCuentas.size() == 0) {
                JOptionPane.showMessageDialog(null, "PARECE QUE LA EMPREZA NO TIENE NINGUNA CUENTA REGISTRADA, POR LO TANTO NO ES POSIBLE REALIZAR LA MAYORIZACION.","RESPUESTA A LA SOLICITUD:", JOptionPane.INFORMATION_MESSAGE);     
                return;
            }
            
            // Verifica si la fecja de ultimaMayorizacion no es nula (porque si es nula, esta es la primera mayorización)
            if (ultimaMayorizacion != null) {
                 // Valida que la fecha de inicio para la nueva mayorización sea después de la última mayorización registrada
                if (fechaInicio.after(ultimaMayorizacion)) {
                    int response = JOptionPane.showConfirmDialog(
                        LibroMayor.this,
                        "¿ESTAS SEGURO QUE DESEA REALIZAR LA MAYORIZACION DE LAS CUENTAS? ESTE ES UN PROCESO QUE NO SE PUEDE REVERTIR.",
                        "ATENCIÓN:",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.WARNING_MESSAGE
                    );

                    if (response == JOptionPane.YES_OPTION){
                        for (Cuenta cuenta : lstCuentas) {
                            Mayorizar(cuenta, fechaInicio, fechaFin);
                        }
                        if (huboMayorizacion) {
                            JOptionPane.showMessageDialog(null, "LAS CUENTAS SE HAN MAYORIZADO EXITOSAMENTE.","TAREA REALIZADA CON EXITO:", JOptionPane.INFORMATION_MESSAGE);
                            CargarCuentas();
                        } else {
                           JOptionPane.showMessageDialog(null, "PARECE QUE NO HABÍAN MOVIMIENTOS PENDIENTES DE MAYORIZAR EN EL PERIODO DE TIEMPO QUE HA SELECCIONADO.","RESPUESTA A LA SOLICITUD:", JOptionPane.INFORMATION_MESSAGE);     
                        }    
                    }            
                } else {
                    JOptionPane.showMessageDialog(null, "LA FECHA INICIAL DE LA NUEVA MAYORIZACIÓN DEBE SER DESPUÉS DE LA ÚLTIMA MAYORIZACIÓN REGISTRADA.","ERROR:", JOptionPane.ERROR_MESSAGE);
                }
            } else { // En caso que ultimaMayorizacion sea nula, significa que es la primera mayorización de todas las cuentas
                int response = JOptionPane.showConfirmDialog(
                    LibroMayor.this,
                    "¿ESTAS SEGURO QUE DESEA REALIZAR LA MAYORIZACION DE LAS CUENTAS? ESTE ES UN PROCESO QUE NO SE PUEDE REVERTIR.",
                    "ATENCIÓN:",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE
                );

                if (response == JOptionPane.YES_OPTION){
                    for (Cuenta cuenta : lstCuentas) {
                        Mayorizar(cuenta, fechaInicio, fechaFin);
                    }
                    if (huboMayorizacion) {
                        JOptionPane.showMessageDialog(null, "LAS CUENTAS SE HAN MAYORIZADO EXITOSAMENTE.","TAREA REALIZADA CON EXITO:", JOptionPane.INFORMATION_MESSAGE);
                        CargarCuentas();
                    } else {
                       JOptionPane.showMessageDialog(null, "PARECE QUE NO HABÍAN MOVIMIENTOS PENDIENTES DE MAYORIZAR EN EL PERIODO DE TIEMPO QUE HA SELECCIONADO.","RESPUESTA A LA SOLICITUD:", JOptionPane.INFORMATION_MESSAGE);     
                    }    
                }
            }
        }  else {
            JOptionPane.showMessageDialog(null, "POR FAVOR SELECCIONE LA EMPRESA DE LA CUAL DESEA REALIZAR LA MAYORIZACIÓN.","ERROR:", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbtnMayorizarActionPerformed

    private void jbtnCuentaTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCuentaTActionPerformed
        // TODO add your handling code here:
        if (_idCuenta != -1) {
            Cuenta cuenta = CuentaControlador.Instancia().GetCuentaPorId(_idCuenta);
            _frmPrincipal.AbrirSubPanel(new CuentaT(cuenta));
        } else {
            JOptionPane.showMessageDialog(null, "POR FAVOR SELECCIONE LA CUENTA DE LA CUAL DESEA VISUALIZAR EL ESQUEMA DE MAYOR.","ERROR:", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbtnCuentaTActionPerformed

    private void jbtnBalanzaComprobacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBalanzaComprobacionActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "PARECE QUE ESTE MODULO NO HA SIDO IMPLEMENTADO AUN, PERO DESCUIDA, TE NOTIFICAREMOS TAN PRONTO ESTE DISPONIBLE. :)","¡OH POR DIOS!", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jbtnBalanzaComprobacionActionPerformed

    private void jbtnMayorizacionesPorCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMayorizacionesPorCuentaActionPerformed
        // TODO add your handling code here:
        if (_idCuenta != -1) {
            Cuenta cuenta = CuentaControlador.Instancia().GetCuentaPorId(_idCuenta);
            List<Mayor> lstMayorizaciones = MayorControlador.Instancia().GetListaRegistrosAlMayorPorCuenta(cuenta);
            if (lstMayorizaciones.size() > 0) {
                _frmPrincipal.AbrirSubPanel(new MayorizacionDeCuenta(cuenta));
            } else {
                JOptionPane.showMessageDialog(null, "LA CUENTA ES NUEVA O AUN NO SE HA MAYORIZADO, POR LO TANTO NO HAY DETALLE DE MAYORIZACIONES.","ERROR:", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "POR FAVOR SELECCIONE LA CUENTA DE LA CUAL DESEA VISUALIZAR EL DETALLE DE TODAS LAS MAYORIZACIONES.","ERROR:", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbtnMayorizacionesPorCuentaActionPerformed

    public void SetFormularioPrincipal(Principal frmPrincipal) {
        this._frmPrincipal = frmPrincipal;
    }
    
    private void CargarCuentas() {
        _empresaSeleccionada = (Empresa) jcmbEmpresa.getSelectedItem();
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo = (DefaultTableModel)jtblCuentas.getModel();
        modelo.setRowCount(0);//Limpia todas los registros de la tabla (indicando que no quiere ninguna fila)
        
        List<Cuenta> lstCuentas = CuentaControlador.Instancia().GetListaCuentasPorEmpresa(_empresaSeleccionada.getId());
        for (Cuenta cuenta : lstCuentas) {
            // Muestra la ultima vez de mayorizacion
            List<Mayor> lstRegistrosDeCuentaEnELMayor = MayorControlador.Instancia().GetListaRegistrosAlMayorPorCuenta(cuenta);
            String fechaFormateada = "Sin mayorizar (nueva)";
            if (lstRegistrosDeCuentaEnELMayor.size() > 0) {
                Date fecha = lstRegistrosDeCuentaEnELMayor.getLast().getFechaFin();
                
                if (ultimaMayorizacion == null) {
                    ultimaMayorizacion = fecha;
                }
                
                // Calcula la fecha más reciente de mayorización (es la fecha limite iniciar en que puede realizar la mayorización)
                if (fecha.after(ultimaMayorizacion)) { // Verifica si la fecha de mayorización de la cuenta actual es después de la fecha registrada
                    ultimaMayorizacion = fecha; // Actualiza a esa fecha (ya que es posible que una cuenta no se haya mayorizado porque en un mes no hubo movimientos)
                }
                SimpleDateFormat formatoCorto = new SimpleDateFormat("dd/MM/yyyy");
                fechaFormateada = formatoCorto.format(fecha);
            }
            modelo.addRow(new Object[]{cuenta.getId(), cuenta.getCodigo(), cuenta.getNombre(), cuenta.getTipo(), cuenta.getSaldo(), fechaFormateada});
        }
        
    }
    
    private void CargarEmpresas() {
        List<Empresa> lstEmpresas = EmpresaControlador.Instancia().GetListaEmpresas();
        jcmbEmpresa.addItem("-- SELECCIONAR EMPRESA --");
        for (Empresa empresa : lstEmpresas) {
            jcmbEmpresa.addItem(empresa);
        }
    }
    
    private void Mayorizar(Cuenta cuenta, Date fechaInicio, Date fechaFin) {
        // Obtiene la lista de registros en las que se haya un movimiento de la cuenta (dentro del rango de fecha indicado)
        List<Movimiento> lstMovimientos = MovimientoControlador.Instancia().GetMovimientosPorCuentaYFechaInicioYFin(fechaInicio, fechaFin, cuenta);
        
        // Verifica si esa cuenta ha tenido movimientos durante ese mes (sino tuvo movimientos no es necesario mayorizar) 
        if (lstMovimientos.size() > 0) {
            // Almacenan el total del debe y haber para posteriormente realizar la respectiva diferencia
            double totalDebe = 0.00;
            double totalHaber = 0.00;

            for (Movimiento movimiento : lstMovimientos) {
                totalDebe += movimiento.getDebe().doubleValue();
                totalHaber += movimiento.getHaber().doubleValue();
            }

            double saldoFinal = 0.00;

            // Realiza la diferencia según el tipo de la cuenta que se está procesando
            String tipo = cuenta.getTipo();

            if (tipo.equals("Activo Normal") || tipo.equals("Gastos") || tipo.equals("Retiros")) {
                saldoFinal = cuenta.getSaldo().doubleValue() + totalDebe - totalHaber;
            } else if (tipo.equals("Pasivo") || tipo.equals("Contra-Cuenta de Activo") || tipo.equals("Capital") || tipo.equals("Ingresos")) {
                saldoFinal = cuenta.getSaldo().doubleValue() + totalHaber - totalDebe;
            }
            RegistrarMayorizacion(cuenta, fechaInicio, fechaFin, totalDebe, totalHaber, saldoFinal);
            ActualizarCuenta(cuenta, saldoFinal);
            huboMayorizacion = true;
        }
    }
    
    private void ActualizarCuenta(Cuenta cuenta, double nuevoSaldo) {
        BigDecimal saldoActualizado = BigDecimal.valueOf(nuevoSaldo);
        cuenta.setSaldo(saldoActualizado);
        CuentaControlador.Instancia().ActualizarCuenta(cuenta);
    }
    
    private void RegistrarMayorizacion(Cuenta cuenta, Date fechaInicio, Date fechaFin, double debe, double haber, double saldoFinal) {
        BigDecimal totalDebe = BigDecimal.valueOf(debe);
        BigDecimal totalHaber = BigDecimal.valueOf(haber);
        BigDecimal saldo = BigDecimal.valueOf(saldoFinal);
        Mayor nuevoMayor = new Mayor();
        nuevoMayor.setFechaInicio(fechaInicio);
        nuevoMayor.setFechaFin(fechaFin);
        nuevoMayor.setTotalDebe(totalDebe);
        nuevoMayor.setTotalHaber(totalHaber);
        nuevoMayor.setSaldo(saldo);
        nuevoMayor.setSaldoAnterior(cuenta.getSaldo());
        nuevoMayor.setIdCuentaFk(cuenta);
        
        MayorControlador.Instancia().CrearRegistroDelMayor(nuevoMayor);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtnBalanzaComprobacion;
    private javax.swing.JButton jbtnCuentaT;
    private javax.swing.JButton jbtnMayorizacionesPorCuenta;
    private javax.swing.JButton jbtnMayorizar;
    private javax.swing.JComboBox jcmbEmpresa;
    private com.toedter.calendar.JDateChooser jdcFechaFin;
    private com.toedter.calendar.JDateChooser jdcFechaInicio;
    private javax.swing.JLabel jlblEmpresa;
    private javax.swing.JLabel jlblFechaFin;
    private javax.swing.JLabel jlblFechaInicio;
    private javax.swing.JLabel jlblTitulo;
    private javax.swing.JTable jtblCuentas;
    // End of variables declaration//GEN-END:variables
}
