package repetitivas.para;

import java.util.Scanner;

public class Dados {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int quantidadeNumeros = 5;

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int soma = 0;

        for (int i = 1; i <= quantidadeNumeros; i++) {
            System.out.print("Digite o número " + i + ": ");
            int valor = scanner.nextInt();

            if (valor > maior) maior = valor;
            if (valor < menor) menor = valor;
            soma += valor;
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Média: " + (double) soma / quantidadeNumeros);

        scanner.close();
    }
}
