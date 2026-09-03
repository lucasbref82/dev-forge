package exercicio.sequencial;

import java.util.List;
import java.util.Scanner;

/*
Simule um caixa eletrônico simplificado: menu que repete até a opção "Sair"
Deixe disponível as opções Depositar, Sacar, Ver saldo, Sair
 */
public class ExercicioAvancado3 {

    static final List<Integer> operacoesValidas = List.of(1, 2, 3, 4);


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------- BEM VINDO AO BANCO BRENNER --------");
        System.out.println();
        double saldo = 0;

        int operacao;
        do {
            exibeMensagemOperacoes();
            operacao = scanner.nextInt();
            if (!operacoesValidas.contains(operacao)) {
                System.out.println("Operação " + operacao + " não é uma opção válida!");
            } else {
                switch (operacao) {
                    case 1:
                        System.out.println("Digite o valor do deposito: ");
                        double deposito = scanner.nextDouble();
                        if (deposito > 0) {
                            saldo += deposito;
                        } else {
                            System.out.println("O valor do deposito não pode ser menor que zero.");
                        }
                        System.out.println();
                        break;
                    case 2:
                        System.out.println("Digite o valor do saque: ");
                        double saque = scanner.nextDouble();
                        if (saque <= 0) {
                            System.out.println("O valor do saque não pode ser menor ou igual a zero.");
                        }
                        else if (saldo < saque) {
                            System.out.println("Saldo insuficiente.");
                        } else {
                            saldo -= saque;
                        }
                        System.out.println();
                        break;
                    case 3:
                        System.out.println("Seu saldo é: " + saldo);
                        System.out.println();
                        break;

                }
            }
        } while (operacao != 4);
        System.out.println();
        System.out.println("--------- OBRIGADO POR UTILIZAR O BANCO BRENNER --------");
        scanner.close();

    }

    private static void exibeMensagemOperacoes() {
        System.out.println("Digite 1 para depositar.");
        System.out.println("Digite 2 para sacar.");
        System.out.println("Digite 3 para ver o saldo.");
        System.out.println("Digite 4 para sair.");
    }
}
