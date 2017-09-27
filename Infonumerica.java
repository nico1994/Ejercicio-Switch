/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infonumerica;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Infonumerica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Se brinda informacion sobre un numero ingresado.
        // modulo %
        Scanner miTeclado= new Scanner(System.in);
        /*
        Integer NumeroUno;
        Integer NumeroDos;
        Integer Resultado;
        NumeroUno=2;
        NumeroDos=10;
         Resultado= 2%10;
        System.out.println("el resultado es"+Resultado);
        Resultado= 11%3;
        System.out.println("el resultado es"+Resultado);
        
        */
        String Aux;
        Integer NumeroIngresado;
        System.out.println("Ingrese un numero: ");
        Aux= miTeclado.next();
        NumeroIngresado= Integer.parseInt(Aux);
        // 1- Informar si el numero es mayor o menor a 100
        // 2- Decir si es positivo o negativo
        // 3 - Informar si es par
        
        if(NumeroIngresado<100)
        {System.out.println("Es menor que 100");}
        
        else
        {System.out.println("Es mayor que 100");}
        //positivo o negativo
        if (NumeroIngresado<0)
        {System.out.println("Es negativo");}
        if (NumeroIngresado>0)
        {System.out.println("Es positivo");}
        if (NumeroIngresado==0)
        {System.out.println("Es nulo");}
        // if (NumeroIngresado !=0)
        // if (NumeroIngresado>0)
        // else (NumeroIngresado<0)
        //par o impar
        if (NumeroIngresado%2==0)
        {System.out.println("Es par");}
        else 
        {System.out.println("Es impar");}
        }   }
        
       
        
        
        
        
    
    
    
    

