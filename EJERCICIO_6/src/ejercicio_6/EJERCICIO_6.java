/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_6;

import java.util.Scanner;

/**
 *
 * @author juani
 */
public class EJERCICIO_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        String binario = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        num=input.nextInt();
        while (num > 0) {
            binario = num % 2 + binario;
            num /= 2;
        }
        System.out.println("El número en binario es: " + binario);
    }
    
}
