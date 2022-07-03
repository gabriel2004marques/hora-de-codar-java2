import java.util.Scanner;

public class Senha {

    public static void main(String[] args) {
        Double senha;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a senha para entrar :");
        senha = in.nextDouble();

        if(senha == 1234) {
            System.out.println("Acesso permitido. Seja bem vindo usuário !");
        } else if(senha != 1234) {
            System.out.println("Senha incorreta. Acesso negado.");
        }
    }
}