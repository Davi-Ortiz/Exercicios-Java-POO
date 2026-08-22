package Aula02;
/******************************************************************************
 
 2. A)Conversor.java — dada final double COTACAO = 5.42; e um valor em dólares, 
imprima o valor em reais formatado. 

	B) Depois converta uma temperatura de Celsius 
para Fahrenheit (F = C * 9/5 + 32) — cuidado: por que 9/5 dá 1? Conserte;

*******************************************************************************/
// PARTE A DA QUESTÃO 2

import java.util.Scanner;

public class Conversor
{
	public static void main(String[] args){
	  
	  Scanner  scanner = new Scanner (System.in);
	 
	  final double COTACAO = 5.42;
	  
	  System.out.print("*** SISTEMA DE CONVERSÃO - DÓLAR EM REAIS  *** \n\n");
	  
	  System.out.print("Digite o em Dólar:");
	  final double dolar = scanner.nextInt();

	  
	  final double reais =  dolar * COTACAO;
	  
	  System.out.printf("|>> Valor em Dólar:  %.2f \n|>> Valor em Convertido em Reais:  %.2f", dolar, reais);



// PARTE B DA QUESTÃO 2
	  
	  System.out.print("\n\n*** SISTEMA DE CONVERSÃO - temperatura de Celsius para Fahrenheit  *** \n\n");
	  
	  System.out.print( "Digite a temperatura em Celsius:" );
	  double C = scanner.nextDouble();
	  
	  double F = ( C * 9/5.0 + 32);  //  Para corrigir, usei 9/5.0 que é uma divisão de ponto flutuante.
	  
	  System.out.printf("|>> Temperatura em Celcius:  %.2f \n|>> Temperatura Convertida em Fahrenheit:  %.2f", C, F);
	  
	  scanner.close();
	  }
}
