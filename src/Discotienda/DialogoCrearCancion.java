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
public class DialogoCrearCancion {

    
    private String titulo;
    private String duracion;
    private String precio;

    public DialogoCrearCancion(String titulo, String duracion,String precio) {
       
        this.titulo = titulo;
        this.duracion = duracion;
        this.precio = precio;
    }

    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    
  
     
}
