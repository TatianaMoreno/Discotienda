/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Discotienda;

import java.awt.Color;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tatiana Moreno
 * @author Natalia Barbosa
 */
public class DialogoVista2 extends JDialog{
    
    JPanel panel;
    JTable tablaCancion;
    
    private DefaultTableModel dtm;
    private InterfazDiscotienda ventana;
    
    public DialogoVista2(InterfazDiscotienda ventana) {
        this.ventana = ventana;
        setSize(300, 300);
        setTitle("Canciones");
        
        panel = new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder("Canciones"));
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);
        add(panel);
        
        dtm = new DefaultTableModel();
        tablaCancion = new JTable(dtm);
        
        Object[] columna = { "Titulo", "Duracion","Precio"};
        for (Object columna1 : columna) {
            dtm.addColumn(columna1);
        }        
        
        
        JScrollPane scrollPane = new JScrollPane(tablaCancion);
        scrollPane.setBounds(30, 30, 240, 50);
        panel.add(scrollPane);
    }
    
    public void actualizarTabla2() {
         List<DialogoCrearCancion> lista = this.ventana.getPanel3().getListaCancion();
         for (DialogoCrearCancion cancion : lista) {
             Object[] fila = {cancion.getTitulo(),cancion.getDuracion(),cancion.getPrecio()};
             dtm.addRow(fila);
        }
    }
}
