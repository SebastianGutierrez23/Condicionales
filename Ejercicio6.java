package Ejercicios_condicionales;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner multiply = new Scanner(System.in);

        System.out.println("6,Ingrese dos numeros si uno de estos es negativo se sumara y si no se multiplicara");

        System.out.println("Ingrese número 1 : ");
        double number1 = multiply.nextDouble();
        System.out.println("Ingrese nuúmero 2: ");
        double number2 = multiply.nextDouble();

        if (number1 < 0 || (number2 < 0)) {
            double addition = number1 + number2;
            System.out.println("Si uno de los dos némeros es negativo: " + addition);
        } else { double multipl = number1 * number2;

        System.out.println(" Si no realice la multiplicación de los dos numeros: " + multipl);}

    }
}

