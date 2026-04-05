package condicional;

import java.util.Scanner;

public class ValidaIdade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");

        int idade = scanner.nextInt();

        if (idade < 0) {
            System.err.println("A idade deve maior que zero.");
            scanner.close();
            return;
        }

        if (idade > 120) {
            System.err.println("A idade deve menor que cento e vinte.");
            scanner.close();
            return;
        }

        if (idade >= 18) {
            System.out.println("Usuário maior de idade.");
        } else {
            System.out.println("Usuário menor de idade.");
        }

        scanner.close();
    }
}
