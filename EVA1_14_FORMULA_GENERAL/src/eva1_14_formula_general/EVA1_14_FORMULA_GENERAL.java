/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_formula_general;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_14_FORMULA_GENERAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a, b, c, r1, r2 ;
        Scanner cap = new Scanner(System.in);
        
        System.out.println("INTRODUZCA EL VALOR DE A: ");
        a = cap.nextDouble();
        System.out.println("INTRODUZCA EL VALOR DE B: ");
        b = cap.nextDouble();
        System.out.println("INTRODUZCA EL VALOR DE C: ");
        c = cap.nextDouble();
        
       
        
        r1 = (-b  + Math.sqrt(Math.pow(b, 2)- 4 * a * c )) / (2.0 * a) ;
        r2 = (-b  - Math.sqrt((b*b)- 4 * a * c )) / (2.0 * a) ;
        System.out.print("RESULTADO 1: ");
        System.out.println(r1);
        System.out.print("RESULTADO 2: ");
        System.out.println(r2);
        
    }
    
}
