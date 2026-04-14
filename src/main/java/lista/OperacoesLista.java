package lista;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class OperacoesLista {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        lista.add("Lucas");
        lista.add("Larissa");
        lista.add("Olívia");
        lista.add("Débora");
        lista.add("Emerson");
        lista.add("Letícia");
        lista.add(2, "Cleonice");

        System.out.println(lista.size());

        lista.remove("Cleonice");

        for (String nome : lista) {
            System.out.println(nome);
        }


        System.out.println("---------------------");

        // lista.remove(0);
        // lista.removeFirst();

        lista.removeIf(n -> n.contains("o"));

        for (String nome : lista) {
            System.out.println(nome);
        }


        System.out.println("---------------------");
        System.out.println("Posição de Lucas: " + lista.indexOf("Lucas"));
        System.out.println("Posição de João: " + lista.indexOf("João"));
        System.out.println("---------------------");

        Predicate<String> predicado = pred -> pred.contains("a");

        List<String> resultadoFiltro = lista.stream().filter(predicado).toList();
        for (String nome : resultadoFiltro) {
            System.out.println(nome);
        }
        System.out.println("---------------------");

    }

}
