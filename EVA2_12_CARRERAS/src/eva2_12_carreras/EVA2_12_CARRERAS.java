/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_12_carreras;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_12_CARRERAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        String carrera;
        System.out.println("Introduce la carrera");
        carrera=input.nextLine();
        
        switch (carrera){
            case "ISC" :
                System.out.println("Ingenería en Sistemas Comutacionales");
                break;
            case "INF" :
                System.out.println("Ingenería en Informática");
                break;
            case "IND" :
                System.out.println("Ingenería Industrial");
                break;
            case "INI" :
                System.out.println("Ingenería en Diseño Industrial");
                break;
            case "LA" :
                System.out.println("Licenciatura en Administración");
                break;
            case "IGE" :
                System.out.println("Ingenería en Gestión Empresarial");
                break;
            case "ARQ" :
                System.out.println("Arquitectura");
                break;

            default:
                System.out.println("La carrera no es valida");
    }
    } 
}
