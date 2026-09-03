package exercicio.sequencial;

import java.util.Scanner;

public class ExercicioFacil2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        String resultado = (numero % 2 == 0) ? "O número " + numero + " é par." : "O número " + numero + " é impar.";
        System.out.println(resultado);
        scanner.close();

    }

}
