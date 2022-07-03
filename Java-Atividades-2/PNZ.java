import java.util.Scanner;

public class PNZ {

    public static void main(String[] args) {
        Float n1;

        Scanner in = new Scanner(System.in);

        System.out.println("Escreva um número :");
        n1 = in.nextFloat();

        if(n1 > 0) {
            System.out.println("O número "+n1+" é maior que 0, então ele é um número positivo.");
        } 
        if (n1 == 0){
            System.out.println("Este número é igual a 0.");
        }
        if (n1 < 0) {
            System.out.println("O número "+n1+" é menor que 0, então ele é um número negativo.");
        }
    }
} 