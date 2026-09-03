package exercicio_sequencial;

import java.util.List;
import java.util.Scanner;

/*
    3.1) Leia ano, mês e dia. Valide se a data é válida, considerando:
    meses de 1-12, dias conforme o mês
    (28/29 fev, 30 abr/jun/set/nov, 31 os demais)
    e ano bissexto
    (divisível por 4, exceto séculos não divisíveis por 400).

 */
public class ExercicioAvancado1 {

    static final List<Integer> mesesCom31Dias =
            List.of(1, 3, 5, 7, 8, 10, 12);

    static final List<Integer> mesesCom30Dias =
            List.of(4, 6, 9, 11);

    static final int mesFevereiro = 2;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano: ");
        int ano = scanner.nextInt();

        System.out.print("Digite o mês: ");
        int mes = scanner.nextInt();

        System.out.print("Digite o dia: ");
        int dia = scanner.nextInt();

        if (ano <= 0) {
            System.out.println("Data inválida: ano deve ser maior que 0.");
            return;
        }

        if (mes < 1 || mes > 12) {
            System.out.println("Data inválida: mês " + mes + " não existe.");
            return;
        }

        if (dia < 1 || dia > 31) {
            System.out.println("Data inválida: o dia deve estar entre 1 e 31.");
            return;
        }

        boolean bissexto = (ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0));

        if (mes == mesFevereiro) {
            if (bissexto) {
                if (dia > 29) {
                    System.out.println("Data inválida: fevereiro possui no máximo 29 dias em ano bissexto.");
                    return;
                }

            } else {
                if (dia > 28) {
                    System.out.println("Data inválida: fevereiro possui no máximo 28 dias.");
                    return;
                }
            }

        } else if (mesesCom30Dias.contains(mes)) {
            if (dia > 30) {
                System.out.println("Data inválida: o mês " + mes + " possui no máximo 30 dias.");
                return;
            }
        } else if (mesesCom31Dias.contains(mes)) {
            if (dia > 31) {
                System.out.println("Data inválida: o mês " + mes + " possui no máximo 31 dias.");
                return;
            }
        }

        System.out.println("Data válida!");

        scanner.close();
    }
}