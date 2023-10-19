/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_10_califas_eua;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_10_CALIFAS_EUA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          int calif;
        Scanner input=new Scanner(System.in);
        System.out.println("Introduce tu calificación");
        calif=input.nextInt();
        //if((mes > 0) && (mes <= 12)){//if((mes>0)&&(mes<13))
            if((calif >= 90) && (calif<=100))
                System.out.println("La calificación es A");
            else if ((calif >= 80) && (calif<=89))
                System.out.println("La calificación es B");
            else if ((calif >= 70) && (calif<=79))
                System.out.println("La calificación es C");
            else if((calif >= 60) && (calif<=69))
                System.out.println("La calificación es D");
            else if ((calif >= 0) && (calif<=59))
                System.out.println("La calificación es F");
            else
                System.out.println("La calificación no es válida");
    }
    
}
