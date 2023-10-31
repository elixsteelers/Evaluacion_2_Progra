/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_14_ciclos_for_2;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_14_CICLOS_FOR_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //VAMOS A CAPTURAR CALIFICACIONES DE UN GRUPO Y GENERAR
        //EL PROMEDIO
        int ncalif;
        int sumacalif=0; //cero es el neutro aditivo
                         //1 es el neutro
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el número de calificaciones ");
        ncalif=input.nextInt();
        //for (int i = 1; i <= ncalif; i++) 
        for (int i = 0; i < ncalif; i++) {
            System.out.println("Introduce la calificación");
            int calif=input.nextInt();
            /*sumatoria de calificaciones:
            //ACUMULADORES
            sumacalif=sumacalif+calif*/
            sumacalif+=calif;
        }
        /*el promedio es sumacalif/ncalif, pero ambos son enteros
        y dividir enteros en java da como resultado un entero, sin decimal*/
        double promedio=sumacalif/(ncalif*1.0);
        System.out.println("El promedio es " + promedio);
    }
    
}
