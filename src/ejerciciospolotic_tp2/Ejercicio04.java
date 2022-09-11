package ejerciciospolotic_tp2;

/* Escribir un algoritmo que calcule el factorial de un número ingresado
por teclado.
*/

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        System.out.println("Ingresar el valor del cual se quiere calcular su factorial");
        Scanner n = new Scanner(System.in);
        int valor = n.nextInt();
        int base = valor;
        int factorial=valor;
        while (valor>1){
            factorial=factorial*(valor-1);
            valor--;
        }
        System.out.println("El potencial de "+base+" es "+factorial);
    }
    
}
