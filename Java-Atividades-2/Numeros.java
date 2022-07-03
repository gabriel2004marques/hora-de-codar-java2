import java.util.Scanner;

public class Numeros {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Escreva um número :");
        double n1 = in.nextDouble();

        System.out.println("Escreva outro número :");
        double n2 = in.nextDouble();

        if (n1 > n2) {
            System.out.println("O primeiro número é maior !");
        }
        if (n2 > n1) {
            System.out.println("O segundo número é o maio !");
        } 
        if (n1 == n2) {
            System.out.println("Esses números são iguais !");
        }
    }
}