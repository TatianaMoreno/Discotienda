/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Discotienda;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 * 
 * @author Tatiana Moreno
 * @author Natalia Barbosa
 */
public class PanelImagen extends JPanel {
    
    private JLabel etiquetaImagen;
    private JLabel LNombre;
    private JLabel LNombre1;
    private JLabel LCodigo;
    private JLabel LCodigo1;
    
    public PanelImagen(){
        setLayout(new GridLayout(1,1));
        setBackground(Color.WHITE);
        setBorder(new LineBorder (Color.GRAY));
        ImageIcon icon = new ImageIcon("imagenes/logo.JPG");
        etiquetaImagen = new JLabel();
        etiquetaImagen.setIcon(icon);
        add(etiquetaImagen);
         LNombre = new JLabel("Astrid Barbosa");
        add(LNombre);
         LCodigo = new JLabel("Codigo:461215205");
        add(LCodigo);
        LNombre1 = new JLabel("Tatiana Moreno ");
        add(LNombre1);
        LCodigo1 = new JLabel("Codigo:461216145");
        add(LCodigo1);
      
     
    }
}
