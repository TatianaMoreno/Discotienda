/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Discotienda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Tatiana Moreno
 * @author Natalia Barbosa
 */
public class InterfazDiscotienda extends JFrame{
    
    private PanelCrearArtista panel1;
    private PanelCrearDisco panel2;
    private PanelCrearCancion panel3;
    private PanelGeneral panel4;
     private PanelImagen panelImagen;
      private PanelComprarCancion panel5;
        private PanelComprarDisco panel6;
        
    public InterfazDiscotienda() {
        setSize(1000,720);
        setTitle("PROGRAMACION II");
        setLocation(200, 100);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        
        
        panel1 = new PanelCrearArtista(this);
        panel1.setBounds(10, 140, 300, 145);
        add(panel1);
        
        panel2 = new PanelCrearDisco(this);
        panel2.setBounds(10, 285, 300, 219);
        add(panel2);
        
        panel3 = new PanelCrearCancion(this);
        panel3.setBounds(10, 500, 300, 190);
        add(panel3);
        
        panel4 = new PanelGeneral(this);
        panel4.setBounds(320, 140, 600,50);
        add(panel4);
        
        panelImagen = new PanelImagen( );
        panelImagen.setBounds(0, 0,1000,130);
        add(panelImagen);
       
        panel5 = new PanelComprarCancion(this);
        panel5.setBounds(320, 285, 300, 219);
        add(panel5);
        
        panel6 = new PanelComprarDisco(this);
        panel6.setBounds(620, 285, 300, 219);
        add(panel6);
        
        setVisible(true);
    }

    public PanelCrearArtista getPanel1() {
        return panel1;
    }

    public PanelCrearDisco getPanel2() {
        return panel2;
    }

    public PanelCrearCancion getPanel3() {
        return panel3;
    }
    
     public PanelGeneral getPanel4() {
        return panel4;
    }
      public PanelComprarCancion getPanel5() {
        return panel5;
    }
   public PanelComprarDisco getPanel6() {
        return panel6;
    }
}
