import java.util.Scanner;

public class Maior{

    public static void main(String[] args){
        int num = 0;
        int a = 0;
        int b = 0;
        int c = 0;

        Scanner in = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.printf("Informe o %dº numero:",i);
            num = in.nextInt();
            if(a > b && a > c){
                System.out.printf("O maior numero informado é : "+a);
                num = in.nextInt();
            }else if(b > a && b > c){
                System.out.printf("O maior numero informado é : "+b);
                num = in.nextInt();
            }else {
                System.out.printf("O maior numero informado é : "+c);
                num = in.nextInt();
            }
    }
}
}