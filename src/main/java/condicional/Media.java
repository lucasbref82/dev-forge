package condicional;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite suas primeira nota: ");

        double nota1 = scanner.nextDouble();

        if (nota1 < 0 || nota1 > 10) {
            System.err.println("Nota inválida.");
            scanner.close();
            return;
        }

        System.out.println("Digite sua segunda nota: ");

        double nota2 = scanner.nextDouble();

        if (nota2 < 0 || nota2 > 10) {
            System.err.println("Nota inválida.");
            scanner.close();
            return;
        }

        System.out.println("Digite sua terceira nota: ");

        double nota3 = scanner.nextDouble();

        if (nota3 < 0 || nota3 > 10) {
            System.err.println("Nota inválida.");
            scanner.close();
            return;
        }

         double  media =  (nota1 + nota2 + nota3) / 3;

         if (media < 5) {
             System.out.println("Reprovado. ");
         }else if (media >= 5 && media < 7) {
             System.out.println("Em recuperação. ");
         }else {
             System.out.println("Aprovado. ");
         }

        scanner.close();
    }
}
