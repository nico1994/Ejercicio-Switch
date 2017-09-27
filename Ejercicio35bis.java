/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio35bis;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio35bis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner misc= new Scanner(System.in);
    String dato;
    String marca;
    Integer precio=35;
    Integer cantidad;
    Integer preciobruto;
    Double preciofinal= (double)0;
    
    System.out.println("Ingrese marca:");
    marca= misc.next();
    
    
    System.out.println("Ingrese cantidad:");
    dato= misc.next();
    cantidad= Integer.parseInt(dato);
    
    preciobruto= cantidad*precio;
    
    if (cantidad>5)
    {  
      preciofinal= preciobruto*0.5;}  
    else
    { if (cantidad == 5)
    { if (marca.equals("ArgentinaLuz"))
    { preciofinal=preciobruto*0.6;
    
    } 
    else
        preciofinal= preciobruto*0.7;
    }
    else
    {//todos mlos menos a 5
    if (cantidad ==4)
    { if (marca.equals("ArgentinaLuz")) || marca.equals("ArgentinaLuz"))
    
    preciofinal=preciobruto*0.75;
    }
    else
      preciofinal=preciobruto0.80;
        
    } 
    
    }
        
       
    
    
    
    
    
    
    
    
    
    
    
    System.out.println("Debe pagar "+preciofinal);
        
    }
    
}
