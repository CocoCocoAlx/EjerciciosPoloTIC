package ejerciciospolotic_tp2;

/* Escribir un programa que reciba un número entero por teclado.
Dependiendo del número ingresado:
-> Si es impar, mostrar el texto “Perro”
-> Si es par y está entre 2 y 10 inclusive, mostrar el texto “Gato”
-> Si es par y está entre 11 y 20 inclusive, mostrar el texto “Oso”
-> Si es par y es mayor a 20, mostrar el texto “Caballo”
*/

import java.util.Scanner;

public class Ejercicio02a {

    public static void main(String[] args) {
        System.out.println("Ingresar un número entero");
        Scanner n = new Scanner(System.in);
        int valor = n.nextInt();
        /* Se asigna a cada intervalo un caso específico del switch (caso 0, 1, ...)*/
        switch ((valor % 2 == 0 && valor>=2 && valor<=10) ? 0:
                (valor % 2 == 0 && valor>=11 && valor<=20) ? 1:
                (valor % 2 == 0 && valor>20) ? 2:
                (valor % 2 != 0) ? 3:
                4){

            case 0:
                System.out.println("Gato");
                break;
            case 1:
                System.out.println("Oso");
                break;
            case 2:
                System.out.println("Caballo");
                break;
            case 3:
                System.out.println("Perro");
                break;
            case 4:
                System.out.println("Valor fuera de rango");
                break;
        }
    }
}
