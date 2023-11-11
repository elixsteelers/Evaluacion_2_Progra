/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_7;

import java.util.Scanner;

/**
 *
 * @author juani
 */
public class EJERCICIO_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int min,max;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número positivo (Para acabar introduce un número negativo).");
        min=1000000;
        max=0;
        while (true) {
            System.out.print("Introduce un número: ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                break;
            }
            if (numero < min) {
                min = numero;
            }
            if (numero > max) {
                max = numero;
            }
        }
            System.out.println("El número más pequeño es: " + min);
            System.out.println("El número más grande es: " + max);
        }

    }
