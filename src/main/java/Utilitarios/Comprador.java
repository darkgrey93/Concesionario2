/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitarios;
/**
 * Clase con los parametros especificos del comprador
 * @author fetec
 */
public class Comprador extends Persona{
    
    private String correo;
    
    /**
     * Constructor que recibe los parametros especificos del comprador como correo.
     * 
     * @param correo  
     */
    public Comprador(String nombre, int id, String correo) {
        super(nombre, id);
        this.correo=correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}