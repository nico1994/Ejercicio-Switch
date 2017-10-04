/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteracionejercicioclase;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class IteracionEjercicioClase {

    /**
     * 1 sacar cantidad de positivos
     * 2 sacar cantidad de pares
     * 3 (pido 5 nombres) sacar cantidad de Marias 
     * @param args
     */
    public static void main(String[] args) {
        /*1 sacar cantidad de positivos
        Scanner MiTeclado= new Scanner(System.in);
            String Aux;
            Integer Contador=0;
            Integer Numero;
            Integer Positivo=0;
            while (Contador<5)        
            {   Contador= Contador+1;
                System.out.println("Ingrese numero ");

                Aux= MiTeclado.next();
                Numero= Integer.parseInt(Aux);
                
                
           if (Numero>0)
           { Positivo++;
           
           }
            }
                System.out.println("La cantidad de positivos son : " +Positivo);
                
          }
        */
        /*2 sacar cantidad de positivos
        
        Scanner MiTeclado= new Scanner(System.in);
            String Aux;
            Integer Contador=0;
            Integer Numero;
            Integer Par=0;
            while (Contador<5)        
            {   Contador= Contador+1;
                System.out.println("Ingrese numero ");

                Aux= MiTeclado.next();
                Numero= Integer.parseInt(Aux);
                
                
           if (Numero%2==0)
           { Par++;
           
           }
            }
                System.out.println("La cantidad de positivos son : " +Par);
                
          }
        
        */
        /*
        Scanner MiTeclado= new Scanner(System.in);
            String Aux;
            String Nombre;
            Integer Contador=0;
            Integer Resultado=0;
            while (Contador<5)        
            {   Contador= Contador+1;
                System.out.println("Ingrese nombre : ");
                Nombre= MiTeclado.next();
                
                
           if (Nombre.equals("Maria"))
           { Resultado++;
           
           }
            }
                System.out.println("La cantidad de positivos son : " +Resultado);
                
          }
        */
        /* Cuenta Regresiva 
        Integer Contador=10;
        
        while (Contador>0)
        {
            System.out.println("Numero"+Contador);
            Contador--;
           */
        /* Cuando sabemos la cantidad
        Integer Contador=0;
        Integer Sumador=0;
        Integer Cantidad;
        Integer Promedio=0;
        Cantidad=10;
        
        
        while (Contador<Cantidad)
        {
            System.out.println("Numero "+Contador);
            Contador++;
            Sumador= Sumador+Contador;
        
            
        }
        Promedio= Sumador/Cantidad;
        System.out.println("Promedio "+Promedio);

*/
        /*
        Scanner MiTeclado= new Scanner(System.in);
        String Respuesta;
        String Aux;
        Integer Edad;
        Integer Contador=0;
        Integer Promedio;
        Integer Sumador=0;
        
        System.out.println("hay alguien para su edad ?");
        Respuesta= MiTeclado.next();
                
        while (Respuesta.equals("si"))
        { //tomo los datos
          //modificamos el while
            System.out.println("Ingrese su edad");
        Aux= MiTeclado.next();
        Edad= Integer.parseInt(Aux);
        
          Contador++;  
        Sumador= Sumador + Edad;    
         
            
        
         System.out.println("hay alguien para su edad ?");
        Respuesta= MiTeclado.next();
        }    
         Promedio=Sumador/Contador;si
                 
      System.out.println("Su promedio es "+Promedio);
        
    }}*/
        
        
    //Mostrar pares
    
    Integer Contador=0;
    
    while (Contador<100)
    {
        Contador++;
        if (Contador%2==0)
        {System.out.println("es par: "+Contador);
           
        }}
    }}
        

    
    


