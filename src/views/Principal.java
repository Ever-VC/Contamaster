/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import java.awt.BorderLayout;

/**
 *
 * @author ever_vc
 */
public class Principal extends javax.swing.JFrame {
    
    private static int _visible = -1;

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        Inicio panel = new Inicio();
        panel.setSize(jpnlContenedor.getWidth(), jpnlContenedor.getHeight());
        panel.setLocation(0, 0);
        jpnlContenedor.removeAll();
        jpnlContenedor.add(panel, BorderLayout.CENTER);
        jpnlContenedor.revalidate();
        jpnlContenedor.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnlFondo = new javax.swing.JPanel();
        jpnlMenu = new javax.swing.JPanel();
        jbtnInicio = new javax.swing.JButton();
        jbtnUsuarios = new javax.swing.JButton();
        jpnlContenedor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnlFondo.setBackground(new java.awt.Color(0, 153, 153));
        jpnlFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpnlMenu.setBackground(new java.awt.Color(24, 30, 54));

        jbtnInicio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnInicio.setText("INICIO");
        jbtnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnInicioActionPerformed(evt);
            }
        });

        jbtnUsuarios.setText("GESTION DE USUARIOS");
        jbtnUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUsuariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnlMenuLayout = new javax.swing.GroupLayout(jpnlMenu);
        jpnlMenu.setLayout(jpnlMenuLayout);
        jpnlMenuLayout.setHorizontalGroup(
            jpnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpnlMenuLayout.setVerticalGroup(
            jpnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlMenuLayout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(jbtnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(314, Short.MAX_VALUE))
        );

        jpnlFondo.add(jpnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 590));

        jpnlContenedor.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpnlContenedorLayout = new javax.swing.GroupLayout(jpnlContenedor);
        jpnlContenedor.setLayout(jpnlContenedorLayout);
        jpnlContenedorLayout.setHorizontalGroup(
            jpnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );
        jpnlContenedorLayout.setVerticalGroup(
            jpnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );

        jpnlFondo.add(jpnlContenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 790, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        Inicio panel = new Inicio();
        panel.setSize(jpnlContenedor.getWidth(), jpnlContenedor.getHeight());
        panel.setLocation(0, 0);
        jpnlContenedor.removeAll();
        jpnlContenedor.add(panel, BorderLayout.CENTER);
        jpnlContenedor.revalidate();
        jpnlContenedor.repaint();
    }//GEN-LAST:event_jbtnInicioActionPerformed

    private void jbtnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUsuariosActionPerformed
        // TODO add your handling code here:
        GestionUsuario panel = new GestionUsuario();
        panel.setSize(jpnlContenedor.getWidth(), jpnlContenedor.getHeight());
        panel.setLocation(0, 0);
        jpnlContenedor.removeAll();
        jpnlContenedor.add(panel, BorderLayout.CENTER);
        jpnlContenedor.revalidate();
        jpnlContenedor.repaint();
    }//GEN-LAST:event_jbtnUsuariosActionPerformed

    public void CargarUsuario(int idUsuario) {
        //Carga la información del usuario logueado
    }
    
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnInicio;
    private javax.swing.JButton jbtnUsuarios;
    private javax.swing.JPanel jpnlContenedor;
    private javax.swing.JPanel jpnlFondo;
    private javax.swing.JPanel jpnlMenu;
    // End of variables declaration//GEN-END:variables
}
