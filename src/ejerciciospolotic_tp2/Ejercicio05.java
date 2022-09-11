package ejerciciospolotic_tp2;

/* Escribir un algoritmo que imprima el listado de los números primos
menores que 100. Aclaración: el número 1 no es primo.
 */
public class Ejercicio05 {

    public static void main(String[] args) {
        System.out.println("Se muestran todos los números primos entre 1 y 100:");
        /* se inicializan dos valores, i y el contador de divisores de un valor dado */
        int i,contador;
        /* se inicializa contador desde j=2 porque el 1 no es un número primo */
        for (int j=2;j<=100;j++){
            contador=0;
            /* se divide a j por i, y cuando se encuentran sólo dos divisores (presumiblemente 1 y el valor en sí mismo), 
            se muestra qué valor de j es */
            for  (i=1;i<=j;i++){
                if (j%i==0){
                    contador++;
                }
            }
            if (contador==2){
                System.out.print(j+" ");
            }
        }
    }
}