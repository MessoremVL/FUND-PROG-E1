/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_circulo;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_13_CIRCULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double radio, perim, area, volum;
        Scanner cap = new Scanner(System.in);
        
       
        System.out.println("INTRODUZCA EL RADIO DEL CIRCULO: ");
        radio = cap.nextDouble();
        
        perim = 2 * 3.1416 * radio;
        area = 3.1416 * (radio *radio);
       
        volum = (4.0 / 3.0) * 3.1416 * (radio * radio * radio);

        System.out.print("EL PERIMETRO DE TU CIRCULO ES: ");
        System.out.println(perim);
        
        System.out.print("EL AREA DE TU CIRCULO ES: ");
        System.out.println(area);
        
        System.out.print("EL VOLUMEN DE TU CIRCULO ES: ");
        System.out.println(volum);
        
        
                }
    
}
