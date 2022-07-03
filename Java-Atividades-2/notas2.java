import java.util.Scanner;

public class notas2 {

    public static void main(String[] args) {
        Double N1, N2, NO, resultado1, resultado2, resultado3;
        String nome;

        Scanner in = new Scanner(System.in);

        System.out.println("Qual é o nome do aluno?");
        nome = in.nextLine();

        System.out.println("Escreva a nota do aluno "+nome+" na prova de portugues:");
        N1 = in.nextDouble();

        System.out.println("Agora escreva a nota do aluno "+nome+" na prova de matematica:");
        N2 = in.nextDouble();

        System.out.println("Agora escreva a nota do aluno "+nome+" na prova de programacao:");
        NO = in.nextDouble();

        resultado1 = (N1 + N2) / 2;
        resultado2 = (N1 + NO) / 2;
        resultado3 = (N2 + NO) / 2;

        if(N1 > NO && N2 > NO) {
            System.out.println("A média do aluno "+nome+" é : "+resultado1+". Fim");
            } else if(NO == N1 && NO == N2) {
            System.out.println("A média do aluno "+nome+" é : "+resultado1+". Fim");
            }
            if(NO > N1) {
            System.out.println("A média do aluno "+nome+" é : "+resultado3+". Fim");
            } else if(NO > N2) {
            System.out.println("A média do aluno "+nome+" é : "+resultado2+". Fim");
            }
            if(6 < resultado1) {
            System.out.println("O aluno "+nome+" foi aprovado");
            } else if (6 > resultado1) {
            System.out.println("O aluno "+nome+" foi reprovado");
            } else if(6 < resultado2) {
            System.out.println("O aluno "+nome+" foi aprovado");
            } else if(6 > resultado2) {
            System.out.println("O aluno "+nome+" foi reprovado");
            } else if(6 < resultado3) {
            System.out.println("O aluno "+nome+" foi aprovado");
            } else if(6 > resultado3) {
            System.out.println("O aluno "+nome+" foi reprovado");
            } else if(6 == resultado1) {
             System.out.println("O aluno "+nome+" foi aprovado");
            } else if(6 == resultado2) {
            System.out.println("O aluno "+nome+" foi aprovado");
            } else if(6 == resultado3) {
            System.out.println("O aluno "+nome+" foi aprovado");
            }
    }
}