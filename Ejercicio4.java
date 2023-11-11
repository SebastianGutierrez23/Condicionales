package Ejercicios_condicionales;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner comparison = new Scanner(System.in);

        System.out.println("4,Realizar un algoritmo que compare dos números si a es menor que b sumarlos de lo contrario realizar una resta.");
        System.out.println("Ingrese número 1 : ");
        double number1 = comparison.nextDouble();
        System.out.println("Ingrese número 2: ");
        double number2= comparison.nextDouble();

        if (number1 < number2){
            double suma = number1 + number2;
            System.out.println("El número menor de los dos números ingresados es: " + number1 + " El resultado de la suma de estos es: " + suma);
        } else if (number1 > number2) {
            double resta = number1 - number2;
            System.out.println("El número mayor de los dos números ingresados es: " + number2 + " el resultado de la resta de estos es: " + resta);
        }
        else if (number1 == number2){
            System.out.println(" Los dos números son iguales");
        }

    }}
