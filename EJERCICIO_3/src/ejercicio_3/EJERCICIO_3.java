/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio_3;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EJERCICIO_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num, suma;
        suma=0;
        Scanner input=new Scanner (System.in);
        System.out.println("Introduce un número");
         num=input.nextInt();
         for (int i = 1; i <= num; i++) {
             suma+=i;
    }
              System.out.print( "Suma de los números del 1  "+num+" es:  "+suma);
    }
    
}
