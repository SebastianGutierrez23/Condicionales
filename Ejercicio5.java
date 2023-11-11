package Ejercicios_condicionales;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner division = new Scanner(System.in);

        System.out.println("5,Encontrar el cociente entre dos números y si uno de los numeros es cero imprimir la división no es posible");
        System.out.println("Ingrese número 1 : ");
        double number1 = division.nextDouble();
        System.out.println("Ingrese nuúmero 2: ");
        double number2=division.nextDouble();

        if (number1 <= number2){
            double split = number1 / number2;
            System.out.println("El número menor de los dos números ingresados es: " + number1 + " El resultada de la división de estos es: " + split);
        }
        else {
            System.out.println("la división no es posible");
        }
        }
}
