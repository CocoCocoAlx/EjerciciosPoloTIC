/*
Ejercicio 06
Escribir un programa que reciba el valor de dos edades y las guarde
en dos variables. Luego el programa debe intercambiar los valores de
ambas variables y mostrarlas por pantalla. Por ejemplo, si el usuario
ingresó los valores edad1 = 24 y edad2 = 35, el programa deberá
mostrar edad1 = 35 y edad2 = 24.
 */
package ejerciciospolotic_tp1;

import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {
        System.out.print("Ingresar un número: ");
        Scanner n1 = new Scanner(System.in);
        long valor1 = n1.nextLong();
        System.out.println("Ingresaste el número: " + valor1);
        System.out.print("Ingresar otro número: ");
        Scanner n2 = new Scanner(System.in);
        long valor2 = n2.nextLong();
        System.out.println("Ingresaste el número: " + valor2);
        /* se utiliza una variable temporal para almacenar el dato del primer ingreso, ya que será reemplazado por el segundo ingreso */
        long valorTemporal = valor1;
        valor1 = valor2;
        valor2 = valorTemporal;
        System.out.println("Se han intercambiado las entradas, ahora los valores ingresados son: " + valor1 + " y " + valor2);
    }
}
