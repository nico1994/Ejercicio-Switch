/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinaelnumero;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class AdivinaElNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner misc= new Scanner(System.in);
        Integer numero;
        Integer numeroIngresado;
        String datoAux;
        Integer miRandom= (int) (Math.random()*10 )+1;
        
        System.out.println("numero secreto " +miRandom);
        
        System.out.println("Ingrese el numero: ");
        datoAux= misc.next();
        numeroIngresado= Integer.parseInt(datoAux);
        
        if (numeroIngresado== miRandom)
        {
            System.out.println("Ganó");}
        
        else 
        {if (numeroIngresado>miRandom)
                System.out.println("Te pasaste");
        else 
                System.out.println("Te faltó");
            
            }}
      
           
                
        
        
    }
    

