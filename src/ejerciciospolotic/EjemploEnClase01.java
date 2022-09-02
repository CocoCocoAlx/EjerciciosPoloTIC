package ejerciciospolotic;

import java.util.Scanner;

public class EjemploEnClase01 {

    public static void main(String[] args) {
        Scanner nro = new Scanner(System.in);
        int n = nro.nextInt();
        System.out.println("El valor actual de n es: "+n);
        for (n = 0; n <= 10; n++) {
            System.out.println("El valor de n es :" + n);
        }
        System.out.println("El valor final de n es: "+n);
    }
}
