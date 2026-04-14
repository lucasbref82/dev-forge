package arranjos;

import java.util.Scanner;

public class DadosNumeros {
    /*
    * Crie um programa que leia 6 números inteiros, armazene em um vetor e exiba:
    * O maior e o menor valor
    * A média
    * Quantos valores estão acima da média
    *
     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[6];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = entrada.nextInt();
        }

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            soma+= numeros[i];
        }

        double media = (double) soma / numeros.length;
        int acimaMedia = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > media) {
                acimaMedia++;
            }
        }

        System.out.println();

        System.out.printf("Maior: %d%n", maior);
        System.out.printf("Menor: %d%n", menor);
        System.out.printf("Média: %.1f%n", media);
        System.out.printf("Acima da média: %d%n", acimaMedia);

        entrada.close();
    }
}
