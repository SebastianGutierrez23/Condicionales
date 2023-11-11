package Ejercicios_condicionales;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner igualdad = new Scanner(System.in);

        System.out.println("3,Escriba un algoritmo que reciba tres números y calcule cual es el mayor y el menor.");

        System.out.println("Ingrese número 1 : ");
        int number1 = igualdad.nextInt();
        System.out.println("Ingrese número 2: ");
        int number2 = igualdad.nextInt();
        System.out.println("Ingrese número 3: ");
        int number3 = igualdad.nextInt();

        int minor = Math.min(Math.min(number1, number2),number3);
        int major = Math.max(Math.max(number1, number2),number3);
        
        if (minor == number1){
            System.out.println("El número menor de los tres números ingresados es: " + number1);
        } else if (minor == number2) {
            System.out.println("El número menor de los tres números ingresados es: " + number2);
        }
        else if (minor == number3) {
            System.out.println("El número menor de los tres números ingresados es: " + number3);
        }
        if (major == number1){
            System.out.println("El número mayor de los tres números ingresados es: " + number1);
        } else if (major == number2) {
            System.out.println("El número mayor de los tres números ingresados es: " + number2);
        }
        else if (major == number3) {
            System.out.println("El número mayor de los tres números ingresados es: " + number3);
        }


    }


}

