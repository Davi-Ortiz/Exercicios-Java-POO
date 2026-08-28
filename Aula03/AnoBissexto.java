package Aula03;
/******************************************************************************
leia um ano e diga se é bissexto: divisível por 4, exceto se divisível por 100, 
a não ser que seja divisível por 400. Monte a expressão com &&, || e % (teste com 2024 ✅, 1900 ❌, 2000 ✅);

*******************************************************************************/
public class AnoBissexto {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.println("\n***** SISTEMA DE VERIFICAÇÃO DE ANO BISSEXTO ***** \n\n");

        System.out.print("Digite um ano: ");
        int ano = scanner.nextInt();

        boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);

        if (bissexto) {
            System.out.printf("O ano %d é bissexto.\n", ano);
        } else {
            System.out.printf("O ano %d não é bissexto.\n", ano);
        }

        scanner.close();
    }
}