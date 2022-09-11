/* Ejercicio no oficial: se debe preguntar al usuario si el animal
en el que está pensado es carnívoro, herbívoro y/o doméstico,
y en base a las respuestas, tratar de identificar al animal. La matriz
es la siguiente:

Animal,¿Herbívoro?,¿Carnívoro?,¿Doméstico?

Alce,Sí,Sí,No
Caballo,Sí,Sí,Sí
Caracol,Sí,No,No
Cóndor,No,No,No
Gato,No,Sí,Sí
León,No,Sí,No
Pitón,No,No,Sí
Tortuga,Sí,No,Sí

 */
package ejerciciospolotic_tp2;

import java.util.Scanner;

public class Ejercicio06a {

    public static void main(String[] args) {
        System.out.println("Tenés estos animales para elegir:\nAlce\nCaballo\nCaracol\nCóndor\nGato\nLeón\nPitón\nTortuga");
        System.out.println("Elegí un animal y respondé a estas preguntas y el programa te va a decir qué animal elegiste");
        Scanner p = new Scanner(System.in);
        System.out.println("¿El animal es herbívoro? (s/n)");
        String herbivoro = p.nextLine();
        /* se define una nueva variable booleana y dos condiciones para establecerla en
        verdadero o falso (si se responde "s" o "n") */
        boolean esherbivoro;
        esherbivoro = true;
        if ("s".equals(herbivoro) | "S".equals(herbivoro)) {
            esherbivoro = true;
        } else if ("n".equals(herbivoro) | "N".equals(herbivoro)) {
            esherbivoro = false;
        }
        Scanner p2 = new Scanner(System.in);
        System.out.println("¿El animal es mamífero? (s/n)");
        String mamifero = p2.nextLine();
        boolean esmamifero;
        esmamifero = true;
        if ("s".equals(mamifero) | "S".equals(mamifero)) {
            esmamifero = true;
        } else if ("n".equals(mamifero) | "N".equals(mamifero)) {
            esmamifero = false;
        }
        Scanner p3 = new Scanner(System.in);
        System.out.println("¿El animal es doméstico? (s/n)");
        String domestico = p3.nextLine();
        boolean esdomestico;
        esdomestico = true;
        if ("s".equals(domestico) | "S".equals(domestico)) {
            esdomestico = true;
        } else if ("n".equals(domestico) | "N".equals(domestico)) {
            esdomestico = false;
        }
        /* se prueban las todas las combinaciones posibles de cada variable booleana */
        if (esherbivoro == true && esmamifero == true) {
            if (esdomestico == true) {
                System.out.println("El animal que elegiste es el caballo.");
            } else {
                System.out.println("El animal que elegiste es el alce.");
            }
        }
        if (esherbivoro != true && esmamifero == true) {
            if (esdomestico == true) {
                System.out.println("El animal que elegiste es el gato.");
            } else {
                System.out.println("El animal que elegiste es el león.");
            }
        }
        if (esherbivoro == true && esmamifero != true) {
            if (esdomestico == true) {
                System.out.println("El animal que elegiste es la tortuga.");
            } else {
                System.out.println("El animal que elegiste es el caracol.");
            }
        }
        if (esherbivoro != true && esmamifero != true) {
            if (esdomestico == true) {
                System.out.println("El animal que elegiste es la pitón.");
            } else {
                System.out.println("El animal que elegiste es el cóndor.");
            }
        }

    }
}
