/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Discotienda;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Tatiana Moreno
 * @author Natalia Barbosa
 */
public class PanelGeneral extends JPanel implements ActionListener{
  
    JButton BVista;
    JButton BVista1;
    JButton BVista3;
    private static final String BTN_ARTISTA = "ARTISTA";
    private static final String BTN_DISCO = "DISCO";
    private static final String BTN_CANCION = "CANCION";
   
    private DialogoVista2 dialog2;
    private DialogoVista1 dialog1;
    private DialogoVista dialog;
    private InterfazDiscotienda ventana;
    
    public PanelGeneral(InterfazDiscotienda ventana) {
         this.ventana = ventana;
         setBorder(BorderFactory.createTitledBorder("General"));
         setLayout(null);
          
     
         BVista = new JButton("Ver Artista");
         BVista.setFont(new Font("Serif", Font.BOLD, 18));
         BVista.setActionCommand(BTN_ARTISTA );
         BVista.addActionListener(this);
         BVista.setBounds(30, 20, 150, 20);
         add(BVista);         
         dialog = new DialogoVista(this.ventana);
     
         
         BVista1 = new JButton("Ver Disco");
         BVista1.setFont(new Font("Serif", Font.BOLD, 18));
         BVista.setActionCommand(BTN_DISCO );
         BVista1.addActionListener(this);
         BVista1.setBounds(190, 20, 150, 20);
         add(BVista1);
         dialog1 = new DialogoVista1(this.ventana);
         
         BVista3 = new JButton("Ver Cancion");
         BVista3.setFont(new Font("Serif", Font.BOLD, 18));
         BVista.setActionCommand(BTN_CANCION );
         BVista3.addActionListener(this);
         BVista3.setBounds(350, 20, 150, 20);
         add(BVista3);
         
         dialog2 = new DialogoVista2(this.ventana);
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
                 dialog.actualizarTabla();
                 dialog1.actualizarTabla1();
                 dialog2.actualizarTabla2();
                 dialog.setVisible(true);
                 dialog1.setVisible(true);
                 dialog2.setVisible(true);
    
            }
        }
    

