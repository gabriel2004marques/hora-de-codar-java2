import java.util.Scanner;

public class Poligono {

    public static void main(String[] args) {
        Double poligono;

        Scanner in = new Scanner(System.in);

        System.out.println("Escreva um numero de lados de um poligono :");
        poligono = in.nextDouble();

        if(poligono == 3) {
            System.out.println("Triangulo e o valor do seu perímetro.");
        } else if(poligono == 4) {
            System.out.println("Quadrado e o valor da sua área.");
        } else if (poligono == 5) {
            System.out.println("Pentagono e o valor da sua área.");
        }
        if(poligono < 3) {
            System.out.println("Isto não é um poligono.");
        } else if (poligono > 5) {
            System.out.println("Poligono não identificado.");
        }
    }
}