package sequencial;

public class Repeticao {

    public static void main(String[] args) {

        int numero = 0;
        // Verifica e depois executa
        while (numero <= 60) {
            System.out.println("O número é: " + numero);
            numero++;
        }

        System.out.println();
        System.out.println("--------------- SEPARADOR DE RESULTADOS ---------------");
        System.out.println();

        int numero2 = 0;
        // Executa e depois verifica
        do {
            System.out.println("O número é: " + numero2);
            numero2++;
        } while (numero2 <= 60);

    }

}
