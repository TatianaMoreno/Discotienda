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
public class PanelCrearCancion extends JPanel implements ActionListener{
      
    private DialogoCrearCancion cancion;
    private InterfazDiscotienda ventana;    
    JLabel LDisco,LArtista,LTitulo,LPrecio,LDuracion;
    JTextField JTTitulo,JTPrecio,JTDuracion;
    JComboBox CBDisco;
    JComboBox CBArtista;
    JButton BGuardar;
    private List<DialogoCrearCancion> listaCancion;
 
    
    public PanelCrearCancion(InterfazDiscotienda ventana) {
        
        this.ventana = ventana;
         setBorder(BorderFactory.createTitledBorder("Cancion"));
         setLayout(null);
         listaCancion = new ArrayList<DialogoCrearCancion>();
         
         LDisco = new JLabel("Disco: ");
         LArtista = new JLabel("Artista: ");
         LTitulo = new JLabel ("Titulo:*");
         LPrecio = new JLabel ("Precio:*");
         LDuracion = new JLabel ("Duracion:*");
                 
        LDisco.setBounds(30, 10, 100, 20);
        add(LDisco);        
        CBDisco = new JComboBox();
        CBDisco.addItem("SELECCIONE");
        CBDisco.setBounds(140, 10, 150, 20);
        add(CBDisco);
        
        LArtista.setBounds(30, 40, 100, 20);
        add(LArtista);        
        CBArtista = new JComboBox();
        CBArtista.addItem("SELECCIONE");
        CBArtista.setBounds(140, 40, 150, 20);
        add(CBArtista);
        
        LTitulo.setBounds(30, 70, 100, 20);
        add(LTitulo);        
        JTTitulo = new JTextField();
        JTTitulo.setBounds(140, 70, 150, 20);
         add(JTTitulo);
         
        LPrecio.setBounds(30, 100, 100, 20);
        add(LPrecio);
        JTPrecio = new JTextField();
        JTPrecio.setBounds(140, 100, 150, 20);
        add(JTPrecio);
         
         LDuracion.setBounds(30, 130, 100, 20);
        add(LDuracion);
        JTDuracion = new JTextField();
        JTDuracion.setBounds(140, 130, 150, 20);
         add(JTDuracion);
       
         BGuardar = new JButton("Guardar");
         BGuardar.setBounds(140, 160, 150, 20);
         BGuardar.addActionListener(this);
         add(BGuardar);
    }
    
    public void actualizarDisco(String tituloDisco) {
        CBDisco.addItem(tituloDisco);
    }
  
    public void actionPerformed(ActionEvent e) {
            if(validarDatosDisco()){
            cancion = new DialogoCrearCancion(JTTitulo.getText(),JTDuracion.getText(),JTPrecio.getText() );
            listaCancion.add( cancion );
            JOptionPane.showMessageDialog(this, "Cancion guardada con exito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            vaciarDatos();
            this.ventana.getPanel2().actualizarArtista(cancion.getTitulo());
            this.ventana.getPanel3().actualizarDisco(cancion.getTitulo());
            this.ventana.getPanel5().actualizarCancion(cancion.getTitulo());
       }
    }
    
    private void vaciarDatos() {
        
        JTTitulo.setText("");
        JTDuracion.setText("");
        JTPrecio.setText("");
        LTitulo.setForeground(Color.BLACK);
        LDuracion.setForeground(Color.BLACK);
        LPrecio.setForeground(Color.BLACK);
       
    }
    
    private boolean validarDatosDisco() {
        if(JTTitulo.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el titulo.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            LTitulo.setForeground(Color.magenta);
            return false;}
         else    if(JTPrecio.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el precio.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            LPrecio.setForeground(Color.magenta);
            return false;   
        } else if(JTDuracion.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe ingresar la duracion.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            LDuracion.setForeground(Color.magenta);
            return false;  
        }
        
        return true;
    }
       public List<DialogoCrearCancion> getListaCancion() {
        return listaCancion;
    }
    
    

}
