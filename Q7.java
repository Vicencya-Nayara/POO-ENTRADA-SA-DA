/*Escreva um programa Java console que lê um valor inteiro e simule o comportamento 
de um caixa eletrônico, ou seja, calcule qual o menor número possível de notas 
de 100, 50, 10, 5 e 1 em que o valor a ser sacado pode ser decomposto. 
Seu programa deverá exibir uma saída parecida com: 
Informe o valor do saque (valor inteiro): 139 
O valor do saque pode ser expresso em: 
1 notas de 100 
0 notas de 50 
3 notas de 10 
1 notas de 5 
4 notas de 1 
 */


 import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valorSaque;

        System.out.print("Informe o valor do saque (valor inteiro): ");
        valorSaque = scanner.nextInt();

        int notas100, notas50, notas10, notas5, notas1;

        notas100 = valorSaque / 100;
        valorSaque %= 100;

        notas50 = valorSaque / 50;
        valorSaque %= 50;

        notas10 = valorSaque / 10;
        valorSaque %= 10;

        notas5 = valorSaque / 5;
        notas1 = valorSaque % 5;

        System.out.println("O valor do saque pode ser expresso em: ");
        System.out.println(notas100 + " notas de 100");
        System.out.println(notas50 + " notas de 50");
        System.out.println(notas10 + " notas de 10");
        System.out.println(notas5 + " notas de 5");
        System.out.println(notas1 + " notas de 1");

        scanner.close();
    }
}
