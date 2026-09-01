package exercicio_sequencial;

import java.util.Scanner;

public class ExercicioFacil3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma nota: ");
        int nota = scanner.nextInt();
        while (nota < 0 || nota > 10) {
            System.out.println("A nota digitada deve estar entre 0 e 10");
            System.out.println("Digite uma nota: ");
            nota = scanner.nextInt();
        }
        avaliaNota(nota);

        scanner.close();
    }

    private static void avaliaNota(int nota) {
        switch (nota) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("A nota é D");
                break;
            case 5:
            case 6:
                System.out.println("A nota é C");
                break;
            case 7:
            case 8:
                System.out.println("A nota é B");
                break;
            case 9:
            case 10:
                System.out.println("A nota é A");
                break;
        }
    }


}
