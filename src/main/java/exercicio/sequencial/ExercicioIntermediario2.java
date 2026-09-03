    package exercicio.sequencial;

    import java.util.Scanner;

    public class ExercicioIntermediario2 {

        /*
            2.2) Leia mês (1-12) e use SWITCH para exibir o nome do mês por extenso, com um default tratando entrada inválida.
         */

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o mês (1-12): ");
            int mes = scanner.nextInt();
            while (mes < 1 || mes > 12 ) {
                System.out.print("Digite um mês válido (1-12): ");
                mes = scanner.nextInt();
            }

            exibeMesExtenso(mes);

            scanner.close();
        }

        private static void exibeMesExtenso(int mes) {
            switch (mes) {
                case 1:
                    System.out.println("Janeiro.");
                    break;
                case 2:
                    System.out.println("Fevereiro.");
                    break;
                case 3:
                    System.out.println("Março.");
                    break;
                case 4:
                    System.out.println("Abril.");
                    break;
                case 5:
                    System.out.println("Maio.");
                    break;
                case 6:
                    System.out.println("Junho.");
                    break;
                case 7:
                    System.out.println("Julho.");
                    break;
                case 8:
                    System.out.println("Agosto.");
                    break;
                case 9:
                    System.out.println("Setembro.");
                    break;
                case 10:
                    System.out.println("Outubro.");
                    break;
                case 11:
                    System.out.println("Novembro.");
                    break;
                case 12:
                    System.out.println("Dezembro.");
                    break;
            }
        }
    }
