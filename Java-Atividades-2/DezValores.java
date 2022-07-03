import java.util.Scanner;

public class DezValores {

    public static void main(String[] args) {
        int num = 0;
        int soma = 0;

        Scanner in = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
        System.out.println("Informe o "+i+" número.");
        num = in.nextInt();
        soma += num;
        }

        int resultado = in.nextInt();

        resultado = soma/10;

        System.out.println("A soma de todos estes números dá : "+resultado);
    }
}