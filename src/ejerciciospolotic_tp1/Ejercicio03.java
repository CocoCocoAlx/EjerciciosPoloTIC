/*
Ejercicio 03
Escribir un programa que lea dos números y realice el cálculo de la
suma, la resta, la multiplicación y la división entre ambos valores. Los
resultados deben mostrarse por pantalla.
 */
package ejerciciospolotic_tp1;

import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
        System.out.print("Ingresar un número: ");
        Scanner n1 = new Scanner(System.in);
        /* se toman sólo valores enteros */
        int valor1 = n1.nextInt();
        System.out.print("Ingresar otro número: ");
        Scanner n2 = new Scanner(System.in);
        int valor2 = n2.nextInt();
        /* se crean variables con las operaciones solicitadas */
        int suma = valor1 + valor2;
        int resta = valor1 - valor2;
        int multiplicacion = valor1 * valor2;
        int division = valor1 / valor2;
        System.out.println("La suma " + valor1 + " + " + valor2 + " es " + suma);
        System.out.println("La resta " + valor1 + " - " + valor2 + " es " + resta);
        System.out.println("La multiplicación " + valor1 + " * " + valor2 + " es " + multiplicacion);
        System.out.println("La división " + valor1 + " / " + valor2 + " es " + division);
    }
}
