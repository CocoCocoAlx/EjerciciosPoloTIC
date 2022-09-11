package ejerciciospolotic_tp2;

/* Escribir un programa que reciba un número entero por teclado.
Dependiendo del número ingresado:
-> Si es impar, mostrar el texto “Perro”
-> Si es par y está entre 2 y 10 inclusive, mostrar el texto “Gato”
-> Si es par y está entre 11 y 20 inclusive, mostrar el texto “Oso”
-> Si es par y es mayor a 20, mostrar el texto “Caballo”
*/

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        System.out.println("Ingresar un número entero del 1 al 30");
        Scanner n = new Scanner(System.in);
        int valor = n.nextInt();
        if (valor % 2 == 0 && valor>=2 && valor<=10)
            System.out.println("Gato");
        else if (valor % 2 == 0 && valor>=11 && valor<=20)
            System.out.println("Oso");
        else if (valor % 2 == 0 && valor>20)
            System.out.println("Caballo");
        else if (valor % 2 != 0)
            System.out.println("Perro");
    }
    
}
