import java.util.Scanner;

public class Numeros2 {

    public static void main(String[] args) {
        Double n1, n2, n3, n4;

        Scanner in = new Scanner(System.in);

        System.out.println("Escreva um número :");
        n1 = in.nextDouble();

        System.out.println("Escreva outro número :");
        n2 = in.nextDouble();

        System.out.println("Escreva mais um número :");
        n3 = in.nextDouble();

        System.out.println("Agora escreva um último número :");
        n4 = in.nextDouble();

        if(n1 > n2 && n1 > n3 && n1 > n4) {
            System.out.println("O primeiro número escrito foi o número "+n1+" ,o último número foi "+n4+" e o maior número foi "+n1);
        }
        if(n2 > n1 && n2 > n3 && n2 > n4) {
            System.out.println("O primeiro número escrito foi o número "+n1+" ,o último número foi "+n4+" e o maior número foi "+n2);
        }
        if(n3 > n1 && n3 > n2 && n3 > n4) {
            System.out.println("O primeiro número escrito foi o número "+n1+" ,o último número foi "+n4+" e o maior número foi "+n3);
        }
        if(n4 > n1 && n4 > n2 && n4 > n3) {
            System.out.println("O primeiro número escrito foi o número "+n1+" ,o último número foi "+n4+" e o maior número foi "+n4);
        }
    }
}