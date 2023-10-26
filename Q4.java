/*Faça um programa que:
  - Leia a cotação do dólar
  - Leia um valor em dólares
  - Converta esse valor para Real
  - Mostre o resultado
 */

import java.util.Scanner;

public class Q4 {
    public static void main(String [] args){
        
        Scanner scanner = new Scanner(System.in);
        double cotação_dolar, valor_dolar, valor_real;

        System.out.print("Informe a cotação do dólar: ");
        cotação_dolar = scanner.nextDouble();

        System.out.print("Informe um valor em dólar: ");
        valor_dolar = scanner.nextDouble();

        valor_real = cotação_dolar * valor_dolar;

        System.out.print("O valor em reais é: "+valor_real+"\n");
    }
}