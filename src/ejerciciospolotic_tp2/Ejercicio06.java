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

public class Ejercicio06 {

    public static void main(String[] args) {
        System.out.println("Tenés estos animales para elegir:\nAlce\nCaballo\nCaracol\nCóndor\nGato\nLeón\nPitón\nTortuga");
        System.out.println("Elegí un animal y respondé a estas preguntas y el programa te va a decir qué animal elegiste");
        Scanner p = new Scanner(System.in);
        System.out.println("¿El animal es herbívoro? (s/n)");
        /* se define la cadena esherbivoro */
        String esherbivoro = p.nextLine();
        switch (esherbivoro) {
            case "n":
            case "N":
                System.out.println("¿El animal es mamífero? (s/n)");
                /* se define la cadena esmamifero, no herbívoro */
                String esmamifero = p.nextLine();
                switch (esmamifero) {
                    case "n":
                    case "N":
                        System.out.println("¿El animal es doméstico? (s/n)");
                        String esdomestico = p.nextLine();
                        /* se define la cadena esdomestico, no herbívoro ni mamífero */
                        if ("n".equals(esdomestico) | ("N".equals(esdomestico))) {
                            System.out.println("El animal que elegiste es el cóndor");
                            break;
                        } else {
                            System.out.println("El animal que elegiste es la pitón");
                            break;
                        }
                    case "s":
                    case "S":
                        System.out.println("¿El animal es doméstico? (s/n)");
                        String mesdomestico = p.nextLine();
                        /* se define la cadena mesdomestico, mamífero + ¿es doméstico? */
                        if ("n".equals(mesdomestico) | ("N".equals(mesdomestico))) {
                            System.out.println("El animal que elegiste es el león");
                            break;
                        } else {
                            System.out.println("El animal que elegiste es el gato");
                            break;
                        }
                }
                break;
            case "s":
            case "S":
                System.out.println("¿El animal es mamífero? (s/n)");
                /* se define la cadena hmamifero, es decir, hervíboro+mamífero */
                String hmamifero = p.nextLine();
                switch (hmamifero) {
                    case "n":
                    case "N":
                        System.out.println("¿El animal es doméstico? (s/n)");
                        String hmdomestico = p.nextLine();
                        /* se define la cadena hmdomestico, es decir, mamífero+domestico no herbívoro*/
                        if ("n".equals(hmdomestico) | "N".equals(hmdomestico)) {
                            System.out.println("El animal que elegiste es el caracol");
                            break;
                        } else {
                            System.out.println("El animal que elegiste es la tortuga");
                            break;
                        }
                    case "s":
                    case "S":
                        System.out.println("¿El animal es doméstico? (s/n)");
                        /* se define la cadena mmamifero, es decir, mamífero+doméstico (siendo herbívoro)*/
                        String mdomestico = p.nextLine();
                        if ("n".equals(mdomestico) | ("N".equals(mdomestico))) {
                            System.out.println("El animal que elegiste es el alce");
                            break;
                        } else {
                            System.out.println("El animal que elegiste es el caballo");
                            break;
                        }

                }
                break;
        }
    }
}
