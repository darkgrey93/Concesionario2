/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitarios;



/**
 *
 * @author fetec
 */
public class Personalizado extends Vehiculo{
    
    private boolean aleron;
    private boolean nitro;

    public Personalizado(boolean aleron, boolean nitro, StringBuffer marca, StringBuffer modelo, StringBuffer color, int cantidad) {
        super(marca, modelo, color, cantidad);
        this.aleron = aleron;
        this.nitro = nitro;
    }
    
    @Override
    public void verDetalle() {
        System.out.println("tiene aleron?"+aleron+"\ntiene nitro? " +nitro+"\n"+getColor()+"\n"+getMarca()+"\n"+getModelo()+"\n"+getCantidad());
    }

    public boolean isAleron() {
        return aleron;
    }

    public void setAleron(boolean aleron) {
        this.aleron = aleron;
    }

    public boolean isNitro() {
        return nitro;
    }

    public void setNitro(boolean nitro) {
        this.nitro = nitro;
    }
    
    
    
}
