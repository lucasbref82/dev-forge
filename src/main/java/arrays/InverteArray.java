package arrays;

import java.util.Scanner;

public class InverteArray {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = entrada.nextInt();
        }

        StringBuilder ordemInversa = new StringBuilder();
        for (int i = numeros.length - 1; i >= 0; i--) {
            ordemInversa.append(" ").append(numeros[i]);
        }

        System.out.println("Ordem inversa:" + ordemInversa);
        entrada.close();

    }
}
