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
public class DialogoVista extends JDialog{
    
    JPanel panel;
    JTable tablaArtista;
    
    
    private DefaultTableModel dtm;
    private InterfazDiscotienda ventana;
    public DialogoVista(InterfazDiscotienda ventana) {
        this.ventana = ventana;
        setSize(300, 300);
        setTitle("Artista");
        
        panel = new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder("Artista"));
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);
        add(panel);
        
        dtm = new DefaultTableModel();
        tablaArtista = new JTable(dtm);
        
        Object[] columna = {"Nombre", "Genero", "Nacionalidad"};
        for (Object columna1 : columna) {
            dtm.addColumn(columna1);
        }             
        
        JScrollPane scrollPane = new JScrollPane(tablaArtista);
        scrollPane.setBounds(30, 30, 240, 50);
        panel.add(scrollPane);
        tablaArtista = new JTable(dtm);
        
    }
    
    public void actualizarTabla() {
         List<DialogoCrearArtista> lista = this.ventana.getPanel1().getListaArtista();
         for (DialogoCrearArtista artista : lista) {
             Object[] fila = {artista.getNombre(), artista.getGenero().toString(), artista.getNacionalidad().toString()};
             dtm.addRow(fila);
        }
    }
    
}
