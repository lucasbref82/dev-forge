package arranjos;

import java.util.Locale;
import java.util.Scanner;

public class DadosAlunos {

    private static final String APROVADO = "Aprovado";
    private static final String RECUPERACAO = "Recuperacão";
    private static final String REPROVADO = "Reprovado";

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantidade de alunos (2-10): ");
        int quantidadeAlunos = entrada.nextInt();

        if (quantidadeAlunos < 2 || quantidadeAlunos > 10) {
            System.err.println("A quantidade de alunos deve ser maior que dois e menor que dez.");
        }

        System.out.println();

        String[] alunos = new String[quantidadeAlunos];
        double[] medias = new double[quantidadeAlunos];
        double somaMedias = 0;

        double maiorMedia = Double.MIN_VALUE;
        double menorMedia = Double.MAX_VALUE;
        String alunoMaiorMedia = null;
        String alunoMenorMedia = null;

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Aluno " + (i + 1) + ": ");
            System.out.print("Nome: ");
            entrada.nextLine();
            alunos[i] = entrada.nextLine();
            System.out.print("Nota 1: ");
            double nota1 = entrada.nextDouble();
            System.out.print("Nota 2: ");
            double nota2 = entrada.nextDouble();
            System.out.print("Nota 3: ");
            double nota3 = entrada.nextDouble();
            medias[i] = (nota1 + nota2 + nota3) / 3;
            somaMedias += medias[i];
            if (medias[i] > maiorMedia) {
                maiorMedia = medias[i];
                alunoMaiorMedia = alunos[i];
            }
            if (medias[i] < menorMedia) {
                menorMedia = medias[i];
                alunoMenorMedia = alunos[i];
            }
            System.out.println();
        }

        double mediaGeral = somaMedias / medias.length;
        int quantidadeAprovado = 0;
        int quantidadeRecuperacao = 0;
        int quantidadeReprovado = 0;

        System.out.println("--- Resultado ---");
        for (int i = 0; i < alunos.length; i++) {
            String situacaoAluno = calculaResultadoAluno(medias[i]);
            if (situacaoAluno.equals(APROVADO)) {
                quantidadeAprovado += 1;
            } else if (situacaoAluno.equals(RECUPERACAO)) {
                quantidadeRecuperacao += 1;
            } else {
                quantidadeReprovado += 1;
            }
            System.out.printf("%s      | Média: %.2f | %s%n", alunos[i], medias[i], situacaoAluno);
        }

        System.out.println();

        System.out.printf("Maior média: %s (%.1f)%n", alunoMaiorMedia, maiorMedia);
        System.out.printf("Menor média: %s (%.1f)%n", alunoMenorMedia, menorMedia);
        System.out.printf("Média geral: %.1f%n", mediaGeral);

        System.out.println();

        System.out.printf("Aprovados: %d%n", quantidadeAprovado);
        System.out.printf("Recuperação: %d%n", quantidadeRecuperacao);
        System.out.printf("Reprovaodos: %d%n", quantidadeReprovado);

        entrada.close();
    }

    private static String calculaResultadoAluno(double media) {
        if (media >= 7) {
            return APROVADO;
        } else if (media >= 5) {
            return RECUPERACAO;
        } else {
            return REPROVADO;
        }
    }
}
