/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio_1;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EJERCICIO_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           int num1, num2;
        Scanner input=new Scanner (System.in);
        System.out.println("Introduce un número positivo");
         num1=input.nextInt();
         System.out.println("Introduce un número mayor al anterior");
          num2=input.nextInt();
          for (int i = num1+1; i < num2; i++) {
              System.out.print(i+ "-");
    }
          } 
}
