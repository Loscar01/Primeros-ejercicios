/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeros.ejercicios;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class tercerEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String palabra;
        String Nuevapalabra;
        System.out.println("Ingrese una palabra");
        palabra=leer.next();
        Nuevapalabra= palabra.toLowerCase();
        System.out.println("La palabra en minusculas es: " + Nuevapalabra);
        Nuevapalabra=palabra.toUpperCase();
        System.out.println("En mayusculas es: " + Nuevapalabra);
                
    }
    
}
