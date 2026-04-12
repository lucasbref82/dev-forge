package arrays;

import java.util.Scanner;

public class DadosAlunos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantidade de alunos (2-10): ");
        int quantidadeAlunos = entrada.nextInt();
        System.out.println();

        String[] alunos = new String[quantidadeAlunos];
        int[] notasAluno1 = new int[3];
        int[] notasAluno2 = new int[3];
        int[] notasAluno3 = new int[3];

        double totalNotaAluno1 = 0;
        double totalNotaAluno2 = 0;
        double totalNotaAluno3 = 0;

        for (int i = 0; i < notasAluno1.length; i++) {
            if (i == 0) {
                System.out.println("Aluno 1:");
                System.out.print("Nome: ");
                entrada.next();
                alunos[i] = entrada.nextLine();
            }
            System.out.print("Nota " + (i + 1) + ": ");
            notasAluno1[i] = entrada.nextInt();
            totalNotaAluno1 += notasAluno1[i];
        }

        System.out.println("Aluno 2:");
        for (int i = 0; i < notasAluno2.length; i++) {
            if (i == 0) {
                System.out.print("Nome: ");
                alunos[i] = entrada.nextLine();
            }
            System.out.print("Nota " + (i + 1) + ": ");
            notasAluno2[i] = entrada.nextInt();
            totalNotaAluno2 += notasAluno2[i];
        }

        System.out.println("Aluno 3: ");
        for (int i = 0; i < notasAluno3.length; i++) {
            if (i == 0) {
                System.out.print("Nome: ");
                alunos[i] = entrada.nextLine();
            }
            System.out.print("Nota " + (i + 1) + ": ");
            notasAluno3[i] = entrada.nextInt();
            totalNotaAluno3 += notasAluno3[i];
        }
        double mediaAluno1 = totalNotaAluno1 / notasAluno1.length;
        String resultadoAluno1 = calculaResultadoAluno(mediaAluno1);

        double mediaAluno2 = totalNotaAluno2 / notasAluno2.length;
        String resultadoAluno2 = calculaResultadoAluno(mediaAluno1);

        double mediaAluno3 = totalNotaAluno3 / notasAluno3.length;
        String resultadoAluno3 = calculaResultadoAluno(mediaAluno3);

        System.out.println();
        System.out.println("--- Resultado ---");
        System.out.printf("Ana      | Média %.1f | %s%n", mediaAluno1, resultadoAluno1);
        System.out.printf("Bob      | Média %.1f | %s%n", mediaAluno2, resultadoAluno2);
        System.out.printf("Lia      | Média %.1f | %s%n", mediaAluno3, resultadoAluno3);

        entrada.close();
    }

    private static String calculaResultadoAluno(double media) {
        String resultado;
        if (media >= 7) {
            resultado = "Aprovado";
        } else if (media >= 5) {
            resultado = "Recuperação";
        } else {
            resultado = "Reprovado";
        }
        return resultado;
    }
}
