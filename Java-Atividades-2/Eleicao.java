import java.util.Scanner;

public class Eleicao {

    public static void main(String[] args) {
        Double ano, voto;

        Scanner in = new Scanner(System.in);

        System.out.println("Ola ! Em que ano voce nasceu ?");
        ano = in.nextDouble();

        voto = 2022 - ano;

        if(18 > voto) {
            System.out.println("Infelizmente voce é menor de 18 anos e nao podera votar neste ano. ");
        } else if (voto >= 18) {
            System.out.println("Felizmente voce é maior de 18 anos e podera votar neste ano. ");
        }
    }
}