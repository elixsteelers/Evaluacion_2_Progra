/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_10;

import java.util.Scanner;

/**
 *
 * @author juani
 */
public class EJERCICIO_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una cadena:");
        String cadena = input.nextLine();

        if (isValidNumber(cadena)) {
            System.out.println("Número válido.");
        } else {
            System.out.println("No es un número válido.");
        }
    }

    public static boolean isValidNumber(String a) {
        for (char c : a.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }

        try {
            Integer.parseInt(a);
            return true;
        } catch (NumberFormatException e) {
            return false;
    }
     }
   
}
