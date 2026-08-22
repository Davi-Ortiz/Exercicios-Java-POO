package Aula02;
/******************************************************************************
Desafio 🌶️ 
Imc.java — leia nome, peso e altura do teclado; calcule o IMC (peso / (altura * altura)) 
e imprima assim: Maria, seu IMC é 21,45. Use nextLine() depois do último número lido e explique num comentário por que ele foi necessário.
*******************************************************************************/
import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n***** SISTEMA DE CÁLCULO DE IMC - Índice de Massa Corporal ***** \n\n");

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu peso (kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura (m): ");
        double altura = scanner.nextDouble();
        scanner.nextLine(); // Necessário para consumir a quebra de linha pendente após nextDouble()

        double imc = peso / (altura * altura);

        if ( imc < 18.5) {
            System.out.printf("\n%s, seu IMC é %.2f. Você está abaixo do peso ideal.\n", nome, imc);
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.printf("\n%s, seu IMC é %.2f. Você está com o peso ideal.\n", nome, imc);
        } else if (imc >= 25 && imc < 30) {
            System.out.printf("\n%s, seu IMC é %.2f. Você está acima do peso ideal.\n", nome, imc);
        } else {
            System.out.printf("\n%s, seu IMC é %.2f. Você está com obesidade.\n", nome, imc);
        }

        scanner.close();
    }
    
}
