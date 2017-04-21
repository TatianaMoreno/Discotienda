/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Discotienda;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 *@author Tatiana Moreno
 * @author Natalia Barbosa
 */
public class PanelComprarDisco extends JPanel implements ActionListener{
    private DialogoCompraDisco compraD;
    private DialogoCrearDisco disco;
    private InterfazDiscotienda ventana;    
    JLabel LDisco;   
    JComboBox CBDisco;
    JButton BCOMPRAR;
    private Object dtm;
   
 
    
    public PanelComprarDisco (InterfazDiscotienda ventana) {
        
        this.ventana = ventana;
         setBorder(BorderFactory.createTitledBorder("disco"));
         setLayout(null);
       
         
         LDisco = new JLabel("Disco: ");
        
                 
        LDisco.setBounds(30, 30, 100, 20);
        add(LDisco);        
        CBDisco = new JComboBox();
        CBDisco.addItem("SELECCIONE");
        CBDisco.setBounds(140, 30, 150, 20);
        add(CBDisco);
       
       
         BCOMPRAR = new JButton("Comprar disco");
         BCOMPRAR.setBounds(140, 150, 150, 20);
         BCOMPRAR.addActionListener(this);
         add(BCOMPRAR);
         compraD = new DialogoCompraDisco(this.ventana);
    }
    
    public void actualizarDisco(String tituloDisco) {
        CBDisco.addItem(tituloDisco);
    }
  
    public void actionPerformed(ActionEvent e) {
      //String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        if(validarCompraDisco()){
          
    List<DialogoCrearCancion> lista = this.ventana.getPanel3().getListaCancion();
          for (DialogoCrearCancion cancion : lista) {
                
                if(cancion==CBDisco.getSelectedItem()  ) {
                    Object[] columna = {cancion.getTitulo(),cancion.getDuracion(),cancion.getPrecio()};
             dtm.equals(columna);
    }
            
            compraD.setVisible(true);
        }
    }
            
       }
    private boolean validarCompraDisco() {
        if(CBDisco.getSelectedItem() == "SELECCIONE") {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una cancion", "Mensaje", JOptionPane.ERROR_MESSAGE);
            return false;        
        }  
        return true;
    }
      }
