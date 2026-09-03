package exercicio.sequencial;

import java.util.Scanner;

/*
    3.2) Faça uma calculadora de IMC que, além do resultado,
    classifique a faixa (Abaixo do peso, Normal, Sobrepeso, Obesidade I/II/III)
 */
public class ExercicioAvancado2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("------------ CÁLCULADORA DE IMC ------------");

        System.out.print("Digite seu peso: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        exibeFaixaImc(imc);

        System.out.println("------------ FIM DO PROGRAMA ------------");

        scanner.close();

    }

    private static void exibeFaixaImc(double imc) {
        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso.");
        } else if (imc < 25) {
            System.out.println("Você está com o peso normal (adequado).");
        } else if (imc < 30) {
            System.out.println("Você está com sobrepeso.");
        } else if (imc < 35) {
            System.out.println("Você está com obesidade I.");
        } else if (imc <= 40) {
            System.out.println("Você está com obesidade II.");
        } else {
            System.out.println("Você está com obesidade III.");
        }
    }

}
