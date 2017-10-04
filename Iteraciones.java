/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteraciones;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Iteraciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
        -diferencia entre if and while
        Integer edad=18;
        
        while(edad<17)
        {System.out.println("Hola es menor ");
        }
         while(edad>17)
        {System.out.println("Hola es mayor ");
        }
    }
    */
        GuiaWhile.SacarCantidadDeMayores();
       
        String aux;
        Integer Contador=0; 
        Integer Edad;
        Scanner misc=new Scanner(System.in);
        Integer Sumador=0;
        Integer Promedio;
        
        while(Contador<3)
        {
          
           System.out.println("Ingrese su edad :  ");
           aux=misc.next();
           Edad= Integer.parseInt(aux);
           Sumador= Sumador + Edad;
           Contador=Contador+1;
          
        }
        Promedio= Sumador/3;
        System.out.println("el promedio es:  "+Promedio);
}}
