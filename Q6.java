/*Escreva um programa Java console que receberá a duração 
de um evento expresso em segundos e exiba-o expresso em horas, 
minutos e segundos. Seu programa deverá exibir uma saída parecida com:
Informe a duração do evento em segundos: 3712 
Duração do evento: 01:01:52 
 */

 import java.util.Scanner;

public class Q6 {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        int horas, min, segundos;
        int duração_segundos;

        System.out.println("Informe a duração do evento em segundos: ");
        duração_segundos = scanner.nextInt();

        horas = duração_segundos / 3600;
        min = (duração_segundos % 3600) / 60;
        segundos = duração_segundos % 60;

        System.out.printf("Duração do evento: %02d:%02d:%02d\n", horas, min, segundos);

    }
}
