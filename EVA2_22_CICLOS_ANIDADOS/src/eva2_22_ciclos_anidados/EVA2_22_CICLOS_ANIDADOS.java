/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_22_ciclos_anidados;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_22_CICLOS_ANIDADOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        Scanner input=new Scanner (System.in);
        System.out.println("Introduce un número");
        num=input.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        for (int k = num; k >= 1; k--) {
            for (int q= 1; q<= k; q++) {
                System.out.print("*");
            }
            System.out.println("");
    }
    }
}
