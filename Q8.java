/*Um hotel com 42 apartamentos resolveu fazer promoções 
para os fins de semana fora da alta temporada, isto é, 
nos meses de abril, maio, junho, agosto, setembro, outubro e novembro.
A taxa da promoção é de 22% da diária normal. A ocupação média do hotel sem promoção é de 40%. 
A expectativa é aumentar a taxa de ocupação para 70%. Supondo que as expectativas se confirmem, 
escrever um algoritmo que lê a diária normal, que calcule e escreva as seguintes informações: 
(a) O valor da diária no período da promoção. 
(b) O valor médio arrecadado sem a promoção, durante um mês. 
(c) O valor médio arrecadado com a promoção, durante um mês. 
(d) O lucro ou prejuízo mensal com a promoção. 
 */

import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float diarianormal, diariapromo, valorarrecadadosempromo, valorarrecadadocompromo, lucroouprej;

        System.out.println("Informe o valor da diária normal: ");
        diarianormal = scanner.nextFloat();

        diariapromo = diarianormal * (1 - 0.22f);
        valorarrecadadosempromo = diarianormal * 0.4f * 42 * 30;
        valorarrecadadocompromo = diariapromo * 0.7f * 42 * 30;
        lucroouprej = valorarrecadadocompromo - valorarrecadadosempromo;

        System.out.printf("O VALOR DA DIÁRIA NO PERÍODO DA PROMOÇÃO = %.2f\n", diariapromo);
        System.out.printf("O VALOR MÉDIO ARRECADADO SEM A PROMOÇÃO = %.2f\n", valorarrecadadosempromo);
        System.out.printf("O VALOR MÉDIO ARRECADADO COM A PROMOÇÃO = %.2f\n", valorarrecadadocompromo);
        System.out.printf("LUCRO OU PREJUÍZO = %.2f\n", lucroouprej);

        scanner.close();
    }
}


