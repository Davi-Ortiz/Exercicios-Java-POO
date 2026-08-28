package Aula03;
/******************************************************************************
leia idade, se é estudante (s/n) e o dia da semana; calcule o preço a partir de 
final double INTEIRA = 40.0: meia para menores de 18, idosos e estudantes;
terça-feira tem 20% de desconto adicional sobre o valor já calculado. 
Imprima com printf e uma linha explicando quais descontos foram aplicados.

*******************************************************************************/

public class Ingresso {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.println("\n***** SISTEMA DE CÁLCULO DE INGRESSO ***** \n\n");

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente

        System.out.print("Você é estudante? (s/n): ");
        String estudanteInput = scanner.nextLine().trim().toLowerCase();
        boolean estudante = estudanteInput.equals("s");

        System.out.print("Digite o dia da semana (ex: segunda, terça, ...): ");
        String diaSemana = scanner.nextLine().trim().toLowerCase();

        final double INTEIRA = 40.0;
        double preco = INTEIRA;
        String descontosAplicados = "";

        if (idade < 18 || idade >= 60 || estudante) {
            preco /= 2; // Aplica desconto de meia-entrada
            descontosAplicados += "Meia-entrada aplicada. ";
        }

        if (diaSemana.equals("terça")) {
            preco *= 0.8; // Aplica desconto adicional de 20%
            descontosAplicados += "Desconto de terça-feira aplicado.";
        }

        System.out.printf("Preço do ingresso: R$ %.2f\n", preco);
        System.out.println(descontosAplicados);

        scanner.close();
    }
}
