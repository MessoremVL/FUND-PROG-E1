/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_4_captura;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_4_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //ENTRADA DE DATOS DEL TECLADO (JAVA)
        Scanner capturar = new Scanner(System.in); //Otra variable--> captu de tipo scanner
        // TODO code application logic here
        //SI VAMOS A USAR VARIABLES, SE TIENEN QUE "DECLARAR" ATES DE UASR
        //DECLARAR--> CREAR LA VARIABLE PARA SU USO EN EL PROGRAMA
        //TIPO_DATO_NOMBRE_IDENTIFICADOR;
        //USAR NOMBRES SIGNIFICATIVOS--> DEBE DECIR PARA QUE SE USA
        String nombre;//DECLARACIÓN DE LA VARIABLE
        System.out.println("Captura el nombre");
        
        //Capturar del teclado y ponerlo en la variable nombre
        //Escribir en la variable (poner un valor) AIGNACIÓN
        nombre = capturar.nextLine();
        System.out.println("El valor capturado es");
        System.out.println(nombre);//USO DE LA VARIABLE --> LECTURA
               
    }
    
}
