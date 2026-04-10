package repetitivas.para;

import java.util.Scanner;

public class Primo {

    public static void main(String[] args) {
        final int valorMenor = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numeroDigitado = scanner.nextInt();

        if (numeroDigitado <= valorMenor) {
            System.err.println("Número inválido. Digite um número maior que " + valorMenor + ".");
            return;
        }
        boolean ehPrimo = true;
        for (int i = 2; i < numeroDigitado; i++)    {
            if (numeroDigitado % i == 0) {
                ehPrimo = false;
                break;
            }
        }
        if (ehPrimo) {
            System.out.println(numeroDigitado + " é primo.");
        } else {
            System.out.println(numeroDigitado + " não é primo.");
        }
        scanner.close();
    }

}
