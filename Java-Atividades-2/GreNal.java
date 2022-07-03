import java.util.Scanner;

public class GreNal {

    public static void main(String[] args) {
        Double gremio, inter, gols;

        Scanner in = new Scanner(System.in);

        System.out.println("Escreva quantos gols o Gremio tem em GreNais :");
        gremio = in.nextDouble();

        System.out.println("Agora escreva quantos gols o Inter tem em GreNais :");
        inter = in.nextDouble();

        if(gremio > inter) {
            System.out.println("O Gremio tem em GreNais um total de "+gremio+" gols , entao o Gremio é o vencedor desta disputa!");
        } else if(gremio < inter) {
            System.out.println("O Inter tem em GreNais um total de "+inter+" gols , entao o Inter é o vencedor desta disputa!");
        } 
        if(gremio == inter) {
            System.out.println("Empate.");
        }
}
}