import java.util.Scanner;

public class Valor{

    public static void main(String[] args){
        Double numero;

        Scanner in = new Scanner(System.in);

        System.out.printf("Informe um numero :");
        numero = in.nextDouble();

        if(numero==0){
            System.out.printf("Este numero é igual a 0.");
        }else if(numero>0){
            System.out.printf("Este numero é maior que 0 , ou seja , é um numero positivo.");
        }else{
            System.out.printf("Este numero é menor que 0 , ou seja , é um numero negativo.");
        }
    }
}