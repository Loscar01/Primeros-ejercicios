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
public class PrimerosEjercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1,num2;
        System.out.println("Ingrese dos numeros para sumar");
        num1=leer.nextInt();
        num2=leer.nextInt();
        System.out.println("La suma de " + num1 + " + " + num2 + " es:" + (num1+num2) );
                
        
    }
    
}
