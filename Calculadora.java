package ioc.xtec.cat.calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Introdueix el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Introdueix el segon número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Suma: " + Operacions.sumar(num1, num2));
        System.out.println("Resta: " + Operacions.restar(num1, num2));
        System.out.println("Multiplicació: " + Operacions.multiplicar(num1, num2));

        try {
            System.out.println("Divisió: " + Operacions.dividir(num1, num2));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close(); 
        }
    }
    
}
