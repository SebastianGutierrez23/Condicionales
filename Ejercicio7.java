package Ejercicios_condicionales;

import java.util.Scanner;

public class Ejercicio7 {
        public static void main(String[] args) {
            Scanner año = new Scanner(System.in);

            System.out.println("Solicitar al usuario que ingrese un año para detarminar si es bisiesto:");

            System.out.println("Ingrese un año:");
            int year = año.nextInt();

            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " es un año bisiesto.");
            } else {
                System.out.println(year + " no es un año bisiesto.");
            }
        }
        }