/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinaelnumero;

import java.util.Scanner;

/**
 *
 * @author Sofia
 */
public class AdivinaElNumero {

    /**
     * @param args the command line arguments
     * A) Si le erro por 1 mostrar "Casi Casi"
     * B) Si le erro por 2 mostrar "Cerca"
     * C)Si le erro por 3 mostrar "Ni cerca"
     * D)Si le erro por cuatro puntos mostrar "Bien lejos"
     * Para todos los demás mostrar "Sos horrible en este juego"
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Misc= new Scanner(System.in);
        //defino variables
        String datoAux;
        Integer numero;
        
        //Creo un random de 0 al 10
        Integer numeroAleatorio = (int) (Math.random()*10) + 1;
        Integer resultado;  
        System.out.println("Ingrese un número: ");
        datoAux= Misc.next();
        numero= Integer.parseInt(datoAux);
        
        if (numeroAleatorio == numero)
        { System.out.println("Ganaste");}  
        else 
        {if (numeroAleatorio>numero)
                System.out.println("Te faltó");
         else
          
                 System.out.println("Te pasaste");
        
        resultado = (numeroAleatorio - numero);
        switch (resultado) 
        {case 1:
         case -1:
         {System.out.println("Casi Casi");break;}
         case 2:
         case -2:
         {System.out.println("Cerca");break;}
         case 3:
         case -3:
         {System.out.println("Ni cerca");break;}
         case 4:
         case -4:
         {System.out.println("Bien lejos");break;}
         default:
         {System.out.println("Sos horrible en este juego");break;}}
        System.out.println("el numero es " +numeroAleatorio);
        }
   
    
    
    
    
    }}  
        
        
        
            
             
        
        
        
        
        
        
        
    

    

