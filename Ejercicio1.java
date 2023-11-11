package Ejercicios_condicionales;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main( String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("1, Escribir un algoritmo para saber si el número es positivo o negativo");
        System.out.println("Ingrese un número: " );
        double numero = scanner.nextDouble();

        if ( numero > 0 ){
        System.out.println("el número es positivo: ");}
        else { System.out.println("El número es negativo: ");}




    }

}
