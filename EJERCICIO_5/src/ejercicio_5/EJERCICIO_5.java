/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_5;

import java.util.Scanner;

/**
 *
 * @author juani
 */
public class EJERCICIO_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numbase,expo,res;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca un número base: ");
        numbase=scanner.nextInt();
        System.out.println("Introduzca un número exponente: ");
        expo= scanner.nextInt();
        if (numbase <= 0 || expo <= 0) {
            System.out.println("Los números deben ser positivos y enteros.");
        }
        res = 1;
        for (int i = 0; i < expo; i++) {
            res *= numbase;
        }
        System.out.println("La potencia de " + numbase + " elevada a la " + expo + " es: " + res);
    }
    
}
