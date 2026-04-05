package condicional;

import java.util.Scanner;
import java.util.Set;

public class Calculadora {
    public static void main(String[] args) {
        Set<String> operacoesValidas = Set.of("+", "-", "*", "/");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        double valor1 = scanner.nextDouble();

        System.out.println("Digite o segundo numero: ");
        double valor2 = scanner.nextDouble();
        System.out.println("Digite a operação: ");

        String operacao = scanner.next();

        if (!operacoesValidas.contains(operacao)) {
            System.err.println("Operação invalida.");
            scanner.close();
            return;
        }

        if ("/".equals(operacao) && valor2 == 0) {
            System.err.println("Não é possivel dividir por zero.");
            scanner.close();
            return;
        }

        switch (operacao) {
            case "+" -> System.out.println("O valor é: " + (valor1 + valor2));
            case "-" -> System.out.println("O valor é: " + (valor1 - valor2));
            case "*" -> System.out.println("O valor é: " + (valor1 * valor2));
            case "/" -> System.out.println("O valor é: " + (valor1 / valor2));
        }

        scanner.close();
    }






}
