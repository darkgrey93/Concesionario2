/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Darkgrey93
 */
public class Core {
    public static BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
    Scanner entradaEscaner = new Scanner (System.in);
    public void primermenu(){
        System.out.println("Quien eres ? "
                + "cliente .1 \n"
                + "vendedor.2\n"
                + "Salir .3");
        int opcion=0;
        switch(opcion){
            case 1:
                
                break;
            case 2:
                
                break;
            case 3:
                System.out.println("terminando programa...");
                System.exit(0);
                break;
    
        }
        
    }
}
