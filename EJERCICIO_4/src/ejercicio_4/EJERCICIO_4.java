/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio_4;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EJERCICIO_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 Scanner scanner = new Scanner(System.in);
        boolean repe = true;
        int num;

        while (repe) {
            System.out.println("Introduce un número (Positivo, Negativo o 0): ");
            num=scanner.nextInt();
            if (num > 0) {
                System.out.println("El número es positivo.");
            } else if (num < 0) {
                System.out.println("El número es negativo.");
            } else {
                System.out.println("El número es cero.");
            }
            System.out.println("");
            System.out.print("desea terminar? (si/no): ");
            String res = scanner.next();
            repe = !res.equalsIgnoreCase("si");
    }
      }     
}
