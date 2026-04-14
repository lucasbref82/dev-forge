package arranjos;

import java.util.Scanner;

public class MediaPessoas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de alturas a serem digitadas: ");
        int n = scanner.nextInt();
        double[] alturas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite a " + (i + 1) + "º altura: ");
            alturas[i] = scanner.nextDouble();
        }

        double somaAlturas = 0;
        for (int i = 0; i < alturas.length; i++) {
            somaAlturas += alturas[i];
        }

        double media = somaAlturas / alturas.length;

        System.out.printf("A média de altura é %.2f%n", media);

        scanner.close();

    }

}
