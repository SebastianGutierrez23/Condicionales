package Ejercicios_condicionales;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main( String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("2, Escribir un algoritmo que reciba dos números por teclado y realize una comparación para saber cual es el mayor.");
        System.out.println("Ingrese número 1 : " );
        double number1 = scanner.nextDouble();
        System.out.println("Ingrese número 2: " );
        double number2 = scanner.nextDouble();

        if (number1 > number2){
            System.out.println("El número " + number1 + " Es mayor que el número " + number2);
        }
        else{
            System.out.println("El número " + number2 + " Es mayor que el número " + number1);

        }



        }

}
