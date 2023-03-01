/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Scanner;

/**
 *
 * @author JAIME BAUTISTA
 */
public class Punto5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Realizar un programa que reciba una temperatura Fahrenheit y la convierta a grados Celsius
        
         double  Fahrenheit , operacion ;
         Scanner lector = new Scanner(System.in);
         
         System.out.println("Ingrese la temperatura  Fahrenheit: ");
         Fahrenheit = lector.nextInt();
          
         operacion = (Fahrenheit-32)/1.8;
         
         System.out.println("La temperatura en grados Celsius es: "+ operacion);
   
    }
    
}
