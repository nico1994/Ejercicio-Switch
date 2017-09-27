/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio35;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio35 {

    /**
     * @param args the command line arguments
     * 35- Las lámparas están al mismo precio de $35 pesos final. 
A. Si compra 6 o más lamparitas bajo consumo tiene un descuento del 50%. 
B. Si compra 5 lamparitas bajo consumo marca "ArgentinaLuz" se hace un descuento
* del 40 % y si es de otra marca el descuento es del 30%. 
C. Si compra 4 lamparitas bajo consumo marca "ArgentinaLuz" o “FelipeLamparas” 
* se hace un descuento del 25 % y si es de otra marca el descuento es del 20%. 
D. Si compra 3 lamparitas bajo consumo marca "ArgentinaLuz" el descuento es del 
* 15%, si es “FelipeLamparas” se hace un descuento del 10 % y si es de otra 
* marca un 5%. 

     * 
     */
    public static void main(String[] args) {
    Scanner misc= new Scanner(System.in);
    String dato;
    String marca;
    Integer precio=35;
    Integer cantidad;
    Integer descuento;
    
    
    System.out.println("¿Cuantas lamparitas va a comprar?");
    dato= misc.next();
    cantidad= Integer.parseInt(dato);
    
    if (cantidad>=6)
    { System.out.println("Tiene un descuento del "+((cantidad*precio)*0.50) );
    }   
    else 
    {
    switch (cantidad)
    {
        case 1:  
    
    
    }   
        
    
    
    }    
    
     
     
   
        
        
        
        
    }
    
}
