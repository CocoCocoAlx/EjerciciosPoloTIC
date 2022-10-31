/*
Ejercicio 04
Escribir un programa que lea la estatura de tres personas, calcule el
promedio de la altura de ellos y lo informe.
 */
package ejerciciospolotic_tp1;

import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {
        System.out.print("Ingresar la altura de la primera persona (en metros): ");
        Scanner n = new Scanner(System.in);
        float altura1 = n.nextFloat();
        System.out.print("Ingresar la altura de la segunda persona (en metros): ");
        float altura2 = n.nextFloat();
        System.out.print("Ingresar la altura de la tercera persona (en metros): ");
        float altura3 = n.nextFloat();
        float promedio = (altura1 + altura2 + altura3) / 3;
        System.out.printf("La altura promedio de las 3 personas es: %.2f metros.\n",promedio);
    }
}
