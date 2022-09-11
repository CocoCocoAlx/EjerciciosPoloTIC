/*
Ejercicio 07
A partir de una cantidad de pesos que el usuario ingresa a través del
teclado se debe obtener su equivalente en dólares, en guaraníes y
en reales. Para este ejercicio se consideran las siguientes tasas:
1 dólar = 138,28 pesos
1 peso = 49,72 guaraníes
1 real = 27,38 pesos
 */
package ejerciciospolotic_tp1;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {
        System.out.print("Ingresar suma en pesos: ");
        Scanner v = new Scanner(System.in);
        double pesos = v.nextDouble();
        double dolares = pesos/138.28;
        double guaranies = 49.72/pesos;
        double reales = pesos/27.38;
        /* con %.2f se cortan los valores numéricos a valores con 2 decimales */
        System.out.printf("Este monto equivale a %.2f dólares\n",dolares);
        System.out.printf("Este monto equivale a %.2f guaraníes\n",guaranies);
        System.out.printf("Este monto equivale a %.2f reales\n",reales);
    }
}