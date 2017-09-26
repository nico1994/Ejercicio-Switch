/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switch2;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Switch2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner misc= new Scanner(System.in);
        Integer MesDelAño;
        String datoAux;
        //leemos la variable .next()
        //parseamos la variable
        System.out.println("Mes del año");
        datoAux= misc.next();
        MesDelAño= Integer.parseInt(datoAux);
        
        switch (MesDelAño)
        { case 1 :
             System.out.println("Es verano");
        
           
        }       
        
    }
    
}
