package ejerciciospolotic_tp2;

/* Escribir un programa que lea una palabra por teclado y determine si
es un palíndromo.
*/

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.println("Ingresar una palabra o frase (sólo con espacios)");
        String palabra = p.nextLine();
        /* se reemplazan las tildes por caracteres normales y se quitan los espacios */
        String palabratest = palabra.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u").replace(" ","");
        /* se definen las posiciones inicial y final de la palabra */
        int pinicio=0;
        int pfinal=palabratest.length()-1;
        boolean error = false;
        /* se recorren las letras de la palabra/frase desde el inicio y desde el final al mismo tiempo,
        y se prueba si son iguales, si no coinciden, da error */
        while ((pinicio<pfinal) && (!error)){
            if (palabratest.charAt(pinicio)==(palabratest.charAt(pfinal))){
                pinicio++;
                pfinal--;
            }
            else {
                error = true;
            }
        }
        if (!error){
            System.out.println("La palabra/frase \""+palabra+"\" es palíndroma");
        }
        else {
            System.out.println("La palabra/frase \""+palabra+"\" NO es palíndroma");
        }
    }
}
