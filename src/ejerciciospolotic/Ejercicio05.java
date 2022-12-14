/*
Ejercicio 05
Pedir al usuario que ingrese el valor del radio de una circunferencia.
Calcular y mostrar por pantalla el área y el perímetro. Recordá que el
área y el perímetro se calculan con las siguientes fórmulas:
area = PI * radio2
perimetro = 2 * PI * radio
 */
package ejerciciospolotic;

import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {
        System.out.print("Ingresar el radio de la circunferencia (en centímetros): ");
        Scanner r = new Scanner(System.in);
        double radio = r.nextDouble();
        /* se utiliza el método Math.pow */
        double area = Math.PI*Math.pow(radio, 2);
        double perimetro = 2*Math.PI*radio;
        System.out.println("El área de la circunferencia es: "+area+" cm.");
        System.out.println("El perímetro de la circunferencia es de: "+perimetro+" cm.");
    }
}
