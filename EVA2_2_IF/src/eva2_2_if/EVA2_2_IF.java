/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_2_if;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_2_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int calif;
        Scanner input= new Scanner (System.in);
        System.out.println("Introduce la calificación: ");
        calif=input.nextInt();
        
        if(calif>=70){ //Se ejecuta si es verdad; if(expresión a evaluar)
                System.out.println("Aprobaste");
                System.out.println("Quema tus apuntes!!");
                //2 instrucciones o más poner llaves {}
        }else{ //Se ejecuta si es falso; es opcional
            System.out.println("No aprobaste");
        }
    }
    
}
