/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_31_for_each_2;

/**
 *
 * @author invitado
 */
public class EVA2_31_FOR_EACH_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cadenas []=new String [5];
                cadenas[0]="Hola";
                cadenas[1]=" ";
                cadenas[2]="Mundo";
                cadenas[3]=" ";
                cadenas[4]="!!!!";
                System.out.println("");
                for (String cade : cadenas) {
                    System.out.println(cade);
        }
    }
    
}
