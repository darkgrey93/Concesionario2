/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Utilitarios.Deportivos;
import Utilitarios.Estandar;
import Utilitarios.Maquinaria;
import Utilitarios.Persona;
import Utilitarios.Personalizado;
import Utilitarios.Vehiculo;
import Utilitarios.Vendedor;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Darkgrey93
 */
public class Core {
    public static BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
    Scanner entradaEscaner = new Scanner (System.in);
    
    List <Persona> personas=new ArrayList<>();
     Vendedor vendedor1=new Vendedor("Carlos",1,0);
    
    Deportivos deportivo1=new Deportivos(true,true,"Mercedez","2019","Gris",5);
    Estandar estandar1=new Estandar("Toyota","2020","Azul",5);
    Personalizado personalizado1=new Personalizado(true,true,"Misubitshi","2015","Rojo",5);
    Maquinaria maquinaria1=new Maquinaria(true,true,"CAT","2005","Amarillo",5);
    
    List <Vehiculo> inventario=new ArrayList<>();
    
    public void primerMenu(){
        inventario.add(deportivo1);
        inventario.add(estandar1);
        inventario.add(personalizado1);
        inventario.add(maquinaria1);
        
        System.out.println("1. Vender \n"
                + "2. Ver Inventario \n"
                + "3. Ver Ventas \n"
                + "Salir .3");
        int opcion=0;
        switch(opcion){
            case 1:
                vender();
                break;
            case 2:
                verInventario();
                break;
            case 3:
                System.out.println("terminando programa...");
                System.exit(0);
                break;
    
        }
        
    }
    /**
     * Imprime todos los vehiculos en la lista
     * 
     */
    public void verInventario(){
        for(int i = 0;i<inventario.size();i++){
            System.out.println(inventario.get(i).getMarca()+" "+inventario.get(i).getModelo()+" cantidad: "+inventario.get(i).getCantidad());
        }
    }
    
    public void vender(){
        
    }

}
