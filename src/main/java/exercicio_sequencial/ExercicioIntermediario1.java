package exercicio_sequencial;

import java.util.Scanner;

public class ExercicioIntermediario1 {

    /*
        Leia três notas de um aluno e a frequência (%). Aprovado se média >= 6 e frequência >= 75%.
            Caso contrário, reprovado. Use operadores lógicos (&&) dentro do IF.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        System.out.println("Digite a frequencia (%): ");
        double frequencia = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 6 && frequencia >= 75) {
            System.out.println("Você foi aprovado com a média de: " + media + " e frequência de " + frequencia + ".");
        } else {
            System.out.println("Você foi reprovado com a média de: " + media + " e frequência de " + frequencia + ".");
        }

        scanner.close();
    }

}
