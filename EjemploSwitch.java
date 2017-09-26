/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploswitch;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjemploSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner misc= new Scanner(System.in);
        String mes;
        String Vacaciones;
        int edad;
        
    //si pasa los ochenta años y va en invierno= vacunate contra la gripeint edad;
        
        
        System.out.println("Vas de vacaciones? ");
        Vacaciones= misc.next();
        if (Vacaciones.equals("si"))
            
          { System.out.println("Ingrese mes del año: ");
        mes= misc.next(); 
            switch(mes)
        {
            case "enero" :
            case "febrero" :
                System.out.println("Lindo veranito!!");break;
                
            case "julio" :
                System.out.println("Lindo invierno!!");break;
            default:
                System.out.println("no es verano!!");break;   
               
             }
        
            
                
            
                
        
         
        
        
        
        
    }
    
}}
