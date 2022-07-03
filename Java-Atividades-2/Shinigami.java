import java.util.Scanner;

public class Shinigami {

     public static void main(String[] args) {
        Double macas, resultado;

         Scanner in = new Scanner(System.in);

         System.out.println("Numa feira, as maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia, e R$ 0,25 se forem compradas pelo menos doze.");

         System.out.println("Escreva quantas maças deseja comprar :");
         macas = in.nextDouble();

         if(macas >= 12) {
            resultado = macas * 0.25;
            System.out.println("Voce comprou "+macas+" e pagou um total de R$ "+resultado);
         } else if(macas < 12) {
            resultado = macas * 0.30;
            System.out.println("Voce comprou "+macas+" e pagou um total de R$ "+resultado);
         }
     }
}