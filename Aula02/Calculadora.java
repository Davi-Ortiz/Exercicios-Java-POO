package Aula02;
/******************************************************************************
Calculadora.java — leia dois números double do teclado com Scanner e 
imprima soma, subtração, multiplicação, divisão e resto (use %.2f);
*******************************************************************************/
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\n\n***** SISTEMA DE CALCULADORA - Operações Matemáticas  ***** \n\n");

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        double divisao = num1 / num2;
        double resto = num1 % num2;
        
        System.out.print("\n// Imprimindo os resultados das operações matemáticas\n");

        System.out.printf("\nSoma: %.2f + %.2f = %.2f%n \n", num1, num2, soma);
        System.out.printf("Subtração: %.2f - %.2f = %.2f%n \n", num1, num2, subtracao);
        System.out.printf("Multiplicação: %.2f * %.2f = %.2f%n \n", num1, num2, multiplicacao);
        System.out.printf("Divisão: %.2f / %.2f = %.2f%n \n", num1, num2, divisao);
        System.out.printf("Resto: %.2f %% %.2f = %.2f%n \n", num1, num2, resto);

        scanner.close();
    }
}
