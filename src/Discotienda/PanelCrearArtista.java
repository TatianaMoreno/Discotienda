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
public class PanelCrearArtista extends JPanel implements ActionListener{
    
    JLabel LNombre, LGenero, LNacionalidad;
    JTextField JTNombre;
    JComboBox CMGenero, CBNacionalidad;
    JButton BGuardar;
    
    private List<DialogoCrearArtista> listaArtista;
    private DialogoCrearArtista artista;
    private InterfazDiscotienda ventana;
            
    public PanelCrearArtista(InterfazDiscotienda ventana) {
         this.ventana = ventana;
         setBorder(BorderFactory.createTitledBorder("Artista"));
         setLayout(null);
         listaArtista = new ArrayList<DialogoCrearArtista>();
         
         LNombre = new JLabel ("Nombre:*");
         LGenero = new JLabel ("Genero:*");
         LNacionalidad = new JLabel ("Nacionalidad:*");
         
         LNombre.setBounds(30, 30, 100, 20);
         add(LNombre);
         
         LGenero.setBounds(30, 60, 100, 20);
         add(LGenero);

         LNacionalidad.setBounds(30, 90, 100, 20);
         add(LNacionalidad);
         
         JTNombre = new JTextField();
         JTNombre.setBounds(140, 30, 150, 20);
         add(JTNombre);
         
         CMGenero = new JComboBox(Genero.values());
         CMGenero.setBounds(140, 60, 150, 20);
         add(CMGenero);

         CBNacionalidad = new JComboBox(Nacionalidad.values());
         CBNacionalidad.setBounds(140, 90, 150, 20);
         add(CBNacionalidad);
         
         BGuardar = new JButton("Guardar");
         BGuardar.setBounds(140, 120, 150, 20);
         BGuardar.addActionListener(this);
         add(BGuardar);
         
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      //String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
         if(validarDatosArtista()){
            artista = new DialogoCrearArtista(JTNombre.getText(), ((Genero) CMGenero.getSelectedItem()), ((Nacionalidad) CBNacionalidad.getSelectedItem()));
            listaArtista.add(artista);
            JOptionPane.showMessageDialog(this, "Artista creado.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            vaciarDatos();
            this.ventana.getPanel2().actualizarArtista(artista.getNombre());
          
       }
    }
    
    private void vaciarDatos() {
        JTNombre.setText("");
        LNombre.setForeground(Color.BLACK);
        CMGenero.setSelectedIndex(0);
        CBNacionalidad.setSelectedIndex(0);
    }
    
    private boolean validarDatosArtista() {
        if(JTNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el nombre.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            LNombre.setForeground(Color.blue);
            return false;
        } else if(CMGenero.getSelectedItem() == Genero.SELECCIONE) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un genero.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            LNombre.setForeground(Color.blue);
            return false;        
        }  else if(CBNacionalidad.getSelectedItem() == Nacionalidad.SELECCIONE) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una nacionalidad.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            LNombre.setForeground(Color.blue);
            return false;        
        }
        return true;
    }

    public List<DialogoCrearArtista> getListaArtista() {
        return listaArtista;
    }
    
    
}
