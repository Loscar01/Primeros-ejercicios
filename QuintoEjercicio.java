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
public class QuintoEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double numero;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un numero");
        numero = leer.nextDouble();
        double raiz = Math.sqrt(numero);
        System.out.println("La raiz de " + numero + " es: " + raiz);
    }
    
}
