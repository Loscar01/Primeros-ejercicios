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
public class CuartoEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int F;
       int C;
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de grados FARENHEIT");
        C=leer.nextInt();
        F = 32 + (9 * C / 5);
        System.out.println("La temperatura introducida a Grados Farenheit es:" + F);
    }
    
}
