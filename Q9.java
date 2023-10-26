/*Escreva um programa Java console que leia um número de 3 dígitos e o inverta, 
escrevendo o número lido e o invertido. Por exemplo, se o usuário informar 
o valor 753, seu programa deverá invertê-lo, resultando em 357. Seu programa deverá exibir a seguinte saída: 
Informe um valor inteiro de três dígitos: 753 
O valor original é: 753
O valor invertido é: 357 
 */

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um valor inteiro de três dígitos: ");
        int numero = scanner.nextInt();

        int valorOriginal = numero;

        int numeroInvertido = 0;
        while (numero > 0) {
            numeroInvertido = numeroInvertido * 10 + numero % 10;
            numero = numero / 10;
        }
        
        System.out.println("O valor original é: " + valorOriginal);
        System.out.println("O valor invertido é: " + numeroInvertido);

        scanner.close();
    }
}

