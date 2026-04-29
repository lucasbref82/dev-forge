package objetos.introducao.medio.entidades;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class Exercicio02 {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Ana", "Dev", new BigDecimal(5000));
        Funcionario f2 = new Funcionario("Bob", "QA", new BigDecimal(3000));
        Funcionario f3 = new Funcionario("Ana", "Dev", new BigDecimal(5000));

        Set<Funcionario> funcionarios = new HashSet<>();
        funcionarios.add(f1);
        funcionarios.add(f2);
        funcionarios.add(f3);


        int i = 0;
        for (Funcionario f : funcionarios) {
            System.out.println(i + " - " + f.getNome());
            i++;
        }
    }


}
