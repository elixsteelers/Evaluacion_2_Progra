/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_7_leap_year;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_7_LEAP_YEAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int year, res4,res100,res400;
       Scanner input = new Scanner(System.in); 
        System.out.println("Introduzca el año");
        year=input.nextInt();
        res4=year%4; //residuo de dividir el año entre 4
        res100=year%100; //residuo de dividir el año entre 100
        res400=year%400; //residuo de dividir el año entre 400
        if((res4 == 0)&&((res100 != 0)||(res400== 0))){
            System.out.println("El año "+year+" es bisiesto");
        }else{
            System.out.println("El año "+year+" es bisiesto");
     
        }
    }
    
}
