/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_18_do_while;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_18_DO_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        Scanner input = new Scanner (System.in);
        do{//este bloqur siempre se ejecuta al menos 1 vez
            System.out.println("Inenta adivinar el número: ");
            num=input.nextInt();     
        }while(num !=100);
        System.out.println("ADIVINASTE!!");
    }
    
}
