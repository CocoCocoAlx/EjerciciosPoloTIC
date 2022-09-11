package ejerciciospolotic_tp2;

/* Escribir un programa que reciba un número entero por teclado.
A continuación, mostrar la tabla de multiplicar de ese número.
*/

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        System.out.println("¿La tabla de qué número querés ver?");
        Scanner n = new Scanner(System.in);
        int valor = n.nextInt();
        for (int i=1; i<=10; i++){
            System.out.println(valor + " x " + i + " = "+ i*valor);
        }
    }
    
}
