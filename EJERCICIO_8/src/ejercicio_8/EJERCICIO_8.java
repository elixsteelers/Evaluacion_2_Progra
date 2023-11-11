/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_8;

import java.util.Scanner;

/**
 *
 * @author juani
 */
public class EJERCICIO_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char Caracter;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Introduce un carácter (o espacio en blanco para salir): ");
            Caracter = scanner.nextLine().charAt(0);
            if (Caracter != ' ') {
                if (Caracter == 'a' || Caracter == 'e' || Caracter == 'i' || Caracter == 'o' || Caracter == 'u' ||
                    Caracter == 'A' || Caracter == 'E' || Caracter == 'I' || Caracter == 'O' || Caracter == 'U') {
                    System.out.println(Caracter + " es una vocal.");
                } else {
                    System.out.println(Caracter + " es una consonante.");
                }
            }
        } while (Caracter != ' ');
        System.out.println("Programa terminado.");
    }
    }
