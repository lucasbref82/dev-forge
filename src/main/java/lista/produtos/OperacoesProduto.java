package lista.produtos;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class OperacoesProduto {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();
        BigDecimal totalProdutos = BigDecimal.ZERO;


        while (true) {
            System.out.print("Produto: ");
            String nome = entrada.next();
            if ("fim".equalsIgnoreCase(nome)) break;
            System.out.print("Preço: ");
            BigDecimal preco = entrada.nextBigDecimal();
            totalProdutos = totalProdutos.add(preco);
            produtos.add(new Produto(nome, preco));
        }

        System.out.println();

        BigDecimal media = totalProdutos.divide(new BigDecimal(produtos.size()), RoundingMode.HALF_EVEN);
        System.out.printf("Média: R$ %.2f%n", media);
        List<Produto> acimaMedia = produtos.stream().filter(p -> p.getPreco().compareTo(media) > 0).toList();
        StringJoiner joiner = new StringJoiner(", ");

        for (Produto p : acimaMedia) {
            joiner.add(String.format("%s R$ %.2f", p.getNome(), p.getPreco()));
        }

        System.out.println("Acima da média: " + joiner);
        System.out.println();
        produtos.stream()
                .max(Comparator.comparing(Produto::getPreco))
                .ifPresentOrElse(
                        p -> System.out.printf("Mais caro: %s (R$ %.2f)%n", p.getNome(), p.getPreco()),
                        () -> System.err.println("Produto mais caro não existe.")
                );

        produtos.stream()
                .min(Comparator.comparing(Produto::getPreco))
                .ifPresentOrElse(
                        p -> System.out.printf("Mais barato: %s (R$ %.2f)%n", p.getNome(), p.getPreco()),
                        () -> System.err.println("Produto mais barato não existe.")
                );

        System.out.printf("Total: R$ %.2f%n", produtos.stream().map(Produto::getPreco).reduce(BigDecimal.ZERO, BigDecimal::add));
        System.out.println();
        System.out.println("Lista final (removidos abaixo da média): ");
        produtos.removeIf(p -> p.getPreco().compareTo(media) < 0);
        for (int i = 0; i < produtos.size(); i++) {
            System.out.printf("%d. %s - R$ %.2f%n", (i + 1), produtos.get(i).getNome(), produtos.get(i).getPreco());
        }

        entrada.close();
    }

}
