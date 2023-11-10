/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_26_uso_arreglos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_26_USO_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] platillos= new String[10];
        platillos[0]="Tacos";
        platillos[1]="Torta";
        platillos[2]="Gorditas";
        platillos[3]="Pozole";
        platillos[4]="Burritos";
        platillos[5]="Sopes";
        platillos[6]="Tacos dorados";
        platillos[7]="Chilaquiles";
        platillos[8]="Enchiladas";
        platillos[9]="Quesabirrias";
        double[] precio={60, 30, 60, 75, 25, 35, 75, 60, 75, 85};
        System.out.println("-------- M E N Ú--------");
         for (int i = 0; i < platillos.length; i++) {
             System.out.println(i+"-"+platillos[i]+": $"+precio[i]);
        }
         int op, cant;
         Scanner input= new Scanner (System.in);
         System.out.println("Qué desea ordenar?");
         op=input.nextInt();
         System.out.println("Cuántas ordenes desea?");
         cant=input.nextInt();
         System.out.println("El total del pedido: $"+(cant*precio[op]));
    }
    
}
