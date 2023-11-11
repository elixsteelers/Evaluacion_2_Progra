/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_9;

import java.util.Scanner;

/**
 *
 * @author juani
 */
public class EJERCICIO_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una cadena de texto: ");
        String letra = scanner.nextLine();
        System.out.println("Ingrese el caracter a buscar: ");
        char text = scanner.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < letra.length(); i++) {
            if (letra.charAt(i) == text) {
                count++;
            }
        }
        System.out.println("El caracter " + text + " aparece " + count + " veces en la cadena.");
    }
}
