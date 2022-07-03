import java.util.Scanner;

public class Peso {

    public static void main(String[] args) {
        Double genero, conta, h;

        Scanner in = new Scanner(System.in);

        System.out.println("Qual é o seu o sexo ? (Digite 1 para mulher e 2 para homem)");
        genero = in.nextDouble();

        System.out.println("Qual é a sua altura ? (Escreva como no exemplo: 1,80)");
        h = in.nextDouble();

        if(genero == 1) {
            conta = (62.1 * h) - 44.7;
            System.out.println("O peso ideal para voce seria "+conta+" quilos.");
        } else if(genero == 2) {
            conta = (72.7 * h) - 58;
            System.out.println("O peso ideal para voce seria "+conta+" quilos.");
        }
    }
}