/*
Ejercicio 02
Escribir un programa en el cual se le pregunte al usuario su nombre. A continuación,
mostrar un mensaje que diga “Hola, ” completando el mensaje
con el nombre que ingresó el usuario.
 */
package ejerciciospolotic;

import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {
        /* se pide al usuario que ingrese su nombre en la consola */
        System.out.println("¿Cuál es tu nombre?");
        Scanner texto = new Scanner(System.in);
        /* se asigna la entrada a la variable "nombre" */
        String nombre = texto.nextLine();
        /* se muestra en pantalla el saludo junto con el nombre ingresado */
        System.out.println("Hola, " + nombre + ", ¿cómo estás?");
    }
}
