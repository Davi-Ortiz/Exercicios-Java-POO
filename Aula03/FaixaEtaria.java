package Aula03;
/******************************************************************************
 leia a idade do teclado e classifique: 
 criança (0–12), adolescente (13–17), 
 adulto (18–59), idoso (60+). Valide idade negativa;
*******************************************************************************/


public class FaixaEtaria {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.println("\n***** SISTEMA DE FAIXA ETÁRIA ***** \n\n");

        System.out.print("Digite sua idade: ");
        float idade = scanner.nextFloat();

        if (idade < 0) {
            System.out.println("Idade inválida. Por favor, insira uma idade não negativa.\n");
        } else if (idade <= 12) {
            System.out.println("Você é uma criança.\n");
        } else if (idade <= 17) {
            System.out.println("Você é um adolescente.\n");
        } else if (idade <= 59) {
            System.out.println("Você é um adulto.\n");
        } else {
            System.out.println("Você é um idoso.\n");
        }

        scanner.close();
    }
}
