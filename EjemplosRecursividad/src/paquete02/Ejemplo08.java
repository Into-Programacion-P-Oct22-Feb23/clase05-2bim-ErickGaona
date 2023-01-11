/*
 * Factorial sin recursividad
 * 5! = 5 * 4 * 3 * 2 * 1
 */
package paquete02;

import java.util.Scanner;

public class Ejemplo08 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del arreglo");
        int opcion = entrada.nextInt();
        
        int[] arreglo = new int[opcion];
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese los valores para el arreglo");
            arreglo[i] = entrada.nextInt();
            
            
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.printf("La suma de los numeros es :%s",arreglo[i]+ arreglo[i] );
            
        }
        
            
        
        

        // Ingresar por teclado el tamaño de un arreglo
        // Ingresar por teclado los valores enteros del arreglo
        // Sumar los valores del arreglo, mediante la función misterio
        
    }

    public static int misterio(int[] arreglo, int tamanio) {

        if (tamanio == 1) {
            return arreglo[0];
        } else {
            return arreglo[tamanio - 1] + misterio(arreglo, tamanio - 1);
        }
    }

}
