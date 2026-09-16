/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_temperatura_3;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_12_TEMPERATURA_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                
               double kelvin, cels, far;
        Scanner cap = new Scanner(System.in);
        
        System.out.println("INTRODUSCA LA TEMPERATURA EN KELVIN: ");
        kelvin = cap.nextDouble();
        
        cels = (kelvin - 273.15);
        far = (kelvin - 273.15) * 1.8 + 32;
        
        System.out.println(kelvin +"F = " + cels + "C= " );
        System.out.println(kelvin +"F = " + far + "F= " );
    }
    
}
