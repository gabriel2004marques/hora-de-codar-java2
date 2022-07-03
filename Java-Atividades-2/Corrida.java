import java.util.Scanner;

public class Corrida {

    public static void main(String[] args){
        Double tamPista, voltas, tanque, gasosa, lMinimo, totalKm, lTotal;
        
        Scanner in = new Scanner(System.in);

        System.out.println("A equipe Mercedes deseja calcular o número mínimo de litros\r\n que deverá colocar no tanque de seu carro para que ele possa\r\n percorrer um determinado número de voltas até o primeiro\r\n reabastecimento.");
        
        System.out.println("Escreva o tamanho da pista de corrida :");
        tamPista = in.nextDouble();

        System.out.println("Agora escreva quantas voltas o carro de corrida tem que percorrer ganhar o grande premio :");
        voltas = in.nextDouble();

        System.out.println("Agora escreva quantas vezes o corredor e a equipe desejam reabester o tanque do carro :");
        tanque = in.nextDouble();

        System.out.println("Agora escreva quantos litros de gasolina o carro gastou :");
        gasosa = in.nextDouble();

        totalKm = (tamPista * voltas) * 1000;
        lMinimo = (totalKm / tanque) * gasosa;
        lTotal = totalKm * gasosa;

        System.out.println("O tamanho total desse circuito é : "+totalKm);
        System.out.println("O minimo de litos de gasolina que o carro pode gastar ate o primeiro reabastecimento\r\n (Considerando que o carro reabastece depois de cada volta) é : "+lMinimo);
        System.out.println("O total de litros necessarios para o carro completar o circuito é : "+lTotal);
    }
}