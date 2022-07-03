import java.util.Scanner;

public class valores20 {

    public static void main(String [] args){
        Scanner valor = new Scanner(System.in);
        int count = 1;
        int maior = 0;
        int menor = 0;

        while (count <= 20){
            System.out.println("Por favor, informe um valor " + count + ": ");
            int numb = valor.nextInt();

            if ( numb > maior){
            maior = numb;
            }
            else if( numb < menor){
                menor = numb;
            }
            count++;
        }
        System.out.println("O maior numero informado é: " + maior);
        System.out.println("O menor numero informado é: " + menor);
    }

}