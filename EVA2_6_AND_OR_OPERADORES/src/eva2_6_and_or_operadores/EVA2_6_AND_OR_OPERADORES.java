/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_6_and_or_operadores;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_6_AND_OR_OPERADORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int calif;
        Scanner input=new Scanner (System.in);
        System.out.println("Introduce la calificación: ");
        calif=input.nextInt();
        
        //VALIDAR
        //UNA CALIF ES MAYOR O IGUAL 0 --->calif >=0
        //Y ---> &&
        //LA CALIF ES MENOS O IGUAL A 100  --->calif <=100
        if((calif>=0)&&(calif<=100)){//valor válid
            System.out.println("La calificación "+calif+" es válida");
            if(calif>=70){
                System.out.println("APROBASTE");
            }else{
                System.out.println("NO ACREDITADO");
            }
        }else{
            System.out.println("La calificación "+calif+" no es válida");
        }
    }
}
