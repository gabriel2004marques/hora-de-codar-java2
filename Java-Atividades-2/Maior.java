import java.util.Scanner;

public class Maior {

    public static void main(String[] args) {
        Float n1, n2;

        Scanner in = new Scanner(System.in);

        System.out.println("Escreva um número :");
        n1 = in.nextFloat();

        System.out.println("Escreva outro número :");
        n2 = in.nextFloat();

        if(n1 > n2) {
            System.out.println("O maior número é : "+n1);
        } else if(n2 > n1) {
            System.out.println("O maior número é : "+n2);
        }
    }
}