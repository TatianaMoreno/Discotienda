/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Discotienda;

/**
 *
 * @author Tatiana Moreno
 * @author Natalia Barbosa
 */
public class DialogoCrearDisco {

    
    private String tituloC;
    private String descripcion;
    private String imagen;
    private String precio;

    public DialogoCrearDisco(String titulo, String descripcion, String imagen, String precio) {
        
        this.tituloC = titulo;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.precio = precio;
    }

   
    

    public String getTitulo() {
        return tituloC;
    }

    public void setTitulo(String tituloC) {
        this.tituloC = tituloC;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    
  
     
}
