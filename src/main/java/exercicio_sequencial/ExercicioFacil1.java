package exercicio_sequencial;

import java.util.Scanner;

public class ExercicioFacil1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();
        if (idade >= 18) {
            System.out.println("Pessoa com " + idade + " é maior de idade.");
        } else {
            System.out.println("Pessoa com " + idade + " é menor de idade.");
        }
        scanner.close();
    }

}
