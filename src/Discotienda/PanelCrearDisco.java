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
 * @author Tatiana Moreno
 * @author Natalia Barbosa
 */
public class PanelCrearDisco extends JPanel implements ActionListener{
    
    JLabel LArtista,LTituloC,LPrecio,LDescripcion,LImagen;
    JTextField JTTituloC,JTPrecio,JTDescripcion,JTImagen;
    JComboBox CBArtista;
    private InterfazDiscotienda ventana;
    JButton BGuardar;
    private List<DialogoCrearDisco> listaDisco;
    private DialogoCrearDisco disco;

    
    public PanelCrearDisco(InterfazDiscotienda ventana) {
        this.ventana = ventana;
         setBorder(BorderFactory.createTitledBorder("Disco"));
         setLayout(null);
         listaDisco = new ArrayList<DialogoCrearDisco>();
         
         LArtista = new JLabel("Artista: ");
         LTituloC = new JLabel ("Titulo:*");
         LPrecio = new JLabel ("Precio:*");
         LDescripcion = new JLabel ("Descripcion:*");
         LImagen = new JLabel ("Imagen:*");
         
        LArtista.setBounds(30, 30, 100, 20);
        add(LArtista);        
        CBArtista = new JComboBox();
        CBArtista.addItem("SELECCIONE");
        CBArtista.setBounds(140, 30, 150, 20);
        add(CBArtista);
        
        LTituloC.setBounds(30, 60, 100, 20);
        add(LTituloC);        
        JTTituloC = new JTextField();
        JTTituloC.setBounds(140, 60, 150, 20);
         add(JTTituloC);
         
        LPrecio.setBounds(30, 90, 100, 20);
        add(LPrecio);
        JTPrecio = new JTextField();
        JTPrecio.setBounds(140, 90, 150, 20);
        add(JTPrecio);
         
         LDescripcion.setBounds(30, 120, 100, 20);
        add(LDescripcion);
        JTDescripcion = new JTextField();
        JTDescripcion.setBounds(140, 120, 150, 20);
         add(JTDescripcion);
         
         LImagen.setBounds(30, 150, 100, 20);
         add(LImagen);  
         JTImagen = new JTextField();
         JTImagen.setBounds(140, 150, 150, 20);
         add(JTImagen);
         
         BGuardar = new JButton("Guardar");
         BGuardar.setBounds(140, 180, 150, 20);
         BGuardar.addActionListener(this);
         add(BGuardar);
    }
    
    public void actualizarArtista(String nombreArtista) {
        CBArtista.addItem(nombreArtista);
    }
  
    public void actionPerformed(ActionEvent e) {
      //String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
         if(validarDatosDisco()){
            disco = new DialogoCrearDisco(JTTituloC.getText(),JTDescripcion.getText(), JTImagen.getText(),JTPrecio.getText() );
            listaDisco.add(disco );
            JOptionPane.showMessageDialog(this, "Disco creado con exito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            vaciarDatos();
            this.ventana.getPanel2().actualizarArtista(disco.getTitulo());
            this.ventana.getPanel3().actualizarDisco(disco.getTitulo());
            this.ventana.getPanel6().actualizarDisco(disco.getTitulo());
         }
    }
    
    private void vaciarDatos() {
        JTTituloC.setText("");
        JTDescripcion.setText("");
        JTImagen.setText("");
        JTPrecio.setText("");
        LTituloC.setForeground(Color.BLACK);
        LImagen.setForeground(Color.BLACK);
        LDescripcion.setForeground(Color.BLACK);
        LPrecio.setForeground(Color.BLACK);
       
    }
    
    private boolean validarDatosDisco() {
        if(CBArtista.getSelectedItem() == "SELECCIONE") {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un artista.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            LArtista.setForeground(Color.red);
            return false; 
        
        } else if(JTTituloC.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el titulo.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            LTituloC.setForeground(Color.red);
            return false; 
        } else    if(JTPrecio.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el precio.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            LPrecio.setForeground(Color.red);
            return false;   
        }  else if(JTDescripcion.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe ingresar la descripcon del disco.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            LTituloC.setForeground(Color.red);
            return false;   
        } 
         else if(JTPrecio.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el la imagen.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            LTituloC.setForeground(Color.red);
            return false;   
        }
        return true;
    }
       public List<DialogoCrearDisco> getListaDisco() {
        return listaDisco;
    }
    
    

}
