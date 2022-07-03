import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {
        Double nota1, nota2, nota3, nota4, resultado1, resultado2;

        Scanner in = new Scanner(System.in);

        System.out.println("Escreva nota do aluno na prova de portugues :");
        nota1 = in.nextDouble();

        System.out.println("Agora escreva a nota do aluno na prova de matematica :");
        nota2 = in.nextDouble();

        System.out.println("Agora escreva a nota do aluno na prova de informatica :");
        nota3 = in.nextDouble();

        System.out.println("Agora escreva a nota do aluno na prova de ingles :");
        nota4 = in.nextDouble();

        resultado1 = nota1 + nota2 + nota3 + nota4;
        resultado2 = resultado1 / 2;
        if(resultado2 < 6){
            System.out.println("O aluno foi reprovado.");
        } else if(6 <= resultado2){
            System.out.println("O aluno foi aprovado.");
        }
    }
}