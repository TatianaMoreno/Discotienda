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
public class DialogoCompraCancion extends JDialog{
    JPanel panel;
    JComboBox CBCancion;
    JTable tablaCompraCancion;
   
    private InterfazDiscotienda ventana;
    private final DefaultTableModel dtm;
    public DialogoCompraCancion(InterfazDiscotienda ventana) {
        this.ventana = ventana;
        setSize(300, 300);
        setTitle("Factura");
        
        panel = new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder("Factura Cancion"));
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);
        add(panel);
         dtm = new DefaultTableModel();
        tablaCompraCancion = new JTable(dtm);
        
        Object[] fila = {"Titulo", "Duracion", "Precio"};
        for (Object fila1 : fila) {
            dtm.addColumn(fila1);
        }             
        
        JScrollPane scrollPane = new JScrollPane(tablaCompraCancion);
        scrollPane.setBounds(30, 30, 240, 50);
        panel.add(scrollPane);
        tablaCompraCancion = new JTable(dtm);
        
    }
         
         
   
}
