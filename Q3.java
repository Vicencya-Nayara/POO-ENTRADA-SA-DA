/*Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, 
utilizando um automóvel que faz 12 Km por litro. Para obter o cálculo, o usuário 
deve fornecer o tempo gasto na viagem e a velocidade média. Desta forma, será possível 
obter a distância percorrida com a fórmula DISTANCIA = TEMPO * VELOCIDADE. 
Tendo o valor da distância, basta calcular a quantidade de litros de combustível utilizada na 
viagem com a fórmula: LITROS_USADOS = DISTANCIA / 12. O programa deve apresentar os valores da velocidade média, 
tempo gasto, a distância percorrida e a quantidade de litros utilizada na viagem. Dica: trabalhe com valores reais. */


import java.util.Scanner;

public class Q3 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        float tempo;
        float distancia;
        float velocidade;
        float litros;
        
        System.out.print("Tempo gasto na viagem: ");
        tempo = scanner.nextFloat();

        System.out.print("Velocidade média (km/h): ");
        velocidade = scanner.nextFloat();
        
        distancia = tempo * velocidade;
        litros = distancia/12;

        System.out.printf("Foram gastos %.2f litros de combustivel na viagem\n", litros);

        scanner.close();

    }
}
