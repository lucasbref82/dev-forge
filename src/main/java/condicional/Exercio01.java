package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercio01 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de minutos.");

        int minutos = scanner.nextInt();

        double valorConta = 50.0;
        if (minutos > 100) {
            valorConta = valorConta + (minutos -100) * 2;
        }
        System.out.printf("Valor da conta = R$ %.2f%n", valorConta);



    }

}
