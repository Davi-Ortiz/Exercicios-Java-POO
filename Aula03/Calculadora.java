package Aula03;
/******************************************************************************
leia dois números e um operador (+, -, *, /) e use switch moderno para calcular. 
Trate a divisão por zero com uma mensagem em vez de deixar quebrar;

*******************************************************************************/


public class Calculadora {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.println("\n***** SISTEMA DE CÁLCULO SIMPLES ***** \n\n");

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Digite o operador (+, -, *, /): ");
        String operador = scanner.next();
        
        while (!operador.equals("+") && !operador.equals("-") && !operador.equals("*") && !operador.equals("/")) {
            System.out.print("Operador inválido. Por favor, digite um operador válido (+, -, *, /): ");
            operador = scanner.next();
        }                                // Enquanto o operador não for válido, solicita novamente

        double resultado;

        switch (operador) {
            case "+" -> resultado = num1 + num2;
            case "-" -> resultado = num1 - num2;
            case "*" -> resultado = num1 * num2;
            case "/" -> {
                if (num2 == 0) {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                    return; // Sai do programa
                }
                resultado = num1 / num2;
            }
            default -> {
                System.out.println("Operador inválido. Por favor, use +, -, * ou /.");
                return; // Sai do programa
            }
        }

        System.out.printf("Resultado: %.2f %s %.2f = %.2f\n", num1, operador, num2, resultado);

        scanner.close();
    }
}

