/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_conversiones;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_10_TEMPERATURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double temp, far, kelvin;
        Scanner cap = new Scanner(System.in);
        //SOLICITAR LOS DATOS AL USUARIO
        
        System.out.println("INTRODUSCA LA TEMPERATURA EN CENTIGRADOS: ");
        temp = cap.nextDouble();
        
        //HACER EL CALCULO
        far = (temp * 1.8) + 32;//far
        kelvin = temp + 273.15;//kelvin
       
        //MOSTRAR RESULTADOS AL USUARIO
        System.out.println(temp +"C = " + far + "F= " );
        System.out.println(temp +"C = " + kelvin + "K= " );
    }
    
}
