package sequencial;

import java.util.Locale;

public class Programa1 {

    public static void main(String[] args) {

        double valor = 4.2;

        System.out.printf("Valor com vírgula: %.2f%n", valor);

        Locale.setDefault(Locale.US);

        System.out.printf("Valor com ponto: %.2f%n", valor);

        int idade = 26;
        String nome = "Lucas Brenner Ferreira";
        double salario = 9000.00;

        System.out.printf("%s tem %d anos e ganha %.2f reais %n", nome, idade, salario);


    }

}
