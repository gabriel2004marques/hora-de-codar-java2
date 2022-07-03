import java.util.Scanner;

public class Taxi {

    public static void main(String[] args) {
        Double kmDia, kmNoite, lgasto, corridas, pcorrida, soma, lucro, gasosa, kmRodado, lucroFinal;

        Scanner in = new Scanner(System.in);

        //Um motorista de táxi deseja calcular o rendimento de seu carro na praça.
        //Sabendo-se que o preço do combustível é de R$ 2,90, escreva um programa para ler: 
        //a marcação do odômetro (Km) no início do dia, a marcação (Km) no final do dia, 
        //o número de litros de combustível gasto e o valor total (R$) recebido dos passageiros. 
        //Sabendo que o carro desse taxista roda 14 kilômetros por litro de gasolina, crie um programa que calcule e escreva: 
        //a média do consumo em Km/L e o lucro (líquido) do dia.

        System.out.println("Escreva a quantidade de km's que o odometro marcava no inicio do dia: ");
        kmDia = in.nextDouble();

        System.out.println("Agora escreva a quantidade de km's que o odometro marcava no fim do dia:  ");
        kmNoite = in.nextDouble();

        System.out.println("Agora escreva quanto que o motorista cobra por cada corrida: ");
        pcorrida = in.nextDouble();

        System.out.println("Agora escreva quantas corridas ele fez no dia: ");
        corridas = in.nextDouble();

        kmRodado = kmNoite - kmDia;
        lgasto = kmRodado / 14;
        gasosa = lgasto * 2.90;
        lucro = pcorrida * corridas;
        lucroFinal = lucro - gasosa;

        System.out.println("No começo do dia o odometros do carro marcava "+kmDia+" km's rodados , e no final do dia o odometro marcava "+kmNoite+" km's rodados. Entao o carro percorreu um total de "+kmRodado+" km's rodados.");
        System.out.println("O motorista gastou um total de "+lgasto+" litros de gasolina no dia.");
        System.out.println("O motorista fez um total de "+corridas+" corridas no dia e lucrou um total de "+lucro+" reais.");
        System.out.println("Mas como considerando que ele gastou um total de "+lgasto+" litros de gasosa no dia e teve que pagar para repor esses litros no carro , o motorista deve ter gastado um total de "+gasosa+" reais.");
        System.out.println("Como o motorista usosu parte do lucro com as corridas para pagar a gasolina , podemos dizer que ele teve um lucro total no fim do dia de "+lucroFinal+" reais.");
    }
}