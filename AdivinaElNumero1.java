/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinaelnumero;

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
          Scanner Misc= new Scanner(System.in);
        //defino variables
        String datoAux;
        Integer numero;
        
        //Creo un random de 0 al 10
        Integer numeroAleatorio = (int) (Math.random()*10) + 1;
         
        System.out.println("el numero es " +numeroAleatorio);
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
        
        //FORMA 1 CON MATH.ABS (SIEMPRE DA UN NUM POSITIVO)
         
         Integer Diferencia;
         Diferencia= numero-numeroAleatorio;
         Diferencia= Math.abs(Diferencia);
         
         switch(Diferencia)
         {case 1: {System.out.println("Casi");break;}
          case 2:{System.out.println("Cerca");break;}
          case 3:  {System.out.println("Ni cerca");break;}       
          case 4: {System.out.println("Bien lejos");break;}
          default: {System.out.println("Sos horrible en este juego");break;} }
         
         }//del els if (numeroAleatorio == numero)
         
        
         //forma 2 
         /*Integer resultado;
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
         {System.out.println("Sos horrible en este juego");break;
         
         
         
         */
        
        
        
        
      
        
        }
    }
    

