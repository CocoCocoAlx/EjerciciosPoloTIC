/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciospolotic_tp2;

import java.util.Scanner;

/**
 *
 * @author ivancillo
 */
public class prueba {

    public static void main(String[] args) {
        boolean x;
        x = false;

        System.out.println(
                "La variable x es: " + x);
        Scanner nro = new Scanner(System.in);
        int n = nro.nextInt();
if (n==0){
        x = true;

        System.out.println(
                "La variable x es: " + x);
} else if (n==1){
    x = false;
}
        if (x
                == true) {
            System.out.println("La variable x existe");
        } else {
            System.out.println("x es falso");
        }

    }

}
