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
public class SegundoEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        nombre=leer.next();
        System.out.println("Tu nombre es: " + nombre);
    }
    
}
