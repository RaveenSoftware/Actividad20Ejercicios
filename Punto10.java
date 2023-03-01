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
public class Punto10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Un alumno desea saber cual será su calificación final en la materia de Algoritmos. Dicha calificación se compone de los siguientes porcentajes:
        //55% del promedio de sus tres calificaciones parciales.
        //30% de la calificación del examen final.
        //15% de la calificación de un trabajo final.
        
        
        String nombre;
        Double a,b,c, parciales, notaExa, examen, caliFinal, nfinal;
        
                
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        nombre = lector.nextLine();
        System.out.println("Hola " + nombre);
        
        System.out.println("Ingrese las calificaciones: ");
        System.out.println("Calificacion 1");
        a = lector.nextDouble();
        System.out.println("Calificacion 2");
        b = lector.nextDouble();
        System.out.println("Calificacion 3");
        c = lector.nextDouble();
        
        parciales = (a+b+c)/3*0.55;
        
        System.out.println("Promedio de sus tres calificaciones parciales");
        System.out.println(parciales);
        
        System.out.println("___________________________________");
        
        System.out.println("Ingrese la calificacion del examen:");
        examen = lector.nextDouble();
        
        notaExa = examen*0.30;
        System.out.println(notaExa);
        
        System.out.println("___________________________________");
        
        System.out.println("Ingrese la nota trabajo final: ");
        caliFinal = lector.nextDouble();
        
        nfinal = caliFinal*0.15;
        
        System.out.println("La nota final es:");
        System.out.println(nfinal);
        
      
        
        
    }
    
}
