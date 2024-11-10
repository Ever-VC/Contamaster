/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import controllers.SessionLogControlador;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import models.Cuenta;
import models.SessionLog;
import support.Roles;
import support.UsuarioCache;

/**
 *
 * @author ever_vc
 */
public class Principal extends javax.swing.JFrame {
    
    private static int _visible = -1;
    private Login _frmLogin;
    private Roles rolUsuario = new Roles();

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        MostrarPanel.Instancia().NuevoPanel(jpnlContenedor, new Inicio());
        
        jlblNombreUsuario1.setText(UsuarioCache.GetNombreApellidoUsuario());
        String url = "src/assets/avatarUserM.png";
        if (UsuarioCache.Sexo.equals("Femenino")) {
            url = "src/assets/avatarUserW.png";
        }
        SetImagLabel(jimgUsuario, url);
        SetImagLabel(jimgLogo, "src/assets/logotipo-inicio.png");
        
        // Define los permisos
        if (UsuarioCache.RolUsuario.equals(rolUsuario.CONTADOR) || UsuarioCache.RolUsuario.equals(rolUsuario.AUXILIAR) || UsuarioCache.RolUsuario.equals(rolUsuario.GERENTE)) {
            jbtnUsuarios.setVisible(false);
            jbtnEmpresas.setVisible(false);
        }
        
        if (UsuarioCache.RolUsuario.equals(rolUsuario.GERENTE)) {
            jbtnAsientos.setVisible(false);
            jbtnLibroDiario.setVisible(false);
            jbtnLibroMayor.setVisible(false);
        }
        
        // Añade WindowListener para manejar el evento de cierre (Consultar si está seguro de cerrar la app)
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int response = JOptionPane.showConfirmDialog(
                    Principal.this,
                    "Actualmente tiene una sesión iniciada ¿Estás seguro de que deseas salir y cerrar por completo la sesión?",
                    "ATENCIÓN:",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE
                );

                if (response == JOptionPane.YES_OPTION) {
                    // Obtiene la sesion abierta actualmente a través del id del usuario logueado
                    SessionLog sesionDeUsuario = SessionLogControlador.instancia().ObtenerSesionPorUsuario(UsuarioCache.Id);
                    sesionDeUsuario.setLogoutTimestamp(new Date());// Almacena la hora de cierre de sesión por parte del usuario
                    SessionLogControlador.instancia().GuardarCierreDeSesion(sesionDeUsuario);// Guarda la información
                    System.exit(0);
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnlMenu = new javax.swing.JPanel();
        jbtnInicio = new javax.swing.JButton();
        jbtnUsuarios = new javax.swing.JButton();
        jlblNombreEmpresa = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jimgLogo = new javax.swing.JLabel();
        jbtnEmpresas = new javax.swing.JButton();
        jbtnAsientos = new javax.swing.JButton();
        jbtnLibroDiario = new javax.swing.JButton();
        jbtnLibroMayor = new javax.swing.JButton();
        jbtnCerrarSesion = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jpnlContenedor = new javax.swing.JPanel();
        jpnlTop = new javax.swing.JPanel();
        jlblNombreUsuario1 = new javax.swing.JLabel();
        jimgUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jpnlMenu.setBackground(new java.awt.Color(0, 51, 51));
        jpnlMenu.setMinimumSize(new java.awt.Dimension(203, 0));

        jbtnInicio.setBackground(new java.awt.Color(255, 255, 255));
        jbtnInicio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnInicio.setForeground(new java.awt.Color(0, 51, 51));
        jbtnInicio.setText("INICIO");
        jbtnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnInicioActionPerformed(evt);
            }
        });

        jbtnUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        jbtnUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnUsuarios.setForeground(new java.awt.Color(0, 51, 51));
        jbtnUsuarios.setText("GESTION DE USUARIOS");
        jbtnUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUsuariosActionPerformed(evt);
            }
        });

        jlblNombreEmpresa.setBackground(new java.awt.Color(0, 255, 255));
        jlblNombreEmpresa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlblNombreEmpresa.setForeground(new java.awt.Color(0, 204, 204));
        jlblNombreEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblNombreEmpresa.setText("CONTAMASTER");

        jimgLogo.setBackground(new java.awt.Color(51, 51, 255));
        jimgLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jimgLogo.setOpaque(true);

        jbtnEmpresas.setBackground(new java.awt.Color(255, 255, 255));
        jbtnEmpresas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnEmpresas.setForeground(new java.awt.Color(0, 51, 51));
        jbtnEmpresas.setText("GESTION DE EMPRESAS");
        jbtnEmpresas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnEmpresas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEmpresasActionPerformed(evt);
            }
        });

        jbtnAsientos.setBackground(new java.awt.Color(255, 255, 255));
        jbtnAsientos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnAsientos.setForeground(new java.awt.Color(0, 51, 51));
        jbtnAsientos.setText("ASIENTO CONTABLE");
        jbtnAsientos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnAsientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAsientosActionPerformed(evt);
            }
        });

        jbtnLibroDiario.setBackground(new java.awt.Color(255, 255, 255));
        jbtnLibroDiario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnLibroDiario.setForeground(new java.awt.Color(0, 51, 51));
        jbtnLibroDiario.setText("LIBRO DIARIO");
        jbtnLibroDiario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnLibroDiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLibroDiarioActionPerformed(evt);
            }
        });

        jbtnLibroMayor.setBackground(new java.awt.Color(255, 255, 255));
        jbtnLibroMayor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnLibroMayor.setForeground(new java.awt.Color(0, 51, 51));
        jbtnLibroMayor.setText("LIBRO MAYOR");
        jbtnLibroMayor.setToolTipText("");
        jbtnLibroMayor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnLibroMayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLibroMayorActionPerformed(evt);
            }
        });

        jbtnCerrarSesion.setBackground(new java.awt.Color(24, 72, 137));
        jbtnCerrarSesion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        jbtnCerrarSesion.setText("CERRAR SESION");
        jbtnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCerrarSesionActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 51));
        jButton1.setText("ESTADOS FINANCIEROS");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jpnlMenuLayout = new javax.swing.GroupLayout(jpnlMenu);
        jpnlMenu.setLayout(jpnlMenuLayout);
        jpnlMenuLayout.setHorizontalGroup(
            jpnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbtnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnCerrarSesion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnLibroMayor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnLibroDiario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnAsientos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnEmpresas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnUsuarios, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlblNombreEmpresa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jpnlMenuLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jimgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jpnlMenuLayout.setVerticalGroup(
            jpnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlMenuLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jimgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlblNombreEmpresa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnEmpresas, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnLibroDiario, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnLibroMayor, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jpnlContenedor.setBackground(new java.awt.Color(242, 247, 251));
        jpnlContenedor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jpnlContenedor.setPreferredSize(new java.awt.Dimension(1051, 835));

        javax.swing.GroupLayout jpnlContenedorLayout = new javax.swing.GroupLayout(jpnlContenedor);
        jpnlContenedor.setLayout(jpnlContenedorLayout);
        jpnlContenedorLayout.setHorizontalGroup(
            jpnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1041, Short.MAX_VALUE)
        );
        jpnlContenedorLayout.setVerticalGroup(
            jpnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 833, Short.MAX_VALUE)
        );

        jpnlTop.setBackground(new java.awt.Color(255, 255, 255));
        jpnlTop.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jlblNombreUsuario1.setBackground(new java.awt.Color(0, 0, 51));
        jlblNombreUsuario1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlblNombreUsuario1.setForeground(new java.awt.Color(0, 102, 153));
        jlblNombreUsuario1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlblNombreUsuario1.setText("Nombre Usuario");
        jlblNombreUsuario1.setToolTipText("Editar perfil...");
        jlblNombreUsuario1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jimgUsuario.setBackground(new java.awt.Color(0, 51, 51));
        jimgUsuario.setToolTipText("Cerrar sesión...");
        jimgUsuario.setOpaque(true);

        javax.swing.GroupLayout jpnlTopLayout = new javax.swing.GroupLayout(jpnlTop);
        jpnlTop.setLayout(jpnlTopLayout);
        jpnlTopLayout.setHorizontalGroup(
            jpnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlTopLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jimgUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblNombreUsuario1)
                .addGap(17, 17, 17))
        );
        jpnlTopLayout.setVerticalGroup(
            jpnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlTopLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jlblNombreUsuario1)
                .addContainerGap(14, Short.MAX_VALUE))
            .addComponent(jimgUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnlContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 1043, Short.MAX_VALUE)
                    .addComponent(jpnlTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnlTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpnlContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnInicioActionPerformed
        // TODO add your handling code here:
        /*
        if (_visible == -1) {
            jButton1.setVisible(false);
            jPanel2.setVisible(false);    
            _visible = 1;
        } else {
            jPanel2.setVisible(true); 
            jButton1.setVisible(true);
            _visible = -1;
        }
        */
        MostrarPanel.Instancia().NuevoPanel(jpnlContenedor, new Inicio());
    }//GEN-LAST:event_jbtnInicioActionPerformed

    private void jbtnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUsuariosActionPerformed
        // TODO add your handling code here:
        MostrarPanel.Instancia().NuevoPanel(jpnlContenedor, new GestionUsuario());
    }//GEN-LAST:event_jbtnUsuariosActionPerformed

    private void jbtnEmpresasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEmpresasActionPerformed
        // TODO add your handling code here:
        GestionEmpresa frmGestionEmpresa = new GestionEmpresa();
        frmGestionEmpresa.SetFormularioPrincipal(this);
        MostrarPanel.Instancia().NuevoPanel(jpnlContenedor, frmGestionEmpresa);
    }//GEN-LAST:event_jbtnEmpresasActionPerformed

    private void jbtnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCerrarSesionActionPerformed
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(
            Principal.this,
            "¿Estás seguro de que deseas cerrar la sesión?",
            "ATENCIÓN:",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE
        );

        if (response == JOptionPane.YES_OPTION) {
            _frmLogin.setVisible(true);
            this.dispose();
        }        
    }//GEN-LAST:event_jbtnCerrarSesionActionPerformed

    private void jbtnAsientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAsientosActionPerformed
        // TODO add your handling code here:
        AsientoContable frmAsientoContable = new AsientoContable();
        frmAsientoContable.SetFormularioPrincipal(this);
        MostrarPanel.Instancia().NuevoPanel(jpnlContenedor, frmAsientoContable);
    }//GEN-LAST:event_jbtnAsientosActionPerformed

    private void jbtnLibroDiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLibroDiarioActionPerformed
        // TODO add your handling code here:
        MostrarPanel.Instancia().NuevoPanel(jpnlContenedor, new LibroDiario());
    }//GEN-LAST:event_jbtnLibroDiarioActionPerformed

    private void jbtnLibroMayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLibroMayorActionPerformed
        // TODO add your handling code here:
        LibroMayor frmLibroMayor = new LibroMayor();
        frmLibroMayor.SetFormularioPrincipal(this);
        MostrarPanel.Instancia().NuevoPanel(jpnlContenedor, frmLibroMayor);
    }//GEN-LAST:event_jbtnLibroMayorActionPerformed
  
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    
    public void SetFormularioLogin(Login frmLogin) {
        this._frmLogin = frmLogin;
    }
    
    public void SetImagLabel(JLabel lblImagen, String urlImagen) {
        ImageIcon imagen = new ImageIcon(urlImagen);
        
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_DEFAULT));
        lblImagen.setOpaque(false);
        lblImagen.setIcon(icono);
        this.repaint();
    }
    
    public void AbrirSubPanel(JPanel pnlAbrir) {
        MostrarPanel.Instancia().NuevoPanel(jpnlContenedor, pnlAbrir);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtnAsientos;
    private javax.swing.JButton jbtnCerrarSesion;
    private javax.swing.JButton jbtnEmpresas;
    private javax.swing.JButton jbtnInicio;
    private javax.swing.JButton jbtnLibroDiario;
    private javax.swing.JButton jbtnLibroMayor;
    private javax.swing.JButton jbtnUsuarios;
    private javax.swing.JLabel jimgLogo;
    private javax.swing.JLabel jimgUsuario;
    private javax.swing.JLabel jlblNombreEmpresa;
    private javax.swing.JLabel jlblNombreUsuario1;
    private javax.swing.JPanel jpnlContenedor;
    private javax.swing.JPanel jpnlMenu;
    private javax.swing.JPanel jpnlTop;
    // End of variables declaration//GEN-END:variables
}
