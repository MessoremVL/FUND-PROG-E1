/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_operaciones;

/**
 *
 * @author bisonte
 */
public class EVA1_7_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EL TIPO DE DATO DETERMINA LAS OPERACIONES
        //ENTEROS, REALES, CANDEAS, LOGICOS, ETC
        //EXPRESIÓN:
        //VALORES
        //VARIABLES
        //OPERADORES
        //FUNCIONES
        //QUE SE EVALUAN PARA OBTENER UN RESULTADO
        // OPERACIONES CON NÚMEROS:
        //ARITMÉTICA:
        int suma, val1, val2; // declaro 3 variables al mismo tiempo
        //ASIGNACIÓN: PONER UN VALOR EN UNA VARIABLE
        //operador ---> simbolo que trabaja SOBRE identificadores
        // = ---> asignación ----> poner el valor 
        // ==  ----> comparación
        val1 = 100; //asignar el valor de 100 a la variable val1
        val2 = 50; 
        suma = val1 + val2; //expresión, asignar a la variable suma la operación entre val1 y val2 (+)
       //+ ---> esta entre dos enteros, se interpreta como que los debe sumar
       System.out.print("Valor 1 =");
       System.out.println(val1);
       System.out.print("Valor 2 =");
       System.out.println(val2);
       System.out.print("Suma =");
       System.out.println(suma);
       //OPERACIONES RESPETAN REGLAS MATEMATICAS
       //MULTIPLICACIÓN
       //*
       int mult;
       mult = val1 * val2;
      System.out.print("Multiplicacion =");
       System.out.println(mult);
       // division
       // / -----> OPERADOR DE DIVISION
       int div;
       div = val1 / val2;
       System.out.print("Division =");
       System.out.println(div);
       val1 = 10;
       val2 = 3;
       System.out.print("Valor 1 =");
       System.out.println(val1);
       System.out.print("Valor 2 =");
       System.out.println(val2);
       div = val1 / val2;
       System.out.print("Division =");
       System.out.println(div);
       double resu;
       resu = val1 / val2;
           System.out.print("Resu =");
       System.out.println(resu);
       double val2cop;
       val2cop = 3;
       resu = val1 / val2cop;
           System.out.print("RESULTADO =");
       System.out.println(resu);
               
        
        
    }
    
}
