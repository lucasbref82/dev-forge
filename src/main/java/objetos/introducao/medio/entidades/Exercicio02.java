package objetos.introducao.medio.entidades;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class Exercicio02 {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Ana", "Dev", new BigDecimal(5000));
        Funcionario f2 = new Funcionario("Bob", "QA", new BigDecimal(3000));
        Funcionario f3 = new Funcionario("Ana", "Dev", new BigDecimal(5000));

        List<Funcionario> funcionarios = new ArrayList<>(List.of(f1, f2, f3));

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Antes: ").append(f1).append(", ").append(f2).append(", ").append(f3);

        Set<Funcionario> funcionariosAux = funcionarios.stream().sorted(Comparator.comparing(Funcionario::getSalario)).collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println(stringBuilder);

        System.out.println("Após remover duplicados e ordenar por salário:");
        int i = 1;
        for (Funcionario f : funcionariosAux) {
            System.out.println(i + ". " + f);
            i++;
        }
    }

}
