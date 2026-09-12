/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String marca;
        String modelo;
        int año;
        String color;
        double kilometraje;
        double precio;
        
        Scanner captu = new Scanner(System.in);
        System.out.println("Captura la marca");
        marca = captu.nextLine();
         System.out.println("Captura el modelo");
        modelo = captu.nextLine();
         System.out.println("Captura el año");
        año = captu.nextInt();
         System.out.println("Captura el color");
        color = captu.nextLine();
         System.out.println("Captura el kilometraje");
        kilometraje =captu.nextDouble();
         System.out.println("Captura el precio");
        precio = captu.nextDouble();
        System.out.println("DATOS CAPTURADOS");
        System.out.print("MARCA:");
        System.out.println(marca);
        System.out.print("MODELO:");
        System.out.println(modelo);
        System.out.print("AÑO:");
        System.out.println(año);
        System.out.print("COLOR:");
        System.out.println(color);
        System.out.print("KILOMETRAJE:");
        System.out.println(kilometraje);
        System.out.print("PRECIO:");
        System.out.println(precio);
    }
    
}
