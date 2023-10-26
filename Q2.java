/*Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. 
A fórmula de conversão de temperatura a ser utilizada é F = (9 * C + 160) / 5, em que a variável F representa é a
temperatura em graus Fahrenheit e a variável C representa a temperatura em graus Celsius. */

import java.util.Scanner;

public class Q2 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma temperatura em graus ºC: ");

        double celsius = scanner.nextDouble();
        double fahrenheit = (9 * celsius + 160) / 5;

        System.out.println("A temperatura em fahrenheit é: " + fahrenheit);

        scanner.close();
       
    }
}
