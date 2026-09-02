    package exercicio_sequencial;

    import java.util.List;
    import java.util.Scanner;

    public class ExercicioItermediario3 {
        /*
        2.3) Leia dois números e um operador (+, -, *, /) como texto, e use SWITCH para realizar a operação correspondente, tratando divisão por zero.
        */

        private static final List<String> operadoresValidos = List.of("+", "-", "*", "/");

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o primeiro número: ");
            double numero1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double numero2 = scanner.nextDouble();

            scanner.nextLine();

            System.out.print("Digite o operador (+, -, *, /): ");
            String operador = scanner.nextLine();
    

            while (!operadoresValidos.contains(operador)) {
                System.out.print("Digite um operador válido (+, -, *, /): ");
                operador = scanner.nextLine();
            }

            while (operador.equals("/") && numero2 == 0) {
                System.out.print("Digite outro valor para o segundo número 0 irá lançar erro de divisão por zero: ");
                numero2 = scanner.nextDouble();
            }

            exibeResultado(operador, numero1, numero2);

            scanner.close();
        }


        private static void exibeResultado(String operador, double numero1, double numero2) {
            switch (operador) {
                case "+":
                    System.out.println(numero1 + numero2);
                    break;
                case "-":
                    System.out.println(numero1 - numero2);
                    break;
                case "*":
                    System.out.println(numero1 * numero2);
                    break;
                case "/":
                    System.out.println(numero1 / numero2);
                    break;
            }
        }
    }
