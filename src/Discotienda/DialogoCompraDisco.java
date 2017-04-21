/*
 * To change this template, choose Tools | Templates
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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Tatiana Moreno
 * @author Natalia Barbosa
 */
public class DialogoCompraDisco extends JDialog{
    JPanel panel;
    JComboBox CBCancion;
    JTable tablaCompraDisco;
   
    private InterfazDiscotienda ventana;
    private final DefaultTableModel dtm;
    public DialogoCompraDisco(InterfazDiscotienda ventana) {
        this.ventana = ventana;
        setSize(300, 300);
        setTitle("Factura");
        
        panel = new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder("Factura Disco"));
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);
        add(panel);
         dtm = new DefaultTableModel();
        tablaCompraDisco = new JTable(dtm);
        
        Object[] fila = {"Titulo", "Descripcion","Imagen", "Precio"};
        for (Object fila1 : fila) {
            dtm.addColumn(fila1);
        }             
        
        JScrollPane scrollPane = new JScrollPane(tablaCompraDisco);
        scrollPane.setBounds(30, 30, 240, 50);
        panel.add(scrollPane);
        tablaCompraDisco = new JTable(dtm);
        
    }
       
    
}
