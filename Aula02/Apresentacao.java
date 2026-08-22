package Aula02;
/******************************************************************************
Apresentacao.java — declare variáveis com seu nome (String), idade (int), altura
(double) e se estuda à noite (boolean); imprima uma apresentação em uma frase
usando printf, com a altura em 2 casas decimais;

*******************************************************************************/
import java.util.Scanner;

public class Apresentacao
{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite seu nome: ");
		String nome = scanner.nextLine();

		System.out.print("Digite sua idade: ");
		int idade = scanner.nextInt();

		System.out.print("Digite sua altura: ");
		double altura = scanner.nextDouble();

		System.out.print("Você estuda à noite? (true/false): ");
		boolean noite = scanner.nextBoolean();

	  	  
		System.out.printf("\n\nOlá, %s! \nIdade: %d anos | Altura: %.2f metros | Estuda à noite? %b", nome, idade, altura, noite	);

		scanner.close();

	}
}
