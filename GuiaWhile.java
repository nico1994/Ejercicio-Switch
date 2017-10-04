/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteraciones;

import java.util.Scanner;

/**
 * 
 * 
 */
public class GuiaWhile {
    
public static void SacarCantidadDeMayores()
        {
         /*
         pedir 5 edades e informar cuántos mayores a 18 hay   
         */
            Scanner MiTeclado= new Scanner(System.in);
            String Aux;
            Integer Contador=0;
            Integer Edad;
            Integer Mayores=0;
            while (Contador<5)        
            {   Contador= Contador+1;
                System.out.println("Ingrese edad: ");

                Aux= MiTeclado.next();
                Edad= Integer.parseInt(Aux);
                
               
           if (Edad>17)
           { Mayores++;
           
           }
            }
                System.out.println("La cantidad de mayores es : " +Mayores);
                
          }}
                
                
                  
            
            
            
        
    

