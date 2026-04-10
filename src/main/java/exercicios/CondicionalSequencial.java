package exercicios;

import java.util.Scanner;

public class CondicionalSequencial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalDigitados = 0;
        int primo = 0;
        int perfeito = 0;
        int par = 0;
        int impar = 0;

        System.out.print("Digite um número (0 para sair): ");
        int numeroDigitado = scanner.nextInt();

        while(numeroDigitado != 0) {

            totalDigitados++;

            boolean ehPrimo = true;
            for (int i = 2; i < numeroDigitado; i++) {
                if (numeroDigitado % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
            int somaDivisores = 0;
            for (int i = 1; i < numeroDigitado; i++) {
                if (numeroDigitado % i == 0) {
                    somaDivisores += i;
                }
            }

            if (ehPrimo) {
                System.out.println("Primo: Sim");
                primo++;

            }else {
                System.out.println("Primo: Não");
            }

            if (numeroDigitado % 2 == 0) {
                System.out.println("Par: Sim");
                par++;
            } else {
                System.out.println("Par: Não");
                impar++;
            }

            if (somaDivisores == numeroDigitado) {
                System.out.println("Perfeito: Sim");
                perfeito++;
            } else {
                System.out.println("Perfeito: Não");
            }
            System.out.println();
            System.out.print("Digite um número (0 para sair): ");
            numeroDigitado = scanner.nextInt();
        }

        System.out.println();
        System.out.println("--- Resumo ---");
        System.out.println("Números digitados: " + totalDigitados);
        System.out.println("Primos: " + primo);
        System.out.println("Perfeitos: " + perfeito);
        System.out.println("Pares: " + par);
        System.out.println("Ímpar: " + impar);

        scanner.close();
    }

}
