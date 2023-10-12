/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_5_operaciones;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_5_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int var1,var2,resu;
        Scanner input = new Scanner (System.in);
        var1=100;
        var2=200;
        
        //OPERADOR +
        //SUMA
        //concatenar=unir cadenas de texto
        resu=var1+var2;
        System.out.println("SUMA: ");
        System.out.println("Var1= " + var1);
        System.out.println("Var2= " + var2);
        System.out.println("Var1 + Var2= " +resu);
        
        //RESTA
        //OPERADOR -
        resu=var1-var2;
        System.out.println();
        System.out.println("RESTA: ");
        System.out.println("Var1= " + var1);
        System.out.println("Var2= " + var2);
        System.out.println("Var1 - Var2= " +resu);
        
        //MULTIPLICACION
        //OPERADOR *
        resu=var1*var2;
        System.out.println();
        System.out.println("MULTIPICACIÓN: ");
        System.out.println("Var1= " + var1);
        System.out.println("Var2= " + var2);
        System.out.println("Var1 X Var2= " +resu);
        
        //DIVISIÓN
        //OPERADOR /
        //El tipo de dato es importante si-resultado de una división
        //usar tipo de dato flotante, si lo manejam entero, les dará el # de veces
        //que cabe el divisor en eñ dividendon (de forma entera)
        var1=15;
        var2=7;
        resu=var1/var2;
        System.out.println();
        System.out.println("DIVISIÓN: ");
        System.out.println("Var1= " + var1);
        System.out.println("Var2= " + var2);
        System.out.println("Var1 / Var2= " +resu);
        
        //DIVISÓN FLOTANTE
        double resuExa;
        resuExa=var1/var2;
        System.out.println();
        System.out.println("DIVISIÓN FLOTANTE: ");
        System.out.println("Var1= " + var1);
        System.out.println("Var2= " + var2);
        System.out.println("Var1 / Var2= " +resuExa);
        
        //DIVISIÓN EXACTA
        double var2f=7;
        resuExa=var1/var2f;
        System.out.println();
        System.out.println("DIVISIÓN EXACTA: ");
        System.out.println("Var1= " + var1);
        System.out.println("Var2= " + var2f);
        System.out.println("Var1 / Var2= " +resuExa);
        
        int cifra=7;
        double cifraDouble=7.0;
        double division=100/10;//es diferente a:
        //double division=100/10.0; //se toma como flotante
        
        //PRECEDENCIA DE OPERACIONES: 
        int a=5,b=3,c=2;
        int resultado=(a*b)+(a-c)*(b-a);//(15)+(3)*(-2)//15-6=9
        System.out.println("RESULTADO PREDENCIA: "+resultado);
        
        //POTENCIAS Y RAICES:
        double potencia;
        potencia=Math.pow(100, 0.5);
        System.out.println("POTENCIA= "+potencia);
    }
    
}
