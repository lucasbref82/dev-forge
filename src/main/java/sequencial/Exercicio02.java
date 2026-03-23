package sequencial;

import java.util.Scanner;

public class Exercicio02 {

    /*
    * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
      mensagem explicativa
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.printf("A soma é: %d", (numero1 + numero2));

        scanner.close();
    }

}
