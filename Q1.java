//Elabore um programa que leia um número (1 a 9) e imprima a tabuada desse número.

import java.util.Scanner;

public class Q1 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número entre 1 e 9: ");
        int num = scanner.nextInt();

        if(num>=1 && num<=9){
            System.out.println("Tabuada do " + num + ":");
            for(int i=1; i<=10; i++){
                System.out.println(num + "x" + i + "=" + (num * i));
        }
    }else{
        System.out.println("Inválido. Digite um número de 1 a 9: ");
    }
}
}