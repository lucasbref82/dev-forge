package repetitivas;

import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {

        final String senhaCorreta = "Java@2024";
        final int maximoTentativas = 3;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a senha: ");

        String senha = scanner.next();

        int tentativas = 1;

        while(!senha.equals(senhaCorreta) && tentativas < maximoTentativas) {
            System.out.println("Senha incorreta. Tentativas restantes: " + (maximoTentativas - tentativas));
            System.out.println();
            System.out.print("Digite a senha: ");
            senha = scanner.next();
            tentativas++;
        }
        if (senha.equals(senhaCorreta)) {
            System.out.println("Acesso liberado em " + tentativas + " tentativa(s).");
        } else {
            System.out.println("Acesso bloqueado após " + maximoTentativas + " tentativas.");
        }

        scanner.close();
    }
}
