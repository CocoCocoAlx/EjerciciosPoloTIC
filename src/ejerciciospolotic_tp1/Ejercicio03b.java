/*
Ejercicio 03
Escribir un programa que lea dos números y realice el cálculo de la
suma, la resta, la multiplicación y la división entre ambos valores. Los
resultados deben mostrarse por pantalla.
 */
package ejerciciospolotic_tp1;

import java.util.Scanner;

public class Ejercicio03b {

    public static void main(String[] args) {
        System.out.print("Ingresar un número: ");
        Scanner n1 = new Scanner(System.in);
        /* se toman valores decimales usando float */
        float valor1 = n1.nextFloat();
        System.out.print("Ingresar otro número: ");
        Scanner n2 = new Scanner(System.in);
        float valor2 = n2.nextFloat();
        float suma = valor1 + valor2;
        float resta = valor1 - valor2;
        float multiplicacion = valor1 * valor2;
        float division = valor1 / valor2;
        System.out.println("La suma " + valor1 + " + " + valor2 + " es " + suma);
        System.out.println("La resta " + valor1 + " - " + valor2 + " es " + resta);
        System.out.println("La multiplicación " + valor1 + " * " + valor2 + " es " + multiplicacion);
        System.out.println("La división " + valor1 + " / " + valor2 + " es " + division);
    }
}
