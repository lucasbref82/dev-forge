package objetos.introducao.facil.entidades;

import java.math.BigDecimal;
import java.util.HashSet;

public class Exercicio01 {
    public static void main(String[] args) {

        Produto p1 = new Produto("Zé das Couves", new BigDecimal(20L));
        Produto p2 = new Produto("Zé das Couves", new BigDecimal(20L));

        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode() == p2.hashCode());
        HashSet<Produto> hashSet = new HashSet<>();
        hashSet.add(p1);
        hashSet.add(p2);
        System.out.println("Tamanho do set: " + hashSet.size());

    }
}
