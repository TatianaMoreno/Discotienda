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
public class DialogoVista1 extends JDialog{
    
    JPanel panel;
    JTable tablaDisco;
    
    private DefaultTableModel dtm;
    private InterfazDiscotienda ventana;
    
    public DialogoVista1(InterfazDiscotienda ventana) {
        this.ventana = ventana;
        setSize(300, 300);
        setTitle("Discos");
        
        panel = new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder("Discos"));
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);
        add(panel);
        
        dtm = new DefaultTableModel();
        tablaDisco = new JTable(dtm);
        
        Object[] columna = {"Titulo", "Imagen","Precio","Descripcion"};
        for (Object columna1 : columna) {
            dtm.addColumn(columna1);
        }        
        
        
        JScrollPane scrollPane = new JScrollPane(tablaDisco);
        scrollPane.setBounds(30, 30, 240, 50);
        panel.add(scrollPane);
    }
    
    public void actualizarTabla1() {
         List<DialogoCrearDisco> lista = this.ventana.getPanel2().getListaDisco();
         for (DialogoCrearDisco disco : lista) {
             Object[] fila = {disco.getTitulo(), disco.getImagen(),disco.getPrecio(),disco.getDescripcion()};
             dtm.addRow(fila);
        }
    }
}
