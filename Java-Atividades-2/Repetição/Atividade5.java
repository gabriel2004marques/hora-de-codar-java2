import java.util.Scanner;

public class Atividade5 {

    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        double nota = 0;
        double soma = 0;
        double media = 0;

        Scanner in = new Scanner(System.in);
        for (int i = 1; i <= 4; i++){
            System.out.printf("Informe sua %dº nota: ",i);
            nota = in.nextDouble();
            soma += nota; // soma = soma + nota//
            media = soma / 4;
        }
        if (media >= 6.0){
            System.out.println("PARABÉNS! Você foi aprovado com a média: "+media);
        }else{
            System.out.println("Infelizmente, você foi reprovado com a media: "+media);
        }
    }
}