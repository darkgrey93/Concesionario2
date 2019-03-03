/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitarios;
import Interfaces.Informacion;

/**
 * Clase padre que contiene la informacion que comparten todos los vehiculos
 * @author fetec
 */
public abstract class Vehiculo implements Informacion{
    
    private String marca;
    private String modelo;
    private String color;
    private int cantidad;

    public Vehiculo(String marca, String modelo, String color, int cantidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.cantidad = cantidad;
    }

        
    public void verCantidad(){
        
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
    
    
}
