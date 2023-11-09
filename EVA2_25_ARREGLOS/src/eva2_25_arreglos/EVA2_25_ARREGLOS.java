/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_25_arreglos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_25_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cant;
        int[] arregloCal;
        Scanner input= new Scanner(System.in);
        System.out.println("Cuántas calificaciones desea capturar?");
        cant=input.nextInt();
        arregloCal=new int[cant];
        for (int i = 0; i < cant; i++) {
            System.out.println("Introduce la calificación");
            arregloCal[i]=input.nextInt();
        }
        for (int i = 0; i < cant; i++) {
            System.out.print(arregloCal[i]+" - ");     
    }
    }
}
