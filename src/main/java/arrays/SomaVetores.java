package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SomaVetores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] a = new int[4];
        int[] b = new int[4];
        int[] c = new int[4];

        System.out.println("Vetor A: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print("Posição " + i + ": ");
            a[i] = entrada.nextInt();
        }

        System.out.println();

        System.out.println("Vetor B: ");
        for (int i = 0; i < b.length; i++) {

            System.out.print("Posição " + i + ": ");
            b[i] = entrada.nextInt();
        }

        System.out.println();

        int maiorSoma = Integer.MIN_VALUE;
        int posicaoMaiorSoma = 0;

        for (int i = 0; i < c.length; i++) {
            c[i] = a[i] + b[i];
            if (c[i] > maiorSoma) {
                maiorSoma = c[i];
                posicaoMaiorSoma = i;
            }
        }

        System.out.println("Vetor A: " + Arrays.toString(a));
        System.out.println("Vetor B: " + Arrays.toString(b));
        System.out.println("Vetor C: " + Arrays.toString(c));

        System.out.println("Maior soma na posição " + posicaoMaiorSoma + " com valor " + maiorSoma);

        entrada.close();
    }
}
