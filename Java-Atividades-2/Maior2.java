import java.util.Scanner;

public class Maior2 {

    public static void main(String[] args) {
        Float n1, n2, n3;

        Scanner in = new Scanner(System.in);

        System.out.println("Escreva um número :");
        n1 = in.nextFloat();

        System.out.println("Escreva outo número :");
            n2 = in.nextFloat();

        System.out.println("Escreva mais um número :");
            n3 = in.nextFloat();

        if (n1 > n2 && n1 > n3) {
            System.out.println("O maior número é o número "+n1);
        }
        if (n2 > n1 && n2 > n3) {
            System.out.println("O maior número é o número "+n2);
        }
        if (n3 > n1 && n3 > n2) {
            System.out.println("O maior número é o número "+n3);
        }
    }
}