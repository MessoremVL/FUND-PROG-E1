/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_temperatura_2;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_11_TEMPERATURA_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
               double far, cels, kelvin;
        Scanner cap = new Scanner(System.in);
        
        System.out.println("INTRODUSCA LA TEMPERATURA EN FARENHEIT: ");
        far = cap.nextDouble();
        
        cels = (far - 32) / 1.8;
        kelvin = (far - 32) * 5/9 + 273.15;
        
        System.out.println(far +"F = " + cels + "C= " );
        System.out.println(far +"F = " + kelvin + "K= " );
    }
    
}
