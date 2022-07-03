import java.util.Scanner;

public class Calculadora {
    
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        int n1;
        int n2;

        System.out.println("Ola, esse programa é uma micro calculadora, digite de acordo com, qual operação deseja fazer: 1.Adição, 2.Subtração, 3.Divisão, 4.Multiplicação");
        int op = in.nextInt();

        System.out.println("Digite o primeiro valor da operaçao escolhida: ");
        n1 = in.nextInt();

        System.out.println("Digite o segundo valor da operaçao escolhida: ");
        n2 = in.nextInt();

        switch (op){
            case 1:
               int soma = n1 + n2;
                System.out.println("Voce escolheu uma soma, o resultado da operação foi: " + soma);
                break;
            case 2:
                int subtracao = n1 - n2;
                System.out.println("Voce escolheu uma subtração, o resultado da operação foi: " + subtracao);
                break;
            case 3:
                int divisao = n1 / n2;
                System.out.println("Voce escolheu uma divisão, o resultado da operação foi: " + divisao);
                break;
            case 4:
                int multiplicacao = n1 * n2;
                System.out.println("Voce escolheu uma multiplicação, o resultado da operação foi: " + multiplicacao);
                break;
            default:
                System.out.println("OPA! Operação invalida, escolha uma das opções de operação utilizando de 1 a 4!");


        }

    }
}