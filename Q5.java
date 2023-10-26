/*Escreva um programa Java console que solicite ao usuário que informe sua idade em anos, meses e dias, ou seja, 
sua idade atual em anos e a quantidade de meses e dias decorridos desde seu aniversário. 
Seu programa deverá exibir uma saída parecida com:
Informe sua idade em anos, meses e dias 
Anos: 25 
Meses: 2
Dias: 12 
Idade expressa em dias: 9197 
Aqui o usuário tem 25 anos, 2 meses e 12 dias de idade. Assim, sua idade expressa em dias é 9.197
 */

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int anos, meses, dias;
        int idade_dias;

        System.out.println("Informe sua idade em anos, meses e dias");

        System.out.print("Anos: ");
        anos = scanner.nextInt();

        System.out.print("Meses: ");
        meses = scanner.nextInt();

        System.out.print("Dias: ");
        dias = scanner.nextInt();

        idade_dias = (anos * 365) + (meses * 30) + dias;

        System.out.println("Idade expressa em dias: " + idade_dias);
    }
}

