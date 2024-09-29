/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author ever_vc
 */
public class MostrarPanel {
    
    private static MostrarPanel _instancia;
    
    public static MostrarPanel Instancia() {
        if (_instancia == null) {
            _instancia = new MostrarPanel();
        }
        return _instancia;
    }
    
    public void NuevoPanel(JPanel jpnlContenedor, JPanel nuevoPanel) {
        nuevoPanel.setSize(jpnlContenedor.getWidth(), jpnlContenedor.getHeight());
        nuevoPanel.setLocation(0, 0);
        jpnlContenedor.removeAll();
        jpnlContenedor.add(nuevoPanel, BorderLayout.CENTER);
        jpnlContenedor.revalidate();
        jpnlContenedor.repaint();
    }
    
}
