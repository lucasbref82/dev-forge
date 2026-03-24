package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

    /*
    Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
    de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
    */

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o 1º número: ");
        int a = scanner.nextInt();

        System.out.print("Digite o 2º número: ");
        int b = scanner.nextInt();

        System.out.print("Digite o 3º número: ");
        int c = scanner.nextInt();

        System.out.print("Digite o 4º número: ");
        int d = scanner.nextInt();

        int diferenca = a * b - c * d;

        System.out.printf("DIFERENCA = %d%n", diferenca);

        scanner.close();
    }

}
