package repetitivas.para;

import java.util.Scanner;

public class Soma {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de repetições: ");
        int repeticoes = scanner.nextInt();

        int soma = 0;
        for (int i = 1; i <= repeticoes; i++) {
            System.out.print("Digite o " + i + "º valor da soma: ");
            int valor = scanner.nextInt();
            soma += valor;
        }
        System.out.println("A soma total é: " + soma);
    }

}
