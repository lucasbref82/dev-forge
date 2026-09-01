package sequencial;

public class Ternario {

    public static void main(String[] args) {
        double nota1 = 70.5;
        double nota2 = 45.75;
        double nota3 = 90;
        double nota4 = 40;

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 60) {
            System.out.printf("Aluno com a nota %.2f está aprovado!%n", media);
        } else if (media < 60 && media >= 40) {
            System.out.printf("Aluno com a nota %.2f está em recuperação!%n", media);
        } else {
            System.out.printf("Aluno com a nota %.2f está reprovado!%n", media);
        }

        System.out.println("----------------- TERNÁRIO ------------------");

        String resultado = media >= 60 ? "Aprovado!" : (media < 60 && media >= 40) ? "Recuperação!" : "Reprovado!";

        System.out.println(resultado);

    }
}
