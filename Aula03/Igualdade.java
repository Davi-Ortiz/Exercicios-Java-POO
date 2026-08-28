package Aula03;
/******************************************************************************
leia uma palavra do teclado e compare com "java" de três formas: ==, .equals() e .equalsIgnoreCase(). 
Imprima os três resultados e explique num comentário por que o primeiro deu o que deu;

*******************************************************************************/

public class Igualdade {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.println("\n***** SISTEMA DE COMPARAÇÃO DE PALAVRAS: Utilizando Operadores de Igualdade ***** \n\n");

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        // Comparação usando ==
        boolean comparacao1 = (palavra == "java");
        System.out.println("Comparação usando '==': " + comparacao1);

        // Comparação usando .equals()
        boolean comparacao2 = palavra.equals("java");
        System.out.println("Comparação usando '.equals()': " + comparacao2);

        // Comparação usando .equalsIgnoreCase()
        boolean comparacao3 = palavra.equalsIgnoreCase("java");
        System.out.println("Comparação usando '.equalsIgnoreCase()': " + comparacao3);

        // Explicação do resultado da primeira comparação
        System.out.println("\nExplicação: A comparação usando '==' verifica se as referências dos objetos são iguais, ou seja, se apontam para o mesmo local na memória. Já '.equals()' compara o conteúdo das strings, e '.equalsIgnoreCase()' faz a mesma comparação ignorando diferenças de maiúsculas e minúsculas.");

        scanner.close();
    }
}
