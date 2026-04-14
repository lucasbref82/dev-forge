package lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tarefas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<String> tarefas = new ArrayList<>();
        while (true) {
            System.out.print("Digite a tarefa (sair para encerrar): ");
            String dadoDigitado = entrada.nextLine();
            if ("sair".equalsIgnoreCase(dadoDigitado)) {
                break;
            }
            tarefas.add(dadoDigitado);
        }
        System.out.println();
        System.out.println("--- Tarefas ---");
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.printf("%d. %s%n", (i + 1), tarefas.get(i));
        }
        System.out.printf("Total: %d tarefas", tarefas.size());
        entrada.close();
    }

}
