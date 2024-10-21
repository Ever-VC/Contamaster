/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import controllers.AsientoControlador;
import controllers.DetalleAsientoControlador;
import controllers.EmpresaControlador;
import controllers.MovimientoControlador;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Asiento;
import models.DetalleAsiento;
import models.Empresa;
import models.Movimiento;

/**
 *
 * @author ever_vc
 */
public class LibroDiario extends javax.swing.JPanel {
    
    private Empresa _empresaSeleccionada = null;

    /**
     * Creates new form LibroDiario
     */
    public LibroDiario() {
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

        jSeparator1 = new javax.swing.JSeparator();
        jlblTitulo = new javax.swing.JLabel();
        jlblFechaInicio = new javax.swing.JLabel();
        jlblFechaFin = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblLibroDiario = new javax.swing.JTable();
        jdcFechaInicio = new com.toedter.calendar.JDateChooser();
        jdcFechaFin = new com.toedter.calendar.JDateChooser();
        jlblTotales = new javax.swing.JLabel();
        jtxtTotalDebe = new javax.swing.JTextField();
        jtxtTotalHaber = new javax.swing.JTextField();
        jcmbEmpresa = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(255, 255, 255));

        jlblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jlblTitulo.setForeground(new java.awt.Color(0, 0, 0));
        jlblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblTitulo.setText("LIBRO DIARIO");

        jlblFechaInicio.setForeground(new java.awt.Color(0, 0, 0));
        jlblFechaInicio.setText("Fecha de inicio:");

        jlblFechaFin.setForeground(new java.awt.Color(0, 0, 0));
        jlblFechaFin.setText("Fecha de fin:");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("GENERAR");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jtblLibroDiario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "FECHA", "CODIGO", "DESCRIPCION", "DEBE", "HABER"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtblLibroDiario);
        if (jtblLibroDiario.getColumnModel().getColumnCount() > 0) {
            jtblLibroDiario.getColumnModel().getColumn(0).setResizable(false);
            jtblLibroDiario.getColumnModel().getColumn(0).setPreferredWidth(100);
            jtblLibroDiario.getColumnModel().getColumn(1).setResizable(false);
            jtblLibroDiario.getColumnModel().getColumn(1).setPreferredWidth(50);
            jtblLibroDiario.getColumnModel().getColumn(2).setResizable(false);
            jtblLibroDiario.getColumnModel().getColumn(2).setPreferredWidth(300);
            jtblLibroDiario.getColumnModel().getColumn(3).setResizable(false);
            jtblLibroDiario.getColumnModel().getColumn(3).setPreferredWidth(50);
            jtblLibroDiario.getColumnModel().getColumn(4).setResizable(false);
            jtblLibroDiario.getColumnModel().getColumn(4).setPreferredWidth(50);
        }

        jlblTotales.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlblTotales.setForeground(new java.awt.Color(0, 0, 0));
        jlblTotales.setText("TOTALES");

        jtxtTotalDebe.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jtxtTotalDebe.setEnabled(false);

        jtxtTotalHaber.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jtxtTotalHaber.setEnabled(false);

        jcmbEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Empresa:"));
        jcmbEmpresa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbEmpresaItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jcmbEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlblTitulo)
                                .addGap(138, 138, 138)))))
                .addContainerGap(124, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jlblFechaInicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jdcFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlblFechaFin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jdcFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlblTotales)
                .addGap(18, 18, 18)
                .addComponent(jtxtTotalDebe, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtxtTotalHaber, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(176, 176, 176))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jlblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcmbEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblFechaFin)
                    .addComponent(jlblFechaInicio)
                    .addComponent(jButton1)
                    .addComponent(jdcFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdcFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblTotales)
                    .addComponent(jtxtTotalDebe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtTotalHaber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Date fechaInicio = jdcFechaInicio.getDate();
        Date fechaFin = jdcFechaFin.getDate();
        CargarLibroDiario(fechaInicio, fechaFin);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jcmbEmpresaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbEmpresaItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            if (!jcmbEmpresa.getSelectedItem().equals("-- SELECCIONAR EMPRESA --")) {
                _empresaSeleccionada = (Empresa) jcmbEmpresa.getSelectedItem();
            } else {
                // Limpia el modelo de la lista (elimina todos los elementos que haya)
                _empresaSeleccionada = null;
            }
        }
    }//GEN-LAST:event_jcmbEmpresaItemStateChanged

    
    private void CargarLibroDiario(Date fechaInicio, Date fechaFin) {
        
        if (_empresaSeleccionada != null) {
            DefaultTableModel modelo = new DefaultTableModel();
            modelo = (DefaultTableModel)jtblLibroDiario.getModel();
            modelo.setRowCount(0);//Limpia todas los registros de la tabla (indicando que no quiere ninguna fila)

            List<Movimiento> lstMovimientos = MovimientoControlador.Instancia().GetMovimientosPorEmpresaYFechaInicioYFin(fechaInicio, fechaFin, _empresaSeleccionada);

            Movimiento primerMovimiento = lstMovimientos.getFirst();

            // Obtiene el primer registro de la tabla detalle asiento para saber a qué asiento pertenece
            DetalleAsiento detalleAsiento = DetalleAsientoControlador.Instancia().GetAsientosPorMovimiento(primerMovimiento).getFirst();

            Asiento asiento = detalleAsiento.getIdAsientoFk();

            Date fechaDeReferencia = primerMovimiento.getFecha();
            int iterador = 0;
            double totalDebe = 0.00;
            double totalHaber = 0.00;
            for (Movimiento movimiento : lstMovimientos) {
                totalDebe += movimiento.getDebe().doubleValue();
                totalHaber += movimiento.getHaber().doubleValue();
                Date fecha = movimiento.getFecha();
                String fechaFormateada = "";
                if (!fechaDeReferencia.equals(fecha) || iterador == 0) {
                    if (iterador != 0) {
                        modelo.addRow(new Object[]{fechaFormateada, "", asiento.getDescripcion(), "", ""});
                    }
                    fechaDeReferencia = fecha;
                    SimpleDateFormat formatoCorto = new SimpleDateFormat("dd/MM/yyyy");
                    fechaFormateada = formatoCorto.format(fecha);
                }
                modelo.addRow(new Object[]{fechaFormateada, movimiento.getIdCuentaFk().getCodigo(), movimiento.getDescripcion(), movimiento.getDebe(), movimiento.getHaber()});

                if (iterador == (lstMovimientos.size() - 1)) {
                    modelo.addRow(new Object[]{fechaFormateada, "", asiento.getDescripcion(), "", ""});
                }

                iterador ++;
            }
            jtxtTotalDebe.setText(String.valueOf(totalDebe));
            jtxtTotalHaber.setText(String.valueOf(totalHaber));
        } else {
            JOptionPane.showMessageDialog(null, "POR FAVOR SELECCIONE LA CUENTA DE LA QUE DESEA GENERAR EL LIBRO DIARIO.","ERROR:", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void CargarEmpresas() {
        List<Empresa> lstEmpresas = EmpresaControlador.Instancia().GetListaEmpresas();
        jcmbEmpresa.addItem("-- SELECCIONAR EMPRESA --");
        for (Empresa empresa : lstEmpresas) {
            jcmbEmpresa.addItem(empresa);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox jcmbEmpresa;
    private com.toedter.calendar.JDateChooser jdcFechaFin;
    private com.toedter.calendar.JDateChooser jdcFechaInicio;
    private javax.swing.JLabel jlblFechaFin;
    private javax.swing.JLabel jlblFechaInicio;
    private javax.swing.JLabel jlblTitulo;
    private javax.swing.JLabel jlblTotales;
    private javax.swing.JTable jtblLibroDiario;
    private javax.swing.JTextField jtxtTotalDebe;
    private javax.swing.JTextField jtxtTotalHaber;
    // End of variables declaration//GEN-END:variables
}
