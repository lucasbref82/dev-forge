package exercicio.sequencial;

import java.util.Scanner;

/*
2.4) Use DO WHILE para pedir ao usuário um número até que ele digite um valor negativo
(o negativo encerra o loop, mas não deve ser somado). Ao final, exiba a soma de tudo que foi digitado.
 */
public class ExercicioIntermediario4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int numero;
        do {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();
            if (numero >= 0) {
                soma += numero;
            }
        } while (numero >=0);

        System.out.println("A soma total é: " + soma);

        scanner.close();
    }

}
