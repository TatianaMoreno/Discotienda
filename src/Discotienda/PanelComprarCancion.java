/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Discotienda;


import java.awt.Color;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
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
 * @author Tatiana Moreno
 * @author Natalia Barbosa
 */
public class PanelComprarCancion extends JPanel implements ActionListener{
     private DialogoCompraCancion compraC;
    private DialogoCrearCancion cancion;
    private InterfazDiscotienda ventana;    
    JLabel LCancion;   
    JComboBox CBCancion;
    JButton BCOMPRAR;
    private Object dtm;
   
    
    public PanelComprarCancion (InterfazDiscotienda ventana) {
        
        this.ventana = ventana;
         setBorder(BorderFactory.createTitledBorder("cancion"));
         setLayout(null);
         
         
         LCancion = new JLabel("Cancion: ");
        
                 
        LCancion.setBounds(30, 30, 100, 20);
        add(LCancion);        
        CBCancion = new JComboBox();
        CBCancion.addItem("SELECCIONE");
        CBCancion.setBounds(140, 30, 150, 20);
        add(CBCancion);
       
       
         BCOMPRAR = new JButton("Comprar cancion");
         BCOMPRAR.setBounds(140, 150, 150, 20);
         BCOMPRAR.addActionListener(this);
         add(BCOMPRAR);
         compraC = new DialogoCompraCancion(this.ventana);
       
    }
    
    public void actualizarCancion(String tituloDisco) {
        CBCancion.addItem(tituloDisco);
    }
  
    @Override
    public void actionPerformed(ActionEvent e) {
      //String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        if(validarCompraCancion()){
          
    List<DialogoCrearCancion> lista = this.ventana.getPanel3().getListaCancion();
          for (DialogoCrearCancion cancion : lista) {
                
                if(cancion==CBCancion.getSelectedItem()  ) {
                    Object[] columna = {cancion.getTitulo(),cancion.getDuracion(),cancion.getPrecio()};
             dtm.equals(columna);
    }
            
            compraC.setVisible(true);
        }
    }
    }
    private boolean validarCompraCancion() {
        if(CBCancion.getSelectedItem() == "SELECCIONE") {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una cancion", "Mensaje", JOptionPane.ERROR_MESSAGE);
            return false;        
        }  
        return true;
    }

    }
